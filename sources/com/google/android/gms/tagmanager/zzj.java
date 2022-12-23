package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzj extends zzbu {
    private static final String zza = zza.APP_NAME.toString();
    private final Context zzb;

    public zzj(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        try {
            PackageManager packageManager = this.zzb.getPackageManager();
            return zzfv.zzc(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.zzb.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e) {
            zzdh.zzb("App name is not found.", e);
            return zzfv.zzb();
        }
    }

    public final boolean zzb() {
        return true;
    }
}
