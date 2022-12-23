package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

final class zzfr implements Logger {
    public final void error(Exception exc) {
        zzdh.zzb("", exc);
    }

    public final int getLogLevel() {
        int i = zzdh.zza;
        if (i == 2) {
            return 0;
        }
        if (i == 3 || i == 4) {
            return 1;
        }
        return i != 5 ? 3 : 2;
    }

    public final void info(String str) {
        zzdh.zzb.zzb(str);
    }

    public final void setLogLevel(int i) {
        zzdh.zzc("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    public final void verbose(String str) {
        zzdh.zzb.zzd(str);
    }

    public final void warn(String str) {
        zzdh.zzc(str);
    }

    public final void error(String str) {
        zzdh.zza(str);
    }
}
