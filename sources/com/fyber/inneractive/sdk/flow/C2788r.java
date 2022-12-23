package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.C3741w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.flow.r */
public class C2788r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f9630a;

    /* renamed from: b */
    public final /* synthetic */ C2790s f9631b;

    /* renamed from: com.fyber.inneractive.sdk.flow.r$a */
    public class C2789a implements Runnable {
        public C2789a() {
        }

        public void run() {
            C2790s sVar = C2788r.this.f9631b;
            sVar.mo13577e(!sVar.f9642t);
            C2788r.this.f9631b.f9636n = null;
        }
    }

    public C2788r(C2790s sVar, long j) {
        this.f9631b = sVar;
        this.f9630a = j;
    }

    public void run() {
        if (this.f9631b.mo13345E()) {
            C2790s sVar = this.f9631b;
            sVar.f9636n = new C2789a();
            long a = sVar.mo13350a(this.f9630a);
            C2790s sVar2 = this.f9631b;
            sVar2.getClass();
            C3741w0 w0Var = new C3741w0(TimeUnit.MILLISECONDS, a);
            sVar2.f9637o = w0Var;
            w0Var.f12943e = new C2793t(sVar2);
            w0Var.mo15392c();
            C2790s sVar3 = this.f9631b;
            sVar3.getClass();
            IAlog.m9902a("%sad contains custom close. Will show transparent x in %d", IAlog.m9899a((Object) sVar3), Long.valueOf(a));
            this.f9631b.f9634l = null;
            return;
        }
        C2790s sVar4 = this.f9631b;
        sVar4.getClass();
        IAlog.m9902a("%sad does not contain custom close. Showing close button", IAlog.m9899a((Object) sVar4));
        this.f9631b.mo13577e(false);
    }
}
