package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.usebutton.sdk.internal.util.DiskLruCache;

public final class zzeqe implements zzeta {
    public final String zza;
    public final boolean zzb;

    public zzeqe(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", DiskLruCache.VERSION_1);
        }
    }
}
