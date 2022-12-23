package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.regex.Pattern;

public final class zzdvp implements zzdgj, zza, zzdcm, zzdbw {
    private final Context zza;
    private final zzfcn zzb;
    private final zzdwg zzc;
    private final zzfbs zzd;
    private final zzfbg zze;
    private final zzeen zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhy.zzfN)).booleanValue();

    public zzdvp(Context context, zzfcn zzfcn, zzdwg zzdwg, zzfbs zzfbs, zzfbg zzfbg, zzeen zzeen) {
        this.zza = context;
        this.zzb = zzfcn;
        this.zzc = zzdwg;
        this.zzd = zzfbs;
        this.zze = zzfbg;
        this.zzf = zzeen;
    }

    private final zzdwf zzf(String str) {
        String str2;
        zzdwf zza2 = this.zzc.zza();
        zza2.zze(this.zzd.zzb.zzb);
        zza2.zzd(this.zze);
        zza2.zzb(Events.PROPERTY_ACTION, str);
        boolean z = false;
        if (!this.zze.zzu.isEmpty()) {
            zza2.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzak) {
            if (true != zzt.zzo().zzv(this.zza)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zza2.zzb("device_connectivity", str2);
            zza2.zzb("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            zza2.zzb("offline_ad", DiskLruCache.VERSION_1);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            if (zzf.zzd(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zza2.zzb("scar", String.valueOf(z));
            if (z) {
                zzl zzl = this.zzd.zza.zza.zzd;
                zza2.zzc("ragent", zzl.zzp);
                zza2.zzc("rtype", zzf.zza(zzf.zzb(zzl)));
            }
        }
        return zza2;
    }

    private final void zzg(zzdwf zzdwf) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzeep(zzt.zzA().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdwf.zzf(), 2));
            return;
        }
        zzdwf.zzg();
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) zzay.zzc().zzb(zzbhy.zzbm);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.zza);
                    boolean z = false;
                    if (!(str == null || zzo == null)) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e) {
                            zzt.zzo().zzt(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zze.zzak) {
            zzg(zzf("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzh) {
            zzdwf zzf2 = zzf("ifts");
            zzf2.zzb("reason", "adapter");
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            if (i >= 0) {
                zzf2.zzb("arec", String.valueOf(i));
            }
            String zza2 = this.zzb.zza(str);
            if (zza2 != null) {
                zzf2.zzb("areec", zza2);
            }
            zzf2.zzg();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            zzdwf zzf2 = zzf("ifts");
            zzf2.zzb("reason", "blocked");
            zzf2.zzg();
        }
    }

    public final void zzc() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    public final void zzd() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    public final void zze(zzdle zzdle) {
        if (this.zzh) {
            zzdwf zzf2 = zzf("ifts");
            zzf2.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdle.getMessage())) {
                zzf2.zzb("msg", zzdle.getMessage());
            }
            zzf2.zzg();
        }
    }

    public final void zzl() {
        if (zzh() || this.zze.zzak) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
