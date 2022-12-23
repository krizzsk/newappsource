package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2630e;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.util.C3692g0;
import com.fyber.inneractive.sdk.util.C3707l;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.response.c */
public class C3646c extends C3645b {
    /* renamed from: a */
    public void mo13324a(String str, C2702y yVar) throws IOException {
        String str2;
        C3649f fVar = (C3649f) this.f12732a;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C3692g0.f12868g.mo15355a(str);
        }
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String c = C3707l.m9969c(property);
            if (!TextUtils.isEmpty(c)) {
                str2 = c;
            }
        }
        fVar.f12769B = str2;
    }

    /* renamed from: b */
    public boolean mo13325b() {
        return true;
    }

    /* renamed from: a */
    public C3648e mo13323a() {
        C3649f fVar = new C3649f();
        this.f12732a = fVar;
        return fVar;
    }
}
