package lh0;

import com.usebutton.sdk.internal.models.Configuration;
import mf0.C24362h;
import zf0.C25437e;
import zf0.C25448i0;

/* renamed from: lh0.u */
public final class C24305u extends C24287o0 {

    /* renamed from: b */
    public final C25448i0[] f61604b;

    /* renamed from: c */
    public final C24281l0[] f61605c;

    /* renamed from: d */
    public final boolean f61606d;

    public C24305u() {
        throw null;
    }

    public C24305u(C25448i0[] i0VarArr, C24281l0[] l0VarArr, boolean z) {
        C24362h.m61211f(i0VarArr, Configuration.KEY_PARAMETERS);
        C24362h.m61211f(l0VarArr, WidgetMessageParser.KEY_ARGUMENTS);
        this.f61604b = i0VarArr;
        this.f61605c = l0VarArr;
        this.f61606d = z;
    }

    /* renamed from: b */
    public final boolean mo60439b() {
        return this.f61606d;
    }

    /* renamed from: d */
    public final C24281l0 mo59555d(C24307v vVar) {
        C25448i0 i0Var;
        C25437e o = vVar.mo60411O0().mo53460o();
        if (o instanceof C25448i0) {
            i0Var = (C25448i0) o;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            return null;
        }
        int index = i0Var.getIndex();
        C25448i0[] i0VarArr = this.f61604b;
        if (index >= i0VarArr.length || !C24362h.m61206a(i0VarArr[index].mo53481j(), i0Var.mo53481j())) {
            return null;
        }
        return this.f61605c[index];
    }

    /* renamed from: e */
    public final boolean mo60435e() {
        return this.f61605c.length == 0;
    }
}
