package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
public final class C3865a extends BackendResponse {

    /* renamed from: a */
    public final BackendResponse.Status f13386a;

    /* renamed from: b */
    public final long f13387b;

    public C3865a(BackendResponse.Status status, long j) {
        if (status != null) {
            this.f13386a = status;
            this.f13387b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: a */
    public final long mo15770a() {
        return this.f13387b;
    }

    /* renamed from: b */
    public final BackendResponse.Status mo15771b() {
        return this.f13386a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.f13386a.equals(backendResponse.mo15771b()) || this.f13387b != backendResponse.mo15770a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f13387b;
        return ((this.f13386a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BackendResponse{status=");
        k.append(this.f13386a);
        k.append(", nextRequestWaitMillis=");
        return C25541a.m63884o(k, this.f13387b, "}");
    }
}
