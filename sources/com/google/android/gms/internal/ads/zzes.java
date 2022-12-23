package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzes extends IOException {
    public final int zza;

    public zzes(int i) {
        this.zza = i;
    }

    public zzes(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzes(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzes(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
