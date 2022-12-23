package org.apache.thrift.transport;

import java.io.IOException;
import org.apache.thrift.TException;

public class TTransportException extends TException {
    private static final long serialVersionUID = 1;
    public int type_ = 4;

    public TTransportException() {
    }

    public TTransportException(String str, int i) {
        super(str);
    }

    public TTransportException(String str) {
        super(str);
    }

    public TTransportException(IOException iOException) {
        super(iOException);
    }
}
