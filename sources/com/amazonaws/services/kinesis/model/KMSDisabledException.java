package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class KMSDisabledException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public KMSDisabledException(String str) {
        super(str);
    }
}
