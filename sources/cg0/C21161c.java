package cg0;

import ag0.C20989e;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import ug0.C25069e;
import zf0.C25442g;
import zf0.C25443g0;

/* renamed from: cg0.c */
public abstract class C21161c extends C21174i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21161c(C23792h hVar, C25442g gVar, C20989e eVar, C25069e eVar2, Variance variance, boolean z, int i, C25443g0 g0Var) {
        super(hVar, gVar, eVar, eVar2, variance, z, i, g0Var);
        if (hVar == null) {
            m49466A(0);
            throw null;
        } else if (gVar == null) {
            m49466A(1);
            throw null;
        } else if (eVar2 == null) {
            m49466A(3);
            throw null;
        } else if (variance == null) {
            m49466A(4);
            throw null;
        } else if (g0Var != null) {
        } else {
            m49466A(6);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49466A(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        String str2 = "";
        if (this.f53072g) {
            str = "reified ";
        } else {
            str = str2;
        }
        objArr[0] = str;
        if (mo53482l() != Variance.INVARIANT) {
            str2 = mo53482l() + " ";
        }
        objArr[1] = str2;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
