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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKUmoVideoAdUIConfigJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKUmoVideoAdUIConfig;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKUmoVideoAdUIConfigJsonAdapter */
public final class AKUmoVideoAdUIConfigJsonAdapter extends C8011k<AKUmoVideoAdUIConfig> {

    /* renamed from: a */
    public final JsonReader.C7986a f7601a = JsonReader.C7986a.m18216a("playicon_url", "addetails_border_width", "addetails_border_color", "addetails_bg_color", "title_font_size", "title_font_weight", "title_color", "desc_font_size", "desc_font_weight", "desc_color", "displayurl_font_size", "displayurl_font_weight", "displayurl_color", "cta_button_border_width", "cta_button_border_color", "cta_button_bg_color", "cta_font_size", "cta_font_weight", "cta_color");

    /* renamed from: b */
    public final C8011k<String> f7602b;

    /* renamed from: c */
    public volatile Constructor<AKUmoVideoAdUIConfig> f7603c;

    public AKUmoVideoAdUIConfigJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        C24362h.m61211f(oVar2, "moshi");
        this.f7602b = C18201b.m44910D(oVar2, String.class, "playIconUrl");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
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
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7601a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    continue;
                case 0:
                    str = this.f7602b.mo11093a(jsonReader2);
                    i = -2;
                    break;
                case 1:
                    str2 = this.f7602b.mo11093a(jsonReader2);
                    i = -3;
                    break;
                case 2:
                    str3 = this.f7602b.mo11093a(jsonReader2);
                    i = -5;
                    break;
                case 3:
                    str4 = this.f7602b.mo11093a(jsonReader2);
                    i = -9;
                    break;
                case 4:
                    str5 = this.f7602b.mo11093a(jsonReader2);
                    i = -17;
                    break;
                case 5:
                    str6 = this.f7602b.mo11093a(jsonReader2);
                    i = -33;
                    break;
                case 6:
                    str7 = this.f7602b.mo11093a(jsonReader2);
                    i = -65;
                    break;
                case 7:
                    str8 = this.f7602b.mo11093a(jsonReader2);
                    i = -129;
                    break;
                case 8:
                    str9 = this.f7602b.mo11093a(jsonReader2);
                    i = -257;
                    break;
                case 9:
                    str10 = this.f7602b.mo11093a(jsonReader2);
                    i = -513;
                    break;
                case 10:
                    str11 = this.f7602b.mo11093a(jsonReader2);
                    i = -1025;
                    break;
                case 11:
                    str12 = this.f7602b.mo11093a(jsonReader2);
                    i = -2049;
                    break;
                case 12:
                    str13 = this.f7602b.mo11093a(jsonReader2);
                    i = -4097;
                    break;
                case 13:
                    str14 = this.f7602b.mo11093a(jsonReader2);
                    i = -8193;
                    break;
                case 14:
                    str15 = this.f7602b.mo11093a(jsonReader2);
                    i = -16385;
                    break;
                case 15:
                    str16 = this.f7602b.mo11093a(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    str17 = this.f7602b.mo11093a(jsonReader2);
                    i = -65537;
                    break;
                case 17:
                    str18 = this.f7602b.mo11093a(jsonReader2);
                    i = -131073;
                    break;
                case 18:
                    str19 = this.f7602b.mo11093a(jsonReader2);
                    i = -262145;
                    break;
            }
            i2 &= i;
        }
        jsonReader.mo24997r();
        if (i2 == -524288) {
            return new AKUmoVideoAdUIConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
        }
        Constructor<AKUmoVideoAdUIConfig> constructor = this.f7603c;
        if (constructor == null) {
            constructor = AKUmoVideoAdUIConfig.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls, Integer.TYPE, C12977b.f32133c});
            this.f7603c = constructor;
            C24362h.m61210e(constructor, "AKUmoVideoAdUIConfig::cl…his.constructorRef = it }");
        }
        AKUmoVideoAdUIConfig newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(i2), null});
        C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig = (AKUmoVideoAdUIConfig) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKUmoVideoAdUIConfig != null) {
            kVar.mo25074i();
            kVar.mo25077w("playicon_url");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getPlayIconUrl());
            kVar.mo25077w("addetails_border_width");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getAdDetailsBorderWidth());
            kVar.mo25077w("addetails_border_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getAdDetailsBorderColor());
            kVar.mo25077w("addetails_bg_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getAdDetailsBgColor());
            kVar.mo25077w("title_font_size");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getTitleFontSize());
            kVar.mo25077w("title_font_weight");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getTitleFontWeight());
            kVar.mo25077w("title_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getTitleColor());
            kVar.mo25077w("desc_font_size");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getDescFontSize());
            kVar.mo25077w("desc_font_weight");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getDescFontWeight());
            kVar.mo25077w("desc_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getDescColor());
            kVar.mo25077w("displayurl_font_size");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getDisplayUrlFontSize());
            kVar.mo25077w("displayurl_font_weight");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getDisplayUrlFontWeight());
            kVar.mo25077w("displayurl_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getDisplayUrlColor());
            kVar.mo25077w("cta_button_border_width");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getCtaButtonBorderWidth());
            kVar.mo25077w("cta_button_border_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getCtaButtonBorderColor());
            kVar.mo25077w("cta_button_bg_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getCtaButtonBgColor());
            kVar.mo25077w("cta_font_size");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getCtaFontSize());
            kVar.mo25077w("cta_font_weight");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getCtaFontWeight());
            kVar.mo25077w("cta_color");
            this.f7602b.mo11094e(kVar, aKUmoVideoAdUIConfig.getCtaColor());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(42, "AKUmoVideoAdUIConfig");
    }
}
