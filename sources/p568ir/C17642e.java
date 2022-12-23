package p568ir;

import android.widget.TextView;
import com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import p614kr.C18124f;
import p614kr.C18125g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: ir.e */
public final class C17642e extends C20438i<C18124f, C18125g> {

    /* renamed from: b */
    public final /* synthetic */ CarpoolRideRequestDetailsActivity f45359b;

    public C17642e(CarpoolRideRequestDetailsActivity carpoolRideRequestDetailsActivity) {
        this.f45359b = carpoolRideRequestDetailsActivity;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C18124f fVar = (C18124f) cVar;
        CarpoolRideRequestDetailsActivity carpoolRideRequestDetailsActivity = this.f45359b;
        carpoolRideRequestDetailsActivity.f37751X = null;
        carpoolRideRequestDetailsActivity.f37752Y.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C18124f fVar = (C18124f) cVar;
        CarpoolRideRequestDetailsActivity carpoolRideRequestDetailsActivity = this.f45359b;
        CurrencyAmount currencyAmount = ((C18125g) gVar).f46339m.f37808c;
        int i = CarpoolRideRequestDetailsActivity.f37749m0;
        TextView textView = (TextView) carpoolRideRequestDetailsActivity.findViewById(R.id.price);
        boolean z = false;
        textView.setVisibility(0);
        if (currencyAmount != null && carpoolRideRequestDetailsActivity.f37750U.f40934h.f23845c.movePointRight(2).longValue() <= currencyAmount.f23845c.movePointRight(2).longValue()) {
            z = true;
        }
        if (z) {
            textView.setText(carpoolRideRequestDetailsActivity.getString(R.string.carpool_free_ride));
        } else {
            textView.setText(carpoolRideRequestDetailsActivity.f37750U.f40934h.toString());
        }
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
        C18124f fVar = (C18124f) cVar;
        return true;
    }
}
