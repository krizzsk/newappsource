package com.google.android.gms.internal.gtm;

public final class zzq extends zzuz<zzq, zzo> implements zzwl {
    /* access modifiers changed from: private */
    public static final zzq zza;
    private int zze;
    private int zzf = 1;
    private int zzg;
    private int zzh;

    static {
        zzq zzq = new zzq();
        zza = zzq;
        zzuz.zzak(zzq.class, zzq);
    }

    private zzq() {
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", zzp.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzq();
        } else {
            if (i2 == 4) {
                return new zzo((zzn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
