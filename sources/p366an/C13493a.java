package p366an;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.masabi.justride.sdk.internal.models.ticket_activation.TicketActivationRecordList;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import p364al.C13487h;
import p412cn.C13851a;
import p413co.C13872r;
import p444dn.C16686a;
import p444dn.C16687b;
import p445do.C16690b;
import p513gk.C17200a;
import p513gk.C17201b;
import p561ik.C17618a;
import p725pj.C18926a;
import p725pj.C18927b;
import p752qn.C19151i;
import p774rn.C19292b;
import p795sk.C19468a;
import p891wk.C20344a;
import p891wk.C20362q;
import p894wn.C20379b;
import p915xk.C20534a;
import p916xl.C20536b;
import p917xm.C20541d;
import p940ym.C20745a;
import p941yn.C20746a;
import p964zm.C20876b;

/* renamed from: an.a */
public final class C13493a {

    /* renamed from: a */
    public final GetTicketJob f33372a;

    /* renamed from: b */
    public final C16686a f33373b;

    /* renamed from: c */
    public final C16690b f33374c;

    /* renamed from: d */
    public final C20745a f33375d;

    /* renamed from: e */
    public final C13498d f33376e;

    /* renamed from: f */
    public final C20541d f33377f;

    /* renamed from: g */
    public final C20746a f33378g;

    /* renamed from: h */
    public final C20379b f33379h;

    /* renamed from: i */
    public final C20876b f33380i;

    /* renamed from: j */
    public final C20536b f33381j;

    /* renamed from: k */
    public final String f33382k;

    /* renamed from: an.a$a */
    public static class C13494a {

        /* renamed from: a */
        public final C16690b f33383a;

        /* renamed from: b */
        public final GetTicketJob f33384b;

        /* renamed from: c */
        public final C16686a f33385c;

        /* renamed from: d */
        public final C20745a f33386d;

        /* renamed from: e */
        public final C13498d f33387e;

        /* renamed from: f */
        public final C20541d f33388f;

        /* renamed from: g */
        public final C20746a f33389g;

        /* renamed from: h */
        public final C20379b f33390h;

        /* renamed from: i */
        public final C20876b f33391i;

        /* renamed from: j */
        public final C20536b f33392j;

        public C13494a(GetTicketJob getTicketJob, C16686a aVar, C16690b bVar, C20745a aVar2, C13498d dVar, C20541d dVar2, C20746a aVar3, C20379b bVar2, C20876b bVar3, C20536b bVar4) {
            this.f33383a = bVar;
            this.f33384b = getTicketJob;
            this.f33385c = aVar;
            this.f33386d = aVar2;
            this.f33387e = dVar;
            this.f33388f = dVar2;
            this.f33389g = aVar3;
            this.f33390h = bVar2;
            this.f33391i = bVar3;
            this.f33392j = bVar4;
        }

        /* renamed from: a */
        public final C13493a mo40405a(String str) {
            return new C13493a(this.f33384b, this.f33385c, this.f33383a, this.f33386d, this.f33387e, this.f33388f, this.f33389g, this.f33390h, this.f33391i, this.f33392j, str);
        }
    }

    public C13493a(GetTicketJob getTicketJob, C16686a aVar, C16690b bVar, C20745a aVar2, C13498d dVar, C20541d dVar2, C20746a aVar3, C20379b bVar2, C20876b bVar3, C20536b bVar4, String str) {
        this.f33372a = getTicketJob;
        this.f33373b = aVar;
        this.f33374c = bVar;
        this.f33375d = aVar2;
        this.f33376e = dVar;
        this.f33377f = dVar2;
        this.f33378g = aVar3;
        this.f33379h = bVar2;
        this.f33380i = bVar3;
        this.f33381j = bVar4;
        this.f33382k = str;
    }

    /* renamed from: b */
    public static C13487h m33812b(C18926a aVar, Integer num, String str) {
        return new C13487h(null, new C17201b(aVar, num, str));
    }

    /* renamed from: a */
    public final C13487h<Void> mo40404a() {
        boolean z;
        C13487h hVar;
        C13487h hVar2;
        C13487h hVar3;
        C13487h<C20362q> a = this.f33372a.mo44363a(this.f33382k);
        if (a.mo40399a()) {
            return m33812b(a.f33366b, C17201b.f44448e, "Invalid ticket");
        }
        C20362q qVar = (C20362q) a.f33365a;
        if (!TicketState.LIVE.equals(qVar.f51582D)) {
            return m33812b((C18926a) null, C17201b.f44449f, "Invalid state");
        }
        C20344a aVar = qVar.f51608n;
        if (aVar == null) {
            StringBuilder k = C13555b.m33972k("ActivationDetails object missing from ticket ");
            k.append(this.f33382k);
            return m33812b(new C18927b(C13493a.class, k.toString()), Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
        }
        this.f33376e.getClass();
        Integer num = aVar.f51512g;
        int intValue = aVar.f51510e.intValue();
        if (num == null || intValue < num.intValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m33812b((C18926a) null, C17201b.f44450g, "Activation limit exceeded");
        }
        C13487h<C19151i> a2 = this.f33375d.mo52890a(qVar);
        if (a2.mo40399a()) {
            return m33812b(a2.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
        }
        C19151i iVar = (C19151i) a2.f33365a;
        if (iVar.f48734a && !iVar.f48735b) {
            return m33812b((C18926a) null, C17201b.f44451h, "The ticket is not in its usage period");
        }
        int intValue2 = qVar.f51608n.f51510e.intValue();
        long a3 = this.f33374c.mo49402a();
        C19292b bVar = new C19292b(this.f33382k, Long.valueOf(a3), Integer.valueOf(intValue2 + 1));
        C16686a aVar2 = this.f33373b;
        String str = this.f33382k;
        C13851a aVar3 = aVar2.f43469a;
        C16687b.C16688a aVar4 = aVar2.f43470b;
        C13487h<List<C19292b>> a4 = aVar3.mo40780a(str);
        if (a4.mo40399a()) {
            hVar = new C13487h(null, new C17200a(a4.f33366b, C17200a.f44443f, "Write failed"));
        } else {
            TicketActivationRecordList ticketActivationRecordList = new TicketActivationRecordList((List) a4.f33365a);
            ticketActivationRecordList.add(bVar);
            C13487h<Void> C = new C16687b(aVar4.f43475a, aVar4.f43476b, str, ticketActivationRecordList).mo40394C();
            if (C.mo40399a()) {
                hVar = new C13487h(null, new C17200a(C.f33366b, C17200a.f44443f, "Write failed"));
            } else {
                hVar = new C13487h(null, (C18926a) null);
            }
        }
        if (hVar.mo40399a()) {
            hVar2 = new C13487h(null, hVar.f33366b);
        } else {
            C19468a a5 = this.f33379h.mo44368a();
            if (a5 != null) {
                C20534a aVar5 = new C20534a(a5);
                C20876b bVar2 = this.f33380i;
                String str2 = this.f33382k;
                bVar2.getClass();
                try {
                    C13872r<Void> c = bVar2.f52610a.mo40786c(C21100e.m49328W(), C20876b.m48871a(a3, str2), bVar2.f52611b.mo52733b(aVar5).getBytes(StandardCharsets.UTF_8));
                    if (c.mo40817a()) {
                        hVar3 = new C13487h(null, new C17200a(c.f34120b, C17200a.f44446i, "Write extra activation information failed"));
                    } else {
                        hVar3 = new C13487h(null, (C18926a) null);
                    }
                } catch (JSONException e) {
                    hVar3 = new C13487h(null, new C17618a(e.getMessage()));
                }
                if (hVar3.mo40399a()) {
                    this.f33381j.mo52737a(hVar3.f33366b);
                }
            }
            hVar2 = new C13487h(null, (C18926a) null);
        }
        if (hVar2.mo40399a()) {
            return m33812b(hVar2.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error");
        }
        this.f33378g.mo40391b(this.f33377f);
        return new C13487h<>(null, (C18926a) null);
    }
}
