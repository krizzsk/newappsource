package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzai;
import com.google.android.gms.internal.gtm.zzfz;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzej implements zzaj {
    private final String zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc = zzfz.zza().zzb(1, 2);
    private ScheduledFuture<?> zzd;
    private boolean zze;
    private final zzap zzf;
    private String zzg;
    private zzdg<zzai> zzh;
    private final zzei zzi = new zzei(this);

    @VisibleForTesting
    public zzej(Context context, String str, zzap zzap, zzeh zzeh, zzei zzei, byte[] bArr) {
        this.zzf = zzap;
        this.zzb = context;
        this.zza = str;
    }

    private final synchronized void zzd() {
        if (this.zze) {
            throw new IllegalStateException("called method after closed");
        }
    }

    public final synchronized void release() {
        zzd();
        ScheduledFuture<?> scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc.shutdown();
        this.zze = true;
    }

    public final synchronized void zza(long j, String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 55);
        sb.append("loadAfterDelay: containerId=");
        sb.append(str2);
        sb.append(" delay=");
        sb.append(j);
        zzdh.zzb.zzd(sb.toString());
        zzd();
        if (this.zzh != null) {
            ScheduledFuture<?> scheduledFuture = this.zzd;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.zzc;
            zzei zzei = this.zzi;
            zzap zzap = this.zzf;
            zzej zzej = zzei.zza;
            zzeg zzeg = new zzeg(zzej.zzb, zzej.zza, zzap);
            zzeg.zzb(this.zzh);
            zzeg.zza(this.zzg);
            zzeg.zzc(str);
            this.zzd = scheduledExecutorService.schedule(zzeg, j, TimeUnit.MILLISECONDS);
        } else {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
    }

    public final synchronized void zzb(String str) {
        zzd();
        this.zzg = str;
    }

    public final synchronized void zzc(zzdg<zzai> zzdg) {
        zzd();
        this.zzh = zzdg;
    }
}
