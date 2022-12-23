package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CappingLimitsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/CappingLimits;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CappingLimitsJsonAdapter extends C8011k<CappingLimits> {

    /* renamed from: a */
    public final JsonReader.C7986a f8003a = JsonReader.C7986a.m18216a("journeyCap", "dayCap", "weekCap", "monthCap");

    /* renamed from: b */
    public final C8011k<Money> f8004b;

    public CappingLimitsJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f8004b = oVar.mo25082c(Money.class, EmptySet.f60175b, "journeyCap");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        Money money4 = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8003a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                money = this.f8004b.mo11093a(jsonReader);
            } else if (O == 1) {
                money2 = this.f8004b.mo11093a(jsonReader);
            } else if (O == 2) {
                money3 = this.f8004b.mo11093a(jsonReader);
            } else if (O == 3) {
                money4 = this.f8004b.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        return new CappingLimits(money, money2, money3, money4);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        CappingLimits cappingLimits = (CappingLimits) obj;
        C24362h.m61211f(kVar, "writer");
        if (cappingLimits != null) {
            kVar.mo25074i();
            kVar.mo25077w("journeyCap");
            this.f8004b.mo11094e(kVar, cappingLimits.f7999a);
            kVar.mo25077w("dayCap");
            this.f8004b.mo11094e(kVar, cappingLimits.f8000b);
            kVar.mo25077w("weekCap");
            this.f8004b.mo11094e(kVar, cappingLimits.f8001c);
            kVar.mo25077w("monthCap");
            this.f8004b.mo11094e(kVar, cappingLimits.f8002d);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CappingLimits)";
    }
}
