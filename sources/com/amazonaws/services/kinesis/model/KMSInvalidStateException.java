package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class KMSInvalidStateException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public KMSInvalidStateException(String str) {
        super(str);
    }
}
