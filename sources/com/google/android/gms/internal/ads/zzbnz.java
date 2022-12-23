package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

final class zzbnz implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcli zzcli = (zzcli) obj;
        zzbkn zzM = zzcli.zzM();
        if (zzM == null || (zza = zzM.zza()) == null) {
            zzcli.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcli.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
