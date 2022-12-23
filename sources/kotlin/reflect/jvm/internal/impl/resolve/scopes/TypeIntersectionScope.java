package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.appboy.models.outgoing.FacebookUser;
import eh0.C23300a;
import eh0.C23306d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25442g;

public final class TypeIntersectionScope extends C23300a {

    /* renamed from: b */
    public final MemberScope f61226b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$a */
    public static final class C24120a {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope m60322a(java.lang.String r3, java.util.Collection r4) {
            /*
                java.lang.String r0 = "message"
                mf0.C24362h.m61211f(r3, r0)
                java.lang.String r0 = "types"
                mf0.C24362h.m61211f(r4, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = cf0.C21136j.m49436X(r4, r1)
                r0.<init>(r1)
                java.util.Iterator r4 = r4.iterator()
            L_0x0019:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x002d
                java.lang.Object r1 = r4.next()
                lh0.v r1 = (lh0.C24307v) r1
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = r1.mo59564o()
                r0.add(r1)
                goto L_0x0019
            L_0x002d:
                rh0.c r4 = p584jl.C17885a.m44440h0(r0)
                int r0 = r4.f62759b
                r1 = 1
                if (r0 == 0) goto L_0x0059
                r2 = 0
                if (r0 == r1) goto L_0x0051
                eh0.b r0 = new eh0.b
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] r2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[r2]
                java.lang.Object[] r2 = r4.toArray(r2)
                if (r2 == 0) goto L_0x0049
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] r2 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) r2
                r0.<init>(r3, r2)
                goto L_0x005b
            L_0x0049:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r3.<init>(r4)
                throw r3
            L_0x0051:
                java.lang.Object r3 = r4.get(r2)
                r0 = r3
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) r0
                goto L_0x005b
            L_0x0059:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.C24119a.f61217b
            L_0x005b:
                int r3 = r4.f62759b
                if (r3 > r1) goto L_0x0060
                return r0
            L_0x0060:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope
                r3.<init>(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.C24120a.m60322a(java.lang.String, java.util.Collection):kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope");
        }
    }

    public TypeIntersectionScope(MemberScope memberScope) {
        this.f61226b = memberScope;
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return OverridingUtilsKt.m60264a(super.mo53531b(eVar, noLookupLocation), TypeIntersectionScope$getContributedFunctions$1.f61228f);
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return OverridingUtilsKt.m60264a(super.mo53532c(eVar, noLookupLocation), TypeIntersectionScope$getContributedVariables$1.f61229f);
    }

    /* renamed from: e */
    public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        Collection<C25442g> e = super.mo53492e(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : e) {
            if (((C25442g) next) instanceof C23894a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return C23825c.m58527x0((List) pair.mo59067b(), OverridingUtilsKt.m60264a((List) pair.mo59066a(), TypeIntersectionScope$getContributedDescriptors$2.f61227f));
    }

    /* renamed from: i */
    public final MemberScope mo58435i() {
        return this.f61226b;
    }
}
