package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import p434dd.C16541a;
import p434dd.C16570o0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.appupdate.l */
public final class C14234l extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ C17573l f35769c;

    /* renamed from: d */
    public final /* synthetic */ String f35770d;

    /* renamed from: e */
    public final /* synthetic */ C14238p f35771e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14234l(C14238p pVar, C17573l lVar, C17573l lVar2, String str) {
        super(lVar);
        this.f35771e = pVar;
        this.f35769c = lVar2;
        this.f35770d = str;
    }

    /* renamed from: a */
    public final void mo42765a() {
        try {
            C14238p pVar = this.f35771e;
            ((C16570o0) pVar.f35778a.f43217n).mo49344o(pVar.f35779b, C14238p.m35438b(), new C14236n(this.f35771e, this.f35769c));
        } catch (RemoteException e) {
            C14238p.f35776e.mo976c("completeUpdate(%s)", e, this.f35770d);
            this.f35769c.mo50024a(new RuntimeException(e));
        }
    }
}
