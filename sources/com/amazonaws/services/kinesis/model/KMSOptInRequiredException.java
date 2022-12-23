package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class KMSOptInRequiredException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public KMSOptInRequiredException(String str) {
        super(str);
    }
}
