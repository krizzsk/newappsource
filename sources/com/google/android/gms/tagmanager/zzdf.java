package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzdf implements zzec {
    private double zza = ((double) Math.min(1, 5));
    private long zzb;
    private final Object zzc = new Object();
    private final String zzd = "refreshing";
    private final Clock zze;

    public zzdf(int i, int i2, long j, long j2, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long currentTimeMillis = this.zze.currentTimeMillis();
            long j = currentTimeMillis - this.zzb;
            if (j < InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS) {
                String str = this.zzd;
                StringBuilder sb = new StringBuilder(str.length() + 34);
                sb.append("Excessive ");
                sb.append(str);
                sb.append(" detected; call ignored.");
                zzdh.zzc(sb.toString());
                return false;
            }
            double d = this.zza;
            if (d < 5.0d) {
                double d2 = ((double) j) / 900000.0d;
                if (d2 > 0.0d) {
                    d = Math.min(5.0d, d + d2);
                    this.zza = d;
                }
            }
            this.zzb = currentTimeMillis;
            if (d >= 1.0d) {
                this.zza = d - 4.0d;
                return true;
            }
            String str2 = this.zzd;
            StringBuilder sb2 = new StringBuilder(str2.length() + 34);
            sb2.append("Excessive ");
            sb2.append(str2);
            sb2.append(" detected; call ignored.");
            zzdh.zzc(sb2.toString());
            return false;
        }
    }
}
