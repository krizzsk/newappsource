package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class zzdwb {
    private final ConcurrentHashMap zza;
    private final zzcev zzb;
    private final zzfby zzc;
    private final String zzd;

    public zzdwb(zzdwl zzdwl, zzcev zzcev, zzfby zzfby, String str) {
        ConcurrentHashMap zzc2 = zzdwl.zzc();
        this.zza = zzc2;
        this.zzb = zzcev;
        this.zzc = zzfby;
        this.zzd = str;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            int zzd2 = zzf.zzd(zzfby);
            int i = zzd2 - 1;
            if (i != 0) {
                if (i == 1) {
                    zzc2.put("se", "query_g");
                } else if (i == 2) {
                    zzc2.put("se", "r_adinfo");
                } else if (i != 3) {
                    zzc2.put("se", "r_both");
                } else {
                    zzc2.put("se", "r_adstring");
                }
                zzc2.put("scar", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                if (zzd2 == 2) {
                    zzc2.put("rid", str);
                }
                zzd("ragent", zzfby.zzd.zzp);
                zzd("rtype", zzf.zza(zzf.zzb(zzfby.zzd)));
                return;
            }
            zzc2.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfbs zzfbs) {
        String str;
        if (zzfbs.zzb.zza.size() > 0) {
            switch (((zzfbg) zzfbs.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    ConcurrentHashMap concurrentHashMap = this.zza;
                    if (true != this.zzb.zzj()) {
                        str = "0";
                    } else {
                        str = DiskLruCache.VERSION_1;
                    }
                    concurrentHashMap.put("as", str);
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        zzd("gqi", zzfbs.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
