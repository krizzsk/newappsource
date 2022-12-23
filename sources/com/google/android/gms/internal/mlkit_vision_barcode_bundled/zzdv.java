package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzdv implements zzfj {
    private static final zzdv zza = new zzdv();

    private zzdv() {
    }

    public static zzdv zza() {
        return zza;
    }

    public final zzfi zzb(Class cls) {
        String str;
        String str2;
        Class<zzec> cls2 = zzec.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (zzfi) zzec.zzI(cls.asSubclass(cls2)).zzg(3, (Object) null, (Object) null);
        } catch (Exception e) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }

    public final boolean zzc(Class cls) {
        return zzec.class.isAssignableFrom(cls);
    }
}
