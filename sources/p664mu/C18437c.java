package p664mu;

import aa0.C7543n;
import android.content.Context;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: mu.c */
public final class C18437c {

    /* renamed from: b */
    public static final C18437c f47002b = new C18437c();

    /* renamed from: a */
    public final AtomicReference<C7543n<List<C18438a>>> f47003a = new AtomicReference<>((Object) null);

    /* renamed from: mu.c$a */
    public static class C18438a implements Comparable<C18438a> {

        /* renamed from: e */
        public static final C18439a f47004e = new C18439a(C18438a.class);

        /* renamed from: b */
        public final ServerId f47005b;

        /* renamed from: c */
        public int f47006c;

        /* renamed from: d */
        public long f47007d;

        /* renamed from: mu.c$a$a */
        public class C18439a extends C19619s<C18438a> {
            public C18439a(Class cls) {
                super(1, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i >= 0 && i <= 1;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                ServerId serverId;
                ServerId serverId2;
                if (i < 1) {
                    pVar.getClass();
                    serverId2 = new ServerId(pVar.mo51924l());
                } else if (!pVar.mo51919b()) {
                    serverId = null;
                    return new C18438a(serverId, pVar.mo51924l(), pVar.mo51925m());
                } else {
                    serverId2 = new ServerId(pVar.mo51924l());
                }
                serverId = serverId2;
                return new C18438a(serverId, pVar.mo51924l(), pVar.mo51925m());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C18438a aVar = (C18438a) obj;
                ServerId serverId = aVar.f47005b;
                if (serverId == null) {
                    qVar.mo51934b(false);
                } else {
                    qVar.mo51934b(true);
                    qVar.mo51939l(serverId.f15142b);
                }
                qVar.mo51939l(aVar.f47006c);
                qVar.mo51940m(aVar.f47007d);
            }
        }

        public C18438a(ServerId serverId, int i, long j) {
            this.f47005b = serverId;
            this.f47006c = i;
            this.f47007d = j;
        }

        public final int compareTo(Object obj) {
            return -Integer.compare(this.f47006c, ((C18438a) obj).f47006c);
        }
    }

    /* renamed from: mu.c$b */
    public static final class C18440b {

        /* renamed from: a */
        public final ServerId f47008a;

        /* renamed from: b */
        public final ServerId f47009b;

        /* renamed from: c */
        public final long f47010c;

        public C18440b(ServerId serverId, ServerId serverId2, long j) {
            C21100e.m49373x(serverId, "lineId");
            this.f47008a = serverId;
            this.f47009b = serverId2;
            this.f47010c = j;
        }
    }

    /* renamed from: a */
    public final C7543n<List<C18438a>> mo50885a(Context context) throws Exception {
        C7543n<List<C18438a>> nVar = this.f47003a.get();
        if (nVar == null) {
            synchronized (this.f47003a) {
                nVar = this.f47003a.get();
                if (nVar == null) {
                    C18438a.C18439a aVar = C18438a.f47004e;
                    C7543n<List<C18438a>> q = C7543n.m17285q(context, C19575a.m46957a(aVar, true), new C19576b(aVar, true), "mot_activations_recorder");
                    q.mo51042l();
                    this.f47003a.set(q);
                    nVar = q;
                }
            }
        }
        return nVar;
    }
}
