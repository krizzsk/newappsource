package com.veriff.sdk.internal;

public final class aag {

    /* renamed from: a */
    public static final abl f53336a = abl.m50461a(":");

    /* renamed from: b */
    public static final abl f53337b = abl.m50461a(":status");

    /* renamed from: c */
    public static final abl f53338c = abl.m50461a(":method");

    /* renamed from: d */
    public static final abl f53339d = abl.m50461a(":path");

    /* renamed from: e */
    public static final abl f53340e = abl.m50461a(":scheme");

    /* renamed from: f */
    public static final abl f53341f = abl.m50461a(":authority");

    /* renamed from: g */
    public final abl f53342g;

    /* renamed from: h */
    public final abl f53343h;

    /* renamed from: i */
    public final int f53344i;

    public aag(String str, String str2) {
        this(abl.m50461a(str), abl.m50461a(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aag)) {
            return false;
        }
        aag aag = (aag) obj;
        if (!this.f53342g.equals(aag.f53342g) || !this.f53343h.equals(aag.f53343h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f53343h.hashCode() + ((this.f53342g.hashCode() + 527) * 31);
    }

    public String toString() {
        return C22766za.m55824a("%s: %s", this.f53342g.mo53932a(), this.f53343h.mo53932a());
    }

    public aag(abl abl, String str) {
        this(abl, abl.m50461a(str));
    }

    public aag(abl abl, abl abl2) {
        this.f53342g = abl;
        this.f53343h = abl2;
        this.f53344i = abl2.mo53946h() + abl.mo53946h() + 32;
    }
}
