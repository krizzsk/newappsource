package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

final class zzcja implements zzayi {
    private final zzayi zza;
    private final long zzb;
    private final zzayi zzc;
    private long zzd;
    private Uri zze;

    public zzcja(zzayi zzayi, int i, zzayi zzayi2) {
        this.zza = zzayi;
        this.zzb = (long) i;
        this.zzc = zzayi2;
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

    public final long zzb(zzayk zzayk) throws IOException {
        zzayk zzayk2;
        long j;
        long j2;
        long j3;
        zzayk zzayk3 = zzayk;
        this.zze = zzayk3.zza;
        long j4 = zzayk3.zzc;
        long j5 = this.zzb;
        zzayk zzayk4 = null;
        if (j4 >= j5) {
            zzayk2 = null;
        } else {
            long j6 = zzayk3.zzd;
            if (j6 != -1) {
                j3 = Math.min(j6, j5 - j4);
            } else {
                j3 = j5 - j4;
            }
            zzayk2 = new zzayk(zzayk3.zza, (byte[]) null, j4, j4, j3, (String) null, 0);
        }
        long j7 = zzayk3.zzd;
        if (j7 == -1 || zzayk3.zzc + j7 > this.zzb) {
            long max = Math.max(this.zzb, zzayk3.zzc);
            long j8 = zzayk3.zzd;
            if (j8 != -1) {
                j2 = Math.min(j8, (zzayk3.zzc + j8) - this.zzb);
            } else {
                j2 = -1;
            }
            zzayk4 = new zzayk(zzayk3.zza, (byte[]) null, max, max, j2, (String) null, 0);
        }
        long j9 = 0;
        if (zzayk2 != null) {
            j = this.zza.zzb(zzayk2);
        } else {
            j = 0;
        }
        if (zzayk4 != null) {
            j9 = this.zzc.zzb(zzayk4);
        }
        this.zzd = zzayk3.zzc;
        if (j9 == -1) {
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
}
