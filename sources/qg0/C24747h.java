package qg0;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mf0.C24362h;

/* renamed from: qg0.h */
public abstract class C24747h {

    /* renamed from: a */
    public static final C24750c f62647a = new C24750c(JvmPrimitiveType.BOOLEAN);

    /* renamed from: b */
    public static final C24750c f62648b = new C24750c(JvmPrimitiveType.CHAR);

    /* renamed from: c */
    public static final C24750c f62649c = new C24750c(JvmPrimitiveType.BYTE);

    /* renamed from: d */
    public static final C24750c f62650d = new C24750c(JvmPrimitiveType.SHORT);

    /* renamed from: e */
    public static final C24750c f62651e = new C24750c(JvmPrimitiveType.INT);

    /* renamed from: f */
    public static final C24750c f62652f = new C24750c(JvmPrimitiveType.FLOAT);

    /* renamed from: g */
    public static final C24750c f62653g = new C24750c(JvmPrimitiveType.LONG);

    /* renamed from: h */
    public static final C24750c f62654h = new C24750c(JvmPrimitiveType.DOUBLE);

    /* renamed from: qg0.h$a */
    public static final class C24748a extends C24747h {

        /* renamed from: i */
        public final C24747h f62655i;

        public C24748a(C24747h hVar) {
            C24362h.m61211f(hVar, "elementType");
            this.f62655i = hVar;
        }
    }

    /* renamed from: qg0.h$b */
    public static final class C24749b extends C24747h {

        /* renamed from: i */
        public final String f62656i;

        public C24749b(String str) {
            C24362h.m61211f(str, "internalName");
            this.f62656i = str;
        }
    }

    /* renamed from: qg0.h$c */
    public static final class C24750c extends C24747h {

        /* renamed from: i */
        public final JvmPrimitiveType f62657i;

        public C24750c(JvmPrimitiveType jvmPrimitiveType) {
            this.f62657i = jvmPrimitiveType;
        }
    }

    public final String toString() {
        return C24751i.m62272f(this);
    }
}
