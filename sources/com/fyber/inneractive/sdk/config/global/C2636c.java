package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.c */
public class C2636c implements C2637d {

    /* renamed from: a */
    public Set<Long> f9294a = new HashSet();

    /* renamed from: b */
    public boolean f9295b;

    public C2636c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f9294a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f9295b = z;
    }

    /* renamed from: a */
    public boolean mo13231a(C2638e eVar) {
        if (this.f9294a.isEmpty() || eVar == null || eVar.f9296a == null) {
            return false;
        }
        for (Long equals : this.f9294a) {
            if (equals.equals(eVar.f9296a)) {
                return !this.f9295b;
            }
        }
        return this.f9295b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"demand", this.f9294a, Boolean.valueOf(this.f9295b)});
    }
}
