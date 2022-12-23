package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.player.controller.C3017q;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.i */
public class C3636i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3633h f12691a;

    public C3636i(C3633h hVar) {
        this.f12691a = hVar;
    }

    public void run() {
        C3633h hVar = this.f12691a;
        if (hVar.f12686t != null) {
            boolean unused = hVar.getClass();
            C3633h hVar2 = this.f12691a;
            hVar2.getClass();
            IAlog.m9902a("%sIdle state reached!", IAlog.m9899a((Object) hVar2));
            C3017q qVar = this.f12691a.f12679m;
            if (qVar != null) {
                qVar.mo13875b(true);
            }
            this.f12691a.f12686t = null;
        }
    }
}
