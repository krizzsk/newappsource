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
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKAppJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKApp;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKAppJsonAdapter */
public final class AKAppJsonAdapter extends C8011k<AKApp> {

    /* renamed from: a */
    public final JsonReader.C7986a f7392a = JsonReader.C7986a.m18216a("name", "bundle", "ver", "domain", "storeurl", "cat", "sectioncat", "pagecat", "privacypolicy", "paid", "keywords", "content", "ext", "publisher");

    /* renamed from: b */
    public final C8011k<String> f7393b;

    /* renamed from: c */
    public final C8011k<String> f7394c;

    /* renamed from: d */
    public final C8011k<List<String>> f7395d;

    /* renamed from: e */
    public final C8011k<Integer> f7396e;

    /* renamed from: f */
    public final C8011k<AKAppContent> f7397f;

    /* renamed from: g */
    public final C8011k<AKExt> f7398g;

    /* renamed from: h */
    public final C8011k<AKAppPublisher> f7399h;

    /* renamed from: i */
    public volatile Constructor<AKApp> f7400i;

    public AKAppJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7393b = C18201b.m44910D(oVar2, cls, "name");
        this.f7394c = C18201b.m44910D(oVar2, cls, "domain");
        this.f7395d = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, cls), "cat");
        this.f7396e = C18201b.m44910D(oVar2, Integer.class, "privacypolicy");
        this.f7397f = C18201b.m44910D(oVar2, AKAppContent.class, "content");
        this.f7398g = C18201b.m44910D(oVar2, AKExt.class, "ext");
        this.f7399h = C18201b.m44910D(oVar2, AKAppPublisher.class, "publisher");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKAppContent aKAppContent;
        AKApp aKApp;
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        int i = -1;
        AKAppContent aKAppContent2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        Integer num = null;
        Integer num2 = null;
        String str6 = null;
        boolean z = false;
        boolean z2 = false;
        AKExt aKExt = null;
        boolean z3 = false;
        AKAppPublisher aKAppPublisher = null;
        while (jsonReader.mo24999v()) {
            AKAppContent aKAppContent3 = aKAppContent2;
            switch (jsonReader2.mo24989O(this.f7392a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7393b.mo11093a(jsonReader2);
                    if (str == null) {
                        throw C12977b.m32860m("name", "name", jsonReader2);
                    }
                    break;
                case 1:
                    str2 = this.f7393b.mo11093a(jsonReader2);
                    if (str2 == null) {
                        throw C12977b.m32860m("bundle", "bundle", jsonReader2);
                    }
                    break;
                case 2:
                    str3 = this.f7393b.mo11093a(jsonReader2);
                    if (str3 == null) {
                        throw C12977b.m32860m("ver", "ver", jsonReader2);
                    }
                    break;
                case 3:
                    str4 = this.f7394c.mo11093a(jsonReader2);
                    break;
                case 4:
                    str5 = this.f7394c.mo11093a(jsonReader2);
                    break;
                case 5:
                    list = this.f7395d.mo11093a(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    list2 = this.f7395d.mo11093a(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    list3 = this.f7395d.mo11093a(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    num = this.f7396e.mo11093a(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    num2 = this.f7396e.mo11093a(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    str6 = this.f7394c.mo11093a(jsonReader2);
                    break;
                case 11:
                    aKAppContent2 = this.f7397f.mo11093a(jsonReader2);
                    z = true;
                    continue;
                case 12:
                    aKExt = this.f7398g.mo11093a(jsonReader2);
                    aKAppContent2 = aKAppContent3;
                    z2 = true;
                    continue;
                case 13:
                    aKAppPublisher = this.f7399h.mo11093a(jsonReader2);
                    aKAppContent2 = aKAppContent3;
                    z3 = true;
                    continue;
            }
            aKAppContent2 = aKAppContent3;
        }
        AKAppContent aKAppContent4 = aKAppContent2;
        jsonReader.mo24997r();
        if (i != -993) {
            aKAppContent = aKAppContent4;
            String str7 = "name";
            Constructor<AKApp> constructor = this.f7400i;
            String str8 = "bundle";
            if (constructor == null) {
                constructor = AKApp.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls2, cls2, cls2, List.class, List.class, List.class, cls, cls, cls2, Integer.TYPE, C12977b.f32133c});
                this.f7400i = constructor;
                C24362h.m61210e(constructor, "AKApp::class.java.getDec…his.constructorRef = it }");
            }
            Object[] objArr = new Object[13];
            if (str != null) {
                objArr[0] = str;
                if (str2 != null) {
                    objArr[1] = str2;
                    if (str3 != null) {
                        objArr[2] = str3;
                        objArr[3] = str4;
                        objArr[4] = str5;
                        objArr[5] = list;
                        objArr[6] = list2;
                        objArr[7] = list3;
                        objArr[8] = num;
                        objArr[9] = num2;
                        objArr[10] = str6;
                        objArr[11] = Integer.valueOf(i);
                        objArr[12] = null;
                        AKApp newInstance = constructor.newInstance(objArr);
                        C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        aKApp = newInstance;
                    } else {
                        throw C12977b.m32854g("ver", "ver", jsonReader2);
                    }
                } else {
                    String str9 = str8;
                    throw C12977b.m32854g(str9, str9, jsonReader2);
                }
            } else {
                String str10 = str7;
                throw C12977b.m32854g(str10, str10, jsonReader2);
            }
        } else if (str == null) {
            throw C12977b.m32854g("name", "name", jsonReader2);
        } else if (str2 == null) {
            throw C12977b.m32854g("bundle", "bundle", jsonReader2);
        } else if (str3 != null) {
            aKApp = new AKApp(str, str2, str3, str4, str5, list, list2, list3, num, num2, str6);
            aKAppContent = aKAppContent4;
        } else {
            throw C12977b.m32854g("ver", "ver", jsonReader2);
        }
        if (z) {
            aKApp.f7355m = aKAppContent;
        }
        if (z2) {
            aKApp.f7356n = aKExt;
        }
        if (z3) {
            aKApp.f7354l = aKAppPublisher;
        }
        return aKApp;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKApp aKApp = (AKApp) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKApp != null) {
            kVar.mo25074i();
            kVar.mo25077w("name");
            this.f7393b.mo11094e(kVar, aKApp.f7343a);
            kVar.mo25077w("bundle");
            this.f7393b.mo11094e(kVar, aKApp.f7344b);
            kVar.mo25077w("ver");
            this.f7393b.mo11094e(kVar, aKApp.f7345c);
            kVar.mo25077w("domain");
            this.f7394c.mo11094e(kVar, aKApp.f7346d);
            kVar.mo25077w("storeurl");
            this.f7394c.mo11094e(kVar, aKApp.f7347e);
            kVar.mo25077w("cat");
            this.f7395d.mo11094e(kVar, aKApp.f7348f);
            kVar.mo25077w("sectioncat");
            this.f7395d.mo11094e(kVar, aKApp.f7349g);
            kVar.mo25077w("pagecat");
            this.f7395d.mo11094e(kVar, aKApp.f7350h);
            kVar.mo25077w("privacypolicy");
            this.f7396e.mo11094e(kVar, aKApp.f7351i);
            kVar.mo25077w("paid");
            this.f7396e.mo11094e(kVar, aKApp.f7352j);
            kVar.mo25077w("keywords");
            this.f7394c.mo11094e(kVar, aKApp.f7353k);
            kVar.mo25077w("content");
            this.f7397f.mo11094e(kVar, aKApp.f7355m);
            kVar.mo25077w("ext");
            this.f7398g.mo11094e(kVar, aKApp.f7356n);
            kVar.mo25077w("publisher");
            this.f7399h.mo11094e(kVar, aKApp.f7354l);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(27, "AKApp");
    }
}
