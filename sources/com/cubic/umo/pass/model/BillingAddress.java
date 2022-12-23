package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/BillingAddress;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class BillingAddress {

    /* renamed from: a */
    public String f7977a;

    /* renamed from: b */
    public final String f7978b;

    /* renamed from: c */
    public final String f7979c;

    /* renamed from: d */
    public final String f7980d;

    /* renamed from: e */
    public final String f7981e;

    public BillingAddress(String str, String str2, String str3, String str4, String str5) {
        C24362h.m61211f(str4, "zipPostalCode");
        this.f7977a = str;
        this.f7978b = str2;
        this.f7979c = str3;
        this.f7980d = str4;
        this.f7981e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        return C24362h.m61206a(this.f7977a, billingAddress.f7977a) && C24362h.m61206a(this.f7978b, billingAddress.f7978b) && C24362h.m61206a(this.f7979c, billingAddress.f7979c) && C24362h.m61206a(this.f7980d, billingAddress.f7980d) && C24362h.m61206a(this.f7981e, billingAddress.f7981e);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f7977a;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = i * 31;
        String str2 = this.f7978b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f7979c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int d = C13715c.m34238d(this.f7980d, (i6 + i3) * 31, 31);
        String str4 = this.f7981e;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return d + i4;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BillingAddress(street=");
        k.append(this.f7977a);
        k.append(", city=");
        k.append(this.f7978b);
        k.append(", stateProvince=");
        k.append(this.f7979c);
        k.append(", zipPostalCode=");
        k.append(this.f7980d);
        k.append(", country=");
        return C0016g.m30n(k, this.f7981e, ')');
    }
}
