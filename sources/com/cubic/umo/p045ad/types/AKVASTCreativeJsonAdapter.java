package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTCreativeJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTCreative;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTCreativeJsonAdapter */
public final class AKVASTCreativeJsonAdapter extends C8011k<AKVASTCreative> {

    /* renamed from: a */
    public final JsonReader.C7986a f7633a = JsonReader.C7986a.m18216a("creativeAdId", "creativeId", "linear", "sequence");

    /* renamed from: b */
    public final C8011k<String> f7634b;

    /* renamed from: c */
    public final C8011k<AKVASTLinear> f7635c;

    public AKVASTCreativeJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7634b = C18201b.m44910D(oVar, String.class, "creativeAdId");
        this.f7635c = C18201b.m44910D(oVar, AKVASTLinear.class, "linear");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        AKVASTLinear aKVASTLinear = null;
        String str3 = null;
        boolean z = false;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7633a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7634b.mo11093a(jsonReader);
                if (str == null) {
                    throw C12977b.m32860m("creativeAdId", "creativeAdId", jsonReader);
                }
            } else if (O == 1) {
                str2 = this.f7634b.mo11093a(jsonReader);
                if (str2 == null) {
                    throw C12977b.m32860m("creativeId", "creativeId", jsonReader);
                }
            } else if (O == 2) {
                aKVASTLinear = this.f7635c.mo11093a(jsonReader);
                z = true;
            } else if (O == 3 && (str3 = this.f7634b.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("sequence", "sequence", jsonReader);
            }
        }
        jsonReader.mo24997r();
        AKVASTCreative aKVASTCreative = new AKVASTCreative();
        if (str == null) {
            str = aKVASTCreative.getCreativeAdId();
        }
        aKVASTCreative.setCreativeAdId(str);
        if (str2 == null) {
            str2 = aKVASTCreative.getCreativeId();
        }
        aKVASTCreative.setCreativeId(str2);
        if (z) {
            aKVASTCreative.setLinear(aKVASTLinear);
        }
        if (str3 == null) {
            str3 = aKVASTCreative.getSequence();
        }
        aKVASTCreative.setSequence(str3);
        return aKVASTCreative;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTCreative aKVASTCreative = (AKVASTCreative) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTCreative != null) {
            kVar.mo25074i();
            kVar.mo25077w("creativeAdId");
            this.f7634b.mo11094e(kVar, aKVASTCreative.getCreativeAdId());
            kVar.mo25077w("creativeId");
            this.f7634b.mo11094e(kVar, aKVASTCreative.getCreativeId());
            kVar.mo25077w("linear");
            this.f7635c.mo11094e(kVar, aKVASTCreative.getLinear());
            kVar.mo25077w("sequence");
            this.f7634b.mo11094e(kVar, aKVASTCreative.getSequence());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(36, "AKVASTCreative");
    }
}
