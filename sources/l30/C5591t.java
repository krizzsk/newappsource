package l30;

import android.widget.Toast;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitActivity;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;
import com.moovit.micromobility.damage.MicroMobilityReportDamageActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.ticket.C7762g;
import q50.C19080b;
import v40.C25754i;

/* renamed from: l30.t */
public final /* synthetic */ class C5591t implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f18321b;

    /* renamed from: c */
    public final /* synthetic */ Object f18322c;

    public /* synthetic */ C5591t(Object obj, int i) {
        this.f18321b = i;
        this.f18322c = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f18321b) {
            case 0:
                int i = MicroMobilityRideDetailsActivity.f14839Y;
                ((MicroMobilityRideDetailsActivity) this.f18322c).finish();
                return;
            case 1:
                MicroMobilityReportDamageActivity microMobilityReportDamageActivity = (MicroMobilityReportDamageActivity) this.f18322c;
                int i2 = MicroMobilityReportDamageActivity.f14858l0;
                microMobilityReportDamageActivity.getClass();
                microMobilityReportDamageActivity.mo44530n2(C13751d.m34341b(microMobilityReportDamageActivity, (String) null, exc));
                return;
            case 2:
                int i3 = C19080b.f48501o;
                Toast.makeText((MoovitActivity) this.f18322c, C25754i.payment_method_save_fail, 0).show();
                return;
            case 3:
                int i4 = PurchaseTicketActivity.f23250Y;
                ((PurchaseTicketActivity) this.f18322c).mo24027A2(exc);
                return;
            default:
                int i5 = C7762g.f23551y;
                ((C7762g) this.f18322c).mo24256p2((PaymentAccount) null);
                return;
        }
    }
}
