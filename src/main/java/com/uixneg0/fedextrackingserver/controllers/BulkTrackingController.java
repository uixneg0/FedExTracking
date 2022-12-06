package com.uixneg0.fedextrackingserver.controllers;

import com.uixneg0.fedextrackingserver.services.BulkTrackingService;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
public class BulkTrackingController {
    private final BulkTrackingService bulkTrackingService;

    public BulkTrackingController(BulkTrackingService bulkTrackingService) {
        this.bulkTrackingService = bulkTrackingService;
    }

    @GetMapping("/")
    public String listUploadedFiles() {
        return "uploadForm";
    }

    @PostMapping("/upload")
    public ResponseEntity<byte[]> handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
        httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename("TrackingResults.xlsx").build().toString());
        return ResponseEntity.ok().headers(httpHeaders).body(this.bulkTrackingService.getResults(file));
    }
}
