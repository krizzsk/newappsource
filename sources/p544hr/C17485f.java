package p544hr;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.driver.CarpoolDriverView;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import p543hq.C17474b;

/* renamed from: hr.f */
public final class C17485f implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CarpoolDriverView f45022b;

    public C17485f(CarpoolDriverView carpoolDriverView) {
        this.f45022b = carpoolDriverView;
    }

    public final void onClick(View view) {
        CarpoolDriverView.C14803a aVar = this.f45022b.f37720h;
        if (aVar != null) {
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = (CarpoolRideDetailsActivity) aVar;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_sms_driver_clicked");
            carpoolRideDetailsActivity.mo44545v2(aVar2.mo49933a());
            C17480a aVar3 = (C17480a) carpoolRideDetailsActivity.getSupportFragmentManager().mo3923A(C17480a.f45011t);
            if (aVar3 != null) {
                aVar3.mo49951m2(false);
            }
        }
    }
}
