package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzed extends zzbu {
    private static final String zza = zza.REGEX_GROUP.toString();
    private static final String zzb = zzb.ARG0.toString();
    private static final String zzc = zzb.ARG1.toString();
    private static final String zzd = zzb.IGNORE_CASE.toString();
    private static final String zze = zzb.GROUP.toString();

    public zzed() {
        super(zza, zzb, zzc);
    }

    public final zzak zza(Map<String, zzak> map) {
        int i;
        zzak zzak = map.get(zzb);
        zzak zzak2 = map.get(zzc);
        if (zzak == null || zzak == zzfv.zzb() || zzak2 == null || zzak2 == zzfv.zzb()) {
            return zzfv.zzb();
        }
        int i2 = 1;
        if (true != zzfv.zzg(zzfv.zzl(map.get(zzd))).booleanValue()) {
            i = 64;
        } else {
            i = 66;
        }
        zzak zzak3 = map.get(zze);
        if (zzak3 != null) {
            Long zzk = zzfv.zzk(zzfv.zzl(zzak3));
            if (zzk == zzfv.zzj()) {
                return zzfv.zzb();
            }
            i2 = zzk.intValue();
            if (i2 < 0) {
                return zzfv.zzb();
            }
        }
        try {
            Matcher matcher = Pattern.compile(zzfv.zzn(zzfv.zzl(zzak2)), i).matcher(zzfv.zzn(zzfv.zzl(zzak)));
            String str = null;
            if (matcher.find() && matcher.groupCount() >= i2) {
                str = matcher.group(i2);
            }
            if (str == null) {
                return zzfv.zzb();
            }
            return zzfv.zzc(str);
        } catch (PatternSyntaxException unused) {
            return zzfv.zzb();
        }
    }

    public final boolean zzb() {
        return true;
    }
}
