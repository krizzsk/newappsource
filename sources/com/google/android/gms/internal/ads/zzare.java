package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzare extends Exception {
    private zzare(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    public static zzare zza(Exception exc, int i) {
        return new zzare(1, (String) null, exc, i);
    }

    public static zzare zzb(IOException iOException) {
        return new zzare(0, (String) null, iOException, -1);
    }

    public static zzare zzc(RuntimeException runtimeException) {
        return new zzare(2, (String) null, runtimeException, -1);
    }
}
