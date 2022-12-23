package cg0;

import kh0.C23792h;
import ug0.C25069e;
import zf0.C25435d0;
import zf0.C25442g;

/* renamed from: cg0.k */
public abstract class C21179k extends C21154b {

    /* renamed from: f */
    public final C25442g f53082f;

    /* renamed from: g */
    public final C25435d0 f53083g;

    /* renamed from: h */
    public final boolean f53084h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21179k(C23792h hVar, C25442g gVar, C25069e eVar, C25435d0 d0Var) {
        super(hVar, eVar);
        if (hVar == null) {
            m49649W(0);
            throw null;
        } else if (gVar == null) {
            m49649W(1);
            throw null;
        } else if (eVar == null) {
            m49649W(2);
            throw null;
        } else if (d0Var != null) {
            this.f53082f = gVar;
            this.f53083g = d0Var;
            this.f53084h = false;
        } else {
            m49649W(3);
            throw null;
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m49649W(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        C25442g gVar = this.f53082f;
        if (gVar != null) {
            return gVar;
        }
        m49649W(4);
        throw null;
    }

    /* renamed from: c0 */
    public boolean mo53428c0() {
        return this.f53084h;
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        C25435d0 d0Var = this.f53083g;
        if (d0Var != null) {
            return d0Var;
        }
        m49649W(5);
        throw null;
    }
}
