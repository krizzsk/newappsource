package com.cubic.umo.p045ad.types;

import com.appboy.models.InAppMessageBase;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTLinearJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTLinear;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTLinearJsonAdapter */
public final class AKVASTLinearJsonAdapter extends C8011k<AKVASTLinear> {

    /* renamed from: a */
    public final JsonReader.C7986a f7658a = JsonReader.C7986a.m18216a("adParameters", InAppMessageBase.DURATION, "mediaFiles", "skipOffset", "trackingEvents", "videoClicks");

    /* renamed from: b */
    public final C8011k<String> f7659b;

    /* renamed from: c */
    public final C8011k<AKVASTMediaFiles> f7660c;

    /* renamed from: d */
    public final C8011k<String> f7661d;

    /* renamed from: e */
    public final C8011k<AKVASTTrackingEvents> f7662e;

    /* renamed from: f */
    public final C8011k<AKVASTVideoClicks> f7663f;

    public AKVASTLinearJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7659b = C18201b.m44910D(oVar, cls, "adParameters");
        this.f7660c = C18201b.m44910D(oVar, AKVASTMediaFiles.class, "mediaFiles");
        this.f7661d = C18201b.m44910D(oVar, cls, "skipOffset");
        this.f7662e = C18201b.m44910D(oVar, AKVASTTrackingEvents.class, "trackingEvents");
        this.f7663f = C18201b.m44910D(oVar, AKVASTVideoClicks.class, "videoClicks");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        String str = null;
        String str2 = null;
        AKVASTMediaFiles aKVASTMediaFiles = null;
        String str3 = null;
        AKVASTTrackingEvents aKVASTTrackingEvents = null;
        AKVASTVideoClicks aKVASTVideoClicks = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f7658a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7659b.mo11093a(jsonReader);
                    z = true;
                    break;
                case 1:
                    str2 = this.f7659b.mo11093a(jsonReader);
                    z2 = true;
                    break;
                case 2:
                    aKVASTMediaFiles = this.f7660c.mo11093a(jsonReader);
                    z3 = true;
                    break;
                case 3:
                    str3 = this.f7661d.mo11093a(jsonReader);
                    if (str3 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("skipOffset", "skipOffset", jsonReader);
                    }
                case 4:
                    aKVASTTrackingEvents = this.f7662e.mo11093a(jsonReader);
                    z4 = true;
                    break;
                case 5:
                    aKVASTVideoClicks = this.f7663f.mo11093a(jsonReader);
                    z5 = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        AKVASTLinear aKVASTLinear = new AKVASTLinear();
        if (z) {
            aKVASTLinear.setAdParameters(str);
        }
        if (z2) {
            aKVASTLinear.setDuration(str2);
        }
        if (z3) {
            aKVASTLinear.setMediaFiles(aKVASTMediaFiles);
        }
        if (str3 == null) {
            str3 = aKVASTLinear.getSkipOffset();
        }
        aKVASTLinear.setSkipOffset(str3);
        if (z4) {
            aKVASTLinear.setTrackingEvents(aKVASTTrackingEvents);
        }
        if (z5) {
            aKVASTLinear.setVideoClicks(aKVASTVideoClicks);
        }
        return aKVASTLinear;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTLinear aKVASTLinear = (AKVASTLinear) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTLinear != null) {
            kVar.mo25074i();
            kVar.mo25077w("adParameters");
            this.f7659b.mo11094e(kVar, aKVASTLinear.getAdParameters());
            kVar.mo25077w(InAppMessageBase.DURATION);
            this.f7659b.mo11094e(kVar, aKVASTLinear.getDuration());
            kVar.mo25077w("mediaFiles");
            this.f7660c.mo11094e(kVar, aKVASTLinear.getMediaFiles());
            kVar.mo25077w("skipOffset");
            this.f7661d.mo11094e(kVar, aKVASTLinear.getSkipOffset());
            kVar.mo25077w("trackingEvents");
            this.f7662e.mo11094e(kVar, aKVASTLinear.getTrackingEvents());
            kVar.mo25077w("videoClicks");
            this.f7663f.mo11094e(kVar, aKVASTLinear.getVideoClicks());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(34, "AKVASTLinear");
    }
}
