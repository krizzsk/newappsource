package p821tm;

import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import p364al.C13483d;
import p364al.C13487h;
import p366an.C13493a;
import p891wk.C20344a;
import p891wk.C20362q;

/* renamed from: tm.g */
public final class C19702g implements C13483d {

    /* renamed from: a */
    public GetTicketJob f50029a;

    /* renamed from: b */
    public C13493a f50030b;

    /* renamed from: c */
    public String f50031c;

    /* renamed from: tm.g$a */
    public static class C19703a {

        /* renamed from: a */
        public GetTicketJob f50032a;

        /* renamed from: b */
        public C13493a.C13494a f50033b;

        public C19703a(GetTicketJob getTicketJob, C13493a.C13494a aVar) {
            this.f50032a = getTicketJob;
            this.f50033b = aVar;
        }
    }

    public C19702g(GetTicketJob getTicketJob, C13493a aVar, String str) {
        this.f50029a = getTicketJob;
        this.f50030b = aVar;
        this.f50031c = str;
    }

    /* renamed from: C */
    public final C13487h<C20362q> mo40394C() {
        boolean z;
        C13487h<C20362q> a = this.f50029a.mo44363a(this.f50031c);
        if (a.mo40399a()) {
            return a;
        }
        C20362q qVar = (C20362q) a.f33365a;
        boolean z2 = false;
        if (qVar.f51582D == TicketState.LIVE) {
            C20344a aVar = qVar.f51608n;
            if (!aVar.f51508c || aVar.f51510e.intValue() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2 && !this.f50030b.mo40404a().mo40399a()) {
            return this.f50029a.mo44363a(this.f50031c);
        }
        return a;
    }
}
