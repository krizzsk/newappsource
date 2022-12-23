package jg0;

import ag0.C20989e;
import cg0.C21171g0;
import cg0.C21177j;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import lh0.C24307v;
import ng0.C24501a;
import p389bl.C13637c;
import ug0.C25069e;
import xg0.C25258b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25442g;

/* renamed from: jg0.b */
public final class C23721b extends C21177j implements C23720a {

    /* renamed from: F */
    public Boolean f59925F;

    /* renamed from: G */
    public Boolean f59926G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23721b(C25432c cVar, C23721b bVar, C20989e eVar, boolean z, CallableMemberDescriptor.Kind kind, C25435d0 d0Var) {
        super(cVar, bVar, eVar, z, kind, d0Var);
        if (cVar == null) {
            m58237A(0);
            throw null;
        } else if (eVar == null) {
            m58237A(1);
            throw null;
        } else if (kind == null) {
            m58237A(2);
            throw null;
        } else if (d0Var != null) {
            this.f59925F = null;
            this.f59926G = null;
        } else {
            m58237A(3);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m58237A(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a1 */
    public static C23721b m58238a1(C25432c cVar, C20989e eVar, boolean z, C24501a aVar) {
        if (cVar == null) {
            m58237A(4);
            throw null;
        } else if (aVar != null) {
            return new C23721b(cVar, (C23721b) null, eVar, z, CallableMemberDescriptor.Kind.DECLARATION, aVar);
        } else {
            m58237A(6);
            throw null;
        }
    }

    /* renamed from: A0 */
    public final C23720a mo58951A0(C24307v vVar, ArrayList arrayList, C24307v vVar2, Pair pair) {
        C21171g0 g0Var = null;
        if (vVar2 != null) {
            C25432c X0 = m49639b();
            C23721b b1 = mo58954b1(mo53433p(), X0, (C23900c) null, mo53400e(), getAnnotations());
            if (vVar != null) {
                g0Var = C25258b.m63380f(b1, vVar, C20989e.C20990a.f52739a);
            }
            b1.mo53468Q0(g0Var, this.f60474j, getTypeParameters(), C13637c.m34074q(arrayList, mo53442h(), b1), vVar2, mo53436s(), mo53429g());
            if (pair != null) {
                b1.mo59452S0((C23894a.C23895a) pair.mo59068c(), pair.mo59069d());
            }
            return b1;
        }
        m58237A(17);
        throw null;
    }

    /* renamed from: N0 */
    public final /* bridge */ /* synthetic */ C23907b mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        return mo58954b1(kind, gVar, cVar, d0Var, eVar);
    }

    /* renamed from: T0 */
    public final void mo58952T0(boolean z) {
        this.f59925F = Boolean.valueOf(z);
    }

    /* renamed from: U0 */
    public final void mo58953U0(boolean z) {
        this.f59926G = Boolean.valueOf(z);
    }

    /* renamed from: W0 */
    public final /* bridge */ /* synthetic */ C21177j mo53495W0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        return mo58954b1(kind, gVar, cVar, d0Var, eVar);
    }

    /* renamed from: b1 */
    public final C23721b mo58954b1(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar) {
        if (gVar == null) {
            m58237A(7);
            throw null;
        } else if (kind == null) {
            m58237A(8);
            throw null;
        } else if (eVar == null) {
            m58237A(9);
            throw null;
        } else if (d0Var == null) {
            m58237A(10);
            throw null;
        } else if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            C23721b bVar = new C23721b((C25432c) gVar, (C23721b) cVar, eVar, this.f53081E, kind, d0Var);
            bVar.mo58952T0(this.f59925F.booleanValue());
            bVar.mo58953U0(mo53431j0());
            return bVar;
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + gVar + "\n" + "kind: " + kind);
        }
    }

    /* renamed from: j0 */
    public final boolean mo53431j0() {
        return this.f59926G.booleanValue();
    }
}
