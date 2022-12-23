package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import java.util.concurrent.atomic.AtomicBoolean;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.u0 */
public final class C14323u0 {

    /* renamed from: k */
    public static final C0262r f36061k = new C0262r("ExtractorLooper");

    /* renamed from: a */
    public final C14276i1 f36062a;

    /* renamed from: b */
    public final C14303p0 f36063b;

    /* renamed from: c */
    public final C14305p2 f36064c;

    /* renamed from: d */
    public final C14324u1 f36065d;

    /* renamed from: e */
    public final C14340y1 f36066e;

    /* renamed from: f */
    public final C14265f2 f36067f;

    /* renamed from: g */
    public final C14277i2 f36068g;

    /* renamed from: h */
    public final C16546c0 f36069h;

    /* renamed from: i */
    public final C14288l1 f36070i;

    /* renamed from: j */
    public final AtomicBoolean f36071j = new AtomicBoolean(false);

    public C14323u0(C14276i1 i1Var, C16546c0 c0Var, C14303p0 p0Var, C14305p2 p2Var, C14324u1 u1Var, C14340y1 y1Var, C14265f2 f2Var, C14277i2 i2Var, C14288l1 l1Var) {
        this.f36062a = i1Var;
        this.f36069h = c0Var;
        this.f36063b = p0Var;
        this.f36064c = p2Var;
        this.f36065d = u1Var;
        this.f36066e = y1Var;
        this.f36067f = f2Var;
        this.f36068g = i2Var;
        this.f36070i = l1Var;
    }

    /* renamed from: a */
    public final void mo42898a(int i, Exception exc) {
        C14276i1 i1Var;
        try {
            i1Var = this.f36062a;
            i1Var.getClass();
            i1Var.f35910f.lock();
            i1Var.mo42840b(i).f35864c.f35837d = 5;
            i1Var.f35910f.unlock();
            C14276i1 i1Var2 = this.f36062a;
            i1Var2.getClass();
            i1Var2.mo42841c(new C14339y0(i1Var2, i));
        } catch (zzck unused) {
            f36061k.mo975b("Error during error handling: %s", exc.getMessage());
        } catch (Throwable th) {
            i1Var.f35910f.unlock();
            throw th;
        }
    }
}
