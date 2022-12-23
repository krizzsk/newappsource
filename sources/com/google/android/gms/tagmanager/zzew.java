package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzew extends zzbu {
    private static final String zza = zza.SDK_VERSION.toString();

    public zzew() {
        super(zza, new String[0]);
    }

    public final zzak zza(Map<String, zzak> map) {
        return zzfv.zzc(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    public final boolean zzb() {
        return true;
    }
}
