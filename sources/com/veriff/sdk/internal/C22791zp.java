package com.veriff.sdk.internal;

import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.zp */
public final class C22791zp extends RuntimeException {

    /* renamed from: a */
    private IOException f57821a;

    /* renamed from: b */
    private IOException f57822b;

    public C22791zp(IOException iOException) {
        super(iOException);
        this.f57821a = iOException;
        this.f57822b = iOException;
    }

    /* renamed from: a */
    public IOException mo57532a() {
        return this.f57821a;
    }

    /* renamed from: b */
    public IOException mo57534b() {
        return this.f57822b;
    }

    /* renamed from: a */
    public void mo57533a(IOException iOException) {
        C22766za.m55835a((Throwable) this.f57821a, (Throwable) iOException);
        this.f57822b = iOException;
    }
}
