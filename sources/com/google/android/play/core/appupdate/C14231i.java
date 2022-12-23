package com.google.android.play.core.appupdate;

import com.google.android.play.core.assetpacks.C14279j0;
import p434dd.C16550e0;
import p434dd.C16552f0;
import p584jl.C17885a;

/* renamed from: com.google.android.play.core.appupdate.i */
public final class C14231i implements C16552f0 {

    /* renamed from: b */
    public final /* synthetic */ int f35763b;

    /* renamed from: c */
    public final C16552f0 f35764c;

    public /* synthetic */ C14231i(C16552f0 f0Var, int i) {
        this.f35763b = i;
        this.f35764c = f0Var;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        switch (this.f35763b) {
            case 0:
                C14229g gVar = (C14229g) this.f35764c.zza();
                C17885a.m44409K0(gVar);
                return gVar;
            default:
                return new C14279j0(C16550e0.m42052a(this.f35764c));
        }
    }
}
