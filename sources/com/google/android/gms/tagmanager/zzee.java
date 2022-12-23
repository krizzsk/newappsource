package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@VisibleForTesting
final class zzee extends zzfl {
    private static final String zza = zza.REGEX.toString();
    private static final String zzb = zzb.IGNORE_CASE.toString();

    public zzee() {
        super(zza);
    }

    public final boolean zzc(String str, String str2, Map<String, zzak> map) {
        int i;
        if (true != zzfv.zzg(zzfv.zzl(map.get(zzb))).booleanValue()) {
            i = 64;
        } else {
            i = 66;
        }
        try {
            return Pattern.compile(str2, i).matcher(str).find();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }
}
