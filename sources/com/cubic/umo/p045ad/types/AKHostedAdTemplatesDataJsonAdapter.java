package com.cubic.umo.p045ad.types;

import com.appboy.models.outgoing.TwitterUser;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import p358af.C13437d;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKHostedAdTemplatesDataJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKHostedAdTemplatesData;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKHostedAdTemplatesDataJsonAdapter */
public final class AKHostedAdTemplatesDataJsonAdapter extends C8011k<AKHostedAdTemplatesData> {

    /* renamed from: a */
    public final JsonReader.C7986a f7518a = JsonReader.C7986a.m18216a(MediationMetaData.KEY_VERSION, TwitterUser.DESCRIPTION_KEY, "templates");

    /* renamed from: b */
    public final C8011k<String> f7519b;

    /* renamed from: c */
    public final C8011k<List<AKHostedAdTemplate>> f7520c;

    public AKHostedAdTemplatesDataJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7519b = C18201b.m44910D(oVar, String.class, MediationMetaData.KEY_VERSION);
        this.f7520c = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKHostedAdTemplate.class), "templates");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7518a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7519b.mo11093a(jsonReader);
            } else if (O == 1) {
                str2 = this.f7519b.mo11093a(jsonReader);
            } else if (O == 2) {
                list = this.f7520c.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        return new AKHostedAdTemplatesData(str, str2, list);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKHostedAdTemplatesData aKHostedAdTemplatesData = (AKHostedAdTemplatesData) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKHostedAdTemplatesData != null) {
            kVar.mo25074i();
            kVar.mo25077w(MediationMetaData.KEY_VERSION);
            this.f7519b.mo11094e(kVar, aKHostedAdTemplatesData.getVersion());
            kVar.mo25077w(TwitterUser.DESCRIPTION_KEY);
            this.f7519b.mo11094e(kVar, aKHostedAdTemplatesData.getDescription());
            kVar.mo25077w("templates");
            this.f7520c.mo11094e(kVar, aKHostedAdTemplatesData.getTemplates());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(45, "AKHostedAdTemplatesData");
    }
}
