package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzv extends zzec implements zzfm {
    public static final zzea zza;
    /* access modifiers changed from: private */
    public static final zzv zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzjh zzi;
    private byte zzj = 2;

    static {
        zzv zzv = new zzv();
        zze = zzv;
        zzec.zzS(zzv.class, zzv);
        zza = zzec.zzH(zzjh.zzf(), zzv, zzv, (zzef) null, 13258261, zzhf.MESSAGE, zzv.class);
    }

    private zzv() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzv();
        } else {
            if (i2 == 4) {
                return new zzu((zzt) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzj = b;
            return null;
        }
    }
}
