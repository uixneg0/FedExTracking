package com.uixneg0.fedextrackingserver.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class BulkTrackingService {
    public MultipartFile getResultFile(MultipartFile multipartFile){
        return multipartFile;
    }
}
