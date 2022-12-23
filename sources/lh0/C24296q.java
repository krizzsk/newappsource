package lh0;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23865a;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import lh0.C24289p;
import zf0.C25437e;
import zf0.C25448i0;

/* renamed from: lh0.q */
public final class C24296q implements C24274i0 {

    /* renamed from: a */
    public final /* synthetic */ C24289p.C24291b f61592a;

    /* renamed from: b */
    public final /* synthetic */ String f61593b;

    public C24296q(String str, C24289p.C24291b bVar) {
        this.f61592a = bVar;
        this.f61593b = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m60958a(int i) {
        String str = i != 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 3 ? 2 : 3)];
        if (i != 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
        } else {
            objArr[0] = "kotlinTypeRefiner";
        }
        if (i == 1) {
            objArr[1] = "getSupertypes";
        } else if (i == 2) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
        } else if (i != 4) {
            objArr[1] = "getParameters";
        } else {
            objArr[1] = "refine";
        }
        if (i == 3) {
            objArr[2] = "refine";
        }
        String format = String.format(str, objArr);
        throw (i != 3 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public final List<C25448i0> getParameters() {
        EmptyList emptyList = EmptyList.f60173b;
        if (emptyList != null) {
            return emptyList;
        }
        m60958a(0);
        throw null;
    }

    /* renamed from: m */
    public final C23867c mo53458m() {
        C23865a aVar = C23865a.f60307f;
        if (aVar != null) {
            return aVar;
        }
        m60958a(2);
        throw null;
    }

    /* renamed from: n */
    public final Collection<C24307v> mo53459n() {
        EmptyList emptyList = EmptyList.f60173b;
        if (emptyList != null) {
            return emptyList;
        }
        m60958a(1);
        throw null;
    }

    /* renamed from: o */
    public final C25437e mo53460o() {
        return this.f61592a;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return false;
    }

    public final String toString() {
        return this.f61593b;
    }
}
