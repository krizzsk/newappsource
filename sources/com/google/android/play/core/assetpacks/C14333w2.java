package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import p364al.C13487h;
import p434dd.C16552f0;
import p434dd.C16587x;
import p502fx.C17118c;
import p502fx.C17119d;
import p584jl.C17885a;

/* renamed from: com.google.android.play.core.assetpacks.w2 */
public final class C14333w2 implements C16552f0 {

    /* renamed from: b */
    public final /* synthetic */ int f36106b;

    /* renamed from: c */
    public final Object f36107c;

    /* renamed from: d */
    public final Object f36108d;

    public /* synthetic */ C14333w2(int i, Object obj, Object obj2) {
        this.f36106b = i;
        this.f36107c = obj;
        this.f36108d = obj2;
    }

    public final String toString() {
        switch (this.f36106b) {
            case 3:
                StringBuilder k = C13555b.m33972k("TodPassengerActionAdditionalInfo{qrCode=");
                k.append((C17119d) this.f36107c);
                k.append(", pinCode=");
                k.append((C17118c) this.f36108d);
                k.append("}");
                return k.toString();
            default:
                return super.toString();
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        Object zza = ((C16552f0) this.f36107c).zza();
        Context a = ((C14337x2) ((C16552f0) this.f36108d)).mo42910a();
        C14313r2 r2Var = (C14313r2) zza;
        C16587x.m42104a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        C16587x.m42104a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
        C17885a.m44409K0(r2Var);
        return r2Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14333w2(C13487h hVar) {
        this(1, hVar.f33365a, hVar.f33366b);
        this.f36106b = 1;
    }
}
