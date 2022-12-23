package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C2647h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.util.C3707l;

/* renamed from: com.fyber.inneractive.sdk.player.a */
public class C2945a {

    /* renamed from: a */
    public C2807y f10078a;

    /* renamed from: b */
    public C2946a f10079b;

    /* renamed from: com.fyber.inneractive.sdk.player.a$a */
    public interface C2946a {
    }

    public C2945a(C2807y yVar) {
        this.f10078a = yVar;
    }

    /* renamed from: a */
    public C2946a mo13735a() throws Throwable {
        C2619a0 a0Var;
        UnitDisplayType unitDisplayType;
        if (this.f10079b == null) {
            Application application = C3707l.f12893a;
            C2807y yVar = this.f10078a;
            C3650g gVar = (C3650g) yVar.f9591b;
            C2703z zVar = yVar.f9593d;
            InneractiveAdRequest inneractiveAdRequest = yVar.f9590a;
            C2816a aVar = null;
            if (zVar != null && ((C2647h) yVar.f9592c.mo13264a(C2647h.class)).mo13244c() && (a0Var = ((C2702y) this.f10078a.f9593d).f9427f) != null && ((unitDisplayType = a0Var.f9256j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                aVar = IAConfigManager.f9202J.f9212I;
            }
            this.f10079b = new C3423f(application, gVar, zVar, inneractiveAdRequest, yVar, aVar);
        }
        return this.f10079b;
    }
}
