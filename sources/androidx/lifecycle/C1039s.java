package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.s */
public final class C1039s {

    /* renamed from: a */
    public static HashMap f3980a = new HashMap();

    /* renamed from: b */
    public static HashMap f3981b = new HashMap();

    /* renamed from: a */
    public static C1008g m2909a(Constructor<? extends C1008g> constructor, Object obj) {
        try {
            return (C1008g) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static String m2910b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: c */
    public static int m2911c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        Class<C1031o> cls2 = C1031o.class;
        Integer num = (Integer) f3980a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String b = m2910b(canonicalName);
                if (!str.isEmpty()) {
                    b = str + "." + b;
                }
                constructor = Class.forName(b).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                f3981b.put(cls, Collections.singletonList(constructor));
            } else {
                C0992b bVar = C0992b.f3908c;
                Boolean bool = (Boolean) bVar.f3910b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                bVar.f3910b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((C1045x) declaredMethods[i2].getAnnotation(C1045x.class)) != null) {
                                bVar.mo4266a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (m2911c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) f3981b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                if (m2911c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) f3981b.get(cls3));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            f3981b.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        f3980a.put(cls, Integer.valueOf(i));
        return i;
    }
}
