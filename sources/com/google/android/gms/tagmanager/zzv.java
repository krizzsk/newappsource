package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import java.util.Map;

final class zzv implements zzaq {
    public final /* synthetic */ Container zza;

    public /* synthetic */ zzv(Container container, zzu zzu) {
        this.zza = container;
    }

    public final Object zza(String str, Map<String, Object> map) {
        Container.FunctionCallMacroCallback zza2 = this.zza.zza(str);
        if (zza2 == null) {
            return null;
        }
        return zza2.getValue(str, map);
    }
}
