package p948yu;

import android.content.Context;
import android.os.Handler;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import e20.C16769e;

/* renamed from: yu.a */
public final class C20768a extends C16769e {

    /* renamed from: m */
    public final /* synthetic */ ItineraryNavigable f52408m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20768a(ItineraryNavigable itineraryNavigable, Context context, Handler handler, long j) {
        super(context, handler, j);
        this.f52408m = itineraryNavigable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.moovit.itinerary.model.leg.Leg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.moovit.itinerary.model.leg.WaitToTransitLineLeg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45154f(e20.C16769e.C16772c r12) {
        /*
            r11 = this;
            com.moovit.app.navigation.itinerary.ItineraryNavigable r0 = r11.f52408m
            android.net.Uri r1 = com.moovit.app.navigation.itinerary.ItineraryNavigable.f39144t
            com.moovit.navigation.event.NavigationProgressEvent r1 = r0.f15016c
            if (r1 != 0) goto L_0x000a
            goto L_0x00e8
        L_0x000a:
            int r1 = r1.f15112c
            com.moovit.itinerary.model.Itinerary r2 = r0.f39149j
            java.util.List r2 = r2.mo48295u0()
            java.lang.Object r2 = r2.get(r1)
            com.moovit.itinerary.model.leg.Leg r2 = (com.moovit.itinerary.model.leg.Leg) r2
            int r3 = r2.getType()
            r4 = 10
            r5 = 3
            r6 = 1
            if (r3 == r5) goto L_0x002b
            int r3 = r2.getType()
            if (r3 != r4) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r3 = 0
            goto L_0x002c
        L_0x002b:
            r3 = 1
        L_0x002c:
            oy.a r7 = p716oy.C18860a.m45884a()
            boolean r7 = r7.f48029q
            com.moovit.transit.Schedule r12 = e20.C16783l.m42491w(r12, r2, r7)
            r2 = 0
            if (r12 == 0) goto L_0x003e
            com.moovit.util.time.Time r12 = r12.mo24326m()
            goto L_0x003f
        L_0x003e:
            r12 = r2
        L_0x003f:
            d40.g r7 = r0.f15015b
            boolean r7 = p877vu.C20233c.m47801b(r7)
            if (r7 == 0) goto L_0x00e8
            if (r3 == 0) goto L_0x00e8
            if (r12 == 0) goto L_0x00e8
            boolean r3 = r12.mo24633j()
            if (r3 == 0) goto L_0x00e8
            android.util.SparseBooleanArray r3 = r0.f39158s
            boolean r3 = r3.get(r1)
            if (r3 != 0) goto L_0x00e3
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r12.mo24631g()
            long r7 = com.moovit.util.time.C7925b.m18026n(r7, r9)
            r9 = 1
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x00e3
            android.util.SparseBooleanArray r12 = r0.f39158s
            r12.put(r1, r6)
            d40.g r12 = r0.f15015b
            com.moovit.itinerary.model.Itinerary r3 = r0.f39149j
            java.util.List r3 = r3.mo48295u0()
            java.lang.Object r3 = r3.get(r1)
            com.moovit.itinerary.model.leg.Leg r3 = (com.moovit.itinerary.model.leg.Leg) r3
            int r7 = r3.getType()
            if (r7 != r5) goto L_0x0088
            r2 = r3
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r2 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r2
            goto L_0x0094
        L_0x0088:
            int r5 = r3.getType()
            if (r5 != r4) goto L_0x0094
            com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg r3 = (com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg) r3
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r2 = r3.mo48467b()
        L_0x0094:
            if (r2 != 0) goto L_0x0097
            goto L_0x00ad
        L_0x0097:
            hy.b r3 = new hy.b
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r2 = r2.f42135f
            j40.a r2 = r2.get()
            com.moovit.transit.TransitLine r2 = (com.moovit.transit.TransitLine) r2
            r3.<init>((d40.C4351g) r12, (com.moovit.transit.TransitLine) r2)
            com.moovit.navigation.event.NavigationProgressEvent r2 = r0.f15016c
            android.app.PendingIntent r2 = r0.mo45654f(r12, r2, r1)
            r0.mo19607d(r12, r3, r2, r6)
        L_0x00ad:
            d40.g r12 = r0.f15015b
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r3 = com.moovit.analytics.AnalyticsEventKey.NAVIGATION_PROGRESS_CHANGED
            r2.<init>(r3)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.NAVIGABLE_ID
            java.lang.String r4 = r0.f39150k
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.NAVIGATION_PROGRESS_TYPE
            java.lang.String r4 = "line_is_approaching"
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_STEP_TYPE
            java.lang.String r4 = "wait_step"
            r2.mo49939g(r3, r4)
            com.moovit.analytics.AnalyticsAttributeKey r3 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_STEP_INDEX
            int r1 = r1 + r6
            r2.mo49935c(r3, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.BATTERY_CONSUMPTION
            d40.g r3 = r0.f15015b
            float r3 = p977zz.C20975x0.m49120g(r3)
            r2.mo49934b(r1, r3)
            hq.b r1 = r2.mo49933a()
            r12.mo19856f(r1)
        L_0x00e3:
            d40.g r12 = r0.f15015b
            r12.mo19860j()
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p948yu.C20768a.mo45154f(e20.e$c):void");
    }
}
