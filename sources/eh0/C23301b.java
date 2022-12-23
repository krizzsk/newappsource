package eh0;

import cf0.C21132f;
import cf0.C21133g;
import cf0.C21140n;
import com.appboy.models.outgoing.FacebookUser;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import p389bl.C13637c;
import p584jl.C17885a;
import rh0.C24819c;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25440f;
import zf0.C25442g;

/* renamed from: eh0.b */
public final class C23301b implements MemberScope {

    /* renamed from: b */
    public final String f59083b;

    /* renamed from: c */
    public final MemberScope[] f59084c;

    /* renamed from: eh0.b$a */
    public static final class C23302a {
        /* renamed from: a */
        public static MemberScope m57389a(String str, List list) {
            C24362h.m61211f(str, "debugName");
            C24362h.m61211f(list, "scopes");
            C24819c cVar = new C24819c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MemberScope memberScope = (MemberScope) it.next();
                if (memberScope != MemberScope.C24119a.f61217b) {
                    if (memberScope instanceof C23301b) {
                        MemberScope[] memberScopeArr = ((C23301b) memberScope).f59084c;
                        C24362h.m61211f(memberScopeArr, "elements");
                        cVar.addAll(C21132f.m49428K0(memberScopeArr));
                    } else {
                        cVar.add(memberScope);
                    }
                }
            }
            int i = cVar.f62759b;
            if (i == 0) {
                return MemberScope.C24119a.f61217b;
            }
            if (i == 1) {
                return (MemberScope) cVar.get(0);
            }
            Object[] array = cVar.toArray(new MemberScope[0]);
            if (array != null) {
                return new C23301b(str, (MemberScope[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public C23301b(String str, MemberScope[] memberScopeArr) {
        this.f59083b = str;
        this.f59084c = memberScopeArr;
    }

    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        MemberScope[] memberScopeArr = this.f59084c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = memberScopeArr.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            C21140n.m49439a0(memberScope.mo53530a(), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        MemberScope[] memberScopeArr = this.f59084c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.f60173b;
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].mo53531b(eVar, noLookupLocation);
        }
        Collection collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = C17885a.m44392C(collection, memberScope.mo53531b(eVar, noLookupLocation));
        }
        if (collection == null) {
            return EmptySet.f60175b;
        }
        return collection;
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        MemberScope[] memberScopeArr = this.f59084c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.f60173b;
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].mo53532c(eVar, noLookupLocation);
        }
        Collection collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = C17885a.m44392C(collection, memberScope.mo53532c(eVar, noLookupLocation));
        }
        if (collection == null) {
            return EmptySet.f60175b;
        }
        return collection;
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        MemberScope[] memberScopeArr = this.f59084c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = memberScopeArr.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            C21140n.m49439a0(memberScope.mo53533d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        MemberScope[] memberScopeArr = this.f59084c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.f60173b;
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].mo53492e(dVar, lVar);
        }
        Collection<C25442g> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = C17885a.m44392C(collection, memberScope.mo53492e(dVar, lVar));
        }
        if (collection == null) {
            return EmptySet.f60175b;
        }
        return collection;
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        boolean z;
        Iterable iterable;
        MemberScope[] memberScopeArr = this.f59084c;
        C24362h.m61211f(memberScopeArr, "<this>");
        if (memberScopeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iterable = EmptyList.f60173b;
        } else {
            iterable = new C21133g(memberScopeArr);
        }
        return C13637c.m34076s(iterable);
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        MemberScope[] memberScopeArr = this.f59084c;
        int length = memberScopeArr.length;
        C25437e eVar2 = null;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = memberScopeArr[i];
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

    public final String toString() {
        return this.f59083b;
    }
}
