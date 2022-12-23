package com.google.android.gms.internal.icing;

public final class zzgd extends zzda<zzgd, zzgc> implements zzef {
    /* access modifiers changed from: private */
    public static final zzgd zzg;
    private int zzb;
    private String zze = "";
    private zzgh zzf;

    static {
        zzgd zzgd = new zzgd();
        zzg = zzgd;
        zzda.zzq(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    public static zzgc zza() {
        return (zzgc) zzg.zzl();
    }

    public static /* synthetic */ void zzc(zzgd zzgd, String str) {
        str.getClass();
        zzgd.zzb |= 1;
        zzgd.zze = str;
    }

    public static /* synthetic */ void zzd(zzgd zzgd, zzgh zzgh) {
        zzgh.getClass();
        zzgd.zzf = zzgh;
        zzgd.zzb |= 2;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzda.zzr(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgd();
        } else {
            if (i2 == 4) {
                return new zzgc((zzgb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
