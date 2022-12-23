package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cg0.C21166e;
import cg0.C21186o;
import java.util.List;
import jh0.C23735i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lh0.C24274i0;
import lh0.C24299r0;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25446h0;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25449j;
import zf0.C25478n;

public abstract class AbstractTypeAliasDescriptor extends C21186o implements C25446h0 {

    /* renamed from: f */
    public final C25478n f60450f;

    /* renamed from: g */
    public List<? extends C25448i0> f60451g;

    /* renamed from: h */
    public final C21166e f60452h = new C21166e(this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractTypeAliasDescriptor(zf0.C25442g r3, ag0.C20989e r4, ug0.C25069e r5, zf0.C25478n r6) {
        /*
            r2 = this;
            zf0.d0$a r0 = zf0.C25435d0.f63736a
            java.lang.String r1 = "containingDeclaration"
            mf0.C24362h.m61211f(r3, r1)
            java.lang.String r1 = "visibilityImpl"
            mf0.C24362h.m61211f(r6, r1)
            r2.<init>(r3, r4, r5, r0)
            r2.f60450f = r6
            cg0.e r3 = new cg0.e
            r3.<init>(r2)
            r2.f60452h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.<init>(zf0.g, ag0.e, ug0.e, zf0.n):void");
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60150a(this, d);
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return C24299r0.m60971c(((C23735i) this).mo58973x0(), new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    /* renamed from: W */
    public final C25449j mo53425W() {
        return this;
    }

    /* renamed from: a */
    public final C25437e mo53407a() {
        return this;
    }

    /* renamed from: a */
    public final C25442g m58826a() {
        return this;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        return false;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        return this.f60450f;
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        return this.f60452h;
    }

    /* renamed from: l0 */
    public final C24312z mo59440l0() {
        C23735i iVar = (C23735i) this;
        C25432c t = iVar.mo58972t();
        return C24299r0.m60983o(this, t == null ? MemberScope.C24119a.f61217b : t.mo53406Z(), new AbstractTypeAliasDescriptor$computeDefaultType$1(iVar));
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        List<? extends C25448i0> list = this.f60451g;
        if (list != null) {
            return list;
        }
        C24362h.m61217l("declaredTypeParametersImpl");
        throw null;
    }

    public final String toString() {
        return C24362h.m61216k(getName().mo61604f(), "typealias ");
    }
}
