package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziy */
public final class zziy extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zziy zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzje zzf;
    private zzlv zzg;

    static {
        zziy zziy = new zziy();
        zzb = zziy;
        zzach.zzE(zziy.class, zziy);
    }

    private zziy() {
    }

    public static zzix zzb() {
        return (zzix) zzb.zzt();
    }

    public static zziy zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zziy) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzh(zziy zziy, zzje zzje) {
        zzje.getClass();
        zziy.zzf = zzje;
    }

    public static /* synthetic */ void zzi(zziy zziy, zzlv zzlv) {
        zzlv.getClass();
        zziy.zzg = zzlv;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzje zze() {
        zzje zzje = this.zzf;
        return zzje == null ? zzje.zzd() : zzje;
    }

    public final zzlv zzf() {
        zzlv zzlv = this.zzg;
        return zzlv == null ? zzlv.zzd() : zzlv;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zziy();
        } else {
            if (i2 == 4) {
                return new zzix((zziw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
