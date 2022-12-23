package b50;

import c00.C13722f;
import c00.C13723g;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.ticketing.ticket.Ticket;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p732pq.C18949j;

/* renamed from: b50.i */
public final /* synthetic */ class C25552i implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f63812b;

    /* renamed from: c */
    public final /* synthetic */ List f63813c;

    public /* synthetic */ C25552i(List list, int i) {
        this.f63812b = i;
        this.f63813c = list;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f63812b) {
            case 0:
                return this.f63813c.contains(((PaymentMethod) obj).f64052b);
            default:
                List list = this.f63813c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                if (C13723g.m34286g(list, new C18949j((Ticket) obj, 5)) != null) {
                    return true;
                }
                return false;
        }
    }
}
