package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzeeg implements Callable {
    public final /* synthetic */ zzeen zza;

    public /* synthetic */ zzeeg(zzeen zzeen) {
        this.zza = zzeen;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
