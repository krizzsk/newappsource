package p544hr;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import ce0.C21100e;
import com.moovit.app.carpool.driver.CarpoolDriverProfileActivity;
import com.moovit.app.carpool.driver.CarpoolDriverView;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolRide;
import p067e1.C4472b;
import p090g1.C4732a;

/* renamed from: hr.e */
public final class C17484e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CarpoolDriverView f45021b;

    public C17484e(CarpoolDriverView carpoolDriverView) {
        this.f45021b = carpoolDriverView;
    }

    public final void onClick(View view) {
        Activity activity;
        CarpoolDriverView carpoolDriverView = this.f45021b;
        CarpoolDriverView.C14803a aVar = carpoolDriverView.f37720h;
        if (aVar != null) {
            ImageView imageView = carpoolDriverView.f37715c;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = (CarpoolRideDetailsActivity) aVar;
            CarpoolRide carpoolRide = carpoolRideDetailsActivity.f37836n0;
            CarpoolDriver carpoolDriver = carpoolRide.f40911c;
            Intent intent = new Intent(carpoolRideDetailsActivity, CarpoolDriverProfileActivity.class);
            intent.putExtra("driver", carpoolDriver);
            intent.putExtra("ride", carpoolRide);
            Context context = carpoolRideDetailsActivity;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            C21100e.m49371w(activity);
            C4732a.startActivity(carpoolRideDetailsActivity, intent, C4472b.C4475c.m11690a(activity, imageView, "profileImage").toBundle());
        }
    }
}
