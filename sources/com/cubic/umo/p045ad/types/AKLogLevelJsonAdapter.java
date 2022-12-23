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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKLogLevelJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKLogLevel;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKLogLevelJsonAdapter */
public final class AKLogLevelJsonAdapter extends C8011k<AKLogLevel> {

    /* renamed from: a */
    public final JsonReader.C7986a f7554a = JsonReader.C7986a.m18216a("ad_kit");

    /* renamed from: b */
    public final C8011k<String> f7555b;

    public AKLogLevelJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7555b = C18201b.m44910D(oVar, String.class, "adKitLogLevel");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7554a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0 && (str = this.f7555b.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("adKitLogLevel", "ad_kit", jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (str != null) {
            return new AKLogLevel(str);
        }
        throw C12977b.m32854g("adKitLogLevel", "ad_kit", jsonReader);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKLogLevel aKLogLevel = (AKLogLevel) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKLogLevel != null) {
            kVar.mo25074i();
            kVar.mo25077w("ad_kit");
            this.f7555b.mo11094e(kVar, aKLogLevel.getAdKitLogLevel());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(32, "AKLogLevel");
    }
}
