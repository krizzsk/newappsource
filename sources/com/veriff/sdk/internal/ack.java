package com.veriff.sdk.internal;

import java.util.Objects;

public class ack extends RuntimeException {

    /* renamed from: a */
    private final int f53633a;

    /* renamed from: b */
    private final String f53634b;

    public ack(acu<?> acu) {
        super(m50689a(acu));
        this.f53633a = acu.mo54070a();
        this.f53634b = acu.mo54071b();
    }

    /* renamed from: a */
    private static String m50689a(acu<?> acu) {
        Objects.requireNonNull(acu, "response == null");
        return "HTTP " + acu.mo54070a() + " " + acu.mo54071b();
    }
}
