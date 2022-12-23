package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p358af.C13437d;

public final class zzmw {
    public static final zzmw zza = new zzmw(new int[]{2}, 8);
    private static final zzmw zzb = new zzmw(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd = 8;

    public zzmw(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzmw) && Arrays.equals(this.zzc, ((zzmw) obj).zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        return C13437d.m33706k("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.zzc), "]");
    }

    public final boolean zza(int i) {
        return Arrays.binarySearch(this.zzc, i) >= 0;
    }
}
