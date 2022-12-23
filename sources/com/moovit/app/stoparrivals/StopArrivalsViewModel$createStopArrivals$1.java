package com.moovit.app.stoparrivals;

import cf0.C21136j;
import cf0.C21140n;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.Time;
import i30.C5268d;
import j80.C12775d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;

@Metadata(mo59059d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012$\u0010\u0003\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0004H\n¢\u0006\u0002\b\n"}, mo59060d2 = {"<anonymous>", "", "Lcom/moovit/app/stoparrivals/StopArrival;", "<name for destructuring parameter 0>", "", "Lcom/moovit/network/model/ServerId;", "", "Lcom/moovit/network/model/LongServerId;", "", "Lcom/moovit/util/time/Time;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopArrivalsViewModel$createStopArrivals$1 extends Lambda implements C24236l<Map.Entry<? extends ServerId, ? extends Map<LongServerId, ? extends List<Time>>>, List<? extends StopArrival>> {
    public final /* synthetic */ Map<ServerId, C12775d> $serviceAlerts;
    public final /* synthetic */ C5268d $syncItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$createStopArrivals$1(Map<ServerId, ? extends C12775d> map, C5268d dVar) {
        super(1);
        this.$serviceAlerts = map;
        this.$syncItems = dVar;
    }

    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C24362h.m61211f(entry, "<name for destructuring parameter 0>");
        ServerId serverId = (ServerId) entry.getKey();
        Map<ServerId, C12775d> map = this.$serviceAlerts;
        C5268d dVar = this.$syncItems;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : ((Map) entry.getValue()).entrySet()) {
            List list = (List) value.getValue();
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(list, 10));
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                ServiceStatusCategory serviceStatusCategory = null;
                if (i >= 0) {
                    Time time = (Time) next;
                    C12775d dVar2 = map.get(serverId);
                    if (dVar2 != null && ServiceStatusCategory.IMPORTANT_LEVEL.contains(dVar2.f31580b.f23213b)) {
                        serviceStatusCategory = dVar2.f31580b.f23213b;
                    }
                    TransitLine b = dVar.mo21063b(serverId);
                    C24362h.m61210e(b, "syncItems.getLine(lineId)");
                    arrayList2.add(new StopArrival(b, time, i, serviceStatusCategory));
                    i = i2;
                } else {
                    C17875h.m44294U();
                    throw null;
                }
            }
            C21140n.m49439a0(arrayList2, arrayList);
        }
        return arrayList;
    }
}
