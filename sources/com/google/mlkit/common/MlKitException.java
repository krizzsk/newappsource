package com.google.mlkit.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

public class MlKitException extends Exception {
    private final int zza;

    @KeepForSdk
    public MlKitException(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.zza = i;
    }

    /* renamed from: a */
    public final int mo43875a() {
        return this.zza;
    }

    @KeepForSdk
    public MlKitException(int i, String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.zza = i;
    }
}
