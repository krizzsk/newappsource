package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.y0 */
public final /* synthetic */ class C14339y0 implements C14272h1 {

    /* renamed from: b */
    public final /* synthetic */ C14276i1 f36131b;

    /* renamed from: c */
    public final /* synthetic */ int f36132c;

    public /* synthetic */ C14339y0(C14276i1 i1Var, int i) {
        this.f36131b = i1Var;
        this.f36132c = i;
    }

    public final Object zza() {
        boolean z;
        C14276i1 i1Var = this.f36131b;
        int i = this.f36132c;
        C14264f1 b = i1Var.mo42840b(i);
        C14260e1 e1Var = b.f35864c;
        int i2 = e1Var.f35837d;
        if (i2 == 5 || i2 == 6 || i2 == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C14243a0 a0Var = i1Var.f35905a;
            String str = e1Var.f35834a;
            int i3 = b.f35863b;
            long j = e1Var.f35835b;
            if (a0Var.mo42788c(i3, j, str).exists()) {
                C14243a0.m35459g(a0Var.mo42788c(i3, j, str));
            }
            C14260e1 e1Var2 = b.f35864c;
            int i4 = e1Var2.f35837d;
            if (i4 != 5 && i4 != 6) {
                return null;
            }
            C14243a0 a0Var2 = i1Var.f35905a;
            String str2 = e1Var2.f35834a;
            int i5 = b.f35863b;
            long j2 = e1Var2.f35835b;
            if (!a0Var2.mo42793j(i5, j2, str2).exists()) {
                return null;
            }
            C14243a0.m35459g(a0Var2.mo42793j(i5, j2, str2));
            return null;
        }
        throw new zzck(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }
}
