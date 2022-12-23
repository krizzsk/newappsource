package p277ub;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p277ub.C6780f;
import p277ub.C6809w;

/* renamed from: ub.k */
public final class C6786k<T> {

    /* renamed from: a */
    public final C6773a f20990a;

    /* renamed from: b */
    public final C6782g f20991b;

    /* renamed from: c */
    public final C6788b<T> f20992c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<C6789c<T>> f20993d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f20994e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f20995f;

    /* renamed from: g */
    public boolean f20996g;

    /* renamed from: ub.k$a */
    public interface C6787a<T> {
        void invoke(T t);
    }

    /* renamed from: ub.k$b */
    public interface C6788b<T> {
        /* renamed from: a */
        void mo6655a(T t, C6780f fVar);
    }

    /* renamed from: ub.k$c */
    public static final class C6789c<T> {

        /* renamed from: a */
        public final T f20997a;

        /* renamed from: b */
        public C6780f.C6781a f20998b = new C6780f.C6781a();

        /* renamed from: c */
        public boolean f20999c;

        /* renamed from: d */
        public boolean f21000d;

        public C6789c(T t) {
            this.f20997a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6789c.class != obj.getClass()) {
                return false;
            }
            return this.f20997a.equals(((C6789c) obj).f20997a);
        }

        public final int hashCode() {
            return this.f20997a.hashCode();
        }
    }

    public C6786k(Looper looper, C6808v vVar, C6788b bVar) {
        this(new CopyOnWriteArraySet(), looper, vVar, bVar);
    }

    /* renamed from: a */
    public final void mo22958a() {
        if (!this.f20995f.isEmpty()) {
            if (!((C6809w) this.f20991b).f21063a.hasMessages(0)) {
                C6809w wVar = (C6809w) this.f20991b;
                wVar.getClass();
                C6809w.C6810a b = C6809w.m16064b();
                b.f21064a = wVar.f21063a.obtainMessage(0);
                b.mo23023a();
            }
            boolean z = !this.f20994e.isEmpty();
            this.f20994e.addAll(this.f20995f);
            this.f20995f.clear();
            if (!z) {
                while (!this.f20994e.isEmpty()) {
                    this.f20994e.peekFirst().run();
                    this.f20994e.removeFirst();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo22959b(int i, C6787a<T> aVar) {
        this.f20995f.add(new C6785j(new CopyOnWriteArraySet(this.f20993d), i, aVar));
    }

    /* renamed from: c */
    public final void mo22960c() {
        Iterator<C6789c<T>> it = this.f20993d.iterator();
        while (it.hasNext()) {
            C6789c next = it.next();
            C6788b<T> bVar = this.f20992c;
            next.f21000d = true;
            if (next.f20999c) {
                bVar.mo6655a(next.f20997a, next.f20998b.mo22954b());
            }
        }
        this.f20993d.clear();
        this.f20996g = true;
    }

    public C6786k(CopyOnWriteArraySet<C6789c<T>> copyOnWriteArraySet, Looper looper, C6773a aVar, C6788b<T> bVar) {
        this.f20990a = aVar;
        this.f20993d = copyOnWriteArraySet;
        this.f20992c = bVar;
        this.f20994e = new ArrayDeque<>();
        this.f20995f = new ArrayDeque<>();
        this.f20991b = aVar.mo22943b(looper, new C6784i(this));
    }
}
