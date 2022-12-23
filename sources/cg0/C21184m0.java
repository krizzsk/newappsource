package cg0;

import ag0.C20989e;
import kh0.C23790f;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25435d0;
import zf0.C25442g;
import zg0.C25498g;

/* renamed from: cg0.m0 */
public abstract class C21184m0 extends C21182l0 {

    /* renamed from: g */
    public final boolean f53097g;

    /* renamed from: h */
    public C23790f<C25498g<?>> f53098h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21184m0(C25442g gVar, C20989e eVar, C25069e eVar2, boolean z, C25435d0 d0Var) {
        super(gVar, eVar, eVar2, (C24307v) null, d0Var);
        if (gVar == null) {
            m49692A(0);
            throw null;
        } else if (eVar == null) {
            m49692A(1);
            throw null;
        } else if (eVar2 == null) {
            m49692A(2);
            throw null;
        } else if (d0Var != null) {
            this.f53097g = z;
        } else {
            m49692A(3);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49692A(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: Q */
    public final boolean mo53526Q() {
        return this.f53097g;
    }

    /* renamed from: t0 */
    public final C25498g<?> mo53527t0() {
        C23790f<C25498g<?>> fVar = this.f53098h;
        if (fVar != null) {
            return (C25498g) fVar.invoke();
        }
        return null;
    }
}
