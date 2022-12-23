package com.google.android.gms.internal.contextmanager;

public final class zzph extends zzmb<zzph, zzpg> {
    /* access modifiers changed from: private */
    public static final zzph zze;
    private byte zzf = 2;

    static {
        zzph zzph = new zzph();
        zze = zzph;
        zzmf.zzH(zzph.class, zzph);
    }

    private zzph() {
    }

    public static zzph zzg() {
        return zze;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return zzmf.zzG(zze, "\u0003\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzph();
        }
        if (i2 == 4) {
            return new zzpg((zzpf) null);
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
