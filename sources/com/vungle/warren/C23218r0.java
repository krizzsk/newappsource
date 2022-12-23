package com.vungle.warren;

import com.vungle.warren.C23236v0;
import com.vungle.warren.downloader.C23126g;
import java.util.concurrent.TimeUnit;
import p559ii.C17601a;
import td0.C24927a;

/* renamed from: com.vungle.warren.r0 */
public final class C23218r0 extends C23236v0.C23239c {

    /* renamed from: a */
    public final /* synthetic */ C23236v0 f58926a;

    public C23218r0(C23236v0 v0Var) {
        this.f58926a = v0Var;
    }

    /* renamed from: a */
    public final Object mo58092a() {
        C24927a aVar = (C24927a) this.f58926a.mo58349b(C24927a.class);
        return new C23126g(aVar, new C17601a(aVar), new C23229u(aVar, (C23171k0) this.f58926a.mo58349b(C23171k0.class)), TimeUnit.DAYS.toMillis(90));
    }
}
