package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class ResourceNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public ResourceNotFoundException(String str) {
        super(str);
    }
}
