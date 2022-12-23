package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.p0 */
public class C3721p0 {

    /* renamed from: a */
    public float f12907a;

    /* renamed from: b */
    public float f12908b;

    /* renamed from: c */
    public boolean f12909c = false;

    public C3721p0(float f, float f2) {
        this.f12907a = f;
        this.f12908b = f2;
    }

    /* renamed from: a */
    public static C3721p0 m9979a() {
        return new C3721p0(-1.0f, -1.0f);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("PointLocation{x=");
        k.append(this.f12907a);
        k.append(", y=");
        k.append(this.f12908b);
        k.append('}');
        return k.toString();
    }
}
