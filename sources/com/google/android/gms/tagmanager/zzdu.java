package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzdu implements zzfi {
    public final /* synthetic */ zzdw zza;

    public zzdu(zzdw zzdw) {
        this.zza = zzdw;
    }

    public final void zza(zzca zzca) {
        long zza2 = zzca.zza();
        if (zza2 == 0) {
            zzdw.zzi(this.zza, zzca.zzb(), this.zza.zzg.currentTimeMillis());
        } else if (zza2 + 14400000 < this.zza.zzg.currentTimeMillis()) {
            this.zza.zzl(zzca.zzb());
            long zzb = zzca.zzb();
            StringBuilder sb = new StringBuilder(47);
            sb.append("Giving up on failed hitId: ");
            sb.append(zzb);
            zzdh.zzb.zzd(sb.toString());
        }
    }
}
