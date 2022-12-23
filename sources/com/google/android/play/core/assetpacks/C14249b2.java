package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import p356ad.C13413b;
import p434dd.C16546c0;
import p434dd.C16550e0;
import p434dd.C16552f0;
import p584jl.C17885a;

/* renamed from: com.google.android.play.core.assetpacks.b2 */
public final class C14249b2 implements C16552f0 {

    /* renamed from: b */
    public final /* synthetic */ int f35805b;

    /* renamed from: c */
    public final C16552f0 f35806c;

    /* renamed from: d */
    public final C16552f0 f35807d;

    /* renamed from: e */
    public final C16552f0 f35808e;

    public /* synthetic */ C14249b2(C16552f0 f0Var, C16552f0 f0Var2, C16552f0 f0Var3, int i) {
        this.f35805b = i;
        this.f35806c = f0Var;
        this.f35807d = f0Var2;
        this.f35808e = f0Var3;
    }

    public final Object zza() {
        C14341y2 y2Var;
        switch (this.f35805b) {
            case 0:
                Object zza = this.f35806c.zza();
                return new C14245a2((C14243a0) zza, (C14253c2) this.f35807d.zza(), (C13413b) this.f35808e.zza());
            default:
                Context a = ((C14337x2) this.f35806c).mo42910a();
                C16546c0 a2 = C16550e0.m42052a(this.f35807d);
                C16546c0 a3 = C16550e0.m42052a(this.f35808e);
                String str = null;
                try {
                    Bundle bundle = a.getPackageManager().getApplicationInfo(a.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE).metaData;
                    if (bundle != null) {
                        str = bundle.getString("local_testing_dir");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (str == null) {
                    y2Var = (C14341y2) a2.zza();
                } else {
                    y2Var = (C14341y2) a3.zza();
                }
                C17885a.m44409K0(y2Var);
                return y2Var;
        }
    }
}
