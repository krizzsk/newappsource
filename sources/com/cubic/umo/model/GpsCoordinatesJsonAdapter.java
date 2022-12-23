package com.cubic.umo.model;

import com.appsflyer.ServerParameters;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/model/GpsCoordinatesJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/model/GpsCoordinates;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class GpsCoordinatesJsonAdapter extends C8011k<GpsCoordinates> {

    /* renamed from: a */
    public final JsonReader.C7986a f7826a = JsonReader.C7986a.m18216a(ServerParameters.LAT_KEY, ServerParameters.LON_KEY, "ele", "acc");

    /* renamed from: b */
    public final C8011k<Double> f7827b;

    /* renamed from: c */
    public final C8011k<Double> f7828c;

    public GpsCoordinatesJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.f60175b;
        this.f7827b = oVar.mo25082c(cls, emptySet, "latitude");
        this.f7828c = oVar.mo25082c(Double.class, emptySet, "elevation");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7826a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                d = this.f7827b.mo11093a(jsonReader);
                if (d == null) {
                    throw C12977b.m32860m("latitude", ServerParameters.LAT_KEY, jsonReader);
                }
            } else if (O == 1) {
                d2 = this.f7827b.mo11093a(jsonReader);
                if (d2 == null) {
                    throw C12977b.m32860m("longitude", ServerParameters.LON_KEY, jsonReader);
                }
            } else if (O == 2) {
                d3 = this.f7828c.mo11093a(jsonReader);
            } else if (O == 3) {
                d4 = this.f7828c.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (d2 != null) {
                return new GpsCoordinates(doubleValue, d2.doubleValue(), d3, d4);
            }
            throw C12977b.m32854g("longitude", ServerParameters.LON_KEY, jsonReader);
        }
        throw C12977b.m32854g("latitude", ServerParameters.LAT_KEY, jsonReader);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        GpsCoordinates gpsCoordinates = (GpsCoordinates) obj;
        C24362h.m61211f(kVar, "writer");
        if (gpsCoordinates != null) {
            kVar.mo25074i();
            kVar.mo25077w(ServerParameters.LAT_KEY);
            this.f7827b.mo11094e(kVar, Double.valueOf(gpsCoordinates.f7822b));
            kVar.mo25077w(ServerParameters.LON_KEY);
            this.f7827b.mo11094e(kVar, Double.valueOf(gpsCoordinates.f7823c));
            kVar.mo25077w("ele");
            this.f7828c.mo11094e(kVar, gpsCoordinates.f7824d);
            kVar.mo25077w("acc");
            this.f7828c.mo11094e(kVar, gpsCoordinates.f7825e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GpsCoordinates)";
    }
}
