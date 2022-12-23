package com.google.android.gms.internal.p986firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzod */
public final class zzod extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zzod zzb;
    private String zze = "";
    private zzacm zzf = zzach.zzy();

    static {
        zzod zzod = new zzod();
        zzb = zzod;
        zzach.zzE(zzod.class, zzod);
    }

    private zzod() {
    }

    public static zzod zzb() {
        return zzb;
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zznc.class});
        } else if (i2 == 3) {
            return new zzod();
        } else {
            if (i2 == 4) {
                return new zzoc((zzob) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
