package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

public final class zzft extends zzbs {
    public String zza;
    public String zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public boolean zzf;

    public zzft(zzbv zzbv) {
        super(zzbv);
    }

    public final String zza() {
        zzW();
        return this.zzb;
    }

    public final String zzb() {
        zzW();
        return this.zza;
    }

    public final boolean zzc() {
        zzW();
        return this.zzf;
    }

    public final void zzd() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context zzo = zzo();
        try {
            applicationInfo = zzo.getPackageManager().getApplicationInfo(zzo.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
        } catch (PackageManager.NameNotFoundException e) {
            zzS("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzR("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            zzbv zzt = zzt();
            zzew zzew = (zzew) new zzcs(zzt, new zzev(zzt)).zza(i);
            if (zzew != null) {
                zzO("Loading global XML config values");
                String str = zzew.zza;
                if (str != null) {
                    this.zzb = str;
                    zzG("XML config - app name", str);
                }
                String str2 = zzew.zzb;
                if (str2 != null) {
                    this.zza = str2;
                    zzG("XML config - app version", str2);
                }
                String str3 = zzew.zzc;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if ("verbose".equals(lowerCase)) {
                        i2 = 0;
                    } else if ("info".equals(lowerCase)) {
                        i2 = 1;
                    } else if ("warning".equals(lowerCase)) {
                        i2 = 2;
                    } else if ("error".equals(lowerCase)) {
                        i2 = 3;
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        zzP("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = zzew.zzd;
                if (i3 >= 0) {
                    this.zzd = i3;
                    this.zzc = true;
                    zzG("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = zzew.zze;
                if (i4 != -1) {
                    if (1 == i4) {
                        z = true;
                    }
                    this.zzf = z;
                    this.zze = true;
                    zzG("XML config - dry run", Boolean.valueOf(z));
                }
            }
        }
    }

    public final boolean zze() {
        zzW();
        return this.zze;
    }

    public final boolean zzf() {
        zzW();
        return false;
    }
}
