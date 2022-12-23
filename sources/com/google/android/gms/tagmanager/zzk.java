package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzk extends zzbu {
    private static final String zza = zza.APP_VERSION.toString();
    private final Context zzb;

    public zzk(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    public final zzak zza(Map<String, zzak> map) {
        try {
            return zzfv.zzc(Integer.valueOf(this.zzb.getPackageManager().getPackageInfo(this.zzb.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.zzb.getPackageName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 25 + String.valueOf(message).length());
            sb.append("Package name ");
            sb.append(packageName);
            sb.append(" not found. ");
            sb.append(message);
            zzdh.zza(sb.toString());
            return zzfv.zzb();
        }
    }

    public final boolean zzb() {
        return true;
    }
}
