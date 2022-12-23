package cg0;

import ag0.C20989e;
import java.util.Collections;
import java.util.List;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25454l0;

/* renamed from: cg0.l0 */
public abstract class C21182l0 extends C21186o implements C25454l0 {

    /* renamed from: f */
    public C24307v f53094f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21182l0(C25442g gVar, C20989e eVar, C25069e eVar2, C24307v vVar, C25435d0 d0Var) {
        super(gVar, eVar, eVar2, d0Var);
        if (gVar == null) {
            m49682A(0);
            throw null;
        } else if (eVar == null) {
            m49682A(1);
            throw null;
        } else if (eVar2 == null) {
            m49682A(2);
            throw null;
        } else if (d0Var != null) {
            this.f53094f = vVar;
        } else {
            m49682A(3);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49682A(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: O */
    public C25433c0 mo53422O() {
        return null;
    }

    /* renamed from: R */
    public C25433c0 mo53423R() {
        return null;
    }

    public final C24307v getType() {
        C24307v vVar = this.f53094f;
        if (vVar != null) {
            return vVar;
        }
        m49682A(4);
        throw null;
    }

    public List<C25448i0> getTypeParameters() {
        List<C25448i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49682A(8);
        throw null;
    }

    /* renamed from: h */
    public final List<C25452k0> mo53442h() {
        List<C25452k0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49682A(6);
        throw null;
    }

    /* renamed from: i */
    public C24307v mo53443i() {
        C24307v type = getType();
        if (type != null) {
            return type;
        }
        m49682A(9);
        throw null;
    }

    /* renamed from: j0 */
    public boolean mo53431j0() {
        return false;
    }
}
