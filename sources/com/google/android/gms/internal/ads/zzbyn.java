package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

final class zzbyn extends zzbyi {
    public final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbyn(zzbyr zzbyr, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
