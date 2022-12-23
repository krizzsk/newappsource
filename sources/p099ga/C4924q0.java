package p099ga;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.drm.C3912b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p100gb.C4967d0;
import p100gb.C4978i;
import p100gb.C4979j;
import p100gb.C4980k;
import p100gb.C4983l;
import p100gb.C4984m;
import p100gb.C4987o;
import p100gb.C4995u;
import p112ha.C5196m0;
import p265tb.C6671u;
import p277ub.C6774a0;

/* renamed from: ga.q0 */
public final class C4924q0 {

    /* renamed from: a */
    public final ArrayList f16651a = new ArrayList();

    /* renamed from: b */
    public final IdentityHashMap<C4984m, C4927c> f16652b = new IdentityHashMap<>();

    /* renamed from: c */
    public final HashMap f16653c = new HashMap();

    /* renamed from: d */
    public final C4928d f16654d;

    /* renamed from: e */
    public final C4995u.C4996a f16655e;

    /* renamed from: f */
    public final C3912b.C3913a f16656f;

    /* renamed from: g */
    public final HashMap<C4927c, C4926b> f16657g;

    /* renamed from: h */
    public final HashSet f16658h;

    /* renamed from: i */
    public C4967d0 f16659i = new C4967d0.C4968a();

    /* renamed from: j */
    public boolean f16660j;

    /* renamed from: k */
    public C6671u f16661k;

    /* renamed from: ga.q0$a */
    public final class C4925a implements C4995u, C3912b {

        /* renamed from: b */
        public final C4927c f16662b;

        /* renamed from: c */
        public C4995u.C4996a f16663c;

        /* renamed from: d */
        public C3912b.C3913a f16664d;

        public C4925a(C4927c cVar) {
            this.f16663c = C4924q0.this.f16655e;
            this.f16664d = C4924q0.this.f16656f;
            this.f16662b = cVar;
        }

        /* renamed from: E */
        public final void mo15994E(int i, C4987o.C4988a aVar) {
            if (mo20589a(i, aVar)) {
                this.f16664d.mo16006f();
            }
        }

        /* renamed from: G */
        public final void mo20587G(int i, C4987o.C4988a aVar, C4983l lVar) {
            if (mo20589a(i, aVar)) {
                this.f16663c.mo20698b(lVar);
            }
        }

        /* renamed from: R */
        public final void mo15995R(int i, C4987o.C4988a aVar) {
            if (mo20589a(i, aVar)) {
                this.f16664d.mo16001a();
            }
        }

        /* renamed from: T */
        public final void mo20588T(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar, IOException iOException, boolean z) {
            if (mo20589a(i, aVar)) {
                this.f16663c.mo20701e(iVar, lVar, iOException, z);
            }
        }

        /* renamed from: a */
        public final boolean mo20589a(int i, C4987o.C4988a aVar) {
            C4987o.C4988a aVar2 = null;
            if (aVar != null) {
                C4927c cVar = this.f16662b;
                int i2 = 0;
                while (true) {
                    if (i2 >= cVar.f16671c.size()) {
                        break;
                    } else if (((C4987o.C4988a) cVar.f16671c.get(i2)).f16860d == aVar.f16860d) {
                        Object obj = aVar.f16857a;
                        Object obj2 = cVar.f16670b;
                        int i3 = C4855a.f16282e;
                        aVar2 = aVar.mo20691b(Pair.create(obj2, obj));
                        break;
                    } else {
                        i2++;
                    }
                }
                if (aVar2 == null) {
                    return false;
                }
            }
            int i4 = i + this.f16662b.f16672d;
            C4995u.C4996a aVar3 = this.f16663c;
            if (aVar3.f16885a != i4 || !C6774a0.m15941a(aVar3.f16886b, aVar2)) {
                this.f16663c = new C4995u.C4996a(C4924q0.this.f16655e.f16887c, i4, aVar2);
            }
            C3912b.C3913a aVar4 = this.f16664d;
            if (aVar4.f13725a == i4 && C6774a0.m15941a(aVar4.f13726b, aVar2)) {
                return true;
            }
            this.f16664d = new C3912b.C3913a(C4924q0.this.f16656f.f13727c, i4, aVar2);
            return true;
        }

        /* renamed from: c0 */
        public final void mo20590c0(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
            if (mo20589a(i, aVar)) {
                this.f16663c.mo20702f(iVar, lVar);
            }
        }

        /* renamed from: e0 */
        public final void mo15996e0(int i, C4987o.C4988a aVar) {
            if (mo20589a(i, aVar)) {
                this.f16664d.mo16002b();
            }
        }

        /* renamed from: f */
        public final /* synthetic */ void mo15997f() {
        }

        /* renamed from: g0 */
        public final void mo15998g0(int i, C4987o.C4988a aVar, int i2) {
            if (mo20589a(i, aVar)) {
                this.f16664d.mo16004d(i2);
            }
        }

        /* renamed from: n */
        public final void mo15999n(int i, C4987o.C4988a aVar, Exception exc) {
            if (mo20589a(i, aVar)) {
                this.f16664d.mo16005e(exc);
            }
        }

        /* renamed from: o */
        public final void mo20591o(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
            if (mo20589a(i, aVar)) {
                this.f16663c.mo20699c(iVar, lVar);
            }
        }

        /* renamed from: r */
        public final void mo20592r(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
            if (mo20589a(i, aVar)) {
                this.f16663c.mo20700d(iVar, lVar);
            }
        }

        /* renamed from: z */
        public final void mo16000z(int i, C4987o.C4988a aVar) {
            if (mo20589a(i, aVar)) {
                this.f16664d.mo16003c();
            }
        }
    }

    /* renamed from: ga.q0$b */
    public static final class C4926b {

        /* renamed from: a */
        public final C4987o f16666a;

        /* renamed from: b */
        public final C4987o.C4989b f16667b;

        /* renamed from: c */
        public final C4925a f16668c;

        public C4926b(C4980k kVar, C4922p0 p0Var, C4925a aVar) {
            this.f16666a = kVar;
            this.f16667b = p0Var;
            this.f16668c = aVar;
        }
    }

    /* renamed from: ga.q0$c */
    public static final class C4927c implements C4920o0 {

        /* renamed from: a */
        public final C4980k f16669a;

        /* renamed from: b */
        public final Object f16670b = new Object();

        /* renamed from: c */
        public final ArrayList f16671c = new ArrayList();

        /* renamed from: d */
        public int f16672d;

        /* renamed from: e */
        public boolean f16673e;

        public C4927c(C4987o oVar, boolean z) {
            this.f16669a = new C4980k(oVar, z);
        }

        /* renamed from: a */
        public final Object mo20445a() {
            return this.f16670b;
        }

        /* renamed from: b */
        public final C4879e1 mo20446b() {
            return this.f16669a.f16841n;
        }
    }

    /* renamed from: ga.q0$d */
    public interface C4928d {
    }

    public C4924q0(C4928d dVar, C5196m0 m0Var, Handler handler) {
        this.f16654d = dVar;
        C4995u.C4996a aVar = new C4995u.C4996a();
        this.f16655e = aVar;
        C3912b.C3913a aVar2 = new C3912b.C3913a();
        this.f16656f = aVar2;
        this.f16657g = new HashMap<>();
        this.f16658h = new HashSet();
        if (m0Var != null) {
            aVar.f16887c.add(new C4995u.C4996a.C4997a(handler, m0Var));
            aVar2.f13727c.add(new C3912b.C3913a.C3914a(handler, m0Var));
        }
    }

    /* renamed from: a */
    public final C4879e1 mo20579a(int i, List<C4927c> list, C4967d0 d0Var) {
        if (!list.isEmpty()) {
            this.f16659i = d0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C4927c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    C4927c cVar2 = (C4927c) this.f16651a.get(i2 - 1);
                    C4980k.C4981a aVar = cVar2.f16669a.f16841n;
                    cVar.f16672d = aVar.mo20463o() + cVar2.f16672d;
                    cVar.f16673e = false;
                    cVar.f16671c.clear();
                } else {
                    cVar.f16672d = 0;
                    cVar.f16673e = false;
                    cVar.f16671c.clear();
                }
                mo20580b(i2, cVar.f16669a.f16841n.mo20463o());
                this.f16651a.add(i2, cVar);
                this.f16653c.put(cVar.f16670b, cVar);
                if (this.f16660j) {
                    mo20584f(cVar);
                    if (this.f16652b.isEmpty()) {
                        this.f16658h.add(cVar);
                    } else {
                        C4926b bVar = this.f16657g.get(cVar);
                        if (bVar != null) {
                            bVar.f16666a.mo20620h(bVar.f16667b);
                        }
                    }
                }
            }
        }
        return mo20581c();
    }

    /* renamed from: b */
    public final void mo20580b(int i, int i2) {
        while (i < this.f16651a.size()) {
            ((C4927c) this.f16651a.get(i)).f16672d += i2;
            i++;
        }
    }

    /* renamed from: c */
    public final C4879e1 mo20581c() {
        if (this.f16651a.isEmpty()) {
            return C4879e1.f16414a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f16651a.size(); i2++) {
            C4927c cVar = (C4927c) this.f16651a.get(i2);
            cVar.f16672d = i;
            i += cVar.f16669a.f16841n.mo20463o();
        }
        return new C4947w0(this.f16651a, this.f16659i);
    }

    /* renamed from: d */
    public final void mo20582d() {
        Iterator it = this.f16658h.iterator();
        while (it.hasNext()) {
            C4927c cVar = (C4927c) it.next();
            if (cVar.f16671c.isEmpty()) {
                C4926b bVar = this.f16657g.get(cVar);
                if (bVar != null) {
                    bVar.f16666a.mo20620h(bVar.f16667b);
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public final void mo20583e(C4927c cVar) {
        if (cVar.f16673e && cVar.f16671c.isEmpty()) {
            C4926b remove = this.f16657g.remove(cVar);
            remove.getClass();
            remove.f16666a.mo20616b(remove.f16667b);
            remove.f16666a.mo20618e(remove.f16668c);
            remove.f16666a.mo20622j(remove.f16668c);
            this.f16658h.remove(cVar);
        }
    }

    /* renamed from: f */
    public final void mo20584f(C4927c cVar) {
        C4980k kVar = cVar.f16669a;
        C4922p0 p0Var = new C4922p0(this);
        C4925a aVar = new C4925a(cVar);
        this.f16657g.put(cVar, new C4926b(kVar, p0Var, aVar));
        int i = C6774a0.f20959a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        kVar.mo20619f(new Handler(myLooper, (Handler.Callback) null), aVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        kVar.mo20621i(new Handler(myLooper2, (Handler.Callback) null), aVar);
        kVar.mo20617d(p0Var, this.f16661k);
    }

    /* renamed from: g */
    public final void mo20585g(C4984m mVar) {
        C4927c remove = this.f16652b.remove(mVar);
        remove.getClass();
        remove.f16669a.mo20682a(mVar);
        remove.f16671c.remove(((C4979j) mVar).f16830b);
        if (!this.f16652b.isEmpty()) {
            mo20582d();
        }
        mo20583e(remove);
    }

    /* renamed from: h */
    public final void mo20586h(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C4927c cVar = (C4927c) this.f16651a.remove(i3);
            this.f16653c.remove(cVar.f16670b);
            mo20580b(i3, -cVar.f16669a.f16841n.mo20463o());
            cVar.f16673e = true;
            if (this.f16660j) {
                mo20583e(cVar);
            }
        }
    }
}
