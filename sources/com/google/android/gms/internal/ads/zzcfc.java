package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

public final /* synthetic */ class zzcfc implements zzcfg {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcfc(int i, Map map) {
        this.zza = i;
        this.zzb = map;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzcfh.zzb(this.zza, this.zzb, jsonWriter);
    }
}
