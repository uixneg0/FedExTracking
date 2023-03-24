package org.uixneg0.services;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.uixneg0.entities.OAuth;
import org.uixneg0.excel.ExcelUtils;
import org.uixneg0.repositories.OAuthRepository;
import org.uixneg0.requests.FedExRequest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class BulkTrackingService {
	private final OAuthRepository oAuthRepository;

	public BulkTrackingService(OAuthRepository oAuthRepository) {
		this.oAuthRepository = oAuthRepository;
	}

	/**
	 * Checks if a valid OAuthToken currently exists. If no valid token exists will send request to FedEx and put new OAuth token into in-memory DB.
	 * Gets a parsed list of tracking numbers from the arg file using the FedExTrackingChecker lib.
	 * Gets an Apache POI workbook based off the parsed list of tracking numbers, returns a byte array based on the workbook.
	 */
	public byte[] getResults(MultipartFile multipartFile) {
		if (!validateFile(multipartFile)) return null;
		OAuth oAuth = this.oAuthRepository.findTopByOrderByIdDesc();
		Long currentTime = System.currentTimeMillis();
		if (oAuth == null || oAuth.getExpirationTime() < currentTime) {
			String newOAuthToken = FedExRequest.getNewOAuthToken();
			oAuth = new OAuth(newOAuthToken, currentTime + 3_540_000); // FedEX OAuth token expiration time is 1hr
			this.oAuthRepository.save(oAuth);
		}

		List<Long> trackingSet;
		try {
			trackingSet = ExcelUtils.parseTrackingNumbers(multipartFile.getInputStream());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		Workbook workbook;
		try {
			workbook = ExcelUtils.buildWorkbook(trackingSet, oAuth.getToken());
		} catch (IOException | InterruptedException e) {
			throw new RuntimeException(e);
		}

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			workbook.write(outputStream);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return outputStream.toByteArray();
	}

	private boolean validateFile(MultipartFile multipartFile) {
		if (multipartFile == null) return false;
		String originalFileName = multipartFile.getOriginalFilename();
		if (originalFileName == null) return false;
		String ext = FileNameUtils.getExtension(multipartFile.getOriginalFilename());
		return ext.contains("xlsx") || ext.contains("xlsm");
	}
}
