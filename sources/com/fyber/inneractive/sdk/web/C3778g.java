package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.g */
public class C3778g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3764d f13046a;

    public C3778g(C3764d dVar) {
        this.f13046a = dVar;
    }

    public void run() {
        try {
            C3764d dVar = this.f13046a;
            if (dVar.f13003G != null) {
                IAlog.m9902a("%sunregistering orientation broadcast receiver", IAlog.m9899a((Object) dVar));
                this.f13046a.f13003G.mo15472a();
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.f13046a.f13003G = null;
    }
}
