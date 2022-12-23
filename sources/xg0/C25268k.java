package xg0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import lh0.C24272i;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24284n;
import lh0.C24285n0;
import lh0.C24298r;
import lh0.C24306u0;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24373a;
import mh0.C24375b;
import mh0.C24376c;
import mh0.C24378d;
import oh0.C24612a;
import oh0.C24613b;
import oh0.C24614c;
import oh0.C24615d;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24619h;
import oh0.C24620i;
import oh0.C24621j;
import oh0.C24622k;
import oh0.C24627o;
import yg0.C25301a;
import zf0.C25448i0;

/* renamed from: xg0.k */
public final class C25268k implements C24373a {

    /* renamed from: b */
    public final Map<C24274i0, C24274i0> f63542b;

    /* renamed from: c */
    public final C24376c.C24377a f63543c;

    /* renamed from: d */
    public final C24378d f63544d;

    public C25268k(HashMap hashMap, C24376c.C24377a aVar, C24378d dVar) {
        C24362h.m61211f(aVar, "equalityAxioms");
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        this.f63542b = hashMap;
        this.f63543c = aVar;
        this.f63544d = dVar;
    }

    /* renamed from: A */
    public final boolean mo42696A(C24618g gVar) {
        return C24373a.C24374a.m61268J(this, gVar);
    }

    /* renamed from: B */
    public final C24375b mo42697B(C24618g gVar) {
        return C24373a.C24374a.m61298g0(this, gVar);
    }

    /* renamed from: C */
    public final int mo42699C(C24621j jVar) {
        return C24373a.C24374a.m61290c0(this, jVar);
    }

    /* renamed from: D */
    public final boolean mo42700D(C24618g gVar) {
        C24362h.m61211f(gVar, "receiver");
        return mo42708L(mo42733f(gVar));
    }

    /* renamed from: E */
    public final C24298r mo42701E(C24617f fVar) {
        return C24373a.C24374a.m61297g(this, fVar);
    }

    /* renamed from: F */
    public final NewCapturedTypeConstructor mo42702F(C24613b bVar) {
        return C24373a.C24374a.m61302i0(this, bVar);
    }

    /* renamed from: G */
    public final boolean mo42703G(C24613b bVar) {
        C24362h.m61211f(bVar, "receiver");
        return bVar instanceof C25301a;
    }

    /* renamed from: H */
    public final Collection<C24617f> mo42704H(C24621j jVar) {
        return C24373a.C24374a.m61300h0(this, jVar);
    }

    /* renamed from: I */
    public final boolean mo42705I(C24617f fVar) {
        C24272i iVar;
        C24362h.m61211f(fVar, "receiver");
        C24312z e = mo42731e(fVar);
        if (e == null) {
            iVar = null;
        } else {
            iVar = mo42716T(e);
        }
        if (iVar != null) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final C24620i mo42706J(C24617f fVar, int i) {
        return C24373a.C24374a.m61311n(this, fVar, i);
    }

    /* renamed from: K */
    public final C24306u0 mo42707K(C24617f fVar) {
        return C24373a.C24374a.m61286a0(this, fVar);
    }

    /* renamed from: L */
    public final boolean mo42708L(C24621j jVar) {
        return C24373a.C24374a.m61270L(this, jVar);
    }

    /* renamed from: M */
    public final CaptureStatus mo42709M(C24613b bVar) {
        return C24373a.C24374a.m61305k(this, bVar);
    }

    /* renamed from: N */
    public final C24281l0 mo42710N(C24612a aVar) {
        return C24373a.C24374a.m61294e0(this, aVar);
    }

    /* renamed from: O */
    public final C24618g mo42711O(C24617f fVar) {
        return C24373a.C24374a.m61308l0(this, fVar);
    }

    /* renamed from: P */
    public final boolean mo42712P(C24618g gVar) {
        return C24373a.C24374a.m61272N(this, gVar);
    }

    /* renamed from: Q */
    public final boolean mo42713Q(C24617f fVar) {
        return C24373a.C24374a.m61273O(this, fVar);
    }

    /* renamed from: R */
    public final boolean mo42714R(C24621j jVar) {
        return C24373a.C24374a.m61271M(this, jVar);
    }

    /* renamed from: S */
    public final boolean mo42715S(C24618g gVar) {
        return C24373a.C24374a.m61279U(this, gVar);
    }

    /* renamed from: T */
    public final C24272i mo42716T(C24618g gVar) {
        return C24373a.C24374a.m61293e(this, gVar);
    }

    /* renamed from: U */
    public final boolean mo42717U(C24621j jVar) {
        return C24373a.C24374a.m61265G(this, jVar);
    }

    /* renamed from: V */
    public final boolean mo42718V(C24622k kVar, C24621j jVar) {
        return C24373a.C24374a.m61261C(this, kVar, jVar);
    }

    /* renamed from: W */
    public final C25448i0 mo42719W(C24627o oVar) {
        return C24373a.C24374a.m61321w(this, oVar);
    }

    /* renamed from: X */
    public final C24622k mo42720X(C24621j jVar, int i) {
        return C24373a.C24374a.m61315q(this, jVar, i);
    }

    /* renamed from: Y */
    public final boolean mo42721Y(C24618g gVar) {
        return C24373a.C24374a.m61280V(this, gVar);
    }

    /* renamed from: Z */
    public final boolean mo42722Z(C24617f fVar) {
        return C24373a.C24374a.m61275Q(this, fVar);
    }

    /* renamed from: a */
    public final C24312z mo42723a(C24618g gVar, boolean z) {
        return C24373a.C24374a.m61310m0(this, gVar, z);
    }

    /* renamed from: a0 */
    public final C24306u0 mo42724a0(C24613b bVar) {
        return C24373a.C24374a.m61284Z(this, bVar);
    }

    /* renamed from: b */
    public final C24312z mo42725b(C24615d dVar) {
        return C24373a.C24374a.m61282X(this, dVar);
    }

    /* renamed from: b0 */
    public final C24306u0 mo42726b0(C24618g gVar, C24618g gVar2) {
        return C24373a.C24374a.m61307l(this, gVar, gVar2);
    }

    /* renamed from: c */
    public final C24312z mo42727c(C24615d dVar) {
        return C24373a.C24374a.m61306k0(this, dVar);
    }

    /* renamed from: c0 */
    public final int mo42728c0(C24617f fVar) {
        return C24373a.C24374a.m61287b(this, fVar);
    }

    /* renamed from: d */
    public final C24613b mo42729d(C24618g gVar) {
        return C24373a.C24374a.m61291d(this, gVar);
    }

    /* renamed from: d0 */
    public final C24619h mo42730d0(C24618g gVar) {
        return C24373a.C24374a.m61289c(this, gVar);
    }

    /* renamed from: e */
    public final C24312z mo42731e(C24617f fVar) {
        return C24373a.C24374a.m61299h(this, fVar);
    }

    /* renamed from: e0 */
    public final boolean mo42732e0(C24613b bVar) {
        return C24373a.C24374a.m61277S(this, bVar);
    }

    /* renamed from: f */
    public final C24274i0 mo42733f(C24618g gVar) {
        return C24373a.C24374a.m61304j0(this, gVar);
    }

    /* renamed from: f0 */
    public final boolean mo42734f0(C24620i iVar) {
        return C24373a.C24374a.m61278T(this, iVar);
    }

    /* renamed from: g */
    public final boolean mo42735g(C24621j jVar) {
        return C24373a.C24374a.m61274P(this, jVar);
    }

    /* renamed from: g0 */
    public final TypeVariance mo42736g0(C24620i iVar) {
        return C24373a.C24374a.m61323y(this, iVar);
    }

    /* renamed from: h */
    public final boolean mo42737h(C24621j jVar) {
        return C24373a.C24374a.m61267I(this, jVar);
    }

    /* renamed from: h0 */
    public final C24618g mo42738h0(C24617f fVar) {
        return C24373a.C24374a.m61283Y(this, fVar);
    }

    /* renamed from: i */
    public final boolean mo42739i(C24618g gVar) {
        C24613b bVar;
        C24362h.m61211f(gVar, "receiver");
        C24312z e = mo42731e(gVar);
        if (e == null) {
            bVar = null;
        } else {
            bVar = mo42729d(e);
        }
        if (bVar != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final Set mo42740i0(C24618g gVar) {
        return C24373a.C24374a.m61292d0(this, gVar);
    }

    /* renamed from: j */
    public final C24285n0 mo42741j(C24617f fVar) {
        return C24373a.C24374a.m61301i(this, fVar);
    }

    /* renamed from: j0 */
    public final boolean mo42742j0(C24617f fVar) {
        return C24373a.C24374a.m61260B(this, fVar);
    }

    /* renamed from: k */
    public final boolean mo42743k(C24621j jVar) {
        return C24373a.C24374a.m61266H(this, jVar);
    }

    /* renamed from: k0 */
    public final C24306u0 mo42744k0(C24620i iVar) {
        return C24373a.C24374a.m61320v(this, iVar);
    }

    /* renamed from: l */
    public final C24312z mo42745l(C24614c cVar) {
        return C24373a.C24374a.m61288b0(this, cVar);
    }

    /* renamed from: l0 */
    public final C24284n mo61874l0(C24615d dVar) {
        return C24373a.C24374a.m61295f(this, dVar);
    }

    /* renamed from: m */
    public final C24620i mo42746m(C24618g gVar, int i) {
        return C24373a.C24374a.m61313o(this, gVar, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (mf0.C24362h.m61206a(r0, r6) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (mf0.C24362h.m61206a(r3, r5) != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42747n(oh0.C24621j r5, oh0.C24621j r6) {
        /*
            r4 = this;
            java.lang.String r0 = "c1"
            mf0.C24362h.m61211f(r5, r0)
            java.lang.String r0 = "c2"
            mf0.C24362h.m61211f(r6, r0)
            boolean r0 = r5 instanceof lh0.C24274i0
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6 instanceof lh0.C24274i0
            if (r0 == 0) goto L_0x0054
            boolean r0 = mh0.C24373a.C24374a.m61285a(r4, r5, r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0053
            lh0.i0 r5 = (lh0.C24274i0) r5
            lh0.i0 r6 = (lh0.C24274i0) r6
            mh0.c$a r0 = r4.f63543c
            boolean r0 = r0.mo60168a(r5, r6)
            if (r0 == 0) goto L_0x0029
            goto L_0x004c
        L_0x0029:
            java.util.Map<lh0.i0, lh0.i0> r0 = r4.f63542b
            if (r0 != 0) goto L_0x002e
            goto L_0x004e
        L_0x002e:
            java.lang.Object r0 = r0.get(r5)
            lh0.i0 r0 = (lh0.C24274i0) r0
            java.util.Map<lh0.i0, lh0.i0> r3 = r4.f63542b
            java.lang.Object r3 = r3.get(r6)
            lh0.i0 r3 = (lh0.C24274i0) r3
            if (r0 == 0) goto L_0x0044
            boolean r6 = mf0.C24362h.m61206a(r0, r6)
            if (r6 != 0) goto L_0x004c
        L_0x0044:
            if (r3 == 0) goto L_0x004e
            boolean r5 = mf0.C24362h.m61206a(r3, r5)
            if (r5 == 0) goto L_0x004e
        L_0x004c:
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            return r1
        L_0x0054:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L_0x005e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xg0.C25268k.mo42747n(oh0.j, oh0.j):boolean");
    }

    /* renamed from: o */
    public final C24621j mo42748o(C24617f fVar) {
        C24362h.m61211f(fVar, "receiver");
        C24618g e = mo42731e(fVar);
        if (e == null) {
            e = mo42738h0(fVar);
        }
        return mo42733f(e);
    }

    /* renamed from: p */
    public final C24620i mo42749p(C24619h hVar, int i) {
        return C24373a.C24374a.m61309m(this, hVar, i);
    }

    /* renamed from: q */
    public final C24312z mo42751q(C24618g gVar, CaptureStatus captureStatus) {
        return C24373a.C24374a.m61303j(this, gVar, captureStatus);
    }

    /* renamed from: r */
    public final void mo42752r(C24618g gVar, C24621j jVar) {
    }

    /* renamed from: s */
    public final int mo42753s(C24619h hVar) {
        return C24373a.C24374a.m61296f0(this, hVar);
    }

    /* renamed from: t */
    public final C24617f mo42754t(C24617f fVar) {
        return C24373a.C24374a.m61312n0(this, fVar);
    }

    /* renamed from: u */
    public final TypeVariance mo42755u(C24622k kVar) {
        return C24373a.C24374a.m61324z(this, kVar);
    }

    /* renamed from: v */
    public final boolean mo42756v(C24618g gVar) {
        C24362h.m61211f(gVar, "receiver");
        return mo42717U(mo42733f(gVar));
    }

    /* renamed from: w */
    public final boolean mo42757w(C24621j jVar) {
        return C24373a.C24374a.m61264F(this, jVar);
    }

    /* renamed from: x */
    public final boolean mo42758x(C24618g gVar, C24618g gVar2) {
        return C24373a.C24374a.m61262D(this, gVar, gVar2);
    }

    /* renamed from: y */
    public final C24306u0 mo42759y(ArrayList arrayList) {
        return C24373a.C24374a.m61263E(this, arrayList);
    }

    /* renamed from: z */
    public final boolean mo42761z(C24617f fVar) {
        C24284n nVar;
        C24362h.m61211f(fVar, "receiver");
        C24298r E = mo42701E(fVar);
        if (E == null) {
            nVar = null;
        } else {
            nVar = mo61874l0(E);
        }
        if (nVar != null) {
            return true;
        }
        return false;
    }
}
