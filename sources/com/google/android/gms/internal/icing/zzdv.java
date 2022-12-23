package com.google.android.gms.internal.icing;

final class zzdv implements zzec {
    private final zzec[] zza;

    public zzdv(zzec... zzecArr) {
        this.zza = zzecArr;
    }

    public final boolean zzb(Class<?> cls) {
        zzec[] zzecArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzecArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzeb zzc(Class<?> cls) {
        String str;
        zzec[] zzecArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzec zzec = zzecArr[i];
            if (zzec.zzb(cls)) {
                return zzec.zzc(cls);
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
}
