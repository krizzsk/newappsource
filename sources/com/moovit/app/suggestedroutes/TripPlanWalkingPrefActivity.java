package com.moovit.app.suggestedroutes;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.design.view.list.ListItemView;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerWalkingPrefType;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p310x5.C7157b;
import p543hq.C17474b;
import p572iw.C17676l;
import p589jq.C17914f;
import q00.C19047a;
import q00.C19053d;
import v90.C13187a;

public class TripPlanWalkingPrefActivity extends MoovitAppActivity implements C15374a.C15375a {

    /* renamed from: Z */
    public static final /* synthetic */ int f39818Z = 0;

    /* renamed from: U */
    public ArrayList f39819U;

    /* renamed from: X */
    public ArrayList f39820X;

    /* renamed from: Y */
    public ListItemView f39821Y;

    /* renamed from: C */
    public final /* synthetic */ void mo45971C() {
    }

    /* renamed from: J */
    public final void mo45972J() {
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        aVar.f32747h.mo49544c(new TripPlannerPersonalPrefs(aVar.mo40060a().f23793b, -1));
        mo45974y2(aVar);
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "dialog_negative_btn");
        mo44545v2(aVar2.mo49933a());
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        setResult(-1);
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: X */
    public final void mo45973X(String str) {
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        Short sh = (Short) this.f39819U.get(this.f39820X.indexOf(str));
        aVar.f32747h.mo49544c(new TripPlannerPersonalPrefs(aVar.mo40060a().f23793b, sh.shortValue()));
        mo45974y2(aVar);
        Toast.makeText(this, R.string.walk_options_success_message, 0).show();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "dialog_positive_btn");
        aVar2.mo49938f(AnalyticsAttributeKey.TIME, sh);
        mo44545v2(aVar2.mo49933a());
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.trip_plan_walking_pref_activity);
        C13187a aVar = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        LayoutInflater layoutInflater = getLayoutInflater();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.root);
        boolean z = true;
        if (aVar.f32746g.contains(TripPlannerWalkingPrefType.SLOW_WALKING)) {
            ListItemView listItemView = (ListItemView) layoutInflater.inflate(R.layout.trip_plan_walking_prefs_section_header, linearLayout, false);
            listItemView.setTitle((int) R.string.walk_options_speed_header);
            linearLayout.addView(listItemView);
            ListItemView listItemView2 = (ListItemView) layoutInflater.inflate(R.layout.trip_plan_options_walking_pref_item, linearLayout, false);
            listItemView2.setTitle((int) R.string.walk_options_slow_title);
            listItemView2.setSubtitle((int) R.string.walk_options_slow_subtitle);
            listItemView2.setChecked(aVar.mo40060a().f23793b);
            listItemView2.setOnCheckedChangeListener(new C17914f(this, aVar, 1));
            linearLayout.addView(listItemView2);
        }
        List<TripPlannerWalkingPrefType> list = aVar.f32746g;
        this.f39819U = new ArrayList((Collection) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C19053d.f48481t));
        if (!list.contains(TripPlannerWalkingPrefType.MAX_WALKING_MINUTES) || C13717b.m34258e(this.f39819U)) {
            z = false;
        }
        if (z) {
            ListItemView listItemView3 = (ListItemView) layoutInflater.inflate(R.layout.trip_plan_walking_prefs_section_header, linearLayout, false);
            listItemView3.setTitle((int) R.string.walk_options_time_header);
            linearLayout.addView(listItemView3);
            ListItemView listItemView4 = (ListItemView) layoutInflater.inflate(R.layout.trip_plan_options_max_walking_time_pref_item, linearLayout, false);
            this.f39821Y = listItemView4;
            listItemView4.setTitle((int) R.string.walk_options_max_time_title);
            this.f39821Y.setSubtitle((int) R.string.walk_options_max_time_subtitle);
            mo45974y2(aVar);
            Resources resources = getResources();
            this.f39820X = C13720d.m34273c(this.f39819U, (C13722f) null, new C17676l(resources, 0));
            this.f39819U.add(0, (short) -1);
            this.f39820X.add(0, resources.getString(R.string.walk_options_no_limit));
            this.f39821Y.setOnClickListener(new C7157b(5, this, aVar));
            linearLayout.addView(this.f39821Y);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(-1);
        }
        return super.onOptionsItemSelected(menuItem);
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
    public final void mo45974y2(C13187a aVar) {
        String str;
        if (this.f39821Y != null) {
            short s = aVar.mo40060a().f23794c;
            ListItemView listItemView = this.f39821Y;
            if (s != -1) {
                str = getString(R.string.units_min, new Object[]{Integer.valueOf(s)});
            } else {
                str = null;
            }
            listItemView.setAccessoryText((CharSequence) str);
        }
    }
}
