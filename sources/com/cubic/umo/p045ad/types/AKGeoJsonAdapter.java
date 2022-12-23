package com.cubic.umo.p045ad.types;

import com.appsflyer.ServerParameters;
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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKGeoJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKGeo;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKGeoJsonAdapter */
public final class AKGeoJsonAdapter extends C8011k<AKGeo> {

    /* renamed from: a */
    public final JsonReader.C7986a f7512a = JsonReader.C7986a.m18216a(ServerParameters.LAT_KEY, ServerParameters.LON_KEY, "utcoffset", ServerParameters.COUNTRY, "region", "city", "zip", "ext");

    /* renamed from: b */
    public final C8011k<String> f7513b;

    /* renamed from: c */
    public final C8011k<AKDeviceGeoExt> f7514c;

    /* renamed from: d */
    public volatile Constructor<AKGeo> f7515d;

    public AKGeoJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7513b = C18201b.m44910D(oVar, String.class, ServerParameters.LAT_KEY);
        this.f7514c = C18201b.m44910D(oVar, AKDeviceGeoExt.class, "ext");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKDeviceGeoExt aKDeviceGeoExt;
        AKGeo aKGeo;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        int i = -1;
        AKDeviceGeoExt aKDeviceGeoExt2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7512a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7513b.mo11093a(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.f7513b.mo11093a(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.f7513b.mo11093a(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str4 = this.f7513b.mo11093a(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str5 = this.f7513b.mo11093a(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str6 = this.f7513b.mo11093a(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str7 = this.f7513b.mo11093a(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    aKDeviceGeoExt2 = this.f7514c.mo11093a(jsonReader2);
                    z = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        if (i == -128) {
            aKDeviceGeoExt = aKDeviceGeoExt2;
            aKGeo = new AKGeo(str, str2, str3, str4, str5, str6, str7);
        } else {
            aKDeviceGeoExt = aKDeviceGeoExt2;
            Constructor<AKGeo> constructor = this.f7515d;
            if (constructor == null) {
                constructor = AKGeo.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, cls, Integer.TYPE, C12977b.f32133c});
                this.f7515d = constructor;
                C24362h.m61210e(constructor, "AKGeo::class.java.getDec…his.constructorRef = it }");
            }
            AKGeo newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, str6, str7, Integer.valueOf(i), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKGeo = newInstance;
        }
        if (z) {
            aKGeo.f7511h = aKDeviceGeoExt;
        }
        return aKGeo;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKGeo aKGeo = (AKGeo) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKGeo != null) {
            kVar.mo25074i();
            kVar.mo25077w(ServerParameters.LAT_KEY);
            this.f7513b.mo11094e(kVar, aKGeo.f7504a);
            kVar.mo25077w(ServerParameters.LON_KEY);
            this.f7513b.mo11094e(kVar, aKGeo.f7505b);
            kVar.mo25077w("utcoffset");
            this.f7513b.mo11094e(kVar, aKGeo.f7506c);
            kVar.mo25077w(ServerParameters.COUNTRY);
            this.f7513b.mo11094e(kVar, aKGeo.f7507d);
            kVar.mo25077w("region");
            this.f7513b.mo11094e(kVar, aKGeo.f7508e);
            kVar.mo25077w("city");
            this.f7513b.mo11094e(kVar, aKGeo.f7509f);
            kVar.mo25077w("zip");
            this.f7513b.mo11094e(kVar, aKGeo.f7510g);
            kVar.mo25077w("ext");
            this.f7514c.mo11094e(kVar, aKGeo.f7511h);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(27, "AKGeo");
    }
}
