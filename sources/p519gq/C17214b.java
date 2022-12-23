package p519gq;

import android.content.SharedPreferences;
import ce0.C21100e;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import f00.C16919g;
import p471eq.C16851b;

/* renamed from: gq.b */
public final class C17214b extends C17213a {

    /* renamed from: f */
    public final int f44503f = 4;

    /* renamed from: g */
    public final C16919g.C16924e f44504g = new C16919g.C16924e(mo49789t(), 0);

    public C17214b(MoovitActivity moovitActivity, C16851b bVar) {
        super(moovitActivity, bVar);
        C21100e.m49365t(4, "limit");
    }

    /* renamed from: n */
    public final void mo49519n(Snackbar snackbar) {
        super.mo49519n(snackbar);
        SharedPreferences s = mo49788s();
        C16919g.C16924e eVar = this.f44504g;
        eVar.mo49545d(s, Integer.valueOf(eVar.mo19759a(s).intValue() + 1));
    }

    /* renamed from: r */
    public final String mo49787r() {
        return "limit_policy";
    }

    /* renamed from: u */
    public final boolean mo49790u() {
        if (this.f44504g.mo19759a(mo49788s()).intValue() < this.f44503f) {
            return true;
        }
        return false;
    }
}
