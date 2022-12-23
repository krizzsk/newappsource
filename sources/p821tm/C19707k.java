package p821tm;

import com.masabi.justride.sdk.jobs.ticket.get.TicketSummaryBuilderException;
import java.util.ArrayList;
import java.util.List;
import p364al.C13487h;
import p465ek.C16835c;
import p725pj.C18926a;
import p798sn.C19493a;
import p891wk.C20362q;

/* renamed from: tm.k */
public final class C19707k {

    /* renamed from: a */
    public final C19714r f50049a;

    public C19707k(C19714r rVar) {
        this.f50049a = rVar;
    }

    /* renamed from: a */
    public final C13487h<List<C19493a>> mo52056a(List<C20362q> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (C20362q a : list) {
                this.f50049a.getClass();
                arrayList.add(C19714r.m47180a(a));
            }
            return new C13487h<>(arrayList, (C18926a) null);
        } catch (TicketSummaryBuilderException e) {
            return new C13487h<>(null, new C16835c((C18926a) null, C16835c.f43819l, e.getLocalizedMessage()));
        }
    }
}
