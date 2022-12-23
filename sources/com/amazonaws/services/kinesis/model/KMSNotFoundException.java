package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class KMSNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public KMSNotFoundException(String str) {
        super(str);
    }
}
