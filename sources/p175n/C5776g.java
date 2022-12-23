package p175n;

import android.view.View;
import android.view.animation.Interpolator;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.Iterator;
import p242s1.C6382p0;
import p242s1.C6386q0;

/* renamed from: n.g */
public final class C5776g {

    /* renamed from: a */
    public final ArrayList<C6382p0> f18714a = new ArrayList<>();

    /* renamed from: b */
    public long f18715b = -1;

    /* renamed from: c */
    public Interpolator f18716c;

    /* renamed from: d */
    public C6386q0 f18717d;

    /* renamed from: e */
    public boolean f18718e;

    /* renamed from: f */
    public final C5777a f18719f = new C5777a();

    /* renamed from: n.g$a */
    public class C5777a extends C21100e {

        /* renamed from: i */
        public boolean f18720i = false;

        /* renamed from: j */
        public int f18721j = 0;

        public C5777a() {
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            int i = this.f18721j + 1;
            this.f18721j = i;
            if (i == C5776g.this.f18714a.size()) {
                C6386q0 q0Var = C5776g.this.f18717d;
                if (q0Var != null) {
                    q0Var.mo909b((View) null);
                }
                this.f18721j = 0;
                this.f18720i = false;
                C5776g.this.f18718e = false;
            }
        }

        /* renamed from: d */
        public final void mo957d() {
            if (!this.f18720i) {
                this.f18720i = true;
                C6386q0 q0Var = C5776g.this.f18717d;
                if (q0Var != null) {
                    q0Var.mo957d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21645a() {
        if (this.f18718e) {
            Iterator<C6382p0> it = this.f18714a.iterator();
            while (it.hasNext()) {
                it.next().mo22492b();
            }
            this.f18718e = false;
        }
    }

    /* renamed from: b */
    public final void mo21646b() {
        if (!this.f18718e) {
            Iterator<C6382p0> it = this.f18714a.iterator();
            while (it.hasNext()) {
                C6382p0 next = it.next();
                long j = this.f18715b;
                if (j >= 0) {
                    next.mo22495e(j);
                }
                Interpolator interpolator = this.f18716c;
                if (interpolator != null) {
                    next.mo22496f(interpolator);
                }
                if (this.f18717d != null) {
                    next.mo22497g(this.f18719f);
                }
                next.mo22498h();
            }
            this.f18718e = true;
        }
    }
}
