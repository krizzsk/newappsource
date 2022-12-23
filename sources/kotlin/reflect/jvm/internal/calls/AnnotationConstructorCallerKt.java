package kotlin.reflect.jvm.internal.calls;

import bf0.C21049c;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C23812a;
import kotlin.collections.C23816b;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import mf0.C24361g;
import mf0.C24362h;

public final class AnnotationConstructorCallerKt {

    /* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$a */
    public static final class C23858a implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ Class<T> f60297a;

        /* renamed from: b */
        public final /* synthetic */ Map<String, Object> f60298b;

        /* renamed from: c */
        public final /* synthetic */ C21049c<String> f60299c;

        /* renamed from: d */
        public final /* synthetic */ C21049c<Integer> f60300d;

        /* renamed from: e */
        public final /* synthetic */ List<Method> f60301e;

        public C23858a(Class<T> cls, Map<String, ? extends Object> map, C21049c<String> cVar, C21049c<Integer> cVar2, List<Method> list) {
            this.f60297a = cls;
            this.f60298b = map;
            this.f60299c = cVar;
            this.f60300d = cVar2;
            this.f60301e = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            Annotation annotation;
            boolean z2;
            boolean z3;
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f60297a;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(this.f60300d.getValue().intValue());
                    }
                } else if (name.equals("toString")) {
                    return this.f60299c.getValue();
                }
            }
            boolean z4 = false;
            if (C24362h.m61206a(name, "equals")) {
                if (objArr != null && objArr.length == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Class<T> cls = this.f60297a;
                    List<Method> list = this.f60301e;
                    Map<String, Object> map = this.f60298b;
                    C24362h.m61210e(objArr, "args");
                    Object c1 = C23816b.m58447c1(objArr);
                    Class cls2 = null;
                    if (c1 instanceof Annotation) {
                        annotation = (Annotation) c1;
                    } else {
                        annotation = null;
                    }
                    if (annotation != null) {
                        cls2 = C24361g.m61144N(C24361g.m61140J(annotation));
                    }
                    if (C24362h.m61206a(cls2, cls)) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Method method2 = (Method) it.next();
                                Object obj2 = map.get(method2.getName());
                                Object invoke = method2.invoke(c1, new Object[0]);
                                if (obj2 instanceof boolean[]) {
                                    boolean[] zArr = (boolean[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(zArr, (boolean[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.BooleanArray");
                                    }
                                } else if (obj2 instanceof char[]) {
                                    char[] cArr = (char[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(cArr, (char[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharArray");
                                    }
                                } else if (obj2 instanceof byte[]) {
                                    byte[] bArr = (byte[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(bArr, (byte[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                } else if (obj2 instanceof short[]) {
                                    short[] sArr = (short[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(sArr, (short[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ShortArray");
                                    }
                                } else if (obj2 instanceof int[]) {
                                    int[] iArr = (int[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(iArr, (int[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                                    }
                                } else if (obj2 instanceof float[]) {
                                    float[] fArr = (float[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(fArr, (float[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                    }
                                } else if (obj2 instanceof long[]) {
                                    long[] jArr = (long[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(jArr, (long[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.LongArray");
                                    }
                                } else if (obj2 instanceof double[]) {
                                    double[] dArr = (double[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(dArr, (double[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.DoubleArray");
                                    }
                                } else if (obj2 instanceof Object[]) {
                                    Object[] objArr2 = (Object[]) obj2;
                                    if (invoke != null) {
                                        z3 = Arrays.equals(objArr2, (Object[]) invoke);
                                        continue;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<*>");
                                    }
                                } else {
                                    z3 = C24362h.m61206a(obj2, invoke);
                                    continue;
                                }
                                if (!z3) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                            z4 = true;
                        }
                    }
                    return Boolean.valueOf(z4);
                }
            }
            if (this.f60298b.containsKey(name)) {
                return this.f60298b.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C23816b.m58452h1(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    /* renamed from: a */
    public static final <T> T m58657a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C24362h.m61211f(cls, "annotationClass");
        C24362h.m61211f(list, "methods");
        C21049c b = C23812a.m58432b(new C23859xa743ec88(map));
        C21049c b2 = C23812a.m58432b(new C23860x4fc4299(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C23858a(cls, map, b2, b, list));
        if (newProxyInstance != null) {
            return newProxyInstance;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
    }
}
