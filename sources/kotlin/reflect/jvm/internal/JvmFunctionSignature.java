package kotlin.reflect.jvm.internal;

import ce0.C21100e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import mf0.C24362h;
import tg0.C24985d;

public abstract class JvmFunctionSignature {

    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        public final List<Method> f60197a;

        /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$a */
        public static final class C23835a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C21100e.m49298B(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        public FakeJavaAnnotationConstructor(Class<?> cls) {
            C24362h.m61211f(cls, "jClass");
            Method[] declaredMethods = cls.getDeclaredMethods();
            C24362h.m61210e(declaredMethods, "jClass.declaredMethods");
            this.f60197a = C23816b.m58449e1(declaredMethods, new C23835a());
        }

        /* renamed from: a */
        public final String mo59293a() {
            return C23825c.m58520q0(this.f60197a, "", "<init>(", ")V", JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1.f60204f, 24);
        }
    }

    public static final class JavaConstructor extends JvmFunctionSignature {

        /* renamed from: a */
        public final Constructor<?> f60198a;

        public JavaConstructor(Constructor<?> constructor) {
            C24362h.m61211f(constructor, "constructor");
            this.f60198a = constructor;
        }

        /* renamed from: a */
        public final String mo59293a() {
            Class[] parameterTypes = this.f60198a.getParameterTypes();
            C24362h.m61210e(parameterTypes, "constructor.parameterTypes");
            return C23816b.m58444Z0(parameterTypes, "<init>(", ")V", JvmFunctionSignature$JavaConstructor$asString$1.f60205f);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$a */
    public static final class C23836a extends JvmFunctionSignature {

        /* renamed from: a */
        public final Method f60199a;

        public C23836a(Method method) {
            C24362h.m61211f(method, "method");
            this.f60199a = method;
        }

        /* renamed from: a */
        public final String mo59293a() {
            return C23863e.m58668a(this.f60199a);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$b */
    public static final class C23837b extends JvmFunctionSignature {

        /* renamed from: a */
        public final C24985d.C24987b f60200a;

        /* renamed from: b */
        public final String f60201b;

        public C23837b(C24985d.C24987b bVar) {
            this.f60200a = bVar;
            this.f60201b = bVar.mo61530a();
        }

        /* renamed from: a */
        public final String mo59293a() {
            return this.f60201b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$c */
    public static final class C23838c extends JvmFunctionSignature {

        /* renamed from: a */
        public final C24985d.C24987b f60202a;

        /* renamed from: b */
        public final String f60203b;

        public C23838c(C24985d.C24987b bVar) {
            this.f60202a = bVar;
            this.f60203b = bVar.mo61530a();
        }

        /* renamed from: a */
        public final String mo59293a() {
            return this.f60203b;
        }
    }

    /* renamed from: a */
    public abstract String mo59293a();
}
