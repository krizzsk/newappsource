package m80;

import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.ticketing.activation.C7634b;
import com.moovit.ticketing.ticket.TicketId;
import p977zz.C20949l;
import q80.C13033v;

/* renamed from: m80.q */
public final /* synthetic */ class C12882q implements SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ TicketId f31884b;

    public /* synthetic */ C12882q(TicketId ticketId) {
        this.f31884b = ticketId;
    }

    public final boolean invoke(Object obj) {
        TicketId ticketId = this.f31884b;
        int i = C7634b.f23238h;
        ((C7634b.C7635a) obj).mo23971H0(ticketId);
        return true;
    }

    public final Task then(Object obj) {
        return Tasks.call(MoovitExecutors.f37327IO, new C13033v((C13752e) obj, this.f31884b));
    }
}
