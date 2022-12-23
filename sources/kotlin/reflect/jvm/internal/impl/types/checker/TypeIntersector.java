package kotlin.reflect.jvm.internal.impl.types.checker;

import ce0.C21100e;
import cf0.C21136j;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import lh0.C24263e0;
import lh0.C24272i;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;
import mh0.C24381f;
import mh0.C24382g;
import p389bl.C13637c;
import p583jk.C17875h;
import p845um.C19958a;

public final class TypeIntersector {

    /* renamed from: a */
    public static final TypeIntersector f61365a = new TypeIntersector();

    public enum ResultNullability {
        ;

        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL() {
                super("ACCEPT_NULL", 1, (DefaultConstructorMarker) null);
            }

            public final ResultNullability combine(C24306u0 u0Var) {
                C24362h.m61211f(u0Var, "nextType");
                return getResultNullability(u0Var);
            }
        }

        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL() {
                super("NOT_NULL", 3, (DefaultConstructorMarker) null);
            }

            public final ResultNullability combine(C24306u0 u0Var) {
                C24362h.m61211f(u0Var, "nextType");
                return this;
            }
        }

        public static final class START extends ResultNullability {
            public START() {
                super("START", 0, (DefaultConstructorMarker) null);
            }

            public final ResultNullability combine(C24306u0 u0Var) {
                C24362h.m61211f(u0Var, "nextType");
                return getResultNullability(u0Var);
            }
        }

        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN() {
                super("UNKNOWN", 2, (DefaultConstructorMarker) null);
            }

            public final ResultNullability combine(C24306u0 u0Var) {
                C24362h.m61211f(u0Var, "nextType");
                ResultNullability resultNullability = getResultNullability(u0Var);
                if (resultNullability == ResultNullability.ACCEPT_NULL) {
                    return this;
                }
                return resultNullability;
            }
        }

        public abstract ResultNullability combine(C24306u0 u0Var);

        public final ResultNullability getResultNullability(C24306u0 u0Var) {
            C24362h.m61211f(u0Var, "<this>");
            if (u0Var.mo60412P0()) {
                return ACCEPT_NULL;
            }
            if ((u0Var instanceof C24272i) && (((C24272i) u0Var).f61566c instanceof C24263e0)) {
                return NOT_NULL;
            }
            if (u0Var instanceof C24263e0) {
                return UNKNOWN;
            }
            if (C13637c.m34081x(C17875h.m44309t(false, true, C14226d.f35756k, (KotlinTypePreparator) null, (C24378d) null, 24), C21100e.m49358p0(u0Var), TypeCheckerState.C24156a.C24158b.f61350a)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m60514a(java.util.AbstractCollection r7, lf0.C24240p r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            mf0.C24362h.m61210e(r7, r1)
        L_0x000e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r7.next()
            lh0.z r1 = (lh0.C24312z) r1
            boolean r2 = r0.isEmpty()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0023
            goto L_0x0051
        L_0x0023:
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r2.next()
            lh0.z r5 = (lh0.C24312z) r5
            if (r5 == r1) goto L_0x004d
            java.lang.String r6 = "lower"
            mf0.C24362h.m61210e(r5, r6)
            java.lang.String r6 = "upper"
            mf0.C24362h.m61210e(r1, r6)
            java.lang.Object r5 = r8.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 == 0) goto L_0x0027
            r3 = 1
        L_0x0051:
            if (r3 == 0) goto L_0x000e
            r7.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.m60514a(java.util.AbstractCollection, lf0.p):java.util.ArrayList");
    }

    /* renamed from: b */
    public final C24312z mo60265b(ArrayList arrayList) {
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24312z zVar = (C24312z) it.next();
            if (zVar.mo60411O0() instanceof IntersectionTypeConstructor) {
                Collection<C24307v> n = zVar.mo60411O0().mo53459n();
                C24362h.m61210e(n, "type.constructor.supertypes");
                ArrayList arrayList3 = new ArrayList(C21136j.m49436X(n, 10));
                for (C24307v vVar : n) {
                    C24362h.m61210e(vVar, "it");
                    C24312z G0 = C21100e.m49309G0(vVar);
                    if (zVar.mo60412P0()) {
                        G0 = G0.mo59559S0(true);
                    }
                    arrayList3.add(G0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(zVar);
            }
        }
        ResultNullability resultNullability = ResultNullability.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            resultNullability = resultNullability.combine((C24306u0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C24312z zVar2 = (C24312z) it3.next();
            if (resultNullability == ResultNullability.NOT_NULL) {
                if (zVar2 instanceof C24381f) {
                    C24381f fVar = (C24381f) zVar2;
                    C24362h.m61211f(fVar, "<this>");
                    zVar2 = new C24381f(fVar.f61717c, fVar.f61718d, fVar.f61719e, fVar.f61720f, fVar.f61721g, true);
                }
                C24362h.m61211f(zVar2, "<this>");
                C24312z a = C24272i.C24273a.m60845a(zVar2, false);
                if (a == null && (a = C19958a.m47437l(zVar2)) == null) {
                    zVar2 = zVar2.mo59559S0(false);
                } else {
                    zVar2 = a;
                }
            }
            linkedHashSet.add(zVar2);
        }
        if (linkedHashSet.size() == 1) {
            return (C24312z) C23825c.m58490B0(linkedHashSet);
        }
        new C24165x7a6103fb(linkedHashSet);
        ArrayList a2 = m60514a(linkedHashSet, new C24166x702eebb8(this));
        a2.isEmpty();
        C24312z a3 = IntegerLiteralTypeConstructor.Companion.m60279a(a2);
        if (a3 != null) {
            return a3;
        }
        C24382g.f61723b.getClass();
        ArrayList a4 = m60514a(a2, new C24167xc97d8c34(C24382g.C24383a.f61725b));
        a4.isEmpty();
        if (a4.size() < 2) {
            return (C24312z) C23825c.m58490B0(a4);
        }
        return new IntersectionTypeConstructor(linkedHashSet).mo60233a();
    }
}
