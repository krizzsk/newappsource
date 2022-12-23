package p376ax;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import c70.C13751d;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.bookingflow.TodBookingOrderActivity;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.map.MapFragment;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import p543hq.C17474b;
import p950yw.C20774b;
import p950yw.C20779f;

/* renamed from: ax.c */
public abstract class C13541c extends C15682c<TodBookingOrderActivity> {

    /* renamed from: n */
    public TodBookingOrderViewModel f33470n;

    public C13541c() {
        super(TodBookingOrderActivity.class);
    }

    /* renamed from: m2 */
    public abstract String mo40433m2();

    /* renamed from: n2 */
    public final C20774b mo40434n2() {
        TodBookingOrderActivity todBookingOrderActivity = (TodBookingOrderActivity) this.f40822c;
        if (todBookingOrderActivity.f40069X == null) {
            todBookingOrderActivity.f40069X = new C20774b(todBookingOrderActivity, (MapFragment) todBookingOrderActivity.mo44529n1(R.id.map_fragment));
        }
        return todBookingOrderActivity.f40069X;
    }

    /* renamed from: o2 */
    public final C20779f mo40435o2() {
        TodBookingOrderActivity todBookingOrderActivity = (TodBookingOrderActivity) this.f40822c;
        if (todBookingOrderActivity.f40070Y == null) {
            todBookingOrderActivity.f40070Y = new C20779f((MapFragment) todBookingOrderActivity.mo44529n1(R.id.map_fragment));
        }
        return todBookingOrderActivity.f40070Y;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo40433m2());
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: p2 */
    public final TodBookingOrderViewModel mo40436p2() {
        if (this.f33470n == null) {
            this.f33470n = (TodBookingOrderViewModel) new C1026n0(requireActivity()).mo4313a(TodBookingOrderViewModel.class);
        }
        return this.f33470n;
    }

    /* renamed from: q2 */
    public final void mo40437q2(Exception exc) {
        String str;
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.mo3923A("request_error_dialog_fragment") == null) {
            AlertDialogFragment.C15856a c = C13751d.m34342c(requireContext(), "request_error_dialog_fragment", exc);
            c.mo47674c(false);
            c.mo47675d(false);
            c.mo47673b().show(childFragmentManager, "request_error_dialog_fragment");
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_error_dialog_impression");
            aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ERROR_MESSAGE;
            if (exc instanceof UserRequestError) {
                str = ((UserRequestError) exc).mo49161c();
            } else {
                str = null;
            }
            aVar.mo49939g(analyticsAttributeKey, str);
            mo46797j2(aVar.mo49933a());
        }
    }

    /* renamed from: r2 */
    public void mo40438r2() {
        ((TodBookingOrderActivity) this.f40822c).onBackPressed();
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("request_error_dialog_fragment".equals(str)) {
            mo40438r2();
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
