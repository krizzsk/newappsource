package com.moovit.app.stoparrivals;

import cf0.C21140n;
import com.moovit.network.model.LongServerId;
import com.moovit.util.time.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo59060d2 = {"<anonymous>", "", "Lcom/moovit/util/time/Time;", "it", "", "Lcom/moovit/network/model/LongServerId;", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopArrivalsViewModel$createTripsResult$vehicleIds$1 extends Lambda implements C24236l<Map<LongServerId, ? extends List<Time>>, List<? extends Time>> {

    /* renamed from: f */
    public static final StopArrivalsViewModel$createTripsResult$vehicleIds$1 f39621f = new StopArrivalsViewModel$createTripsResult$vehicleIds$1();

    public StopArrivalsViewModel$createTripsResult$vehicleIds$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        C24362h.m61211f(map, "it");
        Collection<Iterable> values = map.values();
        C24362h.m61211f(values, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable a0 : values) {
            C21140n.m49439a0(a0, arrayList);
        }
        return arrayList;
    }
}
