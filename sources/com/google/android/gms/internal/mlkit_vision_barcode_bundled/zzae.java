package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzae extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzae zza;
    private int zze;
    private int zzf = 4369;
    private String zzg = "";

    static {
        zzae zzae = new zzae();
        zza = zzae;
        zzec.zzS(zzae.class, zzae);
    }

    private zzae() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", zzs.zzc(), "zzg"});
        } else if (i2 == 3) {
            return new zzae();
        } else {
            if (i2 == 4) {
                return new zzad((zzac) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
