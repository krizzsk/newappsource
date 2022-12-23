package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.LibraryVersion;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzjr implements Callable {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzjr(String str) {
        this.zza = str;
    }

    public final Object call() {
        String str = this.zza;
        int i = zzjt.zza;
        return LibraryVersion.getInstance().getVersion(str);
    }
}
