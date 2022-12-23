package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cf0.C21133g;
import cf0.C21140n;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import gg0.C23417b;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kg0.C23780d;
import kh0.C23789e;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import og0.C24592g;
import og0.C24605t;
import p389bl.C13637c;
import p583jk.C17884p;
import p584jl.C17885a;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25440f;
import zf0.C25442g;

public final class JvmPackageScope implements MemberScope {

    /* renamed from: f */
    public static final /* synthetic */ C24866j<Object>[] f60622f = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    public final C23780d f60623b;

    /* renamed from: c */
    public final LazyJavaPackageFragment f60624c;

    /* renamed from: d */
    public final LazyJavaPackageScope f60625d;

    /* renamed from: e */
    public final C23789e f60626e;

    public JvmPackageScope(C23780d dVar, C24605t tVar, LazyJavaPackageFragment lazyJavaPackageFragment) {
        C24362h.m61211f(tVar, "jPackage");
        C24362h.m61211f(lazyJavaPackageFragment, "packageFragment");
        this.f60623b = dVar;
        this.f60624c = lazyJavaPackageFragment;
        this.f60625d = new LazyJavaPackageScope(dVar, tVar, lazyJavaPackageFragment);
        this.f60626e = dVar.f60080a.f60055a.mo59019d(new JvmPackageScope$kotlinScopes$2(this));
    }

    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        MemberScope[] h = mo59516h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            C21140n.m49439a0(memberScope.mo53530a(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f60625d.mo53530a());
        return linkedHashSet;
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        mo59517i(eVar, noLookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f60625d;
        MemberScope[] h = mo59516h();
        Collection b = lazyJavaPackageScope.mo53531b(eVar, noLookupLocation);
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            b = C17885a.m44392C(b, memberScope.mo53531b(eVar, noLookupLocation));
        }
        if (b == null) {
            return EmptySet.f60175b;
        }
        return b;
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        mo59517i(eVar, noLookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f60625d;
        MemberScope[] h = mo59516h();
        Collection c = lazyJavaPackageScope.mo53532c(eVar, noLookupLocation);
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            c = C17885a.m44392C(c, memberScope.mo53532c(eVar, noLookupLocation));
        }
        if (c == null) {
            return EmptySet.f60175b;
        }
        return c;
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        MemberScope[] h = mo59516h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            C21140n.m49439a0(memberScope.mo53533d(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f60625d.mo53533d());
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.f60625d;
        MemberScope[] h = mo59516h();
        Collection<C25442g> e = lazyJavaPackageScope.mo53492e(dVar, lVar);
        int length = h.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            e = C17885a.m44392C(e, memberScope.mo53492e(dVar, lVar));
        }
        if (e == null) {
            return EmptySet.f60175b;
        }
        return e;
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        boolean z;
        Iterable iterable;
        MemberScope[] h = mo59516h();
        C24362h.m61211f(h, "<this>");
        if (h.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iterable = EmptyList.f60173b;
        } else {
            iterable = new C21133g(h);
        }
        HashSet s = C13637c.m34076s(iterable);
        if (s == null) {
            return null;
        }
        s.addAll(this.f60625d.mo53493f());
        return s;
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        mo59517i(eVar, noLookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f60625d;
        lazyJavaPackageScope.getClass();
        C25437e eVar2 = null;
        C25432c v = lazyJavaPackageScope.mo59548v(eVar, (C24592g) null);
        if (v != null) {
            return v;
        }
        MemberScope[] h = mo59516h();
        int i = 0;
        int length = h.length;
        while (i < length) {
            MemberScope memberScope = h[i];
            i++;
            C25437e g = memberScope.mo58433g(eVar, noLookupLocation);
            if (g != null) {
                if (!(g instanceof C25440f) || !((C25440f) g).mo53434p0()) {
                    return g;
                }
                if (eVar2 == null) {
                    eVar2 = g;
                }
            }
        }
        return eVar2;
    }

    /* renamed from: h */
    public final MemberScope[] mo59516h() {
        return (MemberScope[]) C19958a.m47435j(this.f60626e, f60622f[0]);
    }

    /* renamed from: i */
    public final void mo59517i(C25069e eVar, C23417b bVar) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(bVar, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C17884p.m44347R(this.f60623b.f60080a.f60068n, (NoLookupLocation) bVar, this.f60624c, eVar);
    }

    public final String toString() {
        return C24362h.m61216k(this.f60624c, "scope for ");
    }
}
