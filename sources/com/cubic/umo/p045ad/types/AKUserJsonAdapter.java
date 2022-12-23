package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKUserJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKUser;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKUserJsonAdapter */
public final class AKUserJsonAdapter extends C8011k<AKUser> {

    /* renamed from: a */
    public final JsonReader.C7986a f7615a = JsonReader.C7986a.m18216a("yob", "gender", "keywords", "customdata", "ext", "geo");

    /* renamed from: b */
    public final C8011k<Integer> f7616b;

    /* renamed from: c */
    public final C8011k<String> f7617c;

    /* renamed from: d */
    public final C8011k<AKUserExt> f7618d;

    /* renamed from: e */
    public final C8011k<AKGeo> f7619e;

    public AKUserJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7616b = C18201b.m44910D(oVar, Integer.class, "yob");
        this.f7617c = C18201b.m44910D(oVar, String.class, "gender");
        this.f7618d = C18201b.m44910D(oVar, AKUserExt.class, "ext");
        this.f7619e = C18201b.m44910D(oVar, AKGeo.class, "geo");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        AKUserExt aKUserExt = null;
        AKGeo aKGeo = null;
        boolean z2 = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f7615a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    num = this.f7616b.mo11093a(jsonReader);
                    break;
                case 1:
                    str = this.f7617c.mo11093a(jsonReader);
                    break;
                case 2:
                    str2 = this.f7617c.mo11093a(jsonReader);
                    break;
                case 3:
                    str3 = this.f7617c.mo11093a(jsonReader);
                    break;
                case 4:
                    aKUserExt = this.f7618d.mo11093a(jsonReader);
                    z = true;
                    break;
                case 5:
                    aKGeo = this.f7619e.mo11093a(jsonReader);
                    z2 = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        AKUser aKUser = new AKUser(str, str2, num, str3);
        if (z) {
            aKUser.f7609f = aKUserExt;
        }
        if (z2) {
            aKUser.f7608e = aKGeo;
        }
        return aKUser;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKUser aKUser = (AKUser) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKUser != null) {
            kVar.mo25074i();
            kVar.mo25077w("yob");
            this.f7616b.mo11094e(kVar, aKUser.f7604a);
            kVar.mo25077w("gender");
            this.f7617c.mo11094e(kVar, aKUser.f7605b);
            kVar.mo25077w("keywords");
            this.f7617c.mo11094e(kVar, aKUser.f7606c);
            kVar.mo25077w("customdata");
            this.f7617c.mo11094e(kVar, aKUser.f7607d);
            kVar.mo25077w("ext");
            this.f7618d.mo11094e(kVar, aKUser.f7609f);
            kVar.mo25077w("geo");
            this.f7619e.mo11094e(kVar, aKUser.f7608e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(28, "AKUser");
    }
}
