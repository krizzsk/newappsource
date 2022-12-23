package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.C0262r;
import com.android.billingclient.api.C1960p;
import java.util.concurrent.Executor;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.r2 */
public final class C14313r2 {

    /* renamed from: e */
    public static final C0262r f36018e = new C0262r("AssetPackManager");

    /* renamed from: a */
    public final C14243a0 f36019a;

    /* renamed from: b */
    public final C16546c0 f36020b;

    /* renamed from: c */
    public final C14334x f36021c;

    /* renamed from: d */
    public final C16546c0 f36022d;

    public C14313r2(C14243a0 a0Var, C16546c0 c0Var, C14334x xVar, C14287l0 l0Var, C16546c0 c0Var2) {
        new Handler(Looper.getMainLooper());
        this.f36019a = a0Var;
        this.f36020b = c0Var;
        this.f36021c = xVar;
        this.f36022d = c0Var2;
    }

    /* renamed from: a */
    public final void mo42888a(boolean z) {
        boolean z2;
        C14334x xVar = this.f36021c;
        synchronized (xVar) {
            if (xVar.f43766e != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        C14334x xVar2 = this.f36021c;
        synchronized (xVar2) {
            xVar2.f43767f = z;
            xVar2.mo49481b();
        }
        if (z && !z2) {
            ((Executor) this.f36022d.zza()).execute(new C1960p(this, 1));
        }
    }
}
