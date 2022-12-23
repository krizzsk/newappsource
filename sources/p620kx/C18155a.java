package p620kx;

import android.view.View;
import androidx.fragment.app.C0942l;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.app.tod.shuttle.booking.passengersselection.TodAdditionalPassengersSelectionDialogFragment;
import com.moovit.design.dialog.AlertDialogFragment;
import mf0.C24362h;

/* renamed from: kx.a */
public final /* synthetic */ class C18155a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f46389b;

    /* renamed from: c */
    public final /* synthetic */ int f46390c;

    /* renamed from: d */
    public final /* synthetic */ C0942l f46391d;

    public /* synthetic */ C18155a(C0942l lVar, int i, int i2) {
        this.f46389b = i2;
        this.f46391d = lVar;
        this.f46390c = i;
    }

    public final void onClick(View view) {
        boolean z = true;
        switch (this.f46389b) {
            case 0:
                TodAdditionalPassengersSelectionDialogFragment todAdditionalPassengersSelectionDialogFragment = (TodAdditionalPassengersSelectionDialogFragment) this.f46391d;
                int i = this.f46390c;
                int i2 = TodAdditionalPassengersSelectionDialogFragment.f40405i;
                C24362h.m61211f(todAdditionalPassengersSelectionDialogFragment, "this$0");
                Integer value = ((C18156b) todAdditionalPassengersSelectionDialogFragment.f40406h.getValue()).f46392b.getValue();
                if (value == null) {
                    value = 1;
                }
                int intValue = value.intValue();
                if (i != intValue) {
                    TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = (TodShuttleBookingConfirmationActivity) todAdditionalPassengersSelectionDialogFragment.f40792c;
                    int i3 = intValue + 1;
                    todShuttleBookingConfirmationActivity.f40387p0 = i3;
                    todShuttleBookingConfirmationActivity.f40386o0.setArguments(Integer.valueOf(i3));
                    todShuttleBookingConfirmationActivity.mo46416A2(i3);
                }
                todAdditionalPassengersSelectionDialogFragment.dismissAllowingStateLoss();
                return;
            default:
                AlertDialogFragment alertDialogFragment = (AlertDialogFragment) this.f46391d;
                int i4 = this.f46390c;
                int i5 = AlertDialogFragment.f41324c;
                AlertDialogFragment.C15857b H1 = alertDialogFragment.mo47670H1();
                if (H1 != null) {
                    z = H1.mo19430t0(alertDialogFragment.f41325b, i4, alertDialogFragment.requireArguments());
                }
                if (z) {
                    alertDialogFragment.dismiss();
                    return;
                }
                return;
        }
    }
}
