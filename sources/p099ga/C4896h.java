package p099ga;

import p099ga.C4879e1;

/* renamed from: ga.h */
public final class C4896h implements C4886g {

    /* renamed from: a */
    public final C4879e1.C4882c f16507a;

    /* renamed from: b */
    public long f16508b;

    /* renamed from: c */
    public long f16509c;

    public C4896h() {
        this(15000, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
    }

    /* renamed from: e */
    public static void m12440e(C4936u0 u0Var, long j) {
        long currentPosition = u0Var.getCurrentPosition() + j;
        long duration = u0Var.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        u0Var.mo20405x(u0Var.mo20393k(), Math.max(currentPosition, 0));
    }

    /* renamed from: a */
    public final void mo20533a(C4936u0 u0Var) {
        boolean z;
        if (this.f16509c > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && u0Var.mo20452i()) {
            m12440e(u0Var, this.f16509c);
        }
    }

    /* renamed from: b */
    public final void mo20534b(C4936u0 u0Var) {
        C4879e1 s = u0Var.mo20400s();
        if (!s.mo20464p() && !u0Var.mo20385d()) {
            int k = u0Var.mo20393k();
            s.mo20462m(k, this.f16507a);
            int K = u0Var.mo20451K();
            if (K != -1) {
                u0Var.mo20405x(K, -9223372036854775807L);
            } else if (this.f16507a.mo20470a() && this.f16507a.f16432i) {
                u0Var.mo20405x(k, -9223372036854775807L);
            }
        }
    }

    /* renamed from: c */
    public final void mo20535c(C4936u0 u0Var) {
        boolean z;
        C4879e1 s = u0Var.mo20400s();
        if (!s.mo20464p() && !u0Var.mo20385d()) {
            int k = u0Var.mo20393k();
            s.mo20462m(k, this.f16507a);
            int F = u0Var.mo20450F();
            if (!this.f16507a.mo20470a() || this.f16507a.f16431h) {
                z = false;
            } else {
                z = true;
            }
            if (F != -1 && (u0Var.getCurrentPosition() <= 3000 || z)) {
                u0Var.mo20405x(F, -9223372036854775807L);
            } else if (!z) {
                u0Var.mo20405x(k, 0);
            }
        }
    }

    /* renamed from: d */
    public final void mo20536d(C4936u0 u0Var) {
        boolean z;
        if (this.f16508b > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && u0Var.mo20452i()) {
            m12440e(u0Var, -this.f16508b);
        }
    }

    public C4896h(long j, long j2) {
        this.f16509c = j;
        this.f16508b = j2;
        this.f16507a = new C4879e1.C4882c();
    }
}
