package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import p434dd.C16541a;
import p434dd.C16570o0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.appupdate.k */
public final class C14233k extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ String f35766c;

    /* renamed from: d */
    public final /* synthetic */ C17573l f35767d;

    /* renamed from: e */
    public final /* synthetic */ C14238p f35768e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14233k(C14238p pVar, C17573l lVar, C17573l lVar2, String str) {
        super(lVar);
        this.f35768e = pVar;
        this.f35766c = str;
        this.f35767d = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14238p pVar = this.f35768e;
            ((C16570o0) pVar.f35778a.f43217n).mo49345s(pVar.f35779b, C14238p.m35437a(pVar, this.f35766c), new C14237o(this.f35768e, this.f35767d, this.f35766c));
        } catch (RemoteException e) {
            C14238p.f35776e.mo976c("requestUpdateInfo(%s)", e, this.f35766c);
            this.f35767d.mo50024a(new RuntimeException(e));
        }
    }
}
