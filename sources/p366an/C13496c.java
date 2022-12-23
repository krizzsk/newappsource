package p366an;

import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import p364al.C13483d;
import p364al.C13487h;
import p366an.C13493a;
import p513gk.C17201b;
import p725pj.C18926a;
import p774rn.C19291a;
import p868vl.C20154a;
import p891wk.C20362q;

/* renamed from: an.c */
public final class C13496c implements C13483d {

    /* renamed from: a */
    public final C20154a f33393a;

    /* renamed from: b */
    public final C13493a.C13494a f33394b;

    /* renamed from: c */
    public final GetTicketJob f33395c;

    /* renamed from: d */
    public final C19291a f33396d;

    /* renamed from: an.c$a */
    public static class C13497a {

        /* renamed from: a */
        public final C20154a f33397a;

        /* renamed from: b */
        public final C13493a.C13494a f33398b;

        /* renamed from: c */
        public final GetTicketJob f33399c;

        public C13497a(C20154a aVar, GetTicketJob getTicketJob, C13493a.C13494a aVar2) {
            this.f33397a = aVar;
            this.f33398b = aVar2;
            this.f33399c = getTicketJob;
        }
    }

    public C13496c(C20154a aVar, C13493a.C13494a aVar2, GetTicketJob getTicketJob, C19291a aVar3) {
        this.f33393a = aVar;
        this.f33394b = aVar2;
        this.f33395c = getTicketJob;
        this.f33396d = aVar3;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        boolean z;
        C20154a aVar = this.f33393a;
        if (aVar.f51160a.contains("all") || aVar.f51160a.contains("ticket-activation")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new C13487h<>(null, new C17201b((C18926a) null, C17201b.f44452i, "The ticket-activation entitlement is required for this API"));
        }
        String str = this.f33396d.f49044a;
        C13487h<C20362q> a = this.f33395c.mo44363a(str);
        if (!a.mo40399a()) {
            return this.f33394b.mo40405a(str).mo40404a();
        }
        return new C13487h<>(null, new C17201b(a.f33366b, C17201b.f44448e, "Invalid ticket"));
    }
}
