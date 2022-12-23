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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTWrapperJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTWrapper;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTWrapperJsonAdapter */
public final class AKVASTWrapperJsonAdapter extends C8011k<AKVASTWrapper> {

    /* renamed from: a */
    public final JsonReader.C7986a f7683a = JsonReader.C7986a.m18216a("vastAdTagUri", "adDescription", "adSystem", "adTitle", "creatives", "errorTrackerUrl", "extensions", "impressionTrackers");

    /* renamed from: b */
    public final C8011k<String> f7684b;

    /* renamed from: c */
    public final C8011k<AKVASTCreatives> f7685c;

    /* renamed from: d */
    public final C8011k<String> f7686d;

    /* renamed from: e */
    public final C8011k<AKVASTExtensions> f7687e;

    /* renamed from: f */
    public final C8011k<List<AKVASTImpression>> f7688f;

    public AKVASTWrapperJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7684b = C18201b.m44910D(oVar, cls, "vastAdTagUri");
        this.f7685c = C18201b.m44910D(oVar, AKVASTCreatives.class, "creatives");
        this.f7686d = C18201b.m44910D(oVar, cls, "errorTrackerUrl");
        this.f7687e = C18201b.m44910D(oVar, AKVASTExtensions.class, "extensions");
        this.f7688f = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKVASTImpression.class), "impressionTrackers");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        AKVASTCreatives aKVASTCreatives = null;
        String str5 = null;
        AKVASTExtensions aKVASTExtensions = null;
        List list = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f7683a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7684b.mo11093a(jsonReader);
                    if (str != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("vastAdTagUri", "vastAdTagUri", jsonReader);
                    }
                case 1:
                    str2 = this.f7684b.mo11093a(jsonReader);
                    if (str2 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("adDescription", "adDescription", jsonReader);
                    }
                case 2:
                    str3 = this.f7684b.mo11093a(jsonReader);
                    if (str3 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("adSystem", "adSystem", jsonReader);
                    }
                case 3:
                    str4 = this.f7684b.mo11093a(jsonReader);
                    if (str4 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("adTitle", "adTitle", jsonReader);
                    }
                case 4:
                    aKVASTCreatives = this.f7685c.mo11093a(jsonReader);
                    z = true;
                    break;
                case 5:
                    str5 = this.f7686d.mo11093a(jsonReader);
                    z2 = true;
                    break;
                case 6:
                    aKVASTExtensions = this.f7687e.mo11093a(jsonReader);
                    z3 = true;
                    break;
                case 7:
                    list = this.f7688f.mo11093a(jsonReader);
                    z4 = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        AKVASTWrapper aKVASTWrapper = new AKVASTWrapper();
        if (str == null) {
            str = aKVASTWrapper.getVastAdTagUri();
        }
        aKVASTWrapper.setVastAdTagUri(str);
        if (str2 == null) {
            str2 = aKVASTWrapper.getAdDescription();
        }
        aKVASTWrapper.setAdDescription(str2);
        if (str3 == null) {
            str3 = aKVASTWrapper.getAdSystem();
        }
        aKVASTWrapper.setAdSystem(str3);
        if (str4 == null) {
            str4 = aKVASTWrapper.getAdTitle();
        }
        aKVASTWrapper.setAdTitle(str4);
        if (z) {
            aKVASTWrapper.setCreatives(aKVASTCreatives);
        }
        if (z2) {
            aKVASTWrapper.setErrorTrackerUrl(str5);
        }
        if (z3) {
            aKVASTWrapper.setExtensions(aKVASTExtensions);
        }
        if (z4) {
            aKVASTWrapper.setImpressionTrackers(list);
        }
        return aKVASTWrapper;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTWrapper aKVASTWrapper = (AKVASTWrapper) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTWrapper != null) {
            kVar.mo25074i();
            kVar.mo25077w("vastAdTagUri");
            this.f7684b.mo11094e(kVar, aKVASTWrapper.getVastAdTagUri());
            kVar.mo25077w("adDescription");
            this.f7684b.mo11094e(kVar, aKVASTWrapper.getAdDescription());
            kVar.mo25077w("adSystem");
            this.f7684b.mo11094e(kVar, aKVASTWrapper.getAdSystem());
            kVar.mo25077w("adTitle");
            this.f7684b.mo11094e(kVar, aKVASTWrapper.getAdTitle());
            kVar.mo25077w("creatives");
            this.f7685c.mo11094e(kVar, aKVASTWrapper.getCreatives());
            kVar.mo25077w("errorTrackerUrl");
            this.f7686d.mo11094e(kVar, aKVASTWrapper.getErrorTrackerUrl());
            kVar.mo25077w("extensions");
            this.f7687e.mo11094e(kVar, aKVASTWrapper.getExtensions());
            kVar.mo25077w("impressionTrackers");
            this.f7688f.mo11094e(kVar, aKVASTWrapper.getImpressionTrackers());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(35, "AKVASTWrapper");
    }
}
