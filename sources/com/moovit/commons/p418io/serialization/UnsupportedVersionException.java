package com.moovit.commons.p418io.serialization;

/* renamed from: com.moovit.commons.io.serialization.UnsupportedVersionException */
public class UnsupportedVersionException extends RuntimeException {
    public UnsupportedVersionException(String str, int i) {
        super("Reading version " + i + " of type " + str + " is not supported");
    }
}
