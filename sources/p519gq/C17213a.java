package p519gq;

import android.content.SharedPreferences;
import com.moovit.MoovitActivity;
import p471eq.C16851b;
import p471eq.C16854c;

/* renamed from: gq.a */
public abstract class C17213a extends C16854c {
    public C17213a(MoovitActivity moovitActivity, C16851b bVar) {
        super(moovitActivity, bVar);
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        if (!mo49790u() || !this.f43852e.mo49514i()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public abstract String mo49787r();

    /* renamed from: s */
    public final SharedPreferences mo49788s() {
        return this.f43848b.getSharedPreferences("alert_conditions", 0);
    }

    /* renamed from: t */
    public final String mo49789t() {
        return mo49787r() + "_" + mo49513h();
    }

    /* renamed from: u */
    public abstract boolean mo49790u();
}
