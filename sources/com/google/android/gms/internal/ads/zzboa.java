package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

final class zzboa implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcli zzcli = (zzcli) obj;
        zzbkn zzM = zzcli.zzM();
        if (zzM == null || (zzb = zzM.zzb()) == null) {
            zzcli.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcli.zze("nativeClickMetaReady", zzb);
        }
    }
}
