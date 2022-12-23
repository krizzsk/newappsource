package p660mq;

import cf0.C21136j;
import cf0.C21140n;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.database.DbEntityRef;
import com.moovit.genies.Genie;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17875h;
import p660mq.C18421e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lmq/a;", "Lmq/e;", "Lcom/moovit/app/itinerary/ItineraryActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
/* renamed from: mq.a */
public final class C18417a extends C18421e<ItineraryActivity> {
    public C18417a() {
        super(ItineraryActivity.class);
    }

    /* renamed from: A2 */
    public final Genie mo50869A2() {
        return Genie.ITINERARY_VIEW_LIVE_LOCATION;
    }

    /* renamed from: C2 */
    public final String mo50870C2() {
        String str = ((ItineraryActivity) this.f40822c).mo45266A2().f41894b;
        C24362h.m61210e(str, "moovitActivity.currentItinerary.id");
        return str;
    }

    /* renamed from: z2 */
    public final C18421e.C18422a mo50871z2() {
        ArrayList arrayList;
        ServerId serverId;
        DbEntityRef<TransitStop> dbEntityRef;
        DbEntityRef<TransitStop> dbEntityRef2;
        Itinerary A2 = ((ItineraryActivity) this.f40822c).mo45266A2();
        List<Leg> u0 = A2.mo48295u0();
        C24362h.m61210e(u0, "itinerary.legs");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = u0.iterator();
        while (true) {
            ServerId serverId2 = null;
            if (!it.hasNext()) {
                break;
            }
            Leg leg = (Leg) it.next();
            if (leg instanceof WaitToMultiTransitLinesLeg) {
                List<WaitToTransitLineLeg> list = ((WaitToMultiTransitLinesLeg) leg).f42117b;
                C24362h.m61210e(list, "leg.waitLegs");
                WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) C23825c.m58515l0(list);
                if (!(waitToTransitLineLeg == null || (dbEntityRef2 = waitToTransitLineLeg.f42136g) == null)) {
                    serverId2 = dbEntityRef2.getServerId();
                }
            } else if (leg instanceof WaitToTransitLineLeg) {
                serverId2 = ((WaitToTransitLineLeg) leg).f42136g.getServerId();
            }
            if (serverId2 != null) {
                arrayList2.add(serverId2);
            }
        }
        int z = C13637c.m34083z(C21136j.m49436X(arrayList2, 10));
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ServerId serverId3 = (ServerId) it2.next();
            List<Leg> u02 = A2.mo48295u0();
            C24362h.m61210e(u02, "itinerary.legs");
            ArrayList arrayList3 = new ArrayList();
            for (Leg leg2 : u02) {
                C24362h.m61210e(leg2, "leg");
                if (leg2 instanceof WaitToMultiTransitLinesLeg) {
                    WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg2;
                    List<WaitToTransitLineLeg> list2 = waitToMultiTransitLinesLeg.f42117b;
                    C24362h.m61210e(list2, "leg.waitLegs");
                    WaitToTransitLineLeg waitToTransitLineLeg2 = (WaitToTransitLineLeg) C23825c.m58515l0(list2);
                    if (waitToTransitLineLeg2 == null || (dbEntityRef = waitToTransitLineLeg2.f42136g) == null) {
                        serverId = null;
                    } else {
                        serverId = dbEntityRef.getServerId();
                    }
                    if (C24362h.m61206a(serverId3, serverId)) {
                        List<WaitToTransitLineLeg> list3 = waitToMultiTransitLinesLeg.f42117b;
                        C24362h.m61210e(list3, "leg.waitLegs");
                        ArrayList arrayList4 = new ArrayList(C21136j.m49436X(list3, 10));
                        for (WaitToTransitLineLeg waitToTransitLineLeg3 : list3) {
                            ServerId serverId4 = waitToTransitLineLeg3.f42135f.getServerId();
                            C24362h.m61210e(serverId4, "it.waitToLineRef.serverId");
                            arrayList4.add(serverId4);
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = EmptyList.f60173b;
                    }
                } else if (leg2 instanceof WaitToTransitLineLeg) {
                    WaitToTransitLineLeg waitToTransitLineLeg4 = (WaitToTransitLineLeg) leg2;
                    if (C24362h.m61206a(serverId3, waitToTransitLineLeg4.f42136g.getServerId())) {
                        arrayList = C17875h.m44280D(waitToTransitLineLeg4.f42135f.getServerId());
                    } else {
                        arrayList = EmptyList.f60173b;
                    }
                } else {
                    arrayList = EmptyList.f60173b;
                }
                C21140n.m49439a0(arrayList, arrayList3);
            }
            linkedHashMap.put(serverId3, arrayList3);
        }
        String str = A2.f41894b;
        C24362h.m61210e(str, "itinerary.id");
        return new C18421e.C18422a(linkedHashMap, arrayList2, str);
    }
}
