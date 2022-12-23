package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CappingStateJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/CappingState;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CappingStateJsonAdapter extends C8011k<CappingState> {

    /* renamed from: a */
    public final JsonReader.C7986a f8013a = JsonReader.C7986a.m18216a("journeyCharged", "journeyEnd", "dayCharged", "dayEnd", "weekCharged", "weekEnd", "monthCharged", "monthEnd");

    /* renamed from: b */
    public final C8011k<Money> f8014b;

    /* renamed from: c */
    public final C8011k<String> f8015c;

    public CappingStateJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8014b = oVar.mo25082c(Money.class, emptySet, "journeyCharged");
        this.f8015c = oVar.mo25082c(String.class, emptySet, "journeyEnd");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        Money money = null;
        String str = null;
        Money money2 = null;
        String str2 = null;
        Money money3 = null;
        String str3 = null;
        Money money4 = null;
        String str4 = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f8013a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    money = this.f8014b.mo11093a(jsonReader);
                    break;
                case 1:
                    str = this.f8015c.mo11093a(jsonReader);
                    break;
                case 2:
                    money2 = this.f8014b.mo11093a(jsonReader);
                    break;
                case 3:
                    str2 = this.f8015c.mo11093a(jsonReader);
                    break;
                case 4:
                    money3 = this.f8014b.mo11093a(jsonReader);
                    break;
                case 5:
                    str3 = this.f8015c.mo11093a(jsonReader);
                    break;
                case 6:
                    money4 = this.f8014b.mo11093a(jsonReader);
                    break;
                case 7:
                    str4 = this.f8015c.mo11093a(jsonReader);
                    break;
            }
        }
        jsonReader.mo24997r();
        return new CappingState(money, str, money2, str2, money3, str3, money4, str4);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        CappingState cappingState = (CappingState) obj;
        C24362h.m61211f(kVar, "writer");
        if (cappingState != null) {
            kVar.mo25074i();
            kVar.mo25077w("journeyCharged");
            this.f8014b.mo11094e(kVar, cappingState.f8005a);
            kVar.mo25077w("journeyEnd");
            this.f8015c.mo11094e(kVar, cappingState.f8006b);
            kVar.mo25077w("dayCharged");
            this.f8014b.mo11094e(kVar, cappingState.f8007c);
            kVar.mo25077w("dayEnd");
            this.f8015c.mo11094e(kVar, cappingState.f8008d);
            kVar.mo25077w("weekCharged");
            this.f8014b.mo11094e(kVar, cappingState.f8009e);
            kVar.mo25077w("weekEnd");
            this.f8015c.mo11094e(kVar, cappingState.f8010f);
            kVar.mo25077w("monthCharged");
            this.f8014b.mo11094e(kVar, cappingState.f8011g);
            kVar.mo25077w("monthEnd");
            this.f8015c.mo11094e(kVar, cappingState.f8012h);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CappingState)";
    }
}
