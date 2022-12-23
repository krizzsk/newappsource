package com.moovit.app.itinerary.nogroup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListView;
import c00.C13717b;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.itinerary.nogroup.C15063a;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.location.C16202a;
import com.moovit.util.ParcelableDiskRef;
import com.moovit.util.ParcelableMemRef;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import m10.C18321b;
import p543hq.C17474b;
import p858uz.C20061g;
import p947yt.C20766a;
import p947yt.C20767b;

public class ItineraryNoGroupActivity extends MoovitAppActivity {

    /* renamed from: o0 */
    public static final /* synthetic */ int f38596o0 = 0;

    /* renamed from: U */
    public ExpandableListView f38597U;

    /* renamed from: X */
    public List<Itinerary> f38598X;

    /* renamed from: Y */
    public boolean f38599Y;

    /* renamed from: Z */
    public int f38600Z = -1;

    /* renamed from: l0 */
    public final C15056a f38601l0 = new C15056a();

    /* renamed from: m0 */
    public final C15057b f38602m0 = new C15057b();

    /* renamed from: n0 */
    public C15058c f38603n0 = new C15058c();

    /* renamed from: com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity$a */
    public class C15056a implements C15063a.C15064a {
        public C15056a() {
        }
    }

    /* renamed from: com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity$b */
    public class C15057b implements ExpandableListView.OnGroupExpandListener {
        public C15057b() {
        }

        public final void onGroupExpand(int i) {
            ItineraryNoGroupActivity itineraryNoGroupActivity = ItineraryNoGroupActivity.this;
            int i2 = itineraryNoGroupActivity.f38600Z;
            if (i2 != i) {
                itineraryNoGroupActivity.f38600Z = i;
                itineraryNoGroupActivity.f38597U.collapseGroup(i2);
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "expand_clicked");
                aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
                itineraryNoGroupActivity.mo44545v2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity$c */
    public class C15058c implements ExpandableListView.OnGroupCollapseListener {
        public C15058c() {
        }

        public final void onGroupCollapse(int i) {
            ItineraryNoGroupActivity itineraryNoGroupActivity = ItineraryNoGroupActivity.this;
            if (itineraryNoGroupActivity.f38600Z == i) {
                itineraryNoGroupActivity.f38600Z = -1;
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "collapse_clicked");
                aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
                itineraryNoGroupActivity.mo44545v2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.itinerary_ng_layout);
        if (bundle != null) {
            int i = bundle.getInt("selectedIndex", -1);
            boolean booleanExtra = mo44546w1().getBooleanExtra("view_schedules_enabled_key", false);
            ParcelableDiskRef parcelableDiskRef = (ParcelableDiskRef) bundle.getParcelable("itineraries_ref");
            if (parcelableDiskRef != null) {
                parcelableDiskRef.f23856c.addOnSuccessListener((Executor) MoovitExecutors.SINGLE, new ParcelableDiskRef.C7890e(parcelableDiskRef.f23855b)).addOnSuccessListener((Activity) this, new C20766a(this, i, booleanExtra)).addOnFailureListener((Activity) this, (OnFailureListener) new C20767b(this, 0));
            }
        } else {
            Intent intent = getIntent();
            mo45321y2(intent.getIntExtra("scheduled_itinerary_list_index_key", 0), (List) ((ParcelableMemRef) intent.getParcelableExtra("scheduled_itinerary_list_key")).mo24562b(), intent.getBooleanExtra("view_schedules_enabled_key", false));
        }
        C18321b.f46724b.mo49545d(getSharedPreferences("genies_prefs", 0), Boolean.TRUE);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("itineraries", C13717b.m34264k(this.f38598X));
        bundle.putParcelable("itineraries_ref", new ParcelableDiskRef(bundle2));
        bundle.putInt("selectedIndex", this.f38600Z);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("TWITTER_SERVICE_ALERTS_FEEDS");
        return s1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0161  */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45321y2(int r10, java.util.List r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = c00.C13717b.m34258e(r11)
            if (r0 == 0) goto L_0x000a
            r9.finish()
            return
        L_0x000a:
            r9.f38598X = r11
            r9.f38600Z = r10
            r9.f38599Y = r12
            lu.b r10 = e20.C16783l.f43688a
            boolean r10 = r11.isEmpty()
            r12 = 2
            r0 = -1
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x001e
            goto L_0x009b
        L_0x001e:
            java.lang.Object r10 = r11.get(r1)
            com.moovit.itinerary.model.Itinerary r10 = (com.moovit.itinerary.model.Itinerary) r10
            int[] r3 = new int[r12]
            r3 = {2, 9} // fill-array
            java.util.List r4 = r10.mo48295u0()
            com.moovit.itinerary.model.leg.Leg r3 = e20.C16783l.m42476h(r4, r0, r3)
            int[] r4 = new int[r12]
            r4 = {2, 9} // fill-array
            java.util.List r10 = r10.mo48295u0()
            int r5 = r10.size()
            com.moovit.itinerary.model.leg.Leg r10 = e20.C16783l.m42477i(r10, r5, r4)
            com.moovit.transit.LocationDescriptor r3 = r3.mo48332W()
            com.moovit.network.model.ServerId r3 = r3.f23649d
            com.moovit.transit.LocationDescriptor r10 = r10.mo48334e2()
            com.moovit.network.model.ServerId r10 = r10.f23649d
            r4 = 1
        L_0x004f:
            int r5 = r11.size()
            if (r4 >= r5) goto L_0x009b
            java.lang.Object r5 = r11.get(r4)
            com.moovit.itinerary.model.Itinerary r5 = (com.moovit.itinerary.model.Itinerary) r5
            int[] r6 = new int[r12]
            r6 = {2, 9} // fill-array
            java.util.List r7 = r5.mo48295u0()
            com.moovit.itinerary.model.leg.Leg r6 = e20.C16783l.m42476h(r7, r0, r6)
            int[] r7 = new int[r12]
            r7 = {2, 9} // fill-array
            java.util.List r5 = r5.mo48295u0()
            int r8 = r5.size()
            com.moovit.itinerary.model.leg.Leg r5 = e20.C16783l.m42477i(r5, r8, r7)
            com.moovit.transit.LocationDescriptor r6 = r6.mo48332W()
            com.moovit.network.model.ServerId r6 = r6.f23649d
            boolean r6 = p977zz.C20975x0.m49118e(r6, r3)
            if (r6 == 0) goto L_0x0093
            com.moovit.transit.LocationDescriptor r5 = r5.mo48334e2()
            com.moovit.network.model.ServerId r5 = r5.f23649d
            boolean r5 = p977zz.C20975x0.m49118e(r5, r10)
            if (r5 == 0) goto L_0x0093
            r5 = 1
            goto L_0x0094
        L_0x0093:
            r5 = 0
        L_0x0094:
            if (r5 != 0) goto L_0x0098
            r10 = 0
            goto L_0x009c
        L_0x0098:
            int r4 = r4 + 1
            goto L_0x004f
        L_0x009b:
            r10 = 1
        L_0x009c:
            r11 = 2131363067(0x7f0a04fb, float:1.8345932E38)
            android.view.View r11 = r9.findViewById(r11)
            if (r10 == 0) goto L_0x00a7
            r3 = 0
            goto L_0x00a9
        L_0x00a7:
            r3 = 8
        L_0x00a9:
            r11.setVisibility(r3)
            if (r10 != 0) goto L_0x00b0
            goto L_0x0144
        L_0x00b0:
            java.util.List<com.moovit.itinerary.model.Itinerary> r10 = r9.f38598X
            java.lang.Object r10 = r10.get(r1)
            com.moovit.itinerary.model.Itinerary r10 = (com.moovit.itinerary.model.Itinerary) r10
            int[] r3 = new int[r12]
            r3 = {2, 9} // fill-array
            lu.b r4 = e20.C16783l.f43688a
            java.util.List r4 = r10.mo48295u0()
            com.moovit.itinerary.model.leg.Leg r3 = e20.C16783l.m42476h(r4, r0, r3)
            com.moovit.itinerary.model.leg.TransitLineLeg r3 = e20.C16783l.m42490v(r3)
            int[] r4 = new int[r12]
            r4 = {2, 9} // fill-array
            java.util.List r5 = r10.mo48295u0()
            int r6 = r5.size()
            com.moovit.itinerary.model.leg.Leg r4 = e20.C16783l.m42477i(r5, r6, r4)
            com.moovit.itinerary.model.leg.TransitLineLeg r4 = e20.C16783l.m42490v(r4)
            if (r3 == 0) goto L_0x010e
            if (r4 != 0) goto L_0x00e5
            goto L_0x010e
        L_0x00e5:
            r10 = 2131363669(0x7f0a0755, float:1.8347153E38)
            android.view.View r10 = r11.findViewById(r10)
            com.moovit.design.view.list.ListItemView r10 = (com.moovit.design.view.list.ListItemView) r10
            com.moovit.transit.LocationDescriptor r1 = r3.mo48332W()
            java.lang.String r1 = r1.mo24313f()
            r10.setSubtitle((java.lang.CharSequence) r1)
            r10 = 2131362648(0x7f0a0358, float:1.8345083E38)
            android.view.View r10 = r11.findViewById(r10)
            com.moovit.design.view.list.ListItemView r10 = (com.moovit.design.view.list.ListItemView) r10
            com.moovit.transit.LocationDescriptor r11 = r4.mo48334e2()
            java.lang.String r11 = r11.mo24313f()
            r10.setSubtitle((java.lang.CharSequence) r11)
            goto L_0x0144
        L_0x010e:
            de.f r11 = p435de.C16596f.m42113a()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "ItineraryNoGroup init with firstTransitLeg null ? "
            java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
            if (r3 != 0) goto L_0x011e
            r3 = 1
            goto L_0x011f
        L_0x011e:
            r3 = 0
        L_0x011f:
            r6.append(r3)
            java.lang.String r3 = " and/or lastTransitLeg null ? "
            r6.append(r3)
            if (r4 != 0) goto L_0x012a
            r1 = 1
        L_0x012a:
            r6.append(r1)
            java.lang.String r1 = " itinerary id: "
            r6.append(r1)
            java.lang.String r10 = r10.f41894b
            r6.append(r10)
            java.lang.String r10 = r6.toString()
            r5.<init>(r10)
            r11.mo49364c(r5)
            r9.finish()
        L_0x0144:
            r10 = 2131363263(0x7f0a05bf, float:1.834633E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ExpandableListView r10 = (android.widget.ExpandableListView) r10
            r9.f38597U = r10
            com.moovit.app.itinerary.nogroup.a r11 = new com.moovit.app.itinerary.nogroup.a
            java.util.List<com.moovit.itinerary.model.Itinerary> r1 = r9.f38598X
            boolean r3 = r9.f38599Y
            com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity$a r4 = r9.f38601l0
            r11.<init>(r1, r3, r4)
            r10.setAdapter(r11)
            int r10 = r9.f38600Z
            if (r10 == r0) goto L_0x0166
            android.widget.ExpandableListView r11 = r9.f38597U
            r11.expandGroup(r10, r2)
        L_0x0166:
            android.widget.ExpandableListView r10 = r9.f38597U
            com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity$b r11 = r9.f38602m0
            r10.setOnGroupExpandListener(r11)
            android.widget.ExpandableListView r10 = r9.f38597U
            com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity$c r11 = r9.f38603n0
            r10.setOnGroupCollapseListener(r11)
            r10 = 2131362079(0x7f0a011f, float:1.8343928E38)
            android.view.View r10 = r9.findViewById(r10)
            androidx.fragment.app.FragmentContainerView r10 = (androidx.fragment.app.FragmentContainerView) r10
            androidx.fragment.app.Fragment r10 = r10.getFragment()
            com.moovit.app.ads.MoovitAnchoredBannerAdFragment r10 = (com.moovit.app.ads.MoovitAnchoredBannerAdFragment) r10
            com.moovit.app.ads.h r11 = new com.moovit.app.ads.h
            r11.<init>()
            android.location.Location r0 = r9.mo44542u1()
            r11.mo44745a(r2, r0)
            java.util.List<com.moovit.itinerary.model.Itinerary> r0 = r9.f38598X
            java.lang.Object r0 = c00.C13717b.m34256c(r0)
            com.moovit.itinerary.model.Itinerary r0 = (com.moovit.itinerary.model.Itinerary) r0
            com.moovit.itinerary.model.leg.Leg r0 = r0.mo48290c()
            com.moovit.transit.LocationDescriptor r0 = r0.mo48334e2()
            com.moovit.commons.geo.LatLonE6 r0 = r0.mo24310d()
            r11.mo44745a(r12, r0)
            com.moovit.app.ads.AdSource r12 = com.moovit.app.ads.AdSource.TRAIN_SCHEDULE_SCREEN_BANNER
            r10.mo44739o2(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity.mo45321y2(int, java.util.List, boolean):void");
    }
}
