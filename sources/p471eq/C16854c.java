package p471eq;

import ce0.C21100e;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import p471eq.C16851b;

/* renamed from: eq.c */
public abstract class C16854c extends C16851b implements C16851b.C16853b {

    /* renamed from: e */
    public final C16851b f43852e;

    public C16854c(MoovitActivity moovitActivity, C16851b bVar) {
        super(moovitActivity);
        C21100e.m49373x(bVar, "delegate");
        this.f43852e = bVar;
        bVar.f43849c = this;
    }

    /* renamed from: a */
    public final void mo49523a(C16851b bVar) {
        mo49522q(mo49514i());
    }

    /* renamed from: b */
    public final void mo49524b(C16851b bVar) {
        mo49522q(mo49514i());
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        this.f43852e.mo49509d(snackbar, aVar);
    }

    /* renamed from: g */
    public final String mo49512g() {
        return this.f43852e.mo49512g();
    }

    /* renamed from: h */
    public final String mo49513h() {
        return this.f43852e.mo49513h();
    }

    /* renamed from: i */
    public abstract boolean mo49514i();

    /* renamed from: j */
    public final void mo49515j() {
        this.f43852e.mo49515j();
    }

    /* renamed from: k */
    public final void mo49516k() {
        super.mo49516k();
        this.f43852e.mo49516k();
    }

    /* renamed from: l */
    public final void mo49517l() {
        this.f43852e.mo49517l();
    }

    /* renamed from: m */
    public final void mo49518m(Snackbar snackbar, int i) {
        this.f43852e.mo49518m(snackbar, i);
    }

    /* renamed from: n */
    public void mo49519n(Snackbar snackbar) {
        this.f43852e.mo49519n(snackbar);
    }
}
