document.addEventListener("DOMContentLoaded", function () {
    $("#submit").click(function (e) {
        e.preventDefault();
        e.target.setAttribute('disabled', 'true');
        var form = $("form").get(0);
        var formData = new FormData(form);
        fetch('/upload', {
            method: "POST",
            body: formData,
        }).then(function (response) {
            e.target.removeAttribute('disabled');
            // Extract the filename from the Content-Disposition header
            var filename = '';
            var disposition = response.headers.get('Content-Disposition');
            if (disposition && disposition.indexOf('attachment') !== -1) {
                var filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/;
                var matches = filenameRegex.exec(disposition);
                if (matches != null && matches[1]) {
                    filename = matches[1].replace(/['"]/g, '');
                }
            }
            // Parse the response as a Blob object
            response.blob().then(function (blob) {
                // Create a link element to trigger the download
                var link = document.createElement('a');
                link.href = window.URL.createObjectURL(blob);
                link.download = filename; // Set the download attribute to the original filename
                // Add the link element to the document and click it
                document.body.appendChild(link);
                link.click();
            });
        }).catch(function (response) {
            e.target.removeAttribute('disabled');
        });
    });
});
