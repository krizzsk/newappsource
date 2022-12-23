package com.google.android.gms.internal.contextmanager;

public final class zzdx extends zzmb<zzdx, zzdw> {
    /* access modifiers changed from: private */
    public static final zzdx zze;
    private byte zzf = 2;

    static {
        zzdx zzdx = new zzdx();
        zze = zzdx;
        zzmf.zzH(zzdx.class, zzdx);
    }

    private zzdx() {
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return zzmf.zzG(zze, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzdx();
        }
        if (i2 == 4) {
            return new zzdw((zzdv) null);
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
