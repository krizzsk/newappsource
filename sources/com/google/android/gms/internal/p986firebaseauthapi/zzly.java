package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzly */
public final class zzly extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzly zzb;
    private zzmb zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzly zzly = new zzly();
        zzb = zzly;
        zzach.zzE(zzly.class, zzly);
    }

    private zzly() {
    }

    public static zzlx zzb() {
        return (zzlx) zzb.zzt();
    }

    public static zzly zzd() {
        return zzb;
    }

    public static zzly zze(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzly) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzg(zzly zzly, zzmb zzmb) {
        zzmb.getClass();
        zzly.zze = zzmb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzmb zzf() {
        zzmb zzmb = this.zze;
        return zzmb == null ? zzmb.zzd() : zzmb;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzly();
        } else {
            if (i2 == 4) {
                return new zzlx((zzlw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
