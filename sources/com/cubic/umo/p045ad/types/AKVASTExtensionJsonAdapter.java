package com.cubic.umo.p045ad.types;

import com.appsflyer.ServerParameters;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTExtensionJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTExtension;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTExtensionJsonAdapter */
public final class AKVASTExtensionJsonAdapter extends C8011k<AKVASTExtension> {

    /* renamed from: a */
    public final JsonReader.C7986a f7640a = JsonReader.C7986a.m18216a("adCTA", "adDescription", "adEventId", "adExpiryTimeMinutes", "adTitle", "bandwidth", "bandwidthKbps", ServerParameters.COUNTRY, "customTracking", "destinationUrl", "displayUrl", "fallbackIndex", "feEventId", "thumbnailUrl", "type", "viewabilityTrackers");

    /* renamed from: b */
    public final C8011k<String> f7641b;

    /* renamed from: c */
    public final C8011k<Integer> f7642c;

    /* renamed from: d */
    public final C8011k<AKVASTExtensionCustomTracking> f7643d;

    /* renamed from: e */
    public final C8011k<String> f7644e;

    /* renamed from: f */
    public final C8011k<AKVASTExtensionViewabilityTrackers> f7645f;

    public AKVASTExtensionJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7641b = C18201b.m44910D(oVar2, cls, "adCTA");
        this.f7642c = C18201b.m44910D(oVar2, Integer.TYPE, "adExpiryTimeMinutes");
        this.f7643d = C18201b.m44910D(oVar2, AKVASTExtensionCustomTracking.class, "customTracking");
        this.f7644e = C18201b.m44910D(oVar2, cls, "fallbackIndex");
        this.f7645f = C18201b.m44910D(oVar2, AKVASTExtensionViewabilityTrackers.class, "viewabilityTrackers");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        int i;
        int i2;
        int i3;
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        String str = null;
        String str2 = null;
        AKVASTExtensionCustomTracking aKVASTExtensionCustomTracking = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        AKVASTExtensionViewabilityTrackers aKVASTExtensionViewabilityTrackers = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (jsonReader.mo24999v()) {
            String str12 = str2;
            switch (jsonReader2.mo24989O(this.f7640a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str5 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z = true;
                    continue;
                case 1:
                    str6 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z2 = true;
                    continue;
                case 2:
                    str = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z3 = true;
                    continue;
                case 3:
                    num = this.f7642c.mo11093a(jsonReader2);
                    if (num == null) {
                        throw C12977b.m32860m("adExpiryTimeMinutes", "adExpiryTimeMinutes", jsonReader2);
                    }
                    break;
                case 4:
                    str4 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z4 = true;
                    continue;
                case 5:
                    num2 = this.f7642c.mo11093a(jsonReader2);
                    if (num2 == null) {
                        throw C12977b.m32860m("bandwidth", "bandwidth", jsonReader2);
                    }
                    break;
                case 6:
                    num3 = this.f7642c.mo11093a(jsonReader2);
                    if (num3 == null) {
                        throw C12977b.m32860m("bandwidthKbps", "bandwidthKbps", jsonReader2);
                    }
                    break;
                case 7:
                    str3 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z5 = true;
                    continue;
                case 8:
                    aKVASTExtensionCustomTracking = this.f7643d.mo11093a(jsonReader2);
                    str2 = str12;
                    z6 = true;
                    continue;
                case 9:
                    str2 = this.f7641b.mo11093a(jsonReader2);
                    z7 = true;
                    continue;
                case 10:
                    str7 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z12 = true;
                    continue;
                case 11:
                    str8 = this.f7644e.mo11093a(jsonReader2);
                    if (str8 == null) {
                        throw C12977b.m32860m("fallbackIndex", "fallbackIndex", jsonReader2);
                    }
                    break;
                case 12:
                    str9 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z11 = true;
                    continue;
                case 13:
                    str10 = this.f7641b.mo11093a(jsonReader2);
                    str2 = str12;
                    z9 = true;
                    continue;
                case 14:
                    str11 = this.f7644e.mo11093a(jsonReader2);
                    if (str11 == null) {
                        throw C12977b.m32860m("type", "type", jsonReader2);
                    }
                    break;
                case 15:
                    aKVASTExtensionViewabilityTrackers = this.f7645f.mo11093a(jsonReader2);
                    str2 = str12;
                    z8 = true;
                    continue;
            }
            str2 = str12;
        }
        String str13 = str2;
        jsonReader.mo24997r();
        AKVASTExtension aKVASTExtension = new AKVASTExtension();
        if (z) {
            aKVASTExtension.setAdCTA(str5);
        }
        if (z2) {
            aKVASTExtension.setAdDescription(str6);
        }
        if (z3) {
            aKVASTExtension.setAdEventId(str);
        }
        if (num == null) {
            i = aKVASTExtension.getAdExpiryTimeMinutes();
        } else {
            i = num.intValue();
        }
        aKVASTExtension.setAdExpiryTimeMinutes(i);
        if (z4) {
            aKVASTExtension.setAdTitle(str4);
        }
        if (num2 == null) {
            i2 = aKVASTExtension.getBandwidth();
        } else {
            i2 = num2.intValue();
        }
        aKVASTExtension.setBandwidth(i2);
        if (num3 == null) {
            i3 = aKVASTExtension.getBandwidthKbps();
        } else {
            i3 = num3.intValue();
        }
        aKVASTExtension.setBandwidthKbps(i3);
        if (z5) {
            aKVASTExtension.setCountry(str3);
        }
        if (z6) {
            aKVASTExtension.setCustomTracking(aKVASTExtensionCustomTracking);
        }
        if (z7) {
            aKVASTExtension.setDestinationUrl(str13);
        }
        if (z12) {
            aKVASTExtension.setDisplayUrl(str7);
        }
        if (str8 == null) {
            str8 = aKVASTExtension.getFallbackIndex();
        }
        aKVASTExtension.setFallbackIndex(str8);
        if (z11) {
            aKVASTExtension.setFeEventId(str9);
        }
        if (z9) {
            aKVASTExtension.setThumbnailUrl(str10);
        }
        if (str11 == null) {
            str11 = aKVASTExtension.getType();
        }
        aKVASTExtension.setType(str11);
        if (z8) {
            aKVASTExtension.setViewabilityTrackers(aKVASTExtensionViewabilityTrackers);
        }
        return aKVASTExtension;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTExtension aKVASTExtension = (AKVASTExtension) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTExtension != null) {
            kVar.mo25074i();
            kVar.mo25077w("adCTA");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getAdCTA());
            kVar.mo25077w("adDescription");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getAdDescription());
            kVar.mo25077w("adEventId");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getAdEventId());
            kVar.mo25077w("adExpiryTimeMinutes");
            this.f7642c.mo11094e(kVar, Integer.valueOf(aKVASTExtension.getAdExpiryTimeMinutes()));
            kVar.mo25077w("adTitle");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getAdTitle());
            kVar.mo25077w("bandwidth");
            this.f7642c.mo11094e(kVar, Integer.valueOf(aKVASTExtension.getBandwidth()));
            kVar.mo25077w("bandwidthKbps");
            this.f7642c.mo11094e(kVar, Integer.valueOf(aKVASTExtension.getBandwidthKbps()));
            kVar.mo25077w(ServerParameters.COUNTRY);
            this.f7641b.mo11094e(kVar, aKVASTExtension.getCountry());
            kVar.mo25077w("customTracking");
            this.f7643d.mo11094e(kVar, aKVASTExtension.getCustomTracking());
            kVar.mo25077w("destinationUrl");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getDestinationUrl());
            kVar.mo25077w("displayUrl");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getDisplayUrl());
            kVar.mo25077w("fallbackIndex");
            this.f7644e.mo11094e(kVar, aKVASTExtension.getFallbackIndex());
            kVar.mo25077w("feEventId");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getFeEventId());
            kVar.mo25077w("thumbnailUrl");
            this.f7641b.mo11094e(kVar, aKVASTExtension.getThumbnailUrl());
            kVar.mo25077w("type");
            this.f7644e.mo11094e(kVar, aKVASTExtension.getType());
            kVar.mo25077w("viewabilityTrackers");
            this.f7645f.mo11094e(kVar, aKVASTExtension.getViewabilityTrackers());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(37, "AKVASTExtension");
    }
}
