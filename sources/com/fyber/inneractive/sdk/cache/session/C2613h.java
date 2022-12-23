package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.cache.session.h */
public class C2613h extends PriorityQueue<C2606e> {

    /* renamed from: a */
    public int f9201a;

    public C2613h(int i) {
        super(1, new C2614i());
        this.f9201a = i;
    }

    /* renamed from: a */
    public boolean add(C2606e eVar) {
        boolean add = super.add(eVar);
        if (super.size() > this.f9201a) {
            poll();
        }
        return add;
    }

    public int size() {
        return super.size();
    }
}
