package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p001a0.C0016g;
import p001a0.C0017h;

public final class zzyk implements zzzv {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyk(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
            return;
        }
        this.zzf = 0;
    }

    public final String toString() {
        int i = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        C0017h.m61R(sb, arrays2, ", timeUs=", arrays3, ", durationsUs=");
        return C0016g.m31o(sb, arrays4, ")");
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzzt zzg(long j) {
        int zzd2 = zzeg.zzd(this.zze, j, true, true);
        zzzw zzzw = new zzzw(this.zze[zzd2], this.zzc[zzd2]);
        if (zzzw.zzb >= j || zzd2 == this.zza - 1) {
            return new zzzt(zzzw, zzzw);
        }
        int i = zzd2 + 1;
        return new zzzt(zzzw, new zzzw(this.zze[i], this.zzc[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
