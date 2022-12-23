package p277ub;

import p099ga.C4883f;
import p099ga.C4932s0;

/* renamed from: ub.u */
public final class C6807u implements C6791m {

    /* renamed from: b */
    public final C6773a f21057b;

    /* renamed from: c */
    public boolean f21058c;

    /* renamed from: d */
    public long f21059d;

    /* renamed from: e */
    public long f21060e;

    /* renamed from: f */
    public C4932s0 f21061f = C4932s0.f16695d;

    public C6807u(C6808v vVar) {
        this.f21057b = vVar;
    }

    /* renamed from: a */
    public final void mo15928a(C4932s0 s0Var) {
        if (this.f21058c) {
            mo23020c(mo15939n());
        }
        this.f21061f = s0Var;
    }

    /* renamed from: b */
    public final C4932s0 mo15930b() {
        return this.f21061f;
    }

    /* renamed from: c */
    public final void mo23020c(long j) {
        this.f21059d = j;
        if (this.f21058c) {
            this.f21060e = this.f21057b.elapsedRealtime();
        }
    }

    /* renamed from: n */
    public final long mo15939n() {
        long j;
        long j2 = this.f21059d;
        if (!this.f21058c) {
            return j2;
        }
        long elapsedRealtime = this.f21057b.elapsedRealtime() - this.f21060e;
        C4932s0 s0Var = this.f21061f;
        if (s0Var.f16696a == 1.0f) {
            j = C4883f.m12376a(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) s0Var.f16698c);
        }
        return j2 + j;
    }
}
