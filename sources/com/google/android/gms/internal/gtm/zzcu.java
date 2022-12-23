package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;

final class zzcu implements Logger {
    private int zza = 2;
    private boolean zzb;

    public final void error(Exception exc) {
    }

    public final void error(String str) {
    }

    public final int getLogLevel() {
        return this.zza;
    }

    public final void info(String str) {
    }

    public final void setLogLevel(int i) {
        this.zza = i;
        if (!this.zzb) {
            zzet<String> zzet = zzeu.zzc;
            String zzb2 = zzet.zzb();
            new StringBuilder(zzet.zzb().length() + 91);
            this.zzb = true;
        }
    }

    public final void verbose(String str) {
    }

    public final void warn(String str) {
    }
}
