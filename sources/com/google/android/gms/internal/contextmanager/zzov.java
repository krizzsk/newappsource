package com.google.android.gms.internal.contextmanager;

import sun.misc.Unsafe;

final class zzov extends zzow {
    public zzov(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzox.zzb) {
            zzox.zzD(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzox.zzE(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzox.zzb) {
            zzox.zzD(obj, j, b);
        } else {
            zzox.zzE(obj, j, b);
        }
    }

    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzg(Object obj, long j) {
        if (zzox.zzb) {
            return zzox.zzt(obj, j);
        }
        return zzox.zzu(obj, j);
    }
}
