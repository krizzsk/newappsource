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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKBannerJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKBanner;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKBannerJsonAdapter */
public final class AKBannerJsonAdapter extends C8011k<AKBanner> {

    /* renamed from: a */
    public final JsonReader.C7986a f7419a = JsonReader.C7986a.m18216a("format", "w", "h", "btype", "battr", "pos", "mimes", "topframe", "expdir", "api", "id", "vcm", "ext");

    /* renamed from: b */
    public final C8011k<List<AKFormat>> f7420b;

    /* renamed from: c */
    public final C8011k<Integer> f7421c;

    /* renamed from: d */
    public final C8011k<List<Integer>> f7422d;

    /* renamed from: e */
    public final C8011k<List<String>> f7423e;

    /* renamed from: f */
    public final C8011k<String> f7424f;

    /* renamed from: g */
    public final C8011k<AKImpVideoOrBannerExt> f7425g;

    /* renamed from: h */
    public volatile Constructor<AKBanner> f7426h;

    public AKBannerJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7420b = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, AKFormat.class), "format");
        this.f7421c = C18201b.m44910D(oVar2, Integer.TYPE, "w");
        this.f7422d = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, Integer.class), "btype");
        this.f7423e = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, cls), "mimes");
        this.f7424f = C18201b.m44910D(oVar2, cls, "id");
        this.f7425g = C18201b.m44910D(oVar2, AKImpVideoOrBannerExt.class, "ext");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKBanner aKBanner;
        int i;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo24995i();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        int i2 = -1;
        List list = null;
        AKImpVideoOrBannerExt aKImpVideoOrBannerExt = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str = null;
        boolean z = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7419a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    continue;
                case 0:
                    list = this.f7420b.mo11093a(jsonReader2);
                    i = -2;
                    break;
                case 1:
                    num4 = this.f7421c.mo11093a(jsonReader2);
                    if (num4 != null) {
                        i = -3;
                        break;
                    } else {
                        throw C12977b.m32860m("w", "w", jsonReader2);
                    }
                case 2:
                    num3 = this.f7421c.mo11093a(jsonReader2);
                    if (num3 != null) {
                        i = -5;
                        break;
                    } else {
                        throw C12977b.m32860m("h", "h", jsonReader2);
                    }
                case 3:
                    list2 = this.f7422d.mo11093a(jsonReader2);
                    i = -9;
                    break;
                case 4:
                    list3 = this.f7422d.mo11093a(jsonReader2);
                    i = -17;
                    break;
                case 5:
                    num2 = this.f7421c.mo11093a(jsonReader2);
                    if (num2 != null) {
                        i = -33;
                        break;
                    } else {
                        throw C12977b.m32860m("pos", "pos", jsonReader2);
                    }
                case 6:
                    list4 = this.f7423e.mo11093a(jsonReader2);
                    i = -65;
                    break;
                case 7:
                    num = this.f7421c.mo11093a(jsonReader2);
                    if (num != null) {
                        i = -129;
                        break;
                    } else {
                        throw C12977b.m32860m("topframe", "topframe", jsonReader2);
                    }
                case 8:
                    list5 = this.f7422d.mo11093a(jsonReader2);
                    i = -257;
                    break;
                case 9:
                    list6 = this.f7422d.mo11093a(jsonReader2);
                    i = -513;
                    break;
                case 10:
                    str = this.f7424f.mo11093a(jsonReader2);
                    if (str != null) {
                        i = -1025;
                        break;
                    } else {
                        throw C12977b.m32860m("id", "id", jsonReader2);
                    }
                case 11:
                    num5 = this.f7421c.mo11093a(jsonReader2);
                    if (num5 != null) {
                        i = -2049;
                        break;
                    } else {
                        throw C12977b.m32860m("vcm", "vcm", jsonReader2);
                    }
                case 12:
                    aKImpVideoOrBannerExt = this.f7425g.mo11093a(jsonReader2);
                    z = true;
                    continue;
            }
            i2 &= i;
        }
        jsonReader.mo24997r();
        if (i2 == -4096) {
            int intValue = num4.intValue();
            int intValue2 = num3.intValue();
            int intValue3 = num2.intValue();
            int intValue4 = num.intValue();
            if (str != null) {
                AKImpVideoOrBannerExt aKImpVideoOrBannerExt2 = aKImpVideoOrBannerExt;
                aKBanner = new AKBanner(list, intValue, intValue2, list2, list3, intValue3, list4, intValue4, list5, list6, str, num5.intValue());
                aKImpVideoOrBannerExt = aKImpVideoOrBannerExt2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            Constructor<AKBanner> constructor = this.f7426h;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                constructor = AKBanner.class.getDeclaredConstructor(new Class[]{List.class, cls, cls, List.class, List.class, cls, List.class, cls, List.class, List.class, String.class, cls, cls, C12977b.f32133c});
                this.f7426h = constructor;
                C24362h.m61210e(constructor, "AKBanner::class.java.get…his.constructorRef = it }");
            }
            AKBanner newInstance = constructor.newInstance(new Object[]{list, num4, num3, list2, list3, num2, list4, num, list5, list6, str, num5, Integer.valueOf(i2), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKBanner = newInstance;
        }
        if (z) {
            aKBanner.f7418m = aKImpVideoOrBannerExt;
        }
        return aKBanner;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKBanner aKBanner = (AKBanner) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKBanner != null) {
            kVar.mo25074i();
            kVar.mo25077w("format");
            this.f7420b.mo11094e(kVar, aKBanner.f7406a);
            kVar.mo25077w("w");
            C17875h.m44296W(aKBanner.f7407b, this.f7421c, kVar, "h");
            C17875h.m44296W(aKBanner.f7408c, this.f7421c, kVar, "btype");
            this.f7422d.mo11094e(kVar, aKBanner.f7409d);
            kVar.mo25077w("battr");
            this.f7422d.mo11094e(kVar, aKBanner.f7410e);
            kVar.mo25077w("pos");
            C17875h.m44296W(aKBanner.f7411f, this.f7421c, kVar, "mimes");
            this.f7423e.mo11094e(kVar, aKBanner.f7412g);
            kVar.mo25077w("topframe");
            C17875h.m44296W(aKBanner.f7413h, this.f7421c, kVar, "expdir");
            this.f7422d.mo11094e(kVar, aKBanner.f7414i);
            kVar.mo25077w("api");
            this.f7422d.mo11094e(kVar, aKBanner.f7415j);
            kVar.mo25077w("id");
            this.f7424f.mo11094e(kVar, aKBanner.f7416k);
            kVar.mo25077w("vcm");
            C17875h.m44296W(aKBanner.f7417l, this.f7421c, kVar, "ext");
            this.f7425g.mo11094e(kVar, aKBanner.f7418m);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(30, "AKBanner");
    }
}
