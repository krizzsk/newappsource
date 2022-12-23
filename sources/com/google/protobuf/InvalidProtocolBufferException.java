package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {

    /* renamed from: b */
    public static final /* synthetic */ int f36811b = 0;
    private static final long serialVersionUID = -1616151763072450476L;
    private C14629t unfinishedMessage = null;
    private boolean wasThrownFromInputStream;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: a */
    public static InvalidProtocolBufferException m36521a() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: b */
    public static InvalidProtocolBufferException m36522b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
