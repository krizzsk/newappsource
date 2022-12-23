package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3741w0;

/* renamed from: com.fyber.inneractive.sdk.flow.t */
public class C2793t implements C3741w0.C3743b {

    /* renamed from: a */
    public final /* synthetic */ C2790s f9647a;

    public C2793t(C2790s sVar) {
        this.f9647a = sVar;
    }

    /* renamed from: a */
    public void mo13200a(C3741w0 w0Var) {
        Runnable runnable = this.f9647a.f9636n;
        if (runnable != null) {
            C3714n.f12902b.post(runnable);
        }
        C2790s sVar = this.f9647a;
        C3741w0 w0Var2 = sVar.f9637o;
        if (w0Var2 != null) {
            w0Var2.f12943e = null;
            sVar.f9637o = null;
        }
    }
}
