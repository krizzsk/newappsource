package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzih extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzih zza;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh = true;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private String zzm = "";
    private String zzn = "";

    static {
        zzih zzih = new zzih();
        zza = zzih;
        zzec.zzS(zzih.class, zzih);
    }

    private zzih() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzeg zzeg = zzii.zza;
            return zzec.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဈ\u0007\tဈ\b", new Object[]{"zze", "zzf", "zzg", zzij.zza, "zzh", "zzi", zzif.zza, "zzj", zzeg, "zzk", zzeg, "zzl", zzeg, "zzm", "zzn"});
        } else if (i2 == 3) {
            return new zzih();
        } else {
            if (i2 == 4) {
                return new zzig((zzhh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
