package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzll */
public final class zzll extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzll zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzll zzll = new zzll();
        zzb = zzll;
        zzach.zzE(zzll.class, zzll);
    }

    private zzll() {
    }

    public static zzlk zza() {
        return (zzlk) zzb.zzt();
    }

    public static zzll zzc() {
        return zzb;
    }

    public final zzabe zzd() {
        return this.zzg;
    }

    public final int zzf() {
        int i = this.zze;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzg() {
        int zzb2 = zzls.zzb(this.zzf);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzll();
        } else {
            if (i2 == 4) {
                return new zzlk((zzlj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
