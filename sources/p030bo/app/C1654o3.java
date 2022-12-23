package p030bo.app;

import java.util.concurrent.Executor;

/* renamed from: bo.app.o3 */
public class C1654o3 implements C1636m3 {

    /* renamed from: a */
    public final C1658p f5901a;

    /* renamed from: b */
    public final C1600i0 f5902b;

    /* renamed from: c */
    public final C1600i0 f5903c;

    /* renamed from: d */
    public final Executor f5904d;

    /* renamed from: e */
    public final C1744z3 f5905e;

    /* renamed from: f */
    public final C1558d4 f5906f;

    /* renamed from: g */
    public final C1702u3 f5907g;

    /* renamed from: h */
    public C1707v1 f5908h;

    public C1654o3(C1658p pVar, C1600i0 i0Var, C1600i0 i0Var2, Executor executor, C1744z3 z3Var, C1558d4 d4Var, C1702u3 u3Var, C1707v1 v1Var) {
        this.f5901a = pVar;
        this.f5902b = i0Var;
        this.f5903c = i0Var2;
        this.f5904d = executor;
        this.f5905e = z3Var;
        this.f5906f = d4Var;
        this.f5907g = u3Var;
        this.f5908h = v1Var;
    }

    /* renamed from: a */
    public void mo6147a(C1628l3 l3Var) {
        this.f5904d.execute(mo6277a((C1620k3) l3Var));
    }

    /* renamed from: b */
    public void mo6148b(C1628l3 l3Var) {
        mo6277a((C1620k3) l3Var).run();
    }

    /* renamed from: a */
    public final C1566e3 mo6277a(C1620k3 k3Var) {
        return new C1566e3(this.f5904d, k3Var, this.f5901a, this.f5902b, this.f5903c, this.f5905e, this.f5908h, this.f5906f, this.f5907g);
    }
}
