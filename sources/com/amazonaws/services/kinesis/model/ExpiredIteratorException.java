package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class ExpiredIteratorException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public ExpiredIteratorException(String str) {
        super(str);
    }
}
