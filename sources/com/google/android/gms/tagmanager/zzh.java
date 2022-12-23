package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

final class zzh extends zzbu {
    private static final String zza = zza.ADWORDS_CLICK_REFERRER.toString();
    private static final String zzb = zzb.COMPONENT.toString();
    private static final String zzc = zzb.CONVERSION_ID.toString();
    private final Context zzd;

    public zzh(Context context) {
        super(zza, zzc);
        this.zzd = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        String str;
        zzak zzak = map.get(zzc);
        if (zzak == null) {
            return zzfv.zzb();
        }
        String zzn = zzfv.zzn(zzfv.zzl(zzak));
        zzak zzak2 = map.get(zzb);
        if (zzak2 != null) {
            str = zzfv.zzn(zzfv.zzl(zzak2));
        } else {
            str = null;
        }
        Context context = this.zzd;
        Map<String, String> map2 = zzcx.zza;
        String str2 = map2.get(zzn);
        if (str2 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str2 = "";
            if (sharedPreferences != null) {
                str2 = sharedPreferences.getString(zzn, str2);
            }
            map2.put(zzn, str2);
        }
        String zza2 = zzcx.zza(str2, str);
        if (zza2 != null) {
            return zzfv.zzc(zza2);
        }
        return zzfv.zzb();
    }

    public final boolean zzb() {
        return true;
    }
}
