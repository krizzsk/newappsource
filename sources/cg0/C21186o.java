package cg0;

import ag0.C20989e;
import ug0.C25069e;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25445h;
import zf0.C25449j;

/* renamed from: cg0.o */
public abstract class C21186o extends C21185n implements C25445h {

    /* renamed from: d */
    public final C25442g f53100d;

    /* renamed from: e */
    public final C25435d0 f53101e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21186o(C25442g gVar, C20989e eVar, C25069e eVar2, C25435d0 d0Var) {
        super(eVar, eVar2);
        if (gVar == null) {
            m49698A(0);
            throw null;
        } else if (eVar == null) {
            m49698A(1);
            throw null;
        } else if (eVar2 == null) {
            m49698A(2);
            throw null;
        } else if (d0Var != null) {
            this.f53100d = gVar;
            this.f53101e = d0Var;
        } else {
            m49698A(3);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49698A(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: W */
    public C25449j mo53407a() {
        return this;
    }

    /* renamed from: b */
    public C25442g mo53399b() {
        C25442g gVar = this.f53100d;
        if (gVar != null) {
            return gVar;
        }
        m49698A(5);
        throw null;
    }

    /* renamed from: e */
    public C25435d0 mo53400e() {
        C25435d0 d0Var = this.f53101e;
        if (d0Var != null) {
            return d0Var;
        }
        m49698A(6);
        throw null;
    }
}
