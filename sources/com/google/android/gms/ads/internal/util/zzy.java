package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;

@TargetApi(30)
public final class zzy extends zzx {
    public final int zzk(Context context) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzha)).booleanValue()) {
            return 0;
        }
        return super.zzk(context);
    }
}
