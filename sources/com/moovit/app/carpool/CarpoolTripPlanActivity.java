package com.moovit.app.carpool;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import b00.C13556a;
import c00.C13717b;
import c00.C13723g;
import c70.C13752e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.request.RequestOptions;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12793c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import o00.C18671h;
import p297w5.C6996c;
import p472er.C16857a;
import p472er.C16864f;
import p543hq.C17474b;
import p589jq.C17910b;
import p638lr.C18268o;
import p638lr.C18269p;
import p732pq.C18949j;
import p824tp.C19728f;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import q00.C19047a;
import q00.C19053d;
import v90.C13187a;

public class CarpoolTripPlanActivity extends BaseCarpoolItinerariesActivity {
    @SuppressLint({"SwitchIntDef"})

    /* renamed from: q0 */
    public static final C17910b f37678q0 = new C17910b(1);

    /* renamed from: n0 */
    public final C14795a f37679n0 = new C14795a();

    /* renamed from: o0 */
    public TripPlanParams f37680o0 = null;

    /* renamed from: p0 */
    public C13556a f37681p0 = null;

    /* renamed from: com.moovit.app.carpool.CarpoolTripPlanActivity$a */
    public class C14795a extends C20438i<C18268o, C18269p> {
        public C14795a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18268o oVar = (C18268o) cVar;
            CarpoolTripPlanActivity carpoolTripPlanActivity = CarpoolTripPlanActivity.this;
            carpoolTripPlanActivity.f37681p0 = null;
            if (C13717b.m34258e(Collections.unmodifiableList(carpoolTripPlanActivity.f37614Z))) {
                CarpoolTripPlanActivity carpoolTripPlanActivity2 = CarpoolTripPlanActivity.this;
                carpoolTripPlanActivity2.getClass();
                carpoolTripPlanActivity2.mo44811B2(new C18671h(R.layout.carpool_suggestions_empty_state));
                return;
            }
            CarpoolTripPlanActivity.this.mo44813D2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18268o oVar = (C18268o) cVar;
            Itinerary itinerary = ((C18269p) gVar).f46600m;
            if (itinerary != null) {
                CarpoolTripPlanActivity carpoolTripPlanActivity = CarpoolTripPlanActivity.this;
                if (carpoolTripPlanActivity.mo44815z2(itinerary)) {
                    carpoolTripPlanActivity.f37614Z.add(itinerary);
                    carpoolTripPlanActivity.mo44813D2();
                }
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18268o oVar = (C18268o) cVar;
            CarpoolTripPlanActivity carpoolTripPlanActivity = CarpoolTripPlanActivity.this;
            C16864f fVar = new C16864f(this, 0);
            carpoolTripPlanActivity.getClass();
            carpoolTripPlanActivity.mo44811B2(new C16857a(new int[]{R.layout.activity_loading_failed}, fVar));
            return true;
        }
    }

    /* renamed from: E2 */
    public final void mo44845E2() {
        C13556a aVar = this.f37681p0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37681p0 = null;
        }
        C13187a aVar2 = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        C13752e x1 = mo44548x1();
        TripPlannerRouteType b = aVar2.mo40061b();
        TripPlannerTime tripPlannerTime = this.f37680o0.f23218d;
        Set<TripPlannerTransportType> d = aVar2.mo40063d();
        TripPlanParams tripPlanParams = this.f37680o0;
        C18268o oVar = new C18268o(x1, (C19728f) mo44537r1("METRO_CONTEXT"), (C19047a) mo44537r1("CONFIGURATION"), b, tripPlannerTime, d, tripPlanParams.f23788b, tripPlanParams.f23789c, getIntent().getBooleanExtra("useSmartTripPlanRequest", false));
        mo44811B2(new C12793c());
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C18268o.class, sb, "_");
        sb.append(oVar.f46598y.name());
        sb.append(oVar.f46599z.f23799b.name());
        sb.append(oVar.f46599z.mo24487b());
        sb.append(C13717b.m34269p(oVar.f46592A));
        sb.append(oVar.f46593B);
        sb.append(oVar.f46594C);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f37681p0 = mo44527k2(sb2, oVar, requestOptions, this.f37679n0);
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C13556a aVar = this.f37681p0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37681p0 = null;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        ArrayList arrayList;
        super.mo19425e2(bundle);
        TripPlanParams tripPlanParams = (TripPlanParams) getIntent().getParcelableExtra("params");
        this.f37680o0 = tripPlanParams;
        if (tripPlanParams != null) {
            if (bundle == null) {
                arrayList = getIntent().getParcelableArrayListExtra("itineraries");
            } else {
                arrayList = null;
            }
            if (!C13717b.m34258e(arrayList)) {
                mo44812C2(arrayList);
            }
            if (bundle == null || C13717b.m34258e(Collections.unmodifiableList(this.f37614Z))) {
                TripPlanParams tripPlanParams2 = this.f37680o0;
                this.f37615l0 = new TripPlannerLocations(tripPlanParams2.f23788b, tripPlanParams2.f23789c);
                mo44845E2();
            }
            C19047a aVar = (C19047a) mo44537r1("CONFIGURATION");
            if (((Boolean) aVar.mo51505b(C19053d.f48487z)).booleanValue() && ((Boolean) aVar.mo51505b(C20199a.f51294p0)).booleanValue()) {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_SECTION_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "share_with_driver_shown");
                mo44545v2(aVar2.mo49933a());
                View findViewById = findViewById(R.id.driver_share_referral);
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new C6996c(this, 6));
                return;
            }
            return;
        }
        throw new ApplicationBugException("Did you use createStartIntent(...)?");
    }

    /* renamed from: y2 */
    public final void mo44814y2() {
    }

    /* renamed from: z2 */
    public final boolean mo44815z2(Itinerary itinerary) {
        boolean z2 = super.mo44815z2(itinerary);
        if (!z2 || !C16783l.m42469a(itinerary, 7)) {
            return z2;
        }
        return !C13723g.m34280a(Collections.unmodifiableList(this.f37614Z), new C18949j(C13723g.m34282c(itinerary.mo48295u0(), f37678q0), 1));
    }
}
