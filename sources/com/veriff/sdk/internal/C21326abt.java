package com.veriff.sdk.internal;

import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.abt */
final class C21326abt implements aca {

    /* renamed from: a */
    private final abk f53583a;

    /* renamed from: b */
    private final abi f53584b;

    /* renamed from: c */
    private abw f53585c;

    /* renamed from: d */
    private int f53586d;

    /* renamed from: e */
    private boolean f53587e;

    /* renamed from: f */
    private long f53588f;

    public C21326abt(abk abk) {
        int i;
        this.f53583a = abk;
        abi c = abk.mo53875c();
        this.f53584b = c;
        abw abw = c.f53555a;
        this.f53585c = abw;
        if (abw != null) {
            i = abw.f53597b;
        } else {
            i = -1;
        }
        this.f53586d = i;
    }

    /* renamed from: a */
    public long mo53671a(abi abi, long j) throws IOException {
        abw abw;
        abw abw2;
        if (!this.f53587e) {
            abw abw3 = this.f53585c;
            if (abw3 == null || (abw3 == (abw2 = this.f53584b.f53555a) && this.f53586d == abw2.f53597b)) {
                this.f53583a.mo53872b(this.f53588f + j);
                if (this.f53585c == null && (abw = this.f53584b.f53555a) != null) {
                    this.f53585c = abw;
                    this.f53586d = abw.f53597b;
                }
                long min = Math.min(j, this.f53584b.f53556b - this.f53588f);
                if (min <= 0) {
                    return -1;
                }
                this.f53584b.mo53852a(abi, this.f53588f, min);
                this.f53588f += min;
                return min;
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        throw new IllegalStateException("closed");
    }

    public void close() throws IOException {
        this.f53587e = true;
    }

    /* renamed from: a */
    public acb mo53672a() {
        return this.f53583a.mo53672a();
    }
}
