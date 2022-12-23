package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g0 */
public abstract class C1185g0 extends RecyclerView.C1128j {

    /* renamed from: g */
    public boolean f4498g = true;

    /* renamed from: a */
    public final boolean mo4772a(RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2, RecyclerView.C1128j.C1131c cVar, RecyclerView.C1128j.C1131c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4312a;
        int i4 = cVar.f4313b;
        if (a0Var2.shouldIgnore()) {
            int i5 = cVar.f4312a;
            i = cVar.f4313b;
            i2 = i5;
        } else {
            i2 = cVar2.f4312a;
            i = cVar2.f4313b;
        }
        return mo5059k(a0Var, a0Var2, i3, i4, i2, i);
    }

    /* renamed from: j */
    public abstract void mo5058j(RecyclerView.C1119a0 a0Var);

    /* renamed from: k */
    public abstract boolean mo5059k(RecyclerView.C1119a0 a0Var, RecyclerView.C1119a0 a0Var2, int i, int i2, int i3, int i4);

    /* renamed from: l */
    public abstract boolean mo5060l(RecyclerView.C1119a0 a0Var, int i, int i2, int i3, int i4);

    /* renamed from: m */
    public abstract void mo5061m(RecyclerView.C1119a0 a0Var);
}
