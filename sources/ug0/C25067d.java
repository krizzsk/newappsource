package ug0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: ug0.d */
public final class C25067d {

    /* renamed from: e */
    public static final C25069e f63256e = C25069e.m62822k("<root>");

    /* renamed from: f */
    public static final Pattern f63257f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final C25068a f63258g = new C25068a();

    /* renamed from: a */
    public final String f63259a;

    /* renamed from: b */
    public transient C25066c f63260b;

    /* renamed from: c */
    public transient C25067d f63261c;

    /* renamed from: d */
    public transient C25069e f63262d;

    /* renamed from: ug0.d$a */
    public static class C25068a implements C24236l<String, C25069e> {
        public final Object invoke(Object obj) {
            return C25069e.m62819h((String) obj);
        }
    }

    public C25067d(String str, C25066c cVar) {
        if (str == null) {
            m62809a(0);
            throw null;
        } else if (cVar != null) {
            this.f63259a = str;
            this.f63260b = cVar;
        } else {
            m62809a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62809a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public final String mo61591b() {
        String str = this.f63259a;
        if (str != null) {
            return str;
        }
        m62809a(4);
        throw null;
    }

    /* renamed from: c */
    public final C25067d mo61592c(C25069e eVar) {
        String str;
        if (eVar != null) {
            if (mo61594e()) {
                str = eVar.mo61604f();
            } else {
                str = this.f63259a + "." + eVar.mo61604f();
            }
            return new C25067d(str, this, eVar);
        }
        m62809a(9);
        throw null;
    }

    /* renamed from: d */
    public final void mo61593d() {
        int lastIndexOf = this.f63259a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f63262d = C25069e.m62819h(this.f63259a.substring(lastIndexOf + 1));
            this.f63261c = new C25067d(this.f63259a.substring(0, lastIndexOf));
            return;
        }
        this.f63262d = C25069e.m62819h(this.f63259a);
        this.f63261c = C25066c.f63253c.mo61589i();
    }

    /* renamed from: e */
    public final boolean mo61594e() {
        return this.f63259a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C25067d) && this.f63259a.equals(((C25067d) obj).f63259a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo61596f() {
        return this.f63260b != null || mo61591b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public final List<C25069e> mo61597g() {
        List<C25069e> list;
        if (mo61594e()) {
            list = Collections.emptyList();
        } else {
            String[] split = f63257f.split(this.f63259a);
            C25068a aVar = f63258g;
            C24362h.m61211f(split, "<this>");
            C24362h.m61211f(aVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String invoke : split) {
                arrayList.add(aVar.invoke(invoke));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        m62809a(14);
        throw null;
    }

    /* renamed from: h */
    public final C25069e mo61598h() {
        C25069e eVar = this.f63262d;
        if (eVar != null) {
            if (eVar != null) {
                return eVar;
            }
            m62809a(10);
            throw null;
        } else if (!mo61594e()) {
            mo61593d();
            C25069e eVar2 = this.f63262d;
            if (eVar2 != null) {
                return eVar2;
            }
            m62809a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final int hashCode() {
        return this.f63259a.hashCode();
    }

    /* renamed from: i */
    public final C25066c mo61600i() {
        C25066c cVar = this.f63260b;
        if (cVar == null) {
            C25066c cVar2 = new C25066c(this);
            this.f63260b = cVar2;
            return cVar2;
        } else if (cVar != null) {
            return cVar;
        } else {
            m62809a(5);
            throw null;
        }
    }

    public final String toString() {
        String f = mo61594e() ? f63256e.mo61604f() : this.f63259a;
        if (f != null) {
            return f;
        }
        m62809a(17);
        throw null;
    }

    public C25067d(String str) {
        if (str != null) {
            this.f63259a = str;
        } else {
            m62809a(2);
            throw null;
        }
    }

    public C25067d(String str, C25067d dVar, C25069e eVar) {
        if (str != null) {
            this.f63259a = str;
            this.f63261c = dVar;
            this.f63262d = eVar;
            return;
        }
        m62809a(3);
        throw null;
    }
}
