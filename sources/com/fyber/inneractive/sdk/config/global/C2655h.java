package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.h */
public class C2655h implements C2637d {

    /* renamed from: a */
    public Set<String> f9317a = new HashSet();

    /* renamed from: b */
    public boolean f9318b;

    public C2655h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f9317a.add(optString);
                }
            }
        }
        this.f9318b = z;
    }

    /* renamed from: a */
    public boolean mo13231a(C2638e eVar) {
        if (this.f9317a.isEmpty() || eVar == null || eVar.f9298c == null) {
            return false;
        }
        for (String equals : this.f9317a) {
            if (equals.equals(eVar.f9298c.value())) {
                return !this.f9318b;
            }
        }
        return this.f9318b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"placement_type", this.f9317a, Boolean.valueOf(this.f9318b)});
    }
}
