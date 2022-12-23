package d40;

import ce0.C21100e;
import d40.C4343a;
import d40.C4347c;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

/* renamed from: d40.l */
public final class C4366l<T extends C4347c> {

    /* renamed from: d */
    public static final C4368b f15360d = new C4368b();

    /* renamed from: e */
    public static final C4367a f15361e = new C4367a(C4343a.f15311g);

    /* renamed from: a */
    public int f15362a;

    /* renamed from: b */
    public final ArrayList<T> f15363b;

    /* renamed from: c */
    public int f15364c;

    /* renamed from: d40.l$a */
    public static class C4367a<T extends C4347c> extends C19620t<C4366l<T>> {

        /* renamed from: v */
        public final C19589j<T> f15365v;

        public C4367a(C4343a.C4345b bVar) {
            super(C4366l.class);
            C21100e.m49373x(bVar, "pathStateReader");
            this.f15365v = bVar;
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            int i2;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = pVar.mo51924l();
            }
            return new C4366l(i2, pVar.mo51959g(this.f15365v), pVar.mo51924l());
        }
    }

    /* renamed from: d40.l$b */
    public static class C4368b<T extends C4347c> extends C19621u<C4366l<T>> {

        /* renamed from: v */
        public final C19600l<T> f15366v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4368b() {
            super(1);
            C4343a.C4344a aVar = C4343a.f15310f;
            this.f15366v = aVar;
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            C4366l lVar = (C4366l) obj;
            qVar.mo51939l(lVar.f15362a);
            qVar.mo51965h(lVar.f15363b, this.f15366v);
            qVar.mo51939l(lVar.f15364c);
        }
    }

    static {
        C4343a.C4344a aVar = C4343a.f15310f;
    }

    public C4366l() {
        this.f15363b = new ArrayList<>();
    }

    public C4366l(int i, ArrayList<T> arrayList, int i2) {
        if (arrayList != null) {
            this.f15362a = i;
            this.f15363b = arrayList;
            this.f15364c = i2;
            return;
        }
        throw new IllegalArgumentException("pathStates may not be null");
    }
}
