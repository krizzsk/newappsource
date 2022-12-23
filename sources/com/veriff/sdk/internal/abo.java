package com.veriff.sdk.internal;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class abo extends acb {

    /* renamed from: a */
    private acb f53565a;

    public abo(acb acb) {
        if (acb != null) {
            this.f53565a = acb;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final acb mo53955a() {
        return this.f53565a;
    }

    /* renamed from: d */
    public long mo53958d() {
        return this.f53565a.mo53958d();
    }

    /* renamed from: f */
    public acb mo53959f() {
        return this.f53565a.mo53959f();
    }

    /* renamed from: g */
    public void mo53960g() throws IOException {
        this.f53565a.mo53960g();
    }

    /* renamed from: o_ */
    public boolean mo53961o_() {
        return this.f53565a.mo53961o_();
    }

    /* renamed from: p_ */
    public acb mo53962p_() {
        return this.f53565a.mo53962p_();
    }

    /* renamed from: a */
    public final abo mo53954a(acb acb) {
        if (acb != null) {
            this.f53565a = acb;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public acb mo53957a(long j, TimeUnit timeUnit) {
        return this.f53565a.mo53957a(j, timeUnit);
    }

    /* renamed from: a */
    public acb mo53956a(long j) {
        return this.f53565a.mo53956a(j);
    }
}
