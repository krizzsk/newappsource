package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CCPaymentInfoJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/CCPaymentInfo;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CCPaymentInfoJsonAdapter extends C8011k<CCPaymentInfo> {

    /* renamed from: a */
    public final JsonReader.C7986a f7987a = JsonReader.C7986a.m18216a("creditCard", "billingAddress");

    /* renamed from: b */
    public final C8011k<CreditCard> f7988b;

    /* renamed from: c */
    public final C8011k<BillingAddress> f7989c;

    public CCPaymentInfoJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7988b = oVar.mo25082c(CreditCard.class, emptySet, "creditCard");
        this.f7989c = oVar.mo25082c(BillingAddress.class, emptySet, "billingAddress");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        CreditCard creditCard = null;
        BillingAddress billingAddress = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7987a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                creditCard = this.f7988b.mo11093a(jsonReader);
                if (creditCard == null) {
                    throw C12977b.m32860m("creditCard", "creditCard", jsonReader);
                }
            } else if (O == 1 && (billingAddress = this.f7989c.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("billingAddress", "billingAddress", jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (creditCard == null) {
            throw C12977b.m32854g("creditCard", "creditCard", jsonReader);
        } else if (billingAddress != null) {
            return new CCPaymentInfo(creditCard, billingAddress);
        } else {
            throw C12977b.m32854g("billingAddress", "billingAddress", jsonReader);
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        CCPaymentInfo cCPaymentInfo = (CCPaymentInfo) obj;
        C24362h.m61211f(kVar, "writer");
        if (cCPaymentInfo != null) {
            kVar.mo25074i();
            kVar.mo25077w("creditCard");
            this.f7988b.mo11094e(kVar, cCPaymentInfo.f7985a);
            kVar.mo25077w("billingAddress");
            this.f7989c.mo11094e(kVar, cCPaymentInfo.f7986b);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CCPaymentInfo)";
    }
}
