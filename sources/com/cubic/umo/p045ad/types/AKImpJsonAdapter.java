package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;
import p358af.C13437d;
import p583jk.C17875h;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKImpJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKImp;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKImpJsonAdapter */
public final class AKImpJsonAdapter extends C8011k<AKImp> {

    /* renamed from: a */
    public final JsonReader.C7986a f7538a = JsonReader.C7986a.m18216a("id", "displaymanager", "displaymanagerver", "instl", "clickbrowser", "secure", "iframebuster", "banner", "ext", "video");

    /* renamed from: b */
    public final C8011k<String> f7539b;

    /* renamed from: c */
    public final C8011k<Integer> f7540c;

    /* renamed from: d */
    public final C8011k<List<String>> f7541d;

    /* renamed from: e */
    public final C8011k<AKBanner> f7542e;

    /* renamed from: f */
    public final C8011k<AKExt> f7543f;

    /* renamed from: g */
    public final C8011k<AKVideo> f7544g;

    /* renamed from: h */
    public volatile Constructor<AKImp> f7545h;

    public AKImpJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7539b = C18201b.m44910D(oVar, cls, "id");
        this.f7540c = C18201b.m44910D(oVar, Integer.TYPE, "instl");
        this.f7541d = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, cls), "iframebuster");
        this.f7542e = C18201b.m44910D(oVar, AKBanner.class, "banner");
        this.f7543f = C18201b.m44910D(oVar, AKExt.class, "ext");
        this.f7544g = C18201b.m44910D(oVar, AKVideo.class, "video");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKVideo aKVideo;
        AKImp aKImp;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo24995i();
        Integer num2 = num;
        Integer num3 = num2;
        int i = -1;
        AKVideo aKVideo2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        AKExt aKExt = null;
        AKBanner aKBanner = null;
        List list = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7538a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7539b.mo11093a(jsonReader2);
                    if (str != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C12977b.m32860m("id", "id", jsonReader2);
                    }
                case 1:
                    str2 = this.f7539b.mo11093a(jsonReader2);
                    if (str2 != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C12977b.m32860m("displaymanager", "displaymanager", jsonReader2);
                    }
                case 2:
                    str3 = this.f7539b.mo11093a(jsonReader2);
                    if (str3 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C12977b.m32860m("displaymanagerver", "displaymanagerver", jsonReader2);
                    }
                case 3:
                    num = this.f7540c.mo11093a(jsonReader2);
                    if (num != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C12977b.m32860m("instl", "instl", jsonReader2);
                    }
                case 4:
                    num2 = this.f7540c.mo11093a(jsonReader2);
                    if (num2 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C12977b.m32860m("clickbrowser", "clickbrowser", jsonReader2);
                    }
                case 5:
                    num3 = this.f7540c.mo11093a(jsonReader2);
                    if (num3 != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C12977b.m32860m("secure", "secure", jsonReader2);
                    }
                case 6:
                    list = this.f7541d.mo11093a(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    aKBanner = this.f7542e.mo11093a(jsonReader2);
                    z = true;
                    break;
                case 8:
                    aKExt = this.f7543f.mo11093a(jsonReader2);
                    z2 = true;
                    break;
                case 9:
                    aKVideo2 = this.f7544g.mo11093a(jsonReader2);
                    z3 = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        if (i != -128) {
            aKVideo = aKVideo2;
            Constructor<AKImp> constructor = this.f7545h;
            if (constructor == null) {
                Class cls2 = Integer.TYPE;
                constructor = AKImp.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls2, cls2, cls2, List.class, cls2, C12977b.f32133c});
                this.f7545h = constructor;
                C24362h.m61210e(constructor, "AKImp::class.java.getDec…his.constructorRef = it }");
            }
            AKImp newInstance = constructor.newInstance(new Object[]{str, str2, str3, num, num2, num3, list, Integer.valueOf(i), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKImp = newInstance;
        } else if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } else if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } else if (str3 != null) {
            int intValue = num.intValue();
            aKVideo = aKVideo2;
            AKExt aKExt2 = aKExt;
            AKBanner aKBanner2 = aKBanner;
            aKImp = new AKImp(str, str2, str3, intValue, num2.intValue(), num3.intValue(), list);
            aKExt = aKExt2;
            aKBanner = aKBanner2;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (z) {
            aKImp.f7535h = aKBanner;
        }
        if (z2) {
            aKImp.f7537j = aKExt;
        }
        if (z3) {
            aKImp.f7536i = aKVideo;
        }
        return aKImp;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKImp aKImp = (AKImp) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKImp != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f7539b.mo11094e(kVar, aKImp.f7528a);
            kVar.mo25077w("displaymanager");
            this.f7539b.mo11094e(kVar, aKImp.f7529b);
            kVar.mo25077w("displaymanagerver");
            this.f7539b.mo11094e(kVar, aKImp.f7530c);
            kVar.mo25077w("instl");
            C17875h.m44296W(aKImp.f7531d, this.f7540c, kVar, "clickbrowser");
            C17875h.m44296W(aKImp.f7532e, this.f7540c, kVar, "secure");
            C17875h.m44296W(aKImp.f7533f, this.f7540c, kVar, "iframebuster");
            this.f7541d.mo11094e(kVar, aKImp.f7534g);
            kVar.mo25077w("banner");
            this.f7542e.mo11094e(kVar, aKImp.f7535h);
            kVar.mo25077w("ext");
            this.f7543f.mo11094e(kVar, aKImp.f7537j);
            kVar.mo25077w("video");
            this.f7544g.mo11094e(kVar, aKImp.f7536i);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(27, "AKImp");
    }
}
