package com.google.android.gms.internal.places;

final class zzp {
    private static final Class<?> zzdw = zzh("libcore.io.Memory");
    private static final boolean zzdx;

    static {
        boolean z;
        if (zzh("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        zzdx = z;
    }

    private static <T> Class<T> zzh(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzy() {
        return zzdw != null && !zzdx;
    }

    public static Class<?> zzz() {
        return zzdw;
    }
}
