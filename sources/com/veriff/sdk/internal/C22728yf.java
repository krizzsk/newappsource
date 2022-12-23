package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22750yr;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.yf */
public final class C22728yf {

    /* renamed from: a */
    public static final /* synthetic */ boolean f57501a = true;

    /* renamed from: b */
    private int f57502b = 64;

    /* renamed from: c */
    private int f57503c = 5;

    /* renamed from: e */
    private ExecutorService f57504e;

    /* renamed from: f */
    private final Deque<C22750yr.C22751a> f57505f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C22750yr.C22751a> f57506g = new ArrayDeque();

    /* renamed from: h */
    private final Deque<C22750yr> f57507h = new ArrayDeque();

    /* renamed from: c */
    private boolean m55506c() {
        int i;
        boolean z;
        if (f57501a || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<C22750yr.C22751a> it = this.f57505f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C22750yr.C22751a next = it.next();
                    if (this.f57506g.size() >= this.f57502b) {
                        break;
                    } else if (next.mo57385a().get() < this.f57503c) {
                        it.remove();
                        next.mo57385a().incrementAndGet();
                        arrayList.add(next);
                        this.f57506g.add(next);
                    }
                }
                if (mo57230b() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((C22750yr.C22751a) arrayList.get(i)).mo57387a(mo57227a());
            }
            return z;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public synchronized ExecutorService mo57227a() {
        if (this.f57504e == null) {
            this.f57504e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C22766za.m55831a("OkHttp Dispatcher", false));
        }
        return this.f57504e;
    }

    /* renamed from: b */
    public void mo57231b(C22750yr.C22751a aVar) {
        aVar.mo57385a().decrementAndGet();
        m55505a(this.f57506g, aVar);
    }

    /* renamed from: b */
    public void mo57232b(C22750yr yrVar) {
        m55505a(this.f57507h, yrVar);
    }

    /* renamed from: b */
    public synchronized int mo57230b() {
        return this.f57506g.size() + this.f57507h.size();
    }

    /* renamed from: a */
    public void mo57228a(C22750yr.C22751a aVar) {
        C22750yr.C22751a a;
        synchronized (this) {
            this.f57505f.add(aVar);
            if (!aVar.mo57389c().f57627c && (a = m55504a(aVar.mo57388b())) != null) {
                aVar.mo57386a(a);
            }
        }
        m55506c();
    }

    /* renamed from: a */
    private C22750yr.C22751a m55504a(String str) {
        for (C22750yr.C22751a next : this.f57506g) {
            if (next.mo57388b().equals(str)) {
                return next;
            }
        }
        for (C22750yr.C22751a next2 : this.f57505f) {
            if (next2.mo57388b().equals(str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void mo57229a(C22750yr yrVar) {
        this.f57507h.add(yrVar);
    }

    /* renamed from: a */
    private <T> void m55505a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m55506c();
    }
}
