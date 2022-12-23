package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p554id.C17573l;

/* renamed from: com.google.android.play.core.assetpacks.p */
public final class C14302p extends C14278j {

    /* renamed from: d */
    public final int f35975d;

    /* renamed from: e */
    public final String f35976e;

    /* renamed from: f */
    public final int f35977f;

    /* renamed from: g */
    public final /* synthetic */ C14310r f35978g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14302p(C14310r rVar, C17573l lVar, int i, String str, int i2) {
        super(rVar, lVar);
        this.f35978g = rVar;
        this.f35975d = i;
        this.f35976e = str;
        this.f35977f = i2;
    }

    public final void zzd(Bundle bundle) {
        this.f35978g.f36012d.mo49337c(this.f35916b);
        int i = bundle.getInt("error_code");
        C14310r.f36007g.mo975b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f35977f;
        if (i2 > 0) {
            this.f35978g.mo42883h(this.f35975d, i2 - 1, this.f35976e);
        }
    }
}
