package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.v1 */
abstract class C26240v1 extends CountedCompleter {

    /* renamed from: a */
    protected final C26043E0 f65042a;

    /* renamed from: b */
    protected final int f65043b;

    C26240v1(C26043E0 e0) {
        this.f65042a = e0;
        this.f65043b = 0;
    }

    C26240v1(C26240v1 v1Var, C26043E0 e0, int i) {
        super(v1Var);
        this.f65042a = e0;
        this.f65043b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo84595a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C26235u1 mo84596b(int i, int i2);

    public final void compute() {
        C26240v1 v1Var = this;
        while (v1Var.f65042a.mo84244n() != 0) {
            v1Var.setPendingCount(v1Var.f65042a.mo84244n() - 1);
            int i = 0;
            int i2 = 0;
            while (i < v1Var.f65042a.mo84244n() - 1) {
                C26235u1 b = v1Var.mo84596b(i, v1Var.f65043b + i2);
                i2 = (int) (((long) i2) + b.f65042a.count());
                b.fork();
                i++;
            }
            v1Var = v1Var.mo84596b(i, v1Var.f65043b + i2);
        }
        v1Var.mo84595a();
        v1Var.propagateCompletion();
    }
}
