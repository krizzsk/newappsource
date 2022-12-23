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
import p583jk.C17875h;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKFormatJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKFormat;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKFormatJsonAdapter */
public final class AKFormatJsonAdapter extends C8011k<AKFormat> {

    /* renamed from: a */
    public final JsonReader.C7986a f7500a = JsonReader.C7986a.m18216a("w", "h", "wratio", "hratio", "wmin", "ext");

    /* renamed from: b */
    public final C8011k<Integer> f7501b;

    /* renamed from: c */
    public final C8011k<AKExt> f7502c;

    /* renamed from: d */
    public volatile Constructor<AKFormat> f7503d;

    public AKFormatJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7501b = C18201b.m44910D(oVar, Integer.TYPE, "w");
        this.f7502c = C18201b.m44910D(oVar, AKExt.class, "ext");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKFormat aKFormat;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo24995i();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        int i = -1;
        boolean z = false;
        AKExt aKExt = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7500a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    num5 = this.f7501b.mo11093a(jsonReader2);
                    if (num5 != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C12977b.m32860m("w", "w", jsonReader2);
                    }
                case 1:
                    num4 = this.f7501b.mo11093a(jsonReader2);
                    if (num4 != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C12977b.m32860m("h", "h", jsonReader2);
                    }
                case 2:
                    num3 = this.f7501b.mo11093a(jsonReader2);
                    if (num3 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C12977b.m32860m("wratio", "wratio", jsonReader2);
                    }
                case 3:
                    num2 = this.f7501b.mo11093a(jsonReader2);
                    if (num2 != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C12977b.m32860m("hratio", "hratio", jsonReader2);
                    }
                case 4:
                    num = this.f7501b.mo11093a(jsonReader2);
                    if (num != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C12977b.m32860m("wmin", "wmin", jsonReader2);
                    }
                case 5:
                    aKExt = this.f7502c.mo11093a(jsonReader2);
                    z = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        if (i == -32) {
            aKFormat = new AKFormat(num5.intValue(), num4.intValue(), num3.intValue(), num2.intValue(), num.intValue());
        } else {
            Constructor<AKFormat> constructor = this.f7503d;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                constructor = AKFormat.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, C12977b.f32133c});
                this.f7503d = constructor;
                C24362h.m61210e(constructor, "AKFormat::class.java.get…his.constructorRef = it }");
            }
            AKFormat newInstance = constructor.newInstance(new Object[]{num5, num4, num3, num2, num, Integer.valueOf(i), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKFormat = newInstance;
        }
        if (z) {
            aKFormat.f7499f = aKExt;
        }
        return aKFormat;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKFormat aKFormat = (AKFormat) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKFormat != null) {
            kVar.mo25074i();
            kVar.mo25077w("w");
            C17875h.m44296W(aKFormat.f7494a, this.f7501b, kVar, "h");
            C17875h.m44296W(aKFormat.f7495b, this.f7501b, kVar, "wratio");
            C17875h.m44296W(aKFormat.f7496c, this.f7501b, kVar, "hratio");
            C17875h.m44296W(aKFormat.f7497d, this.f7501b, kVar, "wmin");
            C17875h.m44296W(aKFormat.f7498e, this.f7501b, kVar, "ext");
            this.f7502c.mo11094e(kVar, aKFormat.f7499f);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(30, "AKFormat");
    }
}
