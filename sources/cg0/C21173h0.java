package cg0;

import ag0.C20989e;
import com.usebutton.sdk.internal.models.Configuration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25453l;
import zf0.C25478n;

/* renamed from: cg0.h0 */
public class C21173h0 extends C23907b implements C23903e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21173h0(C25442g gVar, C23903e eVar, C20989e eVar2, C25069e eVar3, CallableMemberDescriptor.Kind kind, C25435d0 d0Var) {
        super(kind, gVar, eVar, d0Var, eVar2, eVar3);
        if (gVar == null) {
            m49580A(0);
            throw null;
        } else if (eVar2 == null) {
            m49580A(1);
            throw null;
        } else if (eVar3 == null) {
            m49580A(2);
            throw null;
        } else if (kind == null) {
            m49580A(3);
            throw null;
        } else if (d0Var != null) {
        } else {
            m49580A(4);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49580A(int i) {
        String str = (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = "source";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 17) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "getOriginal";
        } else if (i == 23) {
            objArr[1] = Configuration.KEY_COPY;
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: X0 */
    public static C21173h0 m49581X0(C25442g gVar, C25069e eVar, CallableMemberDescriptor.Kind kind, C25435d0 d0Var) {
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        if (gVar == null) {
            m49580A(5);
            throw null;
        } else if (eVar == null) {
            m49580A(7);
            throw null;
        } else if (kind == null) {
            m49580A(8);
            throw null;
        } else if (d0Var != null) {
            return new C21173h0(gVar, (C23903e) null, aVar, eVar, kind, d0Var);
        } else {
            m49580A(9);
            throw null;
        }
    }

    /* renamed from: N0 */
    public C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        if (gVar == null) {
            m49580A(19);
            throw null;
        } else if (kind == null) {
            m49580A(20);
            throw null;
        } else if (eVar != null) {
            C23903e eVar3 = (C23903e) cVar;
            if (eVar2 == null) {
                eVar2 = getName();
            }
            return new C21173h0(gVar, eVar3, eVar, eVar2, kind, d0Var);
        } else {
            m49580A(21);
            throw null;
        }
    }

    /* renamed from: W0 */
    public C23903e mo53473l0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        return (C23903e) super.mo53420L0(gVar, modality, lVar, kind);
    }

    /* renamed from: Y0 */
    public final C23903e m49592a() {
        C23903e eVar = (C23903e) super.m58883a();
        if (eVar != null) {
            return eVar;
        }
        m49580A(18);
        throw null;
    }

    /* renamed from: Z0 */
    public final C21173h0 mo53468Q0(C21171g0 g0Var, C25433c0 c0Var, List list, List list2, C24307v vVar, Modality modality, C25478n nVar) {
        if (list == null) {
            m49580A(10);
            throw null;
        } else if (list2 == null) {
            m49580A(11);
            throw null;
        } else if (nVar != null) {
            C21173h0 a1 = mo53472a1(g0Var, c0Var, list, list2, vVar, modality, nVar, (Map) null);
            if (a1 != null) {
                return a1;
            }
            m49580A(13);
            throw null;
        } else {
            m49580A(12);
            throw null;
        }
    }

    /* renamed from: a1 */
    public C21173h0 mo53472a1(C21171g0 g0Var, C25433c0 c0Var, List list, List list2, C24307v vVar, Modality modality, C25478n nVar, Map map) {
        if (list == null) {
            m49580A(14);
            throw null;
        } else if (list2 == null) {
            m49580A(15);
            throw null;
        } else if (nVar != null) {
            super.mo53468Q0(g0Var, c0Var, list, list2, vVar, modality, nVar);
            if (map != null && !map.isEmpty()) {
                this.f60469D = new LinkedHashMap(map);
            }
            return this;
        } else {
            m49580A(16);
            throw null;
        }
    }

    /* renamed from: u */
    public C23900c.C23901a<? extends C23903e> mo53474u() {
        return super.mo53474u();
    }
}
