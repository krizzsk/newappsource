package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C2700w;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.C3648e;

/* renamed from: com.fyber.inneractive.sdk.flow.j */
public abstract class C2776j<T extends C3648e> {

    /* renamed from: a */
    public InneractiveAdRequest f9590a;

    /* renamed from: b */
    public T f9591b;

    /* renamed from: c */
    public C2666s f9592c;

    /* renamed from: d */
    public final C2703z f9593d;

    /* renamed from: e */
    public boolean f9594e = false;

    /* renamed from: f */
    public boolean f9595f = false;

    public C2776j(C2703z zVar, C2666s sVar) {
        this.f9593d = zVar;
        this.f9592c = sVar;
    }

    /* renamed from: a */
    public abstract void mo13291a();

    /* renamed from: a */
    public void mo13541a(T t) {
        this.f9591b = t;
    }

    /* renamed from: b */
    public C2666s mo13542b() {
        return this.f9592c;
    }

    /* renamed from: c */
    public T mo13293c() {
        return this.f9591b;
    }

    /* renamed from: d */
    public boolean mo13299d() {
        C2700w wVar = ((C2702y) this.f9593d).f9426e;
        return false;
    }

    /* renamed from: e */
    public abstract boolean mo13294e();

    public abstract boolean isVideoAd();

    /* renamed from: a */
    public void mo13540a(InneractiveAdRequest inneractiveAdRequest) {
        this.f9590a = inneractiveAdRequest;
    }
}
