package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import java.util.Map;

final class zzx implements zzaq {
    public final /* synthetic */ Container zza;

    public /* synthetic */ zzx(Container container, zzw zzw) {
        this.zza = container;
    }

    public final Object zza(String str, Map<String, Object> map) {
        Container.FunctionCallTagCallback zzb = this.zza.zzb(str);
        if (zzb != null) {
            zzb.execute(str, map);
        }
        return zzfv.zzm();
    }
}
