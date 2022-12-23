package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

public enum Throwables {
    ;
    
    private static final int MAX_RETRY = 1000;

    public static Throwable getRootCause(Throwable th) {
        if (th == null) {
            return th;
        }
        int i = 0;
        Throwable th2 = th;
        while (i < 1000) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                return th2;
            }
            i++;
            th2 = cause;
        }
        Log log = LogFactory.getLog((Class<?>) Throwables.class);
        StringBuilder k = C13555b.m33972k("Possible circular reference detected on ");
        k.append(th.getClass());
        k.append(": [");
        k.append(th);
        k.append("]");
        log.debug(k.toString());
        return th;
    }
}
