package com.fyber.inneractive.sdk.web;

/* renamed from: com.fyber.inneractive.sdk.web.q */
public class C3789q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3790r f13061a;

    public C3789q(C3790r rVar) {
        this.f13061a = rVar;
    }

    public void run() {
        try {
            this.f13061a.f13064a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
