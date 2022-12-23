package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;
import p358af.C13437d;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKPlaceholdersJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKPlaceholders;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKPlaceholdersJsonAdapter */
public final class AKPlaceholdersJsonAdapter extends C8011k<AKPlaceholders> {

    /* renamed from: a */
    public final JsonReader.C7986a f7569a = JsonReader.C7986a.m18216a(MediationMetaData.KEY_VERSION, "package_path", "click_url", "mappings");

    /* renamed from: b */
    public final C8011k<String> f7570b;

    /* renamed from: c */
    public final C8011k<List<AKPlaceholderMapping>> f7571c;

    /* renamed from: d */
    public volatile Constructor<AKPlaceholders> f7572d;

    public AKPlaceholdersJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7570b = C18201b.m44910D(oVar, String.class, MediationMetaData.KEY_VERSION);
        this.f7571c = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKPlaceholderMapping.class), "mappings");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        int i = -1;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7569a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7570b.mo11093a(jsonReader);
                i &= -2;
            } else if (O == 1) {
                str2 = this.f7570b.mo11093a(jsonReader);
                i &= -3;
            } else if (O == 2) {
                str3 = this.f7570b.mo11093a(jsonReader);
                i &= -5;
            } else if (O == 3) {
                list = this.f7571c.mo11093a(jsonReader);
                i &= -9;
            }
        }
        jsonReader.mo24997r();
        if (i == -16) {
            return new AKPlaceholders(str, str2, str3, list);
        }
        Constructor<AKPlaceholders> constructor = this.f7572d;
        if (constructor == null) {
            constructor = AKPlaceholders.class.getDeclaredConstructor(new Class[]{cls, cls, cls, List.class, Integer.TYPE, C12977b.f32133c});
            this.f7572d = constructor;
            C24362h.m61210e(constructor, "AKPlaceholders::class.ja…his.constructorRef = it }");
        }
        AKPlaceholders newInstance = constructor.newInstance(new Object[]{str, str2, str3, list, Integer.valueOf(i), null});
        C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKPlaceholders aKPlaceholders = (AKPlaceholders) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKPlaceholders != null) {
            kVar.mo25074i();
            kVar.mo25077w(MediationMetaData.KEY_VERSION);
            this.f7570b.mo11094e(kVar, aKPlaceholders.getVersion());
            kVar.mo25077w("package_path");
            this.f7570b.mo11094e(kVar, aKPlaceholders.getPackagePath());
            kVar.mo25077w("click_url");
            this.f7570b.mo11094e(kVar, aKPlaceholders.getClickUrl());
            kVar.mo25077w("mappings");
            this.f7571c.mo11094e(kVar, aKPlaceholders.getMappings());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(36, "AKPlaceholders");
    }
}
