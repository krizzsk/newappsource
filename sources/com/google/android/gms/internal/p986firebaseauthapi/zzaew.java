package com.google.android.gms.internal.p986firebaseauthapi;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaew */
final class zzaew extends zzaey {
    public zzaew(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzaez.zzb) {
            zzaez.zzD(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzaez.zzE(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzaez.zzb) {
            zzaez.zzD(obj, j, b);
        } else {
            zzaez.zzE(obj, j, b);
        }
    }

    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzg(Object obj, long j) {
        if (zzaez.zzb) {
            return zzaez.zzt(obj, j);
        }
        return zzaez.zzu(obj, j);
    }
}
