package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C13924b;
import p242s1.C6391t;
import p242s1.C6396v0;

/* renamed from: com.google.android.material.bottomsheet.a */
public final class C13923a implements C6391t {

    /* renamed from: b */
    public final /* synthetic */ C13924b f34417b;

    public C13923a(C13924b bVar) {
        this.f34417b = bVar;
    }

    public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
        C13924b bVar = this.f34417b;
        BottomSheetBehavior.C13920c cVar = bVar.f34426m;
        if (cVar != null) {
            bVar.f34419f.f34369T.remove(cVar);
        }
        C13924b bVar2 = this.f34417b;
        bVar2.f34426m = new C13924b.C13926b(bVar2.f34422i, v0Var);
        C13924b bVar3 = this.f34417b;
        bVar3.f34419f.mo41052a(bVar3.f34426m);
        return v0Var;
    }
}
