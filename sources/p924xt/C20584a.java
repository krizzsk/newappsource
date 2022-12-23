package p924xt;

import a00.C13382a;
import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.network.model.ServerId;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleAttributes;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import ja0.C12797f;
import java.util.EnumSet;
import java.util.Iterator;
import p115i0.C5227c;
import p373au.C13527c;
import p716oy.C18860a;
import p924xt.C20590e;
import p952yy.C20787c;

/* renamed from: xt.a */
public abstract class C20584a extends C20589d {

    /* renamed from: c */
    public static final /* synthetic */ int f52069c = 0;

    /* renamed from: xt.a$a */
    public static class C20585a implements Leg.C16144a<Boolean> {

        /* renamed from: c */
        public static final EnumSet f52070c = EnumSet.of(CongestionLevel.FULL, CongestionLevel.PACKED);

        /* renamed from: b */
        public final C16769e.C16772c f52071b;

        public C20585a(C16769e.C16772c cVar) {
            this.f52071b = cVar;
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            for (WaitToTransitLineLeg next : waitToMultiTransitLinesLeg.f42117b) {
                Boolean bool = Boolean.TRUE;
                next.getClass();
                if (bool.equals(mo39915g(next))) {
                    return bool;
                }
            }
            return Boolean.FALSE;
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            for (TransitLineLeg next : multiTransitLinesLeg.f42086b) {
                Boolean bool = Boolean.TRUE;
                next.getClass();
                if (bool.equals(mo39922n(next))) {
                    return bool;
                }
            }
            return Boolean.FALSE;
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            Time time;
            ServerId serverId = waitToTransitLineLeg.f42135f.getServerId();
            ServerId serverId2 = waitToTransitLineLeg.f42136g.getServerId();
            ServerId serverId3 = waitToTransitLineLeg.f42137h.getServerId();
            if (C18860a.m45884a().f48029q) {
                time = C16783l.m42482n(waitToTransitLineLeg.f42132c);
            } else {
                time = null;
            }
            return Boolean.valueOf(mo52785o(serverId, serverId2, serverId3, time));
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            Time time;
            ServerId serverId = transitLineLeg.f42110d.getServerId();
            ServerId serverId2 = transitLineLeg.mo48460c().getServerId();
            ServerId serverId3 = transitLineLeg.mo48459b().getServerId();
            if (C18860a.m45884a().f48029q) {
                time = C16783l.m42482n(transitLineLeg.f42108b);
            } else {
                time = null;
            }
            return Boolean.valueOf(mo52785o(serverId, serverId2, serverId3, time));
        }

        /* renamed from: o */
        public final boolean mo52785o(ServerId serverId, ServerId serverId2, ServerId serverId3, Time time) {
            C20787c b;
            C16769e.C16772c cVar = this.f52071b;
            if (cVar == null || (b = cVar.mo49467b(serverId, serverId2, serverId3, time)) == null) {
                return false;
            }
            Iterator<Time> it = b.f52458c.iterator();
            while (it.hasNext()) {
                TimeVehicleAttributes timeVehicleAttributes = it.next().f23913n;
                if (timeVehicleAttributes != null && f52070c.contains(timeVehicleAttributes.f23919c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return Boolean.FALSE;
        }
    }

    public C20584a(int i) {
        super(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.moovit.transit.Schedule} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.moovit.transit.Schedule} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SwitchIntDef"})
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48334o(ja0.C12797f r12, com.moovit.itinerary.model.Itinerary r13, e20.C16769e.C16772c r14) {
        /*
            android.content.Context r1 = r12.mo39638e()
            r0 = 5
            int[] r2 = new int[r0]
            r2 = {3, 10, 5, 12, 18} // fill-array
            lu.b r3 = e20.C16783l.f43688a
            java.util.List r3 = r13.mo48295u0()
            r4 = -1
            com.moovit.itinerary.model.leg.Leg r2 = e20.C16783l.m42476h(r3, r4, r2)
            if (r2 == 0) goto L_0x001b
            int r4 = r2.getType()
        L_0x001b:
            r3 = 3
            r5 = 0
            if (r4 == r3) goto L_0x0100
            r6 = 0
            r7 = 1
            if (r4 == r0) goto L_0x0093
            r0 = 10
            if (r4 == r0) goto L_0x0077
            r0 = 12
            if (r4 == r0) goto L_0x0038
            r14 = 18
            if (r4 == r14) goto L_0x0032
            r13 = r5
            goto L_0x011a
        L_0x0032:
            android.text.SpannableStringBuilder r13 = m48335p(r1, r13, r5, r5)
            goto L_0x0117
        L_0x0038:
            com.moovit.itinerary.model.leg.BicycleRentalLeg r2 = (com.moovit.itinerary.model.leg.BicycleRentalLeg) r2
            com.moovit.database.DbEntityRef r0 = r2.mo48345c()
            if (r14 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x004f
            com.moovit.network.model.ServerId r0 = r0.getServerId()
            java.util.Map<com.moovit.network.model.ServerId, fz.e> r3 = r14.f43665c
            java.lang.Object r0 = r3.get(r0)
            fz.e r0 = (p504fz.C17133e) r0
            goto L_0x0050
        L_0x004f:
            r0 = r5
        L_0x0050:
            android.text.SpannableStringBuilder r13 = m48335p(r1, r13, r14, r0)
            xt.g r14 = p924xt.C20604l.f52116a
            com.moovit.database.DbEntityRef r14 = r2.mo48345c()
            if (r14 != 0) goto L_0x005e
            goto L_0x0117
        L_0x005e:
            j40.a r14 = r14.get()
            com.moovit.transit.BicycleStop r14 = (com.moovit.transit.BicycleStop) r14
            if (r14 != 0) goto L_0x0068
            goto L_0x0117
        L_0x0068:
            r0 = 2131888919(0x7f120b17, float:1.9412487E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r14 = r14.f23638d
            r2[r6] = r14
            java.lang.String r14 = r1.getString(r0, r2)
            goto L_0x0116
        L_0x0077:
            android.text.SpannableStringBuilder r13 = m48335p(r1, r13, r14, r5)
            if (r14 == 0) goto L_0x0087
            oy.a r0 = p716oy.C18860a.m45884a()
            boolean r0 = r0.f48029q
            com.moovit.transit.Schedule r5 = e20.C16783l.m42491w(r14, r2, r0)
        L_0x0087:
            com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg r2 = (com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg) r2
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r14 = r2.mo48467b()
            java.lang.CharSequence r14 = p924xt.C20604l.m48428e(r1, r14, r5)
            goto L_0x0116
        L_0x0093:
            android.text.SpannableStringBuilder r13 = m48335p(r1, r13, r14, r5)
            com.moovit.itinerary.model.leg.TaxiLeg r2 = (com.moovit.itinerary.model.leg.TaxiLeg) r2
            xt.g r14 = p924xt.C20604l.f52116a
            int r14 = r2.f42104i
            com.moovit.transit.LocationDescriptor r0 = r2.f42100e
            java.lang.String r8 = r0.mo24313f()
            boolean r0 = p977zz.C20964s0.m49090h(r8)
            if (r0 == 0) goto L_0x00aa
            goto L_0x0117
        L_0x00aa:
            android.os.Parcelable$Creator<com.moovit.app.taxi.providers.TaxiProvidersManager> r0 = com.moovit.app.taxi.providers.TaxiProvidersManager.CREATOR
            java.lang.String r0 = "taxi_providers_manager"
            java.lang.Object r0 = r1.getSystemService(r0)
            com.moovit.app.taxi.providers.TaxiProvidersManager r0 = (com.moovit.app.taxi.providers.TaxiProvidersManager) r0
            com.moovit.network.model.ServerId r3 = r2.f42097b
            com.moovit.app.taxi.providers.TaxiProvider r9 = r0.mo46163c(r3)
            if (r9 != 0) goto L_0x00bd
            goto L_0x0117
        L_0x00bd:
            r10 = 2
            if (r14 < 0) goto L_0x00e1
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = (long) r14
            long r4 = r0.toMillis(r4)
            long r4 = r4 + r2
            com.moovit.util.time.MinutesSpanFormatter r0 = com.moovit.util.time.C7925b.f23935b
            android.text.SpannableStringBuilder r14 = r0.mo24605e(r1, r2, r4)
            com.moovit.app.taxi.providers.TaxiTripPlanConfig r0 = r9.f39977l
            java.lang.String r0 = r0.f39989c
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r6] = r14
            r1[r7] = r8
            android.text.SpannedString r14 = p977zz.C20958p0.m49077a(r0, r1)
            goto L_0x0116
        L_0x00e1:
            com.moovit.app.taxi.providers.TaxiTripPlanConfig r14 = r9.f39977l
            java.lang.String r14 = r14.f39990d
            boolean r0 = p977zz.C20964s0.m49090h(r14)
            if (r0 != 0) goto L_0x0117
            com.moovit.util.time.Time r0 = r2.f42098c
            long r2 = r0.mo24631g()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = com.moovit.util.time.C7925b.m18018f(r1, r2, r6)
            r0[r6] = r1
            r0[r7] = r8
            android.text.SpannedString r14 = p977zz.C20958p0.m49077a(r14, r0)
            goto L_0x0116
        L_0x0100:
            android.text.SpannableStringBuilder r13 = m48335p(r1, r13, r14, r5)
            if (r14 == 0) goto L_0x0110
            oy.a r0 = p716oy.C18860a.m45884a()
            boolean r0 = r0.f48029q
            com.moovit.transit.Schedule r5 = e20.C16783l.m42491w(r14, r2, r0)
        L_0x0110:
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r2 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r2
            java.lang.CharSequence r14 = p924xt.C20604l.m48428e(r1, r2, r5)
        L_0x0116:
            r5 = r14
        L_0x0117:
            r11 = r5
            r5 = r13
            r13 = r11
        L_0x011a:
            r14 = 2131362040(0x7f0a00f8, float:1.834385E38)
            android.view.View r14 = r12.mo39639f(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 8
            if (r14 == 0) goto L_0x012a
            com.moovit.commons.utils.UiUtils.m40236D(r14, r5, r0)
        L_0x012a:
            r14 = 2131363503(0x7f0a06af, float:1.8346817E38)
            android.view.View r12 = r12.mo39639f(r14)
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x0138
            com.moovit.commons.utils.UiUtils.m40236D(r12, r13, r0)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p924xt.C20584a.m48334o(ja0.f, com.moovit.itinerary.model.Itinerary, e20.e$c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder m48335p(android.content.Context r9, com.moovit.itinerary.model.Itinerary r10, e20.C16769e.C16772c r11, p504fz.C17133e r12) {
        /*
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r7 = 0
            r8 = 1
            if (r11 == 0) goto L_0x0030
            xt.a$a r0 = new xt.a$a
            r0.<init>(r11)
            java.util.List r11 = r10.mo48295u0()
            java.util.Iterator r11 = r11.iterator()
        L_0x0016:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r11.next()
            com.moovit.itinerary.model.leg.Leg r1 = (com.moovit.itinerary.model.leg.Leg) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.mo48338i0(r0)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            r11 = 1
            goto L_0x0031
        L_0x0030:
            r11 = 0
        L_0x0031:
            if (r11 == 0) goto L_0x0046
            r5 = 2130968971(0x7f04018b, float:1.754661E38)
            r2 = 2131231307(0x7f08024b, float:1.8078691E38)
            r11 = 2131887041(0x7f1203c1, float:1.9408678E38)
            java.lang.String r4 = r9.getString(r11)
            r0 = r9
            r1 = r6
            r3 = r5
            p924xt.C20604l.m48424a(r0, r1, r2, r3, r4, r5)
        L_0x0046:
            if (r12 == 0) goto L_0x006b
            int r11 = r12.f44363b
            if (r11 < 0) goto L_0x006b
            r5 = 2130968994(0x7f0401a2, float:1.7546657E38)
            android.content.res.Resources r11 = r9.getResources()
            r0 = 2131755009(0x7f100001, float:1.9140885E38)
            int r12 = r12.f44363b
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r7] = r2
            java.lang.String r4 = r11.getQuantityString(r0, r12, r1)
            r2 = 0
            r3 = 0
            r0 = r9
            r1 = r6
            p924xt.C20604l.m48424a(r0, r1, r2, r3, r4, r5)
        L_0x006b:
            com.moovit.itinerary.model.ItineraryMetadata r10 = r10.f41895c
            com.moovit.itinerary.model.EmissionLevel r10 = r10.f41909k
            if (r10 == 0) goto L_0x0091
            com.moovit.util.ColorScheme r11 = r10.f41891c
            int r5 = r11.getColorAttrId()
            r2 = 2131231279(0x7f08022f, float:1.8078635E38)
            r11 = 2131888929(0x7f120b21, float:1.9412507E38)
            java.lang.Object[] r12 = new java.lang.Object[r8]
            int r10 = r10.f41890b
            java.lang.String r10 = p584jl.C17885a.m44416O(r10, r9)
            r12[r7] = r10
            java.lang.String r4 = r9.getString(r11, r12)
            r0 = r9
            r1 = r6
            r3 = r5
            p924xt.C20604l.m48424a(r0, r1, r2, r3, r4, r5)
        L_0x0091:
            int r9 = r6.length()
            if (r9 <= 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p924xt.C20584a.m48335p(android.content.Context, com.moovit.itinerary.model.Itinerary, e20.e$c, fz.e):android.text.SpannableStringBuilder");
    }

    /* renamed from: a */
    public void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        Context e = fVar.mo39638e();
        RecyclerView recyclerView = (RecyclerView) fVar.mo39639f(R.id.legs_preview);
        recyclerView.setAdapter(new C13527c(e, itinerary));
        recyclerView.setChildDrawingOrderCallback(new C5227c(15));
        m48334o(fVar, itinerary, (C16769e.C16772c) null);
    }

    /* renamed from: c */
    public final void mo52783c(C20590e.C20592b bVar, Itinerary itinerary, C16769e.C16772c cVar) {
        m48334o(bVar, itinerary, cVar);
    }

    /* renamed from: m */
    public final void mo52784m(C20590e.C20592b bVar, Itinerary itinerary, StringBuilder sb) {
        Context e = bVar.mo39638e();
        C13527c cVar = (C13527c) ((RecyclerView) bVar.mo39639f(R.id.legs_preview)).getAdapter();
        if (cVar != null) {
            C13382a.m33666b(sb, cVar.f33449i);
        }
        super.mo52784m(bVar, itinerary, sb);
        TextView textView = (TextView) bVar.mo39639f(R.id.metadata);
        if (textView != null) {
            C13382a.m33666b(sb, textView.getText());
        }
        if (itinerary.f41895c.f41908j) {
            C13382a.m33666b(sb, e.getString(R.string.accessibility_trip_plan_route));
        }
        TextView textView2 = (TextView) bVar.mo39639f(R.id.attributes);
        if (textView2 != null) {
            C13382a.m33666b(sb, textView2.getText());
        }
    }
}
