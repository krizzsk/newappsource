package i20;

import android.content.Context;
import android.view.View;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.location.C16202a;
import com.moovit.location.LocationAlertFragment;
import p543hq.C17474b;

/* renamed from: i20.g */
public final class C17545g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ LocationAlertFragment f45137b;

    public C17545g(LocationAlertFragment locationAlertFragment) {
        this.f45137b = locationAlertFragment;
    }

    public final void onClick(View view) {
        LocationAlertFragment locationAlertFragment = this.f45137b;
        int i = LocationAlertFragment.f42235x;
        Context context = locationAlertFragment.getContext();
        int i2 = LocationAlertFragment.C16196a.f42246a[locationAlertFragment.f42241s.ordinal()];
        if (i2 == 1) {
            C16202a.get(context).requestLocationPermissions((C15682c<?>) locationAlertFragment, (C16202a.C16205c<C15682c<?>>) locationAlertFragment.f42242t);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ALERT_MESSAGE_BAR_ACTION_TAPPED);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "location_permissions_off");
            locationAlertFragment.mo46797j2(aVar.mo49933a());
        } else if (i2 == 2) {
            C16202a.C16203a aVar2 = locationAlertFragment.f42239q;
            if (aVar2 != null && aVar2.mo48508b()) {
                locationAlertFragment.f42239q.mo48510d(locationAlertFragment.f40822c, locationAlertFragment.f42245w);
            }
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.ALERT_MESSAGE_BAR_ACTION_TAPPED);
            aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "location_services_off");
            locationAlertFragment.mo46797j2(aVar3.mo49933a());
        }
    }
}
