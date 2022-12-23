package p781ru;

import ce0.C21100e;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.commons.geo.Polyline;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;

/* renamed from: ru.d */
public final class C19331d {

    /* renamed from: a */
    public final TransitLine f49188a;

    /* renamed from: b */
    public final TransitStop f49189b;

    /* renamed from: c */
    public final List<TransitStop> f49190c;

    /* renamed from: d */
    public final List<TransitStop> f49191d;

    /* renamed from: e */
    public final Map<ServerId, MotQrCodeStationFare> f49192e;

    /* renamed from: f */
    public final Polyline f49193f;

    public C19331d(TransitLine transitLine, TransitStop transitStop, ArrayList arrayList, List list, C6302b bVar, Polyline polyline) {
        C21100e.m49373x(transitLine, "line");
        this.f49188a = transitLine;
        C21100e.m49373x(transitStop, "originStop");
        this.f49189b = transitStop;
        this.f49190c = Collections.unmodifiableList(arrayList);
        this.f49191d = Collections.unmodifiableList(list);
        this.f49192e = Collections.unmodifiableMap(bVar);
        this.f49193f = polyline;
    }
}
