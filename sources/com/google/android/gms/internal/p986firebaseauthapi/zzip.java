package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzip */
public final class zzip extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzip zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzabe zzf = zzabe.zzb;
    private zziv zzg;

    static {
        zzip zzip = new zzip();
        zzb = zzip;
        zzach.zzE(zzip.class, zzip);
    }

    private zzip() {
    }

    public static zzio zzb() {
        return (zzio) zzb.zzt();
    }

    public static zzip zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzip) zzach.zzw(zzb, zzabe, zzabu);
    }

    public static /* synthetic */ void zzi(zzip zzip, zziv zziv) {
        zziv.getClass();
        zzip.zzg = zziv;
    }

    public final int zza() {
        return this.zze;
    }

    public final zziv zze() {
        zziv zziv = this.zzg;
        return zziv == null ? zziv.zzd() : zziv;
    }

    public final zzabe zzf() {
        return this.zzf;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzip();
        } else {
            if (i2 == 4) {
                return new zzio((zzin) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
