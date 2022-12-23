package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

final class zzckj implements zzer {
    private final zzer zza;
    private final long zzb;
    private final zzer zzc;
    private long zzd;
    private Uri zze;

    public zzckj(zzer zzer, int i, zzer zzer2) {
        this.zza = zzer;
        this.zzb = (long) i;
        this.zzc = zzer2;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza2 = this.zza.zza(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.zzd + ((long) zza2);
            this.zzd = j3;
            i3 = zza2;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int zza3 = this.zzc.zza(bArr, i + i3, i2 - i3);
        this.zzd += (long) zza3;
        return i3 + zza3;
    }

    public final long zzb(zzew zzew) throws IOException {
        zzew zzew2;
        long j;
        long j2;
        long j3;
        zzew zzew3 = zzew;
        this.zze = zzew3.zza;
        long j4 = zzew3.zzf;
        long j5 = this.zzb;
        zzew zzew4 = null;
        if (j4 >= j5) {
            zzew2 = null;
        } else {
            long j6 = zzew3.zzg;
            if (j6 != -1) {
                j3 = Math.min(j6, j5 - j4);
            } else {
                j3 = j5 - j4;
            }
            zzew2 = new zzew(zzew3.zza, (byte[]) null, j4, j4, j3, (String) null, 0);
        }
        long j7 = zzew3.zzg;
        if (j7 == -1 || zzew3.zzf + j7 > this.zzb) {
            long max = Math.max(this.zzb, zzew3.zzf);
            long j8 = zzew3.zzg;
            if (j8 != -1) {
                j2 = Math.min(j8, (zzew3.zzf + j8) - this.zzb);
            } else {
                j2 = -1;
            }
            zzew4 = new zzew(zzew3.zza, (byte[]) null, max, max, j2, (String) null, 0);
        }
        long j9 = 0;
        if (zzew2 != null) {
            j = this.zza.zzb(zzew2);
        } else {
            j = 0;
        }
        if (zzew4 != null) {
            j9 = this.zzc.zzb(zzew4);
        }
        this.zzd = zzew3.zzf;
        if (j == -1 || j9 == -1) {
            return -1;
        }
        return j + j9;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzfrk.zzd();
    }

    public final void zzf(zzft zzft) {
    }
}
