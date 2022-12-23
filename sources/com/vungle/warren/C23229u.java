package com.vungle.warren;

import td0.C24927a;

/* renamed from: com.vungle.warren.u */
public final class C23229u {

    /* renamed from: a */
    public C24927a f58951a;

    /* renamed from: b */
    public C23171k0 f58952b;

    public C23229u(C24927a aVar, C23171k0 k0Var) {
        this.f58951a = aVar;
        this.f58952b = k0Var;
    }

    /* renamed from: a */
    public final long mo58321a() {
        C23248w1 w1Var = this.f58952b.f58821c.get();
        if (w1Var == null) {
            return 0;
        }
        long b = this.f58951a.mo61482b(1) / 2;
        long j = w1Var.f59002c;
        long max = Math.max(0, w1Var.f59001b - b);
        float min = (float) Math.min(j, b);
        return Math.max(0, ((long) (min - (0.1f * min))) - max);
    }
}
