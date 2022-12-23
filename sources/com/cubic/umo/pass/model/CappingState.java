package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CappingState;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class CappingState {

    /* renamed from: a */
    public final Money f8005a;

    /* renamed from: b */
    public final String f8006b;

    /* renamed from: c */
    public final Money f8007c;

    /* renamed from: d */
    public final String f8008d;

    /* renamed from: e */
    public final Money f8009e;

    /* renamed from: f */
    public final String f8010f;

    /* renamed from: g */
    public final Money f8011g;

    /* renamed from: h */
    public final String f8012h;

    public CappingState(Money money, String str, Money money2, String str2, Money money3, String str3, Money money4, String str4) {
        this.f8005a = money;
        this.f8006b = str;
        this.f8007c = money2;
        this.f8008d = str2;
        this.f8009e = money3;
        this.f8010f = str3;
        this.f8011g = money4;
        this.f8012h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CappingState)) {
            return false;
        }
        CappingState cappingState = (CappingState) obj;
        return C24362h.m61206a(this.f8005a, cappingState.f8005a) && C24362h.m61206a(this.f8006b, cappingState.f8006b) && C24362h.m61206a(this.f8007c, cappingState.f8007c) && C24362h.m61206a(this.f8008d, cappingState.f8008d) && C24362h.m61206a(this.f8009e, cappingState.f8009e) && C24362h.m61206a(this.f8010f, cappingState.f8010f) && C24362h.m61206a(this.f8011g, cappingState.f8011g) && C24362h.m61206a(this.f8012h, cappingState.f8012h);
    }

    public final int hashCode() {
        Money money = this.f8005a;
        int i = 0;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        String str = this.f8006b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money2 = this.f8007c;
        int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
        String str2 = this.f8008d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money3 = this.f8009e;
        int hashCode5 = (hashCode4 + (money3 == null ? 0 : money3.hashCode())) * 31;
        String str3 = this.f8010f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Money money4 = this.f8011g;
        int hashCode7 = (hashCode6 + (money4 == null ? 0 : money4.hashCode())) * 31;
        String str4 = this.f8012h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CappingState(journeyCharged=");
        k.append(this.f8005a);
        k.append(", journeyEnd=");
        k.append(this.f8006b);
        k.append(", dayCharged=");
        k.append(this.f8007c);
        k.append(", dayEnd=");
        k.append(this.f8008d);
        k.append(", weekCharged=");
        k.append(this.f8009e);
        k.append(", weekEnd=");
        k.append(this.f8010f);
        k.append(", monthCharged=");
        k.append(this.f8011g);
        k.append(", monthEnd=");
        return C0016g.m30n(k, this.f8012h, ')');
    }
}
