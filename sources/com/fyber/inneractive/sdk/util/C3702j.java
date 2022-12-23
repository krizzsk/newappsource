package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.j */
public class C3702j<T> {

    /* renamed from: a */
    public final Queue<T> f12882a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public C3703a<T> f12883b;

    /* renamed from: com.fyber.inneractive.sdk.util.j$a */
    public interface C3703a<TT> {
        /* renamed from: a */
        TT mo15265a();
    }

    public C3702j(int i, C3703a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f12882a.offer(aVar.mo15265a());
        }
        this.f12883b = aVar;
    }

    /* renamed from: a */
    public T mo15362a() {
        T poll = this.f12882a.poll();
        if (poll == null) {
            return this.f12883b.mo15265a();
        }
        return poll;
    }
}
