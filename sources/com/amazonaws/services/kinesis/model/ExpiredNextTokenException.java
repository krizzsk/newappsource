package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class ExpiredNextTokenException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public ExpiredNextTokenException(String str) {
        super(str);
    }
}
