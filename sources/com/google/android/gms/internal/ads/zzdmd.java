package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdmd implements zzbol {
    private final WeakReference zza;

    public /* synthetic */ zzdmd(zzdmg zzdmg, zzdmc zzdmc) {
        this.zza = new WeakReference(zzdmg);
    }

    public final void zza(Object obj, Map map) {
        zzdmg zzdmg = (zzdmg) this.zza.get();
        if (zzdmg != null) {
            zzdmg.zzh.onAdClicked();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                zzdmg.zzi.zzq();
            }
        }
    }
}
