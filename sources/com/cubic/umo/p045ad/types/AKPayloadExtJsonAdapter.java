package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p001a0.C0017h;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKPayloadExtJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKPayloadExt;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKPayloadExtJsonAdapter */
public final class AKPayloadExtJsonAdapter extends C8011k<AKPayloadExt> {

    /* renamed from: a */
    public final JsonReader.C7986a f7561a = JsonReader.C7986a.m18216a("publisherid", "adkitversion", "tsadkitversion", "isprefetch", "gdpr");

    /* renamed from: b */
    public final C8011k<String> f7562b;

    /* renamed from: c */
    public final C8011k<Boolean> f7563c;

    /* renamed from: d */
    public final C8011k<Integer> f7564d;

    /* renamed from: e */
    public volatile Constructor<AKPayloadExt> f7565e;

    public AKPayloadExtJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7562b = C18201b.m44910D(oVar, String.class, "publisherid");
        this.f7563c = C18201b.m44910D(oVar, Boolean.TYPE, "isprefetch");
        this.f7564d = C18201b.m44910D(oVar, Integer.class, "gdpr");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo24995i();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader2.mo24989O(this.f7561a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f7562b.mo11093a(jsonReader2);
                if (str != null) {
                    i &= -2;
                } else {
                    throw C12977b.m32860m("publisherid", "publisherid", jsonReader2);
                }
            } else if (O == 1) {
                str2 = this.f7562b.mo11093a(jsonReader2);
                if (str2 != null) {
                    i &= -3;
                } else {
                    throw C12977b.m32860m("adkitversion", "adkitversion", jsonReader2);
                }
            } else if (O == 2) {
                str3 = this.f7562b.mo11093a(jsonReader2);
                if (str3 != null) {
                    i &= -5;
                } else {
                    throw C12977b.m32860m("tsadkitversion", "tsadkitversion", jsonReader2);
                }
            } else if (O == 3) {
                bool = this.f7563c.mo11093a(jsonReader2);
                if (bool != null) {
                    i &= -9;
                } else {
                    throw C12977b.m32860m("isprefetch", "isprefetch", jsonReader2);
                }
            } else if (O == 4) {
                num = this.f7564d.mo11093a(jsonReader2);
            }
        }
        jsonReader.mo24997r();
        if (i != -16) {
            Constructor<AKPayloadExt> constructor = this.f7565e;
            if (constructor == null) {
                constructor = AKPayloadExt.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Boolean.TYPE, Integer.class, Integer.TYPE, C12977b.f32133c});
                this.f7565e = constructor;
                C24362h.m61210e(constructor, "AKPayloadExt::class.java…his.constructorRef = it }");
            }
            AKPayloadExt newInstance = constructor.newInstance(new Object[]{str, str2, str3, bool, num, Integer.valueOf(i), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        } else if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } else if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } else if (str3 != null) {
            return new AKPayloadExt(str, str2, str3, bool.booleanValue(), num);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKPayloadExt aKPayloadExt = (AKPayloadExt) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKPayloadExt != null) {
            kVar.mo25074i();
            kVar.mo25077w("publisherid");
            this.f7562b.mo11094e(kVar, aKPayloadExt.f7556a);
            kVar.mo25077w("adkitversion");
            this.f7562b.mo11094e(kVar, aKPayloadExt.f7557b);
            kVar.mo25077w("tsadkitversion");
            this.f7562b.mo11094e(kVar, aKPayloadExt.f7558c);
            kVar.mo25077w("isprefetch");
            C0017h.m63T(aKPayloadExt.f7559d, this.f7563c, kVar, "gdpr");
            this.f7564d.mo11094e(kVar, aKPayloadExt.f7560e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(34, "AKPayloadExt");
    }
}
