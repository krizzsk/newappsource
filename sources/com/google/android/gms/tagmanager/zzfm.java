package com.google.android.gms.tagmanager;

import java.util.Map;

final class zzfm implements zzav {
    public final /* synthetic */ TagManager zza;

    public zzfm(TagManager tagManager) {
        this.zza = tagManager;
    }

    public final void zza(Map<String, Object> map) {
        Object obj = map.get("event");
        if (obj != null) {
            TagManager.zzb(this.zza, obj.toString());
        }
    }
}
