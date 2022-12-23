package com.fyber.inneractive.sdk.mraid;

import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.mraid.u */
public class C2880u extends C2879t {

    /* renamed from: a */
    public final int f9857a;

    /* renamed from: b */
    public final int f9858b;

    /* renamed from: c */
    public final int f9859c;

    /* renamed from: d */
    public final int f9860d;

    public C2880u(int i, int i2, int i3, int i4) {
        this.f9857a = i3;
        this.f9858b = i4;
        this.f9860d = i2;
        this.f9859c = i;
    }

    /* renamed from: a */
    public String mo13660a() {
        StringBuilder k = C13555b.m33972k("currentPosition: { x: ");
        k.append(this.f9859c);
        k.append(", y: ");
        k.append(this.f9860d);
        k.append(", width: ");
        k.append(this.f9857a);
        k.append(", height: ");
        return C13437d.m33707l(k, this.f9858b, " }");
    }
}
