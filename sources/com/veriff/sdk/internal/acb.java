package com.veriff.sdk.internal;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;

public class acb {

    /* renamed from: c */
    public static final acb f53608c = new acb() {
        /* renamed from: a */
        public acb mo53956a(long j) {
            return this;
        }

        /* renamed from: a */
        public acb mo53957a(long j, TimeUnit timeUnit) {
            return this;
        }

        /* renamed from: g */
        public void mo53960g() throws IOException {
        }
    };

    /* renamed from: a */
    private boolean f53609a;

    /* renamed from: b */
    private long f53610b;

    /* renamed from: d */
    private long f53611d;

    /* renamed from: a */
    public acb mo53957a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(C0016g.m29l("timeout < 0: ", j));
        } else if (timeUnit != null) {
            this.f53611d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: d */
    public long mo53958d() {
        if (this.f53609a) {
            return this.f53610b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: f */
    public acb mo53959f() {
        this.f53609a = false;
        return this;
    }

    /* renamed from: g */
    public void mo53960g() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f53609a && this.f53610b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: o_ */
    public boolean mo53961o_() {
        return this.f53609a;
    }

    /* renamed from: p_ */
    public acb mo53962p_() {
        this.f53611d = 0;
        return this;
    }

    /* renamed from: q_ */
    public long mo53992q_() {
        return this.f53611d;
    }

    /* renamed from: a */
    public acb mo53956a(long j) {
        this.f53609a = true;
        this.f53610b = j;
        return this;
    }
}
