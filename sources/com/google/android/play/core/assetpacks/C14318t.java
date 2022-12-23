package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.appcompat.app.C0262r;

/* renamed from: com.google.android.play.core.assetpacks.t */
public final /* synthetic */ class C14318t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14334x f36050b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f36051c;

    public /* synthetic */ C14318t(C14334x xVar, Bundle bundle) {
        this.f36050b = xVar;
        this.f36051c = bundle;
    }

    public final void run() {
        C14334x xVar = this.f36050b;
        Bundle bundle = this.f36051c;
        C14276i1 i1Var = xVar.f36109g;
        i1Var.getClass();
        if (((Boolean) i1Var.mo42841c(new C14343z0((Object) i1Var, (Object) bundle))).booleanValue()) {
            C14323u0 u0Var = xVar.f36110h;
            u0Var.getClass();
            C0262r rVar = C14323u0.f36061k;
            rVar.mo974a("Run extractor loop", new Object[0]);
            if (u0Var.f36071j.compareAndSet(false, true)) {
                while (true) {
                    C14284k1 k1Var = null;
                    try {
                        k1Var = u0Var.f36070i.mo42853a();
                    } catch (zzck e) {
                        C14323u0.f36061k.mo975b("Error while getting next extraction task: %s", e.getMessage());
                        if (e.zza >= 0) {
                            ((C14341y2) u0Var.f36069h.zza()).zzi(e.zza);
                            u0Var.mo42898a(e.zza, e);
                        }
                    }
                    if (k1Var != null) {
                        try {
                            if (k1Var instanceof C14299o0) {
                                u0Var.f36063b.mo42871a((C14299o0) k1Var);
                            } else if (k1Var instanceof C14301o2) {
                                u0Var.f36064c.mo42881a((C14301o2) k1Var);
                            } else if (k1Var instanceof C14320t1) {
                                u0Var.f36065d.mo42899a((C14320t1) k1Var);
                            } else if (k1Var instanceof C14328v1) {
                                u0Var.f36066e.mo42911a((C14328v1) k1Var);
                            } else if (k1Var instanceof C14261e2) {
                                u0Var.f36067f.mo42817a((C14261e2) k1Var);
                            } else if (k1Var instanceof C14269g2) {
                                u0Var.f36068g.mo42842a((C14269g2) k1Var);
                            } else {
                                C14323u0.f36061k.mo975b("Unknown task type: %s", k1Var.getClass().getName());
                            }
                        } catch (Exception e2) {
                            C14323u0.f36061k.mo975b("Error during extraction task: %s", e2.getMessage());
                            ((C14341y2) u0Var.f36069h.zza()).zzi(k1Var.f35933a);
                            u0Var.mo42898a(k1Var.f35933a, e2);
                        }
                    } else {
                        u0Var.f36071j.set(false);
                        return;
                    }
                }
            } else {
                rVar.mo978e("runLoop already looping; return", new Object[0]);
            }
        }
    }
}
