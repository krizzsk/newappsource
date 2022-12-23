package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import p434dd.C16546c0;
import p434dd.C16548d0;
import p434dd.C16550e0;
import p434dd.C16552f0;

/* renamed from: com.google.android.play.core.assetpacks.q1 */
public final class C14308q1 implements C16552f0 {

    /* renamed from: b */
    public final C16552f0 f36000b;

    /* renamed from: c */
    public final C16552f0 f36001c;

    /* renamed from: d */
    public final C16552f0 f36002d;

    /* renamed from: e */
    public final C16552f0 f36003e;

    /* renamed from: f */
    public final C16552f0 f36004f;

    /* renamed from: g */
    public final C16552f0 f36005g;

    /* renamed from: h */
    public final C16552f0 f36006h;

    public C14308q1(C16552f0 f0Var, C16548d0 d0Var, C16552f0 f0Var2, C14337x2 x2Var, C16552f0 f0Var3, C16552f0 f0Var4, C16552f0 f0Var5) {
        this.f36000b = f0Var;
        this.f36001c = d0Var;
        this.f36002d = f0Var2;
        this.f36003e = x2Var;
        this.f36004f = f0Var3;
        this.f36005g = f0Var4;
        this.f36006h = f0Var5;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        File file;
        String str = (String) this.f36000b.zza();
        Object zza = this.f36001c.zza();
        Object zza2 = this.f36002d.zza();
        Context a = ((C14337x2) this.f36003e).mo42910a();
        Object zza3 = this.f36004f.zza();
        C16546c0 a2 = C16550e0.m42052a(this.f36005g);
        C14334x xVar = (C14334x) zza;
        C14335x0 x0Var = (C14335x0) zza2;
        C14253c2 c2Var = (C14253c2) zza3;
        C14245a2 a2Var = (C14245a2) this.f36006h.zza();
        if (str != null) {
            file = new File(a.getExternalFilesDir((String) null), str);
        } else {
            file = a.getExternalFilesDir((String) null);
        }
        return new C14304p1(file, xVar, a, c2Var, a2);
    }
}
