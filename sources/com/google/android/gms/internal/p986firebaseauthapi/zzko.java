package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzko */
public final class zzko extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzko zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzabe zzf = zzabe.zzb;

    static {
        zzko zzko = new zzko();
        zzb = zzko;
        zzach.zzE(zzko.class, zzko);
    }

    private zzko() {
    }

    public static zzkn zzb() {
        return (zzkn) zzb.zzt();
    }

    public static zzko zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzko) zzach.zzw(zzb, zzabe, zzabu);
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
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzko();
        } else {
            if (i2 == 4) {
                return new zzkn((zzkm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
