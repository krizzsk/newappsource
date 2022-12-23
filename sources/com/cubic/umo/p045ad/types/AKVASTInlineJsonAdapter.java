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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTInlineJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTInline;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTInlineJsonAdapter */
public final class AKVASTInlineJsonAdapter extends C8011k<AKVASTInline> {

    /* renamed from: a */
    public final JsonReader.C7986a f7652a = JsonReader.C7986a.m18216a("adDescription", "adSystem", "adTitle", "creatives", "errorTrackerUrl", "extensions", "impressionTrackers");

    /* renamed from: b */
    public final C8011k<String> f7653b;

    /* renamed from: c */
    public final C8011k<AKVASTCreatives> f7654c;

    /* renamed from: d */
    public final C8011k<String> f7655d;

    /* renamed from: e */
    public final C8011k<AKVASTExtensions> f7656e;

    /* renamed from: f */
    public final C8011k<List<AKVASTImpression>> f7657f;

    public AKVASTInlineJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7653b = C18201b.m44910D(oVar, cls, "adDescription");
        this.f7654c = C18201b.m44910D(oVar, AKVASTCreatives.class, "creatives");
        this.f7655d = C18201b.m44910D(oVar, cls, "errorTrackerUrl");
        this.f7656e = C18201b.m44910D(oVar, AKVASTExtensions.class, "extensions");
        this.f7657f = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKVASTImpression.class), "impressionTrackers");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        AKVASTCreatives aKVASTCreatives = null;
        String str4 = null;
        AKVASTExtensions aKVASTExtensions = null;
        List list = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f7652a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7653b.mo11093a(jsonReader);
                    if (str != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("adDescription", "adDescription", jsonReader);
                    }
                case 1:
                    str2 = this.f7653b.mo11093a(jsonReader);
                    if (str2 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("adSystem", "adSystem", jsonReader);
                    }
                case 2:
                    str3 = this.f7653b.mo11093a(jsonReader);
                    if (str3 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("adTitle", "adTitle", jsonReader);
                    }
                case 3:
                    aKVASTCreatives = this.f7654c.mo11093a(jsonReader);
                    z = true;
                    break;
                case 4:
                    str4 = this.f7655d.mo11093a(jsonReader);
                    z2 = true;
                    break;
                case 5:
                    aKVASTExtensions = this.f7656e.mo11093a(jsonReader);
                    z3 = true;
                    break;
                case 6:
                    list = this.f7657f.mo11093a(jsonReader);
                    z4 = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        AKVASTInline aKVASTInline = new AKVASTInline();
        if (str == null) {
            str = aKVASTInline.getAdDescription();
        }
        aKVASTInline.setAdDescription(str);
        if (str2 == null) {
            str2 = aKVASTInline.getAdSystem();
        }
        aKVASTInline.setAdSystem(str2);
        if (str3 == null) {
            str3 = aKVASTInline.getAdTitle();
        }
        aKVASTInline.setAdTitle(str3);
        if (z) {
            aKVASTInline.setCreatives(aKVASTCreatives);
        }
        if (z2) {
            aKVASTInline.setErrorTrackerUrl(str4);
        }
        if (z3) {
            aKVASTInline.setExtensions(aKVASTExtensions);
        }
        if (z4) {
            aKVASTInline.setImpressionTrackers(list);
        }
        return aKVASTInline;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTInline aKVASTInline = (AKVASTInline) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTInline != null) {
            kVar.mo25074i();
            kVar.mo25077w("adDescription");
            this.f7653b.mo11094e(kVar, aKVASTInline.getAdDescription());
            kVar.mo25077w("adSystem");
            this.f7653b.mo11094e(kVar, aKVASTInline.getAdSystem());
            kVar.mo25077w("adTitle");
            this.f7653b.mo11094e(kVar, aKVASTInline.getAdTitle());
            kVar.mo25077w("creatives");
            this.f7654c.mo11094e(kVar, aKVASTInline.getCreatives());
            kVar.mo25077w("errorTrackerUrl");
            this.f7655d.mo11094e(kVar, aKVASTInline.getErrorTrackerUrl());
            kVar.mo25077w("extensions");
            this.f7656e.mo11094e(kVar, aKVASTInline.getExtensions());
            kVar.mo25077w("impressionTrackers");
            this.f7657f.mo11094e(kVar, aKVASTInline.getImpressionTrackers());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(34, "AKVASTInline");
    }
}
