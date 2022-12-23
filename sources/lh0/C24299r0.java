package lh0;

import ag0.C20989e;
import ce0.C21100e;
import com.appboy.Constants;
import com.usebutton.sdk.internal.models.Configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24236l;
import mh0.C24378d;
import mh0.C24385i;
import rh0.C24823d;
import zf0.C25432c;
import zf0.C25440f;
import zf0.C25448i0;

/* renamed from: lh0.r0 */
public final class C24299r0 {

    /* renamed from: a */
    public static final C24286o f61596a = new C24286o(C24289p.m60916f("DONT_CARE", C24289p.f61586b), C24289p.m60912b("DONT_CARE"));

    /* renamed from: b */
    public static final C24286o f61597b = C24289p.m60914d("Cannot be inferred");

    /* renamed from: c */
    public static final C24300a f61598c = new C24300a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final C24300a f61599d = new C24300a("UNIT_EXPECTED_TYPE");

    /* renamed from: lh0.r0$a */
    public static class C24300a extends C24277k {

        /* renamed from: c */
        public final String f61600c;

        public C24300a(String str) {
            this.f61600c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* renamed from: a1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m60985a1(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = 3
                goto L_0x0014
            L_0x0013:
                r5 = 2
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAnnotations"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAnnotations"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: lh0.C24299r0.C24300a.m60985a1(int):void");
        }

        /* renamed from: Q0 */
        public final C24307v mo59558Q0(C24378d dVar) {
            if (dVar != null) {
                return this;
            }
            m60985a1(3);
            throw null;
        }

        /* renamed from: S0 */
        public final /* bridge */ /* synthetic */ C24306u0 mo59559S0(boolean z) {
            mo60403V0(z);
            throw null;
        }

        /* renamed from: T0 */
        public final C24306u0 mo59560T0(C24378d dVar) {
            if (dVar != null) {
                return this;
            }
            m60985a1(3);
            throw null;
        }

        /* renamed from: U0 */
        public final /* bridge */ /* synthetic */ C24306u0 mo59561U0(C20989e eVar) {
            mo60404W0(eVar);
            throw null;
        }

        /* renamed from: V0 */
        public final C24312z mo60403V0(boolean z) {
            throw new IllegalStateException(this.f61600c);
        }

        /* renamed from: W0 */
        public final C24312z mo60404W0(C20989e eVar) {
            if (eVar == null) {
                m60985a1(0);
                throw null;
            }
            throw new IllegalStateException(this.f61600c);
        }

        /* renamed from: X0 */
        public final C24312z mo60405X0() {
            throw new IllegalStateException(this.f61600c);
        }

        /* renamed from: Y0 */
        public final C24312z mo60406Y0(C24378d dVar) {
            if (dVar != null) {
                return this;
            }
            m60985a1(3);
            throw null;
        }

        /* renamed from: Z0 */
        public final C24277k mo60407Z0(C24312z zVar) {
            if (zVar == null) {
                m60985a1(2);
                throw null;
            }
            throw new IllegalStateException(this.f61600c);
        }

        public final String toString() {
            String str = this.f61600c;
            if (str != null) {
                return str;
            }
            m60985a1(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m60969a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 49 || i3 == 54 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 57:
                case 58:
                case 59:
                case 60:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 49 || i3 == 54 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 57:
                case 58:
                case 59:
                case 60:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 49:
            case 54:
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = Configuration.KEY_PARAMETERS;
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = Constants.APPBOY_PUSH_CONTENT_KEY;
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
            case 46:
                objArr[0] = "isSpecialType";
                break;
            case 45:
                objArr[0] = "shouldStopAt";
                break;
            case 47:
                objArr[0] = "parameterDescriptor";
                break;
            case 48:
            case 52:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 50:
            case 51:
                objArr[0] = "supertypes";
                break;
            case 53:
            case 56:
                objArr[0] = "expectedType";
                break;
            case 55:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 11 || i3 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i3 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 49) {
                    if (i3 != 54) {
                        if (!(i3 == 6 || i3 == 7)) {
                            switch (i3) {
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 49:
            case 54:
            case 57:
            case 58:
            case 59:
            case 60:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 46:
                objArr[2] = "contains";
                break;
            case 44:
            case 45:
                objArr[2] = "containsStoppingAt";
                break;
            case 47:
                objArr[2] = "makeStarProjection";
                break;
            case 48:
            case 50:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 51:
                objArr[2] = "findByFqName";
                break;
            case 52:
            case 53:
            case 55:
            case 56:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 61:
                objArr[2] = "isTypeParameter";
                break;
            case 62:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 64:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 49 || i3 == 54 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 57:
                case 58:
                case 59:
                case 60:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m60970b(C24307v vVar) {
        if (vVar == null) {
            m60969a(28);
            throw null;
        } else if (vVar.mo60412P0()) {
            return true;
        } else {
            if (!C21100e.m49356o0(vVar) || !m60970b(((C24298r) vVar.mo60450R0()).f61595d)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m60971c(C24307v vVar, C24236l<C24306u0, Boolean> lVar) {
        if (lVar != null) {
            return m60972d(vVar, lVar, (C24236l<C24307v, Boolean>) null, (C24823d<C24307v>) null);
        }
        m60969a(43);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, lh0.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m60972d(lh0.C24307v r5, lf0.C24236l<lh0.C24306u0, java.lang.Boolean> r6, lf0.C24236l<lh0.C24307v, java.lang.Boolean> r7, rh0.C24823d<lh0.C24307v> r8) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x00c2
            r1 = 0
            if (r5 != 0) goto L_0x0007
            return r1
        L_0x0007:
            lh0.u0 r2 = r5.mo60450R0()
            boolean r3 = m60984p(r5)
            if (r3 == 0) goto L_0x001c
            java.lang.Object r5 = r6.invoke(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            if (r8 == 0) goto L_0x0025
            boolean r3 = r8.contains(r5)
            if (r3 == 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            if (r3 == 0) goto L_0x0033
            return r4
        L_0x0033:
            if (r7 == 0) goto L_0x0042
            java.lang.Object r3 = r7.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0042
            return r1
        L_0x0042:
            if (r8 != 0) goto L_0x0049
            rh0.d r8 = new rh0.d
            r8.<init>()
        L_0x0049:
            r8.add(r5)
            boolean r3 = r2 instanceof lh0.C24298r
            if (r3 == 0) goto L_0x0053
            r0 = r2
            lh0.r r0 = (lh0.C24298r) r0
        L_0x0053:
            if (r0 == 0) goto L_0x0066
            lh0.z r3 = r0.f61594c
            boolean r3 = m60972d(r3, r6, r7, r8)
            if (r3 != 0) goto L_0x0065
            lh0.z r0 = r0.f61595d
            boolean r0 = m60972d(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            return r4
        L_0x0066:
            boolean r0 = r2 instanceof lh0.C24272i
            if (r0 == 0) goto L_0x0075
            lh0.i r2 = (lh0.C24272i) r2
            lh0.z r0 = r2.f61566c
            boolean r0 = m60972d(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x0075
            return r4
        L_0x0075:
            lh0.i0 r0 = r5.mo60411O0()
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r2 == 0) goto L_0x0099
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r0
            java.util.LinkedHashSet<lh0.v> r5 = r0.f61334b
            java.util.Iterator r5 = r5.iterator()
        L_0x0085:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r5.next()
            lh0.v r0 = (lh0.C24307v) r0
            boolean r0 = m60972d(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x0085
            return r4
        L_0x0098:
            return r1
        L_0x0099:
            java.util.List r5 = r5.mo60410N0()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r5.next()
            lh0.l0 r0 = (lh0.C24281l0) r0
            boolean r2 = r0.mo60240a()
            if (r2 == 0) goto L_0x00b4
            goto L_0x00a1
        L_0x00b4:
            lh0.v r0 = r0.getType()
            boolean r0 = m60972d(r0, r6, r7, r8)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a1
            return r4
        L_0x00bf:
            r5 = move-exception
            throw r5
        L_0x00c1:
            return r1
        L_0x00c2:
            r5 = 46
            m60969a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C24299r0.m60972d(lh0.v, lf0.l, lf0.l, rh0.d):boolean");
    }

    /* renamed from: e */
    public static List<C24281l0> m60973e(List<C25448i0> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C25448i0 q : list) {
                arrayList.add(new C24285n0(q.mo53412q()));
            }
            List<C24281l0> K0 = C23825c.m58499K0(arrayList);
            if (K0 != null) {
                return K0;
            }
            m60969a(17);
            throw null;
        }
        m60969a(16);
        throw null;
    }

    /* renamed from: f */
    public static boolean m60974f(C24307v vVar) {
        C24307v vVar2;
        if (vVar == null) {
            m60969a(29);
            throw null;
        } else if (vVar.mo60411O0().mo53460o() instanceof C25432c) {
            return false;
        } else {
            TypeSubstitutor d = TypeSubstitutor.m60493d(vVar);
            Collection<C24307v> n = vVar.mo60411O0().mo53459n();
            ArrayList arrayList = new ArrayList(n.size());
            for (C24307v next : n) {
                if (next != null) {
                    C24307v k = d.mo60251k(next, Variance.INVARIANT);
                    if (k != null) {
                        vVar2 = m60979k(k, vVar.mo60412P0());
                    } else {
                        vVar2 = null;
                    }
                    if (vVar2 != null) {
                        arrayList.add(vVar2);
                    }
                } else {
                    m60969a(21);
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (m60975g((C24307v) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m60975g(C24307v vVar) {
        if (vVar == null) {
            m60969a(27);
            throw null;
        } else if (vVar.mo60412P0()) {
            return true;
        } else {
            if (C21100e.m49356o0(vVar) && m60975g(((C24298r) vVar.mo60450R0()).f61595d)) {
                return true;
            }
            if (vVar.mo60450R0() instanceof C24272i) {
                return false;
            }
            if (m60976h(vVar)) {
                return m60974f(vVar);
            }
            if (vVar instanceof C24257c) {
                C25448i0 a = ((C24385i) ((C24257c) vVar).f61545c).mo60532a();
                if (a == null || m60974f(a.mo53412q())) {
                    return true;
                }
                return false;
            }
            C24274i0 O0 = vVar.mo60411O0();
            if (O0 instanceof IntersectionTypeConstructor) {
                for (C24307v g : O0.mo53459n()) {
                    if (m60975g(g)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m60976h(C24307v vVar) {
        C25448i0 i0Var = null;
        if (vVar == null) {
            m60969a(61);
            throw null;
        } else if (vVar != null) {
            if (vVar.mo60411O0().mo53460o() instanceof C25448i0) {
                i0Var = (C25448i0) vVar.mo60411O0().mo53460o();
            }
            if (i0Var != null || (vVar.mo60411O0() instanceof C24385i)) {
                return true;
            }
            return false;
        } else {
            m60969a(64);
            throw null;
        }
    }

    /* renamed from: i */
    public static C24306u0 m60977i(C24307v vVar) {
        if (vVar != null) {
            return m60978j(vVar, false);
        }
        m60969a(2);
        throw null;
    }

    /* renamed from: j */
    public static C24306u0 m60978j(C24307v vVar, boolean z) {
        if (vVar != null) {
            C24306u0 S0 = vVar.mo60450R0().mo59559S0(z);
            if (S0 != null) {
                return S0;
            }
            m60969a(4);
            throw null;
        }
        m60969a(3);
        throw null;
    }

    /* renamed from: k */
    public static C24307v m60979k(C24307v vVar, boolean z) {
        if (vVar == null) {
            m60969a(8);
            throw null;
        } else if (z) {
            return m60978j(vVar, true);
        } else {
            return vVar;
        }
    }

    /* renamed from: l */
    public static C24312z m60980l(C24312z zVar, boolean z) {
        if (zVar == null) {
            m60969a(5);
            throw null;
        } else if (z) {
            C24312z V0 = zVar.mo59559S0(true);
            if (V0 != null) {
                return V0;
            }
            m60969a(6);
            throw null;
        } else if (zVar != null) {
            return zVar;
        } else {
            m60969a(7);
            throw null;
        }
    }

    /* renamed from: m */
    public static StarProjectionImpl m60981m(C25448i0 i0Var) {
        if (i0Var != null) {
            return new StarProjectionImpl(i0Var);
        }
        m60969a(47);
        throw null;
    }

    /* renamed from: n */
    public static C24312z m60982n(C24274i0 i0Var, MemberScope memberScope, C24236l<C24378d, C24312z> lVar) {
        if (i0Var == null) {
            m60969a(12);
            throw null;
        } else if (memberScope == null) {
            m60969a(13);
            throw null;
        } else if (lVar != null) {
            return KotlinTypeFactory.m60478g(C20989e.C20990a.f52739a, i0Var, m60973e(i0Var.getParameters()), false, memberScope, lVar);
        } else {
            m60969a(14);
            throw null;
        }
    }

    /* renamed from: o */
    public static C24312z m60983o(C25440f fVar, MemberScope memberScope, C24236l lVar) {
        if (!C24289p.m60918h(fVar)) {
            return m60982n(fVar.mo53481j(), memberScope, lVar);
        }
        return C24289p.m60914d("Unsubstituted type for " + fVar);
    }

    /* renamed from: p */
    public static boolean m60984p(C24307v vVar) {
        if (vVar == null) {
            m60969a(0);
            throw null;
        } else if (vVar == f61598c || vVar == f61599d) {
            return true;
        } else {
            return false;
        }
    }
}
