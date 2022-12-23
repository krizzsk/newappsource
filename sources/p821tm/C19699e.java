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
import p773rm.C19288a;
import p797sm.C19480b;
import p797sm.C19482c;
import p797sm.C19483d;
import p797sm.C19492m;
import p798sn.C19493a;
import p891wk.C20362q;
import p962zk.C20872a;

/* renamed from: tm.e */
public final class C19699e implements C13483d {

    /* renamed from: a */
    public final C19708l f50018a;

    /* renamed from: b */
    public final C19288a f50019b;

    /* renamed from: c */
    public final C19707k f50020c;

    /* renamed from: d */
    public final C19492m f50021d;

    /* renamed from: tm.e$a */
    public static class C19700a {

        /* renamed from: a */
        public final C19708l f50022a;

        /* renamed from: b */
        public final C19288a f50023b;

        /* renamed from: c */
        public final C19707k f50024c;

        /* renamed from: d */
        public final C19480b f50025d;

        public C19700a(C19708l lVar, C19288a aVar, C19707k kVar, C19480b bVar) {
            this.f50022a = lVar;
            this.f50023b = aVar;
            this.f50024c = kVar;
            this.f50025d = bVar;
        }
    }

    public C19699e(C19708l lVar, C19288a aVar, C19707k kVar, C19492m mVar) {
        this.f50018a = lVar;
        this.f50019b = aVar;
        this.f50020c = kVar;
        this.f50021d = mVar;
    }

    /* renamed from: C */
    public final C13487h<List<C19493a>> mo40394C() {
        C13487h<C20872a> a = this.f50018a.mo52057a();
        boolean a2 = a.mo40399a();
        Integer valueOf = Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        if (a2) {
            return new C13487h<>(null, new C17618a(a.f33366b, valueOf));
        }
        List<C20362q> list = ((C20872a) a.f33365a).f52608a;
        C19288a aVar = this.f50019b;
        C19492m mVar = this.f50021d;
        C19483d dVar = aVar.f49040a;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar);
        arrayList.addAll(dVar.f49546a);
        C19482c cVar = new C19482c(arrayList);
        C19492m mVar2 = aVar.f49041b;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        EnumSet of = EnumSet.of(TicketState.LIVE, TicketState.BEFORE_VP, TicketState.LIVE_UNUSABLE);
        for (C20362q next : list) {
            TicketState ticketState = next.f51582D;
            if (ticketState.isActive()) {
                arrayList2.add(next);
            } else if (of.contains(ticketState)) {
                arrayList3.add(next);
            }
        }
        Collections.sort(arrayList2, mVar2);
        Collections.sort(arrayList3, cVar);
        arrayList2.addAll(arrayList3);
        C13487h<List<C19493a>> a3 = this.f50020c.mo52056a(arrayList2);
        if (a3.mo40399a()) {
            return new C13487h<>(null, new C17618a(a3.f33366b, valueOf));
        }
        return new C13487h<>(a3.f33365a, (C18926a) null);
    }
}
