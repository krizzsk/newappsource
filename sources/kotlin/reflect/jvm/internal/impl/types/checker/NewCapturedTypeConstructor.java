package kotlin.reflect.jvm.internal.impl.types.checker;

import bf0.C21049c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lf0.C24225a;
import lh0.C24281l0;
import lh0.C24306u0;
import lh0.C24307v;
import mf0.C24362h;
import mh0.C24378d;
import yg0.C25302b;
import zf0.C25437e;
import zf0.C25448i0;

public final class NewCapturedTypeConstructor implements C25302b {

    /* renamed from: a */
    public final C24281l0 f61360a;

    /* renamed from: b */
    public C24225a<? extends List<? extends C24306u0>> f61361b;

    /* renamed from: c */
    public final NewCapturedTypeConstructor f61362c;

    /* renamed from: d */
    public final C25448i0 f61363d;

    /* renamed from: e */
    public final C21049c f61364e;

    public NewCapturedTypeConstructor() {
        throw null;
    }

    public NewCapturedTypeConstructor(C24281l0 l0Var, C24225a<? extends List<? extends C24306u0>> aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, C25448i0 i0Var) {
        this.f61360a = l0Var;
        this.f61361b = aVar;
        this.f61362c = newCapturedTypeConstructor;
        this.f61363d = i0Var;
        this.f61364e = C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new NewCapturedTypeConstructor$_supertypes$2(this));
    }

    /* renamed from: a */
    public final void mo60259a(ArrayList arrayList) {
        this.f61361b = new NewCapturedTypeConstructor$initializeSupertypes$2(arrayList);
    }

    /* renamed from: b */
    public final NewCapturedTypeConstructor mo60260b(C24378d dVar) {
        NewCapturedTypeConstructor$refine$1$1 newCapturedTypeConstructor$refine$1$1;
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C24281l0 c = this.f61360a.mo60242c(dVar);
        C24362h.m61210e(c, "projection.refine(kotlinTypeRefiner)");
        if (this.f61361b == null) {
            newCapturedTypeConstructor$refine$1$1 = null;
        } else {
            newCapturedTypeConstructor$refine$1$1 = new NewCapturedTypeConstructor$refine$1$1(this, dVar);
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f61362c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(c, newCapturedTypeConstructor$refine$1$1, newCapturedTypeConstructor, this.f61363d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<NewCapturedTypeConstructor> cls2 = NewCapturedTypeConstructor.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!C24362h.m61206a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
            NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f61362c;
            if (newCapturedTypeConstructor2 == null) {
                newCapturedTypeConstructor2 = this;
            }
            NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f61362c;
            if (newCapturedTypeConstructor3 != null) {
                newCapturedTypeConstructor = newCapturedTypeConstructor3;
            }
            if (newCapturedTypeConstructor2 == newCapturedTypeConstructor) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
    }

    public final List<C25448i0> getParameters() {
        return EmptyList.f60173b;
    }

    public final C24281l0 getProjection() {
        return this.f61360a;
    }

    public final int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f61362c;
        return newCapturedTypeConstructor == null ? super.hashCode() : newCapturedTypeConstructor.hashCode();
    }

    /* renamed from: m */
    public final C23867c mo53458m() {
        C24307v type = this.f61360a.getType();
        C24362h.m61210e(type, "projection.type");
        return TypeUtilsKt.m60522g(type);
    }

    /* renamed from: n */
    public final Collection mo53459n() {
        List list = (List) this.f61364e.getValue();
        if (list == null) {
            return EmptyList.f60173b;
        }
        return list;
    }

    /* renamed from: o */
    public final C25437e mo53460o() {
        return null;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CapturedType(");
        k.append(this.f61360a);
        k.append(')');
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCapturedTypeConstructor(C24281l0 l0Var, C24225a aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, C25448i0 i0Var, int i) {
        this(l0Var, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : i0Var);
    }
}
