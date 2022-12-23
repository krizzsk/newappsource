package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class InvalidArgumentException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public InvalidArgumentException(String str) {
        super(str);
    }
}
