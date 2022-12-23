package p924xt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import c00.C13721e;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.carpool.CarpoolTripPlanActivity;
import com.moovit.app.history.itinerary.ItineraryHistoryItem;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.list.ItineraryListActivity;
import com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.commons.utils.Color;
import com.moovit.commons.view.BannerView;
import com.moovit.itinerary.TripPlanFlexTimeBanner;
import com.moovit.itinerary.TripPlanTodBanner;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItinerarySection;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.util.ParcelableDiskRef;
import com.moovit.util.ParcelableMemRef;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16781j;
import e20.C16783l;
import i00.C17525d;
import j80.C12772a;
import ja0.C12793c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import k00.C17988b;
import mf0.C24362h;
import o00.C18666c;
import o00.C18669f;
import o00.C18675k;
import o00.C18681n;
import p001a0.C0016g;
import p019b0.C1436m;
import p241s0.C6313h;
import p396bt.C13681a;
import p396bt.C13682b;
import p398bv.C13693c;
import p484ff.C16977i;
import p543hq.C17474b;
import p589jq.C17910b;
import p641lu.C18277b;
import p684nq.C18583d;
import p826tr.C19752b;
import p858uz.C20061g;
import p899ws.C20406f;
import p900wt.C20415e;
import p927xw.C20640h;
import p977zz.C20957p;
import p977zz.C20964s0;
import p977zz.C20975x0;
import z00.C20795a;
import z20.C20806a;

/* renamed from: xt.h */
public abstract class C20598h<O extends TripPlannerOptions> extends TripPlannerResultsFragment<O> {

    /* renamed from: z */
    public static final /* synthetic */ int f52097z = 0;

    /* renamed from: p */
    public final C20599a f52098p = new C20599a();

    /* renamed from: q */
    public BannerView f52099q;

    /* renamed from: r */
    public RecyclerView f52100r;

    /* renamed from: s */
    public TripPlanConfig f52101s = null;

    /* renamed from: t */
    public final ArrayList f52102t = new ArrayList();

    /* renamed from: u */
    public TripPlanFlexTimeBanner f52103u = null;

    /* renamed from: v */
    public final HashMap f52104v = new HashMap();

    /* renamed from: w */
    public final ArrayList f52105w = new ArrayList();

    /* renamed from: x */
    public C18666c f52106x;

    /* renamed from: y */
    public C18669f f52107y;

    /* renamed from: xt.h$a */
    public class C20599a extends C20590e {
        public C20599a() {
        }

        /* renamed from: A */
        public final TripPlannerLocations mo52792A() {
            TripPlannerResultsFragment.SearchParams<O> searchParams = C20598h.this.f40516o;
            if (searchParams != null) {
                return searchParams.f40518c;
            }
            return null;
        }

        /* renamed from: B */
        public final void mo52793B(TripPlanFlexTimeBanner tripPlanFlexTimeBanner) {
            C20598h.this.mo50124t2(tripPlanFlexTimeBanner);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.moovit.tripplanner.TripPlannerLocations} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX WARNING: type inference failed for: r3v7, types: [com.moovit.tripplanner.TripPlannerLocations] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: C */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52794C(p924xt.C20589d r13, com.moovit.itinerary.model.Itinerary r14) {
            /*
                r12 = this;
                xt.h r0 = p924xt.C20598h.this
                int r1 = p924xt.C20598h.f52097z
                r0.getClass()
                int r1 = r13.f52075a
                r2 = 9
                if (r1 != r2) goto L_0x0096
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.TaxiLeg r13 = (com.moovit.itinerary.model.leg.TaxiLeg) r13
                A r1 = r0.f40822c
                com.moovit.app.taxi.providers.TaxiProvidersManager r2 = com.moovit.app.taxi.providers.TaxiProvidersManager.m39496b(r1)
                com.moovit.network.model.ServerId r3 = r13.f42097b
                com.moovit.app.taxi.providers.TaxiProvider r2 = r2.mo46163c(r3)
                if (r2 != 0) goto L_0x0023
                goto L_0x03e7
            L_0x0023:
                com.moovit.app.taxi.providers.TaxiAppInfo r3 = r2.f39976k
                hq.b$a r4 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r5 = com.moovit.analytics.AnalyticsEventKey.TAXI_CLICKED
                r4.<init>(r5)
                com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
                java.lang.String r6 = r2.f39968c
                r4.mo49939g(r5, r6)
                com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.TAXI_APP_INSTALLED
                boolean r6 = r3.mo46103c(r1)
                r4.mo49941i(r5, r6)
                com.moovit.analytics.AnalyticsAttributeKey r5 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r6 = r14.f41894b
                r4.mo49939g(r5, r6)
                hq.b r4 = r4.mo49933a()
                r0.mo46797j2(r4)
                z20.a$a r4 = new z20.a$a
                java.lang.String r5 = "taxi_cell_tap"
                r4.<init>(r5)
                java.lang.String r5 = "single"
                java.lang.String r6 = "type"
                r4.mo52934b(r5, r6)
                java.lang.String r5 = r2.f39968c
                java.lang.String r6 = "provider_id"
                r4.mo52934b(r5, r6)
                r4.mo52935c()
                com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r0 = r0.f40516o
                if (r0 == 0) goto L_0x006b
                com.moovit.tripplanner.TripPlannerLocations r4 = r0.f40518c
                com.moovit.transit.LocationDescriptor r4 = r4.f23786b
                goto L_0x0073
            L_0x006b:
                com.moovit.itinerary.model.leg.Leg r4 = r14.mo48289b()
                com.moovit.transit.LocationDescriptor r4 = r4.mo48332W()
            L_0x0073:
                if (r0 == 0) goto L_0x007a
                com.moovit.tripplanner.TripPlannerLocations r0 = r0.f40518c
                com.moovit.transit.LocationDescriptor r0 = r0.f23787c
                goto L_0x0082
            L_0x007a:
                com.moovit.itinerary.model.leg.Leg r0 = r14.mo48290c()
                com.moovit.transit.LocationDescriptor r0 = r0.mo48334e2()
            L_0x0082:
                com.moovit.app.taxi.TaxiOrder r5 = new com.moovit.app.taxi.TaxiOrder
                com.moovit.app.taxi.TaxiOrder$Source r6 = com.moovit.app.taxi.TaxiOrder.Source.TRIP_PLAN
                java.util.Map<java.lang.String, java.lang.String> r13 = r13.f42105j
                r5.<init>(r6, r4, r0, r13)
                vw.c r13 = r3.mo46102b()
                java.lang.String r14 = r14.f41894b
                r13.mo52438b(r1, r2, r5, r14)
                goto L_0x03e7
            L_0x0096:
                r2 = 18
                if (r1 != r2) goto L_0x00d2
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.DocklessCarLeg r13 = (com.moovit.itinerary.model.leg.DocklessCarLeg) r13
                hq.b$a r1 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r1.<init>(r2)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r3 = "dockless_car_leg_clicked"
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r3 = r14.f41894b
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
                com.moovit.itinerary.model.leg.DocklessCarLeg$DocklessCarLegInfo r13 = r13.f42024h
                java.lang.String r13 = r13.f42029c
                r1.mo49939g(r2, r13)
                hq.b r13 = r1.mo49933a()
                r0.mo46797j2(r13)
                android.content.Context r13 = r0.getContext()
                android.content.Intent r13 = com.moovit.app.itinerary.ItineraryActivity.m37991y2(r13, r14)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x00d2:
                r2 = 19
                if (r1 != r2) goto L_0x010e
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.DocklessScooterLeg r13 = (com.moovit.itinerary.model.leg.DocklessScooterLeg) r13
                hq.b$a r1 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r1.<init>(r2)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r3 = "dockless_scooter_leg_clicked"
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r3 = r14.f41894b
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
                com.moovit.itinerary.model.leg.DocklessScooterLeg$DocklessScooterLegInfo r13 = r13.f42068h
                java.lang.String r13 = r13.f42073c
                r1.mo49939g(r2, r13)
                hq.b r13 = r1.mo49933a()
                r0.mo46797j2(r13)
                android.content.Context r13 = r0.getContext()
                android.content.Intent r13 = com.moovit.app.itinerary.ItineraryActivity.m37991y2(r13, r14)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x010e:
                r2 = 20
                if (r1 != r2) goto L_0x014a
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.DocklessMopedLeg r13 = (com.moovit.itinerary.model.leg.DocklessMopedLeg) r13
                hq.b$a r1 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r1.<init>(r2)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r3 = "dockless_moped_leg_clicked"
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r3 = r14.f41894b
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
                com.moovit.itinerary.model.leg.DocklessMopedLeg$DocklessMopedLegInfo r13 = r13.f42046h
                java.lang.String r13 = r13.f42051c
                r1.mo49939g(r2, r13)
                hq.b r13 = r1.mo49933a()
                r0.mo46797j2(r13)
                android.content.Context r13 = r0.getContext()
                android.content.Intent r13 = com.moovit.app.itinerary.ItineraryActivity.m37991y2(r13, r14)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x014a:
                r2 = 21
                if (r1 != r2) goto L_0x0186
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.DocklessBicycleLeg r13 = (com.moovit.itinerary.model.leg.DocklessBicycleLeg) r13
                hq.b$a r1 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r1.<init>(r2)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r3 = "dockless_bicycle_leg_clicked"
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r3 = r14.f41894b
                r1.mo49939g(r2, r3)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.PROVIDER
                com.moovit.itinerary.model.leg.DocklessBicycleLeg$DocklessBicycleLegInfo r13 = r13.f42002h
                java.lang.String r13 = r13.f42007c
                r1.mo49939g(r2, r13)
                hq.b r13 = r1.mo49933a()
                r0.mo46797j2(r13)
                android.content.Context r13 = r0.getContext()
                android.content.Intent r13 = com.moovit.app.itinerary.ItineraryActivity.m37991y2(r13, r14)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x0186:
                r2 = 10
                r3 = 0
                r4 = 1
                if (r1 != r2) goto L_0x01c2
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.WalkLeg r13 = (com.moovit.itinerary.model.leg.WalkLeg) r13
                hq.b$a r13 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r13.<init>(r1)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r2 = "walk_route_clicked"
                r13.mo49939g(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r2 = r14.f41894b
                r13.mo49939g(r1, r2)
                hq.b r13 = r13.mo49933a()
                r0.mo46797j2(r13)
                androidx.fragment.app.FragmentActivity r13 = r0.getActivity()
                r1 = 2131889753(0x7f120e59, float:1.9414178E38)
                java.lang.String r1 = r0.getString(r1)
                android.content.Intent r13 = com.moovit.app.itinerary.StepByStepActivity.m38046R2(r13, r14, r3, r4, r1)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x01c2:
                r2 = 14
                if (r1 != r2) goto L_0x01fc
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.BicycleLeg r13 = (com.moovit.itinerary.model.leg.BicycleLeg) r13
                hq.b$a r13 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r13.<init>(r1)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r2 = "personal_bike_clicked"
                r13.mo49939g(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r2 = r14.f41894b
                r13.mo49939g(r1, r2)
                hq.b r13 = r13.mo49933a()
                r0.mo46797j2(r13)
                androidx.fragment.app.FragmentActivity r13 = r0.getActivity()
                r1 = 2131886514(0x7f1201b2, float:1.940761E38)
                java.lang.String r1 = r0.getString(r1)
                android.content.Intent r13 = com.moovit.app.itinerary.StepByStepActivity.m38046R2(r13, r14, r3, r4, r1)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x01fc:
                r2 = 15
                if (r1 != r2) goto L_0x022f
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.BicycleRentalLeg r13 = (com.moovit.itinerary.model.leg.BicycleRentalLeg) r13
                hq.b$a r13 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r13.<init>(r1)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r2 = "hired_bike_clicked"
                r13.mo49939g(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r2 = r14.f41894b
                r13.mo49939g(r1, r2)
                hq.b r13 = r13.mo49933a()
                r0.mo46797j2(r13)
                android.content.Context r13 = r0.getContext()
                android.content.Intent r13 = com.moovit.app.itinerary.ItineraryActivity.m37991y2(r13, r14)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x022f:
                r2 = 17
                r3 = 0
                if (r1 != r2) goto L_0x0289
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.EventLeg r13 = (com.moovit.itinerary.model.leg.EventLeg) r13
                hq.b$a r1 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r1.<init>(r2)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r4 = "event_clicked"
                r1.mo49939g(r2, r4)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r14 = r14.f41894b
                r1.mo49939g(r2, r14)
                hq.b r14 = r1.mo49933a()
                r0.mo46797j2(r14)
                com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r14 = r0.f40516o
                if (r14 == 0) goto L_0x0273
                com.moovit.tripplanner.TripPlannerLocations r1 = r14.f40518c
                com.moovit.transit.LocationDescriptor r1 = r1.f23786b
                if (r1 == 0) goto L_0x026f
                com.moovit.transit.LocationDescriptor$LocationType r2 = com.moovit.transit.LocationDescriptor.LocationType.EVENT
                com.moovit.transit.LocationDescriptor$LocationType r1 = r1.f23647b
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x026f
                com.moovit.tripplanner.TripPlannerLocations r14 = r14.f40518c
                com.moovit.transit.LocationDescriptor r3 = r14.f23787c
                goto L_0x0273
            L_0x026f:
                com.moovit.tripplanner.TripPlannerLocations r14 = r14.f40518c
                com.moovit.transit.LocationDescriptor r3 = r14.f23786b
            L_0x0273:
                com.moovit.ridesharing.model.Event r13 = r13.f42083b
                com.moovit.app.ridesharing.booking.EventBookingParams r14 = new com.moovit.app.ridesharing.booking.EventBookingParams
                com.moovit.network.model.ServerId r13 = r13.f42911b
                r14.<init>(r13, r3)
                android.content.Context r13 = r0.getContext()
                android.content.Intent r13 = com.moovit.app.ridesharing.booking.EventBookingActivity.m38987y2(r13, r14)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x0289:
                r2 = 13
                if (r1 == r2) goto L_0x02a2
                r2 = 12
                if (r1 != r2) goto L_0x0292
                goto L_0x02a2
            L_0x0292:
                com.moovit.itinerary.model.ItineraryMetadata r13 = r14.f41895c
                int r13 = r13.f41902d
                if (r13 != r4) goto L_0x029d
                r0.mo50125v2(r14)
                goto L_0x03e7
            L_0x029d:
                r0.mo40557u2(r14)
                goto L_0x03e7
            L_0x02a2:
                com.moovit.itinerary.model.leg.Leg r13 = r13.mo52791j(r14)
                com.moovit.itinerary.model.leg.CarpoolLeg r13 = (com.moovit.itinerary.model.leg.CarpoolLeg) r13
                com.moovit.commons.utils.AppDeepLink r1 = r13.f41978n
                com.moovit.carpool.CarpoolRide r2 = r13.f41980p
                r5 = 2
                if (r2 == 0) goto L_0x031c
                com.moovit.network.model.ServerId r7 = r2.f40910b
                com.moovit.carpool.PassengerRideStops r8 = r13.f41981q
                com.moovit.itinerary.model.ItineraryMetadata r13 = r14.f41895c
                com.moovit.network.model.ServerId r13 = r13.f41901c
                if (r13 == 0) goto L_0x02c5
                xt.h$a r1 = r0.f52098p
                java.util.List r1 = r1.mo51054q()
                com.moovit.itinerary.model.ItinerarySection$Type r2 = com.moovit.itinerary.model.ItinerarySection.Type.CARPOOL
                int r4 = p924xt.C20604l.m48430g(r1, r2, r13)
            L_0x02c5:
                hq.b$a r13 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r13.<init>(r1)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r2 = "carpool_ride_clicked"
                r13.mo49939g(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r2 = r14.f41894b
                r13.mo49939g(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.CARPOOL_RIDE_ID
                r13.mo49937e(r1, r7)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.FROM_STOP
                com.moovit.carpool.PassengerRideStop r2 = r8.f40951b
                short r2 = r2.f40948b
                r13.mo49940h(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.TO_STOP
                com.moovit.carpool.PassengerRideStop r2 = r8.f40952c
                short r2 = r2.f40948b
                r13.mo49940h(r1, r2)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.CARPOOL_NUM_RIDES
                r13.mo49935c(r1, r4)
                com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.CONTAINS_PUBLIC_TRANSPORTATION
                boolean r2 = e20.C16783l.m42469a(r14, r5)
                r13.mo49941i(r1, r2)
                hq.b r13 = r13.mo49933a()
                r0.mo46797j2(r13)
                com.moovit.app.tripplanner.TripPlannerResultsFragment$SearchParams<O> r13 = r0.f40516o
                if (r13 == 0) goto L_0x030c
                com.moovit.tripplanner.TripPlannerLocations r3 = r13.f40518c
            L_0x030c:
                r9 = r3
                android.content.Context r6 = r0.getContext()
                r11 = 0
                r10 = r14
                android.content.Intent r13 = com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity.m37357A2(r6, r7, r8, r9, r10, r11)
                r0.startActivity(r13)
                goto L_0x03e7
            L_0x031c:
                if (r1 == 0) goto L_0x03e7
                com.moovit.itinerary.model.ItineraryMetadata r2 = r14.f41895c
                com.moovit.network.model.ServerId r2 = r2.f41901c
                if (r2 == 0) goto L_0x0331
                xt.h$a r3 = r0.f52098p
                java.util.List r3 = r3.mo51054q()
                com.moovit.itinerary.model.ItinerarySection$Type r6 = com.moovit.itinerary.model.ItinerarySection.Type.CARPOOL
                int r2 = p924xt.C20604l.m48430g(r3, r6, r2)
                goto L_0x0332
            L_0x0331:
                r2 = 1
            L_0x0332:
                hq.b$a r3 = new hq.b$a
                com.moovit.analytics.AnalyticsEventKey r6 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
                r3.<init>(r6)
                com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
                java.lang.String r7 = "ride_hailing_clicked"
                r3.mo49939g(r6, r7)
                com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.ITINERARY_GUID
                java.lang.String r7 = r14.f41894b
                r3.mo49939g(r6, r7)
                com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.CARPOOL_NUM_RIDES
                r3.mo49935c(r6, r2)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.CONTAINS_PUBLIC_TRANSPORTATION
                boolean r5 = e20.C16783l.m42469a(r14, r5)
                r3.mo49941i(r2, r5)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.SOURCE
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r5 = r13.f41971g
                com.tranzmate.moovit.protocol.tripplanner.MVCarPoolSource r5 = com.moovit.itinerary.C16080a.m40960p(r5)
                java.lang.String r5 = r5.name()
                r3.mo49939g(r2, r5)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.URI
                android.net.Uri r5 = r1.f40998c
                r3.mo49938f(r2, r5)
                com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TAXI_APP_INSTALLED
                A r5 = r0.f40822c
                boolean r5 = r1.mo46945b(r5)
                r3.mo49941i(r2, r5)
                hq.b r2 = r3.mo49933a()
                r0.mo46797j2(r2)
                android.content.Context r2 = r0.getContext()
                boolean r3 = r1.mo46945b(r2)
                if (r3 != 0) goto L_0x03e4
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r1 = r13.f41972h
                int[] r2 = p924xt.C20598h.C20600b.f52110b
                int r1 = r1.ordinal()
                r1 = r2[r1]
                if (r1 == r4) goto L_0x03bf
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r14 = r13.f41971g
                com.moovit.commons.utils.AppDeepLink r1 = r13.f41979o
                if (r1 == 0) goto L_0x039e
                goto L_0x03a0
            L_0x039e:
                com.moovit.commons.utils.AppDeepLink r1 = r13.f41978n
            L_0x03a0:
                int r13 = p472er.C16867h.f43872j
                android.os.Bundle r13 = new android.os.Bundle
                r13.<init>()
                java.lang.String r2 = "provider"
                r13.putParcelable(r2, r14)
                java.lang.String r14 = "appDeepLink"
                r13.putParcelable(r14, r1)
                er.h r14 = new er.h
                r14.<init>()
                r14.setArguments(r13)
                java.lang.String r13 = "CarpoolPopupDialogFragment"
                r14.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r13)
                goto L_0x03e7
            L_0x03bf:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "itinerary"
                r1.putParcelable(r2, r14)
                java.util.List r14 = r14.mo48295u0()
                int r13 = e20.C16783l.m42475g(r14, r13)
                java.lang.String r14 = "legIndex"
                r1.putInt(r14, r13)
                rr.f r13 = new rr.f
                r13.<init>()
                r13.setArguments(r1)
                java.lang.String r14 = "DownloadCarpoolAppDialogFragment"
                r13.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r14)
                goto L_0x03e7
            L_0x03e4:
                r1.mo46946c(r2)
            L_0x03e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p924xt.C20598h.C20599a.mo52794C(xt.d, com.moovit.itinerary.model.Itinerary):void");
        }

        /* renamed from: D */
        public final void mo52795D(C20596g gVar) {
            String str;
            C20598h hVar = C20598h.this;
            int i = C20598h.f52097z;
            hVar.getClass();
            int i2 = C20600b.f52109a[gVar.f52093d.f41914c.ordinal()];
            if (i2 == 1) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "show_more_itineraries_clicked");
                aVar.mo49937e(AnalyticsAttributeKey.ID, gVar.f52093d.f41913b);
                hVar.mo46797j2(aVar.mo49933a());
                hVar.mo52805D2(gVar);
            } else if (i2 == 2) {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_suggest_routes_section_clicked");
                aVar2.mo49935c(AnalyticsAttributeKey.CARPOOL_NUM_RIDES, gVar.mo52801s());
                hVar.mo46797j2(aVar2.mo49933a());
                TripPlannerResultsFragment.SearchParams<O> searchParams = hVar.f40516o;
                if (searchParams != null) {
                    TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
                    TripPlannerLocations tripPlannerLocations = searchParams.f40518c;
                    dVar.f23790a = tripPlannerLocations.f23786b;
                    dVar.f23791b = tripPlannerLocations.f23787c;
                    dVar.f23222c = searchParams.f40519d.mo24463V();
                    TripPlanParams a = dVar.mo23958a();
                    ArrayList f = C20604l.m48429f(gVar);
                    Context context = hVar.getContext();
                    C17910b bVar = CarpoolTripPlanActivity.f37678q0;
                    Intent intent = new Intent(context, CarpoolTripPlanActivity.class);
                    intent.putExtra("params", a);
                    intent.putExtra("useSmartTripPlanRequest", false);
                    intent.putExtra("itineraries", C13717b.m34264k(f));
                    hVar.startActivity(intent);
                }
            } else if (i2 == 3 || i2 == 4) {
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                if (ItinerarySection.Type.BICYCLE_RENTAL.equals(gVar.f52093d.f41914c)) {
                    str = "show_more_hired_biking_option_clicked";
                } else {
                    str = "show_more_biking_option_clicked";
                }
                aVar3.mo49939g(analyticsAttributeKey, str);
                hVar.mo46797j2(aVar3.mo49933a());
                hVar.mo52805D2(gVar);
            }
        }

        /* renamed from: E */
        public final void mo52796E(TripPlanTodBanner tripPlanTodBanner) {
            String str;
            C20598h hVar = C20598h.this;
            int i = C20598h.f52097z;
            Context context = hVar.getContext();
            TripPlanTodBanner.C16078c cVar = tripPlanTodBanner.f41863h;
            if (cVar != null) {
                Context context2 = hVar.getContext();
                String str2 = cVar.f41868c;
                if (!C20964s0.m49090h(str2)) {
                    hVar.startActivity(WebViewActivity.m18168y2(context2, C20640h.m48521a(context2, str2), cVar.f41869d));
                    return;
                }
                return;
            }
            TaxiProvider c = TaxiProvidersManager.m39496b(hVar.f40822c).mo46163c(tripPlanTodBanner.f41858c);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_banner_clicked");
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.PROVIDER;
            if (c != null) {
                str = c.f39968c;
            } else {
                str = null;
            }
            aVar.mo49945m(analyticsAttributeKey, str);
            hVar.mo46797j2(aVar.mo49933a());
            TripPlannerResultsFragment.SearchParams<O> searchParams = hVar.f40516o;
            if (searchParams != null) {
                TripPlannerLocations tripPlannerLocations = searchParams.f40518c;
                LocationDescriptor locationDescriptor = tripPlannerLocations.f23786b;
                LocationDescriptor locationDescriptor2 = tripPlannerLocations.f23787c;
                if (locationDescriptor != null && locationDescriptor2 != null) {
                    TodOrderActivity.TodOrderInfo todOrderInfo = new TodOrderActivity.TodOrderInfo(locationDescriptor, locationDescriptor2, searchParams.f40519d.mo24463V(), tripPlanTodBanner.f41862g, c.f39967b.mo19751c(), (String) null, (String) null);
                    int i2 = TodOrderActivity.f40331D0;
                    Intent intent = new Intent(context, TodOrderActivity.class);
                    intent.putExtra("orderInfo", todOrderInfo);
                    intent.putExtra("fromTodBookingOrderFlow", false);
                    hVar.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: xt.h$b */
    public static /* synthetic */ class C20600b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52109a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f52110b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType[] r0 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52110b = r0
                r1 = 1
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r2 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.SINGLE_DRIVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f52110b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r3 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f52110b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r4 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.NEARBY_DRIVERS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.moovit.itinerary.model.ItinerarySection$Type[] r3 = com.moovit.itinerary.model.ItinerarySection.Type.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f52109a = r3
                com.moovit.itinerary.model.ItinerarySection$Type r4 = com.moovit.itinerary.model.ItinerarySection.Type.UNSPECIFIED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f52109a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.itinerary.model.ItinerarySection$Type r3 = com.moovit.itinerary.model.ItinerarySection.Type.CARPOOL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f52109a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.moovit.itinerary.model.ItinerarySection$Type r1 = com.moovit.itinerary.model.ItinerarySection.Type.BICYCLE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f52109a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.itinerary.model.ItinerarySection$Type r1 = com.moovit.itinerary.model.ItinerarySection.Type.BICYCLE_RENTAL     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p924xt.C20598h.C20600b.<clinit>():void");
        }
    }

    /* renamed from: s2 */
    public static Set<String> m48400s2(Context context, Collection<Itinerary> collection) {
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Itinerary u0 : collection) {
            C13720d.m34276f(u0.mo48295u0(), new C20406f(3), new C1436m(b, 0), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* renamed from: A2 */
    public final void mo52803A2(TripPlanFlexTimeBanner tripPlanFlexTimeBanner) {
        long j;
        this.f52103u = tripPlanFlexTimeBanner;
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        if (searchParams != null) {
            j = searchParams.f40519d.mo24463V().mo24487b();
        } else {
            j = 0;
        }
        if (tripPlanFlexTimeBanner != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_flex_time_shown");
            aVar.mo49939g(AnalyticsAttributeKey.ID, tripPlanFlexTimeBanner.f41846c);
            aVar.mo49936d(AnalyticsAttributeKey.TIME, (long) tripPlanFlexTimeBanner.f41847d);
            aVar.mo49946n(AnalyticsAttributeKey.FROM, j);
            aVar.mo49946n(AnalyticsAttributeKey.CHOSEN_TIME, tripPlanFlexTimeBanner.f41848e.mo24487b());
            mo46797j2(aVar.mo49933a());
        }
        mo52807F2();
    }

    /* renamed from: B2 */
    public final void mo52804B2(Itinerary itinerary) {
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        long currentTimeMillis = System.currentTimeMillis();
        Context requireContext = requireContext();
        C24362h.m61211f(requireContext, AppActionRequest.KEY_CONTEXT);
        C13682b bVar = (C13682b) requireContext.getSystemService("latest_itinerary_controller_service");
        if (bVar != null) {
            ItineraryHistoryItem itineraryHistoryItem = new ItineraryHistoryItem((TripPlanOptions) searchParams.f40519d, itinerary, currentTimeMillis);
            bVar.f33720d = itineraryHistoryItem;
            MoovitExecutors.SINGLE.submit(new C13681a(0, bVar, itineraryHistoryItem));
        }
    }

    /* renamed from: C2 */
    public boolean mo45070C2() {
        return this instanceof C13693c;
    }

    /* renamed from: D2 */
    public final void mo52805D2(C20596g gVar) {
        TripPlanConfig tripPlanConfig;
        String C = C20964s0.m49082C(gVar.f47556c);
        TripPlanConfig tripPlanConfig2 = this.f52101s;
        ServerId serverId = gVar.f52093d.f41913b;
        C20596g gVar2 = C20604l.f52116a;
        if (tripPlanConfig2 != null) {
            Iterator<ItinerarySection> it = tripPlanConfig2.f41932b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ItinerarySection next = it.next();
                if (serverId.equals(next.f41913b)) {
                    tripPlanConfig = new TripPlanConfig(Collections.singletonList(new ItinerarySection(next.f41913b, next.f41914c, next.f41915d, next.f41916e, Integer.MAX_VALUE, next.f41919h, next.f41920i)), tripPlanConfig2.f41933c);
                    break;
                }
            }
        }
        tripPlanConfig = null;
        ArrayList f = C20604l.m48429f(gVar);
        if (tripPlanConfig != null && !C13717b.m34258e(f)) {
            Context context = getContext();
            int i = ItineraryListActivity.f38595U;
            Intent intent = new Intent(context, ItineraryListActivity.class);
            intent.putExtra("config", tripPlanConfig);
            intent.putExtra("itineraries", C13717b.m34264k(f));
            intent.putExtra("title", C);
            startActivity(intent);
        }
    }

    /* renamed from: E2 */
    public final void mo52806E2(int i, int i2) {
        CharSequence charSequence;
        Drawable drawable;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = getText(i);
        }
        if (i2 == 0) {
            drawable = null;
        } else {
            drawable = C17988b.m44611b(i2, requireContext());
        }
        RecyclerView recyclerView = this.f52100r;
        C21100e.m49373x(requireContext(), AppActionRequest.KEY_CONTEXT);
        recyclerView.mo4627l0(new C20795a(drawable, (CharSequence) null, charSequence));
    }

    /* renamed from: F2 */
    public final void mo52807F2() {
        TripPlannerSortType tripPlannerSortType;
        ArrayList arrayList;
        int i;
        RecyclerView recyclerView;
        TripPlannerSortType tripPlannerSortType2;
        Comparator<Itinerary> comparator;
        C20596g gVar;
        Context context = getContext();
        if (context != null) {
            if (this.f52101s == null) {
                C20599a aVar = this.f52098p;
                aVar.f47554i.clear();
                aVar.notifyDataSetChanged();
                return;
            }
            TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
            if (searchParams != null) {
                tripPlannerSortType = searchParams.f40519d.mo24464Y();
            } else {
                tripPlannerSortType = null;
            }
            C20599a aVar2 = this.f52098p;
            TripPlanConfig tripPlanConfig = this.f52101s;
            ArrayList arrayList2 = this.f52105w;
            ArrayList arrayList3 = this.f52102t;
            TripPlanFlexTimeBanner tripPlanFlexTimeBanner = this.f52103u;
            C20596g gVar2 = C20604l.f52116a;
            HashMap h = C13720d.m34278h(arrayList2, new C25541a(), new C20415e(1), new C19752b(2), (C13721e) null);
            List<ItinerarySection> list = tripPlanConfig.f41932b;
            int size = list.size();
            ArrayList arrayList4 = new ArrayList(size);
            C6313h hVar = new C6313h(size);
            C6313h hVar2 = new C6313h(size);
            for (ItinerarySection next : list) {
                ServerId serverId = next.f41913b;
                hVar2.put(serverId, next);
                List list2 = (List) h.get(serverId);
                C20596g gVar3 = new C20596g(next, list2, C20604l.m48426c(context, next, list2));
                arrayList4.add(gVar3);
                hVar.put(serverId, gVar3);
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                TripPlanTodBanner tripPlanTodBanner = (TripPlanTodBanner) it.next();
                C20596g gVar4 = (C20596g) hVar.getOrDefault(tripPlanTodBanner.f41857b, null);
                if (gVar4 != null) {
                    gVar4.add(new C20595f((Itinerary) null, (C20618y) null, (C20596g) null, tripPlanTodBanner, (TripPlanFlexTimeBanner) null, (AdSource) null));
                }
            }
            if (tripPlanFlexTimeBanner == null || (gVar = (C20596g) hVar.getOrDefault(tripPlanFlexTimeBanner.f41845b, null)) == null) {
                arrayList = arrayList4;
            } else {
                arrayList = arrayList4;
                gVar.add(new C20595f((Itinerary) null, (C20618y) null, (C20596g) null, (TripPlanTodBanner) null, tripPlanFlexTimeBanner, (AdSource) null));
            }
            C13723g.m34285f(arrayList, (ArrayList) null, new C18583d(1));
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C20596g gVar5 = (C20596g) arrayList.get(i2);
                if (ItinerarySection.Type.GO_GREEN.equals(gVar5.f52093d.f41914c) && gVar5.size() > 1) {
                    C20596g gVar6 = new C20596g(gVar5.f52093d, new ArrayList(1), C20604l.m48426c(context, gVar5.f52093d, gVar5));
                    gVar6.add(new C20595f((Itinerary) null, (C20618y) null, gVar5, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null, (AdSource) null));
                    arrayList.set(i2, gVar6);
                }
            }
            if (MobileAdsManager.m37073h().f37462d && !C13717b.m34258e(arrayList)) {
                ItinerarySection itinerarySection = ((C20596g) arrayList.get(0)).f52093d;
                if (itinerarySection.f41917f <= 1 || ItinerarySection.Type.GO_GREEN.equals(itinerarySection.f41914c)) {
                    i = 1;
                } else {
                    i = 0;
                }
            } else {
                i = -1;
            }
            if (i != -1) {
                arrayList.add(i, C20604l.f52116a);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C20596g gVar7 = (C20596g) it2.next();
                if (tripPlannerSortType == null) {
                    tripPlannerSortType2 = gVar7.f52093d.f41915d;
                } else {
                    tripPlannerSortType2 = tripPlannerSortType;
                }
                if (tripPlannerSortType2 != null) {
                    comparator = tripPlannerSortType2.getComparator();
                } else {
                    comparator = null;
                }
                if (comparator != null) {
                    Collections.sort(gVar7, new C20602j(comparator, 0));
                }
            }
            aVar2.mo51055y(arrayList);
            if (this.f52098p.f47552g > 0 && (recyclerView = this.f52100r) != null && recyclerView.getAdapter() != this.f52098p) {
                this.f52100r.mo4568Z(this.f52106x);
                this.f52100r.mo4568Z(this.f52107y);
                this.f52100r.mo4593g(this.f52106x, 0);
                this.f52100r.mo4593g(this.f52107y, 1);
                this.f52100r.mo4627l0(this.f52098p);
            }
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        this.f52106x = new C18666c(new C17525d(Color.m40220d(R.attr.colorSurfaceVariant, requireContext)));
        this.f52107y = new C18669f(requireContext, R.drawable.divider_horizontal_full_16_surface_variant);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.trip_plan_results_fragment, viewGroup, false);
        this.f52099q = (BannerView) inflate.findViewById(R.id.banner_view);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.results);
        this.f52100r = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = this.f52100r;
        HashSet hashSet = C20590e.f52076l;
        List<C20589d> list = C20604l.f52117b;
        SparseIntArray sparseIntArray = new SparseIntArray(list.size());
        for (C20589d next : list) {
            sparseIntArray.put(next.f52075a, R.drawable.divider_horizontal_full);
            sparseIntArray.put(next.f52075a | 32768, R.drawable.divider_horizontal_full);
        }
        sparseIntArray.put(32769, R.drawable.divider_horizontal_full);
        sparseIntArray.put(32770, R.drawable.divider_horizontal_full);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        this.f52100r.mo4593g(new C18675k(context, R.drawable.shadow_scroll), -1);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.f52100r;
        if (recyclerView == null || (recyclerView.getAdapter() instanceof C12793c)) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("loadingVisibility", z);
        mo45072x2(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        if (bundle == null || bundle.getBoolean("loadingVisibility")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f52100r.mo4627l0(new C12793c());
        }
        if (bundle != null) {
            mo45071w2(bundle);
        }
        Location O1 = mo46780O1();
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, O1);
        if (searchParams != null) {
            hVar.mo44745a(2, searchParams.f40518c.f23787c.mo24310d());
        }
        ((MoovitAnchoredBannerAdFragment) getChildFragmentManager().mo3983z(R.id.banner_ad_fragment)).mo44739o2(AdSource.SUGGESTED_ROUTES_BANNER, hVar);
    }

    /* renamed from: q2 */
    public final void mo52808q2(List<Itinerary> list) {
        for (Itinerary r2 : list) {
            mo52809r2(r2);
        }
        mo52807F2();
    }

    /* renamed from: r2 */
    public final void mo52809r2(Itinerary itinerary) {
        String str = itinerary.f41894b;
        Integer num = (Integer) this.f52104v.get(str);
        if (num != null) {
            this.f52105w.set(num.intValue(), itinerary);
            return;
        }
        this.f52104v.put(str, Integer.valueOf(this.f52105w.size()));
        this.f52105w.add(itinerary);
    }

    /* renamed from: t2 */
    public void mo50124t2(TripPlanFlexTimeBanner tripPlanFlexTimeBanner) {
        long j;
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        if (searchParams != null) {
            j = searchParams.f40519d.mo24463V().mo24487b();
        } else {
            j = 0;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_flex_time");
        aVar.mo49939g(AnalyticsAttributeKey.ID, tripPlanFlexTimeBanner.f41846c);
        aVar.mo49936d(AnalyticsAttributeKey.TIME, (long) tripPlanFlexTimeBanner.f41847d);
        aVar.mo49946n(AnalyticsAttributeKey.FROM, j);
        aVar.mo49946n(AnalyticsAttributeKey.CHOSEN_TIME, tripPlanFlexTimeBanner.f41848e.mo24487b());
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: u2 */
    public void mo40557u2(Itinerary itinerary) {
        Context context = getContext();
        if (context != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, itinerary.f41894b);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_clicked");
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.SERVICE_ALERT_TYPE;
            C18277b bVar = C16783l.f43688a;
            ServiceStatusCategory serviceStatusCategory = null;
            C16783l.C16786c cVar = new C16783l.C16786c();
            LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) ((Leg) Collections.min(itinerary.mo48295u0(), new C16781j(new C12772a(), cVar))).mo48338i0(cVar);
            if (lineServiceAlertDigest != null) {
                serviceStatusCategory = lineServiceAlertDigest.f23186c.f23213b;
            }
            aVar.mo49939g(analyticsAttributeKey, C0016g.m12B(serviceStatusCategory));
            mo46797j2(aVar.mo49933a());
            boolean a = C16783l.m42469a(itinerary, 5);
            if (a) {
                C20806a.C20807a aVar2 = new C20806a.C20807a("taxi_cell_tap");
                aVar2.mo52934b("multi", "type");
                aVar2.mo52934b(C20957p.m49075a(m48400s2(getContext(), Collections.singleton(itinerary))), "provider_id");
                aVar2.mo52935c();
            }
            startActivity(ItineraryActivity.m37992z2(context, Collections.singletonList(itinerary), a, false));
        }
    }

    /* renamed from: v2 */
    public void mo50125v2(Itinerary itinerary) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, itinerary.f41894b);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_clicked");
        mo46797j2(aVar.mo49933a());
        String str = itinerary.f41895c.f41903e;
        if (str != null) {
            List<Itinerary> unmodifiableList = Collections.unmodifiableList(this.f52105w);
            ArrayList arrayList = new ArrayList(unmodifiableList.size());
            for (Itinerary itinerary2 : unmodifiableList) {
                if (C20975x0.m49118e(itinerary2.f41895c.f41903e, str) && !arrayList.contains(itinerary2)) {
                    arrayList.add(itinerary2);
                }
            }
            int indexOf = arrayList.indexOf(itinerary);
            boolean C2 = mo45070C2();
            FragmentActivity activity = getActivity();
            int i = ItineraryNoGroupActivity.f38596o0;
            Intent intent = new Intent(activity, ItineraryNoGroupActivity.class);
            intent.putExtra("scheduled_itinerary_list_key", new ParcelableMemRef(arrayList));
            intent.putExtra("scheduled_itinerary_list_index_key", indexOf);
            intent.putExtra("view_schedules_enabled_key", C2);
            startActivity(intent);
        }
    }

    /* renamed from: w2 */
    public void mo45071w2(Bundle bundle) {
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        ParcelableDiskRef parcelableDiskRef = (ParcelableDiskRef) bundle.getParcelable("itineraries_ref");
        if (parcelableDiskRef != null) {
            parcelableDiskRef.f23856c.addOnSuccessListener((Executor) MoovitExecutors.SINGLE, new ParcelableDiskRef.C7890e(parcelableDiskRef.f23855b)).addOnCompleteListener((Activity) this.f40822c, new C16977i(this, searchParams, 1));
        } else if (searchParams != null) {
            mo46524n2(searchParams.f40518c, searchParams.f40519d);
        }
    }

    /* renamed from: x2 */
    public void mo45072x2(Bundle bundle) {
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        if (searchParams != null && this.f52101s != null && !C13717b.m34258e(this.f52105w)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("search_id", searchParams.f40517b);
            bundle2.putParcelable("config", this.f52101s);
            bundle2.putParcelableArrayList("itineraries", C13717b.m34264k(this.f52105w));
            bundle.putParcelable("itineraries_ref", new ParcelableDiskRef(bundle2));
        }
    }

    /* renamed from: y2 */
    public void mo40558y2() {
        this.f52101s = null;
        this.f52102t.clear();
        this.f52103u = null;
        this.f52104v.clear();
        this.f52105w.clear();
        C20599a aVar = this.f52098p;
        aVar.f47554i.clear();
        aVar.notifyDataSetChanged();
        if (this.f52100r.getAdapter() != this.f52098p) {
            this.f52100r.mo4568Z(this.f52106x);
            this.f52100r.mo4568Z(this.f52107y);
            this.f52100r.mo4593g(this.f52106x, 0);
            this.f52100r.mo4593g(this.f52107y, 1);
            this.f52100r.mo4627l0(this.f52098p);
        }
    }

    /* renamed from: z2 */
    public final void mo52810z2(TripPlanConfig tripPlanConfig) {
        this.f52101s = tripPlanConfig;
        mo52807F2();
    }
}
