package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.h */
public final class C21737h {

    /* renamed from: a */
    private final C21660g f54998a;

    /* renamed from: b */
    private C22469s f54999b;

    public C21737h(C21660g gVar) {
        if (gVar != null) {
            this.f54998a = gVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C22469s mo55333a() throws C21946l {
        if (this.f54999b == null) {
            this.f54999b = this.f54998a.mo54943b();
        }
        return this.f54999b;
    }

    public String toString() {
        try {
            return mo55333a().toString();
        } catch (C21946l unused) {
            return "";
        }
    }
}
