package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;
import p358af.C13437d;

@TargetApi(21)
public final class zzasf {
    public static final zzasf zza = new zzasf(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc = 2;

    public zzasf(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzasf) && Arrays.equals(this.zzb, ((zzasf) obj).zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        return C13437d.m33706k("AudioCapabilities[maxChannelCount=2, supportedEncodings=", Arrays.toString(this.zzb), "]");
    }
}
