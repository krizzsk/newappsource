package com.moovit.app.suggestedroutes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0207b;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.itinerary.TripPlanResult;
import com.moovit.map.MapFragment;
import com.moovit.request.MetroRevisionMismatchException;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerParams;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.tranzmate.R;
import f00.C16919g;
import g30.C4780l;
import h10.C17293a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p065e.C4413c;
import p304x.C7071l0;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17059d;
import p543hq.C17474b;
import p572iw.C17663f;
import p572iw.C17666h;
import p589jq.C17909a;
import p808sx.C19572h;
import p852ut.C19988a;
import p877vu.C20233c;
import p977zz.C20964s0;
import p977zz.C20969u0;
import p977zz.C20975x0;
import q00.C19047a;
import v90.C13187a;

public class SuggestRoutesActivity extends TripPlannerActivity<TripPlanParams, TripPlanOptions, TripPlanLocationSearchFragment, C17663f, C17666h> implements C19572h.C19573a {

    /* renamed from: r0 */
    public boolean f39798r0 = true;

    /* renamed from: s0 */
    public final C0207b<Intent> f39799s0 = registerForActivityResult(new C4413c(), new C7071l0(this, 9));

    /* renamed from: M2 */
    public static Intent m39325M2(Context context, TripPlanParams tripPlanParams, boolean z) {
        return TripPlannerActivity.m39768z2(context, SuggestRoutesActivity.class, tripPlanParams, z);
    }

    /* renamed from: A2 */
    public final C15578a mo45660A2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        LocationDescriptor locationDescriptor;
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        LocationDescriptor locationDescriptor2 = null;
        if (tripPlannerLocations != null) {
            locationDescriptor = tripPlannerLocations.f23786b;
        } else {
            locationDescriptor = null;
        }
        if (tripPlannerLocations != null) {
            locationDescriptor2 = tripPlannerLocations.f23787c;
        }
        int i = TripPlanLocationSearchFragment.f39800x;
        Bundle bundle = new Bundle();
        if (locationDescriptor != null) {
            bundle.putParcelable("extra_location_origin_params_request", locationDescriptor);
        }
        if (locationDescriptor2 != null) {
            bundle.putParcelable("extra_location_destination_param_request", locationDescriptor2);
        }
        TripPlanLocationSearchFragment tripPlanLocationSearchFragment = new TripPlanLocationSearchFragment();
        tripPlanLocationSearchFragment.setArguments(bundle);
        return tripPlanLocationSearchFragment;
    }

    /* renamed from: B2 */
    public final C15581b mo45661B2(TripPlannerOptions tripPlannerOptions) {
        return C17663f.m43826t2((TripPlanOptions) tripPlannerOptions);
    }

    /* renamed from: C2 */
    public final TripPlannerResultsFragment mo45662C2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        List<TripPlanResult> list;
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        TripPlanParams tripPlanParams = (TripPlanParams) ((TripPlannerParams) getIntent().getParcelableExtra("extra_trip_plan_params"));
        if (tripPlanParams == null) {
            list = null;
        } else {
            list = tripPlanParams.f23221g;
        }
        int i = C17666h.f45402O;
        Bundle bundle = new Bundle();
        bundle.putParcelable("locations", tripPlannerLocations);
        bundle.putParcelable("options", tripPlanOptions);
        bundle.putParcelableArrayList("initial_results", C13717b.m34264k(list));
        C17666h hVar = new C17666h();
        hVar.setArguments(bundle);
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117 A[Catch:{ Exception -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e A[Catch:{ Exception -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129 A[Catch:{ Exception -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c A[Catch:{ Exception -> 0x0144 }] */
    /* renamed from: F2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.moovit.tripplanner.TripPlannerLocations mo45957F2(android.content.Intent r27) {
        /*
            r26 = this;
            android.net.Uri r0 = r27.getData()
            java.lang.String r1 = "moovit"
            boolean r1 = p977zz.C20969u0.m49111b(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "orig_lat"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r3 = "orig_lon"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r4 = "orig_name"
            java.lang.String r10 = r0.getQueryParameter(r4)
            android.os.Parcelable$Creator<com.moovit.transit.LocationDescriptor> r4 = com.moovit.transit.LocationDescriptor.CREATOR
            double r4 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x0041 }
            double r6 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x0041 }
            com.moovit.transit.LocationDescriptor r1 = new com.moovit.transit.LocationDescriptor     // Catch:{ Exception -> 0x0041 }
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE     // Catch:{ Exception -> 0x0041 }
            com.moovit.transit.LocationDescriptor$SourceType r8 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL     // Catch:{ Exception -> 0x0041 }
            com.moovit.commons.geo.LatLonE6 r12 = com.moovit.commons.geo.LatLonE6.m40176g(r4, r6)     // Catch:{ Exception -> 0x0041 }
            r4 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r5 = r1
            r6 = r3
            r7 = r8
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            r1 = r2
        L_0x0043:
            if (r1 != 0) goto L_0x0049
            com.moovit.transit.LocationDescriptor r1 = com.moovit.transit.LocationDescriptor.m17772m(r26)
        L_0x0049:
            java.lang.String r3 = "dest_lat"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r4 = "dest_lon"
            java.lang.String r4 = r0.getQueryParameter(r4)
            java.lang.String r5 = "dest_name"
            java.lang.String r11 = r0.getQueryParameter(r5)
            double r5 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x0079 }
            double r3 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x0079 }
            com.moovit.transit.LocationDescriptor r0 = new com.moovit.transit.LocationDescriptor     // Catch:{ Exception -> 0x0079 }
            com.moovit.transit.LocationDescriptor$LocationType r7 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE     // Catch:{ Exception -> 0x0079 }
            com.moovit.transit.LocationDescriptor$SourceType r8 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL     // Catch:{ Exception -> 0x0079 }
            com.moovit.commons.geo.LatLonE6 r13 = com.moovit.commons.geo.LatLonE6.m40176g(r5, r3)     // Catch:{ Exception -> 0x0079 }
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0079 }
            r2 = r0
        L_0x0079:
            com.moovit.tripplanner.TripPlannerLocations r0 = new com.moovit.tripplanner.TripPlannerLocations
            r0.<init>(r1, r2)
            return r0
        L_0x007f:
            r1 = 1
            if (r0 == 0) goto L_0x0090
            java.lang.String r3 = r0.getScheme()
            java.lang.String r4 = "geo"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0090
            r3 = 1
            goto L_0x0091
        L_0x0090:
            r3 = 0
        L_0x0091:
            if (r3 == 0) goto L_0x016d
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r4 = "\\s+"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replaceAll(r4, r5)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r4 = "geo:(?:([\\-0-9.]+),([\\-0-9.]+))?(?:\\?(?:(?:q=([\\-0-9.]+),([\\-0-9.]+)(?:\\((.*)\\))?)|(?:q=(.*))|(?:.*)))?"
            r5 = 2
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r5)     // Catch:{ Exception -> 0x0144 }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ Exception -> 0x0144 }
            boolean r4 = r3.matches()     // Catch:{ Exception -> 0x0144 }
            if (r4 != 0) goto L_0x00b2
            goto L_0x0161
        L_0x00b2:
            java.lang.String r1 = r3.group(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r4 = r3.group(r5)     // Catch:{ Exception -> 0x0144 }
            r5 = 3
            java.lang.String r5 = r3.group(r5)     // Catch:{ Exception -> 0x0144 }
            r6 = 4
            java.lang.String r6 = r3.group(r6)     // Catch:{ Exception -> 0x0144 }
            r7 = 5
            java.lang.String r7 = r3.group(r7)     // Catch:{ Exception -> 0x0144 }
            r8 = 6
            java.lang.String r3 = r3.group(r8)     // Catch:{ Exception -> 0x0144 }
            boolean r8 = p977zz.C20964s0.m49090h(r1)     // Catch:{ Exception -> 0x0144 }
            r9 = 0
            if (r8 != 0) goto L_0x00e5
            boolean r8 = p977zz.C20964s0.m49090h(r4)     // Catch:{ Exception -> 0x0144 }
            if (r8 != 0) goto L_0x00e5
            double r11 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x0144 }
            double r13 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x0144 }
            goto L_0x00e7
        L_0x00e5:
            r11 = r9
            r13 = r11
        L_0x00e7:
            boolean r1 = p977zz.C20964s0.m49090h(r5)     // Catch:{ Exception -> 0x0144 }
            if (r1 != 0) goto L_0x00fe
            boolean r1 = p977zz.C20964s0.m49090h(r6)     // Catch:{ Exception -> 0x0144 }
            if (r1 != 0) goto L_0x00fe
            double r3 = java.lang.Double.parseDouble(r5)     // Catch:{ Exception -> 0x0144 }
            double r5 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x0144 }
            r11 = r3
            r13 = r5
            goto L_0x010a
        L_0x00fe:
            boolean r1 = p977zz.C20964s0.m49090h(r3)     // Catch:{ Exception -> 0x0144 }
            if (r1 != 0) goto L_0x010d
            java.lang.String r1 = "UTF-8"
            java.lang.String r7 = java.net.URLDecoder.decode(r3, r1)     // Catch:{ Exception -> 0x0144 }
        L_0x010a:
            r20 = r7
            goto L_0x010f
        L_0x010d:
            r20 = r2
        L_0x010f:
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x011e
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x011e
            com.moovit.commons.geo.LatLonE6 r1 = com.moovit.commons.geo.LatLonE6.m40176g(r11, r13)     // Catch:{ Exception -> 0x0144 }
            r22 = r1
            goto L_0x0120
        L_0x011e:
            r22 = r2
        L_0x0120:
            if (r22 != 0) goto L_0x0125
            if (r20 != 0) goto L_0x0125
            goto L_0x0161
        L_0x0125:
            com.moovit.transit.LocationDescriptor r1 = new com.moovit.transit.LocationDescriptor     // Catch:{ Exception -> 0x0144 }
            if (r22 != 0) goto L_0x012c
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.POI     // Catch:{ Exception -> 0x0144 }
            goto L_0x012e
        L_0x012c:
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE     // Catch:{ Exception -> 0x0144 }
        L_0x012e:
            r16 = r3
            com.moovit.transit.LocationDescriptor$SourceType r17 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL     // Catch:{ Exception -> 0x0144 }
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0144 }
            r2 = r1
            goto L_0x0161
        L_0x0144:
            de.f r1 = p435de.C16596f.m42113a()
            java.net.MalformedURLException r3 = new java.net.MalformedURLException
            java.lang.String r4 = "GEO: "
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            r1.mo49364c(r3)
        L_0x0161:
            if (r2 == 0) goto L_0x016d
            com.moovit.transit.LocationDescriptor r0 = com.moovit.transit.LocationDescriptor.m17772m(r26)
            com.moovit.tripplanner.TripPlannerLocations r1 = new com.moovit.tripplanner.TripPlannerLocations
            r1.<init>(r0, r2)
            return r1
        L_0x016d:
            com.moovit.tripplanner.TripPlannerLocations r0 = super.mo45957F2(r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.suggestedroutes.SuggestRoutesActivity.mo45957F2(android.content.Intent):com.moovit.tripplanner.TripPlannerLocations");
    }

    /* renamed from: G2 */
    public final TripPlannerOptions mo45663G2(Intent intent) {
        long j;
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        C17909a aVar2 = (C17909a) mo44537r1("ACCESSIBILITY_CONFIGURATION");
        Uri data = intent.getData();
        if (C20969u0.m49111b(data, "moovit")) {
            String queryParameter = data.getQueryParameter("date");
            TripPlannerTime.Type type = TripPlannerTime.Type.DEPART;
            if (C20964s0.m49090h(queryParameter)) {
                j = -1;
            } else {
                j = Long.parseLong(queryParameter);
            }
            return new TripPlanOptions(new TripPlannerTime(type, j), aVar.mo40061b(), aVar.mo40063d(), aVar.mo40062c(), aVar.mo40060a(), aVar2.mo50463a());
        }
        TripPlanParams tripPlanParams = (TripPlanParams) ((TripPlannerParams) intent.getParcelableExtra("extra_trip_plan_params"));
        if (tripPlanParams == null) {
            return null;
        }
        TripPlannerTime tripPlannerTime = tripPlanParams.f23218d;
        if (tripPlannerTime == null) {
            tripPlannerTime = TripPlannerTime.m17899f();
        }
        TripPlannerTime tripPlannerTime2 = tripPlannerTime;
        TripPlannerRouteType tripPlannerRouteType = tripPlanParams.f23219e;
        if (tripPlannerRouteType == null) {
            tripPlannerRouteType = aVar.mo40061b();
        }
        TripPlannerRouteType tripPlannerRouteType2 = tripPlannerRouteType;
        Set<TripPlannerTransportType> set = tripPlanParams.f23220f;
        if (C13717b.m34258e(set)) {
            set = aVar.mo40063d();
        }
        return new TripPlanOptions(tripPlannerTime2, tripPlannerRouteType2, set, aVar.mo40062c(), aVar.mo40060a(), aVar2.mo50463a());
    }

    /* renamed from: H2 */
    public final boolean mo45958H2(Intent intent) {
        Uri data = intent.getData();
        if (C20969u0.m49111b(data, "moovit")) {
            return data.getBooleanQueryParameter("auto_run", true);
        }
        return intent.getBooleanExtra("extra_auto_search", false);
    }

    /* renamed from: J1 */
    public final boolean mo44507J1() {
        return false;
    }

    /* renamed from: J2 */
    public final void mo45959J2(TripPlannerLocations tripPlannerLocations) {
        super.mo45959J2(tripPlannerLocations);
        MobileAdsManager.m37073h().mo44716q(this, AdSource.TRANSITION_INTERSTITIAL);
    }

    /* renamed from: K2 */
    public final boolean mo45664K2() {
        if (mo45958H2(getIntent())) {
            return true;
        }
        return super.mo45664K2();
    }

    /* renamed from: c */
    public final void mo45960c(Set<TripPlannerTransportType> set) {
        if (this.f37297F.mo44595c("TRIP_PLANNER_CONFIGURATION")) {
            ((C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION")).f32743d.mo49544c(set);
            TripPlanOptions tripPlanOptions = (TripPlanOptions) mo46520E2().f40537p;
            TripPlanOptions tripPlanOptions2 = new TripPlanOptions(tripPlanOptions.f39803b, tripPlanOptions.f39804c, set, tripPlanOptions.f39806e, tripPlanOptions.f39807f, tripPlanOptions.f39808g);
            C15581b E2 = mo46520E2();
            if (E2 != null) {
                E2.mo46541p2(tripPlanOptions2, 0);
            }
        }
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C17293a(this, "suggest_routes"));
        if (!mo45958H2(getIntent())) {
            arrayList.add((C16851b) new C17059d(this).mo49508c().f43144b);
        }
        return new C16855d(this, R.id.root, arrayList);
    }

    /* renamed from: h1 */
    public final void mo45129h1() {
        boolean z;
        TripPlannerLocations s2 = mo46519D2().mo46532s2();
        TripPlanOptions tripPlanOptions = (TripPlanOptions) mo46520E2().f40537p;
        if (s2.mo24458b() && tripPlanOptions != null) {
            if (!((String) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C19988a.f50825a)).equals("direct_to_itinerary_type_test") || !this.f39798r0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "direct_to_itinerary");
                mo44545v2(aVar.mo49933a());
                TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
                dVar.f23790a = s2.f23786b;
                dVar.f23791b = s2.f23787c;
                dVar.f23222c = tripPlanOptions.f39803b;
                dVar.f23223d = tripPlanOptions.f39804c;
                dVar.mo23959b(tripPlanOptions.f39805d);
                TripPlanParams a = dVar.mo23958a();
                Intent intent = new Intent(this, ItineraryActivity.class);
                intent.putExtra("trip_plan_params_extra", a);
                intent.putExtra("scheduled_itinerary_list_index_key", 0);
                intent.putExtra("disable_actions_extra", false);
                intent.putExtra("display_history_date_extra", false);
                this.f39799s0.mo772a(intent);
                return;
            }
        }
        super.mo45129h1();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.IS_WAZE_CARPOOL_INSTALLED;
        C16919g.C16920a aVar = C20233c.f51336a;
        m1.mo49941i(analyticsAttributeKey, C20975x0.m49121h(this, "com.ridewith"));
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        C0016g.m11A(hashSet, "USER_ACCOUNT", "TWITTER_SERVICE_ALERTS_FEEDS", "HISTORY", "TAXI_PROVIDERS_MANAGER");
        hashSet.add("LATEST_ITINERARY_CONTROLLER");
        return s1;
    }

    /* renamed from: s2 */
    public final void mo44538s2(MetroRevisionMismatchException metroRevisionMismatchException) {
        boolean z;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i = C4780l.f16147n;
        if (supportFragmentManager.mo3923A("metro_updated_loading_dialog_tag") != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C4780l.m12112S1(supportFragmentManager, metroRevisionMismatchException, (HashSet) mo19438s1());
        }
    }

    /* renamed from: y2 */
    public final MapFragment mo45665y2() {
        MapFragment mapFragment = new MapFragment();
        mapFragment.setArguments(new Bundle());
        return mapFragment;
    }
}
