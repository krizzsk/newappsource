package p988j$.util;

import com.appsflyer.share.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p988j$.util.Collection;
import p988j$.util.List;
import p988j$.util.function.Consumer;
import p988j$.util.function.Predicate;
import p988j$.util.function.UnaryOperator;

/* renamed from: j$.util.DesugarCollections */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f64470a;

    /* renamed from: b */
    static final Class f64471b = Collections.synchronizedList(new LinkedList()).getClass();

    /* renamed from: c */
    private static final Field f64472c;

    /* renamed from: d */
    private static final Field f64473d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Constructor f64474e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Constructor f64475f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<Object> cls = Object.class;
        Class<?> cls2 = Collections.synchronizedCollection(new ArrayList()).getClass();
        f64470a = cls2;
        Constructor<?> constructor2 = null;
        try {
            field = cls2.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f64472c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls2.getDeclaredField(Constants.URL_CAMPAIGN);
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f64473d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(new Class[]{Set.class, cls});
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f64475f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls2.getDeclaredConstructor(new Class[]{Collection.class, cls});
        } catch (NoSuchMethodException unused4) {
        }
        f64474e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* renamed from: c */
    public static void m64678c(Iterable iterable, Consumer consumer) {
        Field field = f64472c;
        if (field == null) {
            try {
                Collection.EL.m64672a((java.util.Collection) f64473d.get(iterable), consumer);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(iterable)) {
                    Collection.EL.m64672a((java.util.Collection) f64473d.get(iterable), consumer);
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection forEach.", e2);
            }
        }
    }

    /* renamed from: d */
    static boolean m64679d(java.util.Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f64472c;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f64473d.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    java.util.Collection collection3 = (java.util.Collection) f64473d.get(collection);
                    removeIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
                }
                return removeIf;
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
            }
        }
    }

    /* renamed from: e */
    static void m64680e(List list, UnaryOperator unaryOperator) {
        Field field = f64472c;
        if (field == null) {
            try {
                List list2 = (List) f64473d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).replaceAll(unaryOperator);
                } else {
                    List.CC.$default$replaceAll(list2, unaryOperator);
                }
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized list replaceAll fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    java.util.List list3 = (java.util.List) f64473d.get(list);
                    if (list3 instanceof List) {
                        ((List) list3).replaceAll(unaryOperator);
                    } else {
                        List.CC.$default$replaceAll(list3, unaryOperator);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list replaceAll.", e2);
            }
        }
    }

    /* renamed from: f */
    static void m64681f(java.util.List list, Comparator comparator) {
        Field field = f64472c;
        if (field == null) {
            try {
                java.util.List list2 = (java.util.List) f64473d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).sort(comparator);
                } else {
                    List.CC.$default$sort(list2, comparator);
                }
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    java.util.List list3 = (java.util.List) f64473d.get(list);
                    if (list3 instanceof List) {
                        ((List) list3).sort(comparator);
                    } else {
                        List.CC.$default$sort(list3, comparator);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list sort.", e2);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C25913e(map);
    }
}
