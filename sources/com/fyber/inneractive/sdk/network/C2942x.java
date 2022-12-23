package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.network.x */
public class C2942x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2889b0 f10071a;

    /* renamed from: b */
    public final /* synthetic */ C2938w f10072b;

    public C2942x(C2938w wVar, C2889b0 b0Var) {
        this.f10072b = wVar;
        this.f10071a = b0Var;
    }

    public void run() {
        IAlog.m9902a("retrying network request", new Object[0]);
        this.f10072b.mo13730c(this.f10071a);
    }
}
