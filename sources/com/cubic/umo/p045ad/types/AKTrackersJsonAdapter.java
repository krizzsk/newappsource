package com.cubic.umo.p045ad.types;

import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKTrackersJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKTrackers;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKTrackersJsonAdapter */
public final class AKTrackersJsonAdapter extends C8011k<AKTrackers> {

    /* renamed from: a */
    public final JsonReader.C7986a f7598a = JsonReader.C7986a.m18216a(AdSDKNotificationListener.IMPRESSION_EVENT, "click", Promotion.ACTION_VIEW, "viewability");

    /* renamed from: b */
    public final C8011k<List<String>> f7599b;

    /* renamed from: c */
    public volatile Constructor<AKTrackers> f7600c;

    public AKTrackersJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7599b = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, String.class), AdSDKNotificationListener.IMPRESSION_EVENT);
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        int i = -1;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7598a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                list = this.f7599b.mo11093a(jsonReader);
                i &= -2;
            } else if (O == 1) {
                list2 = this.f7599b.mo11093a(jsonReader);
                i &= -3;
            } else if (O == 2) {
                list3 = this.f7599b.mo11093a(jsonReader);
                i &= -5;
            } else if (O == 3) {
                list4 = this.f7599b.mo11093a(jsonReader);
                i &= -9;
            }
        }
        jsonReader.mo24997r();
        if (i == -16) {
            return new AKTrackers(list, list2, list3, list4);
        }
        Constructor<AKTrackers> constructor = this.f7600c;
        if (constructor == null) {
            constructor = AKTrackers.class.getDeclaredConstructor(new Class[]{List.class, List.class, List.class, List.class, Integer.TYPE, C12977b.f32133c});
            this.f7600c = constructor;
            C24362h.m61210e(constructor, "AKTrackers::class.java.g…his.constructorRef = it }");
        }
        AKTrackers newInstance = constructor.newInstance(new Object[]{list, list2, list3, list4, Integer.valueOf(i), null});
        C24362h.m61210e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKTrackers aKTrackers = (AKTrackers) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKTrackers != null) {
            kVar.mo25074i();
            kVar.mo25077w(AdSDKNotificationListener.IMPRESSION_EVENT);
            this.f7599b.mo11094e(kVar, aKTrackers.f7594b);
            kVar.mo25077w("click");
            this.f7599b.mo11094e(kVar, aKTrackers.f7595c);
            kVar.mo25077w(Promotion.ACTION_VIEW);
            this.f7599b.mo11094e(kVar, aKTrackers.f7596d);
            kVar.mo25077w("viewability");
            this.f7599b.mo11094e(kVar, aKTrackers.f7597e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(32, "AKTrackers");
    }
}
