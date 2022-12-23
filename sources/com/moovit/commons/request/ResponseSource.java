package com.moovit.commons.request;

import java.net.URLConnection;

public enum ResponseSource {
    NETWORK,
    CACHE,
    CONDITIONAL_CACHE;

    public static ResponseSource parseResponseSourceHeader(URLConnection uRLConnection) {
        int indexOf;
        String headerField = uRLConnection.getHeaderField("X-Android-Response-Source");
        if (headerField == null || (indexOf = headerField.indexOf(32)) == -1) {
            return null;
        }
        try {
            return valueOf(headerField.substring(0, indexOf));
        } catch (Exception unused) {
            return null;
        }
    }
}
