package cg0;

import ag0.C20989e;
import com.usebutton.sdk.internal.models.Configuration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lh0.C24307v;
import ug0.C25069e;
import ug0.C25071g;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25447i;
import zf0.C25453l;
import zf0.C25478n;

/* renamed from: cg0.j */
public class C21177j extends C23907b implements C25430b {

    /* renamed from: E */
    public final boolean f53081E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21177j(C25432c cVar, C23899b bVar, C20989e eVar, boolean z, CallableMemberDescriptor.Kind kind, C25435d0 d0Var) {
        super(kind, cVar, bVar, d0Var, eVar, C25071g.f63270e);
        if (cVar == null) {
            m49623A(0);
            throw null;
        } else if (eVar == null) {
            m49623A(1);
            throw null;
        } else if (kind == null) {
            m49623A(2);
            throw null;
        } else if (d0Var != null) {
            this.f53081E = z;
        } else {
            m49623A(3);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49623A(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 23:
                objArr[0] = "annotations";
                break;
            case 2:
            case 22:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 24:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 18:
                objArr[0] = "originalSubstitutor";
                break;
            case 20:
                objArr[0] = "overriddenDescriptors";
                break;
            case 21:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 19) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 25) {
            switch (i) {
                case 15:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 16:
                    objArr[1] = "getConstructedClass";
                    break;
                case 17:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = Configuration.KEY_COPY;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            case 20:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60161l(this, d);
    }

    /* renamed from: I0 */
    public final void mo53416I0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m49623A(20);
            throw null;
        }
    }

    /* renamed from: L0 */
    public final CallableMemberDescriptor mo53420L0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        return (C25430b) super.mo53420L0(gVar, modality, lVar, kind);
    }

    /* renamed from: W0 */
    public C21177j mo53467N0(CallableMemberDescriptor.Kind kind, C25442g gVar, C23900c cVar, C25435d0 d0Var, C20989e eVar, C25069e eVar2) {
        if (gVar == null) {
            m49623A(21);
            throw null;
        } else if (kind == null) {
            m49623A(22);
            throw null;
        } else if (eVar != null) {
            CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
            if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
                return new C21177j((C25432c) gVar, this, eVar, this.f53081E, kind2, d0Var);
            }
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + gVar + "\n" + "kind: " + kind);
        } else {
            m49623A(23);
            throw null;
        }
    }

    /* renamed from: X0 */
    public final C25432c m49639b() {
        C25432c cVar = (C25432c) super.mo53399b();
        if (cVar != null) {
            return cVar;
        }
        m49623A(15);
        throw null;
    }

    /* renamed from: Y0 */
    public final void mo53497Y0(List list, C25478n nVar) {
        if (list == null) {
            m49623A(13);
            throw null;
        } else if (nVar != null) {
            mo53498Z0(list, nVar, m49639b().mo53514r());
        } else {
            m49623A(14);
            throw null;
        }
    }

    /* renamed from: Z0 */
    public final void mo53498Z0(List list, C25478n nVar, List list2) {
        C25433c0 c0Var = null;
        if (list == null) {
            m49623A(10);
            throw null;
        } else if (nVar == null) {
            m49623A(11);
            throw null;
        } else if (list2 != null) {
            C25432c X0 = m49639b();
            if (X0.mo53506E()) {
                C25442g b = X0.mo53399b();
                if (b instanceof C25432c) {
                    c0Var = ((C25432c) b).mo53404M0();
                }
            }
            mo53468Q0((C21171g0) null, c0Var, list2, list, (C24307v) null, Modality.FINAL, nVar);
        } else {
            m49623A(12);
            throw null;
        }
    }

    /* renamed from: d */
    public final Collection<? extends C23900c> mo53440d() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m49623A(19);
        throw null;
    }

    /* renamed from: f0 */
    public final boolean mo53499f0() {
        return this.f53081E;
    }

    /* renamed from: g0 */
    public final C25432c mo53500g0() {
        C25432c X0 = m49639b();
        if (X0 != null) {
            return X0;
        }
        m49623A(16);
        throw null;
    }

    /* renamed from: l0 */
    public final C23900c mo53473l0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        return (C25430b) super.mo53420L0(gVar, modality, lVar, kind);
    }

    /* renamed from: c */
    public final C25430b m49642c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (C25430b) super.m58886c(typeSubstitutor);
        }
        m49623A(18);
        throw null;
    }

    /* renamed from: a */
    public final C25430b m49636a() {
        C25430b bVar = (C25430b) super.m58883a();
        if (bVar != null) {
            return bVar;
        }
        m49623A(17);
        throw null;
    }
}
