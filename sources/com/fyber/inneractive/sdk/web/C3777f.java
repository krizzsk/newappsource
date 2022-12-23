package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.web.f */
public class C3777f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3764d f13045a;

    public C3777f(C3764d dVar) {
        this.f13045a = dVar;
    }

    public void run() {
        C3764d dVar = this.f13045a;
        if (dVar.f13003G == null) {
            try {
                IAlog.m9902a("%sregistering orientation broadcast receiver", IAlog.m9899a((Object) dVar));
                this.f13045a.f13003G = new C3764d.C3773i();
                if (this.f13045a.mo15460g() != null) {
                    C3764d dVar2 = this.f13045a;
                    C3764d<T>.i iVar = dVar2.f13003G;
                    Context g = dVar2.mo15460g();
                    C3764d dVar3 = C3764d.this;
                    dVar3.getClass();
                    IAlog.m9902a("%sregister screen broadcast receiver", IAlog.m9899a((Object) dVar3));
                    iVar.f13039a = g;
                    g.registerReceiver(iVar, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                C3764d dVar4 = this.f13045a;
                dVar4.getClass();
                IAlog.m9906e("%sfailed registering orientation broadcast recevier", IAlog.m9899a((Object) dVar4));
                if (IAlog.f12814a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
