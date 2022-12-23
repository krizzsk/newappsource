package com.moovit.app.accessibility;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13723g;
import com.moovit.accessibility.UserProfileAccessibilityPrefType;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.external.C25651a;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p589jq.C17909a;
import p589jq.C17913e;
import p589jq.C17914f;
import p589jq.C17915g;
import p589jq.C17917i;
import p593ju.C17929e;
import p977zz.C20964s0;
import v90.C13187a;

public class UserAccessibilityPrefActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f37419X = 0;

    /* renamed from: U */
    public C17929e f37420U;

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        setResult(-1);
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.user_accessibility_pref_activity);
        this.f37420U = new C17929e(this);
        C17909a aVar = (C17909a) mo44537r1("ACCESSIBILITY_CONFIGURATION");
        C13187a aVar2 = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        View findViewById = findViewById(R.id.root);
        List<UserProfileAccessibilityPrefType> list = aVar.f45950a;
        ListItemView listItemView = (ListItemView) findViewById.findViewById(R.id.trip_accessible_routes);
        int i2 = 8;
        if (list.contains(UserProfileAccessibilityPrefType.TRIP_PLAN_ACCESSIBILITY_ROUTES)) {
            listItemView.setChecked(aVar.mo50463a().f37352b);
            listItemView.setOnCheckedChangeListener(new C17914f(this, aVar, 0));
            listItemView.setVisibility(0);
        } else {
            listItemView.setVisibility(8);
        }
        ListItemView listItemView2 = (ListItemView) findViewById.findViewById(R.id.trip_hide_micro_mobility);
        boolean z4 = true;
        if (list.contains(UserProfileAccessibilityPrefType.TRIP_PLAN_HIDE_MICRO_MOBILITY)) {
            List<TripPlannerTransportType> list2 = aVar.f45952c;
            Set<TripPlannerTransportType> d = aVar2.mo40063d();
            Objects.requireNonNull(list2);
            boolean a = C13723g.m34280a(d, new C17917i(list2, 0));
            if ((this.f37420U.mo50470a() & aVar.f45953d) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (a || z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            listItemView2.setChecked(!z3);
            listItemView2.setOnCheckedChangeListener(new C17915g(this, aVar, aVar2));
            listItemView2.setVisibility(0);
        } else {
            listItemView2.setVisibility(8);
        }
        View findViewById2 = findViewById.findViewById(R.id.trip_preferences);
        if (UiUtils.m40242a(listItemView, listItemView2)) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById2.setVisibility(i);
        List<UserProfileAccessibilityPrefType> list3 = aVar.f45950a;
        ListItemView listItemView3 = (ListItemView) findViewById.findViewById(R.id.train_assistance);
        if (!list3.contains(UserProfileAccessibilityPrefType.TRIP_PLAN_TRAIN_ASSISTANCE) || C20964s0.m49090h(aVar.f45955f)) {
            listItemView3.setVisibility(8);
            z = false;
        } else {
            listItemView3.setChecked(aVar.mo50463a().f37353c);
            listItemView3.setOnCheckedChangeListener(new C17913e(0, this, aVar));
            listItemView3.setVisibility(0);
            z = true;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment A = supportFragmentManager.mo3923A("connect_driver_fragment");
        String str = aVar.f45956g;
        if (!list3.contains(UserProfileAccessibilityPrefType.SERVICES_NOTIFY_DRIVER) || C20964s0.m49090h(str)) {
            if (A != null) {
                C0909a aVar3 = new C0909a(supportFragmentManager);
                aVar3.mo4050p(A);
                aVar3.mo4040d();
            }
            z4 = z;
        } else if (A == null) {
            ConnectToDriverExternalAccountHelper connectToDriverExternalAccountHelper = new ConnectToDriverExternalAccountHelper(str);
            int i3 = C25651a.f63987s;
            Bundle bundle2 = new Bundle();
            bundle2.putString("paymentContext", str);
            bundle2.putParcelable("helper", connectToDriverExternalAccountHelper);
            C25651a aVar4 = new C25651a();
            aVar4.setArguments(bundle2);
            C0909a aVar5 = new C0909a(supportFragmentManager);
            aVar5.mo4111f(R.id.connect_driver_container, aVar4, "connect_driver_fragment");
            aVar5.mo4040d();
        }
        View findViewById3 = findViewById.findViewById(R.id.additional_services);
        if (z4) {
            i2 = 0;
        }
        findViewById3.setVisibility(i2);
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
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        return s1;
    }
}
