package lh0;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import mh0.C24378d;

/* renamed from: lh0.n0 */
public final class C24285n0 extends C24283m0 {

    /* renamed from: a */
    public final Variance f61577a;

    /* renamed from: b */
    public final C24307v f61578b;

    public C24285n0(C24307v vVar, Variance variance) {
        if (variance == null) {
            m60889d(0);
            throw null;
        } else if (vVar != null) {
            this.f61577a = variance;
            this.f61578b = vVar;
        } else {
            m60889d(1);
            throw null;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m60889d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public final boolean mo60240a() {
        return false;
    }

    /* renamed from: b */
    public final Variance mo60241b() {
        Variance variance = this.f61577a;
        if (variance != null) {
            return variance;
        }
        m60889d(4);
        throw null;
    }

    /* renamed from: c */
    public final C24281l0 mo60242c(C24378d dVar) {
        if (dVar != null) {
            return new C24285n0(dVar.mo60522A(this.f61578b), this.f61577a);
        }
        m60889d(6);
        throw null;
    }

    public final C24307v getType() {
        C24307v vVar = this.f61578b;
        if (vVar != null) {
            return vVar;
        }
        m60889d(5);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24285n0(C24307v vVar) {
        this(vVar, Variance.INVARIANT);
        if (vVar != null) {
        } else {
            m60889d(2);
            throw null;
        }
    }
}
