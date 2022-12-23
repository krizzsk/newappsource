package com.cubic.umo.pass.model;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/MoneyJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/Money;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class MoneyJsonAdapter extends C8011k<Money> {

    /* renamed from: a */
    public final JsonReader.C7986a f8142a = JsonReader.C7986a.m18216a(AppsFlyerProperties.CURRENCY_CODE, "units", "nanos");

    /* renamed from: b */
    public final C8011k<String> f8143b;

    /* renamed from: c */
    public final C8011k<Integer> f8144c;

    public MoneyJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8143b = oVar.mo25082c(String.class, emptySet, AppsFlyerProperties.CURRENCY_CODE);
        this.f8144c = oVar.mo25082c(Integer.TYPE, emptySet, "units");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8142a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f8143b.mo11093a(jsonReader);
                if (str == null) {
                    throw C12977b.m32860m(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
                }
            } else if (O == 1) {
                num = this.f8144c.mo11093a(jsonReader);
                if (num == null) {
                    throw C12977b.m32860m("units", "units", jsonReader);
                }
            } else if (O == 2 && (num2 = this.f8144c.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("nanos", "nanos", jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (str == null) {
            throw C12977b.m32854g(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
        } else if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                return new Money(str, intValue, num2.intValue());
            }
            throw C12977b.m32854g("nanos", "nanos", jsonReader);
        } else {
            throw C12977b.m32854g("units", "units", jsonReader);
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        Money money = (Money) obj;
        C24362h.m61211f(kVar, "writer");
        if (money != null) {
            kVar.mo25074i();
            kVar.mo25077w(AppsFlyerProperties.CURRENCY_CODE);
            this.f8143b.mo11094e(kVar, money.f8139b);
            kVar.mo25077w("units");
            this.f8144c.mo11094e(kVar, Integer.valueOf(money.f8140c));
            kVar.mo25077w("nanos");
            this.f8144c.mo11094e(kVar, Integer.valueOf(money.f8141d));
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Money)";
    }
}
