package p099ga;

import p099ga.C4879e1;

/* renamed from: ga.e */
public abstract class C4877e implements C4936u0 {

    /* renamed from: a */
    public final C4879e1.C4882c f16412a = new C4879e1.C4882c();

    /* renamed from: F */
    public final int mo20450F() {
        C4879e1 s = mo20400s();
        if (s.mo20464p()) {
            return -1;
        }
        int k = mo20393k();
        int M = mo20368M();
        if (M == 1) {
            M = 0;
        }
        return s.mo20347k(k, M, mo20369N());
    }

    /* renamed from: K */
    public final int mo20451K() {
        C4879e1 s = mo20400s();
        if (s.mo20464p()) {
            return -1;
        }
        int k = mo20393k();
        int M = mo20368M();
        if (M == 1) {
            M = 0;
        }
        return s.mo20344e(k, M, mo20369N());
    }

    /* renamed from: i */
    public final boolean mo20452i() {
        C4879e1 s = mo20400s();
        if (s.mo20464p() || !s.mo20462m(mo20393k(), this.f16412a).f16431h) {
            return false;
        }
        return true;
    }

    public final boolean isPlaying() {
        if (mo20364H() == 3 && mo20407z() && mo20398q() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo20454p(int i) {
        return mo20365I().f16702a.f20978a.get(i);
    }
}
