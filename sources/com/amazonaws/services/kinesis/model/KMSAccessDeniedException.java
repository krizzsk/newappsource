package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class KMSAccessDeniedException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public KMSAccessDeniedException(String str) {
        super(str);
    }
}
