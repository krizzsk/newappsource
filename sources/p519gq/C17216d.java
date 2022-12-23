package p519gq;

import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import f00.C16919g;
import p471eq.C16851b;
import p824tp.C19731i;

/* renamed from: gq.d */
public final class C17216d extends C17213a {

    /* renamed from: f */
    public final C16919g.C16924e f44507f = new C16919g.C16924e(mo49789t(), -1);

    /* renamed from: g */
    public final int f44508g;

    public C17216d(MoovitActivity moovitActivity, C16851b bVar) {
        super(moovitActivity, bVar);
        this.f44508g = C19731i.m47197a(moovitActivity).f50171a.f50153d;
    }

    /* renamed from: n */
    public final void mo49519n(Snackbar snackbar) {
        super.mo49519n(snackbar);
        this.f44507f.mo49545d(mo49788s(), Integer.valueOf(this.f44508g));
    }

    /* renamed from: r */
    public final String mo49787r() {
        return "once_in_version_policy";
    }

    /* renamed from: u */
    public final boolean mo49790u() {
        if (this.f44507f.mo19759a(mo49788s()).intValue() < this.f44508g) {
            return true;
        }
        return false;
    }
}
