package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/VisualValidationRequestJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/VisualValidationRequest;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class VisualValidationRequestJsonAdapter extends C8011k<VisualValidationRequest> {

    /* renamed from: a */
    public final JsonReader.C7986a f8299a = JsonReader.C7986a.m18216a("eventId", "when", "deviceId", "qr", "latitude", "longitude");

    /* renamed from: b */
    public final C8011k<String> f8300b;

    /* renamed from: c */
    public final C8011k<Long> f8301c;

    /* renamed from: d */
    public final C8011k<Double> f8302d;

    /* renamed from: e */
    public volatile Constructor<VisualValidationRequest> f8303e;

    public VisualValidationRequestJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8300b = oVar.mo25082c(String.class, emptySet, "eventId");
        this.f8301c = oVar.mo25082c(Long.TYPE, emptySet, "deviceId");
        this.f8302d = oVar.mo25082c(Double.TYPE, emptySet, "latitude");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        Double valueOf = Double.valueOf(0.0d);
        jsonReader.mo24995i();
        Double d = valueOf;
        int i = -1;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            Class<String> cls2 = cls;
            if (jsonReader.mo24999v()) {
                switch (jsonReader2.mo24989O(this.f8299a)) {
                    case -1:
                        jsonReader.mo24991S();
                        jsonReader.mo24992T();
                        break;
                    case 0:
                        str2 = this.f8300b.mo11093a(jsonReader2);
                        if (str2 != null) {
                            break;
                        } else {
                            throw C12977b.m32860m("eventId", "eventId", jsonReader2);
                        }
                    case 1:
                        str3 = this.f8300b.mo11093a(jsonReader2);
                        if (str3 != null) {
                            break;
                        } else {
                            throw C12977b.m32860m("timeStamp", "when", jsonReader2);
                        }
                    case 2:
                        l = this.f8301c.mo11093a(jsonReader2);
                        if (l != null) {
                            break;
                        } else {
                            throw C12977b.m32860m("deviceId", "deviceId", jsonReader2);
                        }
                    case 3:
                        str4 = this.f8300b.mo11093a(jsonReader2);
                        if (str4 != null) {
                            break;
                        } else {
                            throw C12977b.m32860m("qrCode", "qr", jsonReader2);
                        }
                    case 4:
                        Double a = this.f8302d.mo11093a(jsonReader2);
                        if (a != null) {
                            i &= -17;
                            valueOf = a;
                            break;
                        } else {
                            throw C12977b.m32860m("latitude", "latitude", jsonReader2);
                        }
                    case 5:
                        Double a2 = this.f8302d.mo11093a(jsonReader2);
                        if (a2 != null) {
                            i &= -33;
                            d = a2;
                            break;
                        } else {
                            throw C12977b.m32860m("longitude", "longitude", jsonReader2);
                        }
                }
                cls = cls2;
            } else {
                jsonReader.mo24997r();
                if (i != -49) {
                    Constructor<VisualValidationRequest> constructor = this.f8303e;
                    String str5 = "eventId";
                    if (constructor == null) {
                        str = "when";
                        Class cls3 = Double.TYPE;
                        constructor = VisualValidationRequest.class.getDeclaredConstructor(new Class[]{cls2, cls2, Long.TYPE, cls2, cls3, cls3, Integer.TYPE, C12977b.f32133c});
                        this.f8303e = constructor;
                        C24362h.m61210e(constructor, "VisualValidationRequest:…his.constructorRef = it }");
                    } else {
                        str = "when";
                    }
                    Object[] objArr = new Object[8];
                    if (str2 != null) {
                        objArr[0] = str2;
                        if (str3 != null) {
                            objArr[1] = str3;
                            if (l != null) {
                                objArr[2] = Long.valueOf(l.longValue());
                                if (str4 != null) {
                                    objArr[3] = str4;
                                    objArr[4] = valueOf;
                                    objArr[5] = d;
                                    objArr[6] = Integer.valueOf(i);
                                    objArr[7] = null;
                                    VisualValidationRequest newInstance = constructor.newInstance(objArr);
                                    C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                    return newInstance;
                                }
                                throw C12977b.m32854g("qrCode", "qr", jsonReader2);
                            }
                            throw C12977b.m32854g("deviceId", "deviceId", jsonReader2);
                        }
                        throw C12977b.m32854g("timeStamp", str, jsonReader2);
                    }
                    String str6 = str5;
                    throw C12977b.m32854g(str6, str6, jsonReader2);
                } else if (str2 == null) {
                    throw C12977b.m32854g("eventId", "eventId", jsonReader2);
                } else if (str3 == null) {
                    throw C12977b.m32854g("timeStamp", "when", jsonReader2);
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (str4 != null) {
                        return new VisualValidationRequest(str2, str3, longValue, str4, valueOf.doubleValue(), d.doubleValue());
                    }
                    throw C12977b.m32854g("qrCode", "qr", jsonReader2);
                } else {
                    throw C12977b.m32854g("deviceId", "deviceId", jsonReader2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        VisualValidationRequest visualValidationRequest = (VisualValidationRequest) obj;
        C24362h.m61211f(kVar, "writer");
        if (visualValidationRequest != null) {
            kVar.mo25074i();
            kVar.mo25077w("eventId");
            this.f8300b.mo11094e(kVar, visualValidationRequest.f8293a);
            kVar.mo25077w("when");
            this.f8300b.mo11094e(kVar, visualValidationRequest.f8294b);
            kVar.mo25077w("deviceId");
            this.f8301c.mo11094e(kVar, Long.valueOf(visualValidationRequest.f8295c));
            kVar.mo25077w("qr");
            this.f8300b.mo11094e(kVar, visualValidationRequest.f8296d);
            kVar.mo25077w("latitude");
            this.f8302d.mo11094e(kVar, Double.valueOf(visualValidationRequest.f8297e));
            kVar.mo25077w("longitude");
            this.f8302d.mo11094e(kVar, Double.valueOf(visualValidationRequest.f8298f));
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VisualValidationRequest)";
    }
}
