package org.apache.thrift;

import java.io.IOException;

public class TException extends Exception {
    private static final long serialVersionUID = 1;

    public TException() {
    }

    public TException(String str) {
        super(str);
    }

    public TException(IOException iOException) {
        super(iOException);
    }
}
