package com.google.android.datatransport.runtime.backends;

public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public abstract long mo15770a();

    /* renamed from: b */
    public abstract Status mo15771b();
}
