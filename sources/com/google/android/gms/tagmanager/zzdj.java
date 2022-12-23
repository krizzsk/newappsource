package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import com.appsflyer.ServerParameters;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzdj extends zzbu {
    private static final String zza = zza.MOBILE_ADWORDS_UNIQUE_ID.toString();
    private final Context zzb;

    public zzdj(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        String string = Settings.Secure.getString(this.zzb.getContentResolver(), ServerParameters.ANDROID_ID);
        if (string == null) {
            return zzfv.zzb();
        }
        return zzfv.zzc(string);
    }

    public final boolean zzb() {
        return true;
    }
}
