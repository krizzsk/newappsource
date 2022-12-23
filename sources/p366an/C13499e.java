package p366an;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.material.internal.C14080o;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import p066e0.C4436j0;
import p364al.C13483d;
import p364al.C13487h;
import p513gk.C17201b;
import p583jk.C17883o;
import p659mp.C18415a;
import p704om.C18788d;
import p725pj.C18926a;
import p725pj.C18927b;
import p752qn.C19143a;
import p774rn.C19291a;
import p774rn.C19293c;
import p868vl.C20154a;
import p891wk.C20344a;
import p891wk.C20362q;

/* renamed from: an.e */
public final class C13499e implements C13483d {

    /* renamed from: a */
    public final GetTicketJob f33400a;

    /* renamed from: b */
    public final C14080o f33401b;

    /* renamed from: c */
    public final C18788d f33402c;

    /* renamed from: d */
    public final C4436j0 f33403d;

    /* renamed from: e */
    public final C20154a f33404e;

    /* renamed from: f */
    public final C13498d f33405f;

    /* renamed from: g */
    public final String f33406g;

    /* renamed from: an.e$a */
    public static class C13500a {

        /* renamed from: a */
        public final GetTicketJob f33407a;

        /* renamed from: b */
        public final C14080o f33408b;

        /* renamed from: c */
        public final C18788d f33409c;

        /* renamed from: d */
        public final C4436j0 f33410d;

        /* renamed from: e */
        public final C20154a f33411e;

        /* renamed from: f */
        public final C13498d f33412f;

        public C13500a(GetTicketJob getTicketJob, C14080o oVar, C18788d dVar, C4436j0 j0Var, C20154a aVar, C13498d dVar2) {
            this.f33407a = getTicketJob;
            this.f33408b = oVar;
            this.f33409c = dVar;
            this.f33410d = j0Var;
            this.f33411e = aVar;
            this.f33412f = dVar2;
        }
    }

    public C13499e(GetTicketJob getTicketJob, C14080o oVar, C18788d dVar, C4436j0 j0Var, C20154a aVar, C13498d dVar2, String str) {
        this.f33400a = getTicketJob;
        this.f33401b = oVar;
        this.f33402c = dVar;
        this.f33403d = j0Var;
        this.f33404e = aVar;
        this.f33405f = dVar2;
        this.f33406g = str;
    }

    /* renamed from: C */
    public final C13487h<C19291a> mo40394C() {
        boolean z;
        C19293c cVar;
        C20154a aVar = this.f33404e;
        boolean z2 = false;
        if (aVar.f51160a.contains("all") || aVar.f51160a.contains("ticket-activation")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mo40406a((C18926a) null, C17201b.f44452i, "The ticket-activation entitlement is required for this API");
        }
        C13487h<C20362q> a = this.f33400a.mo44363a(this.f33406g);
        if (a.mo40399a()) {
            return mo40406a(a.f33366b, C17201b.f44448e, "Invalid ticket");
        }
        C20362q qVar = (C20362q) a.f33365a;
        if (!TicketState.LIVE.equals(qVar.f51582D)) {
            return mo40406a((C18926a) null, C17201b.f44449f, "Invalid state");
        }
        C20344a aVar2 = qVar.f51608n;
        if (aVar2 == null) {
            StringBuilder k = C13555b.m33972k("ActivationDetails object missing from ticket ");
            k.append(this.f33406g);
            return mo40406a(new C18927b(C13499e.class, k.toString()), Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
        }
        C19143a a2 = this.f33401b.mo41889a(aVar2);
        this.f33405f.getClass();
        Integer num = aVar2.f51512g;
        int intValue = aVar2.f51510e.intValue();
        if (num == null || intValue < num.intValue()) {
            z2 = true;
        }
        if (!z2) {
            return mo40406a((C18926a) null, C17201b.f44450g, "Activation limit exceeded");
        }
        C13487h a3 = this.f33402c.mo51269a(qVar);
        if (a3.mo40399a()) {
            return new C13487h<>(null, a3.f33366b);
        }
        C4436j0 j0Var = this.f33403d;
        C18415a aVar3 = (C18415a) a3.f33365a;
        if (aVar3 == null) {
            j0Var.getClass();
            cVar = null;
        } else {
            Long valueOf = Long.valueOf(aVar3.f46965a);
            ((C17883o) j0Var.f15501b).getClass();
            cVar = new C19293c(C17883o.m44329a(valueOf), aVar3.f46967c, aVar3.f46966b, aVar3.f46968d);
        }
        return new C13487h<>(new C19291a(this.f33406g, a2, cVar), (C18926a) null);
    }

    /* renamed from: a */
    public final C13487h mo40406a(C18926a aVar, Integer num, String str) {
        return new C13487h(null, new C17201b(aVar, num, str));
    }
}
