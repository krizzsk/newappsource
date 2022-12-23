package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.usebutton.sdk.internal.util.DiskLruCache;

@ShowFirstParty
public final class zzflc {
    public static zzfml zza(Context context, int i, int i2, String str, String str2, String str3, zzfks zzfks) {
        return new zzflb(context, 1, i2, str, str2, DiskLruCache.VERSION_1, zzfks).zzb(50000);
    }
}
