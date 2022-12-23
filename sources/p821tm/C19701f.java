package p821tm;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import p364al.C13483d;
import p364al.C13487h;
import p561ik.C17618a;
import p725pj.C18926a;
import p773rm.C19289b;
import p798sn.C19493a;
import p891wk.C20362q;
import p962zk.C20872a;

/* renamed from: tm.f */
public final class C19701f implements C13483d {

    /* renamed from: a */
    public final C19708l f50026a;

    /* renamed from: b */
    public final C19289b f50027b;

    /* renamed from: c */
    public final C19707k f50028c;

    public C19701f(C19708l lVar, C19289b bVar, C19707k kVar) {
        this.f50026a = lVar;
        this.f50027b = bVar;
        this.f50028c = kVar;
    }

    /* renamed from: C */
    public final C13487h<List<C19493a>> mo40394C() {
        C13487h<C20872a> a = this.f50026a.mo52057a();
        boolean a2 = a.mo40399a();
        Integer valueOf = Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        if (a2) {
            return new C13487h<>(null, new C17618a(a.f33366b, valueOf));
        }
        List<C20362q> list = ((C20872a) a.f33365a).f52608a;
        C19289b bVar = this.f50027b;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        EnumSet of = EnumSet.of(TicketState.USED, TicketState.EXPIRED, TicketState.REFUNDED, TicketState.CANCELLED);
        for (C20362q next : list) {
            if (of.contains(next.f51582D)) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, bVar.f49042b);
        C13487h<List<C19493a>> a3 = this.f50028c.mo52056a(arrayList);
        if (a3.mo40399a()) {
            return new C13487h<>(null, new C17618a(a3.f33366b, valueOf));
        }
        return new C13487h<>(a3.f33365a, (C18926a) null);
    }
}
