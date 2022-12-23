package com.cubic.umo.p045ad.types;

import com.appsflyer.ServerParameters;
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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKRequestPayloadJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKRequestPayload;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKRequestPayloadJsonAdapter */
public final class AKRequestPayloadJsonAdapter extends C8011k<AKRequestPayload> {

    /* renamed from: a */
    public final JsonReader.C7986a f7581a = JsonReader.C7986a.m18216a("id", "app", ServerParameters.DEVICE_KEY, "ext", "imp", "user");

    /* renamed from: b */
    public final C8011k<String> f7582b;

    /* renamed from: c */
    public final C8011k<AKApp> f7583c;

    /* renamed from: d */
    public final C8011k<AKDevice> f7584d;

    /* renamed from: e */
    public final C8011k<AKPayloadExt> f7585e;

    /* renamed from: f */
    public final C8011k<List<AKImp>> f7586f;

    /* renamed from: g */
    public final C8011k<AKUser> f7587g;

    /* renamed from: h */
    public volatile Constructor<AKRequestPayload> f7588h;

    public AKRequestPayloadJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7582b = C18201b.m44910D(oVar, String.class, "id");
        this.f7583c = C18201b.m44910D(oVar, AKApp.class, "app");
        this.f7584d = C18201b.m44910D(oVar, AKDevice.class, ServerParameters.DEVICE_KEY);
        this.f7585e = C18201b.m44910D(oVar, AKPayloadExt.class, "ext");
        this.f7586f = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKImp.class), "imp");
        this.f7587g = C18201b.m44910D(oVar, AKUser.class, "user");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKRequestPayload aKRequestPayload;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        int i = -1;
        String str = null;
        boolean z = false;
        AKApp aKApp = null;
        boolean z2 = false;
        AKDevice aKDevice = null;
        boolean z3 = false;
        AKPayloadExt aKPayloadExt = null;
        boolean z4 = false;
        List<AKImp> list = null;
        boolean z5 = false;
        AKUser aKUser = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7581a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7582b.mo11093a(jsonReader2);
                    if (str != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C12977b.m32860m("id", "id", jsonReader2);
                    }
                case 1:
                    aKApp = this.f7583c.mo11093a(jsonReader2);
                    z = true;
                    break;
                case 2:
                    aKDevice = this.f7584d.mo11093a(jsonReader2);
                    z2 = true;
                    break;
                case 3:
                    aKPayloadExt = this.f7585e.mo11093a(jsonReader2);
                    z3 = true;
                    break;
                case 4:
                    list = this.f7586f.mo11093a(jsonReader2);
                    z4 = true;
                    break;
                case 5:
                    aKUser = this.f7587g.mo11093a(jsonReader2);
                    z5 = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        if (i != -2) {
            Constructor<AKRequestPayload> constructor = this.f7588h;
            if (constructor == null) {
                constructor = AKRequestPayload.class.getDeclaredConstructor(new Class[]{String.class, Integer.TYPE, C12977b.f32133c});
                this.f7588h = constructor;
                C24362h.m61210e(constructor, "AKRequestPayload::class.…his.constructorRef = it }");
            }
            AKRequestPayload newInstance = constructor.newInstance(new Object[]{str, Integer.valueOf(i), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKRequestPayload = newInstance;
        } else if (str != null) {
            aKRequestPayload = new AKRequestPayload(str);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (z) {
            aKRequestPayload.f7577c = aKApp;
        }
        if (z2) {
            aKRequestPayload.f7578d = aKDevice;
        }
        if (z3) {
            aKRequestPayload.f7580f = aKPayloadExt;
        }
        if (z4) {
            aKRequestPayload.f7576b = list;
        }
        if (z5) {
            aKRequestPayload.f7579e = aKUser;
        }
        return aKRequestPayload;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKRequestPayload aKRequestPayload = (AKRequestPayload) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKRequestPayload != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f7582b.mo11094e(kVar, aKRequestPayload.f7575a);
            kVar.mo25077w("app");
            this.f7583c.mo11094e(kVar, aKRequestPayload.f7577c);
            kVar.mo25077w(ServerParameters.DEVICE_KEY);
            this.f7584d.mo11094e(kVar, aKRequestPayload.f7578d);
            kVar.mo25077w("ext");
            this.f7585e.mo11094e(kVar, aKRequestPayload.f7580f);
            kVar.mo25077w("imp");
            this.f7586f.mo11094e(kVar, aKRequestPayload.f7576b);
            kVar.mo25077w("user");
            this.f7587g.mo11094e(kVar, aKRequestPayload.f7579e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(38, "AKRequestPayload");
    }
}
