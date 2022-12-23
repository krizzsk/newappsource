package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import mf0.C24362h;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;

public enum FunctionClassKind {
    Function(C23872e.f60330i, "Function", false, false),
    SuspendFunction(C23872e.f60324c, "SuspendFunction", true, false),
    KFunction(r4, "KFunction", false, true),
    KSuspendFunction(r4, "KSuspendFunction", true, true);
    
    public static final C23874a Companion = null;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final C25066c packageFqName;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a */
    public static final class C23874a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a */
        public static final class C23875a {

            /* renamed from: a */
            public final FunctionClassKind f60389a;

            /* renamed from: b */
            public final int f60390b;

            public C23875a(FunctionClassKind functionClassKind, int i) {
                this.f60389a = functionClassKind;
                this.f60390b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23875a)) {
                    return false;
                }
                C23875a aVar = (C23875a) obj;
                return this.f60389a == aVar.f60389a && this.f60390b == aVar.f60390b;
            }

            public final int hashCode() {
                return (this.f60389a.hashCode() * 31) + this.f60390b;
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("KindWithArity(kind=");
                k.append(this.f60389a);
                k.append(", arity=");
                return C16530d.m42014g(k, this.f60390b, ')');
            }
        }

        /* renamed from: a */
        public static C23875a m58712a(String str, C25066c cVar) {
            FunctionClassKind functionClassKind;
            boolean z;
            Integer num;
            boolean z2;
            boolean z3;
            C24362h.m61211f(cVar, "packageFqName");
            FunctionClassKind[] values = FunctionClassKind.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    functionClassKind = null;
                    break;
                }
                functionClassKind = values[i];
                i++;
                if (!C24362h.m61206a(functionClassKind.getPackageFqName(), cVar) || !C25081h.m62835F(str, functionClassKind.getClassNamePrefix())) {
                    z3 = false;
                    continue;
                } else {
                    z3 = true;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            if (functionClassKind == null) {
                return null;
            }
            String substring = str.substring(functionClassKind.getClassNamePrefix().length());
            C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int length2 = substring.length();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= length2) {
                        num = Integer.valueOf(i3);
                        break;
                    }
                    char charAt = substring.charAt(i2);
                    i2++;
                    int i4 = charAt - '0';
                    if (i4 < 0 || i4 >= 10) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        break;
                    }
                    i3 = (i3 * 10) + i4;
                }
            }
            num = null;
            if (num == null) {
                return null;
            }
            return new C23875a(functionClassKind, num.intValue());
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C23874a();
    }

    private FunctionClassKind(C25066c cVar, String str, boolean z, boolean z2) {
        this.packageFqName = cVar;
        this.classNamePrefix = str;
        this.isSuspendType = z;
        this.isReflectType = z2;
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final C25066c getPackageFqName() {
        return this.packageFqName;
    }

    public final C25069e numberedClassName(int i) {
        return C25069e.m62820i(C24362h.m61216k(Integer.valueOf(i), this.classNamePrefix));
    }
}
