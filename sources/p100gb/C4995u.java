package p100gb;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p099ga.C4883f;
import p100gb.C4987o;
import p277ub.C6774a0;

/* renamed from: gb.u */
public interface C4995u {

    /* renamed from: gb.u$a */
    public static class C4996a {

        /* renamed from: a */
        public final int f16885a;

        /* renamed from: b */
        public final C4987o.C4988a f16886b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C4997a> f16887c;

        /* renamed from: d */
        public final long f16888d;

        /* renamed from: gb.u$a$a */
        public static final class C4997a {

            /* renamed from: a */
            public Handler f16889a;

            /* renamed from: b */
            public C4995u f16890b;

            public C4997a(Handler handler, C4995u uVar) {
                this.f16889a = handler;
                this.f16890b = uVar;
            }
        }

        public C4996a() {
            this(new CopyOnWriteArrayList(), 0, (C4987o.C4988a) null);
        }

        /* renamed from: a */
        public final long mo20697a(long j) {
            long b = C4883f.m12377b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f16888d + b;
        }

        /* renamed from: b */
        public final void mo20698b(C4983l lVar) {
            Iterator<C4997a> it = this.f16887c.iterator();
            while (it.hasNext()) {
                C4997a next = it.next();
                C6774a0.m15966z(next.f16889a, new C4991q(this, next.f16890b, lVar));
            }
        }

        /* renamed from: c */
        public final void mo20699c(C4978i iVar, C4983l lVar) {
            Iterator<C4997a> it = this.f16887c.iterator();
            while (it.hasNext()) {
                C4997a next = it.next();
                C6774a0.m15966z(next.f16889a, new C4994t(this, next.f16890b, iVar, lVar, 0));
            }
        }

        /* renamed from: d */
        public final void mo20700d(C4978i iVar, C4983l lVar) {
            Iterator<C4997a> it = this.f16887c.iterator();
            while (it.hasNext()) {
                C4997a next = it.next();
                C6774a0.m15966z(next.f16889a, new C4993s(this, next.f16890b, iVar, lVar, 0));
            }
        }

        /* renamed from: e */
        public final void mo20701e(C4978i iVar, C4983l lVar, IOException iOException, boolean z) {
            Iterator<C4997a> it = this.f16887c.iterator();
            while (it.hasNext()) {
                C4997a next = it.next();
                C6774a0.m15966z(next.f16889a, new C4992r(this, next.f16890b, iVar, lVar, iOException, z));
            }
        }

        /* renamed from: f */
        public final void mo20702f(C4978i iVar, C4983l lVar) {
            Iterator<C4997a> it = this.f16887c.iterator();
            while (it.hasNext()) {
                C4997a next = it.next();
                C6774a0.m15966z(next.f16889a, new C4990p(this, next.f16890b, iVar, lVar));
            }
        }

        public C4996a(CopyOnWriteArrayList copyOnWriteArrayList, int i, C4987o.C4988a aVar) {
            this.f16887c = copyOnWriteArrayList;
            this.f16885a = i;
            this.f16886b = aVar;
            this.f16888d = 0;
        }
    }

    /* renamed from: G */
    void mo20587G(int i, C4987o.C4988a aVar, C4983l lVar);

    /* renamed from: T */
    void mo20588T(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar, IOException iOException, boolean z);

    /* renamed from: c0 */
    void mo20590c0(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar);

    /* renamed from: o */
    void mo20591o(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar);

    /* renamed from: r */
    void mo20592r(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar);
}
