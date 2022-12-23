package e20;

import ce0.C21100e;
import com.moovit.itinerary.TripPlanFlexTimeBanner;
import com.moovit.itinerary.TripPlanResult;
import com.moovit.itinerary.TripPlanTodBanner;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItinerarySection;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p241s0.C6313h;
import p572iw.C17666h;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import p977zz.C20944i0;
import z20.C20806a;

/* renamed from: e20.s */
public abstract class C16794s implements C20437h<C16792q, C16793r> {

    /* renamed from: b */
    public TripPlanConfig f43726b = null;

    /* renamed from: c */
    public final ArrayList f43727c = new ArrayList();

    /* renamed from: d */
    public TripPlanFlexTimeBanner f43728d = null;

    /* renamed from: e */
    public final ArrayList f43729e = new ArrayList();

    /* renamed from: f */
    public final C6313h<ServerId, Integer> f43730f = new C6313h<>();

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo313a(p906wz.C20431c r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            e20.q r1 = (e20.C16792q) r1
            com.moovit.itinerary.model.TripPlanConfig r7 = r0.f43726b
            java.util.ArrayList r9 = r0.f43729e
            r2 = r0
            iw.h$f r2 = (p572iw.C17666h.C17672f) r2
            iw.h r3 = p572iw.C17666h.this
            r4 = 0
            r3.f45404B = r4
            r3.mo50121K2()
            iw.h r3 = p572iw.C17666h.this
            androidx.fragment.app.FragmentActivity r10 = r3.getActivity()
            iw.h r3 = p572iw.C17666h.this
            com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r3 = r3.f40516o
            if (r10 == 0) goto L_0x026d
            if (r7 == 0) goto L_0x026d
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L_0x026d
            if (r3 != 0) goto L_0x002d
            goto L_0x026d
        L_0x002d:
            com.moovit.transit.Journey r6 = new com.moovit.transit.Journey
            com.moovit.transit.LocationDescriptor r5 = r1.f43714E
            com.moovit.transit.LocationDescriptor r8 = r1.f43715F
            r6.<init>(r5, r8)
            android.content.Context r1 = r1.f51759b
            O r11 = r3.f40519d
            com.moovit.app.suggestedroutes.TripPlanOptions r11 = (com.moovit.app.suggestedroutes.TripPlanOptions) r11
            com.moovit.commons.geo.LatLonE6 r12 = r8.mo24310d()
            iw.h r13 = p572iw.C17666h.this
            z20.a$a r14 = new z20.a$a
            java.lang.String r15 = "suggested_routes_view"
            r14.<init>(r15)
            com.moovit.tripplanner.TripPlannerTime r15 = r11.f39803b
            long r15 = r15.mo24487b()
            r17 = 0
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 < 0) goto L_0x0060
            java.text.SimpleDateFormat r4 = z20.C20806a.C20807a.f52522e
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            java.lang.String r4 = r4.format(r15)
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            java.lang.String r15 = "selected_time"
            r14.mo52934b(r4, r15)
            com.moovit.tripplanner.TripPlannerTime r4 = r11.f39803b
            boolean r11 = r4.mo24489d()
            r15 = 1
            if (r11 == 0) goto L_0x0072
            java.lang.String r4 = "now"
            goto L_0x008e
        L_0x0072:
            int[] r11 = x20.C20447a.f51790c
            com.moovit.tripplanner.TripPlannerTime$Type r4 = r4.f23799b
            int r4 = r4.ordinal()
            r4 = r11[r4]
            if (r4 == r15) goto L_0x008c
            r11 = 2
            if (r4 == r11) goto L_0x0089
            r11 = 3
            if (r4 == r11) goto L_0x0086
            r4 = 0
            goto L_0x008e
        L_0x0086:
            java.lang.String r4 = "last"
            goto L_0x008e
        L_0x0089:
            java.lang.String r4 = "arrive"
            goto L_0x008e
        L_0x008c:
            java.lang.String r4 = "depart"
        L_0x008e:
            java.lang.String r11 = "type"
            r14.mo52934b(r4, r11)
            java.lang.String r4 = r5.mo24313f()
            java.lang.String r5 = "origin_address"
            r14.mo52934b(r4, r5)
            java.lang.String r4 = r8.mo24313f()
            java.lang.String r5 = "destination_address"
            r14.mo52934b(r4, r5)
            double r4 = r12.mo46922k()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.String r5 = "dest_lat"
            r14.mo52934b(r4, r5)
            double r4 = r12.mo46926o()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.String r5 = "dest_lon"
            r14.mo52934b(r4, r5)
            int r4 = r9.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "count"
            r14.mo52934b(r4, r5)
            int r4 = p572iw.C17666h.f45402O
            java.util.Set r1 = p924xt.C20598h.m48400s2(r1, r9)
            java.lang.String r1 = p977zz.C20957p.m49075a(r1)
            java.lang.String r4 = "provider_id"
            r14.mo52934b(r1, r4)
            r1 = 30
            r14.f52526d = r1
            z20.a r1 = r14.mo52933a()
            com.moovit.marketing.MarketingEventImpressionBinder.m41586a(r13, r1)
            iw.h r1 = p572iw.C17666h.this
            android.content.Context r4 = r1.getContext()
            if (r4 == 0) goto L_0x023a
            boolean r4 = r1.isResumed()
            if (r4 != 0) goto L_0x00f6
            goto L_0x023a
        L_0x00f6:
            r4 = 23
            boolean r4 = p977zz.C20943i.m49051d(r4)
            if (r4 != 0) goto L_0x00ff
            goto L_0x010e
        L_0x00ff:
            iw.h$a r4 = r1.f45411I
            r4.mo50127b()
            iw.h$b r4 = r1.f45412J
            r4.mo50127b()
            iw.h$c r4 = r1.f45413K
            r4.mo50127b()
        L_0x010e:
            androidx.fragment.app.FragmentManager r4 = r1.getFragmentManager()
            com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r5 = r1.f40516o
            java.lang.String r8 = "TRIP_PLANNER_CONFIGURATION"
            java.lang.Object r11 = r1.mo46776J1(r8)
            v90.a r11 = (v90.C13187a) r11
            r12 = 0
            if (r4 == 0) goto L_0x01a9
            if (r5 == 0) goto L_0x01a9
            java.lang.String r13 = "CONFIGURATION"
            java.lang.Object r13 = r1.mo46776J1(r13)
            q00.a r13 = (q00.C19047a) r13
            r00.a r14 = p874vr.C20199a.f51305w0
            java.lang.Object r13 = r13.mo51505b(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0138
            goto L_0x01a9
        L_0x0138:
            android.content.Context r13 = r1.requireContext()
            com.moovit.app.tracking.TrackingEvent r14 = com.moovit.app.tracking.TrackingEvent.TRIP_PLAN_TRANSPORT_TYPE_DIALOG_DISPLAYED
            java.lang.String r15 = "events_tracker_store"
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r15, r12)
            java.lang.String r0 = r14.getPrefsKey()
            int r0 = r13.getInt(r0, r12)
            int r13 = r14.getMaxOccurrences()
            if (r0 < r13) goto L_0x0154
            r0 = 1
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r0 == 0) goto L_0x0158
            goto L_0x01a9
        L_0x0158:
            java.util.List<com.moovit.tripplanner.TripPlannerTransportTypeInfo> r0 = r11.f32742c
            O r5 = r5.f40519d
            com.moovit.app.suggestedroutes.TripPlanOptions r5 = (com.moovit.app.suggestedroutes.TripPlanOptions) r5
            java.util.Set<com.moovit.tripplanner.TripPlannerTransportType> r5 = r5.f39805d
            int r11 = p808sx.C19572h.f49749k
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.util.ArrayList r0 = c00.C13717b.m34264k(r0)
            java.lang.String r13 = "availableTransportTypes"
            r11.putParcelableArrayList(r13, r0)
            java.util.ArrayList r0 = c00.C13717b.m34264k(r5)
            java.lang.String r5 = "selectedTransportTypes"
            r11.putParcelableArrayList(r5, r0)
            sx.h r0 = new sx.h
            r0.<init>()
            r0.setArguments(r11)
            java.lang.String r5 = "trip_plan_transport_types_fragment_tag"
            r0.show((androidx.fragment.app.FragmentManager) r4, (java.lang.String) r5)
            android.content.Context r0 = r1.requireContext()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r15, r12)
            java.lang.String r4 = r14.getPrefsKey()
            int r4 = r0.getInt(r4, r12)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r5 = r14.getPrefsKey()
            r11 = 1
            int r4 = r4 + r11
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r4)
            r0.apply()
            r11 = 1
            goto L_0x01aa
        L_0x01a9:
            r11 = 0
        L_0x01aa:
            if (r11 != 0) goto L_0x021d
            android.view.View r0 = r1.getView()
            androidx.fragment.app.FragmentManager r4 = r1.getFragmentManager()
            com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r5 = r1.f40516o
            java.lang.Object r8 = r1.mo46776J1(r8)
            v90.a r8 = (v90.C13187a) r8
            if (r0 == 0) goto L_0x021d
            if (r4 == 0) goto L_0x021d
            if (r5 == 0) goto L_0x021d
            O r4 = r5.f40519d
            com.moovit.app.suggestedroutes.TripPlanOptions r4 = (com.moovit.app.suggestedroutes.TripPlanOptions) r4
            java.util.Set<com.moovit.tripplanner.TripPlannerTransportType> r4 = r4.f39805d
            java.util.List<com.moovit.tripplanner.TripPlannerTransportTypeInfo> r5 = r8.f32742c
            tu.h r8 = new tu.h
            r11 = 2
            r8.<init>(r4, r11)
            int r4 = c00.C13723g.m34281b(r5, r8)
            int r5 = r5.size()
            int r5 = r5 - r4
            if (r5 != 0) goto L_0x01dc
            goto L_0x021d
        L_0x01dc:
            oy.a r4 = p716oy.C18860a.m45884a()
            com.moovit.tripplanner.TripPlannerAlgorithmType r4 = r4.f48028p
            com.moovit.tripplanner.TripPlannerAlgorithmType r8 = com.moovit.tripplanner.TripPlannerAlgorithmType.PREFERRED
            if (r4 != r8) goto L_0x01ea
            r4 = 2131889337(0x7f120cb9, float:1.9413335E38)
            goto L_0x01ed
        L_0x01ea:
            r4 = 2131889325(0x7f120cad, float:1.941331E38)
        L_0x01ed:
            r8 = 5000(0x1388, float:7.006E-42)
            com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.m35159l(r0, r4, r8)
            r4 = 2131886132(0x7f120034, float:1.9406834E38)
            com.google.android.exoplayer2.ui.r r8 = new com.google.android.exoplayer2.ui.r
            r11 = 21
            r8.<init>(r1, r11)
            r0.mo42256m(r4, r8)
            r0.mo42259p()
            hq.b$a r0 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.MESSAGE_BAR_SHOWN
            r0.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r8 = "search_filters_on"
            r0.mo49939g(r4, r8)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.COUNT
            r0.mo49935c(r4, r5)
            hq.b r0 = r0.mo49933a()
            r1.mo46797j2(r0)
        L_0x021d:
            A r0 = r1.f40822c
            w40.d r4 = w40.C25761d.m64299a()
            com.google.android.gms.tasks.Task r4 = r4.mo83587b(r12)
            com.moovit.app.ads.n r5 = new com.moovit.app.ads.n
            r8 = 3
            r5.<init>(r1, r8)
            com.google.android.gms.tasks.Task r4 = r4.addOnSuccessListener((android.app.Activity) r0, r5)
            nu.c r5 = new nu.c
            r8 = 1
            r5.<init>(r1, r8)
            r4.addOnFailureListener((android.app.Activity) r0, (com.google.android.gms.tasks.OnFailureListener) r5)
        L_0x023a:
            iw.h r0 = p572iw.C17666h.this
            r0.mo50120J2(r7)
            com.moovit.app.history.model.TripPlanHistoryItem r0 = new com.moovit.app.history.model.TripPlanHistoryItem
            O r1 = r3.f40519d
            r8 = r1
            com.moovit.app.suggestedroutes.TripPlanOptions r8 = (com.moovit.app.suggestedroutes.TripPlanOptions) r8
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r3 = r1.toString()
            long r4 = java.lang.System.currentTimeMillis()
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9)
            java.lang.String r1 = "history_controller"
            java.lang.Object r1 = r10.getSystemService(r1)
            at.c r1 = (p372at.C13516c) r1
            com.google.android.gms.tasks.Task r1 = r1.mo40408a(r0)
            java.util.concurrent.Executor r2 = android.os.AsyncTask.SERIAL_EXECUTOR
            at.b r3 = new at.b
            r4 = 2
            r3.<init>(r0, r4)
            r1.addOnSuccessListener((java.util.concurrent.Executor) r2, r3)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e20.C16794s.mo313a(wz.c, boolean):void");
    }

    /* renamed from: b */
    public final boolean mo49474b(TripPlanConfig tripPlanConfig) {
        boolean z = false;
        for (ItinerarySection next : tripPlanConfig.f41932b) {
            Integer orDefault = this.f43730f.getOrDefault(next.f41913b, null);
            if (!(orDefault == null || orDefault.intValue() == next.f41918g)) {
                next.f41918g = orDefault.intValue();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        C16792q qVar = (C16792q) cVar;
        TripPlanResult tripPlanResult = ((C16793r) gVar).f43725m;
        if (tripPlanResult.mo48273b()) {
            Itinerary itinerary = tripPlanResult.f41852c;
            this.f43729e.add(itinerary);
            if (this.f43726b != null) {
                C17666h hVar = C17666h.this;
                hVar.mo52809r2(itinerary);
                hVar.mo52807F2();
                return;
            }
            return;
        }
        TripPlanConfig tripPlanConfig = tripPlanResult.f41851b;
        boolean z4 = true;
        if (tripPlanConfig != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C21100e.m49373x(tripPlanConfig, "config");
            this.f43726b = tripPlanConfig;
            mo49474b(tripPlanConfig);
            List unmodifiableList = Collections.unmodifiableList(this.f43729e);
            List unmodifiableList2 = Collections.unmodifiableList(this.f43727c);
            TripPlanFlexTimeBanner tripPlanFlexTimeBanner = this.f43728d;
            C17666h.C17672f fVar = (C17666h.C17672f) this;
            C17666h.this.mo52808q2(unmodifiableList);
            C17666h hVar2 = C17666h.this;
            hVar2.f52102t.addAll(unmodifiableList2);
            hVar2.mo52807F2();
            C17666h.this.mo52803A2(tripPlanFlexTimeBanner);
            C17666h.this.mo52810z2(tripPlanConfig);
            return;
        }
        C20944i0<ServerId, Integer> i0Var = tripPlanResult.f41853d;
        if (i0Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ServerId serverId = (ServerId) i0Var.f52692a;
            Integer orDefault = this.f43730f.getOrDefault(serverId, null);
            if (orDefault == null) {
                i = ((Integer) i0Var.f52693b).intValue();
            } else {
                i = Math.max(orDefault.intValue(), ((Integer) i0Var.f52693b).intValue());
            }
            this.f43730f.put(serverId, Integer.valueOf(i));
            TripPlanConfig tripPlanConfig2 = this.f43726b;
            if (tripPlanConfig2 != null && mo49474b(tripPlanConfig2)) {
                C17666h.this.mo52810z2(this.f43726b);
                return;
            }
            return;
        }
        TripPlanTodBanner tripPlanTodBanner = tripPlanResult.f41854e;
        if (tripPlanTodBanner != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f43727c.add(tripPlanTodBanner);
            if (this.f43726b != null) {
                C17666h.C17672f fVar2 = (C17666h.C17672f) this;
                String str = tripPlanTodBanner.f41864i;
                if (str != null) {
                    C20806a.C20807a aVar = new C20806a.C20807a("tod_banner_view");
                    aVar.mo52934b(str, "item_id");
                    aVar.mo52935c();
                }
                C17666h hVar3 = C17666h.this;
                hVar3.f52102t.add(tripPlanTodBanner);
                hVar3.mo52807F2();
                return;
            }
            return;
        }
        TripPlanFlexTimeBanner tripPlanFlexTimeBanner2 = tripPlanResult.f41855f;
        if (tripPlanFlexTimeBanner2 == null) {
            z4 = false;
        }
        if (z4) {
            this.f43728d = tripPlanFlexTimeBanner2;
            if (this.f43726b != null) {
                C17666h.this.mo52803A2(tripPlanFlexTimeBanner2);
            }
        }
    }
}
