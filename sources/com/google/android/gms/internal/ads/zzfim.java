package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzfim {
    private final zzfit zza;
    private final zzfit zzb;
    private final zzfiq zzc;
    private final zzfis zzd;

    private zzfim(zzfiq zzfiq, zzfis zzfis, zzfit zzfit, zzfit zzfit2, boolean z) {
        this.zzc = zzfiq;
        this.zzd = zzfis;
        this.zza = zzfit;
        if (zzfit2 == null) {
            this.zzb = zzfit.NONE;
        } else {
            this.zzb = zzfit2;
        }
    }

    public static zzfim zza(zzfiq zzfiq, zzfis zzfis, zzfit zzfit, zzfit zzfit2, boolean z) {
        zzfjt.zzb(zzfis, "ImpressionType is null");
        zzfjt.zzb(zzfit, "Impression owner is null");
        if (zzfit == zzfit.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzfiq == zzfiq.DEFINED_BY_JAVASCRIPT && zzfit == zzfit.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzfis != zzfis.DEFINED_BY_JAVASCRIPT || zzfit != zzfit.NATIVE) {
            return new zzfim(zzfiq, zzfis, zzfit, zzfit2, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfjr.zzg(jSONObject, "impressionOwner", this.zza);
        if (this.zzd != null) {
            zzfjr.zzg(jSONObject, "mediaEventsOwner", this.zzb);
            zzfjr.zzg(jSONObject, "creativeType", this.zzc);
            zzfjr.zzg(jSONObject, "impressionType", this.zzd);
        } else {
            zzfjr.zzg(jSONObject, "videoEventsOwner", this.zzb);
        }
        zzfjr.zzg(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
