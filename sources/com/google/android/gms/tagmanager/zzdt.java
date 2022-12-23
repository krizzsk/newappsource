package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzdt extends zzbu {
    private static final String zza = zza.OS_VERSION.toString();

    public zzdt() {
        super(zza, new String[0]);
    }

    public final zzak zza(Map<String, zzak> map) {
        return zzfv.zzc(Build.VERSION.RELEASE);
    }

    public final boolean zzb() {
        return true;
    }
}
