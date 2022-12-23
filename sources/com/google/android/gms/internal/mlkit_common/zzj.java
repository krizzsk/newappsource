package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzj implements Callable {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzj(String str) {
        this.zza = str;
    }

    public final Object call() {
        return Os.lstat(this.zza);
    }
}
