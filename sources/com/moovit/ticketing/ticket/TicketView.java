package com.moovit.ticketing.ticket;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import java.util.Arrays;
import java.util.List;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import p146k6.C5515t;
import p169m6.C5710d;
import p583jk.C17884p;
import r10.C19220d;
import s90.C13076d;
import y10.C20690e;

public class TicketView extends FrameLayout implements C7757d {

    /* renamed from: b */
    public final List<ImageView> f23526b;

    /* renamed from: c */
    public final TextView f23527c;

    /* renamed from: d */
    public final TextView f23528d;

    /* renamed from: e */
    public final TextView f23529e;

    public TicketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo24248a(Ticket ticket, int i) {
        String str;
        this.f23527c.setText(ticket.f23476e);
        if (ticket.f23487p == null || C13076d.f32344g.contains(ticket.f23475d)) {
            str = ticket.f23479h.toString();
        } else {
            str = null;
        }
        UiUtils.m40234B(this.f23528d, str);
        TicketAgency ticketAgency = ticket.f23478g;
        this.f23529e.setText(ticketAgency.mo24223c());
        Image b = ticketAgency.mo24222b();
        if (b != null) {
            C17884p.m44354Y(this.f23529e).mo51642v(b).mo51628o0(b).mo10848R(new C20690e(this.f23529e, UiUtils.Edge.LEFT));
        } else {
            C15780a.m40271d(this.f23529e, UiUtils.Edge.LEFT, (Drawable) null);
        }
        Image image = ticket.f23478g.f23499f;
        if (image == null) {
            image = new ResourceImage(C12868d.img_bg_ticket_default, new String[0]);
        }
        int g = UiUtils.m40248g(getContext(), 4.0f);
        int i2 = 0;
        for (ImageView next : this.f23526b) {
            int i3 = i2 + 1;
            if (i2 >= i) {
                next.setVisibility(4);
            } else {
                next.setVisibility(0);
                C19220d o0 = C17884p.m44354Y(next).mo51642v(image).mo10866g0(C5710d.m14021g()).mo22738w(C12868d.img_bg_ticket_placeholder).mo51628o0(image);
                if (i3 > 0) {
                    C19220d dVar = (C19220d) o0.mo22717H(new C5515t(g), true);
                }
                o0.mo10850T(next);
            }
            i2 = i3;
        }
    }

    public void setTicket(Ticket ticket) {
        mo24248a(ticket, 1);
    }

    public TicketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setMinimumHeight(UiUtils.m40249h(context.getResources(), 206.0f));
        int h = UiUtils.m40249h(context.getResources(), 8.0f);
        setPadding(h, h, h, h);
        LayoutInflater.from(context).inflate(C12870f.ticket_view_content, this, true);
        this.f23526b = Arrays.asList(new ImageView[]{(ImageView) findViewById(C12869e.ticket_img_3), (ImageView) findViewById(C12869e.ticket_img_2), (ImageView) findViewById(C12869e.ticket_img_1)});
        this.f23527c = (TextView) findViewById(C12869e.ticket_name);
        this.f23528d = (TextView) findViewById(C12869e.ticket_price);
        this.f23529e = (TextView) findViewById(C12869e.ticket_agency);
    }
}
