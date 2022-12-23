package p332z4;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p120i5.C5280a;
import p120i5.C5282c;
import p584jl.C17885a;

/* renamed from: z4.a */
public abstract class C7456a<K, A> {

    /* renamed from: a */
    public final ArrayList f22877a = new ArrayList(1);

    /* renamed from: b */
    public boolean f22878b = false;

    /* renamed from: c */
    public final C7459c<K> f22879c;

    /* renamed from: d */
    public float f22880d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: e */
    public C5282c f22881e;

    /* renamed from: f */
    public A f22882f = null;

    /* renamed from: g */
    public float f22883g = -1.0f;

    /* renamed from: h */
    public float f22884h = -1.0f;

    /* renamed from: z4.a$a */
    public interface C7457a {
        /* renamed from: a */
        void mo6803a();
    }

    /* renamed from: z4.a$b */
    public static final class C7458b<T> implements C7459c<T> {
        /* renamed from: a */
        public final boolean mo23723a(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: b */
        public final C5280a<T> mo23724b() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: c */
        public final boolean mo23725c(float f) {
            return false;
        }

        /* renamed from: d */
        public final float mo23726d() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: e */
        public final float mo23727e() {
            return 1.0f;
        }

        public final boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: z4.a$c */
    public interface C7459c<T> {
        /* renamed from: a */
        boolean mo23723a(float f);

        /* renamed from: b */
        C5280a<T> mo23724b();

        /* renamed from: c */
        boolean mo23725c(float f);

        /* renamed from: d */
        float mo23726d();

        /* renamed from: e */
        float mo23727e();

        boolean isEmpty();
    }

    /* renamed from: z4.a$d */
    public static final class C7460d<T> implements C7459c<T> {

        /* renamed from: a */
        public final List<? extends C5280a<T>> f22885a;

        /* renamed from: b */
        public C5280a<T> f22886b;

        /* renamed from: c */
        public C5280a<T> f22887c = null;

        /* renamed from: d */
        public float f22888d = -1.0f;

        public C7460d(List<? extends C5280a<T>> list) {
            this.f22885a = list;
            this.f22886b = mo23729f(BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: a */
        public final boolean mo23723a(float f) {
            C5280a<T> aVar = this.f22887c;
            C5280a<T> aVar2 = this.f22886b;
            if (aVar == aVar2 && this.f22888d == f) {
                return true;
            }
            this.f22887c = aVar2;
            this.f22888d = f;
            return false;
        }

        /* renamed from: b */
        public final C5280a<T> mo23724b() {
            return this.f22886b;
        }

        /* renamed from: c */
        public final boolean mo23725c(float f) {
            boolean z;
            C5280a<T> aVar = this.f22886b;
            if (f < aVar.mo21081b() || f >= aVar.mo21080a()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return !this.f22886b.mo21082c();
            }
            this.f22886b = mo23729f(f);
            return true;
        }

        /* renamed from: d */
        public final float mo23726d() {
            return ((C5280a) this.f22885a.get(0)).mo21081b();
        }

        /* renamed from: e */
        public final float mo23727e() {
            List<? extends C5280a<T>> list = this.f22885a;
            return ((C5280a) list.get(list.size() - 1)).mo21080a();
        }

        /* renamed from: f */
        public final C5280a<T> mo23729f(float f) {
            List<? extends C5280a<T>> list = this.f22885a;
            C5280a<T> aVar = (C5280a) list.get(list.size() - 1);
            if (f >= aVar.mo21081b()) {
                return aVar;
            }
            int size = this.f22885a.size() - 2;
            while (true) {
                boolean z = false;
                if (size < 1) {
                    return (C5280a) this.f22885a.get(0);
                }
                C5280a<T> aVar2 = (C5280a) this.f22885a.get(size);
                if (this.f22886b != aVar2) {
                    if (f >= aVar2.mo21081b() && f < aVar2.mo21080a()) {
                        z = true;
                    }
                    if (z) {
                        return aVar2;
                    }
                }
                size--;
            }
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: z4.a$e */
    public static final class C7461e<T> implements C7459c<T> {

        /* renamed from: a */
        public final C5280a<T> f22889a;

        /* renamed from: b */
        public float f22890b = -1.0f;

        public C7461e(List<? extends C5280a<T>> list) {
            this.f22889a = (C5280a) list.get(0);
        }

        /* renamed from: a */
        public final boolean mo23723a(float f) {
            if (this.f22890b == f) {
                return true;
            }
            this.f22890b = f;
            return false;
        }

        /* renamed from: b */
        public final C5280a<T> mo23724b() {
            return this.f22889a;
        }

        /* renamed from: c */
        public final boolean mo23725c(float f) {
            return !this.f22889a.mo21082c();
        }

        /* renamed from: d */
        public final float mo23726d() {
            return this.f22889a.mo21081b();
        }

        /* renamed from: e */
        public final float mo23727e() {
            return this.f22889a.mo21080a();
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public C7456a(List<? extends C5280a<K>> list) {
        C7459c<K> cVar;
        C7459c<K> cVar2;
        if (list.isEmpty()) {
            cVar = new C7458b<>();
        } else {
            if (list.size() == 1) {
                cVar2 = new C7461e<>(list);
            } else {
                cVar2 = new C7460d<>(list);
            }
            cVar = cVar2;
        }
        this.f22879c = cVar;
    }

    /* renamed from: a */
    public final void mo23712a(C7457a aVar) {
        this.f22877a.add(aVar);
    }

    /* renamed from: b */
    public final C5280a<K> mo23713b() {
        C5280a<K> b = this.f22879c.mo23724b();
        C17885a.m44412M();
        return b;
    }

    /* renamed from: c */
    public float mo23714c() {
        if (this.f22884h == -1.0f) {
            this.f22884h = this.f22879c.mo23727e();
        }
        return this.f22884h;
    }

    /* renamed from: d */
    public final float mo23715d() {
        C5280a b = mo23713b();
        if (b.mo21082c()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return b.f17434d.getInterpolation(mo23716e());
    }

    /* renamed from: e */
    public final float mo23716e() {
        if (this.f22878b) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        C5280a b = mo23713b();
        if (b.mo21082c()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (this.f22880d - b.mo21081b()) / (b.mo21080a() - b.mo21081b());
    }

    /* renamed from: f */
    public A mo23717f() {
        A a;
        float e = mo23716e();
        if (this.f22881e == null && this.f22879c.mo23723a(e)) {
            return this.f22882f;
        }
        C5280a b = mo23713b();
        Interpolator interpolator = b.f17435e;
        if (interpolator == null || b.f17436f == null) {
            a = mo23718g(b, mo23715d());
        } else {
            a = mo23719h(b, e, interpolator.getInterpolation(e), b.f17436f.getInterpolation(e));
        }
        this.f22882f = a;
        return a;
    }

    /* renamed from: g */
    public abstract A mo23718g(C5280a<K> aVar, float f);

    /* renamed from: h */
    public A mo23719h(C5280a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: i */
    public void mo23720i() {
        for (int i = 0; i < this.f22877a.size(); i++) {
            ((C7457a) this.f22877a.get(i)).mo6803a();
        }
    }

    /* renamed from: j */
    public void mo23721j(float f) {
        if (!this.f22879c.isEmpty()) {
            if (this.f22883g == -1.0f) {
                this.f22883g = this.f22879c.mo23726d();
            }
            float f2 = this.f22883g;
            if (f < f2) {
                if (f2 == -1.0f) {
                    this.f22883g = this.f22879c.mo23726d();
                }
                f = this.f22883g;
            } else if (f > mo23714c()) {
                f = mo23714c();
            }
            if (f != this.f22880d) {
                this.f22880d = f;
                if (this.f22879c.mo23725c(f)) {
                    mo23720i();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo23722k(C5282c cVar) {
        C5282c cVar2 = this.f22881e;
        if (cVar2 != null) {
            cVar2.f17451c = null;
        }
        this.f22881e = cVar;
        if (cVar != null) {
            cVar.f17451c = this;
        }
    }
}
