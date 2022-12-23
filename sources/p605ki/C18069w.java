package p605ki;

import com.google.android.play.core.assetpacks.C14333w2;
import com.masabi.justride.sdk.jobs.ticket.get.AvailableTicketsSortOrder;
import p469eo.C16846b;
import p773rm.C19288a;
import p797sm.C19480b;
import p797sm.C19492m;
import p821tm.C19699e;
import p821tm.C19707k;
import p821tm.C19708l;

/* renamed from: ki.w */
public final class C18069w {

    /* renamed from: a */
    public final C16846b f46231a;

    public C18069w(C16846b bVar) {
        this.f46231a = bVar;
    }

    /* renamed from: a */
    public final C14333w2 mo50534a(AvailableTicketsSortOrder availableTicketsSortOrder) {
        C19492m mVar;
        C19699e.C19700a aVar = (C19699e.C19700a) this.f46231a.mo49505a(C19699e.C19700a.class, (String) null);
        C19708l lVar = aVar.f50022a;
        C19288a aVar2 = aVar.f50023b;
        C19707k kVar = aVar.f50024c;
        C19480b bVar = aVar.f50025d;
        bVar.getClass();
        int i = C19480b.C19481a.f49544a[availableTicketsSortOrder.ordinal()];
        if (i == 1) {
            mVar = bVar.f49542a;
        } else if (i == 2) {
            mVar = bVar.f49543b;
        } else {
            throw new RuntimeException("Unknown sort order");
        }
        return new C14333w2(new C19699e(lVar, aVar2, kVar, mVar).mo40394C());
    }
}
