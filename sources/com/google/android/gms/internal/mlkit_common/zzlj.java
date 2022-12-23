package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.LibraryVersion;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzlj implements Callable {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzlj(String str) {
        this.zza = str;
    }

    public final Object call() {
        String str = this.zza;
        int i = zzll.zza;
        return LibraryVersion.getInstance().getVersion(str);
    }
}
