package p225qa;

import p173ma.C5737j;
import p173ma.C5750t;
import p173ma.C5753u;
import p173ma.C5754v;

/* renamed from: qa.d */
public final class C6222d implements C5737j {

    /* renamed from: b */
    public final long f19650b;

    /* renamed from: c */
    public final C5737j f19651c;

    /* renamed from: qa.d$a */
    public class C6223a implements C5750t {

        /* renamed from: a */
        public final /* synthetic */ C5750t f19652a;

        public C6223a(C5750t tVar) {
            this.f19652a = tVar;
        }

        /* renamed from: c */
        public final C5750t.C5751a mo21569c(long j) {
            C5750t.C5751a c = this.f19652a.mo21569c(j);
            C5753u uVar = c.f18625a;
            long j2 = uVar.f18630a;
            long j3 = uVar.f18631b;
            long j4 = C6222d.this.f19650b;
            C5753u uVar2 = new C5753u(j2, j3 + j4);
            C5753u uVar3 = c.f18626b;
            return new C5750t.C5751a(uVar2, new C5753u(uVar3.f18630a, uVar3.f18631b + j4));
        }

        /* renamed from: e */
        public final boolean mo21570e() {
            return this.f19652a.mo21570e();
        }

        /* renamed from: i */
        public final long mo21571i() {
            return this.f19652a.mo21571i();
        }
    }

    public C6222d(long j, C5737j jVar) {
        this.f19650b = j;
        this.f19651c = jVar;
    }

    /* renamed from: k */
    public final void mo20707k(C5750t tVar) {
        this.f19651c.mo20707k(new C6223a(tVar));
    }

    /* renamed from: n */
    public final void mo20708n() {
        this.f19651c.mo20708n();
    }

    /* renamed from: p */
    public final C5754v mo20709p(int i, int i2) {
        return this.f19651c.mo20709p(i, i2);
    }
}
