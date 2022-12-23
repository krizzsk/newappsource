package p472er;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.C15676b;
import com.moovit.app.carpool.payment.PassengerCredit;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.tranzmate.R;
import p001a0.C0016g;
import p259t5.C6593c;

/* renamed from: er.c */
public class C16861c extends C15676b<CarpoolRideDetailsActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f43864j = 0;

    /* renamed from: h */
    public TextView f43865h;

    /* renamed from: i */
    public TextView f43866i;

    public C16861c() {
        super(CarpoolRideDetailsActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.carpool_intro_dialog_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        PassengerCredit passengerCredit;
        super.onViewCreated(view, bundle);
        this.f43865h = (TextView) view.findViewById(R.id.title);
        this.f43866i = (TextView) view.findViewById(R.id.description);
        view.findViewById(R.id.confirm_button).setOnClickListener(new C6593c(this, 6));
        Bundle arguments = getArguments();
        if (arguments != null) {
            passengerCredit = (PassengerCredit) arguments.getParcelable("passenger_credit_extra");
        } else {
            passengerCredit = null;
        }
        if (passengerCredit != null && passengerCredit.f37808c != null && passengerCredit.f37807b != null) {
            this.f43866i.setVisibility(0);
            String currencyAmount = passengerCredit.f37807b.toString();
            String currencyAmount2 = passengerCredit.f37808c.toString();
            this.f43865h.setText(getString(R.string.carpool_passenger_promo_title, currencyAmount));
            String string = getString(R.string.carpool_passenger_promo_code_max_per_ride, currencyAmount2);
            long j = passengerCredit.f37809d;
            if (j != 0) {
                String formatDateTime = DateUtils.formatDateTime(this.f40792c, j, 131076);
                StringBuilder t = C0016g.m36t(string, " | ");
                t.append(getString(R.string.carpool_passenger_promo_code_expiry_date, formatDateTime));
                string = t.toString();
            }
            this.f43866i.setText(string);
        }
    }
}
