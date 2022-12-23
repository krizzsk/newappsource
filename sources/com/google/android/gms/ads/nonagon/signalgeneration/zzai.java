package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

public final /* synthetic */ class zzai implements zzfuh {
    public final /* synthetic */ zzbzu zza;

    public /* synthetic */ zzai(zzbzu zzbzu) {
        this.zza = zzbzu;
    }

    public final zzfvj zza(Object obj) {
        zzbzu zzbzu = this.zza;
        zzal zzal = new zzal(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzal.zzb = zzaw.zzb().zzg(zzbzu.zza).toString();
        } catch (JSONException unused) {
            zzal.zzb = "{}";
        }
        return zzfva.zzi(zzal);
    }
}
