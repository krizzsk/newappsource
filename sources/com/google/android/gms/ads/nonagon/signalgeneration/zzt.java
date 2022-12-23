package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfoi;
import java.util.List;
import org.json.JSONObject;

public final /* synthetic */ class zzt implements zzfoi {
    public static final /* synthetic */ zzt zza = new zzt();

    private /* synthetic */ zzt() {
    }

    public final Object apply(Object obj) {
        List list = zzz.zza;
        return ((JSONObject) obj).optString("nas");
    }
}
