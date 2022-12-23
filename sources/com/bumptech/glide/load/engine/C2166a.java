package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.C2185g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p025b6.C1487b;
import p060d6.C4379a;
import p060d6.C4381b;
import p060d6.C4397l;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.load.engine.a */
public final class C2166a {

    /* renamed from: a */
    public final boolean f7025a = false;

    /* renamed from: b */
    public final Executor f7026b;

    /* renamed from: c */
    public final HashMap f7027c = new HashMap();

    /* renamed from: d */
    public final ReferenceQueue<C2185g<?>> f7028d = new ReferenceQueue<>();

    /* renamed from: e */
    public C2185g.C2186a f7029e;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public static final class C2167a extends WeakReference<C2185g<?>> {

        /* renamed from: a */
        public final C1487b f7030a;

        /* renamed from: b */
        public final boolean f7031b;

        /* renamed from: c */
        public C4397l<?> f7032c;

        public C2167a(C1487b bVar, C2185g<?> gVar, ReferenceQueue<? super C2185g<?>> referenceQueue, boolean z) {
            super(gVar, referenceQueue);
            C4397l<Z> lVar;
            C17885a.m44458r(bVar);
            this.f7030a = bVar;
            if (!gVar.f7119b || !z) {
                lVar = null;
            } else {
                lVar = gVar.f7121d;
                C17885a.m44458r(lVar);
            }
            this.f7032c = lVar;
            this.f7031b = gVar.f7119b;
        }
    }

    public C2166a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C4379a());
        this.f7026b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new C4381b(this));
    }

    /* renamed from: a */
    public final synchronized void mo10951a(C1487b bVar, C2185g<?> gVar) {
        C2167a aVar = (C2167a) this.f7027c.put(bVar, new C2167a(bVar, gVar, this.f7028d, this.f7025a));
        if (aVar != null) {
            aVar.f7032c = null;
            aVar.clear();
        }
    }

    /* renamed from: b */
    public final void mo10952b(C2167a aVar) {
        synchronized (this) {
            this.f7027c.remove(aVar.f7030a);
            if (aVar.f7031b) {
                C4397l<?> lVar = aVar.f7032c;
                if (lVar != null) {
                    this.f7029e.mo10961a(aVar.f7030a, new C2185g(lVar, true, false, aVar.f7030a, this.f7029e));
                }
            }
        }
    }
}
