package p614kr;

import android.view.View;
import android.view.ViewTreeObserver;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.moovit.app.stopdetail.StopDetailActivity;

/* renamed from: kr.b */
public final /* synthetic */ class C18120b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ int f46330b;

    /* renamed from: c */
    public final /* synthetic */ MoovitAppActivity f46331c;

    public /* synthetic */ C18120b(MoovitAppActivity moovitAppActivity, int i) {
        this.f46330b = i;
        this.f46331c = moovitAppActivity;
    }

    public final void onGlobalLayout() {
        boolean z = true;
        switch (this.f46330b) {
            case 0:
                CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = (CarpoolAddCreditCardActivity) this.f46331c;
                int i = 0;
                if (!carpoolAddCreditCardActivity.f37798s0.canScrollVertically(1) && !carpoolAddCreditCardActivity.f37798s0.canScrollVertically(-1)) {
                    z = false;
                }
                View view = carpoolAddCreditCardActivity.f37797r0;
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            default:
                StopDetailActivity stopDetailActivity = (StopDetailActivity) this.f46331c;
                if (stopDetailActivity.f39663q0.isEnabled()) {
                    stopDetailActivity.f39663q0.setRefreshing(true);
                    return;
                }
                return;
        }
    }
}
