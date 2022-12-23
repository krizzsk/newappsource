package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzbhh implements Callable {
    public static final /* synthetic */ zzbhh zza = new zzbhh();

    private /* synthetic */ zzbhh() {
    }

    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
