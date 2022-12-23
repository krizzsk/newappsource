package p926xv;

import c00.C13733n;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import java.util.List;
import java.util.Map;

/* renamed from: xv.g */
public final /* synthetic */ class C20626g implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f52147b;

    /* renamed from: c */
    public final /* synthetic */ Object f52148c;

    public /* synthetic */ C20626g(Object obj, int i) {
        this.f52147b = i;
        this.f52148c = obj;
    }

    public final Object convert(Object obj) {
        int i;
        switch (this.f52147b) {
            case 0:
                return (String) ((Map) this.f52148c).get((ServerId) obj);
            default:
                List list = ((C7755c) this.f52148c).f23535c.get((Ticket.Status) obj);
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
        }
    }
}
