package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmz */
public final class zzmz extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmz zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public zzabe zzf = zzabe.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzmz zzmz = new zzmz();
        zzb = zzmz;
        zzach.zzE(zzmz.class, zzmz);
    }

    private zzmz() {
    }

    public static zzmy zza() {
        return (zzmy) zzb.zzt();
    }

    public static zzmz zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzmz zzmz, String str) {
        str.getClass();
        zzmz.zze = str;
    }

    public final zzoa zzd() {
        zzoa zzb2 = zzoa.zzb(this.zzg);
        return zzb2 == null ? zzoa.UNRECOGNIZED : zzb2;
    }

    public final zzabe zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzmz();
        } else {
            if (i2 == 4) {
                return new zzmy((zzmx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
