package p019b0;

import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import p001a0.C0008a0;
import p001a0.C0020k;
import p001a0.C0033w;
import p054d0.C4289j0;
import p066e0.C4436j0;

/* renamed from: b0.e */
public final class C1428e {

    /* renamed from: a */
    public final boolean f5275a;

    /* renamed from: b */
    public final boolean f5276b;

    /* renamed from: c */
    public final boolean f5277c;

    public C1428e(C4436j0 j0Var, C4436j0 j0Var2) {
        this.f5275a = j0Var2.mo19959e(C0008a0.class);
        this.f5276b = j0Var.mo19959e(C0033w.class);
        this.f5277c = j0Var.mo19959e(C0020k.class);
    }

    /* renamed from: a */
    public final void mo5767a(List<DeferrableSurface> list) {
        boolean z;
        if (this.f5275a || this.f5276b || this.f5277c) {
            z = true;
        } else {
            z = false;
        }
        if (z && list != null) {
            for (DeferrableSurface a : list) {
                a.mo2450a();
            }
            C4289j0.m11435b("ForceCloseDeferrableSurface");
        }
    }
}
