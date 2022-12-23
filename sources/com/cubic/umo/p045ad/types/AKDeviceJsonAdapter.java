package com.cubic.umo.p045ad.types;

import bf0.C21050d;
import com.appsflyer.ServerParameters;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p583jk.C17875h;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKDeviceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKDevice;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKDeviceJsonAdapter */
public final class AKDeviceJsonAdapter extends C8011k<AKDevice> {

    /* renamed from: a */
    public final JsonReader.C7986a f7485a = JsonReader.C7986a.m18216a("ua", "dnt", "lmt", "ip", "ipv6", "devicetype", "make", ServerParameters.MODEL, "os", "osv", "hwv", "h", "w", "ppi", "pxratio", "js", "geofetch", "flashver", "language", ServerParameters.CARRIER, "mccmnc", "connectiontype", GetBrowserSessionContextCommand.KEY_IFA, "didsha1", "didmd5", "dpidsha1", "dpidmd5", "macsha1", "macmd5", "ext", "geo");

    /* renamed from: b */
    public final C8011k<String> f7486b;

    /* renamed from: c */
    public final C8011k<Integer> f7487c;

    /* renamed from: d */
    public final C8011k<Float> f7488d;

    /* renamed from: e */
    public final C8011k<String> f7489e;

    /* renamed from: f */
    public final C8011k<AKExt> f7490f;

    /* renamed from: g */
    public final C8011k<AKGeo> f7491g;

    /* renamed from: h */
    public volatile Constructor<AKDevice> f7492h;

    public AKDeviceJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7486b = C18201b.m44910D(oVar2, cls, "ua");
        this.f7487c = C18201b.m44910D(oVar2, Integer.TYPE, "dnt");
        this.f7488d = C18201b.m44910D(oVar2, Float.TYPE, "pxratio");
        this.f7489e = C18201b.m44910D(oVar2, cls, "didsha1");
        this.f7490f = C18201b.m44910D(oVar2, AKExt.class, "ext");
        this.f7491g = C18201b.m44910D(oVar2, AKGeo.class, "geo");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKDevice aKDevice;
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        jsonReader.mo24995i();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer num7 = num6;
        Integer num8 = num7;
        Float f = valueOf;
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        boolean z = false;
        AKGeo aKGeo = null;
        boolean z2 = false;
        AKExt aKExt = null;
        Integer num9 = num8;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7485a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    continue;
                case 0:
                    str = this.f7486b.mo11093a(jsonReader2);
                    if (str != null) {
                        i = -2;
                        break;
                    } else {
                        throw C12977b.m32860m("ua", "ua", jsonReader2);
                    }
                case 1:
                    num = this.f7487c.mo11093a(jsonReader2);
                    if (num != null) {
                        i = -3;
                        break;
                    } else {
                        throw C12977b.m32860m("dnt", "dnt", jsonReader2);
                    }
                case 2:
                    num9 = this.f7487c.mo11093a(jsonReader2);
                    if (num9 != null) {
                        i = -5;
                        break;
                    } else {
                        throw C12977b.m32860m("lmt", "lmt", jsonReader2);
                    }
                case 3:
                    str2 = this.f7486b.mo11093a(jsonReader2);
                    if (str2 != null) {
                        i = -9;
                        break;
                    } else {
                        throw C12977b.m32860m("ip", "ip", jsonReader2);
                    }
                case 4:
                    str3 = this.f7486b.mo11093a(jsonReader2);
                    if (str3 != null) {
                        i = -17;
                        break;
                    } else {
                        throw C12977b.m32860m("ipv6", "ipv6", jsonReader2);
                    }
                case 5:
                    Integer a = this.f7487c.mo11093a(jsonReader2);
                    if (a != null) {
                        num2 = a;
                        i = -33;
                        break;
                    } else {
                        throw C12977b.m32860m("devicetype", "devicetype", jsonReader2);
                    }
                case 6:
                    str4 = this.f7486b.mo11093a(jsonReader2);
                    if (str4 != null) {
                        i = -65;
                        break;
                    } else {
                        throw C12977b.m32860m("make", "make", jsonReader2);
                    }
                case 7:
                    str5 = this.f7486b.mo11093a(jsonReader2);
                    if (str5 != null) {
                        i = -129;
                        break;
                    } else {
                        throw C12977b.m32860m(ServerParameters.MODEL, ServerParameters.MODEL, jsonReader2);
                    }
                case 8:
                    str6 = this.f7486b.mo11093a(jsonReader2);
                    if (str6 != null) {
                        i = -257;
                        break;
                    } else {
                        throw C12977b.m32860m("os", "os", jsonReader2);
                    }
                case 9:
                    str7 = this.f7486b.mo11093a(jsonReader2);
                    if (str7 != null) {
                        i = -513;
                        break;
                    } else {
                        throw C12977b.m32860m("osv", "osv", jsonReader2);
                    }
                case 10:
                    str8 = this.f7486b.mo11093a(jsonReader2);
                    if (str8 != null) {
                        i = -1025;
                        break;
                    } else {
                        throw C12977b.m32860m("hwv", "hwv", jsonReader2);
                    }
                case 11:
                    Integer a2 = this.f7487c.mo11093a(jsonReader2);
                    if (a2 != null) {
                        num3 = a2;
                        i = -2049;
                        break;
                    } else {
                        throw C12977b.m32860m("h", "h", jsonReader2);
                    }
                case 12:
                    Integer a3 = this.f7487c.mo11093a(jsonReader2);
                    if (a3 != null) {
                        num4 = a3;
                        i = -4097;
                        break;
                    } else {
                        throw C12977b.m32860m("w", "w", jsonReader2);
                    }
                case 13:
                    Integer a4 = this.f7487c.mo11093a(jsonReader2);
                    if (a4 != null) {
                        num5 = a4;
                        i = -8193;
                        break;
                    } else {
                        throw C12977b.m32860m("ppi", "ppi", jsonReader2);
                    }
                case 14:
                    Float a5 = this.f7488d.mo11093a(jsonReader2);
                    if (a5 != null) {
                        f = a5;
                        i = -16385;
                        break;
                    } else {
                        throw C12977b.m32860m("pxratio", "pxratio", jsonReader2);
                    }
                case 15:
                    Integer a6 = this.f7487c.mo11093a(jsonReader2);
                    if (a6 != null) {
                        num6 = a6;
                        i = -32769;
                        break;
                    } else {
                        throw C12977b.m32860m("js", "js", jsonReader2);
                    }
                case 16:
                    Integer a7 = this.f7487c.mo11093a(jsonReader2);
                    if (a7 != null) {
                        num7 = a7;
                        i = -65537;
                        break;
                    } else {
                        throw C12977b.m32860m("geofetch", "geofetch", jsonReader2);
                    }
                case 17:
                    str9 = this.f7486b.mo11093a(jsonReader2);
                    if (str9 != null) {
                        i = -131073;
                        break;
                    } else {
                        throw C12977b.m32860m("flashver", "flashver", jsonReader2);
                    }
                case 18:
                    str10 = this.f7486b.mo11093a(jsonReader2);
                    if (str10 != null) {
                        i = -262145;
                        break;
                    } else {
                        throw C12977b.m32860m("language", "language", jsonReader2);
                    }
                case 19:
                    str11 = this.f7486b.mo11093a(jsonReader2);
                    if (str11 != null) {
                        i = -524289;
                        break;
                    } else {
                        throw C12977b.m32860m(ServerParameters.CARRIER, ServerParameters.CARRIER, jsonReader2);
                    }
                case 20:
                    str12 = this.f7486b.mo11093a(jsonReader2);
                    if (str12 != null) {
                        i = -1048577;
                        break;
                    } else {
                        throw C12977b.m32860m("mccmnc", "mccmnc", jsonReader2);
                    }
                case 21:
                    Integer a8 = this.f7487c.mo11093a(jsonReader2);
                    if (a8 != null) {
                        num8 = a8;
                        i = -2097153;
                        break;
                    } else {
                        throw C12977b.m32860m("connectiontype", "connectiontype", jsonReader2);
                    }
                case 22:
                    str13 = this.f7486b.mo11093a(jsonReader2);
                    if (str13 != null) {
                        i = -4194305;
                        break;
                    } else {
                        throw C12977b.m32860m(GetBrowserSessionContextCommand.KEY_IFA, GetBrowserSessionContextCommand.KEY_IFA, jsonReader2);
                    }
                case 23:
                    str14 = this.f7489e.mo11093a(jsonReader2);
                    i = -8388609;
                    break;
                case 24:
                    str15 = this.f7489e.mo11093a(jsonReader2);
                    i = -16777217;
                    break;
                case 25:
                    str16 = this.f7489e.mo11093a(jsonReader2);
                    i = -33554433;
                    break;
                case 26:
                    str17 = this.f7489e.mo11093a(jsonReader2);
                    i = -67108865;
                    break;
                case 27:
                    str18 = this.f7489e.mo11093a(jsonReader2);
                    i = -134217729;
                    break;
                case 28:
                    str19 = this.f7489e.mo11093a(jsonReader2);
                    i = -268435457;
                    break;
                case 29:
                    aKExt = this.f7490f.mo11093a(jsonReader2);
                    z = true;
                    continue;
                case 30:
                    aKGeo = this.f7491g.mo11093a(jsonReader2);
                    z2 = true;
                    continue;
            }
            i2 &= i;
        }
        jsonReader.mo24997r();
        if (i2 != -536870912) {
            Constructor<AKDevice> constructor = this.f7492h;
            if (constructor == null) {
                Class cls2 = Integer.TYPE;
                constructor = AKDevice.class.getDeclaredConstructor(new Class[]{cls, cls2, cls2, cls, cls, cls2, cls, cls, cls, cls, cls, cls2, cls2, cls2, Float.TYPE, cls2, cls2, cls, cls, cls, cls, cls2, cls, cls, cls, cls, cls, cls, cls, cls2, C12977b.f32133c});
                this.f7492h = constructor;
                C21050d dVar = C21050d.f52856a;
                C24362h.m61210e(constructor, "AKDevice::class.java.get…his.constructorRef = it }");
            }
            AKDevice newInstance = constructor.newInstance(new Object[]{str, num, num9, str2, str3, num2, str4, str5, str6, str7, str8, num3, num4, num5, f, num6, num7, str9, str10, str11, str12, num8, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(i2), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKDevice = newInstance;
        } else if (str != null) {
            int intValue = num.intValue();
            int intValue2 = num9.intValue();
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } else if (str3 != null) {
                int intValue3 = num2.intValue();
                if (str4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } else if (str5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } else if (str6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } else if (str7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } else if (str8 != null) {
                    int intValue4 = num3.intValue();
                    int intValue5 = num4.intValue();
                    int intValue6 = num5.intValue();
                    float floatValue = f.floatValue();
                    int intValue7 = num6.intValue();
                    int intValue8 = num7.intValue();
                    if (str9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    } else if (str10 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    } else if (str11 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    } else if (str12 != null) {
                        int intValue9 = num8.intValue();
                        if (str13 != null) {
                            aKDevice = new AKDevice(str, intValue, intValue2, str2, str3, intValue3, str4, str5, str6, str7, str8, intValue4, intValue5, intValue6, floatValue, intValue7, intValue8, str9, str10, str11, str12, intValue9, str13, str14, str15, str16, str17, str18, str19);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (z) {
            aKDevice.f7453E = aKExt;
        }
        if (z2) {
            aKDevice.f7452D = aKGeo;
        }
        return aKDevice;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKDevice aKDevice = (AKDevice) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKDevice != null) {
            kVar.mo25074i();
            kVar.mo25077w("ua");
            this.f7486b.mo11094e(kVar, aKDevice.f7454a);
            kVar.mo25077w("dnt");
            C17875h.m44296W(aKDevice.f7455b, this.f7487c, kVar, "lmt");
            C17875h.m44296W(aKDevice.f7456c, this.f7487c, kVar, "ip");
            this.f7486b.mo11094e(kVar, aKDevice.f7457d);
            kVar.mo25077w("ipv6");
            this.f7486b.mo11094e(kVar, aKDevice.f7458e);
            kVar.mo25077w("devicetype");
            C17875h.m44296W(aKDevice.f7459f, this.f7487c, kVar, "make");
            this.f7486b.mo11094e(kVar, aKDevice.f7460g);
            kVar.mo25077w(ServerParameters.MODEL);
            this.f7486b.mo11094e(kVar, aKDevice.f7461h);
            kVar.mo25077w("os");
            this.f7486b.mo11094e(kVar, aKDevice.f7462i);
            kVar.mo25077w("osv");
            this.f7486b.mo11094e(kVar, aKDevice.f7463j);
            kVar.mo25077w("hwv");
            this.f7486b.mo11094e(kVar, aKDevice.f7464k);
            kVar.mo25077w("h");
            C17875h.m44296W(aKDevice.f7465l, this.f7487c, kVar, "w");
            C17875h.m44296W(aKDevice.f7466m, this.f7487c, kVar, "ppi");
            C17875h.m44296W(aKDevice.f7467n, this.f7487c, kVar, "pxratio");
            this.f7488d.mo11094e(kVar, Float.valueOf(aKDevice.f7468o));
            kVar.mo25077w("js");
            C17875h.m44296W(aKDevice.f7469p, this.f7487c, kVar, "geofetch");
            C17875h.m44296W(aKDevice.f7470q, this.f7487c, kVar, "flashver");
            this.f7486b.mo11094e(kVar, aKDevice.f7471r);
            kVar.mo25077w("language");
            this.f7486b.mo11094e(kVar, aKDevice.f7472s);
            kVar.mo25077w(ServerParameters.CARRIER);
            this.f7486b.mo11094e(kVar, aKDevice.f7473t);
            kVar.mo25077w("mccmnc");
            this.f7486b.mo11094e(kVar, aKDevice.f7474u);
            kVar.mo25077w("connectiontype");
            C17875h.m44296W(aKDevice.f7475v, this.f7487c, kVar, GetBrowserSessionContextCommand.KEY_IFA);
            this.f7486b.mo11094e(kVar, aKDevice.f7476w);
            kVar.mo25077w("didsha1");
            this.f7489e.mo11094e(kVar, aKDevice.f7477x);
            kVar.mo25077w("didmd5");
            this.f7489e.mo11094e(kVar, aKDevice.f7478y);
            kVar.mo25077w("dpidsha1");
            this.f7489e.mo11094e(kVar, aKDevice.f7479z);
            kVar.mo25077w("dpidmd5");
            this.f7489e.mo11094e(kVar, aKDevice.f7449A);
            kVar.mo25077w("macsha1");
            this.f7489e.mo11094e(kVar, aKDevice.f7450B);
            kVar.mo25077w("macmd5");
            this.f7489e.mo11094e(kVar, aKDevice.f7451C);
            kVar.mo25077w("ext");
            this.f7490f.mo11094e(kVar, aKDevice.f7453E);
            kVar.mo25077w("geo");
            this.f7491g.mo11094e(kVar, aKDevice.f7452D);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(30, "AKDevice");
    }
}
