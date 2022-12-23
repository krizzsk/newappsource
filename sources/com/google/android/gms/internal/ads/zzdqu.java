package com.google.android.gms.internal.ads;

import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;

public final /* synthetic */ class zzdqu implements zzbam {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzdqu(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void zzc(zzbal zzbal) {
        String str;
        zzcli zzcli = this.zza;
        HashMap hashMap = new HashMap();
        if (true != zzbal.zzj) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        hashMap.put("isVisible", str);
        zzcli.zzd("onAdVisibilityChanged", hashMap);
    }
}
