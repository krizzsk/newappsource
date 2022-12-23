package p785ry;

import c00.C13722f;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.Ticket;
import j90.C12789b;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import s90.C13076d;

/* renamed from: ry.d */
public final /* synthetic */ class C19384d implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f49312b;

    /* renamed from: c */
    public final /* synthetic */ ServerId f49313c;

    public /* synthetic */ C19384d(int i, ServerId serverId) {
        this.f49312b = i;
        this.f49313c = serverId;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f49312b) {
            case 0:
                return this.f49313c.equals(((WondoOffer) obj).f40716c);
            case 1:
                ServerId serverId = this.f49313c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return serverId.equals(((C12789b) obj).f31612a);
            default:
                ServerId serverId2 = this.f49313c;
                Set<Ticket.Status> set = C13076d.f32344g;
                return serverId2.equals(((C12789b) obj).f31612a);
        }
    }
}
