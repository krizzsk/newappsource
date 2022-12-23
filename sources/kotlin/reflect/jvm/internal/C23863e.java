package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.collections.C23816b;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.e */
public final class C23863e {
    /* renamed from: a */
    public static final String m58668a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C24362h.m61210e(parameterTypes, "parameterTypes");
        sb.append(C23816b.m58444Z0(parameterTypes, "(", ")", RuntimeTypeMapperKt$signature$1.f60284f));
        Class<?> returnType = method.getReturnType();
        C24362h.m61210e(returnType, "returnType");
        sb.append(ReflectClassUtilKt.m58950b(returnType));
        return sb.toString();
    }
}
