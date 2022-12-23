package s90;

import c00.C13717b;
import com.moovit.ticketing.ticket.Ticket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s90.a */
public final class C13072a {

    /* renamed from: a */
    public final List<Ticket> f32332a;

    public C13072a(ArrayList arrayList) {
        this.f32332a = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TicketsHistory{tickets=");
        k.append(C13717b.m34269p(this.f32332a));
        k.append('}');
        return k.toString();
    }
}
