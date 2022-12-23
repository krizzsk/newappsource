package com.moovit.ticketing.purchase.fare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1164b;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketCardView;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import o00.C18665b;
import o00.C18669f;
import o00.C18670g;
import p373au.C13535g;
import p451du.C16723t;
import p665mv.C18467c;

public class PurchaseTicketsConfirmedActivity extends BaseTicketActivationActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f23305Z = 0;

    /* renamed from: Y */
    public final C7668b f23306Y = new C7668b();

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity$a */
    public static /* synthetic */ class C7667a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23307a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ticketing.ticket.Ticket$Status[] r0 = com.moovit.ticketing.ticket.Ticket.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23307a = r0
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23307a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.VALID_AUTO_ACTIVATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23307a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23307a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23307a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ticketing.ticket.Ticket$Status r1 = com.moovit.ticketing.ticket.Ticket.Status.ISSUING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity.C7667a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity$b */
    public class C7668b extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final ArrayList f23308g = new ArrayList();

        public C7668b() {
        }

        public final int getItemCount() {
            return this.f23308g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            TicketCardView ticketCardView = (TicketCardView) ((C12797f) a0Var).itemView;
            Ticket ticket = (Ticket) this.f23308g.get(i);
            ticketCardView.setTicket(ticket);
            int i2 = C7667a.f23307a[ticket.f23475d.ordinal()];
            if (i2 == 1) {
                ticketCardView.setActionButtonText(PurchaseTicketsConfirmedActivity.this.getString(C12873i.purchased_ticket_confirmed_action_activate));
                ticketCardView.setActionButtonClickListener(new C18467c(6, this, ticket));
            } else if (i2 == 2 || i2 == 3) {
                ticketCardView.setActionButtonText(PurchaseTicketsConfirmedActivity.this.getString(C12873i.purchased_ticket_confirmed_action_show_ticket));
                ticketCardView.setActionButtonClickListener(new C13535g(8, this, ticket));
            } else if (i2 == 4 || i2 == 5) {
                ticketCardView.setActionButtonText(PurchaseTicketsConfirmedActivity.this.getString(C12873i.purchased_ticket_confirmed_action_show_ticket));
                ticketCardView.setActionButtonClickListener(new C16723t(10, this, ticket));
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f((TicketCardView) LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.ticket_card_view_item, viewGroup, false));
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity$c */
    public static class C7669c extends C1208m.C1210b {

        /* renamed from: a */
        public final List<Ticket> f23310a;

        /* renamed from: b */
        public final List<Ticket> f23311b;

        public C7669c(ArrayList arrayList, List list) {
            this.f23310a = arrayList;
            this.f23311b = list;
        }

        public final boolean areContentsTheSame(int i, int i2) {
            return this.f23310a.get(i).f23473b.equals(this.f23311b.get(i2).f23473b);
        }

        public final boolean areItemsTheSame(int i, int i2) {
            return this.f23310a.get(i).f23473b.equals(this.f23311b.get(i2).f23473b);
        }

        public final int getNewListSize() {
            return this.f23311b.size();
        }

        public final int getOldListSize() {
            return this.f23310a.size();
        }
    }

    /* renamed from: B2 */
    public final void mo23965B2() {
        setContentView(C12870f.purchase_tickets_confirmed_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(C12869e.recycler_view);
        Context context = recyclerView.getContext();
        recyclerView.mo4593g(C18670g.m45652e(UiUtils.m40248g(context, 16.0f)), -1);
        recyclerView.mo4593g(C18665b.m45644e(UiUtils.m40249h(context.getResources(), 16.0f)), -1);
        recyclerView.mo4593g(C18669f.m45651e(UiUtils.m40249h(context.getResources(), 16.0f)), -1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.f23306Y);
    }

    /* renamed from: G2 */
    public final void mo23970G2(List<Ticket> list) {
        C7668b bVar = this.f23306Y;
        C1208m.C1212d a = C1208m.m3293a(new C7669c(bVar.f23308g, list), true);
        bVar.f23308g.clear();
        bVar.f23308g.addAll(list);
        a.mo5103b(new C1164b(bVar));
    }

    /* renamed from: H2 */
    public final void mo23972H2(boolean z) {
        if (z) {
            mo44543u2((CharSequence) null);
        } else {
            mo44506I1();
        }
    }
}
