package zf0;

import cg0.C21178j0;
import fh0.C23385c;
import fh0.C23387e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import lh0.C24307v;
import p583jk.C17884p;
import qh0.C24780e;
import xg0.C25260c;
import zf0.C25468m0;

/* renamed from: zf0.m */
public final class C25455m {

    /* renamed from: a */
    public static final C25459d f63740a;

    /* renamed from: b */
    public static final C25460e f63741b;

    /* renamed from: c */
    public static final C25461f f63742c;

    /* renamed from: d */
    public static final C25462g f63743d;

    /* renamed from: e */
    public static final C25463h f63744e;

    /* renamed from: f */
    public static final C25464i f63745f;

    /* renamed from: g */
    public static final C25465j f63746g;

    /* renamed from: h */
    public static final C25466k f63747h;

    /* renamed from: i */
    public static final C25467l f63748i;

    /* renamed from: j */
    public static final Map<C25478n, Integer> f63749j;

    /* renamed from: k */
    public static final C25463h f63750k;

    /* renamed from: l */
    public static final C25456a f63751l = new C25456a();

    /* renamed from: m */
    public static final C25457b f63752m = new C25457b();
    @Deprecated

    /* renamed from: n */
    public static final C25458c f63753n = new C25458c();

    /* renamed from: o */
    public static final C24780e f63754o;

    /* renamed from: p */
    public static final HashMap f63755p = new HashMap();

    /* renamed from: zf0.m$a */
    public static class C25456a implements C23385c {
        public final C24307v getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: zf0.m$b */
    public static class C25457b implements C23385c {
        public final C24307v getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: zf0.m$c */
    public static class C25458c implements C23385c {
        public final C24307v getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: zf0.m$d */
    public static class C25459d extends C25453l {
        public C25459d(C25468m0.C25473e eVar) {
            super(eVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63779e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            C25442g gVar2;
            boolean z;
            if (gVar != null) {
                if (C25260c.m63403t(kVar)) {
                    if (C25260c.m63389f(gVar) != C25438e0.f63737a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return C25455m.m63775d(kVar, gVar);
                    }
                }
                if (kVar instanceof C23899b) {
                    C25440f b = ((C23899b) kVar).mo53399b();
                    if (C25260c.m63400q(b) && C25260c.m63403t(b) && (gVar instanceof C23899b) && C25260c.m63403t(gVar.mo53399b()) && C25455m.m63775d(kVar, gVar)) {
                        return true;
                    }
                }
                C25442g gVar3 = kVar;
                while (gVar3 != null) {
                    C25442g b2 = gVar3.mo53399b();
                    if ((b2 instanceof C25432c) && !C25260c.m63395l(b2)) {
                        gVar2 = b2;
                        break;
                    }
                    boolean z2 = b2 instanceof C25486u;
                    gVar3 = b2;
                    if (z2) {
                        gVar2 = b2;
                        break;
                    }
                }
                gVar2 = gVar3;
                if (gVar2 == null) {
                    return false;
                }
                while (gVar != null) {
                    if (gVar2 == gVar) {
                        return true;
                    }
                    if (!(gVar instanceof C25486u)) {
                        gVar = gVar.mo53399b();
                    } else if (!(gVar2 instanceof C25486u) || !((C25486u) gVar2).mo53401f().equals(((C25486u) gVar).mo53401f()) || !C25260c.m63387d(gVar).equals(C25260c.m63387d(gVar2))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            }
            m63779e(2);
            throw null;
        }
    }

    /* renamed from: zf0.m$e */
    public static class C25460e extends C25453l {
        public C25460e(C25468m0.C25474f fVar) {
            super(fVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63781e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            C25442g i;
            if (gVar != null) {
                if (C25455m.f63740a.mo58585c(bVar, kVar, gVar)) {
                    if (bVar == C25455m.f63752m) {
                        return true;
                    }
                    if (!(bVar == C25455m.f63751l || (i = C25260c.m63392i(kVar, C25432c.class, true)) == null || !(bVar instanceof C23387e))) {
                        return ((C23387e) bVar).mo58546t().mo53407a().equals(i.mo53407a());
                    }
                }
                return false;
            }
            m63781e(1);
            throw null;
        }
    }

    /* renamed from: zf0.m$f */
    public static class C25461f extends C25453l {
        public C25461f(C25468m0.C25475g gVar) {
            super(gVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63783e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
            if (mf0.C24361g.m61151U(r0) == false) goto L_0x0078;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo58585c(zf0.C25455m.C25457b r7, zf0.C25451k r8, zf0.C25442g r9) {
            /*
                r6 = this;
                java.lang.Class<zf0.c> r0 = zf0.C25432c.class
                r1 = 0
                r2 = 1
                if (r9 == 0) goto L_0x0084
                zf0.g r3 = xg0.C25260c.m63392i(r8, r0, r2)
                zf0.c r3 = (zf0.C25432c) r3
                r4 = 0
                zf0.g r9 = xg0.C25260c.m63392i(r9, r0, r4)
                zf0.c r9 = (zf0.C25432c) r9
                if (r9 != 0) goto L_0x0016
                return r4
            L_0x0016:
                if (r3 == 0) goto L_0x002d
                boolean r5 = xg0.C25260c.m63395l(r3)
                if (r5 == 0) goto L_0x002d
                zf0.g r3 = xg0.C25260c.m63392i(r3, r0, r2)
                zf0.c r3 = (zf0.C25432c) r3
                if (r3 == 0) goto L_0x002d
                boolean r3 = xg0.C25260c.m63401r(r9, r3)
                if (r3 == 0) goto L_0x002d
                return r2
            L_0x002d:
                zf0.k r3 = xg0.C25260c.m63405v(r8)
                zf0.g r0 = xg0.C25260c.m63392i(r3, r0, r2)
                zf0.c r0 = (zf0.C25432c) r0
                if (r0 != 0) goto L_0x003a
                return r4
            L_0x003a:
                boolean r0 = xg0.C25260c.m63401r(r9, r0)
                if (r0 == 0) goto L_0x007b
                zf0.m$c r0 = zf0.C25455m.f63753n
                if (r7 != r0) goto L_0x0045
                goto L_0x0078
            L_0x0045:
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r0 != 0) goto L_0x004a
                goto L_0x0072
            L_0x004a:
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23899b
                if (r0 == 0) goto L_0x004f
                goto L_0x0072
            L_0x004f:
                zf0.m$b r0 = zf0.C25455m.f63752m
                if (r7 != r0) goto L_0x0054
                goto L_0x0072
            L_0x0054:
                zf0.m$a r0 = zf0.C25455m.f63751l
                if (r7 == r0) goto L_0x0078
                if (r7 != 0) goto L_0x005b
                goto L_0x0078
            L_0x005b:
                boolean r0 = r7 instanceof fh0.C23386d
                if (r0 == 0) goto L_0x0074
                r0 = r7
                fh0.d r0 = (fh0.C23386d) r0
                lh0.v r0 = r0.mo58548a()
                boolean r1 = xg0.C25260c.m63402s(r0, r9)
                if (r1 != 0) goto L_0x0072
                boolean r0 = mf0.C24361g.m61151U(r0)
                if (r0 == 0) goto L_0x0078
            L_0x0072:
                r4 = 1
                goto L_0x0078
            L_0x0074:
                r7.getType()
                throw r1
            L_0x0078:
                if (r4 == 0) goto L_0x007b
                return r2
            L_0x007b:
                zf0.g r9 = r9.mo53399b()
                boolean r7 = r6.mo58585c(r7, r8, r9)
                return r7
            L_0x0084:
                m63783e(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zf0.C25455m.C25461f.mo58585c(zf0.m$b, zf0.k, zf0.g):boolean");
        }
    }

    /* renamed from: zf0.m$g */
    public static class C25462g extends C25453l {
        public C25462g(C25468m0.C25470b bVar) {
            super(bVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63785e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                if (!C25260c.m63387d(gVar).mo59454D(C25260c.m63387d(kVar))) {
                    return false;
                }
                C25455m.f63754o.mo61239a(kVar, gVar);
                return true;
            }
            m63785e(1);
            throw null;
        }
    }

    /* renamed from: zf0.m$h */
    public static class C25463h extends C25453l {
        public C25463h(C25468m0.C25476h hVar) {
            super(hVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63787e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                return true;
            }
            m63787e(1);
            throw null;
        }
    }

    /* renamed from: zf0.m$i */
    public static class C25464i extends C25453l {
        public C25464i(C25468m0.C25472d dVar) {
            super(dVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63789e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar == null) {
                m63789e(1);
                throw null;
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: zf0.m$j */
    public static class C25465j extends C25453l {
        public C25465j(C25468m0.C25469a aVar) {
            super(aVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63791e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar == null) {
                m63791e(1);
                throw null;
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: zf0.m$k */
    public static class C25466k extends C25453l {
        public C25466k(C25468m0.C25471c cVar) {
            super(cVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63793e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                return false;
            }
            m63793e(1);
            throw null;
        }
    }

    /* renamed from: zf0.m$l */
    public static class C25467l extends C25453l {
        public C25467l(C25468m0.C25477i iVar) {
            super(iVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m63795e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                return false;
            }
            m63795e(1);
            throw null;
        }
    }

    static {
        C24780e eVar;
        Class<C24780e> cls = C24780e.class;
        C25459d dVar = new C25459d(C25468m0.C25473e.f63761c);
        f63740a = dVar;
        C25460e eVar2 = new C25460e(C25468m0.C25474f.f63762c);
        f63741b = eVar2;
        C25461f fVar = new C25461f(C25468m0.C25475g.f63763c);
        f63742c = fVar;
        C25462g gVar = new C25462g(C25468m0.C25470b.f63758c);
        f63743d = gVar;
        C25463h hVar = new C25463h(C25468m0.C25476h.f63764c);
        f63744e = hVar;
        C25464i iVar = new C25464i(C25468m0.C25472d.f63760c);
        f63745f = iVar;
        C25465j jVar = new C25465j(C25468m0.C25469a.f63757c);
        f63746g = jVar;
        C25466k kVar = new C25466k(C25468m0.C25471c.f63759c);
        f63747h = kVar;
        C25467l lVar = new C25467l(C25468m0.C25477i.f63765c);
        f63748i = lVar;
        Collections.unmodifiableSet(C17884p.m44349T(dVar, eVar2, gVar, iVar));
        HashMap hashMap = new HashMap(6);
        hashMap.put(eVar2, 0);
        hashMap.put(dVar, 0);
        hashMap.put(gVar, 1);
        hashMap.put(fVar, 1);
        hashMap.put(hVar, 2);
        f63749j = Collections.unmodifiableMap(hashMap);
        f63750k = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        if (it.hasNext()) {
            eVar = (C24780e) it.next();
        } else {
            eVar = C24780e.C24781a.f62684a;
        }
        f63754o = eVar;
        m63777f(dVar);
        m63777f(eVar2);
        m63777f(fVar);
        m63777f(gVar);
        m63777f(hVar);
        m63777f(iVar);
        m63777f(jVar);
        m63777f(kVar);
        m63777f(lVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m63772a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 16 ? 3 : 2)];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static Integer m63773b(C25478n nVar, C25478n nVar2) {
        if (nVar == null) {
            m63772a(12);
            throw null;
        } else if (nVar2 != null) {
            Integer a = nVar.mo62739a().mo58406a(nVar2.mo62739a());
            if (a != null) {
                return a;
            }
            Integer a2 = nVar2.mo62739a().mo58406a(nVar.mo62739a());
            if (a2 != null) {
                return Integer.valueOf(-a2.intValue());
            }
            return null;
        } else {
            m63772a(13);
            throw null;
        }
    }

    /* renamed from: c */
    public static C25451k m63774c(C25457b bVar, C25451k kVar, C25442g gVar) {
        C25451k c;
        if (kVar == null) {
            m63772a(8);
            throw null;
        } else if (gVar != null) {
            C25451k kVar2 = (C25451k) kVar.mo53407a();
            while (kVar2 != null && kVar2.mo53429g() != f63745f) {
                if (!kVar2.mo53429g().mo58585c(bVar, kVar2, gVar)) {
                    return kVar2;
                }
                kVar2 = (C25451k) C25260c.m63392i(kVar2, C25451k.class, true);
            }
            if (!(kVar instanceof C21178j0) || (c = m63774c(bVar, ((C21178j0) kVar).mo53501U(), gVar)) == null) {
                return null;
            }
            return c;
        } else {
            m63772a(9);
            throw null;
        }
    }

    /* renamed from: d */
    public static boolean m63775d(C25442g gVar, C25442g gVar2) {
        if (gVar2 != null) {
            C25438e0 f = C25260c.m63389f(gVar2);
            if (f != C25438e0.f63737a) {
                return f.equals(C25260c.m63389f(gVar));
            }
            return false;
        }
        m63772a(7);
        throw null;
    }

    /* renamed from: e */
    public static boolean m63776e(C25478n nVar) {
        if (nVar == null) {
            m63772a(14);
            throw null;
        } else if (nVar == f63740a || nVar == f63741b) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public static void m63777f(C25453l lVar) {
        f63755p.put(lVar.f63739a, lVar);
    }

    /* renamed from: g */
    public static C25478n m63778g(C25479n0 n0Var) {
        if (n0Var != null) {
            C25478n nVar = (C25478n) f63755p.get(n0Var);
            if (nVar != null) {
                return nVar;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + n0Var);
        }
        m63772a(15);
        throw null;
    }
}
