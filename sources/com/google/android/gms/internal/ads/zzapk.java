package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

final class zzapk implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ zzapl zza;

    public zzapk(zzapl zzapl) {
        this.zza = zzapl;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzapl zzapl = this.zza;
        if (zzapl.zzc > 0 && currentTimeMillis >= zzapl.zzc) {
            zzapl.zzd = currentTimeMillis - zzapl.zzc;
        }
        this.zza.zze = false;
    }
}
