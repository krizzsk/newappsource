package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.assetpacks.C14243a0;
import com.google.android.play.core.assetpacks.C14305p2;
import p434dd.C16552f0;
import p584jl.C17885a;

/* renamed from: com.google.android.play.core.appupdate.r */
public final class C14240r implements C16552f0 {

    /* renamed from: b */
    public final /* synthetic */ int f35783b;

    /* renamed from: c */
    public final C16552f0 f35784c;

    public /* synthetic */ C14240r(C16552f0 f0Var, int i) {
        this.f35783b = i;
        this.f35784c = f0Var;
    }

    public final Object zza() {
        switch (this.f35783b) {
            case 0:
                Context context = (Context) ((C14232j) this.f35784c).f35765b.f35762a;
                C17885a.m44409K0(context);
                return new C14239q(context);
            default:
                return new C14305p2((C14243a0) this.f35784c.zza());
        }
    }
}
