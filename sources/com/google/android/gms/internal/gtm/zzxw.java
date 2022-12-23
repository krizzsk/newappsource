package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

final class zzxw extends zzxx {
    public zzxw(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzxy.zzb) {
            zzxy.zzD(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzxy.zzE(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzxy.zzb) {
            zzxy.zzD(obj, j, b);
        } else {
            zzxy.zzE(obj, j, b);
        }
    }

    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzg(Object obj, long j) {
        if (zzxy.zzb) {
            return zzxy.zzt(obj, j);
        }
        return zzxy.zzu(obj, j);
    }
}
