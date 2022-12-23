package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmu */
public final class zzmu extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzmu zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public zzabe zzf = zzabe.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzmu zzmu = new zzmu();
        zzb = zzmu;
        zzach.zzE(zzmu.class, zzmu);
    }

    private zzmu() {
    }

    public static zzmr zza() {
        return (zzmr) zzb.zzt();
    }

    public static zzmu zzd() {
        return zzb;
    }

    public final zzmt zzb() {
        zzmt zzb2 = zzmt.zzb(this.zzg);
        return zzb2 == null ? zzmt.UNRECOGNIZED : zzb2;
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
            return new zzmu();
        } else {
            if (i2 == 4) {
                return new zzmr((zzmq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
