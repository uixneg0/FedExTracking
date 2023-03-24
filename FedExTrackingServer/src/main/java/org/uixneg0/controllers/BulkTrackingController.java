package org.uixneg0.controllers;

import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.uixneg0.services.BulkTrackingService;

@Controller
public class BulkTrackingController {
	private final BulkTrackingService bulkTrackingService;

	public BulkTrackingController(BulkTrackingService bulkTrackingService) {
		this.bulkTrackingService = bulkTrackingService;
	}

	@GetMapping("/")
	public String listUploadedFiles() {
		return "upload-form";
	}

	@PostMapping("/upload")
	public ResponseEntity<byte[]> handleFileUpload(@RequestParam("file") MultipartFile file) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
		httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename("TrackingResults.xlsx").build().toString());
		return ResponseEntity.ok().headers(httpHeaders).body(this.bulkTrackingService.getResults(file));
	}
}
