package lh0;

import com.usebutton.sdk.internal.models.Configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kh0.C23792h;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25443g0;
import zf0.C25448i0;

/* renamed from: lh0.f */
public final class C24264f extends C24255b {

    /* renamed from: c */
    public final C25432c f61555c;

    /* renamed from: d */
    public final List<C25448i0> f61556d;

    /* renamed from: e */
    public final Collection<C24307v> f61557e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24264f(C25432c cVar, List<? extends C25448i0> list, Collection<C24307v> collection, C23792h hVar) {
        super(hVar);
        if (cVar == null) {
            m60814j(0);
            throw null;
        } else if (list == null) {
            m60814j(1);
            throw null;
        } else if (collection == null) {
            m60814j(2);
            throw null;
        } else if (hVar != null) {
            this.f61555c = cVar;
            this.f61556d = Collections.unmodifiableList(new ArrayList(list));
            this.f61557e = Collections.unmodifiableCollection(collection);
        } else {
            m60814j(3);
            throw null;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m60814j(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = Configuration.KEY_PARAMETERS;
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: c */
    public final Collection<C24307v> mo53486c() {
        Collection<C24307v> collection = this.f61557e;
        if (collection != null) {
            return collection;
        }
        m60814j(6);
        throw null;
    }

    /* renamed from: f */
    public final C25443g0 mo53488f() {
        return C25443g0.C25444a.f63738a;
    }

    public final List<C25448i0> getParameters() {
        List<C25448i0> list = this.f61556d;
        if (list != null) {
            return list;
        }
        m60814j(4);
        throw null;
    }

    /* renamed from: k */
    public final C25432c mo59523k() {
        C25432c cVar = this.f61555c;
        if (cVar != null) {
            return cVar;
        }
        m60814j(5);
        throw null;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return true;
    }

    public final String toString() {
        return C25260c.m63390g(this.f61555c).mo61591b();
    }
}
