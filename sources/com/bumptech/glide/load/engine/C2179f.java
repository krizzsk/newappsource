package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2185g;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p025b6.C1487b;
import p060d6.C4391g;
import p060d6.C4397l;
import p095g6.C4832a;
import p229r1.C6234d;
import p260t6.C6603h;
import p311x6.C7166e;
import p322y6.C7333a;
import p322y6.C7341d;
import p551hy.C17517b;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.load.engine.f */
public final class C2179f<R> implements DecodeJob.C2160b<R>, C7333a.C7337d {

    /* renamed from: A */
    public static final C2182c f7086A = new C2182c();

    /* renamed from: b */
    public final C2184e f7087b;

    /* renamed from: c */
    public final C7341d.C7342a f7088c;

    /* renamed from: d */
    public final C2185g.C2186a f7089d;

    /* renamed from: e */
    public final C6234d<C2179f<?>> f7090e;

    /* renamed from: f */
    public final C2182c f7091f;

    /* renamed from: g */
    public final C4391g f7092g;

    /* renamed from: h */
    public final C4832a f7093h;

    /* renamed from: i */
    public final C4832a f7094i;

    /* renamed from: j */
    public final C4832a f7095j;

    /* renamed from: k */
    public final C4832a f7096k;

    /* renamed from: l */
    public final AtomicInteger f7097l;

    /* renamed from: m */
    public C1487b f7098m;

    /* renamed from: n */
    public boolean f7099n;

    /* renamed from: o */
    public boolean f7100o;

    /* renamed from: p */
    public boolean f7101p;

    /* renamed from: q */
    public boolean f7102q;

    /* renamed from: r */
    public C4397l<?> f7103r;

    /* renamed from: s */
    public DataSource f7104s;

    /* renamed from: t */
    public boolean f7105t;

    /* renamed from: u */
    public GlideException f7106u;

    /* renamed from: v */
    public boolean f7107v;

    /* renamed from: w */
    public C2185g<?> f7108w;

    /* renamed from: x */
    public DecodeJob<R> f7109x;

    /* renamed from: y */
    public volatile boolean f7110y;

    /* renamed from: z */
    public boolean f7111z;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public class C2180a implements Runnable {

        /* renamed from: b */
        public final C6603h f7112b;

        public C2180a(C6603h hVar) {
            this.f7112b = hVar;
        }

        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f7112b;
            singleRequest.f7197a.mo23560a();
            synchronized (singleRequest.f7198b) {
                synchronized (C2179f.this) {
                    if (C2179f.this.f7087b.f7118b.contains(new C2183d(this.f7112b, C7166e.f22252b))) {
                        C2179f fVar = C2179f.this;
                        C6603h hVar = this.f7112b;
                        fVar.getClass();
                        try {
                            ((SingleRequest) hVar).mo11036k(fVar.f7106u, 5);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    C2179f.this.mo10969c();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public class C2181b implements Runnable {

        /* renamed from: b */
        public final C6603h f7114b;

        public C2181b(C6603h hVar) {
            this.f7114b = hVar;
        }

        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f7114b;
            singleRequest.f7197a.mo23560a();
            synchronized (singleRequest.f7198b) {
                synchronized (C2179f.this) {
                    if (C2179f.this.f7087b.f7118b.contains(new C2183d(this.f7114b, C7166e.f22252b))) {
                        C2179f.this.f7108w.mo10981c();
                        C2179f fVar = C2179f.this;
                        C6603h hVar = this.f7114b;
                        fVar.getClass();
                        try {
                            ((SingleRequest) hVar).mo11037l(fVar.f7108w, fVar.f7104s, fVar.f7111z);
                            C2179f.this.mo10973h(this.f7114b);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    C2179f.this.mo10969c();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class C2182c {
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public static final class C2183d {

        /* renamed from: a */
        public final C6603h f7116a;

        /* renamed from: b */
        public final Executor f7117b;

        public C2183d(C6603h hVar, Executor executor) {
            this.f7116a = hVar;
            this.f7117b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C2183d) {
                return this.f7116a.equals(((C2183d) obj).f7116a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f7116a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$e */
    public static final class C2184e implements Iterable<C2183d> {

        /* renamed from: b */
        public final List<C2183d> f7118b;

        public C2184e(ArrayList arrayList) {
            this.f7118b = arrayList;
        }

        public final Iterator<C2183d> iterator() {
            return this.f7118b.iterator();
        }
    }

    public C2179f() {
        throw null;
    }

    public C2179f(C4832a aVar, C4832a aVar2, C4832a aVar3, C4832a aVar4, C4391g gVar, C2185g.C2186a aVar5, C7333a.C7336c cVar) {
        C2182c cVar2 = f7086A;
        this.f7087b = new C2184e(new ArrayList(2));
        this.f7088c = new C7341d.C7342a();
        this.f7097l = new AtomicInteger();
        this.f7093h = aVar;
        this.f7094i = aVar2;
        this.f7095j = aVar3;
        this.f7096k = aVar4;
        this.f7092g = gVar;
        this.f7089d = aVar5;
        this.f7090e = cVar;
        this.f7091f = cVar2;
    }

    /* renamed from: a */
    public final synchronized void mo10967a(C6603h hVar, Executor executor) {
        this.f7088c.mo23560a();
        this.f7087b.f7118b.add(new C2183d(hVar, executor));
        boolean z = true;
        if (this.f7105t) {
            mo10970d(1);
            executor.execute(new C2181b(hVar));
        } else if (this.f7107v) {
            mo10970d(1);
            executor.execute(new C2180a(hVar));
        } else {
            if (this.f7110y) {
                z = false;
            }
            C17885a.m44452o("Cannot add callbacks to a cancelled EngineJob", z);
        }
    }

    /* renamed from: b */
    public final void mo10968b() {
        Object obj;
        if (!mo10971e()) {
            this.f7110y = true;
            DecodeJob<R> decodeJob = this.f7109x;
            decodeJob.f6984E = true;
            C2169c cVar = decodeJob.f6982C;
            if (cVar != null) {
                cVar.cancel();
            }
            C4391g gVar = this.f7092g;
            C1487b bVar = this.f7098m;
            C2172e eVar = (C2172e) gVar;
            synchronized (eVar) {
                C17517b bVar2 = eVar.f7061a;
                bVar2.getClass();
                if (this.f7102q) {
                    obj = bVar2.f45096d;
                } else {
                    obj = bVar2.f45095c;
                }
                Map map = (Map) obj;
                if (equals(map.get(bVar))) {
                    map.remove(bVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo10969c() {
        boolean z;
        C2185g<?> gVar;
        synchronized (this) {
            this.f7088c.mo23560a();
            C17885a.m44452o("Not yet complete!", mo10971e());
            int decrementAndGet = this.f7097l.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            C17885a.m44452o("Can't decrement below 0", z);
            if (decrementAndGet == 0) {
                gVar = this.f7108w;
                mo10972g();
            } else {
                gVar = null;
            }
        }
        if (gVar != null) {
            gVar.mo10982d();
        }
    }

    /* renamed from: d */
    public final synchronized void mo10970d(int i) {
        C2185g<?> gVar;
        C17885a.m44452o("Not yet complete!", mo10971e());
        if (this.f7097l.getAndAdd(i) == 0 && (gVar = this.f7108w) != null) {
            gVar.mo10981c();
        }
    }

    /* renamed from: e */
    public final boolean mo10971e() {
        return this.f7107v || this.f7105t || this.f7110y;
    }

    /* renamed from: f */
    public final C7341d.C7342a mo10927f() {
        return this.f7088c;
    }

    /* renamed from: g */
    public final synchronized void mo10972g() {
        boolean a;
        if (this.f7098m != null) {
            this.f7087b.f7118b.clear();
            this.f7098m = null;
            this.f7108w = null;
            this.f7103r = null;
            this.f7107v = false;
            this.f7110y = false;
            this.f7105t = false;
            this.f7111z = false;
            DecodeJob<R> decodeJob = this.f7109x;
            DecodeJob.C2164f fVar = decodeJob.f6992h;
            synchronized (fVar) {
                fVar.f7019a = true;
                a = fVar.mo10939a();
            }
            if (a) {
                decodeJob.mo10934m();
            }
            this.f7109x = null;
            this.f7106u = null;
            this.f7104s = null;
            this.f7090e.mo22236a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    public final synchronized void mo10973h(C6603h hVar) {
        boolean z;
        this.f7088c.mo23560a();
        this.f7087b.f7118b.remove(new C2183d(hVar, C7166e.f22252b));
        if (this.f7087b.f7118b.isEmpty()) {
            mo10968b();
            if (!this.f7105t) {
                if (!this.f7107v) {
                    z = false;
                    if (z && this.f7097l.get() == 0) {
                        mo10972g();
                    }
                }
            }
            z = true;
            mo10972g();
        }
    }
}
