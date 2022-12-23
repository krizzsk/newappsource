package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.i */
public final class C14274i extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ C17573l f35896c;

    /* renamed from: d */
    public final /* synthetic */ C14310r f35897d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14274i(C14310r rVar, C17573l lVar, C17573l lVar2) {
        super(lVar);
        this.f35897d = rVar;
        this.f35896c = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14310r rVar = this.f35897d;
            ((C16580t0) rVar.f36013e.f43217n).mo49349C(rVar.f36009a, C14310r.m35588f(), new C14294n(this.f35897d, this.f35896c));
        } catch (RemoteException e) {
            C14310r.f36007g.mo976c("keepAlive", e, new Object[0]);
        }
    }
}
