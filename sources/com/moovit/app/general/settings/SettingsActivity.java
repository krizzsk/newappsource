package com.moovit.app.general.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import c00.C13717b;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.general.settings.map.MapSettingsActivity;
import com.moovit.app.general.settings.notifications.NotificationSettingsActivity;
import com.moovit.app.general.settings.privacy.PrivacySettingsActivity;
import com.moovit.app.metro.selection.ChangeMetroActivity;
import com.moovit.app.metro.selection.ChangeMetroLanguageActivity;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.settings.PaymentAccountSettingsActivity;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p567iq.C17637d;
import p686ns.C18587a;
import p874vr.C20199a;
import q00.C19047a;
import q00.C19053d;
import w40.C25761d;

public class SettingsActivity extends MoovitAppActivity implements View.OnClickListener {

    /* renamed from: U */
    public static final /* synthetic */ int f38055U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.settings_activity);
        C19047a.C19048a aVar = C19047a.f48441d;
        C19047a aVar2 = (C19047a) getSystemService("user_configuration");
        if (((Boolean) aVar2.mo51505b(C20199a.f51266b0)).booleanValue()) {
            View findViewById = findViewById(R.id.metro_area_settings);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(this);
        }
        List list = (List) mo44537r1("SUPPORTED_METRO_LANGUAGES");
        if (!C13717b.m34258e(list) && list.size() > 1) {
            View findViewById2 = findViewById(R.id.metro_language_setting);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(this);
        }
        findViewById(R.id.notifications_settings).setOnClickListener(this);
        if (((Boolean) aVar2.mo51505b(C19053d.f48474m)).booleanValue()) {
            View findViewById3 = findViewById(R.id.trip_plan_settings);
            findViewById3.setVisibility(0);
            findViewById3.setOnClickListener(this);
        }
        C17637d dVar = (C17637d) getSystemService("ui_configuration");
        if (dVar.f45351h) {
            ListItemView listItemView = (ListItemView) findViewById(R.id.map_settings);
            listItemView.setVisibility(0);
            listItemView.setOnClickListener(this);
        }
        View findViewById4 = findViewById(R.id.privacy_settings);
        if (dVar.f45352i) {
            findViewById4.setOnClickListener(this);
            findViewById4.setVisibility(0);
        }
        C25761d a = C25761d.m64299a();
        if (a.mo83590e()) {
            a.mo83587b(false).addOnSuccessListener((Activity) this, new C18587a(this, 0));
        }
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.map_settings:
                startActivity(new Intent(this, MapSettingsActivity.class));
                return;
            case R.id.metro_area_settings:
                startActivity(new Intent(this, ChangeMetroActivity.class));
                return;
            case R.id.metro_language_setting:
                startActivity(new Intent(this, ChangeMetroLanguageActivity.class));
                return;
            case R.id.notifications_settings:
                startActivity(new Intent(this, NotificationSettingsActivity.class));
                return;
            case R.id.payment_account_settings:
                startActivity(new Intent(this, PaymentAccountSettingsActivity.class));
                return;
            case R.id.privacy_settings:
                startActivity(new Intent(this, PrivacySettingsActivity.class));
                return;
            case R.id.trip_plan_settings:
                startActivity(TripPlanOptionsActivity.m39353y2(this, R.string.trip_planer, (TripPlannerRouteType) null, (Set<TripPlannerTransportType>) null, (TripPlannerSortType) null, (TripPlannerPersonalPrefs) null, (AccessibilityPersonalPrefs) null));
                return;
            default:
                return;
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("SUPPORTED_METRO_LANGUAGES");
        return s1;
    }
}
