package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzjh extends zzdy {
    /* access modifiers changed from: private */
    public static final zzjh zze;
    private byte zzf = 2;

    static {
        zzjh zzjh = new zzjh();
        zze = zzjh;
        zzec.zzS(zzjh.class, zzjh);
    }

    private zzjh() {
    }

    public static zzjh zzf() {
        return zze;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return zzec.zzR(zze, "\u0003\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzjh();
        }
        if (i2 == 4) {
            return new zzjg((zzjf) null);
        }
        if (i2 == 5) {
            return zze;
        }
        if (obj == null) {
            b = 0;
        } else {
            b = 1;
        }
        this.zzf = b;
        return null;
    }
}
