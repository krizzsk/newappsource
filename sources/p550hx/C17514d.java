package p550hx;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.order.TodOrderActivity;
import com.tranzmate.R;
import p073e7.C4583a;
import p543hq.C17474b;

/* renamed from: hx.d */
public class C17514d extends C15676b<TodOrderActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f45085i = 0;

    /* renamed from: h */
    public String f45086h;

    public C17514d() {
        super(TodOrderActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = mo46752K1().getString("rideId");
        this.f45086h = string;
        if (string == null) {
            throw new IllegalStateException("Did you use TodOrderRideReservedDialog.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tod_order_ride_reserved_dialog_fragment, viewGroup, false);
        inflate.findViewById(R.id.dismiss_button).setOnClickListener(new C4583a(this, 29));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ride_reserved_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }
}
