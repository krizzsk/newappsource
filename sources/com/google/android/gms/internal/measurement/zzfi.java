package com.google.android.gms.internal.measurement;

public final class zzfi extends zzke implements zzlm {
    /* access modifiers changed from: private */
    public static final zzfi zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzfi zzfi = new zzfi();
        zza = zzfi;
        zzke.zzbJ(zzfi.class, zzfi);
    }

    private zzfi() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzfi();
        } else {
            if (i2 == 4) {
                return new zzfh((zzey) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
