package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import com.fyber.inneractive.sdk.config.C2668i;
import com.fyber.inneractive.sdk.network.C2891c;

/* renamed from: com.fyber.inneractive.sdk.config.l */
public class C2676l implements C2668i.C2670b {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f9349a;

    public C2676l(IAConfigManager iAConfigManager) {
        this.f9349a = iAConfigManager;
    }

    public void onGlobalConfigChanged(C2668i iVar, C2667h hVar) {
        this.f9349a.f9209F.mo13172a();
        C2891c cVar = this.f9349a.f9210G;
        cVar.getClass();
        int i = 30;
        int a = IAConfigManager.f9202J.f9234v.f9337b.mo13271a("send_events_batch_interval", 30, -1);
        if (a >= 0) {
            i = a;
        }
        cVar.f9881f = true;
        cVar.f9880e = i;
        Handler handler = cVar.f9879d;
        if (handler != null && handler.hasMessages(12312329)) {
            cVar.f9879d.removeMessages(12312329);
        }
        cVar.mo13682a(12312329, (long) (cVar.f9880e * 1000));
    }
}
