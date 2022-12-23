package com.google.android.gms.internal.ads;

import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdmb implements zzbol {
    private final WeakReference zza;

    public /* synthetic */ zzdmb(zzdmg zzdmg, zzdma zzdma) {
        this.zza = new WeakReference(zzdmg);
    }

    public final void zza(Object obj, Map map) {
        zzdmg zzdmg = (zzdmg) this.zza.get();
        if (zzdmg != null && "_ac".equals((String) map.get(ServerParameters.EVENT_NAME))) {
            zzdmg.zzh.onAdClicked();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                zzdmg.zzi.zzq();
            }
        }
    }
}
