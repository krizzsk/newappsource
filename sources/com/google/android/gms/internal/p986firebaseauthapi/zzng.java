package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzng */
public final class zzng extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzng zzb;
    private zzmu zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzng zzng = new zzng();
        zzb = zzng;
        zzach.zzE(zzng.class, zzng);
    }

    private zzng() {
    }

    public static zznf zzc() {
        return (zznf) zzb.zzt();
    }

    public static /* synthetic */ void zzf(zzng zzng, zzmu zzmu) {
        zzmu.getClass();
        zzng.zze = zzmu;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzmu zzb() {
        zzmu zzmu = this.zze;
        return zzmu == null ? zzmu.zzd() : zzmu;
    }

    public final zzoa zze() {
        zzoa zzb2 = zzoa.zzb(this.zzh);
        return zzb2 == null ? zzoa.UNRECOGNIZED : zzb2;
    }

    public final boolean zzi() {
        return this.zze != null;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzng();
        } else {
            if (i2 == 4) {
                return new zznf((zznd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzk() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
