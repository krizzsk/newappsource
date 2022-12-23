package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzbj extends zzbu {
    private static final String zza = zza.DEVICE_NAME.toString();

    public zzbj() {
        super(zza, new String[0]);
    }

    public final zzak zza(Map<String, zzak> map) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            str2 = C13715c.m34245k(new StringBuilder(str.length() + 1 + str2.length()), str, " ", str2);
        }
        return zzfv.zzc(str2);
    }

    public final boolean zzb() {
        return true;
    }
}
