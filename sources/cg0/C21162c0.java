package cg0;

import ag0.C20989e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23902d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import ug0.C25069e;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25453l;
import zf0.C25478n;
import zf0.C25491z;

/* renamed from: cg0.c0 */
public abstract class C21162c0 extends C21186o implements C23902d {

    /* renamed from: f */
    public boolean f53021f;

    /* renamed from: g */
    public final boolean f53022g;

    /* renamed from: h */
    public final Modality f53023h;

    /* renamed from: i */
    public final C25491z f53024i;

    /* renamed from: j */
    public final boolean f53025j;

    /* renamed from: k */
    public final CallableMemberDescriptor.Kind f53026k;

    /* renamed from: l */
    public C25478n f53027l;

    /* renamed from: m */
    public C23900c f53028m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21162c0(Modality modality, C25478n nVar, C25491z zVar, C20989e eVar, C25069e eVar2, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, C25435d0 d0Var) {
        super(zVar.mo53399b(), eVar, eVar2, d0Var);
        if (modality == null) {
            m49467A(0);
            throw null;
        } else if (nVar == null) {
            m49467A(1);
            throw null;
        } else if (eVar == null) {
            m49467A(3);
            throw null;
        } else if (d0Var != null) {
            this.f53028m = null;
            this.f53023h = modality;
            this.f53027l = nVar;
            this.f53024i = zVar;
            this.f53021f = z;
            this.f53022g = z2;
            this.f53025j = z3;
            this.f53026k = kind;
        } else {
            m49467A(5);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49467A(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: G */
    public final boolean mo53414G() {
        return false;
    }

    /* renamed from: H0 */
    public final boolean mo53415H0() {
        return false;
    }

    /* renamed from: I0 */
    public final void mo53416I0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m49467A(14);
            throw null;
        }
    }

    /* renamed from: J */
    public final boolean mo53417J() {
        return this.f53021f;
    }

    /* renamed from: J0 */
    public final boolean mo53418J0() {
        return false;
    }

    /* renamed from: K0 */
    public final boolean mo53419K0() {
        return false;
    }

    /* renamed from: L0 */
    public final CallableMemberDescriptor mo53420L0(C25442g gVar, Modality modality, C25453l lVar, CallableMemberDescriptor.Kind kind) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: N0 */
    public final ArrayList mo53421N0(boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList(0);
        for (C25491z zVar : mo53426Y().mo53440d()) {
            if (z) {
                obj = zVar.getGetter();
            } else {
                obj = zVar.getSetter();
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: O */
    public final C25433c0 mo53422O() {
        return mo53426Y().mo53422O();
    }

    /* renamed from: R */
    public final C25433c0 mo53423R() {
        return mo53426Y().mo53423R();
    }

    /* renamed from: V */
    public final boolean mo53424V() {
        return false;
    }

    /* renamed from: Y */
    public final C25491z mo53426Y() {
        C25491z zVar = this.f53024i;
        if (zVar != null) {
            return zVar;
        }
        m49467A(12);
        throw null;
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        return this.f53022g;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25478n nVar = this.f53027l;
        if (nVar != null) {
            return nVar;
        }
        m49467A(10);
        throw null;
    }

    public final List<C25448i0> getTypeParameters() {
        List<C25448i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49467A(8);
        throw null;
    }

    /* renamed from: j0 */
    public final boolean mo53431j0() {
        return false;
    }

    /* renamed from: l0 */
    public abstract C23902d m49484a();

    /* renamed from: p */
    public final CallableMemberDescriptor.Kind mo53433p() {
        CallableMemberDescriptor.Kind kind = this.f53026k;
        if (kind != null) {
            return kind;
        }
        m49467A(6);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: q0 */
    public final boolean mo53435q0() {
        return false;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality modality = this.f53023h;
        if (modality != null) {
            return modality;
        }
        m49467A(9);
        throw null;
    }

    /* renamed from: w */
    public final boolean mo53437w() {
        return this.f53025j;
    }

    /* renamed from: w0 */
    public final C23900c mo53438w0() {
        return this.f53028m;
    }

    /* renamed from: y0 */
    public final <V> V mo53439y0(C23894a.C23895a<V> aVar) {
        return null;
    }

    /* renamed from: c */
    public final C23900c mo53408c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m49467A(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }
}
