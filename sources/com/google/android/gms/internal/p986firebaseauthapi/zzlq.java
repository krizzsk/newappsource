package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlq */
public final class zzlq extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzlq zzb;
    /* access modifiers changed from: private */
    public zzabe zze = zzabe.zzb;
    private zznm zzf;

    static {
        zzlq zzlq = new zzlq();
        zzb = zzlq;
        zzach.zzE(zzlq.class, zzlq);
    }

    private zzlq() {
    }

    public static zzlp zza() {
        return (zzlp) zzb.zzt();
    }

    public static zzlq zzc(byte[] bArr, zzabu zzabu) throws zzacp {
        return (zzlq) zzach.zzx(zzb, bArr, zzabu);
    }

    public static /* synthetic */ void zzf(zzlq zzlq, zznm zznm) {
        zznm.getClass();
        zzlq.zzf = zznm;
    }

    public final zzabe zzd() {
        return this.zze;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzlq();
        } else {
            if (i2 == 4) {
                return new zzlp((zzlo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
