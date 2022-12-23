package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.y */
public class C3746y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3747z f12947a;

    public C3746y(C3747z zVar) {
        this.f12947a = zVar;
    }

    public void run() {
        this.f12947a.getClass();
        IAlog.m9902a("%sSampling timeout reached! unregistering location request listeners", "Location Manager: ");
        C3747z zVar = this.f12947a;
        zVar.mo15401a(zVar.f12953f);
        C3747z zVar2 = this.f12947a;
        zVar2.mo15401a(zVar2.f12952e);
        C3747z zVar3 = this.f12947a;
        zVar3.f12953f = null;
        zVar3.f12952e = null;
    }
}
