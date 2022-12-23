package e20;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.tripplanner.MVLineLeg;
import com.tranzmate.moovit.protocol.tripplanner.MVLineWithAlternativesLeg;
import com.tranzmate.moovit.protocol.tripplanner.MVMultiRouteItineraryUpdateResponse;
import com.tranzmate.moovit.protocol.tripplanner.MVUpdatedItinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVUpdatedTripPlanLeg;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p572iw.C17676l;
import p810sz.C19617r;
import p824tp.C19728f;
import p977zz.C20944i0;
import q00.C19047a;

/* renamed from: e20.u */
public final class C16796u extends C13780t<C16795t, C16796u, MVMultiRouteItineraryUpdateResponse> {

    /* renamed from: m */
    public Itinerary f43736m;

    public C16796u() {
        super(MVMultiRouteItineraryUpdateResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        boolean z;
        C16795t tVar = (C16795t) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        MVUpdatedItinerary mVUpdatedItinerary = ((MVMultiRouteItineraryUpdateResponse) tBase).itinerary;
        C19617r rVar = C16080a.f41870a;
        for (MVUpdatedTripPlanLeg next : mVUpdatedItinerary.legs) {
            F f = next.setField_;
            boolean z2 = true;
            if (f == MVUpdatedTripPlanLeg._Fields.WAIT_TO_MULTI_LINE_LEG) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C16080a.m40944E(aVar2, next.mo34818n());
            } else {
                if (f != MVUpdatedTripPlanLeg._Fields.LINEWITH_ALTERNATIVES_LEG) {
                    z2 = false;
                }
                if (z2) {
                    for (MVLineLeg next2 : next.mo34816l().alternativeLines) {
                        aVar2.mo21075b(next2.lineId);
                        List<Integer> list = next2.stopSequenceIds;
                        if (list != null) {
                            aVar2.f17414a.addAll(list);
                        }
                    }
                }
            }
        }
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        MVCurrencyAmount mVCurrencyAmount;
        boolean z;
        Object obj;
        ItineraryMetadata itineraryMetadata;
        boolean z2;
        boolean z3;
        C5268d dVar2 = dVar;
        C16795t tVar = (C16795t) aVar;
        Itinerary itinerary = tVar.f43734y;
        MVUpdatedItinerary mVUpdatedItinerary = ((MVMultiRouteItineraryUpdateResponse) tBase).itinerary;
        String str = mVUpdatedItinerary.guid;
        ItineraryMetadata itineraryMetadata2 = itinerary.f41895c;
        String str2 = itineraryMetadata2.f41900b;
        ServerId serverId = itineraryMetadata2.f41901c;
        int i = itineraryMetadata2.f41902d;
        String str3 = itineraryMetadata2.f41903e;
        if (mVUpdatedItinerary.mo34804i()) {
            mVCurrencyAmount = mVUpdatedItinerary.itineraryFare.price;
        } else {
            mVCurrencyAmount = null;
        }
        String str4 = str;
        ItineraryMetadata itineraryMetadata3 = r6;
        ItineraryMetadata itineraryMetadata4 = new ItineraryMetadata(str2, serverId, i, str3, C13749c.m34318d(mVCurrencyAmount), mVUpdatedItinerary.hasNext, mVUpdatedItinerary.hasPrev, mVUpdatedItinerary.relevantForRealtime, itineraryMetadata2.f41908j, itineraryMetadata2.f41909k, itineraryMetadata2.f41910l);
        C19728f fVar = tVar.f43732w;
        C19047a aVar2 = tVar.f43733x;
        List<Leg> u0 = itinerary.mo48295u0();
        List<MVUpdatedTripPlanLeg> list = mVUpdatedItinerary.legs;
        C19617r rVar = C16080a.f41870a;
        int size = u0.size();
        if (size == list.size()) {
            ArrayList arrayList = new ArrayList(size);
            int i2 = 0;
            while (i2 < size) {
                MVUpdatedTripPlanLeg mVUpdatedTripPlanLeg = list.get(i2);
                F f = mVUpdatedTripPlanLeg.setField_;
                if (f == MVUpdatedTripPlanLeg._Fields.TIME) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C20944i0<Time, Time> h = C16080a.m40952h(mVUpdatedTripPlanLeg.mo34817m());
                    C20944i0<Time, Time> g = C16080a.m40951g(mVUpdatedTripPlanLeg.mo34817m());
                    obj = (Leg) u0.get(i2).mo48338i0(new C16765a((Time) h.f52692a, (Time) h.f52693b, (Time) g.f52692a, (Time) g.f52693b));
                    itineraryMetadata = itineraryMetadata3;
                    C5268d dVar3 = dVar;
                } else {
                    if (f == MVUpdatedTripPlanLeg._Fields.WAIT_TO_MULTI_LINE_LEG) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        itineraryMetadata = itineraryMetadata3;
                        obj = C16080a.m40957m(fVar, aVar2, mVUpdatedTripPlanLeg.mo34818n(), dVar);
                    } else {
                        itineraryMetadata = itineraryMetadata3;
                        C5268d dVar4 = dVar;
                        if (f == MVUpdatedTripPlanLeg._Fields.LINEWITH_ALTERNATIVES_LEG) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            MVLineWithAlternativesLeg l = mVUpdatedTripPlanLeg.mo34816l();
                            obj = new MultiTransitLinesLeg(C13720d.m34273c(l.alternativeLines, (C13722f) null, new C17676l(dVar4, 1)), l.primaryAlternativeIndex);
                        } else {
                            obj = null;
                        }
                    }
                }
                arrayList.add(obj);
                i2++;
                itineraryMetadata3 = itineraryMetadata;
            }
            this.f43736m = new Itinerary(str4, itineraryMetadata3, arrayList);
            return;
        }
        throw new BadResponseException("Similar itinerary response must have the same number of legs!");
    }
}
