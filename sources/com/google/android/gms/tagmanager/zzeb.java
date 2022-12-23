package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

final class zzeb extends zzbu {
    private static final String zza = zza.RANDOM.toString();
    private static final String zzb = zzb.MIN.toString();
    private static final String zzc = zzb.MAX.toString();

    public zzeb() {
        super(zza, new String[0]);
    }

    public final zzak zza(Map<String, zzak> map) {
        zzak zzak = map.get(zzb);
        zzak zzak2 = map.get(zzc);
        double d = 2.147483647E9d;
        double d2 = 0.0d;
        if (!(zzak == null || zzak == zzfv.zzb() || zzak2 == null || zzak2 == zzfv.zzb())) {
            zzfu zze = zzfv.zze(zzfv.zzl(zzak));
            zzfu zze2 = zzfv.zze(zzfv.zzl(zzak2));
            if (!(zze == zzfv.zzd() || zze2 == zzfv.zzd())) {
                double doubleValue = zze.doubleValue();
                double doubleValue2 = zze2.doubleValue();
                if (doubleValue <= doubleValue2) {
                    d2 = doubleValue;
                    d = doubleValue2;
                }
            }
        }
        return zzfv.zzc(Long.valueOf(Math.round(((d - d2) * Math.random()) + d2)));
    }

    public final boolean zzb() {
        return false;
    }
}
