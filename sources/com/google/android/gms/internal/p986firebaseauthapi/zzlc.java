package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlc */
public final class zzlc extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzlc zzb;
    private zzll zze;
    private zzkw zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzlc zzlc = new zzlc();
        zzb = zzlc;
        zzach.zzE(zzlc.class, zzlc);
    }

    private zzlc() {
    }

    public static zzlb zzb() {
        return (zzlb) zzb.zzt();
    }

    public static zzlc zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzlc zzlc, zzll zzll) {
        zzll.getClass();
        zzlc.zze = zzll;
    }

    public static /* synthetic */ void zzg(zzlc zzlc, zzkw zzkw) {
        zzkw.getClass();
        zzlc.zzf = zzkw;
    }

    public final zzkw zza() {
        zzkw zzkw = this.zzf;
        return zzkw == null ? zzkw.zzc() : zzkw;
    }

    public final zzll zze() {
        zzll zzll = this.zze;
        return zzll == null ? zzll.zzc() : zzll;
    }

    public final int zzh() {
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

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzlc();
        } else {
            if (i2 == 4) {
                return new zzlb((zzla) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
