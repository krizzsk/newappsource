package com.vungle.warren;

import com.vungle.warren.AdConfig;
import com.vungle.warren.persistence.C23192a;
import od0.C24566m;

/* renamed from: com.vungle.warren.d */
public final class C23109d implements C23192a.C23206m<C24566m> {

    /* renamed from: a */
    public final /* synthetic */ AdConfig.AdSize f58660a;

    /* renamed from: b */
    public final /* synthetic */ C23097c f58661b;

    public C23109d(C23097c cVar, AdConfig.AdSize adSize) {
        this.f58661b = cVar;
        this.f58660a = adSize;
    }

    /* renamed from: a */
    public final void mo58063a(Object obj) {
        AdConfig.AdSize adSize;
        C24566m mVar = (C24566m) obj;
        if (mVar != null && mVar.mo60833c() && mVar.f62265i == 1 && mVar.mo60831a() != (adSize = this.f58660a)) {
            mVar.f62266j = adSize;
            this.f58661b.f58620f.mo58289x(mVar, (C23192a.C23207n) null, false);
        }
    }
}
