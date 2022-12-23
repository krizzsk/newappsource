package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.appboy.models.InAppMessageBase;
import org.json.JSONException;
import org.json.JSONObject;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyd */
public final class zzyd implements zzwp {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzyd";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        zzb(str);
        return this;
    }

    public final zzyd zzb(String str) throws zzui {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString(InAppMessageBase.MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e) {
            e.getMessage();
            throw new zzui(C13437d.m33706k("Failed to parse error for string [", str, "]"), e);
        }
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
