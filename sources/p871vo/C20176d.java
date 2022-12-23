package p871vo;

import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p364al.C13480a;
import p541ho.C17465b;
import p821tm.C19697c;
import p821tm.C19704h;

/* renamed from: vo.d */
public final class C20176d {

    /* renamed from: a */
    public List<String> f51184a = EmptyList.f60173b;

    /* renamed from: b */
    public Integer f51185b;

    /* renamed from: c */
    public final C13480a f51186c;

    /* renamed from: d */
    public final C19704h f51187d;

    /* renamed from: e */
    public final C19697c f51188e;

    /* renamed from: vo.d$a */
    public static final class C20177a implements C17465b {

        /* renamed from: a */
        public final C13480a f51189a;

        /* renamed from: b */
        public final C19704h f51190b;

        /* renamed from: c */
        public final C19697c f51191c;

        public C20177a(C13480a aVar, C19704h hVar, C19697c cVar) {
            C24362h.m61211f(aVar, "jobExecutor");
            C24362h.m61211f(hVar, "getListOfActiveTicketDetailsFunction");
            C24362h.m61211f(cVar, "getAllTicketDetailsJob");
            this.f51189a = aVar;
            this.f51190b = hVar;
            this.f51191c = cVar;
        }
    }

    public C20176d(C13480a aVar, C19704h hVar, C19697c cVar) {
        C24362h.m61211f(aVar, "jobExecutor");
        C24362h.m61211f(hVar, "getListOfActiveTicketDetailsFunction");
        C24362h.m61211f(cVar, "getAllTicketDetailsJob");
        this.f51186c = aVar;
        this.f51187d = hVar;
        this.f51188e = cVar;
    }

    /* renamed from: a */
    public final void mo52423a(String str) {
        int i = 0;
        for (String a : this.f51184a) {
            if (C24362h.m61206a(str, a)) {
                this.f51185b = Integer.valueOf(i);
                return;
            }
            i++;
        }
        this.f51185b = null;
    }
}
