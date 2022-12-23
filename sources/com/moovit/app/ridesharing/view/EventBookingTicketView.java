package com.moovit.app.ridesharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingTicket;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ridesharing.model.EventRide;
import com.moovit.ridesharing.model.EventVehicleType;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import p665mv.C18470e;
import p977zz.C20964s0;

public class EventBookingTicketView extends MaterialCardView {

    /* renamed from: q */
    public final TextView f39402q;

    /* renamed from: r */
    public final TextView f39403r;

    /* renamed from: s */
    public final PriceView f39404s;

    /* renamed from: t */
    public final ListItemView f39405t;

    /* renamed from: u */
    public final ListItemView f39406u;

    /* renamed from: v */
    public final TextView f39407v;

    /* renamed from: w */
    public final PriceView f39408w;

    public EventBookingTicketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setTicketPrice(CurrencyAmount currencyAmount) {
        this.f39404s.mo24682a(currencyAmount, currencyAmount, (String) null);
    }

    private void setTicketsAmount(int i) {
        this.f39402q.setText(getResources().getQuantityString(R.plurals.tickets, i, new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: g */
    public final void mo45793g(EventBookingCart eventBookingCart, EventBookingTicket eventBookingTicket) {
        boolean z;
        setTicketsAmount(eventBookingTicket.f39357b);
        EventBookingOption eventBookingOption = eventBookingTicket.f39359d;
        mo45796j(eventBookingOption.f42928c, eventBookingOption.f42929d);
        EventBookingOption eventBookingOption2 = eventBookingTicket.f39359d;
        this.f39404s.mo24682a(eventBookingOption2.f42931f, eventBookingOption2.f42930e, (String) null);
        EventBookingOption eventBookingOption3 = eventBookingTicket.f39359d;
        LocationDescriptor locationDescriptor = eventBookingOption3.f42933h;
        if (locationDescriptor == null) {
            locationDescriptor = eventBookingTicket.f39358c;
        }
        if (eventBookingCart.f39346e == eventBookingTicket) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo45795i(this.f39405t, locationDescriptor, eventBookingOption3.f42934i);
            mo45794h(this.f39406u, eventBookingCart.f39343b, eventBookingTicket.f39359d.f42928c);
        } else {
            mo45794h(this.f39405t, eventBookingCart.f39343b, eventBookingOption3.f42928c);
            mo45795i(this.f39406u, locationDescriptor, eventBookingTicket.f39359d.f42934i);
        }
        mo45797k(eventBookingTicket.f39357b, eventBookingTicket.f39359d.f42931f);
    }

    /* renamed from: h */
    public final void mo45794h(ListItemView listItemView, Event event, long j) {
        String str;
        listItemView.setSubtitle((CharSequence) event.f42915f);
        TextView textView = (TextView) listItemView.getAccessoryView();
        if (j != -1) {
            str = C7925b.m18024l(getContext(), j);
        } else {
            str = null;
        }
        UiUtils.m40234B(textView, str);
    }

    /* renamed from: i */
    public final void mo45795i(ListItemView listItemView, LocationDescriptor locationDescriptor, long j) {
        String str;
        listItemView.setSubtitle((CharSequence) locationDescriptor.mo24313f());
        TextView textView = (TextView) listItemView.getAccessoryView();
        if (j != -1) {
            str = C7925b.m18024l(getContext(), j);
        } else {
            str = null;
        }
        UiUtils.m40234B(textView, str);
    }

    /* renamed from: j */
    public final void mo45796j(long j, EventVehicleType eventVehicleType) {
        this.f39403r.setText(C20964s0.m49097o(" ", C7925b.m18015c(getContext(), j), getResources().getString(C18470e.m45333b(eventVehicleType)).toLowerCase()));
    }

    /* renamed from: k */
    public final void mo45797k(int i, CurrencyAmount currencyAmount) {
        this.f39407v.setText(getResources().getQuantityString(R.plurals.event_booking_purchase_confirmation_tickets_subtotal, i, new Object[]{Integer.valueOf(i)}));
        this.f39408w.setPrice(CurrencyAmount.m17929f(i, currencyAmount));
    }

    public void setEventRequest(EventRequest eventRequest) {
        long j;
        long j2;
        EventInstance eventInstance = eventRequest.f42953c;
        Event event = eventInstance.f42943b;
        EventRide eventRide = eventRequest.f42957g;
        setTicketsAmount(eventRequest.f42958h);
        mo45796j(eventInstance.f42947f, eventInstance.f42948g);
        setTicketPrice(eventRequest.f42956f);
        boolean z = true;
        if (eventInstance.f42949h != 1) {
            z = false;
        }
        long j3 = -1;
        if (z) {
            ListItemView listItemView = this.f39405t;
            LocationDescriptor locationDescriptor = eventRequest.f42954d;
            if (eventRide != null) {
                j3 = eventRide.f42970c;
            }
            mo45795i(listItemView, locationDescriptor, j3);
            ListItemView listItemView2 = this.f39406u;
            if (eventRide != null) {
                j2 = eventRide.f42971d;
            } else {
                j2 = eventInstance.f42947f;
            }
            mo45794h(listItemView2, event, j2);
        } else {
            ListItemView listItemView3 = this.f39405t;
            if (eventRide != null) {
                j = eventRide.f42970c;
            } else {
                j = eventInstance.f42947f;
            }
            mo45794h(listItemView3, event, j);
            ListItemView listItemView4 = this.f39406u;
            LocationDescriptor locationDescriptor2 = eventRequest.f42954d;
            if (eventRide != null) {
                j3 = eventRide.f42971d;
            }
            mo45795i(listItemView4, locationDescriptor2, j3);
        }
        mo45797k(eventRequest.f42958h, eventRequest.f42956f);
    }

    public EventBookingTicketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.event_booking_ticket_view, this, true);
        this.f39402q = (TextView) findViewById(R.id.tickets_amount);
        this.f39403r = (TextView) findViewById(R.id.metadata);
        this.f39404s = (PriceView) findViewById(R.id.ticket_price);
        this.f39405t = (ListItemView) findViewById(R.id.origin);
        this.f39406u = (ListItemView) findViewById(R.id.destination);
        this.f39407v = (TextView) findViewById(R.id.tickets_subtotal);
        this.f39408w = (PriceView) findViewById(R.id.tickets_price);
    }
}
