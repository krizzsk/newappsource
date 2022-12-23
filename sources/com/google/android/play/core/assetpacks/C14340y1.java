package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p356ad.C13413b;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.y1 */
public final class C14340y1 {

    /* renamed from: a */
    public final C14243a0 f36133a;

    /* renamed from: b */
    public final C16546c0 f36134b;

    /* renamed from: c */
    public final C14276i1 f36135c;

    /* renamed from: d */
    public final C16546c0 f36136d;

    /* renamed from: e */
    public final C14335x0 f36137e;

    /* renamed from: f */
    public final C13413b f36138f;

    /* renamed from: g */
    public final C14245a2 f36139g;

    public C14340y1(C14243a0 a0Var, C16546c0 c0Var, C14276i1 i1Var, C16546c0 c0Var2, C14335x0 x0Var, C13413b bVar, C14245a2 a2Var) {
        this.f36133a = a0Var;
        this.f36134b = c0Var;
        this.f36135c = i1Var;
        this.f36136d = c0Var2;
        this.f36137e = x0Var;
        this.f36138f = bVar;
        this.f36139g = a2Var;
    }

    /* renamed from: a */
    public final void mo42911a(C14328v1 v1Var) {
        C14243a0 a0Var = this.f36133a;
        String str = v1Var.f35934b;
        int i = v1Var.f36090c;
        long j = v1Var.f36091d;
        a0Var.getClass();
        File file = new File(a0Var.mo42788c(i, j, str), "_packs");
        C14243a0 a0Var2 = this.f36133a;
        String str2 = v1Var.f35934b;
        int i2 = v1Var.f36090c;
        long j2 = v1Var.f36091d;
        a0Var2.getClass();
        File file2 = new File(new File(a0Var2.mo42788c(i2, j2, str2), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new zzck(String.format("Cannot find pack files to move for pack %s.", new Object[]{v1Var.f35934b}), v1Var.f35933a);
        }
        File j3 = this.f36133a.mo42793j(v1Var.f36090c, v1Var.f36091d, v1Var.f35934b);
        j3.mkdirs();
        if (file.renameTo(j3)) {
            new File(this.f36133a.mo42793j(v1Var.f36090c, v1Var.f36091d, v1Var.f35934b), "merge.tmp").delete();
            C14243a0 a0Var3 = this.f36133a;
            String str3 = v1Var.f35934b;
            int i3 = v1Var.f36090c;
            long j4 = v1Var.f36091d;
            a0Var3.getClass();
            File file3 = new File(a0Var3.mo42793j(i3, j4, str3), "_metadata");
            file3.mkdirs();
            if (file2.renameTo(file3)) {
                if (this.f36138f.mo40276a()) {
                    try {
                        this.f36139g.mo42799b(v1Var.f36091d, v1Var.f35934b, v1Var.f36092e, v1Var.f36090c);
                        ((Executor) this.f36136d.zza()).execute(new C14336x1(this, v1Var));
                    } catch (IOException e) {
                        throw new zzck(String.format("Could not write asset pack version tag for pack %s: %s", new Object[]{v1Var.f35934b, e.getMessage()}), v1Var.f35933a);
                    }
                } else {
                    C14243a0 a0Var4 = this.f36133a;
                    a0Var4.getClass();
                    ((Executor) this.f36136d.zza()).execute(new C14332w1(a0Var4, 0));
                }
                C14276i1 i1Var = this.f36135c;
                String str4 = v1Var.f35934b;
                int i4 = v1Var.f36090c;
                long j5 = v1Var.f36091d;
                i1Var.getClass();
                i1Var.mo42841c(new C14244a1(i1Var, str4, i4, j5));
                this.f36137e.mo42908a(v1Var.f35934b);
                ((C14341y2) this.f36134b.zza()).mo42872a(v1Var.f35933a, v1Var.f35934b);
                return;
            }
            throw new zzck("Cannot move metadata files to final location.", v1Var.f35933a);
        }
        throw new zzck("Cannot move merged pack files to final location.", v1Var.f35933a);
    }
}
