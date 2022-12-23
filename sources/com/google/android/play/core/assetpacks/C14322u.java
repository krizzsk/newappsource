package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p551hy.C17517b;

/* renamed from: com.google.android.play.core.assetpacks.u */
public final /* synthetic */ class C14322u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14334x f36058b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f36059c;

    /* renamed from: d */
    public final /* synthetic */ AssetPackState f36060d;

    public /* synthetic */ C14322u(C14334x xVar, Bundle bundle, C14263f0 f0Var) {
        this.f36058b = xVar;
        this.f36059c = bundle;
        this.f36060d = f0Var;
    }

    public final void run() {
        C14334x xVar = this.f36058b;
        Bundle bundle = this.f36059c;
        AssetPackState assetPackState = this.f36060d;
        C14276i1 i1Var = xVar.f36109g;
        i1Var.getClass();
        if (((Boolean) i1Var.mo42841c(new C17517b(4, i1Var, bundle))).booleanValue()) {
            xVar.f36117o.post(new C14330w(0, xVar, assetPackState));
            ((C14341y2) xVar.f36111i.zza()).zzf();
        }
    }
}
