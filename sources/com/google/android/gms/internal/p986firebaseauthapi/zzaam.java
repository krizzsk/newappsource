package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p001a0.C0017h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam */
public final class zzaam {
    public static zzui zza(Exception exc, String str, String str2) {
        exc.getMessage();
        return new zzui(C0017h.m56M("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List zzb(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }
}
