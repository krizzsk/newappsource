package com.google.android.gms.internal.p986firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznc */
public final class zznc extends zzach implements zzadn {
    /* access modifiers changed from: private */
    public static final zznc zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        zznc zznc = new zznc();
        zzb = zznc;
        zzach.zzE(zznc.class, zznc);
    }

    private zznc() {
    }

    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzach.zzD(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zznc();
        } else {
            if (i2 == 4) {
                return new zznb((zzna) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
