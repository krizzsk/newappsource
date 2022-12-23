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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTClickThroughJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTClickThrough;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTClickThroughJsonAdapter */
public final class AKVASTClickThroughJsonAdapter extends C8011k<AKVASTClickThrough> {

    /* renamed from: a */
    public final JsonReader.C7986a f7628a = JsonReader.C7986a.m18216a("clickUrl", "id");

    /* renamed from: b */
    public final C8011k<String> f7629b;

    /* renamed from: c */
    public final C8011k<String> f7630c;

    public AKVASTClickThroughJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7629b = C18201b.m44910D(oVar, cls, "clickUrl");
        this.f7630c = C18201b.m44910D(oVar, cls, "id");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        boolean z = false;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7628a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7629b.mo11093a(jsonReader);
                z = true;
            } else if (O == 1 && (str2 = this.f7630c.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("id", "id", jsonReader);
            }
        }
        jsonReader.mo24997r();
        AKVASTClickThrough aKVASTClickThrough = new AKVASTClickThrough();
        if (z) {
            aKVASTClickThrough.setClickUrl(str);
        }
        if (str2 == null) {
            str2 = aKVASTClickThrough.getId();
        }
        aKVASTClickThrough.setId(str2);
        return aKVASTClickThrough;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTClickThrough aKVASTClickThrough = (AKVASTClickThrough) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTClickThrough != null) {
            kVar.mo25074i();
            kVar.mo25077w("clickUrl");
            this.f7629b.mo11094e(kVar, aKVASTClickThrough.getClickUrl());
            kVar.mo25077w("id");
            this.f7630c.mo11094e(kVar, aKVASTClickThrough.getId());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(40, "AKVASTClickThrough");
    }
}
