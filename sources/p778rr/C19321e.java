package p778rr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.carpool.CarpoolRide;
import com.tranzmate.R;
import p297w5.C6996c;
import p472er.C16865g;
import p543hq.C17474b;
import p567iq.C17635b;

/* renamed from: rr.e */
public class C19321e extends C15676b<CarpoolRideDetailsActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f49168j = 0;

    /* renamed from: h */
    public boolean f49169h;

    /* renamed from: i */
    public CarpoolRide f49170i;

    /* renamed from: rr.e$a */
    public interface C19322a {
        /* renamed from: a */
        void mo44901a(float f);

        /* renamed from: v0 */
        void mo44902v0();
    }

    public C19321e() {
        super(CarpoolRideDetailsActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f49170i = (CarpoolRide) arguments.getParcelable("ride");
        this.f49169h = arguments.getBoolean("canReportNoShow");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.carpool_rate_ride_dialog, viewGroup, false);
        C16865g.m42681d((ImageView) inflate.findViewById(R.id.profile_picture), this.f49170i.f40911c.f40881h);
        ((TextView) inflate.findViewById(R.id.message)).setText(getResources().getString(R.string.carpool_rate_ride_message, new Object[]{this.f49170i.f40911c.f40876c}));
        inflate.findViewById(R.id.rate_button).setOnClickListener(new C19320d(this));
        Button button = (Button) inflate.findViewById(R.id.no_show_button);
        if (!this.f49169h) {
            i = 8;
        }
        button.setVisibility(i);
        button.setOnClickListener(new C6996c(this, 8));
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        mo22564R1(new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP).mo49933a());
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_rate_driver");
        aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, this.f49170i.f40910b);
        mo22564R1(aVar.mo49933a());
    }
}
