package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzi extends zzbu {
    private static final String zza = zza.APP_ID.toString();
    private final Context zzb;

    public zzi(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        return zzfv.zzc(this.zzb.getPackageName());
    }

    public final boolean zzb() {
        return true;
    }
}
