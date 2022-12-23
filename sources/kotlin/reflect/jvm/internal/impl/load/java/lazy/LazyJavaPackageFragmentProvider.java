package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import fg0.C23376t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg0.C23777b;
import kg0.C23780d;
import kg0.C23783g;
import kh0.C23785a;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25066c;
import zf0.C25488w;

public final class LazyJavaPackageFragmentProvider implements C25488w {

    /* renamed from: a */
    public final C23780d f60609a;

    /* renamed from: b */
    public final C23785a<C25066c, LazyJavaPackageFragment> f60610b;

    public LazyJavaPackageFragmentProvider(C23777b bVar) {
        C23780d dVar = new C23780d(bVar, C23783g.C23784a.f60086a, new InitializedLazyImpl(null));
        this.f60609a = dVar;
        this.f60610b = dVar.f60080a.f60055a.mo59017b();
    }

    /* renamed from: a */
    public final void mo53521a(C25066c cVar, ArrayList arrayList) {
        C24362h.m61211f(cVar, "fqName");
        C24361g.m61168j(mo59508d(cVar), arrayList);
    }

    /* renamed from: b */
    public final List<LazyJavaPackageFragment> mo53522b(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return C17875h.m44282F(mo59508d(cVar));
    }

    /* renamed from: c */
    public final boolean mo53523c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        if (this.f60609a.f60080a.f60056b.mo58415a(cVar) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final LazyJavaPackageFragment mo59508d(C25066c cVar) {
        C23376t a = this.f60609a.f60080a.f60056b.mo58415a(cVar);
        if (a == null) {
            return null;
        }
        return (LazyJavaPackageFragment) ((LockBasedStorageManager.C24138b) this.f60610b).mo60222d(cVar, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, a));
    }

    /* renamed from: n */
    public final Collection mo53524n(C25066c cVar, C24236l lVar) {
        List list;
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(lVar, "nameFilter");
        LazyJavaPackageFragment d = mo59508d(cVar);
        if (d == null) {
            list = null;
        } else {
            list = (List) d.f60669l.invoke();
        }
        if (list == null) {
            return EmptyList.f60173b;
        }
        return list;
    }

    public final String toString() {
        return C24362h.m61216k(this.f60609a.f60080a.f60069o, "LazyJavaPackageFragmentProvider of module ");
    }
}
