package com.moovit.app.carpool;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.network.model.ServerId;
import com.moovit.tripplanner.TripPlannerLocations;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p242s1.C6354e;
import p471eq.C16850a;
import p472er.C16867h;
import p543hq.C17474b;
import p924xt.C20586b;
import p924xt.C20609p;

public abstract class BaseCarpoolItinerariesActivity extends MoovitAppActivity {

    /* renamed from: U */
    public final C20609p f37611U = new C20609p();

    /* renamed from: X */
    public final C20586b f37612X = new C20586b();

    /* renamed from: Y */
    public final C14780a f37613Y = new C14780a();

    /* renamed from: Z */
    public final ArrayList<Itinerary> f37614Z = new ArrayList<>();

    /* renamed from: l0 */
    public TripPlannerLocations f37615l0 = null;

    /* renamed from: m0 */
    public RecyclerView f37616m0;

    /* renamed from: com.moovit.app.carpool.BaseCarpoolItinerariesActivity$a */
    public class C14780a extends RecyclerView.Adapter<C14781b> {

        /* renamed from: g */
        public final C16850a f37617g = new C16850a(this, 2);

        public C14780a() {
        }

        public final int getItemCount() {
            return BaseCarpoolItinerariesActivity.this.f37614Z.size();
        }

        public final int getItemViewType(int i) {
            if (BaseCarpoolItinerariesActivity.this.f37611U.mo52788n(BaseCarpoolItinerariesActivity.this.f37614Z.get(i))) {
                return 1;
            }
            return 2;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C14781b bVar = (C14781b) a0Var;
            Itinerary itinerary = BaseCarpoolItinerariesActivity.this.f37614Z.get(i);
            if (bVar.getItemViewType() != 2) {
                BaseCarpoolItinerariesActivity baseCarpoolItinerariesActivity = BaseCarpoolItinerariesActivity.this;
                baseCarpoolItinerariesActivity.f37611U.mo52782a(bVar, itinerary, baseCarpoolItinerariesActivity.f37615l0);
            } else {
                BaseCarpoolItinerariesActivity baseCarpoolItinerariesActivity2 = BaseCarpoolItinerariesActivity.this;
                baseCarpoolItinerariesActivity2.f37612X.mo52782a(bVar, itinerary, baseCarpoolItinerariesActivity2.f37615l0);
            }
            bVar.itemView.setOnClickListener(this.f37617g);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 2) {
                view = BaseCarpoolItinerariesActivity.this.f37611U.mo52786h(viewGroup);
            } else {
                view = BaseCarpoolItinerariesActivity.this.f37612X.mo52786h(viewGroup);
            }
            C14781b bVar = new C14781b(view);
            bVar.itemView.setTag(bVar);
            return bVar;
        }
    }

    /* renamed from: com.moovit.app.carpool.BaseCarpoolItinerariesActivity$b */
    public static class C14781b extends C12797f {

        /* renamed from: e */
        public final C6354e f37619e;

        /* renamed from: com.moovit.app.carpool.BaseCarpoolItinerariesActivity$b$a */
        public class C14782a extends RecyclerView.C1148v {
            public C14782a() {
            }

            /* renamed from: b */
            public final boolean mo4910b(RecyclerView recyclerView, MotionEvent motionEvent) {
                return C14781b.this.f37619e.mo22474a(motionEvent);
            }
        }

        /* renamed from: com.moovit.app.carpool.BaseCarpoolItinerariesActivity$b$b */
        public class C14783b extends GestureDetector.SimpleOnGestureListener {
            public C14783b() {
            }

            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C14781b.this.itemView.performClick();
                return true;
            }
        }

        public C14781b(View view) {
            super(view);
            C14782a aVar = new C14782a();
            this.f37619e = new C6354e(view.getContext(), new C14783b());
            RecyclerView recyclerView = (RecyclerView) mo39639f(R.id.legs_preview);
            if (recyclerView != null) {
                recyclerView.f4279r.add(aVar);
            }
        }
    }

    /* renamed from: A2 */
    public final void mo44810A2(Itinerary itinerary, CarpoolLeg carpoolLeg, int i) {
        AppDeepLink appDeepLink = carpoolLeg.f41978n;
        CarpoolRide carpoolRide = carpoolLeg.f41980p;
        if (carpoolRide != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, itinerary.f41894b);
            aVar.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, carpoolRide.f40910b);
            aVar.mo49941i(AnalyticsAttributeKey.CONTAINS_PUBLIC_TRANSPORTATION, C16783l.m42469a(itinerary, 2));
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
            mo44545v2(aVar.mo49933a());
            ServerId serverId = carpoolRide.f40910b;
            PassengerRideStops passengerRideStops = carpoolLeg.f41981q;
            TripPlannerLocations tripPlannerLocations = this.f37615l0;
            mo44814y2();
            startActivity(CarpoolRideDetailsActivity.m37357A2(this, serverId, passengerRideStops, tripPlannerLocations, itinerary, false));
        } else if (appDeepLink != null) {
            AppDeepLink appDeepLink2 = carpoolLeg.f41979o;
            if (appDeepLink2 == null) {
                appDeepLink2 = appDeepLink;
            }
            if (appDeepLink2 != null && !appDeepLink2.mo46945b(this)) {
                appDeepLink = appDeepLink2;
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ride_hailing_clicked");
            aVar2.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, itinerary.f41894b);
            aVar2.mo49941i(AnalyticsAttributeKey.CONTAINS_PUBLIC_TRANSPORTATION, C16783l.m42469a(itinerary, 2));
            aVar2.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
            aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, C16080a.m40960p(carpoolLeg.f41971g).name());
            aVar2.mo49938f(AnalyticsAttributeKey.URI, appDeepLink.f40998c);
            aVar2.mo49941i(AnalyticsAttributeKey.TAXI_APP_INSTALLED, appDeepLink.mo46945b(this));
            mo44545v2(aVar2.mo49933a());
            if (!appDeepLink.mo46945b(this)) {
                CarpoolLeg.CarpoolProvider carpoolProvider = carpoolLeg.f41971g;
                int i2 = C16867h.f43872j;
                Bundle bundle = new Bundle();
                bundle.putParcelable("provider", carpoolProvider);
                bundle.putParcelable("appDeepLink", appDeepLink);
                C16867h hVar = new C16867h();
                hVar.setArguments(bundle);
                hVar.show(getSupportFragmentManager(), "CarpoolPopupDialogFragment");
                return;
            }
            appDeepLink.mo46946c(this);
        }
    }

    /* renamed from: B2 */
    public final void mo44811B2(RecyclerView.Adapter<?> adapter) {
        if (this.f37616m0.getAdapter() != adapter) {
            this.f37616m0.setAdapter(adapter);
        }
    }

    /* renamed from: C2 */
    public final void mo44812C2(List<Itinerary> list) {
        this.f37614Z.clear();
        for (Itinerary next : list) {
            if (mo44815z2(next)) {
                this.f37614Z.add(next);
            }
        }
        mo44813D2();
    }

    /* renamed from: D2 */
    public final void mo44813D2() {
        RecyclerView.Adapter adapter = this.f37616m0.getAdapter();
        C14780a aVar = this.f37613Y;
        if (adapter == aVar) {
            aVar.notifyDataSetChanged();
        } else {
            mo44811B2(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19425e2(android.os.Bundle r5) {
        /*
            r4 = this;
            super.mo19425e2(r5)
            r0 = 2131558565(0x7f0d00a5, float:1.874245E38)
            r4.setContentView((int) r0)
            r0 = 2131363952(0x7f0a0870, float:1.8347727E38)
            android.view.View r0 = r4.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r4.f37616m0 = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r4)
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.f37616m0
            o00.b r1 = new o00.b
            android.content.Context r2 = r0.getContext()
            r3 = 2131231021(0x7f08012d, float:1.8078111E38)
            r1.<init>(r2, r3)
            r2 = -1
            r0.mo4593g(r1, r2)
            r0 = 0
            if (r5 == 0) goto L_0x0038
            java.lang.String r1 = "itineraries"
            java.util.ArrayList r1 = r5.getParcelableArrayList(r1)
            goto L_0x0039
        L_0x0038:
            r1 = r0
        L_0x0039:
            boolean r2 = c00.C13717b.m34258e(r1)
            if (r2 != 0) goto L_0x0042
            r4.mo44812C2(r1)
        L_0x0042:
            if (r5 == 0) goto L_0x004d
            java.lang.String r0 = "locations"
            android.os.Parcelable r5 = r5.getParcelable(r0)
            r0 = r5
            com.moovit.tripplanner.TripPlannerLocations r0 = (com.moovit.tripplanner.TripPlannerLocations) r0
        L_0x004d:
            if (r0 == 0) goto L_0x0051
            r4.f37615l0 = r0
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.BaseCarpoolItinerariesActivity.mo19425e2(android.os.Bundle):void");
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        if (!this.f37614Z.isEmpty()) {
            bundle.putParcelableArrayList("itineraries", this.f37614Z);
        }
        TripPlannerLocations tripPlannerLocations = this.f37615l0;
        if (tripPlannerLocations != null) {
            bundle.putParcelable("locations", tripPlannerLocations);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("CONFIGURATION");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        return s1;
    }

    /* renamed from: y2 */
    public abstract void mo44814y2();

    /* renamed from: z2 */
    public boolean mo44815z2(Itinerary itinerary) {
        if (!this.f37611U.mo52788n(itinerary)) {
            this.f37612X.getClass();
            if (C16783l.m42469a(itinerary, 7)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
