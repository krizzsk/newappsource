package zf0;

import ag0.C20989e;
import java.util.List;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24274i0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import ug0.C25069e;

/* renamed from: zf0.a */
public final class C25428a implements C25448i0 {

    /* renamed from: b */
    public final C25448i0 f63733b;

    /* renamed from: c */
    public final C25442g f63734c;

    /* renamed from: d */
    public final int f63735d;

    public C25428a(C25448i0 i0Var, C25442g gVar, int i) {
        C24362h.m61211f(gVar, "declarationDescriptor");
        this.f63733b = i0Var;
        this.f63734c = gVar;
        this.f63735d = i;
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return this.f63733b.mo53398B0(iVar, d);
    }

    /* renamed from: P */
    public final C23792h mo53477P() {
        return this.f63733b.mo53477P();
    }

    /* renamed from: T */
    public final boolean mo53478T() {
        return true;
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        return this.f63734c;
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        return this.f63733b.mo53400e();
    }

    public final C20989e getAnnotations() {
        return this.f63733b.getAnnotations();
    }

    public final int getIndex() {
        return this.f63733b.getIndex() + this.f63735d;
    }

    public final C25069e getName() {
        return this.f63733b.getName();
    }

    public final List<C24307v> getUpperBounds() {
        return this.f63733b.getUpperBounds();
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        return this.f63733b.mo53481j();
    }

    /* renamed from: l */
    public final Variance mo53482l() {
        return this.f63733b.mo53482l();
    }

    /* renamed from: q */
    public final C24312z mo53412q() {
        return this.f63733b.mo53412q();
    }

    public final String toString() {
        return this.f63733b + "[inner-copy]";
    }

    /* renamed from: y */
    public final boolean mo53484y() {
        return this.f63733b.mo53484y();
    }

    /* renamed from: a */
    public final C25448i0 m63686a() {
        C25448i0 a = this.f63733b.mo53407a();
        C24362h.m61210e(a, "originalDescriptor.original");
        return a;
    }
}
