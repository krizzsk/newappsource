package p244s3;

import android.content.Context;
import c90.C7579b;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import j00.C17688g;
import j20.C17707d;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import n80.C12916c;
import p030bo.app.C1637m4;
import p664mu.C18451j;
import p687nt.C18604l;
import p977zz.C20944i0;
import q00.C19047a;
import q80.C13011b;
import z20.C20806a;

/* renamed from: s3.q */
public final /* synthetic */ class C6442q implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f20137b;

    /* renamed from: c */
    public final /* synthetic */ Object f20138c;

    /* renamed from: d */
    public final /* synthetic */ Object f20139d;

    public /* synthetic */ C6442q(int i, Object obj, Object obj2) {
        this.f20137b = i;
        this.f20138c = obj;
        this.f20139d = obj2;
    }

    public final void onSuccess(Object obj) {
        TicketId ticketId;
        switch (this.f20137b) {
            case 0:
                C1637m4.m4484a((Context) this.f20138c, (List) this.f20139d, (Void) obj);
                return;
            case 1:
                C18604l.C18613i iVar = (C18604l.C18613i) this.f20138c;
                LocationDescriptor locationDescriptor = (LocationDescriptor) this.f20139d;
                C17707d dVar = (C17707d) obj;
                iVar.getClass();
                if (dVar != null) {
                    LocationDescriptor locationDescriptor2 = dVar.f45454e;
                    if (locationDescriptor2 == null) {
                        locationDescriptor2 = dVar.f45450a;
                    }
                    if (C18604l.this.f47381G.getTag() == locationDescriptor) {
                        C18604l.this.f47381G.setTag(locationDescriptor2);
                        C17688g.m43897a(C18604l.this.f47381G, locationDescriptor2.mo24313f(), R.attr.colorOnSurface).start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i = C18451j.f47036q;
                ((C18451j) this.f20138c).mo50897p2((Trace) this.f20139d, (PaymentAccount) obj);
                return;
            case 3:
                int i2 = PaymentAccountPaymentMethodsFragment.f64045q;
                ((PaymentAccountPaymentMethodsFragment) this.f20138c).mo83528p2((C19047a) this.f20139d, (PaymentAccount) obj);
                return;
            case 4:
                C12916c cVar = (C12916c) this.f20139d;
                C13011b bVar = (C13011b) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                ((C12887v) this.f20138c).getClass();
                if (bVar != null) {
                    ticketId = bVar.f32201m;
                } else {
                    ticketId = null;
                }
                if (ticketId != null) {
                    Ticket ticket = cVar.f31981a;
                    C20806a.C20807a aVar = new C20806a.C20807a("ticket_activation_se");
                    aVar.mo52936d("provider_id", ticketId.f23511b);
                    aVar.mo52934b(ticket.f23478g.mo24223c(), "agency_name");
                    aVar.mo52934b(ticket.f23476e, "item_name");
                    aVar.mo52935c();
                    return;
                }
                return;
            default:
                ((C7579b) this.f20138c).f23081g.put((String) this.f20139d, (List) ((C20944i0) obj).f52693b);
                return;
        }
    }
}
