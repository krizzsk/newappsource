package ij0;

import jj0.C23751b;

/* renamed from: ij0.q1 */
public final class C23664q1 implements C23751b {

    /* renamed from: a */
    public C23639i1 f59827a;

    /* renamed from: b */
    public C23751b f59828b;

    public C23664q1(C23639i1 i1Var, C23751b bVar) {
        this.f59827a = i1Var;
        this.f59828b = bVar;
    }

    /* renamed from: a */
    public final String mo58847a(String str) {
        Object obj = ((C23654n1) this.f59827a.f59778d).get(str);
        if (obj != null) {
            return obj.toString();
        }
        return this.f59828b.mo58847a(str);
    }
}
