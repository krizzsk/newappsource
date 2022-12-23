package p596jx;

import c70.C13780t;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse;
import p502fx.C17122g;

/* renamed from: jx.u */
public final class C17973u extends C13780t<C17972t, C17973u, MVTodRideRealTimeInfoResponse> {

    /* renamed from: m */
    public C17122g f46055m = null;

    /* renamed from: n */
    public String f46056n = null;

    public C17973u() {
        super(MVTodRideRealTimeInfoResponse.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5816m(c70.C13746a r6, org.apache.thrift.TBase r7) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r5 = this;
            jx.t r6 = (p596jx.C17972t) r6
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse r7 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse) r7
            RQ r6 = r5.f51773b
            android.content.Context r6 = r6.f51759b
            F r0 = r7.setField_
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse$_Fields r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse._Fields.INFO
            r2 = 1
            if (r0 != r1) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            r4 = 0
            if (r3 == 0) goto L_0x003d
            if (r0 != r1) goto L_0x0020
            java.lang.Object r0 = r7.value_
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo r0 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo) r0
            fx.g r0 = p596jx.C17964m.m44597d(r6, r0)
            goto L_0x003e
        L_0x0020:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'info' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r7 = r7.setField_
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse$_Fields r7 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse._Fields) r7
            vi0.c r7 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse.m29408k(r7)
            java.lang.String r7 = r7.f63355a
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x003d:
            r0 = r4
        L_0x003e:
            r5.f46055m = r0
            F r1 = r7.setField_
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse$_Fields r3 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse._Fields.NEW_RIDE_ID
            if (r1 != r3) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x006f
            if (r1 != r3) goto L_0x0052
            java.lang.Object r7 = r7.value_
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x006f
        L_0x0052:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'newRideId' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r7 = r7.setField_
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse$_Fields r7 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse._Fields) r7
            vi0.c r7 = com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoResponse.m29408k(r7)
            java.lang.String r7 = r7.f63355a
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x006f:
            r5.f46056n = r4
            if (r0 != 0) goto L_0x007e
            if (r4 == 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            com.moovit.commons.request.BadResponseException r6 = new com.moovit.commons.request.BadResponseException
            java.lang.String r7 = "realTimeInfo nor rideId must not be null!"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x007e:
            if (r4 == 0) goto L_0x0085
            java.lang.String r7 = "com.moovit.tod_rides_provider.action.reassign"
            com.moovit.app.tod.TodRidesProvider.m39562d(r6, r7)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p596jx.C17973u.mo5816m(c70.a, org.apache.thrift.TBase):void");
    }
}
