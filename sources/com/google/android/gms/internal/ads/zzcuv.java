package com.google.android.gms.internal.ads;

import com.appboy.Constants;
import com.google.android.gms.ads.internal.client.zzay;
import com.usebutton.sdk.internal.events.Events;

public final class zzcuv {
    private final zzfgo zza;
    private final zzdwg zzb;
    private final zzfbs zzc;

    public zzcuv(zzdwg zzdwg, zzfbs zzfbs, zzfgo zzfgo) {
        this.zza = zzfgo;
        this.zzb = zzdwg;
        this.zzc = zzfbs;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : Constants.APPBOY_PUSH_ACCENT_KEY : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgo zzfgo = this.zza;
            zzfgn zzb2 = zzfgn.zzb("ad_closed");
            zzb2.zzg(this.zzc.zzb.zzb);
            zzb2.zza("show_time", String.valueOf(j));
            zzb2.zza("ad_format", "app_open_ad");
            zzb2.zza("acr", zzb(i));
            zzfgo.zzb(zzb2);
            return;
        }
        zzdwf zza2 = this.zzb.zza();
        zza2.zze(this.zzc.zzb.zzb);
        zza2.zzb(Events.PROPERTY_ACTION, "ad_closed");
        zza2.zzb("show_time", String.valueOf(j));
        zza2.zzb("ad_format", "app_open_ad");
        zza2.zzb("acr", zzb(i));
        zza2.zzg();
    }
}
