package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.network.C2915m;
import com.fyber.inneractive.sdk.p048dv.C2718e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.response.b */
public abstract class C3645b {

    /* renamed from: a */
    public C3648e f12732a;

    /* renamed from: b */
    public String f12733b;

    /* renamed from: c */
    public C3653j f12734c;

    /* renamed from: d */
    public boolean f12735d = true;

    /* renamed from: a */
    public abstract C3648e mo13323a();

    /* renamed from: a */
    public void mo15290a(C2915m mVar) {
        this.f12732a = mo13323a();
    }

    /* renamed from: a */
    public abstract void mo13324a(String str, C2702y yVar) throws Exception;

    /* renamed from: b */
    public abstract boolean mo13325b();

    /* renamed from: a */
    public C3648e mo15289a(String str) throws Exception {
        this.f12735d = str != null;
        C3648e eVar = this.f12732a;
        eVar.getClass();
        eVar.f12745c = System.currentTimeMillis();
        this.f12734c.mo13158a(this);
        String a = this.f12734c.mo13157a();
        this.f12732a.f12750h = a;
        C2702y b = C2618a.m6642b(this.f12733b);
        IAlog.m9902a("%sGot unit config for unitId: %s from config manager", IAlog.m9899a((Object) this), this.f12733b);
        IAlog.m9902a("%s%s", IAlog.m9899a((Object) this), b);
        if (this.f12735d) {
            mo13324a(str, b);
        } else if (!(this instanceof C2718e)) {
            C3651h hVar = new C3651h(a);
            if (hVar.f12776a) {
                String str2 = hVar.f12777b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                mo13324a(str2, b);
            }
        } else {
            mo13324a(a, b);
        }
        return this.f12732a;
    }
}
