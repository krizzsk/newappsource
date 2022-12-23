package com.google.android.gms.internal.contextmanager;

public final class zzhe extends zzmf<zzhe, zzhd> implements zzno {
    /* access modifiers changed from: private */
    public static final zzhe zza;

    static {
        zzhe zzhe = new zzhe();
        zza = zzhe;
        zzmf.zzH(zzhe.class, zzhe);
    }

    private zzhe() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zza, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzhe();
        }
        if (i2 == 4) {
            return new zzhd((zzhc) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
