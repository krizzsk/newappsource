package com.google.android.gms.internal.icing;

public final class zzgh extends zzda<zzgh, zzgg> implements zzef {
    /* access modifiers changed from: private */
    public static final zzgh zzj;
    private int zzb;
    private boolean zze;
    private String zzf = "";
    private long zzg;
    private double zzh;
    private zzgf zzi;

    static {
        zzgh zzgh = new zzgh();
        zzj = zzgh;
        zzda.zzq(zzgh.class, zzgh);
    }

    private zzgh() {
    }

    public static zzgg zza() {
        return (zzgg) zzj.zzl();
    }

    public static /* synthetic */ void zzc(zzgh zzgh, boolean z) {
        zzgh.zzb |= 1;
        zzgh.zze = z;
    }

    public static /* synthetic */ void zzd(zzgh zzgh, String str) {
        str.getClass();
        zzgh.zzb |= 2;
        zzgh.zzf = str;
    }

    public static /* synthetic */ void zze(zzgh zzgh, zzgf zzgf) {
        zzgf.getClass();
        zzgh.zzi = zzgf;
        zzgh.zzb |= 16;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.zzr(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzgh();
        } else {
            if (i2 == 4) {
                return new zzgg((zzgb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
