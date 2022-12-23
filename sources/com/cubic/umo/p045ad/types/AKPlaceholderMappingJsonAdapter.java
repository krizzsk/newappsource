package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKPlaceholderMappingJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKPlaceholderMapping;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKPlaceholderMappingJsonAdapter */
public final class AKPlaceholderMappingJsonAdapter extends C8011k<AKPlaceholderMapping> {

    /* renamed from: a */
    public final JsonReader.C7986a f7566a = JsonReader.C7986a.m18216a("banner_type", "placeholder");

    /* renamed from: b */
    public final C8011k<String> f7567b;

    /* renamed from: c */
    public volatile Constructor<AKPlaceholderMapping> f7568c;

    public AKPlaceholderMappingJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7567b = C18201b.m44910D(oVar, String.class, "bannerType");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7566a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7567b.mo11093a(jsonReader);
                i &= -2;
            } else if (O == 1) {
                str2 = this.f7567b.mo11093a(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo24997r();
        if (i == -4) {
            return new AKPlaceholderMapping(str, str2);
        }
        Constructor<AKPlaceholderMapping> constructor = this.f7568c;
        if (constructor == null) {
            constructor = AKPlaceholderMapping.class.getDeclaredConstructor(new Class[]{cls, cls, Integer.TYPE, C12977b.f32133c});
            this.f7568c = constructor;
            C24362h.m61210e(constructor, "AKPlaceholderMapping::cl…his.constructorRef = it }");
        }
        AKPlaceholderMapping newInstance = constructor.newInstance(new Object[]{str, str2, Integer.valueOf(i), null});
        C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKPlaceholderMapping aKPlaceholderMapping = (AKPlaceholderMapping) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKPlaceholderMapping != null) {
            kVar.mo25074i();
            kVar.mo25077w("banner_type");
            this.f7567b.mo11094e(kVar, aKPlaceholderMapping.getBannerType());
            kVar.mo25077w("placeholder");
            this.f7567b.mo11094e(kVar, aKPlaceholderMapping.getPlaceholder());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(42, "AKPlaceholderMapping");
    }
}
