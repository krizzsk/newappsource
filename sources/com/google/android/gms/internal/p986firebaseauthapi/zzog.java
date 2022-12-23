package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzog */
public final class zzog extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzog zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzabe zzf = zzabe.zzb;

    static {
        zzog zzog = new zzog();
        zzb = zzog;
        zzach.zzE(zzog.class, zzog);
    }

    private zzog() {
    }

    public static zzof zzb() {
        return (zzof) zzb.zzt();
    }

    public static zzog zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzog) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzabe zze() {
        return this.zzf;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzog();
        } else {
            if (i2 == 4) {
                return new zzof((zzoe) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
