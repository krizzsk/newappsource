package p100gb;

import com.google.android.exoplayer2.drm.C3911a;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.C3915c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.C4076a;
import com.google.android.exoplayer2.upstream.Loader;
import h60.C17327j1;
import p099ga.C4879e1;
import p099ga.C4901j0;
import p100gb.C4987o;
import p100gb.C4995u;
import p100gb.C4999w;
import p100gb.C5001x;
import p173ma.C5733f;
import p173ma.C5739k;
import p265tb.C6654g;
import p265tb.C6658j;
import p265tb.C6663n;
import p265tb.C6669s;
import p265tb.C6671u;

/* renamed from: gb.y */
public final class C5007y extends C4955a implements C5001x.C5003b {

    /* renamed from: g */
    public final C4901j0 f16953g;

    /* renamed from: h */
    public final C4901j0.C4907f f16954h;

    /* renamed from: i */
    public final C6654g.C6655a f16955i;

    /* renamed from: j */
    public final C4999w.C5000a f16956j;

    /* renamed from: k */
    public final C3915c f16957k;

    /* renamed from: l */
    public final C6669s f16958l;

    /* renamed from: m */
    public final int f16959m;

    /* renamed from: n */
    public boolean f16960n = true;

    /* renamed from: o */
    public long f16961o = -9223372036854775807L;

    /* renamed from: p */
    public boolean f16962p;

    /* renamed from: q */
    public boolean f16963q;

    /* renamed from: r */
    public C6671u f16964r;

    /* renamed from: gb.y$a */
    public class C5008a extends C4975g {
        public C5008a(C4972e0 e0Var) {
            super(e0Var);
        }

        /* renamed from: f */
        public final C4879e1.C4881b mo20345f(int i, C4879e1.C4881b bVar, boolean z) {
            this.f16822b.mo20345f(i, bVar, z);
            bVar.f16420f = true;
            return bVar;
        }

        /* renamed from: n */
        public final C4879e1.C4882c mo20349n(int i, C4879e1.C4882c cVar, long j) {
            this.f16822b.mo20349n(i, cVar, j);
            cVar.f16435l = true;
            return cVar;
        }
    }

    /* renamed from: gb.y$b */
    public static final class C5009b implements C4998v {

        /* renamed from: a */
        public final C6654g.C6655a f16965a;

        public C5009b(C6663n nVar, C5733f fVar) {
            this.f16965a = nVar;
            new C3911a();
            new C4076a();
        }
    }

    public C5007y(C4901j0 j0Var, C6654g.C6655a aVar, C4999w.C5000a aVar2, C3915c cVar, C4076a aVar3, int i) {
        C4901j0.C4907f fVar = j0Var.f16537b;
        fVar.getClass();
        this.f16954h = fVar;
        this.f16953g = j0Var;
        this.f16955i = aVar;
        this.f16956j = aVar2;
        this.f16957k = cVar;
        this.f16958l = aVar3;
        this.f16959m = i;
    }

    /* renamed from: a */
    public final void mo20682a(C4984m mVar) {
        C5001x xVar = (C5001x) mVar;
        if (xVar.f16927w) {
            for (C4956a0 a0Var : xVar.f16924t) {
                a0Var.mo20636g();
                DrmSession drmSession = a0Var.f16756i;
                if (drmSession != null) {
                    drmSession.mo15954c(a0Var.f16752e);
                    a0Var.f16756i = null;
                    a0Var.f16755h = null;
                }
            }
        }
        Loader loader = xVar.f16916l;
        Loader.C4072c<? extends Loader.C4073d> cVar = loader.f14576b;
        if (cVar != null) {
            cVar.mo16705a(true);
        }
        loader.f14575a.execute(new Loader.C4075f(xVar));
        loader.f14575a.shutdown();
        xVar.f16921q.removeCallbacksAndMessages((Object) null);
        xVar.f16922r = null;
        xVar.f16905M = true;
    }

    /* renamed from: c */
    public final C4901j0 mo20683c() {
        return this.f16953g;
    }

    /* renamed from: g */
    public final C4984m mo20684g(C4987o.C4988a aVar, C6658j jVar, long j) {
        C4987o.C4988a aVar2 = aVar;
        C6654g a = this.f16955i.mo22825a();
        C6671u uVar = this.f16964r;
        if (uVar != null) {
            a.mo20680d(uVar);
        }
        C4901j0.C4907f fVar = this.f16954h;
        return new C5001x(fVar.f16562a, a, new C4960b((C5739k) ((C17327j1) this.f16956j).f44716c), this.f16957k, new C3912b.C3913a(this.f16742d.f13727c, 0, aVar2), this.f16958l, new C4995u.C4996a(this.f16741c.f16887c, 0, aVar2), this, jVar, fVar.f16565d, this.f16959m);
    }

    /* renamed from: k */
    public final void mo20685k() {
    }

    /* renamed from: q */
    public final void mo20628q(C6671u uVar) {
        this.f16964r = uVar;
        this.f16957k.mo15968c();
        mo20721s();
    }

    /* renamed from: r */
    public final void mo20629r() {
        this.f16957k.release();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [gb.y$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20721s() {
        /*
            r7 = this;
            gb.e0 r6 = new gb.e0
            long r1 = r7.f16961o
            boolean r3 = r7.f16962p
            boolean r4 = r7.f16963q
            ga.j0 r5 = r7.f16953g
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            boolean r0 = r7.f16960n
            if (r0 == 0) goto L_0x0018
            gb.y$a r0 = new gb.y$a
            r0.<init>(r6)
            r6 = r0
        L_0x0018:
            r7.f16744f = r6
            java.util.ArrayList<gb.o$b> r0 = r7.f16739a
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            gb.o$b r1 = (p100gb.C4987o.C4989b) r1
            r1.mo20578a(r6)
            goto L_0x0020
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C5007y.mo20721s():void");
    }

    /* renamed from: t */
    public final void mo20722t(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f16961o;
        }
        if (this.f16960n || this.f16961o != j || this.f16962p != z || this.f16963q != z2) {
            this.f16961o = j;
            this.f16962p = z;
            this.f16963q = z2;
            this.f16960n = false;
            mo20721s();
        }
    }
}
