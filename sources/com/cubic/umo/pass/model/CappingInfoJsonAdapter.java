package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CappingInfoJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/CappingInfo;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class CappingInfoJsonAdapter extends C8011k<CappingInfo> {

    /* renamed from: a */
    public final JsonReader.C7986a f7996a = JsonReader.C7986a.m18216a("journeyCapping", "dayCapping", "weekCapping", "monthCapping", "cappingByRouteType", "limits");

    /* renamed from: b */
    public final C8011k<Boolean> f7997b;

    /* renamed from: c */
    public final C8011k<CappingLimits> f7998c;

    public CappingInfoJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7997b = oVar.mo25082c(Boolean.class, emptySet, "journeyCapping");
        this.f7998c = oVar.mo25082c(CappingLimits.class, emptySet, "limits");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        CappingLimits cappingLimits = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f7996a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    bool = this.f7997b.mo11093a(jsonReader);
                    break;
                case 1:
                    bool2 = this.f7997b.mo11093a(jsonReader);
                    break;
                case 2:
                    bool3 = this.f7997b.mo11093a(jsonReader);
                    break;
                case 3:
                    bool4 = this.f7997b.mo11093a(jsonReader);
                    break;
                case 4:
                    bool5 = this.f7997b.mo11093a(jsonReader);
                    break;
                case 5:
                    cappingLimits = this.f7998c.mo11093a(jsonReader);
                    break;
            }
        }
        jsonReader.mo24997r();
        return new CappingInfo(bool, bool2, bool3, bool4, bool5, cappingLimits);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        CappingInfo cappingInfo = (CappingInfo) obj;
        C24362h.m61211f(kVar, "writer");
        if (cappingInfo != null) {
            kVar.mo25074i();
            kVar.mo25077w("journeyCapping");
            this.f7997b.mo11094e(kVar, cappingInfo.f7990a);
            kVar.mo25077w("dayCapping");
            this.f7997b.mo11094e(kVar, cappingInfo.f7991b);
            kVar.mo25077w("weekCapping");
            this.f7997b.mo11094e(kVar, cappingInfo.f7992c);
            kVar.mo25077w("monthCapping");
            this.f7997b.mo11094e(kVar, cappingInfo.f7993d);
            kVar.mo25077w("cappingByRouteType");
            this.f7997b.mo11094e(kVar, cappingInfo.f7994e);
            kVar.mo25077w("limits");
            this.f7998c.mo11094e(kVar, cappingInfo.f7995f);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CappingInfo)";
    }
}
