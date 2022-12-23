package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzi implements Callable {
    public final /* synthetic */ FileDescriptor zza;

    public /* synthetic */ zzi(FileDescriptor fileDescriptor) {
        this.zza = fileDescriptor;
    }

    public final Object call() {
        return Os.fstat(this.zza);
    }
}
