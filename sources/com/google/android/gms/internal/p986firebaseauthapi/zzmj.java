package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmj */
public final class zzmj extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmj zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzmj zzmj = new zzmj();
        zzb = zzmj;
        zzach.zzE(zzmj.class, zzmj);
    }

    private zzmj() {
    }

    public static zzmi zza() {
        return (zzmi) zzb.zzt();
    }

    public static zzmj zzc() {
        return zzb;
    }

    public final int zzd() {
        int i = this.zzg;
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

    public final int zze() {
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

    public final int zzf() {
        int i = this.zze;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzmj();
        } else {
            if (i2 == 4) {
                return new zzmi((zzmh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
