package com.google.android.gms.internal.places;

final class zzbz implements zzch {
    private zzch[] zzki;

    public zzbz(zzch... zzchArr) {
        this.zzki = zzchArr;
    }

    public final boolean zzb(Class<?> cls) {
        for (zzch zzb : this.zzki) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzci zzc(Class<?> cls) {
        String str;
        for (zzch zzch : this.zzki) {
            if (zzch.zzb(cls)) {
                return zzch.zzc(cls);
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
