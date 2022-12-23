package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzam extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzam zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzam zzam = new zzam();
        zza = zzam;
        zzec.zzS(zzam.class, zzam);
    }

    private zzam() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzam();
        } else {
            if (i2 == 4) {
                return new zzal((zzak) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
