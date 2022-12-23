package com.cubic.umo.p045ad.types;

import bf0.C21050d;
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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVideoJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVideo;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVideoJsonAdapter */
public final class AKVideoJsonAdapter extends C8011k<AKVideo> {

    /* renamed from: a */
    public final JsonReader.C7986a f7714a = JsonReader.C7986a.m18216a("mimes", "minduration", "maxduration", "protocols", "w", "h", "startdelay", "placement", "linearity", "skip", "skipmin", "skipafter", "sequence", "battr", "maxextended", "minbitrate", "maxbitrate", "boxingallowed", "playbackmethod", "playbackend", "delivery", "pos", "api", "id", "ext");

    /* renamed from: b */
    public final C8011k<List<String>> f7715b;

    /* renamed from: c */
    public final C8011k<Integer> f7716c;

    /* renamed from: d */
    public final C8011k<List<Integer>> f7717d;

    /* renamed from: e */
    public final C8011k<String> f7718e;

    /* renamed from: f */
    public final C8011k<AKImpVideoOrBannerExt> f7719f;

    /* renamed from: g */
    public volatile Constructor<AKVideo> f7720g;

    public AKVideoJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7715b = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, cls), "mimes");
        this.f7716c = C18201b.m44910D(oVar2, Integer.TYPE, "minduration");
        this.f7717d = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, Integer.class), "protocols");
        this.f7718e = C18201b.m44910D(oVar2, cls, "id");
        this.f7719f = C18201b.m44910D(oVar2, AKImpVideoOrBannerExt.class, "ext");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        AKVideo aKVideo;
        int i;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo24995i();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer num7 = num6;
        Integer num8 = num7;
        Integer num9 = num8;
        Integer num10 = num9;
        Integer num11 = num10;
        Integer num12 = num11;
        Integer num13 = num12;
        Integer num14 = num13;
        Integer num15 = num14;
        Integer num16 = num15;
        Integer num17 = num16;
        int i2 = -1;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str = null;
        boolean z = false;
        AKImpVideoOrBannerExt aKImpVideoOrBannerExt = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7714a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    continue;
                case 0:
                    list = this.f7715b.mo11093a(jsonReader2);
                    i = -2;
                    break;
                case 1:
                    Integer a = this.f7716c.mo11093a(jsonReader2);
                    if (a != null) {
                        num17 = a;
                        i = -3;
                        break;
                    } else {
                        throw C12977b.m32860m("minduration", "minduration", jsonReader2);
                    }
                case 2:
                    Integer a2 = this.f7716c.mo11093a(jsonReader2);
                    if (a2 != null) {
                        num16 = a2;
                        i = -5;
                        break;
                    } else {
                        throw C12977b.m32860m("maxduration", "maxduration", jsonReader2);
                    }
                case 3:
                    list2 = this.f7717d.mo11093a(jsonReader2);
                    i = -9;
                    break;
                case 4:
                    Integer a3 = this.f7716c.mo11093a(jsonReader2);
                    if (a3 != null) {
                        num15 = a3;
                        i = -17;
                        break;
                    } else {
                        throw C12977b.m32860m("w", "w", jsonReader2);
                    }
                case 5:
                    Integer a4 = this.f7716c.mo11093a(jsonReader2);
                    if (a4 != null) {
                        num14 = a4;
                        i = -33;
                        break;
                    } else {
                        throw C12977b.m32860m("h", "h", jsonReader2);
                    }
                case 6:
                    Integer a5 = this.f7716c.mo11093a(jsonReader2);
                    if (a5 != null) {
                        num13 = a5;
                        i = -65;
                        break;
                    } else {
                        throw C12977b.m32860m("startdelay", "startdelay", jsonReader2);
                    }
                case 7:
                    Integer a6 = this.f7716c.mo11093a(jsonReader2);
                    if (a6 != null) {
                        num12 = a6;
                        i = -129;
                        break;
                    } else {
                        throw C12977b.m32860m("placement", "placement", jsonReader2);
                    }
                case 8:
                    Integer a7 = this.f7716c.mo11093a(jsonReader2);
                    if (a7 != null) {
                        num11 = a7;
                        i = -257;
                        break;
                    } else {
                        throw C12977b.m32860m("linearity", "linearity", jsonReader2);
                    }
                case 9:
                    Integer a8 = this.f7716c.mo11093a(jsonReader2);
                    if (a8 != null) {
                        num10 = a8;
                        i = -513;
                        break;
                    } else {
                        throw C12977b.m32860m("skip", "skip", jsonReader2);
                    }
                case 10:
                    Integer a9 = this.f7716c.mo11093a(jsonReader2);
                    if (a9 != null) {
                        num9 = a9;
                        i = -1025;
                        break;
                    } else {
                        throw C12977b.m32860m("skipmin", "skipmin", jsonReader2);
                    }
                case 11:
                    Integer a11 = this.f7716c.mo11093a(jsonReader2);
                    if (a11 != null) {
                        num8 = a11;
                        i = -2049;
                        break;
                    } else {
                        throw C12977b.m32860m("skipafter", "skipafter", jsonReader2);
                    }
                case 12:
                    Integer a12 = this.f7716c.mo11093a(jsonReader2);
                    if (a12 != null) {
                        num7 = a12;
                        i = -4097;
                        break;
                    } else {
                        throw C12977b.m32860m("sequence", "sequence", jsonReader2);
                    }
                case 13:
                    list3 = this.f7717d.mo11093a(jsonReader2);
                    i = -8193;
                    break;
                case 14:
                    Integer a13 = this.f7716c.mo11093a(jsonReader2);
                    if (a13 != null) {
                        num6 = a13;
                        i = -16385;
                        break;
                    } else {
                        throw C12977b.m32860m("maxextended", "maxextended", jsonReader2);
                    }
                case 15:
                    Integer a14 = this.f7716c.mo11093a(jsonReader2);
                    if (a14 != null) {
                        num5 = a14;
                        i = -32769;
                        break;
                    } else {
                        throw C12977b.m32860m("minbitrate", "minbitrate", jsonReader2);
                    }
                case 16:
                    Integer a15 = this.f7716c.mo11093a(jsonReader2);
                    if (a15 != null) {
                        num4 = a15;
                        i = -65537;
                        break;
                    } else {
                        throw C12977b.m32860m("maxbitrate", "maxbitrate", jsonReader2);
                    }
                case 17:
                    Integer a16 = this.f7716c.mo11093a(jsonReader2);
                    if (a16 != null) {
                        num3 = a16;
                        i = -131073;
                        break;
                    } else {
                        throw C12977b.m32860m("boxingallowed", "boxingallowed", jsonReader2);
                    }
                case 18:
                    list4 = this.f7717d.mo11093a(jsonReader2);
                    i = -262145;
                    break;
                case 19:
                    Integer a17 = this.f7716c.mo11093a(jsonReader2);
                    if (a17 != null) {
                        num2 = a17;
                        i = -524289;
                        break;
                    } else {
                        throw C12977b.m32860m("playbackend", "playbackend", jsonReader2);
                    }
                case 20:
                    list5 = this.f7717d.mo11093a(jsonReader2);
                    i = -1048577;
                    break;
                case 21:
                    num = this.f7716c.mo11093a(jsonReader2);
                    if (num != null) {
                        i = -2097153;
                        break;
                    } else {
                        throw C12977b.m32860m("pos", "pos", jsonReader2);
                    }
                case 22:
                    list6 = this.f7717d.mo11093a(jsonReader2);
                    i = -4194305;
                    break;
                case 23:
                    str = this.f7718e.mo11093a(jsonReader2);
                    if (str != null) {
                        i = -8388609;
                        break;
                    } else {
                        throw C12977b.m32860m("id", "id", jsonReader2);
                    }
                case 24:
                    aKImpVideoOrBannerExt = this.f7719f.mo11093a(jsonReader2);
                    z = true;
                    continue;
            }
            i2 &= i;
        }
        jsonReader.mo24997r();
        if (i2 == -16777216) {
            int intValue = num17.intValue();
            int intValue2 = num16.intValue();
            int intValue3 = num15.intValue();
            int intValue4 = num14.intValue();
            int intValue5 = num13.intValue();
            int intValue6 = num12.intValue();
            int intValue7 = num11.intValue();
            int intValue8 = num10.intValue();
            int intValue9 = num9.intValue();
            int intValue10 = num8.intValue();
            int intValue11 = num7.intValue();
            int intValue12 = num6.intValue();
            int intValue13 = num5.intValue();
            int intValue14 = num4.intValue();
            int intValue15 = num3.intValue();
            int intValue16 = num2.intValue();
            int intValue17 = num.intValue();
            if (str != null) {
                aKVideo = new AKVideo(list, intValue, intValue2, list2, intValue3, intValue4, intValue5, intValue6, intValue7, intValue8, intValue9, intValue10, intValue11, list3, intValue12, intValue13, intValue14, intValue15, list4, intValue16, list5, intValue17, list6, str);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            Constructor<AKVideo> constructor = this.f7720g;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                constructor = AKVideo.class.getDeclaredConstructor(new Class[]{List.class, cls, cls, List.class, cls, cls, cls, cls, cls, cls, cls, cls, cls, List.class, cls, cls, cls, cls, List.class, cls, List.class, cls, List.class, String.class, cls, C12977b.f32133c});
                this.f7720g = constructor;
                C21050d dVar = C21050d.f52856a;
                C24362h.m61210e(constructor, "AKVideo::class.java.getD…his.constructorRef = it }");
            }
            AKVideo newInstance = constructor.newInstance(new Object[]{list, num17, num16, list2, num15, num14, num13, num12, num11, num10, num9, num8, num7, list3, num6, num5, num4, num3, list4, num2, list5, num, list6, str, Integer.valueOf(i2), null});
            C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            aKVideo = newInstance;
        }
        if (z) {
            aKVideo.f7713y = aKImpVideoOrBannerExt;
        }
        return aKVideo;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVideo aKVideo = (AKVideo) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVideo != null) {
            kVar.mo25074i();
            kVar.mo25077w("mimes");
            this.f7715b.mo11094e(kVar, aKVideo.f7689a);
            kVar.mo25077w("minduration");
            C17875h.m44296W(aKVideo.f7690b, this.f7716c, kVar, "maxduration");
            C17875h.m44296W(aKVideo.f7691c, this.f7716c, kVar, "protocols");
            this.f7717d.mo11094e(kVar, aKVideo.f7692d);
            kVar.mo25077w("w");
            C17875h.m44296W(aKVideo.f7693e, this.f7716c, kVar, "h");
            C17875h.m44296W(aKVideo.f7694f, this.f7716c, kVar, "startdelay");
            C17875h.m44296W(aKVideo.f7695g, this.f7716c, kVar, "placement");
            C17875h.m44296W(aKVideo.f7696h, this.f7716c, kVar, "linearity");
            C17875h.m44296W(aKVideo.f7697i, this.f7716c, kVar, "skip");
            C17875h.m44296W(aKVideo.f7698j, this.f7716c, kVar, "skipmin");
            C17875h.m44296W(aKVideo.f7699k, this.f7716c, kVar, "skipafter");
            C17875h.m44296W(aKVideo.f7700l, this.f7716c, kVar, "sequence");
            C17875h.m44296W(aKVideo.f7701m, this.f7716c, kVar, "battr");
            this.f7717d.mo11094e(kVar, aKVideo.f7702n);
            kVar.mo25077w("maxextended");
            C17875h.m44296W(aKVideo.f7703o, this.f7716c, kVar, "minbitrate");
            C17875h.m44296W(aKVideo.f7704p, this.f7716c, kVar, "maxbitrate");
            C17875h.m44296W(aKVideo.f7705q, this.f7716c, kVar, "boxingallowed");
            C17875h.m44296W(aKVideo.f7706r, this.f7716c, kVar, "playbackmethod");
            this.f7717d.mo11094e(kVar, aKVideo.f7707s);
            kVar.mo25077w("playbackend");
            C17875h.m44296W(aKVideo.f7708t, this.f7716c, kVar, "delivery");
            this.f7717d.mo11094e(kVar, aKVideo.f7709u);
            kVar.mo25077w("pos");
            C17875h.m44296W(aKVideo.f7710v, this.f7716c, kVar, "api");
            this.f7717d.mo11094e(kVar, aKVideo.f7711w);
            kVar.mo25077w("id");
            this.f7718e.mo11094e(kVar, aKVideo.f7712x);
            kVar.mo25077w("ext");
            this.f7719f.mo11094e(kVar, aKVideo.f7713y);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(29, "AKVideo");
    }
}
