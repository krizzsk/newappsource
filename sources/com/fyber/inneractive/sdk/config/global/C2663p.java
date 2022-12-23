package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.p */
public abstract class C2663p implements C2661n {

    /* renamed from: a */
    public C2661n f9327a;

    /* renamed from: a */
    public String mo13237a(String str, String str2) {
        C2661n nVar = this.f9327a;
        return nVar != null ? nVar.mo13237a(str, str2) : str2;
    }

    /* renamed from: b */
    public Integer mo13240b(String str) {
        C2661n nVar = this.f9327a;
        if (nVar == null || nVar.mo13261a() == null || this.f9327a.mo13261a().size() <= 0) {
            return null;
        }
        return this.f9327a.mo13240b(str);
    }

    /* renamed from: c */
    public String mo13241c(String str) {
        C2661n nVar = this.f9327a;
        if (nVar == null || nVar.mo13261a() == null || this.f9327a.mo13261a().size() <= 0) {
            return null;
        }
        return this.f9327a.mo13241c(str);
    }

    /* renamed from: d */
    public Boolean mo13242d(String str) {
        C2661n nVar = this.f9327a;
        if (nVar == null || nVar.mo13261a() == null || this.f9327a.mo13261a().size() <= 0) {
            return null;
        }
        return this.f9327a.mo13242d(str);
    }

    /* renamed from: a */
    public Double mo13236a(String str) {
        C2661n nVar = this.f9327a;
        if (nVar == null || nVar.mo13261a() == null || this.f9327a.mo13261a().size() <= 0) {
            return null;
        }
        return this.f9327a.mo13236a(str);
    }

    /* renamed from: a */
    public Map<String, Object> mo13261a() {
        C2661n nVar = this.f9327a;
        if (nVar != null) {
            return nVar.mo13261a();
        }
        return null;
    }
}
