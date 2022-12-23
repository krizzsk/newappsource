package com.moovit.app.carpool.fastbooking;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import b00.C13556a;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.RideRequestStatus;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import p073e7.C4585c;
import p543hq.C17474b;
import p568ir.C17642e;
import p568ir.C17643f;
import p590jr.C17918a;
import p590jr.C17919b;
import p614kr.C18124f;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

public class CarpoolRideRequestDetailsActivity extends MoovitAppActivity {

    /* renamed from: m0 */
    public static final /* synthetic */ int f37749m0 = 0;

    /* renamed from: U */
    public CarpoolRideRequest f37750U;

    /* renamed from: X */
    public C13556a f37751X;

    /* renamed from: Y */
    public ProgressBar f37752Y = null;

    /* renamed from: Z */
    public final C4585c f37753Z = new C4585c(this, 3);

    /* renamed from: l0 */
    public final C14807a f37754l0 = new C14807a();

    /* renamed from: com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity$a */
    public class C14807a extends C20438i<C17918a, C17919b> {
        public C14807a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17918a aVar = (C17918a) cVar;
            C17919b bVar = (C17919b) gVar;
            CarpoolRideRequestDetailsActivity carpoolRideRequestDetailsActivity = CarpoolRideRequestDetailsActivity.this;
            int i = CarpoolRideRequestDetailsActivity.f37749m0;
            carpoolRideRequestDetailsActivity.getClass();
            CarpoolRidesProvider.f37661j.mo44833c(16);
            carpoolRideRequestDetailsActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17918a aVar = (C17918a) cVar;
            CarpoolRideRequestDetailsActivity carpoolRideRequestDetailsActivity = CarpoolRideRequestDetailsActivity.this;
            int i = CarpoolRideRequestDetailsActivity.f37749m0;
            carpoolRideRequestDetailsActivity.findViewById(R.id.progress_bar).setVisibility(8);
            carpoolRideRequestDetailsActivity.findViewById(R.id.action).setVisibility(0);
            CarpoolRideRequestDetailsActivity carpoolRideRequestDetailsActivity2 = CarpoolRideRequestDetailsActivity.this;
            carpoolRideRequestDetailsActivity2.mo44530n2(C13751d.m34341b(carpoolRideRequestDetailsActivity2, (String) null, exc));
            return true;
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        C13556a aVar = this.f37751X;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37751X = null;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        boolean z;
        int i;
        boolean z2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_ride_request_details_activity);
        this.f37750U = (CarpoolRideRequest) getIntent().getParcelableExtra("ride_request");
        findViewById(R.id.action).setOnClickListener(this.f37753Z);
        this.f37752Y = (ProgressBar) findViewById(R.id.price_progress_bar);
        View findViewById = findViewById(R.id.status_view);
        RideRequestStatus rideRequestStatus = this.f37750U.f40935i;
        RideRequestStatus rideRequestStatus2 = RideRequestStatus.WAITING;
        boolean z3 = true;
        if (rideRequestStatus == rideRequestStatus2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((ListItemView) findViewById(R.id.start)).setSubtitle((CharSequence) this.f37750U.f40929c.f23651f);
        ((ListItemView) findViewById(R.id.end)).setSubtitle((CharSequence) this.f37750U.f40930d.f23651f);
        ((ListItemView) findViewById(R.id.date)).setSubtitle((CharSequence) C7925b.m18015c(this, this.f37750U.f40931e));
        ((ListItemView) findViewById(R.id.pickup_range)).setSubtitle((CharSequence) String.format("%1$s - %2$s", new Object[]{C7925b.m18024l(this, this.f37750U.f40931e), C7925b.m18024l(this, this.f37750U.f40932f)}));
        ((ListItemView) findViewById(R.id.max_walking_time)).setSubtitle((CharSequence) getString(R.string.carpool_passenger_up_to_walking_time_title, new Object[]{Integer.valueOf(this.f37750U.f40933g)}));
        this.f37752Y.setVisibility(0);
        C18124f fVar = new C18124f(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f37751X = mo44527k2("get_passenger_credit", fVar, requestOptions, new C17642e(this));
        View findViewById2 = findViewById(R.id.dock_container);
        if (this.f37750U.f40935i == rideRequestStatus2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 0;
        }
        findViewById2.setVisibility(i2);
        if (findViewById(R.id.dock_container).getVisibility() != 0) {
            z3 = false;
        }
        if (z3) {
            View findViewById3 = findViewById(R.id.scroller);
            UiUtils.m40259r(findViewById3, new C17643f(findViewById3, findViewById(R.id.dock_shadow)));
        }
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        this.f37750U = (CarpoolRideRequest) getIntent().getParcelableExtra("ride_request");
        C17474b.C17475a m1 = super.mo19762m1();
        if (RideRequestStatus.WAITING.equals(this.f37750U.f40935i)) {
            str = "searching";
        } else {
            str = "no_drivers_found";
        }
        m1.mo49939g(AnalyticsAttributeKey.RIDE_STATE, str);
        return m1;
    }
}
