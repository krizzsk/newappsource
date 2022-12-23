package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C2900f0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.cache.g */
public class C2598g {

    /* renamed from: a */
    public long f9162a;

    /* renamed from: b */
    public String f9163b;

    /* renamed from: c */
    public String f9164c;

    /* renamed from: d */
    public String f9165d;

    /* renamed from: a */
    public void mo13172a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f9162a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.f9202J;
            if (iAConfigManager.f9234v.f9337b.mo13273a("use_js_inline", false)) {
                Application application = C3707l.f12893a;
                if (application == null) {
                    IAlog.m9906e("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f9162a = System.currentTimeMillis();
                C2900f0 f0Var = new C2900f0(new C2595d(this), application, new C2594c("https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js", "MRAID-VIDEO.js"));
                iAConfigManager.f9232t.f10064a.offer(f0Var);
                C2916m0 m0Var = C2916m0.QUEUED;
                f0Var.mo13666a(m0Var);
                C2900f0 f0Var2 = new C2900f0(new C2596e(this), application, new C2594c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css"));
                iAConfigManager.f9232t.f10064a.offer(f0Var2);
                f0Var2.mo13666a(m0Var);
                C2900f0 f0Var3 = new C2900f0(new C2597f(this), application, new C2594c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js"));
                iAConfigManager.f9232t.f10064a.offer(f0Var3);
                f0Var3.mo13666a(m0Var);
            }
        }
    }
}
