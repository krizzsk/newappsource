package p519gq;

import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import f00.C16919g;
import p471eq.C16851b;

/* renamed from: gq.c */
public final class C17215c extends C17213a {

    /* renamed from: f */
    public final C16919g.C16925f f44505f = new C16919g.C16925f(mo49789t(), -1);

    /* renamed from: g */
    public final long f44506g;

    public C17215c(MoovitActivity moovitActivity, C16851b bVar, long j) {
        super(moovitActivity, bVar);
        this.f44506g = j;
    }

    /* renamed from: n */
    public final void mo49519n(Snackbar snackbar) {
        super.mo49519n(snackbar);
        this.f44505f.mo49545d(mo49788s(), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: r */
    public final String mo49787r() {
        return "min_wait_time_policy";
    }

    /* renamed from: u */
    public final boolean mo49790u() {
        if (this.f44505f.mo19759a(mo49788s()).longValue() < System.currentTimeMillis() - this.f44506g) {
            return true;
        }
        return false;
    }
}
