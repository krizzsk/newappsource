package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

public final class zzki extends zzf {
    public final zzkh zza = new zzkh(this);
    public final zzkg zzb = new zzkg(this);
    public final zzke zzc = new zzke(this);
    /* access modifiers changed from: private */
    public Handler zzd;

    public zzki(zzfy zzfy) {
        super(zzfy);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzki zzki, long j) {
        zzki.zzg();
        zzki.zzm();
        zzki.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j));
        zzki.zzc.zza(j);
        if (zzki.zzs.zzf().zzu()) {
            zzki.zzb.zzb(j);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzki zzki, long j) {
        zzki.zzg();
        zzki.zzm();
        zzki.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzki.zzs.zzf().zzu() || zzki.zzs.zzm().zzl.zzb()) {
            zzki.zzb.zzc(j);
        }
        zzki.zzc.zzb();
        zzkh zzkh = zzki.zza;
        zzkh.zza.zzg();
        if (zzkh.zza.zzs.zzJ()) {
            zzkh.zzb(zzkh.zza.zzs.zzav().currentTimeMillis(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new zzby(Looper.getMainLooper());
        }
    }

    public final boolean zzf() {
        return false;
    }
}
