package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CappingInfo;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class CappingInfo {

    /* renamed from: a */
    public final Boolean f7990a;

    /* renamed from: b */
    public final Boolean f7991b;

    /* renamed from: c */
    public final Boolean f7992c;

    /* renamed from: d */
    public final Boolean f7993d;

    /* renamed from: e */
    public final Boolean f7994e;

    /* renamed from: f */
    public final CappingLimits f7995f;

    public CappingInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, CappingLimits cappingLimits) {
        this.f7990a = bool;
        this.f7991b = bool2;
        this.f7992c = bool3;
        this.f7993d = bool4;
        this.f7994e = bool5;
        this.f7995f = cappingLimits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CappingInfo)) {
            return false;
        }
        CappingInfo cappingInfo = (CappingInfo) obj;
        return C24362h.m61206a(this.f7990a, cappingInfo.f7990a) && C24362h.m61206a(this.f7991b, cappingInfo.f7991b) && C24362h.m61206a(this.f7992c, cappingInfo.f7992c) && C24362h.m61206a(this.f7993d, cappingInfo.f7993d) && C24362h.m61206a(this.f7994e, cappingInfo.f7994e) && C24362h.m61206a(this.f7995f, cappingInfo.f7995f);
    }

    public final int hashCode() {
        Boolean bool = this.f7990a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f7991b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f7992c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f7993d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f7994e;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        CappingLimits cappingLimits = this.f7995f;
        if (cappingLimits != null) {
            i = cappingLimits.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CappingInfo(journeyCapping=");
        k.append(this.f7990a);
        k.append(", dayCapping=");
        k.append(this.f7991b);
        k.append(", weekCapping=");
        k.append(this.f7992c);
        k.append(", monthCapping=");
        k.append(this.f7993d);
        k.append(", cappingByRouteType=");
        k.append(this.f7994e);
        k.append(", limits=");
        k.append(this.f7995f);
        k.append(')');
        return k.toString();
    }
}
