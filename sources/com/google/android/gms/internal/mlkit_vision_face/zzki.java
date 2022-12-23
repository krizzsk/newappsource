package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.LibraryVersion;
import java.util.concurrent.Callable;

final /* synthetic */ class zzki implements Callable {
    private final String zza;

    public zzki(String str) {
        this.zza = str;
    }

    public final Object call() {
        return LibraryVersion.getInstance().getVersion(this.zza);
    }
}
