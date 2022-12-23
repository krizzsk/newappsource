package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.d */
public final class C14254d extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ Map f35818c;

    /* renamed from: d */
    public final /* synthetic */ C17573l f35819d;

    /* renamed from: e */
    public final /* synthetic */ C14310r f35820e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14254d(C14310r rVar, C17573l lVar, HashMap hashMap, C17573l lVar2) {
        super(lVar);
        this.f35820e = rVar;
        this.f35818c = hashMap;
        this.f35819d = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14310r rVar = this.f35820e;
            ((C16580t0) rVar.f36012d.f43217n).mo49354w(rVar.f36009a, C14310r.m35590i(this.f35818c), new C14290m(this.f35820e, this.f35819d));
        } catch (RemoteException e) {
            C14310r.f36007g.mo976c("syncPacks", e, new Object[0]);
            this.f35819d.mo50024a(new RuntimeException(e));
        }
    }
}
