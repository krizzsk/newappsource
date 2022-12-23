package com.moovit.navigation;

import com.moovit.commons.request.BadResponseException;

public class BadNavigableException extends BadResponseException {
    public BadNavigableException(String str) {
        super(str);
    }

    public BadNavigableException(Exception exc) {
        super("Failed to generate progress event!", exc);
    }
}
