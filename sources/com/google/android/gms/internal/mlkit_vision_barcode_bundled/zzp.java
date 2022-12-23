package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

public final class zzp extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzp zza;
    private int zze;
    private zzei zzf = zzec.zzN();
    private zzeh zzg = zzec.zzL();
    private boolean zzh = true;
    private String zzi = "";
    private String zzj = "";
    private zzjh zzk;
    private byte zzl = 2;

    static {
        zzp zzp = new zzp();
        zza = zzp;
        zzec.zzS(zzp.class, zzp);
    }

    private zzp() {
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzp();
        } else {
            if (i2 == 4) {
                return new zzo((zzn) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
