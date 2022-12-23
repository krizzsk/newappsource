package com.google.android.gms.internal.icing;

import sun.misc.Unsafe;

final class zzfk extends zzfm {
    public zzfk(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(Object obj, long j, byte b) {
        if (zzfn.zzb) {
            zzfn.zzD(obj, j, b);
        } else {
            zzfn.zzE(obj, j, b);
        }
    }

    public final boolean zzb(Object obj, long j) {
        if (zzfn.zzb) {
            return zzfn.zzv(obj, j);
        }
        return zzfn.zzw(obj, j);
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzfn.zzb) {
            zzfn.zzD(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzfn.zzE(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzk(obj, j));
    }

    public final void zze(Object obj, long j, float f) {
        zzl(obj, j, Float.floatToIntBits(f));
    }

    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzm(obj, j));
    }

    public final void zzg(Object obj, long j, double d) {
        zzn(obj, j, Double.doubleToLongBits(d));
    }
}
