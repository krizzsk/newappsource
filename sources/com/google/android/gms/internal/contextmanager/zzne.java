package com.google.android.gms.internal.contextmanager;

final class zzne implements zznl {
    private final zznl[] zza;

    public zzne(zznl... zznlArr) {
        this.zza = zznlArr;
    }

    public final zznk zzb(Class<?> cls) {
        String str;
        zznl[] zznlArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zznl zznl = zznlArr[i];
            if (zznl.zzc(cls)) {
                return zznl.zzb(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }

    public final boolean zzc(Class<?> cls) {
        zznl[] zznlArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zznlArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
