package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoz;
import p358af.C13437d;

final class zzkh {
    public final /* synthetic */ zzki zza;

    public zzkh(zzki zzki) {
        this.zza = zzki;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzav().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                C13437d.m33710p(this.zza.zzs, "Detected application was in foreground");
                zzc(this.zza.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j, boolean z) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j)) {
            this.zza.zzs.zzm().zzg.zza(true);
            zzoz.zzc();
            if (this.zza.zzs.zzf().zzs((String) null, zzeb.zzas)) {
                this.zza.zzs.zzh().zzo();
            }
        }
        this.zza.zzs.zzm().zzj.zzb(j);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j, z);
        }
    }

    @VisibleForTesting
    public final void zzc(long j, boolean z) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j);
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzav().elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.zza.zzs.zzq().zzY("auto", "_sid", valueOf, j);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzs.zzf().zzs((String) null, zzeb.zzZ) && z) {
                bundle.putLong("_aib", 1);
            }
            this.zza.zzs.zzq().zzH("auto", "_s", j, bundle);
            zznv.zzc();
            if (this.zza.zzs.zzf().zzs((String) null, zzeb.zzac)) {
                String zza2 = this.zza.zzs.zzm().zzo.zza();
                if (!TextUtils.isEmpty(zza2)) {
                    this.zza.zzs.zzq().zzH("auto", "_ssr", j, C25541a.m63872b("_ffr", zza2));
                }
            }
        }
    }
}
