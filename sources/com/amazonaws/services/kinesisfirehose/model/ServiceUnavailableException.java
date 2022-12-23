package com.amazonaws.services.kinesisfirehose.model;

import com.amazonaws.AmazonServiceException;

public class ServiceUnavailableException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public ServiceUnavailableException(String str) {
        super(str);
    }
}
