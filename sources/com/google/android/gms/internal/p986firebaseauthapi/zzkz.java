package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkz */
public final class zzkz extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzkz zzb;
    private zzlc zze;

    static {
        zzkz zzkz = new zzkz();
        zzb = zzkz;
        zzach.zzE(zzkz.class, zzkz);
    }

    private zzkz() {
    }

    public static zzky zza() {
        return (zzky) zzb.zzt();
    }

    public static zzkz zzc(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzkz) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zze(zzkz zzkz, zzlc zzlc) {
        zzlc.getClass();
        zzkz.zze = zzlc;
    }

    public final zzlc zzd() {
        zzlc zzlc = this.zze;
        return zzlc == null ? zzlc.zzd() : zzlc;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzkz();
        } else {
            if (i2 == 4) {
                return new zzky((zzkx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
