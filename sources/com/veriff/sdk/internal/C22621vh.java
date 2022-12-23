package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "", "(Ljava/lang/String;I)V", "isSessionActive", "", "isSessionDecided", "isSessionExpired", "isSessionSubmitted", "isStatusValid", "created", "started", "submitted", "preprocessed", "verification_tool_checks_dispatched", "resubmission_requested", "approved", "declined", "abandoned", "expired", "review", "completed", "unknown", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.vh */
public enum C22621vh {
    created,
    started,
    submitted,
    preprocessed,
    verification_tool_checks_dispatched,
    resubmission_requested,
    approved,
    declined,
    abandoned,
    expired,
    review,
    completed,
    unknown;

    /* renamed from: a */
    public final boolean mo56970a() {
        return C22611va.f57032a.contains(this);
    }

    /* renamed from: b */
    public final boolean mo56971b() {
        return mo56974e() && !mo56972c();
    }

    /* renamed from: c */
    public final boolean mo56972c() {
        return C22611va.f57033b.contains(this);
    }

    /* renamed from: d */
    public final boolean mo56973d() {
        return C22611va.f57034c.contains(this);
    }

    /* renamed from: e */
    public final boolean mo56974e() {
        return this != unknown;
    }
}
