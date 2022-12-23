package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzf extends zzec implements zzfm {
    public static final zzea zza;
    /* access modifiers changed from: private */
    public static final zzf zze;
    private int zzf;
    private String zzg = "";
    private zzek zzh = zzec.zzO();
    private zzek zzi = zzec.zzO();
    private zzek zzj = zzec.zzO();
    private zzjh zzk;
    private zzf zzl;
    private zzy zzm;
    private byte zzn = 2;

    static {
        zzf zzf2 = new zzf();
        zze = zzf2;
        zzec.zzS(zzf.class, zzf2);
        zza = zzec.zzH(zzjh.zzf(), zzf2, zzf2, (zzef) null, 12208774, zzhf.MESSAGE, zzf.class);
    }

    private zzf() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        Class<zzj> cls = zzj.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zze, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzf", "zzh", cls, "zzj", cls, "zzi", zzm.class, "zzk", "zzg", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new zzf();
        } else {
            if (i2 == 4) {
                return new zze((zzd) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzn = b;
            return null;
        }
    }
}
