package com.google.android.gms.internal.gtm;

final class zzwb implements zzwi {
    private final zzwi[] zza;

    public zzwb(zzwi... zzwiArr) {
        this.zza = zzwiArr;
    }

    public final zzwh zzb(Class<?> cls) {
        String str;
        zzwi[] zzwiArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzwi zzwi = zzwiArr[i];
            if (zzwi.zzc(cls)) {
                return zzwi.zzb(cls);
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
        zzwi[] zzwiArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzwiArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
