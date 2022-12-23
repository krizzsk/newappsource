package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzj extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzj zza;
    private int zze;
    private int zzf = 17;
    private zzek zzg = zzec.zzO();
    private int zzh;
    private zzv zzi;
    private zzp zzj;
    private zzjh zzk;
    private int zzl;
    private zzek zzm = zzec.zzO();
    private byte zzn = 2;

    static {
        zzj zzj2 = new zzj();
        zza = zzj2;
        zzec.zzS(zzj.class, zzj2);
    }

    private zzj() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001ဌ\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zze", "zzf", zzi.zza, "zzg", zzaj.class, "zzh", "zzi", "zzj", "zzl", "zzm", zzam.class, "zzk"});
        } else if (i2 == 3) {
            return new zzj();
        } else {
            if (i2 == 4) {
                return new zzh((zzg) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzn = b;
            return null;
        }
    }
}
