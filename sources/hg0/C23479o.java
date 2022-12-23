package hg0;

import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25065b;
import ug0.C25066c;
import uh0.C25081h;

/* renamed from: hg0.o */
public final class C23479o {

    /* renamed from: a */
    public static final C25066c f59266a = new C25066c("kotlin.jvm.JvmField");

    /* renamed from: b */
    public static final C25065b f59267b = C25065b.m62789f("kotlin/jvm/internal/RepeatableContainer", false);

    static {
        C25065b.m62790l(new C25066c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    /* renamed from: a */
    public static final String m57578a(String str) {
        C24362h.m61211f(str, "propertyName");
        return m57580c(str) ? str : C24362h.m61216k(C17875h.m44300i(str), "get");
    }

    /* renamed from: b */
    public static final String m57579b(String str) {
        String str2;
        if (m57580c(str)) {
            str2 = str.substring(2);
            C24362h.m61210e(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = C17875h.m44300i(str);
        }
        return C24362h.m61216k(str2, "set");
    }

    /* renamed from: c */
    public static final boolean m57580c(String str) {
        C24362h.m61211f(str, "name");
        if (!C25081h.m62835F(str, "is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (C24362h.m61213h(97, charAt) > 0 || C24362h.m61213h(charAt, 122) > 0) {
            return true;
        }
        return false;
    }
}
