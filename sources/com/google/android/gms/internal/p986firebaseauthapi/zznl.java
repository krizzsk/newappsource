package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznl */
public final class zznl extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zznl zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zznl zznl = new zznl();
        zzb = zznl;
        zzach.zzE(zznl.class, zznl);
    }

    private zznl() {
    }

    public static zznk zzb() {
        return (zznk) zzb.zzt();
    }

    public static /* synthetic */ void zzd(zznl zznl, String str) {
        str.getClass();
        zznl.zze = str;
    }

    public final int zza() {
        return this.zzg;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zznl();
        } else {
            if (i2 == 4) {
                return new zznk((zzni) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
