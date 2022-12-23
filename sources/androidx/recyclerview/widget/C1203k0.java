package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p229r1.C6235e;
import p241s0.C6305e;
import p241s0.C6313h;

/* renamed from: androidx.recyclerview.widget.k0 */
public final class C1203k0 {

    /* renamed from: a */
    public final C6313h<RecyclerView.C1119a0, C1204a> f4533a = new C6313h<>();

    /* renamed from: b */
    public final C6305e<RecyclerView.C1119a0> f4534b = new C6305e<>();

    /* renamed from: androidx.recyclerview.widget.k0$a */
    public static class C1204a {

        /* renamed from: d */
        public static C6235e f4535d = new C6235e(20);

        /* renamed from: a */
        public int f4536a;

        /* renamed from: b */
        public RecyclerView.C1128j.C1131c f4537b;

        /* renamed from: c */
        public RecyclerView.C1128j.C1131c f4538c;

        /* renamed from: a */
        public static C1204a m3290a() {
            C1204a aVar = (C1204a) f4535d.mo22237b();
            if (aVar == null) {
                return new C1204a();
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo5087a(RecyclerView.C1119a0 a0Var, RecyclerView.C1128j.C1131c cVar) {
        C1204a orDefault = this.f4533a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = C1204a.m3290a();
            this.f4533a.put(a0Var, orDefault);
        }
        orDefault.f4538c = cVar;
        orDefault.f4536a |= 8;
    }

    /* renamed from: b */
    public final void mo5088b(RecyclerView.C1119a0 a0Var, RecyclerView.C1128j.C1131c cVar) {
        C1204a orDefault = this.f4533a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = C1204a.m3290a();
            this.f4533a.put(a0Var, orDefault);
        }
        orDefault.f4537b = cVar;
        orDefault.f4536a |= 4;
    }

    /* renamed from: c */
    public final RecyclerView.C1128j.C1131c mo5089c(RecyclerView.C1119a0 a0Var, int i) {
        C1204a l;
        RecyclerView.C1128j.C1131c cVar;
        int e = this.f4533a.mo22410e(a0Var);
        if (e >= 0 && (l = this.f4533a.mo22422l(e)) != null) {
            int i2 = l.f4536a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                l.f4536a = i3;
                if (i == 4) {
                    cVar = l.f4537b;
                } else if (i == 8) {
                    cVar = l.f4538c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4533a.mo22420j(e);
                    l.f4536a = 0;
                    l.f4537b = null;
                    l.f4538c = null;
                    C1204a.f4535d.mo22236a(l);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo5090d(RecyclerView.C1119a0 a0Var) {
        C1204a orDefault = this.f4533a.getOrDefault(a0Var, null);
        if (orDefault != null) {
            orDefault.f4536a &= -2;
        }
    }

    /* renamed from: e */
    public final void mo5091e(RecyclerView.C1119a0 a0Var) {
        int m = this.f4534b.mo22333m() - 1;
        while (true) {
            if (m < 0) {
                break;
            } else if (a0Var == this.f4534b.mo22334o(m)) {
                C6305e<RecyclerView.C1119a0> eVar = this.f4534b;
                Object[] objArr = eVar.f19946d;
                Object obj = objArr[m];
                Object obj2 = C6305e.f19943f;
                if (obj != obj2) {
                    objArr[m] = obj2;
                    eVar.f19944b = true;
                }
            } else {
                m--;
            }
        }
        C1204a remove = this.f4533a.remove(a0Var);
        if (remove != null) {
            remove.f4536a = 0;
            remove.f4537b = null;
            remove.f4538c = null;
            C1204a.f4535d.mo22236a(remove);
        }
    }
}
