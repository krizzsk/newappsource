package com.moovit.app.stoparrivals;

import bf0.C21050d;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.TimeVehicleLocation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import o20.C18696b;
import o20.C18711q;
import p429cw.C16515e;
import p762qz.C19207c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopArrivalsMapHelper$updateMapStopArrivals$1 extends Lambda implements C24225a<C21050d> {
    public final /* synthetic */ TripsUpdateResult $tripsUpdateResult;
    public final /* synthetic */ C16515e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsMapHelper$updateMapStopArrivals$1(TripsUpdateResult tripsUpdateResult, C16515e eVar) {
        super(0);
        this.$tripsUpdateResult = tripsUpdateResult;
        this.this$0 = eVar;
    }

    public final Object invoke() {
        ServerId serverId;
        ServerId serverId2;
        C16515e eVar;
        Pair<ServerId, ? extends Object> pair;
        Set<ServerId> keySet = this.$tripsUpdateResult.f39629d.keySet();
        Pair<ServerId, ? extends Object> pair2 = this.this$0.f43121g;
        if (pair2 != null) {
            serverId = pair2.mo59068c();
        } else {
            serverId = null;
        }
        if (!C23825c.m58507d0(keySet, serverId) && (pair = eVar.f43121g) != null) {
            (eVar = this.this$0).f43116b.mo48634e3(pair.mo59067b());
            eVar.f43121g = null;
            C21050d dVar = C21050d.f52856a;
        }
        Iterator it = this.this$0.f43122h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (!keySet.contains((ServerId) entry.getKey())) {
                it.remove();
                this.this$0.f43116b.mo48639j3(value);
            }
        }
        Set<String> keySet2 = this.$tripsUpdateResult.f39630e.keySet();
        Iterator it2 = this.this$0.f43124j.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Triple triple = (Triple) entry2.getValue();
            if (!keySet2.contains((String) entry2.getKey())) {
                it2.remove();
                this.this$0.f43116b.mo48637h3(triple.mo59088f(), (C18696b) triple.mo59086e());
            }
        }
        List<StopArrival> list = this.$tripsUpdateResult.f39628c;
        C16515e eVar2 = this.this$0;
        for (StopArrival stopArrival : list) {
            ServerId serverId3 = stopArrival.f39600c.f23907h;
            if (serverId3 != null && eVar2.f43122h.get(serverId3) == null) {
                Pair<ServerId, ? extends Object> pair3 = eVar2.f43121g;
                if (pair3 != null) {
                    serverId2 = pair3.mo59068c();
                } else {
                    serverId2 = null;
                }
                if (!C24362h.m61206a(serverId3, serverId2)) {
                    C16515e.m41998a(eVar2, stopArrival, serverId3);
                }
            }
            TimeVehicleLocation timeVehicleLocation = stopArrival.f39600c.f23912m;
            if (timeVehicleLocation != null) {
                Triple triple2 = (Triple) eVar2.f43124j.get(timeVehicleLocation.f23924b);
                if (triple2 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long minutes = timeUnit.toMinutes(currentTimeMillis - timeVehicleLocation.f23925c);
                    long minutes2 = timeUnit.toMinutes(currentTimeMillis - ((TimeVehicleLocation) triple2.mo59085d()).f23925c);
                    if ((minutes >= 2 || minutes2 < 2) && (minutes >= 5 || minutes2 < 5)) {
                        MapFragment mapFragment = eVar2.f43116b;
                        Object f = triple2.mo59088f();
                        LatLonE6 latLonE6 = timeVehicleLocation.f23926d;
                        C19207c.C19208a aVar = eVar2.f43127m;
                        mapFragment.getClass();
                        MapFragment.m41340y2((C18711q) triple2.mo59086e(), f, latLonE6, aVar);
                    } else {
                        String str = timeVehicleLocation.f23924b;
                        C24362h.m61210e(str, "vehicle.vehicleId");
                        eVar2.mo49304d(str);
                        eVar2.mo49303c(stopArrival, timeVehicleLocation);
                    }
                } else {
                    eVar2.mo49303c(stopArrival, timeVehicleLocation);
                }
            }
        }
        return C21050d.f52856a;
    }
}
