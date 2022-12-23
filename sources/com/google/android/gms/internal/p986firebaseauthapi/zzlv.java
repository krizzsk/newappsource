package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlv */
public final class zzlv extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzlv zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzmb zzf;
    /* access modifiers changed from: private */
    public zzabe zzg = zzabe.zzb;

    static {
        zzlv zzlv = new zzlv();
        zzb = zzlv;
        zzach.zzE(zzlv.class, zzlv);
    }

    private zzlv() {
    }

    public static zzlu zzb() {
        return (zzlu) zzb.zzt();
    }

    public static zzlv zzd() {
        return zzb;
    }

    public static zzlv zze(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzlv) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzi(zzlv zzlv, zzmb zzmb) {
        zzmb.getClass();
        zzlv.zzf = zzmb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzmb zzf() {
        zzmb zzmb = this.zzf;
        return zzmb == null ? zzmb.zzd() : zzmb;
    }

    public final zzabe zzg() {
        return this.zzg;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzlv();
        } else {
            if (i2 == 4) {
                return new zzlu((zzlt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
