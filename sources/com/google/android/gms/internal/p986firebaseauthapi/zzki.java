package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzki */
public final class zzki extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzki zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzabe zzf = zzabe.zzb;

    static {
        zzki zzki = new zzki();
        zzb = zzki;
        zzach.zzE(zzki.class, zzki);
    }

    private zzki() {
    }

    public static zzkh zzb() {
        return (zzkh) zzb.zzt();
    }

    public static zzki zzd(zzabe zzabe, zzabu zzabu) throws zzacp {
        return (zzki) zzach.zzw(zzb, zzabe, zzabu);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzabe zze() {
        return this.zzf;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzki();
        } else {
            if (i2 == 4) {
                return new zzkh((zzkg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
