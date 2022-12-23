package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonServiceException;

public class ProvisionedThroughputExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1;

    public ProvisionedThroughputExceededException(String str) {
        super(str);
    }
}
