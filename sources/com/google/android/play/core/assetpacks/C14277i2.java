package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.i2 */
public final class C14277i2 {

    /* renamed from: a */
    public final C14243a0 f35911a;

    /* renamed from: b */
    public final C16546c0 f35912b;

    /* renamed from: c */
    public final C14276i1 f35913c;

    /* renamed from: d */
    public final C16546c0 f35914d;

    /* renamed from: e */
    public final C14335x0 f35915e;

    public C14277i2(C14243a0 a0Var, C16546c0 c0Var, C14276i1 i1Var, C16546c0 c0Var2, C14335x0 x0Var) {
        this.f35911a = a0Var;
        this.f35912b = c0Var;
        this.f35913c = i1Var;
        this.f35914d = c0Var2;
        this.f35915e = x0Var;
    }

    /* renamed from: a */
    public final void mo42842a(C14269g2 g2Var) {
        File j = this.f35911a.mo42793j(g2Var.f35879c, g2Var.f35881e, g2Var.f35934b);
        if (j.exists()) {
            File j2 = this.f35911a.mo42793j(g2Var.f35880d, g2Var.f35881e, g2Var.f35934b);
            j2.mkdirs();
            if (j.renameTo(j2)) {
                ((Executor) this.f35914d.zza()).execute(new C14273h2(0, this, g2Var));
                C14276i1 i1Var = this.f35913c;
                String str = g2Var.f35934b;
                int i = g2Var.f35880d;
                long j3 = g2Var.f35881e;
                i1Var.getClass();
                i1Var.mo42841c(new C14244a1(i1Var, str, i, j3));
                this.f35915e.mo42908a(g2Var.f35934b);
                ((C14341y2) this.f35912b.zza()).mo42872a(g2Var.f35933a, g2Var.f35934b);
                return;
            }
            throw new zzck(String.format("Cannot promote pack %s from %s to %s", new Object[]{g2Var.f35934b, j.getAbsolutePath(), j2.getAbsolutePath()}), g2Var.f35933a);
        }
        throw new zzck(String.format("Cannot find pack files to promote for pack %s at %s", new Object[]{g2Var.f35934b, j.getAbsolutePath()}), g2Var.f35933a);
    }
}
