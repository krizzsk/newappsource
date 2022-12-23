package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CappingLimits;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class CappingLimits {

    /* renamed from: a */
    public final Money f7999a;

    /* renamed from: b */
    public final Money f8000b;

    /* renamed from: c */
    public final Money f8001c;

    /* renamed from: d */
    public final Money f8002d;

    public CappingLimits(Money money, Money money2, Money money3, Money money4) {
        this.f7999a = money;
        this.f8000b = money2;
        this.f8001c = money3;
        this.f8002d = money4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CappingLimits)) {
            return false;
        }
        CappingLimits cappingLimits = (CappingLimits) obj;
        return C24362h.m61206a(this.f7999a, cappingLimits.f7999a) && C24362h.m61206a(this.f8000b, cappingLimits.f8000b) && C24362h.m61206a(this.f8001c, cappingLimits.f8001c) && C24362h.m61206a(this.f8002d, cappingLimits.f8002d);
    }

    public final int hashCode() {
        Money money = this.f7999a;
        int i = 0;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        Money money2 = this.f8000b;
        int hashCode2 = (hashCode + (money2 == null ? 0 : money2.hashCode())) * 31;
        Money money3 = this.f8001c;
        int hashCode3 = (hashCode2 + (money3 == null ? 0 : money3.hashCode())) * 31;
        Money money4 = this.f8002d;
        if (money4 != null) {
            i = money4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CappingLimits(journeyCap=");
        k.append(this.f7999a);
        k.append(", dayCap=");
        k.append(this.f8000b);
        k.append(", weekCap=");
        k.append(this.f8001c);
        k.append(", monthCap=");
        k.append(this.f8002d);
        k.append(')');
        return k.toString();
    }
}
