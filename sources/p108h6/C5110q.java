package p108h6;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p025b6.C1487b;
import p025b6.C1492e;
import p108h6.C5104n;
import p229r1.C6234d;
import p584jl.C17885a;

/* renamed from: h6.q */
public final class C5110q<Model, Data> implements C5104n<Model, Data> {

    /* renamed from: a */
    public final List<C5104n<Model, Data>> f17111a;

    /* renamed from: b */
    public final C6234d<List<Throwable>> f17112b;

    /* renamed from: h6.q$a */
    public static class C5111a<Data> implements C2142d<Data>, C2142d.C2143a<Data> {

        /* renamed from: b */
        public final List<C2142d<Data>> f17113b;

        /* renamed from: c */
        public final C6234d<List<Throwable>> f17114c;

        /* renamed from: d */
        public int f17115d;

        /* renamed from: e */
        public Priority f17116e;

        /* renamed from: f */
        public C2142d.C2143a<? super Data> f17117f;

        /* renamed from: g */
        public List<Throwable> f17118g;

        /* renamed from: h */
        public boolean f17119h;

        public C5111a(ArrayList arrayList, C6234d dVar) {
            this.f17114c = dVar;
            if (!arrayList.isEmpty()) {
                this.f17113b = arrayList;
                this.f17115d = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        /* renamed from: a */
        public final Class<Data> mo6607a() {
            return this.f17113b.get(0).mo6607a();
        }

        /* renamed from: b */
        public final void mo6608b() {
            List<Throwable> list = this.f17118g;
            if (list != null) {
                this.f17114c.mo22236a(list);
            }
            this.f17118g = null;
            for (C2142d<Data> b : this.f17113b) {
                b.mo6608b();
            }
        }

        /* renamed from: c */
        public final void mo10913c(Exception exc) {
            List<Throwable> list = this.f17118g;
            C17885a.m44458r(list);
            list.add(exc);
            mo20842g();
        }

        public final void cancel() {
            this.f17119h = true;
            for (C2142d<Data> cancel : this.f17113b) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public final DataSource mo6610d() {
            return this.f17113b.get(0).mo6610d();
        }

        /* renamed from: e */
        public final void mo6611e(Priority priority, C2142d.C2143a<? super Data> aVar) {
            this.f17116e = priority;
            this.f17117f = aVar;
            this.f17118g = this.f17114c.mo22237b();
            this.f17113b.get(this.f17115d).mo6611e(priority, this);
            if (this.f17119h) {
                cancel();
            }
        }

        /* renamed from: f */
        public final void mo10914f(Data data) {
            if (data != null) {
                this.f17117f.mo10914f(data);
            } else {
                mo20842g();
            }
        }

        /* renamed from: g */
        public final void mo20842g() {
            if (!this.f17119h) {
                if (this.f17115d < this.f17113b.size() - 1) {
                    this.f17115d++;
                    mo6611e(this.f17116e, this.f17117f);
                    return;
                }
                C17885a.m44458r(this.f17118g);
                this.f17117f.mo10913c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f17118g)));
            }
        }
    }

    public C5110q(ArrayList arrayList, C6234d dVar) {
        this.f17111a = arrayList;
        this.f17112b = dVar;
    }

    /* renamed from: a */
    public final boolean mo20815a(Model model) {
        for (C5104n<Model, Data> a : this.f17111a) {
            if (a.mo20815a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C5104n.C5105a<Data> mo20816b(Model model, int i, int i2, C1492e eVar) {
        C5104n.C5105a b;
        int size = this.f17111a.size();
        ArrayList arrayList = new ArrayList(size);
        C1487b bVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C5104n nVar = this.f17111a.get(i3);
            if (nVar.mo20815a(model) && (b = nVar.mo20816b(model, i, i2, eVar)) != null) {
                bVar = b.f17104a;
                arrayList.add(b.f17106c);
            }
        }
        if (arrayList.isEmpty() || bVar == null) {
            return null;
        }
        return new C5104n.C5105a<>(bVar, new C5111a(arrayList, this.f17112b));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MultiModelLoader{modelLoaders=");
        k.append(Arrays.toString(this.f17111a.toArray()));
        k.append('}');
        return k.toString();
    }
}
