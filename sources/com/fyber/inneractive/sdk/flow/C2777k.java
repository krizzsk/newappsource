package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.k */
public class C2777k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2778l f9596a;

    public C2777k(C2778l lVar) {
        this.f9596a = lVar;
    }

    public void run() {
        C2778l lVar = this.f9596a;
        lVar.getClass();
        IAlog.m9902a("%sRe-enabling clicks, grace period has passed", IAlog.m9899a((Object) lVar));
        boolean unused = this.f9596a.f9605i = true;
        this.f9596a.f9606j = null;
    }
}
