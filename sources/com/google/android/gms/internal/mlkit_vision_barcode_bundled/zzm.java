package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzm extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzm zza;
    private int zze;
    private zzek zzf = zzec.zzO();
    private String zzg = "";

    static {
        zzm zzm = new zzm();
        zza = zzm;
        zzec.zzS(zzm.class, zzm);
    }

    private zzm() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzm();
        } else {
            if (i2 == 4) {
                return new zzl((zzk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
