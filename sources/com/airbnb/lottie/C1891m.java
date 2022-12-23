package com.airbnb.lottie;

import com.airbnb.lottie.C1876l;

/* renamed from: com.airbnb.lottie.m */
public final class C1891m implements C1876l.C1890n {

    /* renamed from: a */
    public final /* synthetic */ int f6525a;

    /* renamed from: b */
    public final /* synthetic */ int f6526b;

    /* renamed from: c */
    public final /* synthetic */ C1876l f6527c;

    public C1891m(C1876l lVar, int i, int i2) {
        this.f6527c = lVar;
        this.f6525a = i;
        this.f6526b = i2;
    }

    public final void run() {
        C1876l lVar = this.f6527c;
        int i = this.f6525a;
        int i2 = this.f6526b;
        if (lVar.f6482c == null) {
            lVar.f6488i.add(new C1891m(lVar, i, i2));
        } else {
            lVar.f6483d.mo20809l((float) i, ((float) i2) + 0.99f);
        }
    }
}
