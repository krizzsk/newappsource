package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kg0.C23780d;
import kh0.C23788d;
import kh0.C23790f;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import lf0.C24236l;
import lg0.C24248a;
import lg0.C24251c;
import mf0.C24362h;
import og0.C24592g;
import og0.C24605t;
import ug0.C25069e;
import ug0.C25071g;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;

public final class LazyJavaPackageScope extends C24251c {

    /* renamed from: n */
    public final C24605t f60672n;

    /* renamed from: o */
    public final LazyJavaPackageFragment f60673o;

    /* renamed from: p */
    public final C23790f<Set<String>> f60674p;

    /* renamed from: q */
    public final C23788d<C23931a, C25432c> f60675q;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$a */
    public static final class C23931a {

        /* renamed from: a */
        public final C25069e f60676a;

        /* renamed from: b */
        public final C24592g f60677b;

        public C23931a(C25069e eVar, C24592g gVar) {
            C24362h.m61211f(eVar, "name");
            this.f60676a = eVar;
            this.f60677b = gVar;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C23931a) && C24362h.m61206a(this.f60676a, ((C23931a) obj).f60676a);
        }

        public final int hashCode() {
            return this.f60676a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b */
    public static abstract class C23932b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$a */
        public static final class C23933a extends C23932b {

            /* renamed from: a */
            public final C25432c f60678a;

            public C23933a(C25432c cVar) {
                this.f60678a = cVar;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b */
        public static final class C23934b extends C23932b {

            /* renamed from: a */
            public static final C23934b f60679a = new C23934b();
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$c */
        public static final class C23935c extends C23932b {

            /* renamed from: a */
            public static final C23935c f60680a = new C23935c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(C23780d dVar, C24605t tVar, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(dVar);
        C24362h.m61211f(tVar, "jPackage");
        C24362h.m61211f(lazyJavaPackageFragment, "ownerDescriptor");
        this.f60672n = tVar;
        this.f60673o = lazyJavaPackageFragment;
        this.f60674p = dVar.f60080a.f60055a.mo59022g(new LazyJavaPackageScope$knownClassNamesInPackage$1(dVar, this));
        this.f60675q = dVar.f60080a.f60055a.mo59016a(new LazyJavaPackageScope$classes$1(dVar, this));
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return EmptyList.f60173b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<zf0.C25442g> mo53492e(eh0.C23306d r5, lf0.C24236l<? super ug0.C25069e, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            mf0.C24362h.m61211f(r5, r0)
            java.lang.String r0 = "nameFilter"
            mf0.C24362h.m61211f(r6, r0)
            eh0.d$a r0 = eh0.C23306d.f59088c
            int r0 = eh0.C23306d.f59097l
            int r1 = eh0.C23306d.f59090e
            r0 = r0 | r1
            boolean r5 = r5.mo58439a(r0)
            if (r5 != 0) goto L_0x001a
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.f60173b
            goto L_0x005d
        L_0x001a:
            kh0.e<java.util.Collection<zf0.g>> r5 = r4.f60686d
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r5.next()
            r2 = r1
            zf0.g r2 = (zf0.C25442g) r2
            boolean r3 = r2 instanceof zf0.C25432c
            if (r3 == 0) goto L_0x0055
            zf0.c r2 = (zf0.C25432c) r2
            ug0.e r2 = r2.getName()
            java.lang.String r3 = "it.name"
            mf0.C24362h.m61210e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x002b
            r0.add(r1)
            goto L_0x002b
        L_0x005c:
            r5 = r0
        L_0x005d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.mo53492e(eh0.d, lf0.l):java.util.Collection");
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return mo59548v(eVar, (C24592g) null);
    }

    /* renamed from: h */
    public final Set<C25069e> mo59533h(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        if (!dVar.mo58439a(C23306d.f59090e)) {
            return EmptySet.f60175b;
        }
        Set<String> set = (Set) this.f60674p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String i : set) {
                hashSet.add(C25069e.m62820i(i));
            }
            return hashSet;
        }
        C24605t tVar = this.f60672n;
        C24236l<Object, Boolean> lVar2 = lVar;
        if (lVar == null) {
            lVar2 = FunctionsKt.f61392a;
        }
        EmptyList I = tVar.mo58521I(lVar2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I.getClass();
        return linkedHashSet;
    }

    /* renamed from: i */
    public final Set<C25069e> mo59534i(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        return EmptySet.f60175b;
    }

    /* renamed from: k */
    public final C24248a mo59536k() {
        return C24248a.C24249a.f61530a;
    }

    /* renamed from: m */
    public final void mo59537m(LinkedHashSet linkedHashSet, C25069e eVar) {
        C24362h.m61211f(eVar, "name");
    }

    /* renamed from: o */
    public final Set mo59539o(C23306d dVar) {
        C24362h.m61211f(dVar, "kindFilter");
        return EmptySet.f60175b;
    }

    /* renamed from: q */
    public final C25442g mo59541q() {
        return this.f60673o;
    }

    /* renamed from: v */
    public final C25432c mo59548v(C25069e eVar, C24592g gVar) {
        boolean z;
        C25069e eVar2 = C25071g.f63266a;
        C24362h.m61211f(eVar, "name");
        String f = eVar.mo61604f();
        C24362h.m61210e(f, "name.asString()");
        boolean z2 = false;
        if (f.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !eVar.f63264c) {
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        Set set = (Set) this.f60674p.invoke();
        if (gVar != null || set == null || set.contains(eVar.mo61604f())) {
            return this.f60675q.invoke(new C23931a(eVar, gVar));
        }
        return null;
    }
}
