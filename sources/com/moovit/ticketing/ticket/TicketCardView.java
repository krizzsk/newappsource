package com.moovit.ticketing.ticket;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import c20.C13744a;
import com.google.android.material.card.MaterialCardView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.view.PriceView;
import m80.C12866b;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12874j;
import p883wc.C20289a;
import p977zz.C20964s0;

public class TicketCardView extends MaterialCardView implements C7757d {

    /* renamed from: t */
    public static final int f23500t = C12874j.Widget_Moovit_TicketCard;

    /* renamed from: q */
    public final ListItemView f23501q;

    /* renamed from: r */
    public final ListItemView f23502r;

    /* renamed from: s */
    public final Button f23503s;

    public TicketCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12866b.ticketCardStyle);
    }

    private void setAdditionalInfoView(Ticket ticket) {
        setAdditionalInfoViewTitle(ticket);
        setAdditionalInfoViewSubtitle(ticket);
        setAdditionalInfoViewAccessory(ticket);
    }

    private void setAdditionalInfoViewAccessory(Ticket ticket) {
        ((PriceView) this.f23502r.getAccessoryView()).setPrice(ticket.f23479h);
    }

    private void setAdditionalInfoViewSubtitle(Ticket ticket) {
        String str = ticket.f23492u;
        if (C20964s0.m49090h(str)) {
            this.f23502r.setSubtitle((CharSequence) null);
            return;
        }
        this.f23502r.setSubtitle((CharSequence) str);
        this.f23502r.getSubtitleView().setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    private void setAdditionalInfoViewTitle(Ticket ticket) {
        String str = ticket.f23491t;
        ListItemView listItemView = this.f23502r;
        if (str == null) {
            str = getContext().getString(C12873i.ticketing_single_ride);
        }
        listItemView.setTitle((CharSequence) str);
    }

    private void setInfoView(Ticket ticket) {
        String str = ticket.f23489r;
        String str2 = ticket.f23490s;
        if (C20964s0.m49090h(str) || C20964s0.m49090h(str2)) {
            this.f23501q.setTitle((CharSequence) ticket.f23476e);
            this.f23501q.setSubtitle((CharSequence) null);
            this.f23501q.setIcon((Drawable) null);
        } else {
            this.f23501q.setTitle((CharSequence) str);
            this.f23501q.setSubtitle((CharSequence) str2);
        }
        C13744a.m34300b((ImageView) this.f23501q.getAccessoryView(), ticket.f23478g.mo24222b());
    }

    public void setActionButtonClickListener(View.OnClickListener onClickListener) {
        this.f23503s.setOnClickListener(onClickListener);
    }

    public void setActionButtonText(String str) {
        UiUtils.m40234B(this.f23503s, str);
    }

    public void setTicket(Ticket ticket) {
        setInfoView(ticket);
        setAdditionalInfoView(ticket);
    }

    public TicketCardView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f23500t), attributeSet, i);
        LayoutInflater.from(getContext()).inflate(C12870f.ticket_card_view, this, true);
        this.f23501q = (ListItemView) findViewById(C12869e.info_view);
        this.f23502r = (ListItemView) findViewById(C12869e.additional_info_view);
        this.f23503s = (Button) findViewById(C12869e.ticket_action_button);
    }
}
