package p900wt;

import c70.C13746a;
import c70.C13780t;
import com.moovit.itinerary.C16080a;
import com.moovit.suggestedroutes.TripPlanParams;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVLocationType;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse;
import i30.C5269e;
import org.apache.thrift.TBase;

/* renamed from: wt.h */
public final class C20418h extends C13780t<C20417g, C20418h, MVTripPlanInformationCachedResponse> {

    /* renamed from: m */
    public TripPlanParams f51731m = null;

    public C20418h() {
        super(MVTripPlanInformationCachedResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C20417g gVar = (C20417g) aVar;
        MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) tBase;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        MVLocationDescriptor mVLocationDescriptor = mVTripPlanInformationCachedResponse.originalRequest.fromLocation.location;
        MVLocationType mVLocationType = MVLocationType.Stop;
        if (mVLocationType.equals(mVLocationDescriptor.type) && mVLocationDescriptor.mo26322h()) {
            aVar2.mo21076c(mVLocationDescriptor.f25101id);
        }
        MVLocationDescriptor mVLocationDescriptor2 = mVTripPlanInformationCachedResponse.originalRequest.toLocation.location;
        if (mVLocationType.equals(mVLocationDescriptor2.type) && mVLocationDescriptor2.mo26322h()) {
            aVar2.mo21076c(mVLocationDescriptor2.f25101id);
        }
        for (MVTripPlanSectionedResponse D : mVTripPlanInformationCachedResponse.itineraries) {
            C16080a.m40943D(aVar2, D, gVar.f51730y);
        }
        return aVar2.mo21074a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40712p(c70.C13746a r20, org.apache.thrift.TBase r21, i30.C5268d r22) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r19 = this;
            r0 = r19
            r7 = r22
            r8 = r20
            wt.g r8 = (p900wt.C20417g) r8
            r1 = r21
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse r1 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse) r1
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest r2 = r1.originalRequest
            aa0.r r3 = aa0.C7553r.f23033b
            android.content.Context r4 = r8.f51759b
            java.lang.String r9 = r3.mo23812b(r4, r2)
            e20.i r10 = new e20.i
            RQ r2 = r0.f51773b
            android.content.Context r2 = r2.f51759b
            r10.<init>(r2)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest r2 = r1.originalRequest
            com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget r2 = r2.fromLocation
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r3 = r2.location
            com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r2 = r2.sourceType
            com.moovit.transit.LocationDescriptor r11 = com.moovit.itinerary.C16080a.m40949e(r3, r2, r7)
            r10.mo49472b(r11)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest r2 = r1.originalRequest
            com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget r2 = r2.toLocation
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r3 = r2.location
            com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r2 = r2.sourceType
            com.moovit.transit.LocationDescriptor r12 = com.moovit.itinerary.C16080a.m40949e(r3, r2, r7)
            r10.mo49472b(r12)
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest r2 = r1.originalRequest
            boolean r3 = r2.currentTimeSelected
            if (r3 == 0) goto L_0x0049
            com.moovit.tripplanner.TripPlannerTime r3 = com.moovit.tripplanner.TripPlannerTime.m17899f()
            r13 = r3
            goto L_0x0057
        L_0x0049:
            com.tranzmate.moovit.protocol.tripplanner.MVTimeType r3 = r2.timeType
            com.moovit.tripplanner.TripPlannerTime$Type r3 = com.moovit.itinerary.C16080a.m40953i(r3)
            long r4 = r2.time
            com.moovit.tripplanner.TripPlannerTime r6 = new com.moovit.tripplanner.TripPlannerTime
            r6.<init>(r3, r4)
            r13 = r6
        L_0x0057:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanPref r3 = r2.tripPlanPref
            int[] r4 = com.moovit.itinerary.C16080a.C16081a.f41884n
            int r5 = r3.ordinal()
            r4 = r4[r5]
            r5 = 3
            r14 = 1
            if (r4 == r14) goto L_0x0087
            r6 = 2
            if (r4 == r6) goto L_0x0084
            if (r4 != r5) goto L_0x006d
            com.moovit.tripplanner.TripPlannerRouteType r3 = com.moovit.tripplanner.TripPlannerRouteType.LEAST_TRANSFERS
            goto L_0x0089
        L_0x006d:
            com.moovit.commons.utils.ApplicationBugException r1 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown trip plan route type: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0084:
            com.moovit.tripplanner.TripPlannerRouteType r3 = com.moovit.tripplanner.TripPlannerRouteType.FASTEST
            goto L_0x0089
        L_0x0087:
            com.moovit.tripplanner.TripPlannerRouteType r3 = com.moovit.tripplanner.TripPlannerRouteType.LEAST_WALKING
        L_0x0089:
            r15 = r3
            java.util.List<com.tranzmate.moovit.protocol.common.MVRouteType> r3 = r2.routeTypes
            r16 = 0
            if (r3 != 0) goto L_0x0092
            r3 = 0
            goto L_0x0096
        L_0x0092:
            int r3 = r3.size()
        L_0x0096:
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref> r4 = r2.transportTypes
            if (r4 != 0) goto L_0x009c
            r4 = 0
            goto L_0x00a0
        L_0x009c:
            int r4 = r4.size()
        L_0x00a0:
            int r3 = r3 + r4
            r4 = 0
            if (r3 > 0) goto L_0x00a6
            r6 = r4
            goto L_0x00cc
        L_0x00a6:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r3)
            java.util.List<com.tranzmate.moovit.protocol.common.MVRouteType> r3 = r2.routeTypes
            boolean r17 = c00.C13717b.m34258e(r3)
            if (r17 != 0) goto L_0x00bb
            tr.b r5 = new tr.b
            r5.<init>(r14)
            c00.C13720d.m34276f(r3, r4, r5, r6)
        L_0x00bb:
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref> r2 = r2.transportTypes
            boolean r3 = c00.C13717b.m34258e(r2)
            if (r3 != 0) goto L_0x00cc
            com.facebook.appevents.l r3 = new com.facebook.appevents.l
            r5 = 3
            r3.<init>(r5)
            c00.C13720d.m34276f(r2, r4, r3, r6)
        L_0x00cc:
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse> r1 = r1.itineraries
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r1.size()
            r5.<init>(r2)
            java.util.Iterator r17 = r1.iterator()
        L_0x00db:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x013f
            java.lang.Object r1 = r17.next()
            r4 = r1
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse r4 = (com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse) r4
            tp.f r2 = r8.f51728w
            q00.a r3 = r8.f51729x
            java.util.HashMap r1 = r8.f51730y
            r18 = r1
            r1 = r9
            r14 = r5
            r5 = r18
            r7 = r6
            r6 = r22
            com.moovit.itinerary.TripPlanResult r1 = com.moovit.itinerary.C16080a.m40956l(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.mo48273b()
            if (r2 != 0) goto L_0x0127
            com.moovit.itinerary.model.TripPlanConfig r2 = r1.f41851b
            if (r2 == 0) goto L_0x0107
            r2 = 1
            goto L_0x0108
        L_0x0107:
            r2 = 0
        L_0x0108:
            if (r2 != 0) goto L_0x0127
            zz.i0<com.moovit.network.model.ServerId, java.lang.Integer> r2 = r1.f41853d
            if (r2 == 0) goto L_0x0110
            r2 = 1
            goto L_0x0111
        L_0x0110:
            r2 = 0
        L_0x0111:
            if (r2 != 0) goto L_0x0127
            com.moovit.itinerary.TripPlanTodBanner r2 = r1.f41854e
            if (r2 == 0) goto L_0x0119
            r2 = 1
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            if (r2 != 0) goto L_0x0127
            com.moovit.itinerary.TripPlanFlexTimeBanner r2 = r1.f41855f
            if (r2 == 0) goto L_0x0122
            r2 = 1
            goto L_0x0123
        L_0x0122:
            r2 = 0
        L_0x0123:
            if (r2 != 0) goto L_0x0127
            r2 = 1
            goto L_0x0128
        L_0x0127:
            r2 = 0
        L_0x0128:
            if (r2 == 0) goto L_0x012b
            goto L_0x0139
        L_0x012b:
            boolean r2 = r1.mo48273b()
            if (r2 == 0) goto L_0x0136
            com.moovit.itinerary.model.Itinerary r2 = r1.f41852c
            r10.mo49471a(r2)
        L_0x0136:
            r14.add(r1)
        L_0x0139:
            r6 = r7
            r5 = r14
            r14 = 1
            r7 = r22
            goto L_0x00db
        L_0x013f:
            r14 = r5
            r7 = r6
            com.moovit.suggestedroutes.TripPlanParams$d r1 = new com.moovit.suggestedroutes.TripPlanParams$d
            r1.<init>()
            r1.f23790a = r11
            r1.f23791b = r12
            r1.f23222c = r13
            r1.f23223d = r15
            r1.mo23959b(r7)
            r1.f23225f = r14
            com.moovit.suggestedroutes.TripPlanParams r1 = r1.mo23958a()
            r0.f51731m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p900wt.C20418h.mo40712p(c70.a, org.apache.thrift.TBase, i30.d):void");
    }
}
