package com.moovit.app.suggestedroutes;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.activity.result.C0207b;
import c00.C13717b;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.accessibility.UserProfileAccessibilityPrefType;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.tripplanner.TripPlannerAlgorithmType;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.tripplanner.TripPlannerWalkingPrefType;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import m00.C18310d;
import p001a0.C0017h;
import p039c7.C1800c;
import p065e.C4413c;
import p304x.C7038d0;
import p543hq.C17474b;
import p572iw.C17659b;
import p572iw.C17660c;
import p589jq.C17909a;
import p589jq.C17913e;
import p716oy.C18860a;
import p977zz.C20941h;
import p977zz.C20964s0;
import v90.C13187a;

public class TripPlanOptionsActivity extends MoovitAppActivity {

    /* renamed from: o0 */
    public static final /* synthetic */ int f39809o0 = 0;

    /* renamed from: U */
    public final C0207b<Intent> f39810U = registerForActivityResult(new C4413c(), new C7038d0(this, 12));

    /* renamed from: X */
    public TripPlannerSortType f39811X;

    /* renamed from: Y */
    public TripPlannerRouteType f39812Y;

    /* renamed from: Z */
    public Set<TripPlannerTransportType> f39813Z;

    /* renamed from: l0 */
    public TripPlannerPersonalPrefs f39814l0;

    /* renamed from: m0 */
    public AccessibilityPersonalPrefs f39815m0;

    /* renamed from: n0 */
    public ListItemView f39816n0;

    /* renamed from: com.moovit.app.suggestedroutes.TripPlanOptionsActivity$a */
    public static class C15372a extends C18310d<TripPlannerSortType, ListItemView, Void> {
        public C15372a(Context context, List<TripPlannerSortType> list) {
            super(context, R.layout.trip_plan_options_sort_type_item, list);
        }

        /* renamed from: d */
        public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
            ListItemView listItemView = (ListItemView) view;
            TripPlannerSortType tripPlannerSortType = (TripPlannerSortType) obj;
            listItemView.setIcon(tripPlannerSortType.getIconResId());
            listItemView.setText(tripPlannerSortType.getNameResId());
        }
    }

    /* renamed from: com.moovit.app.suggestedroutes.TripPlanOptionsActivity$b */
    public static class C15373b extends C18310d<TripPlannerRouteType, ListItemView, Void> {

        /* renamed from: i */
        public final String f39817i;

        public C15373b(Context context, List<TripPlannerRouteType> list) {
            super(context, R.layout.trip_plan_options_route_type_item, R.layout.trip_plan_options_route_type_item, list);
            this.f39817i = context.getString(R.string.voiceover_one_outof_another);
        }

        /* renamed from: d */
        public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
            ListItemView listItemView = (ListItemView) view;
            TripPlannerRouteType tripPlannerRouteType = (TripPlannerRouteType) obj;
            listItemView.setIcon(tripPlannerRouteType.getIconResId());
            listItemView.setText(tripPlannerRouteType.getNameResId());
            C13382a.m33674j(listItemView, listItemView.getTitle(), String.format(this.f39817i, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(size())}));
        }
    }

    /* renamed from: y2 */
    public static Intent m39353y2(Context context, int i, TripPlannerRouteType tripPlannerRouteType, Set<TripPlannerTransportType> set, TripPlannerSortType tripPlannerSortType, TripPlannerPersonalPrefs tripPlannerPersonalPrefs, AccessibilityPersonalPrefs accessibilityPersonalPrefs) {
        Intent intent = new Intent(context, TripPlanOptionsActivity.class);
        intent.putExtra("titleResId", i);
        intent.putExtra("routeType", tripPlannerRouteType);
        intent.putExtra("transportTypes", C13717b.m34264k(set));
        intent.putExtra("sortType", tripPlannerSortType);
        intent.putExtra("personalPrefs", tripPlannerPersonalPrefs);
        intent.putExtra("accessibilityPrefs", accessibilityPersonalPrefs);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo45969A2(C13187a aVar) {
        String str;
        String str2 = null;
        if (aVar.mo40060a().f23793b) {
            str = getString(R.string.tripplan_prefernces_walk_options_slow_set_subtitle);
        } else {
            str = null;
        }
        short s = aVar.mo40060a().f23794c;
        if (s != -1) {
            str2 = getString(R.string.tripplan_prefernces_walk_options_max_set_subtitle, new Object[]{Integer.valueOf(s)});
        }
        CharSequence q = C20964s0.m49099q(getString(R.string.string_list_delimiter_dot), str, str2);
        if (C20964s0.m49090h(q)) {
            this.f39816n0.setSubtitle((int) R.string.tripplan_prefernces_walk_options_subtitle);
            this.f39816n0.setSubtitleTextColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisHigh, this));
            return;
        }
        this.f39816n0.setSubtitle(q);
        this.f39816n0.setSubtitleTextColor(C20941h.m49043f(R.attr.colorInfo, this));
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        mo45970z2();
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49939g(AnalyticsAttributeKey.TYPE, C0017h.m47D(aVar.mo40061b()));
        e1.mo49939g(AnalyticsAttributeKey.SORT_TYPE, C0017h.m48E(aVar.mo40062c()));
        e1.mo49942j(AnalyticsAttributeKey.AVAILABLE_SETTINGS_MASK, C0017h.m49F(aVar.f32742c));
        e1.mo49942j(AnalyticsAttributeKey.SET_SETTINGS_MASK, C0017h.m50G(aVar.mo40063d()));
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        Set set;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.trip_plan_options_activity);
        Intent intent = getIntent();
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        C17909a aVar2 = (C17909a) mo44537r1("ACCESSIBILITY_CONFIGURATION");
        int intExtra = intent.getIntExtra("titleResId", 0);
        if (intExtra != 0) {
            setTitle(intExtra);
        }
        TripPlannerSortType tripPlannerSortType = (TripPlannerSortType) intent.getParcelableExtra("sortType");
        this.f39811X = tripPlannerSortType;
        if (tripPlannerSortType == null) {
            this.f39811X = aVar.mo40062c();
        }
        TripPlannerRouteType tripPlannerRouteType = (TripPlannerRouteType) intent.getParcelableExtra("routeType");
        this.f39812Y = tripPlannerRouteType;
        if (tripPlannerRouteType == null) {
            this.f39812Y = aVar.mo40061b();
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("transportTypes");
        if (parcelableArrayListExtra != null) {
            set = new HashSet(parcelableArrayListExtra);
        } else {
            set = aVar.mo40063d();
        }
        this.f39813Z = Collections.unmodifiableSet(set);
        TripPlannerPersonalPrefs tripPlannerPersonalPrefs = (TripPlannerPersonalPrefs) intent.getParcelableExtra("personalPrefs");
        this.f39814l0 = tripPlannerPersonalPrefs;
        if (tripPlannerPersonalPrefs == null) {
            this.f39814l0 = aVar.mo40060a();
        }
        AccessibilityPersonalPrefs accessibilityPersonalPrefs = (AccessibilityPersonalPrefs) intent.getParcelableExtra("accessibilityPrefs");
        this.f39815m0 = accessibilityPersonalPrefs;
        if (accessibilityPersonalPrefs == null) {
            this.f39815m0 = aVar2.mo50463a();
        }
        FixedListView fixedListView = (FixedListView) findViewById(R.id.root);
        List<TripPlannerSortType> list = aVar.f32744e;
        View findViewById = fixedListView.findViewById(R.id.sort_preferences_title);
        if (C13717b.m34258e(list)) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            TripPlannerSortType c = aVar.mo40062c();
            C15372a aVar3 = new C15372a(this, list);
            FixedListView.C15814d dVar = new FixedListView.C15814d(fixedListView.getContext(), aVar3);
            fixedListView.addView(dVar, fixedListView.indexOfChild(findViewById) + 1);
            ListView listView = dVar.getListView();
            listView.setDivider(C17988b.m44611b(R.drawable.divider_horizontal, fixedListView.getContext()));
            listView.setChoiceMode(1);
            listView.setItemChecked(aVar3.indexOf(c), true);
            listView.setOnItemClickListener(new C17660c(aVar, aVar3));
        }
        List<TripPlannerRouteType> list2 = aVar.f32740a;
        View findViewById2 = fixedListView.findViewById(R.id.route_types_title);
        if (C13717b.m34258e(list2) || list2.size() == 1) {
            findViewById2.setVisibility(8);
        } else {
            findViewById2.setVisibility(0);
            FixedListView.C15814d dVar2 = new FixedListView.C15814d(fixedListView.getContext(), new C15373b(this, list2));
            fixedListView.addView(dVar2, fixedListView.indexOfChild(findViewById2) + 1);
            ListView listView2 = dVar2.getListView();
            listView2.setDivider(C17988b.m44611b(R.drawable.divider_horizontal, fixedListView.getContext()));
            listView2.setChoiceMode(1);
            listView2.setItemChecked(list2.indexOf(aVar.mo40061b()), true);
            listView2.setOnItemClickListener(new C17659b(aVar, list2));
        }
        ListItemView listItemView = (ListItemView) fixedListView.findViewById(R.id.transit_types_preferences_title);
        List<TripPlannerTransportTypeInfo> list3 = aVar.f32742c;
        if (C13717b.m34258e(list3)) {
            listItemView.setVisibility(8);
        } else {
            if (C18860a.m45884a().f48028p == TripPlannerAlgorithmType.PREFERRED) {
                listItemView.setTitle((int) R.string.tripplan_transit_preference_title);
                listItemView.setSubtitle((int) R.string.tripplan_transit_preference_subtitle);
            } else {
                listItemView.setTitle((int) R.string.tripplan_transit_filter_title);
                listItemView.setSubtitle((int) R.string.tripplan_transit_filter_subtitle);
            }
            listItemView.setVisibility(0);
            LayoutInflater layoutInflater = getLayoutInflater();
            int indexOfChild = fixedListView.indexOfChild(listItemView) + 1;
            String string = getString(R.string.voiceover_one_outof_another);
            int size = list3.size();
            int i = 0;
            while (i < size) {
                TripPlannerTransportTypeInfo tripPlannerTransportTypeInfo = list3.get(i);
                ListItemView listItemView2 = (ListItemView) layoutInflater.inflate(R.layout.trip_plan_options_transport_type_item, fixedListView, false);
                listItemView2.setTag(tripPlannerTransportTypeInfo.f23802b);
                listItemView2.setIcon(tripPlannerTransportTypeInfo.f23804d);
                listItemView2.setText((CharSequence) tripPlannerTransportTypeInfo.f23803c);
                listItemView2.setChecked(aVar.mo40063d().contains(tripPlannerTransportTypeInfo.f23802b));
                listItemView2.setOnCheckedChangeListener(new C17913e(1, aVar, tripPlannerTransportTypeInfo));
                i++;
                C13382a.m33674j(listItemView2, listItemView2.getTitle(), String.format(string, new Object[]{Integer.valueOf(i), Integer.valueOf(size)}));
                fixedListView.addView(listItemView2, indexOfChild);
                indexOfChild++;
            }
        }
        View findViewById3 = fixedListView.findViewById(R.id.personal_preferences_title);
        List<TripPlannerWalkingPrefType> list4 = aVar.f32746g;
        List<UserProfileAccessibilityPrefType> list5 = aVar2.f45951b;
        if (!C13717b.m34258e(list4) || !C13717b.m34258e(list5)) {
            findViewById3.setVisibility(0);
            LayoutInflater layoutInflater2 = getLayoutInflater();
            int indexOfChild2 = fixedListView.indexOfChild(findViewById3) + 1;
            if (!C13717b.m34258e(list4)) {
                ListItemView listItemView3 = (ListItemView) layoutInflater2.inflate(R.layout.trip_plan_options_personal_type_item, fixedListView, false);
                this.f39816n0 = listItemView3;
                listItemView3.setIcon((int) R.drawable.ic_walk_24_on_surface);
                this.f39816n0.setTitle((int) R.string.tripplan_prefernces_walk_options_title);
                mo45969A2(aVar);
                this.f39816n0.setOnClickListener(new C4052r(this, 20));
                fixedListView.addView(this.f39816n0, indexOfChild2);
                indexOfChild2++;
            }
            if (!C13717b.m34258e(list5)) {
                ListItemView listItemView4 = (ListItemView) layoutInflater2.inflate(R.layout.trip_plan_options_personal_type_item, fixedListView, false);
                listItemView4.setIcon((int) R.drawable.ic_accessibility_24_on_surface);
                listItemView4.setTitle((int) R.string.tripplan_preference_accessibility_title);
                listItemView4.setSubtitle((int) R.string.tripplan_preference_accessibility_subtitle);
                listItemView4.setOnClickListener(new C1800c(this, 23));
                fixedListView.addView(listItemView4, indexOfChild2);
            }
        } else {
            findViewById3.setVisibility(8);
        }
        C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar4.mo49939g(AnalyticsAttributeKey.TYPE, C0017h.m47D(aVar.mo40061b()));
        aVar4.mo49939g(AnalyticsAttributeKey.SORT_TYPE, C0017h.m48E(aVar.mo40062c()));
        aVar4.mo49942j(AnalyticsAttributeKey.AVAILABLE_SETTINGS_MASK, C0017h.m49F(aVar.f32742c));
        aVar4.mo49942j(AnalyticsAttributeKey.SET_SETTINGS_MASK, C0017h.m50G(aVar.mo40063d()));
        mo44545v2(aVar4.mo49933a());
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            mo45970z2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo45970z2() {
        boolean z;
        boolean z2;
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        TripPlannerSortType c = aVar.mo40062c();
        TripPlannerRouteType b = aVar.mo40061b();
        Set<TripPlannerTransportType> d = aVar.mo40063d();
        TripPlannerPersonalPrefs a = aVar.mo40060a();
        AccessibilityPersonalPrefs a2 = ((C17909a) mo44537r1("ACCESSIBILITY_CONFIGURATION")).mo50463a();
        if (this.f39811X != c) {
            z = true;
        } else {
            z = false;
        }
        if (this.f39812Y != b) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !this.f39813Z.equals(d);
        boolean z4 = !this.f39814l0.equals(a);
        boolean equals = true ^ this.f39815m0.equals(a2);
        if (z || z2 || z3 || z4 || equals) {
            Intent intent = new Intent();
            intent.putExtra("sortType", c);
            intent.putExtra("routeType", b);
            intent.putExtra("transportTypes", C13717b.m34264k(d));
            intent.putExtra("personalPrefs", a);
            intent.putExtra("accessibilityPrefs", a2);
            setResult(-1, intent);
            return;
        }
        setResult(0);
    }
}
