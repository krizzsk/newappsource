package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzci extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzci zza;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zzci zzci = new zzci();
        zza = zzci;
        zzec.zzS(zzci.class, zzci);
    }

    private zzci() {
    }

    public static zzci zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final int zzd() {
        int zza2 = zzch.zza(this.zzf);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", zzcg.zza, "zzg"});
        } else if (i2 == 3) {
            return new zzci();
        } else {
            if (i2 == 4) {
                return new zzce((zzbw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
