package qh0;

import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import mf0.C24362h;

/* renamed from: qh0.a */
public interface C24770a {

    /* renamed from: qh0.a$a */
    public static final class C24771a {
        /* renamed from: a */
        public static String m62306a(C24770a aVar, C23900c cVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(cVar, "functionDescriptor");
            if (!aVar.mo60275b(cVar)) {
                return aVar.getDescription();
            }
            return null;
        }
    }

    /* renamed from: a */
    String mo60274a(C23900c cVar);

    /* renamed from: b */
    boolean mo60275b(C23900c cVar);

    String getDescription();
}
