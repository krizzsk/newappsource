package com.cubic.umo.pass.model;

import com.appsflyer.ServerParameters;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/BillingAddressJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/BillingAddress;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class BillingAddressJsonAdapter extends C8011k<BillingAddress> {

    /* renamed from: a */
    public final JsonReader.C7986a f7982a = JsonReader.C7986a.m18216a("street", "city", "stateProvince", "zipPostalCode", ServerParameters.COUNTRY);

    /* renamed from: b */
    public final C8011k<String> f7983b;

    /* renamed from: c */
    public final C8011k<String> f7984c;

    public BillingAddressJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7983b = oVar.mo25082c(cls, emptySet, "street");
        this.f7984c = oVar.mo25082c(cls, emptySet, "zipPostalCode");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7982a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7983b.mo11093a(jsonReader);
            } else if (O == 1) {
                str2 = this.f7983b.mo11093a(jsonReader);
            } else if (O == 2) {
                str3 = this.f7983b.mo11093a(jsonReader);
            } else if (O == 3) {
                str4 = this.f7984c.mo11093a(jsonReader);
                if (str4 == null) {
                    throw C12977b.m32860m("zipPostalCode", "zipPostalCode", jsonReader);
                }
            } else if (O == 4) {
                str5 = this.f7983b.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (str4 != null) {
            return new BillingAddress(str, str2, str3, str4, str5);
        }
        throw C12977b.m32854g("zipPostalCode", "zipPostalCode", jsonReader);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        BillingAddress billingAddress = (BillingAddress) obj;
        C24362h.m61211f(kVar, "writer");
        if (billingAddress != null) {
            kVar.mo25074i();
            kVar.mo25077w("street");
            this.f7983b.mo11094e(kVar, billingAddress.f7977a);
            kVar.mo25077w("city");
            this.f7983b.mo11094e(kVar, billingAddress.f7978b);
            kVar.mo25077w("stateProvince");
            this.f7983b.mo11094e(kVar, billingAddress.f7979c);
            kVar.mo25077w("zipPostalCode");
            this.f7984c.mo11094e(kVar, billingAddress.f7980d);
            kVar.mo25077w(ServerParameters.COUNTRY);
            this.f7983b.mo11094e(kVar, billingAddress.f7981e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(BillingAddress)";
    }
}
