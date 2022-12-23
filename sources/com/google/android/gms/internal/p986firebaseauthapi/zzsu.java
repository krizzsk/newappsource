package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu */
final class zzsu implements zzxi {
    public final /* synthetic */ zzxh zza;
    public final /* synthetic */ zzwc zzb;
    public final /* synthetic */ zzza zzc;
    public final /* synthetic */ zzzq zzd;
    public final /* synthetic */ zzuh zze;

    public zzsu(zzuh zzuh, zzxh zzxh, zzwc zzwc, zzza zzza, zzzq zzzq) {
        this.zze = zzuh;
        this.zza = zzxh;
        this.zzb = zzwc;
        this.zzc = zzza;
        this.zzd = zzzq;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzyr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzuh.zzf(this.zze, this.zzb, this.zzc, (zzyt) zzb2.get(0), this.zzd, this.zza);
        }
    }
}
