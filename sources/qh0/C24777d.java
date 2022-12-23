package qh0;

import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import mf0.C24362h;
import qh0.C24770a;

/* renamed from: qh0.d */
public abstract class C24777d implements C24770a {

    /* renamed from: a */
    public final String f62681a;

    /* renamed from: qh0.d$a */
    public static final class C24778a extends C24777d {

        /* renamed from: b */
        public static final C24778a f62682b = new C24778a();

        public C24778a() {
            super("must be a member function");
        }

        /* renamed from: b */
        public final boolean mo60275b(C23900c cVar) {
            C24362h.m61211f(cVar, "functionDescriptor");
            return cVar.mo53422O() != null;
        }
    }

    /* renamed from: qh0.d$b */
    public static final class C24779b extends C24777d {

        /* renamed from: b */
        public static final C24779b f62683b = new C24779b();

        public C24779b() {
            super("must be a member or an extension function");
        }

        /* renamed from: b */
        public final boolean mo60275b(C23900c cVar) {
            C24362h.m61211f(cVar, "functionDescriptor");
            return (cVar.mo53422O() == null && cVar.mo53423R() == null) ? false : true;
        }
    }

    public C24777d(String str) {
        this.f62681a = str;
    }

    /* renamed from: a */
    public final String mo60274a(C23900c cVar) {
        return C24770a.C24771a.m62306a(this, cVar);
    }

    public final String getDescription() {
        return this.f62681a;
    }
}
