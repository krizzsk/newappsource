package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.i */
public class C2656i implements C2637d {

    /* renamed from: a */
    public Set<Long> f9319a = new HashSet();

    /* renamed from: b */
    public boolean f9320b;

    public C2656i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f9319a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f9320b = z;
    }

    /* renamed from: a */
    public boolean mo13231a(C2638e eVar) {
        if (this.f9319a.isEmpty() || eVar == null || eVar.f9297b == null) {
            return false;
        }
        for (Long equals : this.f9319a) {
            if (equals.equals(eVar.f9297b)) {
                return !this.f9320b;
            }
        }
        return this.f9320b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"pub_id", this.f9319a, Boolean.valueOf(this.f9320b)});
    }
}
