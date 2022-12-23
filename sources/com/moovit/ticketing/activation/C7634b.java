package com.moovit.ticketing.activation;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appboy.models.InAppMessageBase;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.ticket.TicketId;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import p216q1.C6133b;
import p543hq.C17474b;
import p644lx.C18284b;
import p783rw.C19370b;
import p977zz.C20964s0;

/* renamed from: com.moovit.ticketing.activation.b */
public class C7634b extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f23238h = 0;

    /* renamed from: com.moovit.ticketing.activation.b$a */
    public interface C7635a {
        /* renamed from: H0 */
        void mo23971H0(TicketId ticketId);
    }

    public C7634b() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.ticket_provider_activation_confirmation_dialog_fragment, viewGroup, false);
        String string = mo46752K1().getString("title");
        TextView textView = (TextView) inflate.findViewById(C12869e.title);
        if (C20964s0.m49090h(string)) {
            textView.setText(getString(C12873i.ticket_activation_confirm_dialog_title));
        } else {
            textView.setText(C6133b.m14694a(string));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        String string2 = mo46752K1().getString(InAppMessageBase.MESSAGE);
        TextView textView2 = (TextView) inflate.findViewById(C12869e.message);
        if (C20964s0.m49090h(string2)) {
            textView2.setText(getString(C12873i.ticket_activation_confirm_dialog_message));
        } else {
            textView2.setText(C6133b.m14694a(string2));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        inflate.findViewById(C12869e.confirm).setOnClickListener(new C19370b(this, 18));
        inflate.findViewById(C12869e.cancel).setOnClickListener(new C18284b(this, 13));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "activate_ticket_provider_confirm_dialog");
        mo22564R1(aVar.mo49933a());
    }
}
