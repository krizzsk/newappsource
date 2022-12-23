package p713ov;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingTicket;
import com.moovit.app.ridesharing.view.EventBookingTicketView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import java.math.BigDecimal;
import p073e7.C4584b;

/* renamed from: ov.k */
public class C18846k extends C18831a {

    /* renamed from: o */
    public static final /* synthetic */ int f47987o = 0;

    /* renamed from: n2 */
    public final int mo51314n2() {
        return R.string.event_booking_purchase_confirmation_step_title;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CurrencyAmount currencyAmount;
        CurrencyAmount currencyAmount2;
        CurrencyAmount currencyAmount3;
        CurrencyAmount currencyAmount4;
        boolean z;
        int i;
        View inflate = layoutInflater.inflate(R.layout.event_booking_step_purchase_confirmation, viewGroup, false);
        EventBookingCart o2 = mo51315o2();
        View findViewById = inflate.findViewById(R.id.arrival_title);
        EventBookingTicketView eventBookingTicketView = (EventBookingTicketView) inflate.findViewById(R.id.arrival_ticket);
        EventBookingTicket eventBookingTicket = o2.f39346e;
        int i2 = 8;
        if (eventBookingTicket.f39357b <= 0 || eventBookingTicket.f39359d == null) {
            UiUtils.m40238F(8, findViewById, eventBookingTicketView);
        } else {
            eventBookingTicketView.mo45793g(o2, eventBookingTicket);
            UiUtils.m40238F(0, findViewById, eventBookingTicketView);
        }
        View findViewById2 = inflate.findViewById(R.id.return_title);
        EventBookingTicketView eventBookingTicketView2 = (EventBookingTicketView) inflate.findViewById(R.id.return_ticket);
        EventBookingTicket eventBookingTicket2 = o2.f39347f;
        if (eventBookingTicket2.f39357b <= 0 || eventBookingTicket2.f39359d == null) {
            UiUtils.m40238F(8, findViewById2, eventBookingTicketView2);
        } else {
            eventBookingTicketView2.mo45793g(o2, eventBookingTicket2);
            UiUtils.m40238F(0, findViewById2, eventBookingTicketView2);
        }
        View findViewById3 = inflate.findViewById(R.id.purchase_summery);
        EventBookingTicket eventBookingTicket3 = o2.f39346e;
        EventBookingOption eventBookingOption = eventBookingTicket3.f39359d;
        CurrencyAmount currencyAmount5 = null;
        if (eventBookingOption != null) {
            currencyAmount = CurrencyAmount.m17929f(eventBookingTicket3.f39357b, eventBookingOption.f42930e);
        } else {
            currencyAmount = null;
        }
        EventBookingTicket eventBookingTicket4 = o2.f39347f;
        EventBookingOption eventBookingOption2 = eventBookingTicket4.f39359d;
        if (eventBookingOption2 != null) {
            currencyAmount2 = CurrencyAmount.m17929f(eventBookingTicket4.f39357b, eventBookingOption2.f42930e);
        } else {
            currencyAmount2 = null;
        }
        if (currencyAmount != null && currencyAmount2 != null) {
            currencyAmount = CurrencyAmount.m17926b(currencyAmount, currencyAmount2);
        } else if (currencyAmount == null) {
            currencyAmount = currencyAmount2;
        }
        EventBookingTicket eventBookingTicket5 = o2.f39346e;
        EventBookingOption eventBookingOption3 = eventBookingTicket5.f39359d;
        if (eventBookingOption3 != null) {
            currencyAmount3 = CurrencyAmount.m17929f(eventBookingTicket5.f39357b, eventBookingOption3.f42931f);
        } else {
            currencyAmount3 = null;
        }
        EventBookingTicket eventBookingTicket6 = o2.f39347f;
        EventBookingOption eventBookingOption4 = eventBookingTicket6.f39359d;
        if (eventBookingOption4 != null) {
            currencyAmount5 = CurrencyAmount.m17929f(eventBookingTicket6.f39357b, eventBookingOption4.f42931f);
        }
        if (currencyAmount3 == null || currencyAmount5 == null) {
            if (currencyAmount3 == null) {
                currencyAmount3 = currencyAmount5;
            }
            currencyAmount4 = currencyAmount3;
        } else {
            currencyAmount4 = CurrencyAmount.m17926b(currencyAmount3, currencyAmount5);
        }
        CurrencyAmount g = CurrencyAmount.m17930g(currencyAmount, currencyAmount4);
        if (BigDecimal.ZERO.compareTo(g.f23845c) != 0) {
            z = true;
        } else {
            z = false;
        }
        FormatTextView formatTextView = (FormatTextView) findViewById3.findViewById(R.id.ride_discount_amount);
        TextView textView = (TextView) findViewById3.findViewById(R.id.ride_discount);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (z) {
            i2 = 0;
        }
        formatTextView.setVisibility(i2);
        formatTextView.setArguments(g);
        View findViewById4 = findViewById3.findViewById(R.id.ride_subtotal);
        TextView textView2 = (TextView) findViewById3.findViewById(R.id.ride_subtotal_amount);
        textView2.setText(currencyAmount.toString());
        textView2.setVisibility(formatTextView.getVisibility());
        findViewById4.setVisibility(textView.getVisibility());
        ((TextView) findViewById3.findViewById(R.id.ride_total_amount)).setText(currencyAmount4.toString());
        inflate.findViewById(R.id.confirm_button).setOnClickListener(new C4584b(this, 21));
        return inflate;
    }
}
