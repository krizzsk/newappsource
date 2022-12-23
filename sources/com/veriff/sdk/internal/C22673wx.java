package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21625ff;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.internal.wx */
public abstract class C22673wx<T> implements acg<T> {

    /* renamed from: a */
    private static final C24465j f57328a = C24465j.m61536a(C22673wx.class);

    /* renamed from: b */
    private final C21625ff.C21626a f57329b = C21625ff.f54627a.mo54899a(C21625ff.C21628c.REQUEST_CALLBACK);

    /* renamed from: a */
    public void mo54010a(ace<T> ace, acu<T> acu) {
        if (acu.mo54073d()) {
            C24465j jVar = f57328a;
            StringBuilder k = C13555b.m33972k("RequestCallback response: ");
            k.append(ace.mo54005c().mo57396d());
            jVar.mo60705d(k.toString());
            mo54930a_(ace, acu);
            this.f57329b.mo54900a();
            return;
        }
        C24465j jVar2 = f57328a;
        StringBuilder k2 = C13555b.m33972k("Response unsuccessful");
        k2.append(acu.toString());
        jVar2.mo60705d(k2.toString());
        mo54931b(ace, acu);
        this.f57329b.mo54900a();
    }

    /* renamed from: a */
    public abstract void mo54929a(ace<T> ace, Throwable th);

    /* renamed from: a_ */
    public abstract void mo54930a_(ace<T> ace, acu<T> acu);

    /* renamed from: a_ */
    public void mo54011a_(ace<T> ace, Throwable th) {
        mo54929a(ace, th);
        this.f57329b.mo54900a();
    }

    /* renamed from: b */
    public abstract void mo54931b(ace<T> ace, acu<T> acu);
}
