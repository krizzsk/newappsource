package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CreditCardJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/CreditCard;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CreditCardJsonAdapter extends C8011k<CreditCard> {

    /* renamed from: a */
    public final JsonReader.C7986a f8049a = JsonReader.C7986a.m18216a("cardNumber", "cardholderName", "expiration", "cvv", "type");

    /* renamed from: b */
    public final C8011k<String> f8050b;

    /* renamed from: c */
    public final C8011k<CreditCardType> f8051c;

    public CreditCardJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8050b = oVar.mo25082c(String.class, emptySet, "cardNumber");
        this.f8051c = oVar.mo25082c(CreditCardType.class, emptySet, "type");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        CreditCardType creditCardType = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8049a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f8050b.mo11093a(jsonReader);
                if (str == null) {
                    throw C12977b.m32860m("cardNumber", "cardNumber", jsonReader);
                }
            } else if (O == 1) {
                str2 = this.f8050b.mo11093a(jsonReader);
                if (str2 == null) {
                    throw C12977b.m32860m("cardholderName", "cardholderName", jsonReader);
                }
            } else if (O == 2) {
                str3 = this.f8050b.mo11093a(jsonReader);
                if (str3 == null) {
                    throw C12977b.m32860m("expiration", "expiration", jsonReader);
                }
            } else if (O == 3) {
                str4 = this.f8050b.mo11093a(jsonReader);
                if (str4 == null) {
                    throw C12977b.m32860m("cvv", "cvv", jsonReader);
                }
            } else if (O == 4 && (creditCardType = this.f8051c.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("type", "type", jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (str == null) {
            throw C12977b.m32854g("cardNumber", "cardNumber", jsonReader);
        } else if (str2 == null) {
            throw C12977b.m32854g("cardholderName", "cardholderName", jsonReader);
        } else if (str3 == null) {
            throw C12977b.m32854g("expiration", "expiration", jsonReader);
        } else if (str4 == null) {
            throw C12977b.m32854g("cvv", "cvv", jsonReader);
        } else if (creditCardType != null) {
            return new CreditCard(str, str2, str3, str4, creditCardType);
        } else {
            throw C12977b.m32854g("type", "type", jsonReader);
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        CreditCard creditCard = (CreditCard) obj;
        C24362h.m61211f(kVar, "writer");
        if (creditCard != null) {
            kVar.mo25074i();
            kVar.mo25077w("cardNumber");
            this.f8050b.mo11094e(kVar, creditCard.f8044a);
            kVar.mo25077w("cardholderName");
            this.f8050b.mo11094e(kVar, creditCard.f8045b);
            kVar.mo25077w("expiration");
            this.f8050b.mo11094e(kVar, creditCard.f8046c);
            kVar.mo25077w("cvv");
            this.f8050b.mo11094e(kVar, creditCard.f8047d);
            kVar.mo25077w("type");
            this.f8051c.mo11094e(kVar, creditCard.f8048e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CreditCard)";
    }
}
