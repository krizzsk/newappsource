package com.google.android.material.internal;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.internal.C14083r;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;

/* renamed from: com.google.android.material.internal.q */
public final class C14082q implements C14083r.C14085b {

    /* renamed from: a */
    public final /* synthetic */ boolean f35110a;

    /* renamed from: b */
    public final /* synthetic */ boolean f35111b;

    /* renamed from: c */
    public final /* synthetic */ boolean f35112c;

    /* renamed from: d */
    public final /* synthetic */ C14083r.C14085b f35113d;

    public C14082q(boolean z, boolean z2, boolean z3, BottomAppBar.C13906c cVar) {
        this.f35110a = z;
        this.f35111b = z2;
        this.f35112c = z3;
        this.f35113d = cVar;
    }

    /* renamed from: a */
    public final C6396v0 mo41034a(View view, C6396v0 v0Var, C14083r.C14086c cVar) {
        if (this.f35110a) {
            cVar.f35119d = v0Var.mo22503b() + cVar.f35119d;
        }
        boolean d = C14083r.m35068d(view);
        if (this.f35111b) {
            if (d) {
                cVar.f35118c = v0Var.mo22504c() + cVar.f35118c;
            } else {
                cVar.f35116a = v0Var.mo22504c() + cVar.f35116a;
            }
        }
        if (this.f35112c) {
            if (d) {
                cVar.f35116a = v0Var.mo22505d() + cVar.f35116a;
            } else {
                cVar.f35118c = v0Var.mo22505d() + cVar.f35118c;
            }
        }
        int i = cVar.f35116a;
        int i2 = cVar.f35117b;
        int i3 = cVar.f35118c;
        int i4 = cVar.f35119d;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6338e.m15070k(view, i, i2, i3, i4);
        C14083r.C14085b bVar = this.f35113d;
        if (bVar != null) {
            return bVar.mo41034a(view, v0Var, cVar);
        }
        return v0Var;
    }
}
