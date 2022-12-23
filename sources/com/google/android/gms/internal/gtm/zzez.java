package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzez {
    private double zza = 60.0d;
    private long zzb;
    private final Object zzc = new Object();
    private final String zzd = "tracking";
    private final Clock zze;

    public zzez(int i, long j, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long currentTimeMillis = this.zze.currentTimeMillis();
            double d = this.zza;
            if (d < 60.0d) {
                double d2 = ((double) (currentTimeMillis - this.zzb)) / 2000.0d;
                if (d2 > 0.0d) {
                    d = Math.min(60.0d, d + d2);
                    this.zza = d;
                }
            }
            this.zzb = currentTimeMillis;
            if (d >= 1.0d) {
                this.zza = d - 4.0d;
                return true;
            }
            String str = this.zzd;
            StringBuilder sb = new StringBuilder(str.length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            zzfa.zze(sb.toString());
            return false;
        }
    }
}
