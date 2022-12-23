package com.tranzmate.moovit.protocol.users;

public enum MVAuthTokenType {
    AuthToken(0),
    GoogleAuthException(5),
    GooglePlayServicesUnavailable(6),
    GoogleGenericError(7),
    GoogleUserRecoverable(8);
    
    private final int value;

    private MVAuthTokenType(int i) {
        this.value = i;
    }

    public static MVAuthTokenType findByValue(int i) {
        if (i == 0) {
            return AuthToken;
        }
        if (i == 5) {
            return GoogleAuthException;
        }
        if (i == 6) {
            return GooglePlayServicesUnavailable;
        }
        if (i == 7) {
            return GoogleGenericError;
        }
        if (i != 8) {
            return null;
        }
        return GoogleUserRecoverable;
    }

    public int getValue() {
        return this.value;
    }
}
