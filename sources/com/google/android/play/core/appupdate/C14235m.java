package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.app.C0262r;
import p434dd.C16572p0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.appupdate.m */
public class C14235m extends C16572p0 {

    /* renamed from: b */
    public final C0262r f35772b;

    /* renamed from: c */
    public final C17573l f35773c;

    /* renamed from: d */
    public final /* synthetic */ C14238p f35774d;

    public C14235m(C14238p pVar, C0262r rVar, C17573l lVar) {
        this.f35774d = pVar;
        this.f35772b = rVar;
        this.f35773c = lVar;
    }

    /* renamed from: t */
    public void mo42766t(Bundle bundle) throws RemoteException {
        this.f35774d.f35778a.mo49337c(this.f35773c);
        this.f35772b.mo977d("onRequestInfo", new Object[0]);
    }

    /* renamed from: x */
    public void mo42767x(Bundle bundle) throws RemoteException {
        this.f35774d.f35778a.mo49337c(this.f35773c);
        this.f35772b.mo977d("onCompleteUpdate", new Object[0]);
    }
}
