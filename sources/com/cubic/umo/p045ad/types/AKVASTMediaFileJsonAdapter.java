package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTMediaFileJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTMediaFile;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTMediaFileJsonAdapter */
public final class AKVASTMediaFileJsonAdapter extends C8011k<AKVASTMediaFile> {

    /* renamed from: a */
    public final JsonReader.C7986a f7665a = JsonReader.C7986a.m18216a("apiFramework", "bitrate", "codec", "delivery", "height", "id", "maintainAspectRatio", "maxBitrate", "mediaUrl", "minBitrate", "scalable", "type", "width");

    /* renamed from: b */
    public final C8011k<String> f7666b;

    /* renamed from: c */
    public final C8011k<String> f7667c;

    public AKVASTMediaFileJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7666b = C18201b.m44910D(oVar2, cls, "apiFramework");
        this.f7667c = C18201b.m44910D(oVar2, cls, "mediaUrl");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
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
        boolean z = false;
        while (jsonReader.mo24999v()) {
            String str15 = str14;
            switch (jsonReader2.mo24989O(this.f7665a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str2 = this.f7666b.mo11093a(jsonReader2);
                    if (str2 == null) {
                        throw C12977b.m32860m("apiFramework", "apiFramework", jsonReader2);
                    }
                    break;
                case 1:
                    str3 = this.f7666b.mo11093a(jsonReader2);
                    if (str3 == null) {
                        throw C12977b.m32860m("bitrate", "bitrate", jsonReader2);
                    }
                    break;
                case 2:
                    str4 = this.f7666b.mo11093a(jsonReader2);
                    if (str4 == null) {
                        throw C12977b.m32860m("codec", "codec", jsonReader2);
                    }
                    break;
                case 3:
                    str5 = this.f7666b.mo11093a(jsonReader2);
                    if (str5 == null) {
                        throw C12977b.m32860m("delivery", "delivery", jsonReader2);
                    }
                    break;
                case 4:
                    str6 = this.f7666b.mo11093a(jsonReader2);
                    if (str6 == null) {
                        throw C12977b.m32860m("height", "height", jsonReader2);
                    }
                    break;
                case 5:
                    str7 = this.f7666b.mo11093a(jsonReader2);
                    if (str7 == null) {
                        throw C12977b.m32860m("id", "id", jsonReader2);
                    }
                    break;
                case 6:
                    str8 = this.f7666b.mo11093a(jsonReader2);
                    if (str8 == null) {
                        throw C12977b.m32860m("maintainAspectRatio", "maintainAspectRatio", jsonReader2);
                    }
                    break;
                case 7:
                    str9 = this.f7666b.mo11093a(jsonReader2);
                    if (str9 == null) {
                        throw C12977b.m32860m("maxBitrate", "maxBitrate", jsonReader2);
                    }
                    break;
                case 8:
                    str10 = this.f7667c.mo11093a(jsonReader2);
                    z = true;
                    break;
                case 9:
                    str11 = this.f7666b.mo11093a(jsonReader2);
                    if (str11 == null) {
                        throw C12977b.m32860m("minBitrate", "minBitrate", jsonReader2);
                    }
                    break;
                case 10:
                    str12 = this.f7666b.mo11093a(jsonReader2);
                    if (str12 == null) {
                        throw C12977b.m32860m("scalable", "scalable", jsonReader2);
                    }
                    break;
                case 11:
                    str13 = this.f7666b.mo11093a(jsonReader2);
                    if (str13 == null) {
                        throw C12977b.m32860m("type", "type", jsonReader2);
                    }
                    break;
                case 12:
                    str14 = this.f7666b.mo11093a(jsonReader2);
                    if (str14 != null) {
                        continue;
                    } else {
                        throw C12977b.m32860m("width", "width", jsonReader2);
                    }
            }
            str14 = str15;
        }
        String str16 = str14;
        jsonReader.mo24997r();
        AKVASTMediaFile aKVASTMediaFile = new AKVASTMediaFile();
        if (str2 == null) {
            str2 = aKVASTMediaFile.getApiFramework();
        }
        aKVASTMediaFile.setApiFramework(str2);
        if (str3 == null) {
            str3 = aKVASTMediaFile.getBitrate();
        }
        aKVASTMediaFile.setBitrate(str3);
        if (str4 == null) {
            str4 = aKVASTMediaFile.getCodec();
        }
        aKVASTMediaFile.setCodec(str4);
        if (str5 == null) {
            str5 = aKVASTMediaFile.getDelivery();
        }
        aKVASTMediaFile.setDelivery(str5);
        if (str6 == null) {
            str6 = aKVASTMediaFile.getHeight();
        }
        aKVASTMediaFile.setHeight(str6);
        if (str7 == null) {
            str7 = aKVASTMediaFile.getId();
        }
        aKVASTMediaFile.setId(str7);
        if (str8 == null) {
            str8 = aKVASTMediaFile.getMaintainAspectRatio();
        }
        aKVASTMediaFile.setMaintainAspectRatio(str8);
        if (str9 == null) {
            str9 = aKVASTMediaFile.getMaxBitrate();
        }
        aKVASTMediaFile.setMaxBitrate(str9);
        if (z) {
            aKVASTMediaFile.setMediaUrl(str10);
        }
        if (str11 == null) {
            str11 = aKVASTMediaFile.getMinBitrate();
        }
        aKVASTMediaFile.setMinBitrate(str11);
        if (str12 == null) {
            str12 = aKVASTMediaFile.getScalable();
        }
        aKVASTMediaFile.setScalable(str12);
        if (str13 == null) {
            str13 = aKVASTMediaFile.getType();
        }
        aKVASTMediaFile.setType(str13);
        if (str16 == null) {
            str = aKVASTMediaFile.getWidth();
        } else {
            str = str16;
        }
        aKVASTMediaFile.setWidth(str);
        return aKVASTMediaFile;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTMediaFile aKVASTMediaFile = (AKVASTMediaFile) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTMediaFile != null) {
            kVar.mo25074i();
            kVar.mo25077w("apiFramework");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getApiFramework());
            kVar.mo25077w("bitrate");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getBitrate());
            kVar.mo25077w("codec");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getCodec());
            kVar.mo25077w("delivery");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getDelivery());
            kVar.mo25077w("height");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getHeight());
            kVar.mo25077w("id");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getId());
            kVar.mo25077w("maintainAspectRatio");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getMaintainAspectRatio());
            kVar.mo25077w("maxBitrate");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getMaxBitrate());
            kVar.mo25077w("mediaUrl");
            this.f7667c.mo11094e(kVar, aKVASTMediaFile.getMediaUrl());
            kVar.mo25077w("minBitrate");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getMinBitrate());
            kVar.mo25077w("scalable");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getScalable());
            kVar.mo25077w("type");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getType());
            kVar.mo25077w("width");
            this.f7666b.mo11094e(kVar, aKVASTMediaFile.getWidth());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(37, "AKVASTMediaFile");
    }
}
