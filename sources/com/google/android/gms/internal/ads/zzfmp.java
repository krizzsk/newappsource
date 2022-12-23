package com.google.android.gms.internal.ads;

public final class zzfmp extends Exception {
    private final int zza;

    public zzfmp(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfmp(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
