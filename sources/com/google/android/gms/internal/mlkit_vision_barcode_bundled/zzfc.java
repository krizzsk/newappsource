package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzfc implements zzfj {
    private final zzfj[] zza;

    public zzfc(zzfj... zzfjArr) {
        this.zza = zzfjArr;
    }

    public final zzfi zzb(Class cls) {
        String str;
        zzfj[] zzfjArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzfj zzfj = zzfjArr[i];
            if (zzfj.zzc(cls)) {
                return zzfj.zzb(cls);
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

    public final boolean zzc(Class cls) {
        zzfj[] zzfjArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzfjArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
