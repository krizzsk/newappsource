package com.moovit.network.request;

import com.moovit.commons.request.ServerException;

public class UnexpectedInterlocutorException extends ServerException {
    public UnexpectedInterlocutorException(String str) {
        super(str);
    }
}
