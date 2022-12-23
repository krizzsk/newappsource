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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTAdJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTAd;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTAdJsonAdapter */
public final class AKVASTAdJsonAdapter extends C8011k<AKVASTAd> {

    /* renamed from: a */
    public final JsonReader.C7986a f7623a = JsonReader.C7986a.m18216a("inline", "vastAdId", "wrapper");

    /* renamed from: b */
    public final C8011k<AKVASTInline> f7624b;

    /* renamed from: c */
    public final C8011k<String> f7625c;

    /* renamed from: d */
    public final C8011k<AKVASTWrapper> f7626d;

    public AKVASTAdJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7624b = C18201b.m44910D(oVar, AKVASTInline.class, "inline");
        this.f7625c = C18201b.m44910D(oVar, String.class, "vastAdId");
        this.f7626d = C18201b.m44910D(oVar, AKVASTWrapper.class, "wrapper");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        AKVASTInline aKVASTInline = null;
        String str = null;
        AKVASTWrapper aKVASTWrapper = null;
        boolean z2 = false;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7623a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                aKVASTInline = this.f7624b.mo11093a(jsonReader);
                z = true;
            } else if (O == 1) {
                str = this.f7625c.mo11093a(jsonReader);
                if (str == null) {
                    throw C12977b.m32860m("vastAdId", "vastAdId", jsonReader);
                }
            } else if (O == 2) {
                aKVASTWrapper = this.f7626d.mo11093a(jsonReader);
                z2 = true;
            }
        }
        jsonReader.mo24997r();
        AKVASTAd aKVASTAd = new AKVASTAd();
        if (z) {
            aKVASTAd.setInline(aKVASTInline);
        }
        if (str == null) {
            str = aKVASTAd.getVastAdId();
        }
        aKVASTAd.setVastAdId(str);
        if (z2) {
            aKVASTAd.setWrapper(aKVASTWrapper);
        }
        return aKVASTAd;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTAd aKVASTAd = (AKVASTAd) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTAd != null) {
            kVar.mo25074i();
            kVar.mo25077w("inline");
            this.f7624b.mo11094e(kVar, aKVASTAd.getInline());
            kVar.mo25077w("vastAdId");
            this.f7625c.mo11094e(kVar, aKVASTAd.getVastAdId());
            kVar.mo25077w("wrapper");
            this.f7626d.mo11094e(kVar, aKVASTAd.getWrapper());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(30, "AKVASTAd");
    }
}
