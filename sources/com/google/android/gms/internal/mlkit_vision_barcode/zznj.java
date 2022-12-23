package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.LibraryVersion;
import java.util.concurrent.Callable;

public final /* synthetic */ class zznj implements Callable {
    public final /* synthetic */ String zza;

    public /* synthetic */ zznj(String str) {
        this.zza = str;
    }

    public final Object call() {
        String str = this.zza;
        int i = zznm.zza;
        return LibraryVersion.getInstance().getVersion(str);
    }
}
