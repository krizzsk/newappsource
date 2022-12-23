package ch0;

import ug0.C25065b;
import ug0.C25066c;

/* renamed from: ch0.b */
public final class C21203b {

    /* renamed from: a */
    public final String f53136a;

    public C21203b(String str) {
        if (str != null) {
            this.f53136a = str;
        } else {
            m49810a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m49810a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C21203b m49811b(C25065b bVar) {
        if (bVar != null) {
            C25066c h = bVar.mo61574h();
            String replace = bVar.mo61576i().mo61580b().replace('.', '$');
            if (h.mo61582d()) {
                return new C21203b(replace);
            }
            return new C21203b(h.mo61580b().replace('.', '/') + "/" + replace);
        }
        m49810a(1);
        throw null;
    }

    /* renamed from: c */
    public static C21203b m49812c(String str) {
        if (str != null) {
            return new C21203b(str);
        }
        m49810a(0);
        throw null;
    }

    /* renamed from: d */
    public final String mo53547d() {
        String str = this.f53136a;
        if (str != null) {
            return str;
        }
        m49810a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21203b.class != obj.getClass()) {
            return false;
        }
        return this.f53136a.equals(((C21203b) obj).f53136a);
    }

    public final int hashCode() {
        return this.f53136a.hashCode();
    }

    public final String toString() {
        return this.f53136a;
    }
}
