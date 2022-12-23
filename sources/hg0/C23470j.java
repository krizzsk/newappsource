package hg0;

import dg0.C23269a;
import dg0.C23270b;
import dg0.C23271c;
import java.util.HashMap;
import xg0.C25260c;
import zf0.C25442g;
import zf0.C25451k;
import zf0.C25453l;
import zf0.C25455m;
import zf0.C25486u;

/* renamed from: hg0.j */
public final class C23470j {

    /* renamed from: a */
    public static final C23471a f59254a;

    /* renamed from: b */
    public static final C23472b f59255b;

    /* renamed from: c */
    public static final C23473c f59256c;

    /* renamed from: d */
    public static final HashMap f59257d;

    /* renamed from: hg0.j$a */
    public static class C23471a extends C25453l {
        public C23471a(C23269a aVar) {
            super(aVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m57568e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25455m.C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                return C23470j.m57567c(kVar, gVar);
            }
            m57568e(1);
            throw null;
        }
    }

    /* renamed from: hg0.j$b */
    public static class C23472b extends C25453l {
        public C23472b(C23271c cVar) {
            super(cVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m57570e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25455m.C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                return C23470j.m57566b(bVar, kVar, gVar);
            }
            m57570e(1);
            throw null;
        }
    }

    /* renamed from: hg0.j$c */
    public static class C23473c extends C25453l {
        public C23473c(C23270b bVar) {
            super(bVar);
        }

        /* renamed from: e */
        public static /* synthetic */ void m57572e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public final boolean mo58585c(C25455m.C25457b bVar, C25451k kVar, C25442g gVar) {
            if (gVar != null) {
                return C23470j.m57566b(bVar, kVar, gVar);
            }
            m57572e(1);
            throw null;
        }
    }

    static {
        C23471a aVar = new C23471a(C23269a.f59024c);
        f59254a = aVar;
        C23472b bVar = new C23472b(C23271c.f59026c);
        f59255b = bVar;
        C23473c cVar = new C23473c(C23270b.f59025c);
        f59256c = cVar;
        HashMap hashMap = new HashMap();
        f59257d = hashMap;
        hashMap.put(aVar.f63739a, aVar);
        hashMap.put(bVar.f63739a, bVar);
        hashMap.put(cVar.f63739a, cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m57565a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static boolean m57566b(C25455m.C25457b bVar, C25451k kVar, C25442g gVar) {
        if (gVar == null) {
            m57565a(1);
            throw null;
        } else if (m57567c(C25260c.m63405v(kVar), gVar)) {
            return true;
        } else {
            return C25455m.f63742c.mo58585c(bVar, kVar, gVar);
        }
    }

    /* renamed from: c */
    public static boolean m57567c(C25442g gVar, C25442g gVar2) {
        Class<C25486u> cls = C25486u.class;
        if (gVar == null) {
            m57565a(2);
            throw null;
        } else if (gVar2 != null) {
            C25486u uVar = (C25486u) C25260c.m63392i(gVar, cls, false);
            C25486u uVar2 = (C25486u) C25260c.m63392i(gVar2, cls, false);
            if (uVar2 == null || uVar == null || !uVar.mo53401f().equals(uVar2.mo53401f())) {
                return false;
            }
            return true;
        } else {
            m57565a(3);
            throw null;
        }
    }
}
