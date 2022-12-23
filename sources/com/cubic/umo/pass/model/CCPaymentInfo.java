package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CCPaymentInfo;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class CCPaymentInfo {

    /* renamed from: a */
    public final CreditCard f7985a;

    /* renamed from: b */
    public final BillingAddress f7986b;

    public CCPaymentInfo(CreditCard creditCard, BillingAddress billingAddress) {
        C24362h.m61211f(creditCard, "creditCard");
        C24362h.m61211f(billingAddress, "billingAddress");
        this.f7985a = creditCard;
        this.f7986b = billingAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CCPaymentInfo)) {
            return false;
        }
        CCPaymentInfo cCPaymentInfo = (CCPaymentInfo) obj;
        return C24362h.m61206a(this.f7985a, cCPaymentInfo.f7985a) && C24362h.m61206a(this.f7986b, cCPaymentInfo.f7986b);
    }

    public final int hashCode() {
        return this.f7986b.hashCode() + (this.f7985a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CCPaymentInfo(creditCard=");
        k.append(this.f7985a);
        k.append(", billingAddress=");
        k.append(this.f7986b);
        k.append(')');
        return k.toString();
    }
}
