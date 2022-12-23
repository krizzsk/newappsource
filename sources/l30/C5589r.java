package l30;

import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.payment.account.settings.PaymentAccountSettingsActivity;
import java.util.concurrent.ThreadPoolExecutor;
import m30.C5679b;
import m30.C5680c;
import m80.C12887v;

/* renamed from: l30.r */
public final /* synthetic */ class C5589r implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f18316b;

    /* renamed from: c */
    public final /* synthetic */ Object f18317c;

    public /* synthetic */ C5589r(Object obj, int i) {
        this.f18316b = i;
        this.f18317c = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f18316b) {
            case 0:
                MicroMobilityRideActivity microMobilityRideActivity = (MicroMobilityRideActivity) this.f18317c;
                int i = MicroMobilityRideActivity.f14823n0;
                microMobilityRideActivity.getClass();
                microMobilityRideActivity.mo44530n2(C13751d.m34341b(microMobilityRideActivity, (String) null, exc));
                return;
            case 1:
                int i2 = C5679b.f18460q;
                ((C5679b) this.f18317c).mo21530n2(false, exc, (C5680c) null);
                return;
            case 2:
                PaymentAccountSettingsActivity paymentAccountSettingsActivity = (PaymentAccountSettingsActivity) this.f18317c;
                int i3 = PaymentAccountSettingsActivity.f64114l0;
                paymentAccountSettingsActivity.mo83562y2();
                paymentAccountSettingsActivity.mo44530n2(C13751d.m34341b(paymentAccountSettingsActivity, (String) null, exc));
                return;
            default:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                ((C12887v) this.f18317c).mo39737i();
                return;
        }
    }
}
