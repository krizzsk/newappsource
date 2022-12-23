package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ag0.C20989e;
import cg0.C21153a0;
import java.util.List;
import kg0.C23780d;
import kh0.C23789e;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import mf0.C24365j;
import og0.C24605t;
import og0.C24610y;
import p389bl.C13637c;
import qg0.C24761l;
import sf0.C24866j;
import ug0.C25066c;
import zf0.C25435d0;

public final class LazyJavaPackageFragment extends C21153a0 {

    /* renamed from: n */
    public static final /* synthetic */ C24866j<Object>[] f60664n;

    /* renamed from: h */
    public final C24605t f60665h;

    /* renamed from: i */
    public final C23780d f60666i;

    /* renamed from: j */
    public final C23789e f60667j;

    /* renamed from: k */
    public final JvmPackageScope f60668k;

    /* renamed from: l */
    public final C23789e<List<C25066c>> f60669l;

    /* renamed from: m */
    public final C20989e f60670m;

    static {
        Class<LazyJavaPackageFragment> cls = LazyJavaPackageFragment.class;
        f60664n = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(C23780d dVar, C24605t tVar) {
        super(dVar.f60080a.f60069o, tVar.mo58523f());
        C20989e eVar;
        C24362h.m61211f(dVar, "outerContext");
        C24362h.m61211f(tVar, "jPackage");
        this.f60665h = tVar;
        C23780d a = ContextKt.m59008a(dVar, this, (C24610y) null, 6);
        this.f60666i = a;
        this.f60667j = a.f60080a.f60055a.mo59019d(new LazyJavaPackageFragment$binaryClasses$2(this));
        this.f60668k = new JvmPackageScope(a, tVar, this);
        this.f60669l = a.f60080a.f60055a.mo59021f(EmptyList.f60173b, new LazyJavaPackageFragment$subPackages$1(this));
        if (a.f60080a.f60076v.f60555c) {
            eVar = C20989e.C20990a.f52739a;
        } else {
            eVar = C13637c.m34049D(a, tVar);
        }
        this.f60670m = eVar;
        a.f60080a.f60055a.mo59019d(new LazyJavaPackageFragment$partToFacade$2(this));
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        return new C24761l(this);
    }

    public final C20989e getAnnotations() {
        return this.f60670m;
    }

    /* renamed from: o */
    public final MemberScope mo53528o() {
        return this.f60668k;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Lazy Java package fragment: ");
        k.append(this.f53008f);
        k.append(" of module ");
        k.append(this.f60666i.f60080a.f60069o);
        return k.toString();
    }
}
