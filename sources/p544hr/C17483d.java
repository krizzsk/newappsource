package p544hr;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.CarpoolProfilePopupActivity;
import com.moovit.app.carpool.driver.CarpoolDriverView;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.carpool.CarpoolRide;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import p090g1.C4732a;
import p543hq.C17474b;

/* renamed from: hr.d */
public final class C17483d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CarpoolDriverView f45020b;

    public C17483d(CarpoolDriverView carpoolDriverView) {
        this.f45020b = carpoolDriverView;
    }

    public final void onClick(View view) {
        CarpoolDriverView carpoolDriverView = this.f45020b;
        CarpoolDriverView.C14803a aVar = carpoolDriverView.f37720h;
        if (aVar != null) {
            ImageView imageView = carpoolDriverView.f37715c;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = (CarpoolRideDetailsActivity) aVar;
            CarpoolRide carpoolRide = carpoolRideDetailsActivity.f37836n0;
            if (carpoolRide != null) {
                Uri uri = carpoolRide.f40911c.f40881h;
                ServerId serverId = carpoolRide.f40910b;
                int i = CarpoolProfilePopupActivity.f37640l0;
                Intent intent = new Intent(carpoolRideDetailsActivity, CarpoolProfilePopupActivity.class);
                intent.putExtra("profile.image.url_extra", uri);
                intent.putExtra("profile.image.url.placeholder.drawable_extra", R.drawable.img_profile_seat_belt_90_gray52);
                intent.putExtra("profile.ride.id", serverId);
                C4732a.startActivity(carpoolRideDetailsActivity, intent, CarpoolProfilePopupActivity.m37193y2(carpoolRideDetailsActivity, imageView).mo20005a());
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_driver_profile_clicked");
                aVar2.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, carpoolRideDetailsActivity.f37834l0);
                carpoolRideDetailsActivity.mo44545v2(aVar2.mo49933a());
            }
        }
    }
}
