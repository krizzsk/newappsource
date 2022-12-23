package com.google.android.gms.internal.ads;

final class zzglp implements zzglw {
    private final zzglw[] zza;

    public zzglp(zzglw... zzglwArr) {
        this.zza = zzglwArr;
    }

    public final zzglv zzb(Class cls) {
        zzglw[] zzglwArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzglw zzglw = zzglwArr[i];
            if (zzglw.zzc(cls)) {
                return zzglw.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzglw[] zzglwArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzglwArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
