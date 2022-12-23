package p799so;

import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import p565io.C17625b;
import p587jo.C17901a;
import p704om.C18791g;
import p821tm.C19714r;

/* renamed from: so.c */
public final class C19499c extends C17901a<C19496a> {

    /* renamed from: b */
    public final C18791g f49599b;

    /* renamed from: c */
    public final GetTicketJob f49600c;

    /* renamed from: d */
    public final C19714r f49601d;

    /* renamed from: so.c$a */
    public static class C19500a extends C17901a.C17902a<C19496a, C19499c> {

        /* renamed from: a */
        public final C18791g f49602a;

        /* renamed from: b */
        public final GetTicketJob f49603b;

        /* renamed from: c */
        public final C19714r f49604c;

        public C19500a(C18791g gVar, GetTicketJob getTicketJob, C19714r rVar) {
            this.f49602a = gVar;
            this.f49603b = getTicketJob;
            this.f49604c = rVar;
        }

        /* renamed from: a */
        public final C17901a mo50454a(C17625b bVar) {
            return new C19499c((C19496a) bVar, this.f49602a, this.f49603b, this.f49604c);
        }
    }

    public C19499c(C19496a aVar, C18791g gVar, GetTicketJob getTicketJob, C19714r rVar) {
        super(aVar);
        this.f49599b = gVar;
        this.f49600c = getTicketJob;
        this.f49601d = rVar;
    }
}
