package p100gb;

import android.os.Handler;
import com.google.android.exoplayer2.drm.C3912b;
import java.io.IOException;
import java.util.HashMap;
import p100gb.C4980k;
import p100gb.C4987o;
import p100gb.C4995u;
import p265tb.C6671u;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: gb.e */
public abstract class C4969e<T> extends C4955a {

    /* renamed from: g */
    public final HashMap<T, C4971b<T>> f16796g = new HashMap<>();

    /* renamed from: h */
    public Handler f16797h;

    /* renamed from: i */
    public C6671u f16798i;

    /* renamed from: gb.e$a */
    public final class C4970a implements C4995u, C3912b {

        /* renamed from: b */
        public final T f16799b = null;

        /* renamed from: c */
        public C4995u.C4996a f16800c;

        /* renamed from: d */
        public C3912b.C3913a f16801d;

        public C4970a() {
            this.f16800c = new C4995u.C4996a(C4969e.this.f16741c.f16887c, 0, (C4987o.C4988a) null);
            this.f16801d = new C3912b.C3913a(C4969e.this.f16742d.f13727c, 0, (C4987o.C4988a) null);
        }

        /* renamed from: E */
        public final void mo15994E(int i, C4987o.C4988a aVar) {
            mo20675a(i, aVar);
            this.f16801d.mo16006f();
        }

        /* renamed from: G */
        public final void mo20587G(int i, C4987o.C4988a aVar, C4983l lVar) {
            mo20675a(i, aVar);
            this.f16800c.mo20698b(mo20676b(lVar));
        }

        /* renamed from: R */
        public final void mo15995R(int i, C4987o.C4988a aVar) {
            mo20675a(i, aVar);
            this.f16801d.mo16001a();
        }

        /* renamed from: T */
        public final void mo20588T(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar, IOException iOException, boolean z) {
            mo20675a(i, aVar);
            this.f16800c.mo20701e(iVar, mo20676b(lVar), iOException, z);
        }

        /* renamed from: a */
        public final boolean mo20675a(int i, C4987o.C4988a aVar) {
            C4987o.C4988a aVar2;
            if (aVar != null) {
                C4969e eVar = C4969e.this;
                T t = this.f16799b;
                C4980k kVar = (C4980k) eVar;
                kVar.getClass();
                Void voidR = (Void) t;
                Object obj = aVar.f16857a;
                Object obj2 = kVar.f16841n.f16848d;
                if (obj2 != null && obj2.equals(obj)) {
                    obj = C4980k.C4981a.f16846e;
                }
                aVar2 = aVar.mo20691b(obj);
            } else {
                aVar2 = null;
            }
            C4969e.this.getClass();
            C4995u.C4996a aVar3 = this.f16800c;
            if (aVar3.f16885a != i || !C6774a0.m15941a(aVar3.f16886b, aVar2)) {
                this.f16800c = new C4995u.C4996a(C4969e.this.f16741c.f16887c, i, aVar2);
            }
            C3912b.C3913a aVar4 = this.f16801d;
            if (aVar4.f13725a == i && C6774a0.m15941a(aVar4.f13726b, aVar2)) {
                return true;
            }
            this.f16801d = new C3912b.C3913a(C4969e.this.f16742d.f13727c, i, aVar2);
            return true;
        }

        /* renamed from: b */
        public final C4983l mo20676b(C4983l lVar) {
            C4969e eVar = C4969e.this;
            long j = lVar.f16855f;
            eVar.getClass();
            C4969e eVar2 = C4969e.this;
            long j2 = lVar.f16856g;
            eVar2.getClass();
            if (j == lVar.f16855f && j2 == lVar.f16856g) {
                return lVar;
            }
            return new C4983l(lVar.f16850a, lVar.f16851b, lVar.f16852c, lVar.f16853d, lVar.f16854e, j, j2);
        }

        /* renamed from: c0 */
        public final void mo20590c0(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
            mo20675a(i, aVar);
            this.f16800c.mo20702f(iVar, mo20676b(lVar));
        }

        /* renamed from: e0 */
        public final void mo15996e0(int i, C4987o.C4988a aVar) {
            mo20675a(i, aVar);
            this.f16801d.mo16002b();
        }

        /* renamed from: f */
        public final /* synthetic */ void mo15997f() {
        }

        /* renamed from: g0 */
        public final void mo15998g0(int i, C4987o.C4988a aVar, int i2) {
            mo20675a(i, aVar);
            this.f16801d.mo16004d(i2);
        }

        /* renamed from: n */
        public final void mo15999n(int i, C4987o.C4988a aVar, Exception exc) {
            mo20675a(i, aVar);
            this.f16801d.mo16005e(exc);
        }

        /* renamed from: o */
        public final void mo20591o(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
            mo20675a(i, aVar);
            this.f16800c.mo20699c(iVar, mo20676b(lVar));
        }

        /* renamed from: r */
        public final void mo20592r(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
            mo20675a(i, aVar);
            this.f16800c.mo20700d(iVar, mo20676b(lVar));
        }

        /* renamed from: z */
        public final void mo16000z(int i, C4987o.C4988a aVar) {
            mo20675a(i, aVar);
            this.f16801d.mo16003c();
        }
    }

    /* renamed from: gb.e$b */
    public static final class C4971b<T> {

        /* renamed from: a */
        public final C4987o f16803a;

        /* renamed from: b */
        public final C4987o.C4989b f16804b;

        /* renamed from: c */
        public final C4969e<T>.C25541a f16805c;

        public C4971b(C4987o oVar, C4966d dVar, C4970a aVar) {
            this.f16803a = oVar;
            this.f16804b = dVar;
            this.f16805c = aVar;
        }
    }

    /* renamed from: o */
    public final void mo20626o() {
        for (C4971b next : this.f16796g.values()) {
            next.f16803a.mo20620h(next.f16804b);
        }
    }

    /* renamed from: p */
    public final void mo20627p() {
        for (C4971b next : this.f16796g.values()) {
            next.f16803a.mo20625n(next.f16804b);
        }
    }

    /* renamed from: s */
    public final void mo20674s(C4987o oVar) {
        C17875h.m44301k(!this.f16796g.containsKey((Object) null));
        C4966d dVar = new C4966d(this);
        C4970a aVar = new C4970a();
        this.f16796g.put((Object) null, new C4971b(oVar, dVar, aVar));
        Handler handler = this.f16797h;
        handler.getClass();
        oVar.mo20619f(handler, aVar);
        Handler handler2 = this.f16797h;
        handler2.getClass();
        oVar.mo20621i(handler2, aVar);
        oVar.mo20617d(dVar, this.f16798i);
        if (!(!this.f16740b.isEmpty())) {
            oVar.mo20620h(dVar);
        }
    }
}
