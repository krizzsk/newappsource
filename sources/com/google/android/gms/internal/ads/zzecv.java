package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.regex.Pattern;

public final class zzecv implements zzdgj, zza, zzdcm, zzdbw {
    private final Context zza;
    private final zzfcn zzb;
    private final zzfbs zzc;
    private final zzfbg zzd;
    private final zzeen zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzay.zzc().zzb(zzbhy.zzfN)).booleanValue();
    private final zzfgo zzh;
    private final String zzi;

    public zzecv(Context context, zzfcn zzfcn, zzfbs zzfbs, zzfbg zzfbg, zzeen zzeen, zzfgo zzfgo, String str) {
        this.zza = context;
        this.zzb = zzfcn;
        this.zzc = zzfbs;
        this.zzd = zzfbg;
        this.zze = zzeen;
        this.zzh = zzfgo;
        this.zzi = str;
    }

    private final zzfgn zzf(String str) {
        String str2;
        zzfgn zzb2 = zzfgn.zzb(str);
        zzb2.zzh(this.zzc, (zzcev) null);
        zzb2.zzf(this.zzd);
        zzb2.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb2.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzak) {
            if (true != zzt.zzo().zzv(this.zza)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zzb2.zza("device_connectivity", str2);
            zzb2.zza("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzb2.zza("offline_ad", DiskLruCache.VERSION_1);
        }
        return zzb2;
    }

    private final void zzg(zzfgn zzfgn) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzeep(zzt.zzA().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgn), 2));
            return;
        }
        this.zzh.zzb(zzfgn);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zzg(zzf("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzg) {
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            String zza2 = this.zzb.zza(str);
            zzfgn zzf2 = zzf("ifts");
            zzf2.zza("reason", "adapter");
            if (i >= 0) {
                zzf2.zza("arec", String.valueOf(i));
            }
            if (zza2 != null) {
                zzf2.zza("areec", zza2);
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzb() {
        if (this.zzg) {
            zzfgo zzfgo = this.zzh;
            zzfgn zzf2 = zzf("ifts");
            zzf2.zza("reason", "blocked");
            zzfgo.zzb(zzf2);
        }
    }

    public final void zzc() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    public final void zze(zzdle zzdle) {
        if (this.zzg) {
            zzfgn zzf2 = zzf("ifts");
            zzf2.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdle.getMessage())) {
                zzf2.zza("msg", zzdle.getMessage());
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzl() {
        if (zzh() || this.zzd.zzak) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
