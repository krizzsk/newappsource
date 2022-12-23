package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.C3712m0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.v */
public class C2699v implements C3712m0.C3713a {

    /* renamed from: a */
    public Set<Track> f9418a = null;

    /* renamed from: a */
    public JSONObject mo13189a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.f9418a;
        if (set != null) {
            for (Track put : set) {
                jSONArray.put(put);
            }
        }
        C3712m0.m9974a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
