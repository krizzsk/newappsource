package cg0;

import ag0.C20989e;
import fh0.C23388f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24307v;
import ug0.C25071g;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25455m;
import zf0.C25478n;

/* renamed from: cg0.d */
public abstract class C21163d extends C21185n implements C25433c0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21163d(C20989e eVar) {
        super(eVar, C25071g.f63269d);
        if (eVar != null) {
        } else {
            m49499A(0);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49499A(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60162m(this, d);
    }

    /* renamed from: O */
    public final C25433c0 mo53422O() {
        return null;
    }

    /* renamed from: R */
    public final C25433c0 mo53423R() {
        return null;
    }

    /* renamed from: a */
    public final C23894a mo53407a() {
        return this;
    }

    /* renamed from: a */
    public final C25442g m49504a() {
        return this;
    }

    /* renamed from: d */
    public final Collection<? extends C23894a> mo53440d() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m49499A(5);
        throw null;
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        return C25435d0.f63736a;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25455m.C25464i iVar = C25455m.f63745f;
        if (iVar != null) {
            return iVar;
        }
        m49499A(6);
        throw null;
    }

    public final C24307v getType() {
        C24307v type = getValue().getType();
        if (type != null) {
            return type;
        }
        m49499A(3);
        throw null;
    }

    public final List<C25448i0> getTypeParameters() {
        List<C25448i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49499A(2);
        throw null;
    }

    /* renamed from: h */
    public final List<C25452k0> mo53442h() {
        List<C25452k0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49499A(4);
        throw null;
    }

    /* renamed from: i */
    public final C24307v mo53443i() {
        return getType();
    }

    /* renamed from: j0 */
    public final boolean mo53431j0() {
        return false;
    }

    /* renamed from: c */
    public final C21163d m49506c(TypeSubstitutor typeSubstitutor) {
        C24307v vVar;
        if (typeSubstitutor == null) {
            m49499A(1);
            throw null;
        } else if (typeSubstitutor.mo60249h()) {
            return this;
        } else {
            if (mo53399b() instanceof C25432c) {
                vVar = typeSubstitutor.mo60251k(getType(), Variance.OUT_VARIANCE);
            } else {
                vVar = typeSubstitutor.mo60251k(getType(), Variance.INVARIANT);
            }
            if (vVar == null) {
                return null;
            }
            if (vVar == getType()) {
                return this;
            }
            return new C21171g0(mo53399b(), new C23388f(vVar), getAnnotations());
        }
    }
}
