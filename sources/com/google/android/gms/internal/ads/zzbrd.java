package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class zzbrd {
    public static void zza(zzbre zzbre, String str, Map map) {
        try {
            zzbre.zze(str, zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbre zzbre, String str, JSONObject jSONObject) {
        StringBuilder h = C16759e.m42352h("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcfi.zze("Dispatching AFMA event: ".concat(h.toString()));
        zzbre.zza(h.toString());
    }

    public static void zzc(zzbre zzbre, String str, String str2) {
        zzbre.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbre zzbre, String str, JSONObject jSONObject) {
        zzbre.zzb(str, jSONObject.toString());
    }
}
