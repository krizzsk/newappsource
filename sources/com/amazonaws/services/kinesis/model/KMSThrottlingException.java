package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class KMSThrottlingException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public KMSThrottlingException(String str) {
        super(str);
    }
}
