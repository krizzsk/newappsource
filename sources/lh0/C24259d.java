package lh0;

import com.appboy.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import lf0.C24236l;
import mf0.C24362h;
import oh0.C24613b;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24619h;
import oh0.C24620i;
import oh0.C24621j;
import oh0.C24622k;
import oh0.C24623l;
import oh0.C24627o;
import p358af.C13437d;
import p583jk.C17875h;
import rh0.C24819c;
import rh0.C24823d;
import zf0.C25448i0;

/* renamed from: lh0.d */
public final class C24259d {

    /* renamed from: lh0.d$a */
    public /* synthetic */ class C24260a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61549a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f61550b;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            iArr[TypeVariance.INV.ordinal()] = 1;
            iArr[TypeVariance.OUT.ordinal()] = 2;
            iArr[TypeVariance.IN.ordinal()] = 3;
            f61549a = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            f61550b = iArr2;
        }
    }

    /* renamed from: a */
    public static final boolean m60800a(C24623l lVar, TypeCheckerState typeCheckerState, C24618g gVar, C24618g gVar2, boolean z) {
        boolean z2;
        Set<C24617f> i0 = lVar.mo42740i0(gVar);
        if ((i0 instanceof Collection) && i0.isEmpty()) {
            return false;
        }
        for (C24617f fVar : i0) {
            if (C24362h.m61206a(lVar.mo42748o(fVar), lVar.mo42733f(gVar2)) || (z && m60807h(typeCheckerState, gVar2, fVar))) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static List m60801b(TypeCheckerState typeCheckerState, C24618g gVar, C24621j jVar) {
        TypeCheckerState.C24156a aVar;
        C24623l lVar = typeCheckerState.f61344c;
        lVar.mo42752r(gVar, jVar);
        if (!lVar.mo42717U(jVar) && lVar.mo42756v(gVar)) {
            return EmptyList.f60173b;
        }
        if (!lVar.mo42743k(jVar)) {
            C24819c cVar = new C24819c();
            typeCheckerState.mo60245b();
            ArrayDeque<C24618g> arrayDeque = typeCheckerState.f61348g;
            C24362h.m61208c(arrayDeque);
            C24823d dVar = typeCheckerState.f61349h;
            C24362h.m61208c(dVar);
            arrayDeque.push(gVar);
            while (!arrayDeque.isEmpty()) {
                if (dVar.f62767c <= 1000) {
                    C24618g pop = arrayDeque.pop();
                    C24362h.m61210e(pop, "current");
                    if (dVar.add(pop)) {
                        C24618g q = lVar.mo42751q(pop, CaptureStatus.FOR_SUBTYPING);
                        if (q == null) {
                            q = pop;
                        }
                        if (lVar.mo42747n(lVar.mo42733f(q), jVar)) {
                            cVar.add(q);
                            aVar = TypeCheckerState.C24156a.C24159c.f61351a;
                        } else if (lVar.mo42728c0(q) == 0) {
                            aVar = TypeCheckerState.C24156a.C24158b.f61350a;
                        } else {
                            aVar = typeCheckerState.f61344c.mo42697B(q);
                        }
                        if (!(!C24362h.m61206a(aVar, TypeCheckerState.C24156a.C24159c.f61351a))) {
                            aVar = null;
                        }
                        if (aVar != null) {
                            C24623l lVar2 = typeCheckerState.f61344c;
                            for (C24617f a : lVar2.mo42704H(lVar2.mo42733f(pop))) {
                                arrayDeque.add(aVar.mo60247a(typeCheckerState, a));
                            }
                        }
                    }
                } else {
                    StringBuilder o = C13437d.m33709o("Too many supertypes for type: ", gVar, ". Supertypes = ");
                    o.append(C23825c.m58520q0(dVar, (String) null, (String) null, (String) null, (C24236l) null, 63));
                    throw new IllegalStateException(o.toString().toString());
                }
            }
            typeCheckerState.mo60244a();
            return cVar;
        } else if (!lVar.mo42747n(lVar.mo42733f(gVar), jVar)) {
            return EmptyList.f60173b;
        } else {
            C24312z q2 = lVar.mo42751q(gVar, CaptureStatus.FOR_SUBTYPING);
            if (q2 != null) {
                gVar = q2;
            }
            return C17875h.m44280D(gVar);
        }
    }

    /* renamed from: c */
    public static List m60802c(TypeCheckerState typeCheckerState, C24618g gVar, C24621j jVar) {
        boolean z;
        List b = m60801b(typeCheckerState, gVar, jVar);
        C24623l lVar = typeCheckerState.f61344c;
        if (b.size() < 2) {
            return b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C24619h d0 = lVar.mo42730d0((C24618g) next);
            int s = lVar.mo42753s(d0);
            int i = 0;
            while (true) {
                if (i >= s) {
                    break;
                }
                int i2 = i + 1;
                if (lVar.mo42701E(lVar.mo42744k0(lVar.mo42749p(d0, i))) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
                i = i2;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return b;
    }

    /* renamed from: d */
    public static boolean m60803d(TypeCheckerState typeCheckerState, C24617f fVar, C24617f fVar2) {
        C24362h.m61211f(typeCheckerState, "state");
        C24362h.m61211f(fVar, Constants.APPBOY_PUSH_CONTENT_KEY);
        C24362h.m61211f(fVar2, "b");
        C24623l lVar = typeCheckerState.f61344c;
        if (fVar == fVar2) {
            return true;
        }
        if (m60805f(lVar, fVar) && m60805f(lVar, fVar2)) {
            C24617f c = typeCheckerState.mo60246c(typeCheckerState.f61346e.mo19845u(fVar));
            C24617f c2 = typeCheckerState.mo60246c(typeCheckerState.f61346e.mo19845u(fVar2));
            C24618g h0 = lVar.mo42738h0(c);
            if (!lVar.mo42747n(lVar.mo42748o(c), lVar.mo42748o(c2))) {
                return false;
            }
            if (lVar.mo42728c0(h0) == 0) {
                if (lVar.mo42742j0(c) || lVar.mo42742j0(c2) || lVar.mo42712P(h0) == lVar.mo42712P(lVar.mo42738h0(c2))) {
                    return true;
                }
                return false;
            }
        }
        if (!m60807h(typeCheckerState, fVar, fVar2) || !m60807h(typeCheckerState, fVar2, fVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static C24622k m60804e(C24623l lVar, C24617f fVar, C24618g gVar) {
        int c0 = lVar.mo42728c0(fVar);
        int i = 0;
        while (true) {
            C24620i iVar = null;
            if (i >= c0) {
                return null;
            }
            int i2 = i + 1;
            C24620i J = lVar.mo42706J(fVar, i);
            boolean z = true;
            if (!lVar.mo42734f0(J)) {
                iVar = J;
            }
            if (iVar != null) {
                C24306u0 k0 = lVar.mo42744k0(iVar);
                if (!lVar.mo42739i(lVar.mo42738h0(k0)) || !lVar.mo42739i(lVar.mo42738h0(gVar))) {
                    z = false;
                }
                if (!C24362h.m61206a(k0, gVar) && (!z || !C24362h.m61206a(lVar.mo42748o(k0), lVar.mo42748o(gVar)))) {
                    C24622k e = m60804e(lVar, k0, gVar);
                    if (e != null) {
                        return e;
                    }
                }
            }
            i = i2;
        }
        return lVar.mo42720X(lVar.mo42748o(fVar), i);
    }

    /* renamed from: f */
    public static boolean m60805f(C24623l lVar, C24617f fVar) {
        if (!lVar.mo42737h(lVar.mo42748o(fVar)) || lVar.mo42761z(fVar) || lVar.mo42705I(fVar) || !C24362h.m61206a(lVar.mo42733f(lVar.mo42738h0(fVar)), lVar.mo42733f(lVar.mo42711O(fVar)))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m60806g(TypeCheckerState typeCheckerState, C24619h hVar, C24618g gVar) {
        boolean z;
        boolean z2;
        C24362h.m61211f(typeCheckerState, "<this>");
        C24362h.m61211f(hVar, "capturedSubArguments");
        C24623l lVar = typeCheckerState.f61344c;
        C24274i0 f = lVar.mo42733f(gVar);
        int s = lVar.mo42753s(hVar);
        int C = lVar.mo42699C(f);
        if (s != C || s != lVar.mo42728c0(gVar)) {
            return false;
        }
        int i = 0;
        while (i < C) {
            int i2 = i + 1;
            C24620i J = lVar.mo42706J(gVar, i);
            if (!lVar.mo42734f0(J)) {
                C24306u0 k0 = lVar.mo42744k0(J);
                C24620i p = lVar.mo42749p(hVar, i);
                lVar.mo42736g0(p);
                TypeVariance typeVariance = TypeVariance.INV;
                C24306u0 k02 = lVar.mo42744k0(p);
                TypeVariance u = lVar.mo42755u(lVar.mo42720X(f, i));
                TypeVariance g0 = lVar.mo42736g0(J);
                C24362h.m61211f(u, "declared");
                C24362h.m61211f(g0, "useSite");
                if (u == typeVariance) {
                    u = g0;
                } else if (!(g0 == typeVariance || u == g0)) {
                    u = null;
                }
                if (u == null) {
                    return typeCheckerState.f61342a;
                }
                if (u != typeVariance || (!m60808i(lVar, k02, k0, f) && !m60808i(lVar, k0, k02, f))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    int i3 = typeCheckerState.f61347f;
                    if (i3 <= 100) {
                        typeCheckerState.f61347f = i3 + 1;
                        int i4 = C24260a.f61549a[u.ordinal()];
                        if (i4 == 1) {
                            z2 = m60803d(typeCheckerState, k02, k0);
                        } else if (i4 == 2) {
                            z2 = m60807h(typeCheckerState, k02, k0);
                        } else if (i4 == 3) {
                            z2 = m60807h(typeCheckerState, k0, k02);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        typeCheckerState.f61347f--;
                        if (!z2) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(C24362h.m61216k(k02, "Arguments depth is too high. Some related argument: ").toString());
                    }
                } else {
                    continue;
                }
            }
            i = i2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:292:0x053b, code lost:
        if (r3 != false) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        if (r10 != false) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02f0 A[LOOP:3: B:156:0x02b4->B:172:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x02eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0102  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m60807h(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, oh0.C24617f r19, oh0.C24617f r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "state"
            mf0.C24362h.m61211f(r0, r3)
            java.lang.String r3 = "subType"
            mf0.C24362h.m61211f(r1, r3)
            java.lang.String r4 = "superType"
            mf0.C24362h.m61211f(r2, r4)
            r5 = 1
            if (r1 != r2) goto L_0x001a
            goto L_0x0693
        L_0x001a:
            oh0.l r6 = r0.f61344c
            d3.c r7 = r0.f61346e
            lh0.v r1 = r7.mo19845u(r1)
            oh0.f r1 = r0.mo60246c(r1)
            d3.c r7 = r0.f61346e
            lh0.v r2 = r7.mo19845u(r2)
            oh0.f r2 = r0.mo60246c(r2)
            oh0.g r7 = r6.mo42738h0(r1)
            oh0.g r8 = r6.mo42711O(r2)
            oh0.l r9 = r0.f61344c
            boolean r10 = r9.mo42696A(r7)
            r11 = 0
            if (r10 != 0) goto L_0x019b
            boolean r10 = r9.mo42696A(r8)
            if (r10 == 0) goto L_0x0049
            goto L_0x019b
        L_0x0049:
            boolean r10 = r9.mo42721Y(r7)
            if (r10 == 0) goto L_0x00a4
            boolean r10 = r9.mo42721Y(r8)
            if (r10 == 0) goto L_0x00a4
            lh0.i r10 = r9.mo42716T(r7)
            if (r10 != 0) goto L_0x005d
            r10 = r7
            goto L_0x0061
        L_0x005d:
            lh0.z r10 = r9.mo42745l(r10)
        L_0x0061:
            lh0.i r11 = r9.mo42716T(r8)
            if (r11 != 0) goto L_0x0069
            r11 = r8
            goto L_0x006d
        L_0x0069:
            lh0.z r11 = r9.mo42745l(r11)
        L_0x006d:
            lh0.i0 r10 = r9.mo42733f(r10)
            lh0.i0 r11 = r9.mo42733f(r11)
            if (r10 == r11) goto L_0x0078
            goto L_0x0091
        L_0x0078:
            boolean r10 = r9.mo42705I(r7)
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9.mo42705I(r8)
            if (r10 == 0) goto L_0x0085
            goto L_0x0091
        L_0x0085:
            boolean r7 = r9.mo42712P(r7)
            if (r7 == 0) goto L_0x0093
            boolean r7 = r9.mo42712P(r8)
            if (r7 != 0) goto L_0x0093
        L_0x0091:
            r7 = 0
            goto L_0x0094
        L_0x0093:
            r7 = 1
        L_0x0094:
            if (r7 != 0) goto L_0x009d
            boolean r7 = r0.f61343b
            if (r7 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r7 = 0
            goto L_0x009e
        L_0x009d:
            r7 = 1
        L_0x009e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x01cb
        L_0x00a4:
            boolean r10 = r9.mo42715S(r7)
            if (r10 != 0) goto L_0x0194
            boolean r10 = r9.mo42715S(r8)
            if (r10 == 0) goto L_0x00b2
            goto L_0x0194
        L_0x00b2:
            lh0.i r10 = r9.mo42716T(r8)
            if (r10 != 0) goto L_0x00ba
            r10 = r8
            goto L_0x00be
        L_0x00ba:
            lh0.z r10 = r9.mo42745l(r10)
        L_0x00be:
            oh0.b r10 = r9.mo42729d(r10)
            if (r10 != 0) goto L_0x00c6
            r11 = 0
            goto L_0x00ca
        L_0x00c6:
            lh0.u0 r11 = r9.mo42724a0(r10)
        L_0x00ca:
            if (r10 == 0) goto L_0x010c
            if (r11 == 0) goto L_0x010c
            boolean r10 = r9.mo42712P(r8)
            if (r10 == 0) goto L_0x00da
            oh0.f r10 = r9.mo42754t(r11)
        L_0x00d8:
            r11 = r10
            goto L_0x00e5
        L_0x00da:
            boolean r10 = r9.mo42705I(r8)
            if (r10 == 0) goto L_0x00e5
            lh0.u0 r10 = r9.mo42707K(r11)
            goto L_0x00d8
        L_0x00e5:
            mf0.C24362h.m61211f(r7, r3)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r10 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER
            int[] r12 = lh0.C24259d.C24260a.f61550b
            int r10 = r10.ordinal()
            r10 = r12[r10]
            if (r10 == r5) goto L_0x0102
            r12 = 2
            if (r10 == r12) goto L_0x00f8
            goto L_0x010c
        L_0x00f8:
            boolean r10 = m60807h(r0, r7, r11)
            if (r10 == 0) goto L_0x010c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L_0x01cb
        L_0x0102:
            boolean r7 = m60807h(r0, r7, r11)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x01cb
        L_0x010c:
            lh0.i0 r10 = r9.mo42733f(r8)
            boolean r11 = r9.mo42714R(r10)
            if (r11 == 0) goto L_0x0147
            r9.mo42712P(r8)
            java.util.Collection r8 = r9.mo42704H(r10)
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0128
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0128
            goto L_0x0140
        L_0x0128:
            java.util.Iterator r8 = r8.iterator()
        L_0x012c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0140
            java.lang.Object r9 = r8.next()
            oh0.f r9 = (oh0.C24617f) r9
            boolean r9 = m60807h(r0, r7, r9)
            if (r9 != 0) goto L_0x012c
            r7 = 0
            goto L_0x0141
        L_0x0140:
            r7 = 1
        L_0x0141:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x01cb
        L_0x0147:
            lh0.i0 r10 = r9.mo42733f(r7)
            boolean r11 = r7 instanceof oh0.C24613b
            if (r11 != 0) goto L_0x017d
            boolean r11 = r9.mo42714R(r10)
            if (r11 == 0) goto L_0x0192
            java.util.Collection r10 = r9.mo42704H(r10)
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x0164
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0164
            goto L_0x017a
        L_0x0164:
            java.util.Iterator r10 = r10.iterator()
        L_0x0168:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x017a
            java.lang.Object r11 = r10.next()
            oh0.f r11 = (oh0.C24617f) r11
            boolean r11 = r11 instanceof oh0.C24613b
            if (r11 != 0) goto L_0x0168
            r10 = 0
            goto L_0x017b
        L_0x017a:
            r10 = 1
        L_0x017b:
            if (r10 == 0) goto L_0x0192
        L_0x017d:
            oh0.l r10 = r0.f61344c
            oh0.k r7 = m60804e(r10, r8, r7)
            if (r7 == 0) goto L_0x0192
            lh0.i0 r8 = r9.mo42733f(r8)
            boolean r7 = r9.mo42718V(r7, r8)
            if (r7 == 0) goto L_0x0192
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L_0x01cb
        L_0x0192:
            r7 = 0
            goto L_0x01cb
        L_0x0194:
            boolean r7 = r0.f61343b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x01cb
        L_0x019b:
            boolean r10 = r0.f61342a
            if (r10 == 0) goto L_0x01a2
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L_0x01cb
        L_0x01a2:
            boolean r10 = r9.mo42712P(r7)
            if (r10 == 0) goto L_0x01b1
            boolean r10 = r9.mo42712P(r8)
            if (r10 != 0) goto L_0x01b1
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x01cb
        L_0x01b1:
            lh0.z r7 = r9.mo42723a(r7, r11)
            lh0.z r8 = r9.mo42723a(r8, r11)
            java.lang.String r10 = "a"
            mf0.C24362h.m61211f(r7, r10)
            java.lang.String r10 = "b"
            mf0.C24362h.m61211f(r8, r10)
            boolean r7 = p583jk.C17875h.m44293T(r9, r7, r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x01cb:
            if (r7 != 0) goto L_0x0688
            mf0.C24362h.m61211f(r1, r3)
            mf0.C24362h.m61211f(r2, r4)
            oh0.g r1 = r6.mo42738h0(r1)
            oh0.g r2 = r6.mo42711O(r2)
            oh0.l r6 = r0.f61344c
            mf0.C24362h.m61211f(r1, r3)
            mf0.C24362h.m61211f(r2, r4)
            oh0.l r3 = r0.f61344c
            boolean r4 = r3.mo42712P(r2)
            java.lang.String r7 = "current"
            java.lang.String r8 = ". Supertypes = "
            java.lang.String r9 = "Too many supertypes for type: "
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r4 == 0) goto L_0x01f5
            goto L_0x02ee
        L_0x01f5:
            boolean r4 = r3.mo42705I(r1)
            if (r4 == 0) goto L_0x01fd
            goto L_0x02ee
        L_0x01fd:
            boolean r4 = r1 instanceof oh0.C24613b
            if (r4 == 0) goto L_0x020c
            r4 = r1
            oh0.b r4 = (oh0.C24613b) r4
            boolean r4 = r3.mo42732e0(r4)
            if (r4 == 0) goto L_0x020c
            goto L_0x02ee
        L_0x020c:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$b r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24158b.f61350a
            boolean r4 = p389bl.C13637c.m34081x(r0, r1, r4)
            if (r4 == 0) goto L_0x0216
            goto L_0x02ee
        L_0x0216:
            boolean r4 = r3.mo42705I(r2)
            if (r4 == 0) goto L_0x021e
            goto L_0x031c
        L_0x021e:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$d r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24160d.f61352a
            boolean r4 = p389bl.C13637c.m34081x(r0, r2, r4)
            if (r4 == 0) goto L_0x0228
            goto L_0x031c
        L_0x0228:
            boolean r4 = r3.mo42756v(r1)
            if (r4 == 0) goto L_0x0230
            goto L_0x031c
        L_0x0230:
            lh0.i0 r3 = r3.mo42733f(r2)
            java.lang.String r4 = "end"
            mf0.C24362h.m61211f(r3, r4)
            oh0.l r4 = r0.f61344c
            boolean r11 = r4.mo42713Q(r1)
            if (r11 == 0) goto L_0x0242
            goto L_0x0254
        L_0x0242:
            boolean r11 = r4.mo42712P(r1)
            if (r11 == 0) goto L_0x024a
            r11 = 0
            goto L_0x025e
        L_0x024a:
            boolean r11 = r0.f61343b
            if (r11 == 0) goto L_0x0256
            boolean r11 = r4.mo42715S(r1)
            if (r11 == 0) goto L_0x0256
        L_0x0254:
            r11 = 1
            goto L_0x025e
        L_0x0256:
            lh0.i0 r11 = r4.mo42733f(r1)
            boolean r11 = r4.mo42747n(r11, r3)
        L_0x025e:
            if (r11 == 0) goto L_0x0262
            goto L_0x02ee
        L_0x0262:
            r18.mo60245b()
            java.util.ArrayDeque<oh0.g> r11 = r0.f61348g
            mf0.C24362h.m61208c(r11)
            rh0.d r12 = r0.f61349h
            mf0.C24362h.m61208c(r12)
            r11.push(r1)
        L_0x0272:
            boolean r13 = r11.isEmpty()
            r13 = r13 ^ r5
            if (r13 == 0) goto L_0x0319
            int r13 = r12.f62767c
            if (r13 > r10) goto L_0x02f9
            java.lang.Object r13 = r11.pop()
            oh0.g r13 = (oh0.C24618g) r13
            mf0.C24362h.m61210e(r13, r7)
            boolean r14 = r12.add(r13)
            if (r14 != 0) goto L_0x028d
            goto L_0x0272
        L_0x028d:
            boolean r10 = r4.mo42712P(r13)
            if (r10 == 0) goto L_0x0296
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c r10 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24159c.f61351a
            goto L_0x0298
        L_0x0296:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$b r10 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24158b.f61350a
        L_0x0298:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c r14 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24159c.f61351a
            boolean r14 = mf0.C24362h.m61206a(r10, r14)
            r5 = r5 ^ r14
            if (r5 == 0) goto L_0x02a2
            goto L_0x02a3
        L_0x02a2:
            r10 = 0
        L_0x02a3:
            if (r10 != 0) goto L_0x02a6
            goto L_0x02f4
        L_0x02a6:
            oh0.l r5 = r0.f61344c
            lh0.i0 r13 = r5.mo42733f(r13)
            java.util.Collection r5 = r5.mo42704H(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x02b4:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x02f4
            java.lang.Object r13 = r5.next()
            oh0.f r13 = (oh0.C24617f) r13
            oh0.g r13 = r10.mo60247a(r0, r13)
            oh0.l r14 = r0.f61344c
            boolean r15 = r14.mo42713Q(r13)
            if (r15 == 0) goto L_0x02cd
            goto L_0x02df
        L_0x02cd:
            boolean r15 = r14.mo42712P(r13)
            if (r15 == 0) goto L_0x02d5
            r14 = 0
            goto L_0x02e9
        L_0x02d5:
            boolean r15 = r0.f61343b
            if (r15 == 0) goto L_0x02e1
            boolean r15 = r14.mo42715S(r13)
            if (r15 == 0) goto L_0x02e1
        L_0x02df:
            r14 = 1
            goto L_0x02e9
        L_0x02e1:
            lh0.i0 r15 = r14.mo42733f(r13)
            boolean r14 = r14.mo42747n(r15, r3)
        L_0x02e9:
            if (r14 == 0) goto L_0x02f0
            r18.mo60244a()
        L_0x02ee:
            r3 = 1
            goto L_0x031d
        L_0x02f0:
            r11.add(r13)
            goto L_0x02b4
        L_0x02f4:
            r5 = 1
            r10 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0272
        L_0x02f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = p358af.C13437d.m33709o(r9, r1, r8)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 63
            java.lang.String r2 = kotlin.collections.C23825c.m58520q0(r12, r13, r14, r15, r16, r17)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0319:
            r18.mo60244a()
        L_0x031c:
            r3 = 0
        L_0x031d:
            if (r3 != 0) goto L_0x0321
            goto L_0x0681
        L_0x0321:
            oh0.g r3 = r6.mo42738h0(r1)
            oh0.g r4 = r6.mo42711O(r2)
            oh0.l r5 = r0.f61344c
            boolean r10 = r5.mo42700D(r3)
            if (r10 != 0) goto L_0x0339
            boolean r10 = r5.mo42700D(r4)
            if (r10 != 0) goto L_0x0339
            goto L_0x03ad
        L_0x0339:
            boolean r10 = r5.mo42700D(r3)
            if (r10 == 0) goto L_0x0349
            boolean r10 = r5.mo42700D(r4)
            if (r10 == 0) goto L_0x0349
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x03ae
        L_0x0349:
            boolean r10 = r5.mo42700D(r3)
            if (r10 == 0) goto L_0x0359
            r10 = 0
            boolean r3 = m60800a(r5, r0, r3, r4, r10)
            if (r3 == 0) goto L_0x03ad
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x03ae
        L_0x0359:
            boolean r10 = r5.mo42700D(r4)
            if (r10 == 0) goto L_0x03ad
            lh0.i0 r10 = r5.mo42733f(r3)
            boolean r11 = r10 instanceof oh0.C24616e
            if (r11 == 0) goto L_0x03a0
            java.util.Collection r10 = r5.mo42704H(r10)
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x0376
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0376
            goto L_0x039b
        L_0x0376:
            java.util.Iterator r10 = r10.iterator()
        L_0x037a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x039b
            java.lang.Object r11 = r10.next()
            oh0.f r11 = (oh0.C24617f) r11
            lh0.z r11 = r5.mo42731e(r11)
            if (r11 != 0) goto L_0x038d
            goto L_0x0396
        L_0x038d:
            boolean r11 = r5.mo42700D(r11)
            r12 = 1
            if (r11 != r12) goto L_0x0396
            r11 = 1
            goto L_0x0397
        L_0x0396:
            r11 = 0
        L_0x0397:
            if (r11 == 0) goto L_0x037a
            r10 = 1
            goto L_0x039c
        L_0x039b:
            r10 = 0
        L_0x039c:
            if (r10 == 0) goto L_0x03a0
            r10 = 1
            goto L_0x03a1
        L_0x03a0:
            r10 = 0
        L_0x03a1:
            if (r10 != 0) goto L_0x03aa
            r10 = 1
            boolean r3 = m60800a(r5, r0, r4, r3, r10)
            if (r3 == 0) goto L_0x03ad
        L_0x03aa:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x03ae
        L_0x03ad:
            r3 = 0
        L_0x03ae:
            if (r3 != 0) goto L_0x0683
            lh0.i0 r3 = r6.mo42733f(r2)
            lh0.i0 r4 = r6.mo42733f(r1)
            boolean r4 = r6.mo42747n(r4, r3)
            if (r4 == 0) goto L_0x03c6
            int r4 = r6.mo42699C(r3)
            if (r4 != 0) goto L_0x03c6
            goto L_0x0659
        L_0x03c6:
            lh0.i0 r4 = r6.mo42733f(r2)
            boolean r4 = r6.mo42757w(r4)
            if (r4 == 0) goto L_0x03d2
            goto L_0x0659
        L_0x03d2:
            java.lang.String r4 = "superConstructor"
            mf0.C24362h.m61211f(r3, r4)
            oh0.l r4 = r0.f61344c
            boolean r5 = r4.mo42756v(r1)
            if (r5 == 0) goto L_0x03e5
            java.util.List r4 = m60802c(r0, r1, r3)
            goto L_0x04ad
        L_0x03e5:
            boolean r5 = r4.mo42717U(r3)
            if (r5 != 0) goto L_0x03f7
            boolean r5 = r4.mo42708L(r3)
            if (r5 != 0) goto L_0x03f7
            java.util.List r4 = m60801b(r0, r1, r3)
            goto L_0x04ad
        L_0x03f7:
            rh0.c r5 = new rh0.c
            r5.<init>()
            r18.mo60245b()
            java.util.ArrayDeque<oh0.g> r10 = r0.f61348g
            mf0.C24362h.m61208c(r10)
            rh0.d r11 = r0.f61349h
            mf0.C24362h.m61208c(r11)
            r10.push(r1)
        L_0x040c:
            boolean r12 = r10.isEmpty()
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x0488
            int r12 = r11.f62767c
            r13 = 1000(0x3e8, float:1.401E-42)
            if (r12 > r13) goto L_0x0469
            java.lang.Object r12 = r10.pop()
            oh0.g r12 = (oh0.C24618g) r12
            mf0.C24362h.m61210e(r12, r7)
            boolean r13 = r11.add(r12)
            if (r13 != 0) goto L_0x042a
            goto L_0x040c
        L_0x042a:
            boolean r13 = r4.mo42756v(r12)
            if (r13 == 0) goto L_0x0436
            r5.add(r12)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c r13 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24159c.f61351a
            goto L_0x0438
        L_0x0436:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$b r13 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24158b.f61350a
        L_0x0438:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c r14 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24159c.f61351a
            boolean r14 = mf0.C24362h.m61206a(r13, r14)
            r14 = r14 ^ 1
            if (r14 == 0) goto L_0x0443
            goto L_0x0444
        L_0x0443:
            r13 = 0
        L_0x0444:
            if (r13 != 0) goto L_0x0447
            goto L_0x040c
        L_0x0447:
            oh0.l r14 = r0.f61344c
            lh0.i0 r12 = r14.mo42733f(r12)
            java.util.Collection r12 = r14.mo42704H(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x0455:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x040c
            java.lang.Object r14 = r12.next()
            oh0.f r14 = (oh0.C24617f) r14
            oh0.g r14 = r13.mo60247a(r0, r14)
            r10.add(r14)
            goto L_0x0455
        L_0x0469:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = p358af.C13437d.m33709o(r9, r1, r8)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 63
            java.lang.String r2 = kotlin.collections.C23825c.m58520q0(r11, r12, r13, r14, r15, r16)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0488:
            r18.mo60244a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0494:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x04ad
            java.lang.Object r10 = r5.next()
            oh0.g r10 = (oh0.C24618g) r10
            java.lang.String r11 = "it"
            mf0.C24362h.m61210e(r10, r11)
            java.util.List r10 = m60802c(r0, r10, r3)
            cf0.C21140n.m49439a0(r10, r4)
            goto L_0x0494
        L_0x04ad:
            java.util.ArrayList r5 = new java.util.ArrayList
            r10 = 10
            int r11 = cf0.C21136j.m49436X(r4, r10)
            r5.<init>(r11)
            java.util.Iterator r4 = r4.iterator()
        L_0x04bc:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x04d8
            java.lang.Object r11 = r4.next()
            oh0.g r11 = (oh0.C24618g) r11
            oh0.f r12 = r0.mo60246c(r11)
            lh0.z r12 = r6.mo42731e(r12)
            if (r12 != 0) goto L_0x04d3
            goto L_0x04d4
        L_0x04d3:
            r11 = r12
        L_0x04d4:
            r5.add(r11)
            goto L_0x04bc
        L_0x04d8:
            int r4 = r5.size()
            if (r4 == 0) goto L_0x05c8
            r7 = 1
            if (r4 == r7) goto L_0x05b8
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r4 = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            int r7 = r6.mo42699C(r3)
            r4.<init>(r7)
            int r7 = r6.mo42699C(r3)
            r8 = 0
            r9 = 0
        L_0x04f0:
            if (r8 >= r7) goto L_0x058a
            int r11 = r8 + 1
            if (r9 != 0) goto L_0x0505
            oh0.k r9 = r6.mo42720X(r3, r8)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r9 = r6.mo42755u(r9)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r12 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT
            if (r9 == r12) goto L_0x0503
            goto L_0x0505
        L_0x0503:
            r9 = 0
            goto L_0x0506
        L_0x0505:
            r9 = 1
        L_0x0506:
            if (r9 == 0) goto L_0x050c
            r19 = r3
            goto L_0x0583
        L_0x050c:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r10 = cf0.C21136j.m49436X(r5, r10)
            r12.<init>(r10)
            java.util.Iterator r10 = r5.iterator()
        L_0x0519:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0576
            java.lang.Object r13 = r10.next()
            oh0.g r13 = (oh0.C24618g) r13
            oh0.i r14 = r6.mo42746m(r13, r8)
            if (r14 != 0) goto L_0x052e
            r19 = r3
            goto L_0x053e
        L_0x052e:
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r15 = r6.mo42736g0(r14)
            r19 = r3
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r3 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r15 != r3) goto L_0x053a
            r3 = 1
            goto L_0x053b
        L_0x053a:
            r3 = 0
        L_0x053b:
            if (r3 == 0) goto L_0x053e
            goto L_0x053f
        L_0x053e:
            r14 = 0
        L_0x053f:
            if (r14 == 0) goto L_0x054b
            lh0.u0 r3 = r6.mo42744k0(r14)
            r12.add(r3)
            r3 = r19
            goto L_0x0519
        L_0x054b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect type: "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r4 = ", subType: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", superType: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0576:
            r19 = r3
            lh0.u0 r3 = r6.mo42759y(r12)
            lh0.n0 r3 = r6.mo42741j(r3)
            r4.add(r3)
        L_0x0583:
            r10 = 10
            r3 = r19
            r8 = r11
            goto L_0x04f0
        L_0x058a:
            if (r9 != 0) goto L_0x0594
            boolean r1 = m60806g(r0, r4, r2)
            if (r1 == 0) goto L_0x0594
            goto L_0x0659
        L_0x0594:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x059c
            goto L_0x0681
        L_0x059c:
            java.util.Iterator r1 = r5.iterator()
        L_0x05a0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0681
            java.lang.Object r3 = r1.next()
            oh0.g r3 = (oh0.C24618g) r3
            oh0.h r3 = r6.mo42730d0(r3)
            boolean r3 = m60806g(r0, r3, r2)
            if (r3 == 0) goto L_0x05a0
            goto L_0x0659
        L_0x05b8:
            java.lang.Object r1 = kotlin.collections.C23825c.m58513j0(r5)
            oh0.g r1 = (oh0.C24618g) r1
            oh0.h r1 = r6.mo42730d0(r1)
            boolean r0 = m60806g(r0, r1, r2)
            goto L_0x0692
        L_0x05c8:
            oh0.l r2 = r0.f61344c
            lh0.i0 r3 = r2.mo42733f(r1)
            boolean r4 = r2.mo42717U(r3)
            if (r4 == 0) goto L_0x05da
            boolean r0 = r2.mo42735g(r3)
            goto L_0x0692
        L_0x05da:
            lh0.i0 r3 = r2.mo42733f(r1)
            boolean r3 = r2.mo42735g(r3)
            if (r3 == 0) goto L_0x05e6
            goto L_0x0659
        L_0x05e6:
            r18.mo60245b()
            java.util.ArrayDeque<oh0.g> r3 = r0.f61348g
            mf0.C24362h.m61208c(r3)
            rh0.d r10 = r0.f61349h
            mf0.C24362h.m61208c(r10)
            r3.push(r1)
        L_0x05f6:
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x067e
            int r4 = r10.f62767c
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r4 > r5) goto L_0x065f
            java.lang.Object r4 = r3.pop()
            oh0.g r4 = (oh0.C24618g) r4
            mf0.C24362h.m61210e(r4, r7)
            boolean r5 = r10.add(r4)
            if (r5 != 0) goto L_0x0614
            goto L_0x05f6
        L_0x0614:
            boolean r5 = r2.mo42756v(r4)
            if (r5 == 0) goto L_0x061d
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24159c.f61351a
            goto L_0x061f
        L_0x061d:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$b r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24158b.f61350a
        L_0x061f:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$c r6 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.C24156a.C24159c.f61351a
            boolean r6 = mf0.C24362h.m61206a(r5, r6)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x062a
            goto L_0x062b
        L_0x062a:
            r5 = 0
        L_0x062b:
            if (r5 != 0) goto L_0x062e
            goto L_0x05f6
        L_0x062e:
            oh0.l r6 = r0.f61344c
            lh0.i0 r4 = r6.mo42733f(r4)
            java.util.Collection r4 = r6.mo42704H(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x063c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x05f6
            java.lang.Object r6 = r4.next()
            oh0.f r6 = (oh0.C24617f) r6
            oh0.g r6 = r5.mo60247a(r0, r6)
            lh0.i0 r11 = r2.mo42733f(r6)
            boolean r11 = r2.mo42735g(r11)
            if (r11 == 0) goto L_0x065b
            r18.mo60244a()
        L_0x0659:
            r5 = 1
            goto L_0x0693
        L_0x065b:
            r3.add(r6)
            goto L_0x063c
        L_0x065f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = p358af.C13437d.m33709o(r9, r1, r8)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 63
            java.lang.String r2 = kotlin.collections.C23825c.m58520q0(r10, r11, r12, r13, r14, r15)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x067e:
            r18.mo60244a()
        L_0x0681:
            r5 = 0
            goto L_0x0693
        L_0x0683:
            boolean r0 = r3.booleanValue()
            goto L_0x0692
        L_0x0688:
            boolean r0 = r7.booleanValue()
            mf0.C24362h.m61211f(r1, r3)
            mf0.C24362h.m61211f(r2, r4)
        L_0x0692:
            r5 = r0
        L_0x0693:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C24259d.m60807h(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, oh0.f, oh0.f):boolean");
    }

    /* renamed from: i */
    public static boolean m60808i(C24623l lVar, C24617f fVar, C24617f fVar2, C24621j jVar) {
        C24627o oVar;
        C25448i0 W;
        C24312z e = lVar.mo42731e(fVar);
        if (e instanceof C24613b) {
            C24613b bVar = (C24613b) e;
            if (lVar.mo42703G(bVar) || !lVar.mo42734f0(lVar.mo42710N(lVar.mo42702F(bVar))) || lVar.mo42709M(bVar) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            C24621j o = lVar.mo42748o(fVar2);
            if (o instanceof C24627o) {
                oVar = (C24627o) o;
            } else {
                oVar = null;
            }
            if (!(oVar == null || (W = lVar.mo42719W(oVar)) == null || !lVar.mo42718V(W, jVar))) {
                return true;
            }
        }
        return false;
    }
}
