package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzayo extends IOException {
    public final zzayk zza;

    public zzayo(IOException iOException, zzayk zzayk, int i) {
        super(iOException);
        this.zza = zzayk;
    }

    public zzayo(String str, zzayk zzayk, int i) {
        super(str);
        this.zza = zzayk;
    }

    public zzayo(String str, IOException iOException, zzayk zzayk, int i) {
        super(str, iOException);
        this.zza = zzayk;
    }
}
