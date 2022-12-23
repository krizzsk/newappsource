package kj0;

import ij0.C23654n1;
import lj0.C24331h;
import lj0.C24334k;
import p269u2.C6677a;

/* renamed from: kj0.d */
public final class C23809d implements C23808c {

    /* renamed from: a */
    public final C23807b f60168a = new C23807b();

    /* renamed from: b */
    public final String f60169b = "length";

    /* renamed from: c */
    public final String f60170c = "class";

    /* renamed from: a */
    public final C23811f mo59056a(C23810e eVar, C24334k kVar, C23654n1 n1Var) throws Exception {
        int i;
        C24331h remove = kVar.remove(this.f60170c);
        Class<?> type = eVar.getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        if (remove != null) {
            String value = remove.getValue();
            this.f60168a.getClass();
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = C23807b.class.getClassLoader();
            }
            type = contextClassLoader.loadClass(value);
        }
        Class<?> type2 = eVar.getType();
        if (type2.isArray()) {
            C24331h remove2 = kVar.remove(this.f60169b);
            if (remove2 != null) {
                i = Integer.parseInt(remove2.getValue());
            } else {
                i = 0;
            }
            return new C23806a(i, type);
        } else if (type2 != type) {
            return new C6677a((Class) type);
        } else {
            return null;
        }
    }
}
