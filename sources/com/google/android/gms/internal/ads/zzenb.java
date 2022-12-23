package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.usebutton.sdk.internal.util.DiskLruCache;

public final class zzenb implements zzeta {
    private final boolean zza;

    public zzenb(boolean z) {
        this.zza = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (true != this.zza) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        bundle.putString("adid_p", str);
    }
}
