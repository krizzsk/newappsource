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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKImpVideoOrBannerExtJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKImpVideoOrBannerExt;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKImpVideoOrBannerExtJsonAdapter */
public final class AKImpVideoOrBannerExtJsonAdapter extends C8011k<AKImpVideoOrBannerExt> {

    /* renamed from: a */
    public final JsonReader.C7986a f7549a = JsonReader.C7986a.m18216a("qsparams", "slot", "isstandardtype");

    /* renamed from: b */
    public final C8011k<String> f7550b;

    /* renamed from: c */
    public final C8011k<String> f7551c;

    /* renamed from: d */
    public final C8011k<Boolean> f7552d;

    /* renamed from: e */
    public volatile Constructor<AKImpVideoOrBannerExt> f7553e;

    public AKImpVideoOrBannerExtJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7550b = C18201b.m44910D(oVar, cls, "qsparams");
        this.f7551c = C18201b.m44910D(oVar, cls, "slot");
        this.f7552d = C18201b.m44910D(oVar, Boolean.class, "isstandardtype");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7549a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7550b.mo11093a(jsonReader);
                if (str == null) {
                    throw C12977b.m32860m("qsparams", "qsparams", jsonReader);
                }
            } else if (O == 1) {
                str2 = this.f7551c.mo11093a(jsonReader);
                i &= -3;
            } else if (O == 2) {
                bool = this.f7552d.mo11093a(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo24997r();
        if (i != -7) {
            Constructor<AKImpVideoOrBannerExt> constructor = this.f7553e;
            if (constructor == null) {
                constructor = AKImpVideoOrBannerExt.class.getDeclaredConstructor(new Class[]{cls, cls, Boolean.class, Integer.TYPE, C12977b.f32133c});
                this.f7553e = constructor;
                C24362h.m61210e(constructor, "AKImpVideoOrBannerExt::c…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (str != null) {
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = bool;
                objArr[3] = Integer.valueOf(i);
                objArr[4] = null;
                AKImpVideoOrBannerExt newInstance = constructor.newInstance(objArr);
                C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C12977b.m32854g("qsparams", "qsparams", jsonReader);
        } else if (str != null) {
            return new AKImpVideoOrBannerExt(str, str2, bool);
        } else {
            throw C12977b.m32854g("qsparams", "qsparams", jsonReader);
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKImpVideoOrBannerExt aKImpVideoOrBannerExt = (AKImpVideoOrBannerExt) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKImpVideoOrBannerExt != null) {
            kVar.mo25074i();
            kVar.mo25077w("qsparams");
            this.f7550b.mo11094e(kVar, aKImpVideoOrBannerExt.f7546a);
            kVar.mo25077w("slot");
            this.f7551c.mo11094e(kVar, aKImpVideoOrBannerExt.f7547b);
            kVar.mo25077w("isstandardtype");
            this.f7552d.mo11094e(kVar, aKImpVideoOrBannerExt.f7548c);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(43, "AKImpVideoOrBannerExt");
    }
}
