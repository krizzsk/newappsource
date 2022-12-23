package p754qr;

import android.content.SharedPreferences;
import android.os.Bundle;
import ci0.C21211f;
import com.moovit.app.carpool.payment.PassengerCredit;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import java.util.Set;
import p472er.C16861c;
import p472er.C16865g;
import p614kr.C18124f;
import p614kr.C18125g;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: qr.b */
public final class C19162b extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ CarpoolRideDetailsActivity f48742b;

    public C19162b(CarpoolRideDetailsActivity carpoolRideDetailsActivity) {
        this.f48742b = carpoolRideDetailsActivity;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C18124f fVar = (C18124f) cVar;
        C18125g gVar2 = (C18125g) gVar;
        if (this.f48742b.f37848z0 != null) {
            PassengerCredit passengerCredit = gVar2.f46339m;
            if (!(passengerCredit == null || passengerCredit.f37807b == null || passengerCredit.f37808c == null)) {
                C16861c cVar2 = new C16861c();
                Bundle bundle = new Bundle();
                bundle.putParcelable("passenger_credit_extra", passengerCredit);
                cVar2.setArguments(bundle);
                cVar2.show(this.f48742b.getSupportFragmentManager(), "intro_dialog_tag");
            }
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = this.f48742b;
            Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
            SharedPreferences.Editor edit = carpoolRideDetailsActivity.getSharedPreferences("com.moovit.carpool.CarpoolUtils", 0).edit();
            edit.putBoolean("carpoolRideMapItemDialogShown", true);
            edit.apply();
            this.f48742b.f37848z0 = null;
        }
    }
}
