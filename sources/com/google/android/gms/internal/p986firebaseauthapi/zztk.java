package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.List;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztk */
final class zztk implements zzxi {
    public final /* synthetic */ zzxi zza;
    public final /* synthetic */ zzza zzb;
    public final /* synthetic */ zztl zzc;

    public zztk(zztl zztl, zzxi zzxi, zzza zzza) {
        this.zzc = zztl;
        this.zza = zzxi;
        this.zzb = zzza;
    }

    public final void zza(String str) {
        this.zzc.zzb.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzyr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzzq zzzq = new zzzq();
        zzzq.zze(this.zzb.zze());
        zzzq.zzb(this.zzc.zza);
        zztl zztl = this.zzc;
        zzuh.zzf(zztl.zzc, zztl.zzb, this.zzb, (zzyt) zzb2.get(0), zzzq, this.zza);
    }
}
