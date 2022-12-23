package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
public final class C0992b {

    /* renamed from: c */
    public static C0992b f3908c = new C0992b();

    /* renamed from: a */
    public final HashMap f3909a = new HashMap();

    /* renamed from: b */
    public final HashMap f3910b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    public static class C0993a {

        /* renamed from: a */
        public final HashMap f3911a = new HashMap();

        /* renamed from: b */
        public final Map<C0994b, Lifecycle.Event> f3912b;

        public C0993a(HashMap hashMap) {
            this.f3912b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f3911a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f3911a.put(event, list);
                }
                list.add((C0994b) entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m2858a(List<C0994b> list, C1033p pVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0994b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i = bVar.f3913a;
                        if (i == 0) {
                            bVar.f3914b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f3914b.invoke(obj, new Object[]{pVar});
                        } else if (i == 2) {
                            bVar.f3914b.invoke(obj, new Object[]{pVar, event});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    public static final class C0994b {

        /* renamed from: a */
        public final int f3913a;

        /* renamed from: b */
        public final Method f3914b;

        public C0994b(Method method, int i) {
            this.f3913a = i;
            this.f3914b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0994b)) {
                return false;
            }
            C0994b bVar = (C0994b) obj;
            if (this.f3913a != bVar.f3913a || !this.f3914b.getName().equals(bVar.f3914b.getName())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f3914b.getName().hashCode() + (this.f3913a * 31);
        }
    }

    /* renamed from: c */
    public static void m2855c(HashMap hashMap, C0994b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) hashMap.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f3914b;
            StringBuilder k = C13555b.m33972k("Method ");
            k.append(method.getName());
            k.append(" in ");
            k.append(cls.getName());
            k.append(" already declared with different @OnLifecycleEvent value: previous value ");
            k.append(event2);
            k.append(", new value ");
            k.append(event);
            throw new IllegalArgumentException(k.toString());
        } else if (event2 == null) {
            hashMap.put(bVar, event);
        }
    }

    /* renamed from: a */
    public final C0993a mo4266a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(mo4267b(superclass).f3912b);
        }
        for (Class b : cls.getInterfaces()) {
            for (Map.Entry next : mo4267b(b).f3912b.entrySet()) {
                m2855c(hashMap, (C0994b) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1045x xVar = (C1045x) method.getAnnotation(C1045x.class);
            if (xVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1033p.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m2855c(hashMap, new C0994b(method, i), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0993a aVar = new C0993a(hashMap);
        this.f3909a.put(cls, aVar);
        this.f3910b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final C0993a mo4267b(Class<?> cls) {
        C0993a aVar = (C0993a) this.f3909a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return mo4266a(cls, (Method[]) null);
    }
}
