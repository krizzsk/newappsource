package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.k */
public class C2695k {

    /* renamed from: a */
    public Integer f9413a;

    /* renamed from: b */
    public Integer f9414b;

    /* renamed from: c */
    public Set<Vendor> f9415c = null;

    /* renamed from: a */
    public static C2695k m6768a(JSONObject jSONObject) {
        Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(jSONObject.optInt("pausePct", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("playPct", Integer.MIN_VALUE));
        C2695k kVar = new C2695k();
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        kVar.f9413a = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        kVar.f9414b = valueOf2;
        JSONArray optJSONArray = jSONObject.optJSONArray("vendor");
        if (optJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i, (String) null);
                if (!TextUtils.isEmpty(optString) && (fromValue = Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            kVar.f9415c = linkedHashSet;
        }
        return kVar;
    }
}
