package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import java.util.Map;

public final class zzfgn {
    private final HashMap zza;
    private final zzfgt zzb = new zzfgt(zzt.zzA());

    private zzfgn() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put("new_csi", DiskLruCache.VERSION_1);
    }

    public static zzfgn zzb(String str) {
        zzfgn zzfgn = new zzfgn();
        zzfgn.zza.put(Events.PROPERTY_ACTION, str);
        return zzfgn;
    }

    public static zzfgn zzc(String str) {
        zzfgn zzfgn = new zzfgn();
        zzfgn.zza.put("request_id", str);
        return zzfgn;
    }

    public final zzfgn zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgn zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgn zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgn zzf(zzfbg zzfbg) {
        this.zza.put("aai", zzfbg.zzx);
        return this;
    }

    public final zzfgn zzg(zzfbj zzfbj) {
        if (!TextUtils.isEmpty(zzfbj.zzb)) {
            this.zza.put("gqi", zzfbj.zzb);
        }
        return this;
    }

    public final zzfgn zzh(zzfbs zzfbs, zzcev zzcev) {
        String str;
        zzfbr zzfbr = zzfbs.zzb;
        zzg(zzfbr.zzb);
        if (!zzfbr.zza.isEmpty()) {
            switch (((zzfbg) zzfbr.zza.get(0)).zzb) {
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
                    if (zzcev != null) {
                        HashMap hashMap = this.zza;
                        if (true != zzcev.zzj()) {
                            str = "0";
                        } else {
                            str = DiskLruCache.VERSION_1;
                        }
                        hashMap.put("as", str);
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfgn zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfgs zzfgs : this.zzb.zza()) {
            hashMap.put(zzfgs.zza, zzfgs.zzb);
        }
        return hashMap;
    }
}
