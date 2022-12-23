package com.moovit.payment.masabi;

public class MasabiAccountException extends RuntimeException {
    public MasabiAccountException(Exception exc) {
        super("Failed to logged in into masabi SDK!", exc);
    }
}
