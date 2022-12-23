package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

public final class zzcb extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final zzcb zza;
    private int zze;
    private int zzf;
    private zzek zzg = zzec.zzO();
    private zzf zzh;
    private byte zzi = 2;

    static {
        zzcb zzcb = new zzcb();
        zza = zzcb;
        zzec.zzS(zzcb.class, zzcb);
    }

    private zzcb() {
    }

    public final List zzb() {
        return this.zzg;
    }

    public final int zzc() {
        int zza2 = zzca.zza(this.zzf);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zze", "zzf", zzbz.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzcb();
        } else {
            if (i2 == 4) {
                return new zzbx((zzbw) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzi = b;
            return null;
        }
    }
}
