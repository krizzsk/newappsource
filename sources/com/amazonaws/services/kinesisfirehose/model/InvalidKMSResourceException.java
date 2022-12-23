package com.amazonaws.services.kinesisfirehose.model;

import com.amazonaws.AmazonServiceException;

public class InvalidKMSResourceException extends AmazonServiceException {
    private static final long serialVersionUID = 1;
    private String code;

    public InvalidKMSResourceException(String str) {
        super(str);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }
}
