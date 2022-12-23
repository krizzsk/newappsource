package com.moovit.ticketing.purchase.fare;

import android.widget.Button;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketView;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import java.util.List;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import p310x5.C7158c;
import p310x5.C7159d;
import p451du.C16723t;
import p496fr.C17064a;
import p496fr.C17065b;
import p543hq.C17474b;
import p665mv.C18467c;
import p761qy.C19201a;

public class PurchaseTicketConfirmedActivity extends BaseTicketActivationActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f23294l0 = 0;

    /* renamed from: Y */
    public Button f23295Y;

    /* renamed from: Z */
    public Button f23296Z;

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity$a */
    public static /* synthetic */ class C7662a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23297a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ticketing.ticket.Ticket$Status[] r0 = com.moovit.ticketing.ticket.Ticket.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23297a = r0
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23297a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID_AUTO_ACTIVATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23297a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23297a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23297a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ISSUING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23297a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity.C7662a.<clinit>():void");
        }
    }

    /* renamed from: B2 */
    public final void mo23965B2() {
        setContentView(C12870f.purchase_ticket_confirmed_activity);
        this.f23296Z = (Button) findViewById(C12869e.action_button);
        this.f23295Y = (Button) findViewById(C12869e.dismiss_button);
    }

    /* renamed from: E2 */
    public final void mo23968E2(Ticket ticket) {
        super.mo23968E2(ticket);
        finish();
    }

    /* renamed from: G2 */
    public final void mo23970G2(List<Ticket> list) {
        int max = Math.max(1, getIntent().getIntExtra("numberOfTickets", 0));
        Ticket ticket = (Ticket) C13717b.m34256c(list);
        ((TicketView) findViewById(C12869e.ticket_view)).mo24248a(ticket, max);
        if (max > 1) {
            this.f23296Z.setText(C12873i.ticket_details_action_view_ticket);
            this.f23296Z.setOnClickListener(new C19201a(this, 13));
            this.f23296Z.setVisibility(0);
        } else {
            int i = C7662a.f23297a[ticket.f23475d.ordinal()];
            if (i == 1) {
                this.f23296Z.setText(C12873i.purchased_ticket_confirmed_action_activate);
                this.f23296Z.setOnClickListener(new C16723t(9, this, ticket));
                this.f23296Z.setVisibility(0);
            } else if (i == 2 || i == 3) {
                this.f23296Z.setText(C12873i.purchased_ticket_confirmed_action_show_ticket);
                this.f23296Z.setOnClickListener(new C17064a(10, this, ticket));
                this.f23296Z.setVisibility(0);
            } else if (i == 4 || i == 5) {
                this.f23296Z.setText(C12873i.purchased_ticket_confirmed_action_show_ticket);
                this.f23296Z.setOnClickListener(new C17065b(9, this, ticket));
                this.f23296Z.setVisibility(0);
            } else {
                this.f23296Z.setVisibility(4);
            }
        }
        if (max > 1) {
            this.f23295Y.setText(C12873i.purchased_ticket_confirmed_action_dismiss);
            this.f23295Y.setOnClickListener(new C7158c(8, this, ticket));
        } else if (C7662a.f23297a[ticket.f23475d.ordinal()] != 1) {
            this.f23295Y.setText(C12873i.purchased_ticket_confirmed_action_dismiss);
            this.f23295Y.setOnClickListener(new C18467c(5, this, ticket));
        } else {
            this.f23295Y.setText(C12873i.purchased_ticket_confirmed_action_activate_later);
            this.f23295Y.setOnClickListener(new C7159d(6, this, ticket));
        }
    }

    /* renamed from: H2 */
    public final void mo23972H2(boolean z) {
        if (z) {
            mo44543u2((CharSequence) null);
        } else {
            mo44506I1();
        }
    }

    /* renamed from: I2 */
    public final void mo24057I2(Ticket ticket) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, FullScreenWidgetActivity.EXTRA_DISMISS);
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticket.f23473b.f23511b);
        aVar.mo49939g(AnalyticsAttributeKey.ID, ticket.f23473b.f23513d);
        mo44545v2(aVar.mo49933a());
        finish();
    }
}
