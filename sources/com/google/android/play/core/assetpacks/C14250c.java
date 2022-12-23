package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p434dd.C16541a;
import p434dd.C16580t0;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.c */
public final class C14250c extends C16541a {

    /* renamed from: c */
    public final /* synthetic */ List f35809c;

    /* renamed from: d */
    public final /* synthetic */ C17573l f35810d;

    /* renamed from: e */
    public final /* synthetic */ C14310r f35811e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14250c(C14310r rVar, C17573l lVar, List list, C17573l lVar2) {
        super(lVar);
        this.f35811e = rVar;
        this.f35809c = list;
        this.f35810d = lVar2;
    }

    /* renamed from: a */
    public final void mo42765a() {
        List<String> list = this.f35809c;
        ArrayList arrayList = new ArrayList(list.size());
        for (String putString : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", putString);
            arrayList.add(bundle);
        }
        try {
            C14310r rVar = this.f35811e;
            ((C16580t0) rVar.f36012d.f43217n).mo49352j(rVar.f36009a, arrayList, C14310r.m35588f(), new C14282k(this.f35811e, this.f35810d));
        } catch (RemoteException e) {
            C14310r.f36007g.mo976c("cancelDownloads(%s)", e, this.f35809c);
        }
    }
}
