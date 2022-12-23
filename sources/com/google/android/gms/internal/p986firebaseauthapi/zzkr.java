package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkr */
public final class zzkr extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzkr zzb;

    static {
        zzkr zzkr = new zzkr();
        zzb = zzkr;
        zzach.zzE(zzkr.class, zzkr);
    }

    private zzkr() {
    }

    public static zzkr zzb() {
        return zzb;
    }

    public static zzkr zzc(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzkr) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzkr();
        }
        if (i2 == 4) {
            return new zzkq((zzkp) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
