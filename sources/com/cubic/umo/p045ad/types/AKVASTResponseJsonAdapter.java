package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;
import p358af.C13437d;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTResponseJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTResponse;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTResponseJsonAdapter */
public final class AKVASTResponseJsonAdapter extends C8011k<AKVASTResponse> {

    /* renamed from: a */
    public final JsonReader.C7986a f7671a = JsonReader.C7986a.m18216a("ads", "noAdErrorTrackerUrl", "vastVersion");

    /* renamed from: b */
    public final C8011k<List<AKVASTAd>> f7672b;

    /* renamed from: c */
    public final C8011k<String> f7673c;

    /* renamed from: d */
    public final C8011k<String> f7674d;

    public AKVASTResponseJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7672b = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKVASTAd.class), "ads");
        this.f7673c = C18201b.m44910D(oVar, cls, "noAdErrorTrackerUrl");
        this.f7674d = C18201b.m44910D(oVar, cls, "vastVersion");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        List list = null;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7671a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                list = this.f7672b.mo11093a(jsonReader);
                z = true;
            } else if (O == 1) {
                str = this.f7673c.mo11093a(jsonReader);
                z2 = true;
            } else if (O == 2 && (str2 = this.f7674d.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("vastVersion", "vastVersion", jsonReader);
            }
        }
        jsonReader.mo24997r();
        AKVASTResponse aKVASTResponse = new AKVASTResponse();
        if (z) {
            aKVASTResponse.setAds(list);
        }
        if (z2) {
            aKVASTResponse.setNoAdErrorTrackerUrl(str);
        }
        if (str2 == null) {
            str2 = aKVASTResponse.getVastVersion();
        }
        aKVASTResponse.setVastVersion(str2);
        return aKVASTResponse;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTResponse aKVASTResponse = (AKVASTResponse) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTResponse != null) {
            kVar.mo25074i();
            kVar.mo25077w("ads");
            this.f7672b.mo11094e(kVar, aKVASTResponse.getAds());
            kVar.mo25077w("noAdErrorTrackerUrl");
            this.f7673c.mo11094e(kVar, aKVASTResponse.getNoAdErrorTrackerUrl());
            kVar.mo25077w("vastVersion");
            this.f7674d.mo11094e(kVar, aKVASTResponse.getVastVersion());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(36, "AKVASTResponse");
    }
}
