package fg0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* renamed from: fg0.c */
public final class C23356c {

    /* renamed from: a */
    public static final C23356c f59135a = new C23356c();

    /* renamed from: b */
    public static C23357a f59136b;

    /* renamed from: fg0.c$a */
    public static final class C23357a {

        /* renamed from: a */
        public final Method f59137a;

        /* renamed from: b */
        public final Method f59138b;

        public C23357a(Method method, Method method2) {
            this.f59137a = method;
            this.f59138b = method2;
        }
    }

    /* renamed from: a */
    public static C23357a m57432a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new C23357a(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.m58952d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C23357a((Method) null, (Method) null);
        }
    }
}
