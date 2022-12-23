package j20;

import aa0.C7530f;
import com.google.android.gms.tasks.Continuation;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import java.util.Collections;
import java.util.List;

/* renamed from: j20.c */
public final class C17706c implements Continuation<C17707d, C17707d> {
    /* renamed from: a */
    public static LocationDescriptor m43899a(LocationDescriptor locationDescriptor, List<LocationDescriptor> list) {
        if (list.isEmpty()) {
            return null;
        }
        LatLonE6 d = locationDescriptor.mo24310d();
        if (list.size() == 1 || d == null) {
            return list.get(0);
        }
        return (LocationDescriptor) Collections.min(list, C7530f.m17270c(d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r10) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r10.isSuccessful()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r10 = r10.getResult()
            j20.d r10 = (j20.C17707d) r10
            if (r10 == 0) goto L_0x014d
            int r0 = r10.f45452c
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0016
            goto L_0x0064
        L_0x0016:
            java.util.List<com.moovit.transit.LocationDescriptor> r0 = r10.f45453d
            boolean r0 = c00.C13717b.m34258e(r0)
            if (r0 == 0) goto L_0x001f
            goto L_0x0064
        L_0x001f:
            int r0 = r10.f45452c
            if (r0 != r2) goto L_0x0032
            com.moovit.transit.LocationDescriptor r0 = r10.f45450a
            java.util.List<com.moovit.transit.LocationDescriptor> r4 = r10.f45453d
            com.moovit.transit.LocationDescriptor r0 = m43899a(r0, r4)
            j20.d r4 = new j20.d
            r4.<init>(r10, r0)
        L_0x0030:
            r10 = r4
            goto L_0x0064
        L_0x0032:
            if (r0 != r1) goto L_0x0138
            com.moovit.transit.LocationDescriptor r0 = r10.f45450a
            java.util.List<com.moovit.transit.LocationDescriptor> r4 = r10.f45453d
            com.moovit.transit.LocationDescriptor r0 = m43899a(r0, r4)
            com.moovit.transit.LocationDescriptor r4 = r10.f45450a
            if (r0 != 0) goto L_0x0041
            goto L_0x005b
        L_0x0041:
            com.moovit.commons.geo.LatLonE6 r5 = r0.mo24310d()
            if (r5 != 0) goto L_0x0048
            goto L_0x005b
        L_0x0048:
            com.moovit.commons.geo.LatLonE6 r4 = r4.mo24310d()
            r4.getClass()
            float r4 = com.moovit.commons.geo.LatLonE6.m40174c(r4, r5)
            r5 = 1120403456(0x42c80000, float:100.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 == 0) goto L_0x0064
            j20.d r4 = new j20.d
            r4.<init>(r10, r0)
            goto L_0x0030
        L_0x0064:
            int r0 = r10.f45452c
            if (r0 != 0) goto L_0x006a
            goto L_0x0137
        L_0x006a:
            hq.b$a r0 = new hq.b$a
            int r4 = r10.f45452c
            if (r4 != r1) goto L_0x0073
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.REVERSE_GEOCODER
            goto L_0x0075
        L_0x0073:
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.FORWARD_GEOCODER
        L_0x0075:
            r0.<init>(r1)
            com.moovit.transit.LocationDescriptor r1 = r10.f45450a
            java.lang.String r1 = r1.mo24313f()
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.GEOCODER_ENGINE
            java.lang.String r5 = r10.f45451b
            r0.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.QUERY_STRING
            boolean r5 = p977zz.C20964s0.m49090h(r1)
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x008e:
            r0.mo49939g(r4, r1)
            com.moovit.transit.LocationDescriptor r1 = r10.f45450a
            com.moovit.network.model.ServerId r4 = r1.f23649d
            if (r4 == 0) goto L_0x009c
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.ID
            r0.mo49937e(r5, r4)
        L_0x009c:
            com.moovit.transit.LocationDescriptor$LocationType r4 = r1.f23647b
            if (r4 == 0) goto L_0x00ad
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            com.tranzmate.moovit.protocol.common.MVLocationType r4 = c70.C13749c.m34337w(r4)
            java.lang.String r4 = r4.name()
            r0.mo49939g(r5, r4)
        L_0x00ad:
            com.moovit.transit.LocationDescriptor$SourceType r4 = r1.f23648c
            if (r4 == 0) goto L_0x00be
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.SOURCE
            com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType r4 = c70.C13749c.m34336v(r4)
            java.lang.String r4 = r4.name()
            r0.mo49939g(r5, r4)
        L_0x00be:
            com.moovit.commons.geo.LatLonE6 r4 = r1.f23654i
            if (r4 == 0) goto L_0x00cb
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.INACCURATE_COORDS
            java.lang.String r6 = r4.mo46923l()
            r0.mo49939g(r5, r6)
        L_0x00cb:
            com.moovit.commons.geo.LatLonE6 r1 = r1.f23653h
            if (r1 == 0) goto L_0x00d8
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.ACCURATE_COORDS
            java.lang.String r1 = r1.mo46923l()
            r0.mo49939g(r5, r1)
        L_0x00d8:
            java.util.List<com.moovit.transit.LocationDescriptor> r1 = r10.f45453d
            com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.LOCATIONS_COUNT
            if (r1 != 0) goto L_0x00e0
            r6 = 0
            goto L_0x00e4
        L_0x00e0:
            int r6 = r1.size()
        L_0x00e4:
            r0.mo49935c(r5, r6)
            com.moovit.transit.LocationDescriptor r5 = r10.f45454e
            if (r5 == 0) goto L_0x011f
            com.moovit.commons.geo.LatLonE6 r6 = r5.f23653h
            if (r6 == 0) goto L_0x00f8
            com.moovit.analytics.AnalyticsAttributeKey r7 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_LOCATION
            java.lang.String r8 = r6.mo46923l()
            r0.mo49939g(r7, r8)
        L_0x00f8:
            java.lang.String r7 = r5.mo24313f()
            boolean r8 = p977zz.C20964s0.m49090h(r7)
            if (r8 != 0) goto L_0x0107
            com.moovit.analytics.AnalyticsAttributeKey r8 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_CAPTION
            r0.mo49939g(r8, r7)
        L_0x0107:
            if (r1 == 0) goto L_0x0112
            com.moovit.analytics.AnalyticsAttributeKey r7 = com.moovit.analytics.AnalyticsAttributeKey.SELECTED_INDEX
            int r1 = r1.indexOf(r5)
            r0.mo49935c(r7, r1)
        L_0x0112:
            if (r4 == 0) goto L_0x011f
            if (r6 == 0) goto L_0x011f
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.DISTANCE
            float r4 = com.moovit.commons.geo.LatLonE6.m40174c(r4, r6)
            r0.mo49934b(r1, r4)
        L_0x011f:
            com.moovit.MoovitApplication<?, ?, ?> r1 = com.moovit.MoovitApplication.f37317k
            tp.i r4 = r1.mo44558j()
            u2.a r4 = r4.f50173c
            com.moovit.analytics.AnalyticsFlowKey r5 = com.moovit.analytics.AnalyticsFlowKey.APP
            hq.b[] r2 = new p543hq.C17474b[r2]
            hq.b r0 = r0.mo49933a()
            r2[r3] = r0
            r4.getClass()
            p269u2.C6677a.m15759j(r1, r5, r3, r2)
        L_0x0137:
            return r10
        L_0x0138:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown geocoding type: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            int r10 = r10.f45452c
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x014d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing geocoder result!"
            r10.<init>(r0)
            throw r10
        L_0x0155:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Exception r10 = r10.getException()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j20.C17706c.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
