package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class zzc {
    public static final zzl zza = zzb.zza;
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    public zzc(long j) {
        this(0, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzc2 = (zzc) obj;
            if (this.zzc != zzc2.zzc || !Arrays.equals(this.zzd, zzc2.zzd) || !Arrays.equals(this.zze, zzc2.zze) || !Arrays.equals(this.zzf, zzc2.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zze);
        return (Arrays.hashCode(this.zzf) + ((hashCode + (((this.zzc * 961) + Arrays.hashCode(this.zzd)) * 31)) * 31)) * 961;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    public final zzc zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zzc(0, 0, copyOf, (Uri[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0, false);
    }

    private zzc(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        zzcw.zzd(iArr.length == uriArr.length);
        this.zzb = 0;
        this.zzc = i;
        this.zze = iArr;
        this.zzd = uriArr;
        this.zzf = jArr;
        this.zzg = 0;
        this.zzh = false;
    }
}
