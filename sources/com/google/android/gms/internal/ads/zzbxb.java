package com.google.android.gms.internal.ads;

final class zzbxb extends zzbmd {
    public final /* synthetic */ zzbxe zza;

    public /* synthetic */ zzbxb(zzbxe zzbxe, zzbxa zzbxa) {
        this.zza = zzbxe;
    }

    public final void zze(zzblu zzblu, String str) {
        zzbxe zzbxe = this.zza;
        if (zzbxe.zzb != null) {
            zzbxe.zzb.onCustomClick(zzbxe.zzf(zzblu), str);
        }
    }
}
