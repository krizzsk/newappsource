package p030bo.app;

import java.util.List;

/* renamed from: bo.app.m5 */
public final class C1638m5 extends C1646n5 {
    public C1638m5(List<C1551c5> list) {
        super(list);
    }

    /* renamed from: a */
    public boolean mo5898a(C1721w5 w5Var) {
        boolean z = false;
        for (C1551c5 a : this.f5867a) {
            if (!a.mo5898a(w5Var)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
