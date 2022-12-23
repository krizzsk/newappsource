package com.google.android.gms.internal.ads;

import com.appboy.Constants;
import com.appboy.models.InAppMessageBase;
import com.moovit.database.sqlite.SQLiteDatabase;

public final class zzgq implements zzjb {
    private final zzvw zza;
    private final long zzb = zzeg.zzv(Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES);
    private final long zzc = zzeg.zzv(Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES);
    private final long zzd = zzeg.zzv(2500);
    private final long zze = zzeg.zzv(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
    private final long zzf = zzeg.zzv(0);
    private int zzg = 13107200;
    private boolean zzh;

    public zzgq() {
        zzvw zzvw = new zzvw(true, SQLiteDatabase.OPEN_FULLMUTEX);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzvw;
    }

    private static void zzj(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        zzcw.zze(z, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final void zzb() {
        zzk(false);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final void zze(zzju[] zzjuArr, zztz zztz, zzvh[] zzvhArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzjuArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (zzvhArr[i] != null) {
                    if (zzjuArr[i].zzb() != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j, long j2, float f) {
        int zza2 = this.zza.zza();
        int i = this.zzg;
        long j3 = this.zzb;
        if (f > 1.0f) {
            j3 = Math.min(zzeg.zzs(j3, f), this.zzc);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000)) {
            if (zza2 < i) {
                z = true;
            }
            this.zzh = z;
        } else if (j2 >= this.zzc || zza2 >= i) {
            this.zzh = false;
        }
        return this.zzh;
    }

    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3;
        long zzu = zzeg.zzu(j, f);
        if (z) {
            j3 = this.zze;
        } else {
            j3 = this.zzd;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 <= 0 || zzu >= j3 || this.zza.zza() >= this.zzg) {
            return true;
        }
        return false;
    }

    public final zzvw zzi() {
        return this.zza;
    }
}
