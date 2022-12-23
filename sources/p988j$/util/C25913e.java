package p988j$.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p988j$.time.C25782a;
import p988j$.util.Map;
import p988j$.util.concurrent.C25906u;
import p988j$.util.concurrent.C25907v;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.Function;

/* renamed from: j$.util.e */
final class C25913e implements Map, Serializable, Map {

    /* renamed from: a */
    private final Map f64592a;

    /* renamed from: b */
    final Object f64593b = this;

    /* renamed from: c */
    private transient Set f64594c;

    /* renamed from: d */
    private transient Set f64595d;

    /* renamed from: e */
    private transient Collection f64596e;

    C25913e(Map map) {
        map.getClass();
        this.f64592a = map;
    }

    /* renamed from: a */
    private static Set m64759a(Set set, Object obj) {
        if (DesugarCollections.f64475f == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (Set) DesugarCollections.f64475f.newInstance(new Object[]{set, obj});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    public final void clear() {
        synchronized (this.f64593b) {
            this.f64592a.clear();
        }
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj2;
        Object apply;
        synchronized (this.f64593b) {
            Map map = this.f64592a;
            if (map instanceof Map) {
                obj2 = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                loop0:
                while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    while (true) {
                        apply = biFunction.apply(obj, obj3);
                        if (apply != null) {
                            if (obj3 == null) {
                                obj3 = concurrentMap.putIfAbsent(obj, apply);
                                if (obj3 == null) {
                                    break loop0;
                                }
                            } else if (concurrentMap.replace(obj, obj3, apply)) {
                                break;
                            }
                        } else {
                            apply = null;
                            if (obj3 == null && !concurrentMap.containsKey(obj)) {
                                break;
                            } else if (concurrentMap.remove(obj, obj3)) {
                                break;
                            }
                        }
                    }
                }
                obj2 = apply;
            } else {
                obj2 = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj2;
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2 = r1.putIfAbsent(r4, (r5 = r5.apply(r4)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object computeIfAbsent(java.lang.Object r4, p988j$.util.function.Function r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f64593b
            monitor-enter(r0)
            java.util.Map r1 = r3.f64592a     // Catch:{ all -> 0x0035 }
            boolean r2 = r1 instanceof p988j$.util.Map     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0010
            j$.util.Map r1 = (p988j$.util.Map) r1     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r1.computeIfAbsent(r4, r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x0010:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x002f
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch:{ all -> 0x0035 }
            r5.getClass()     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x002d
            java.lang.Object r5 = r5.apply(r4)     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x002d
            java.lang.Object r2 = r1.putIfAbsent(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x002d
            r4 = r5
            goto L_0x0033
        L_0x002d:
            r4 = r2
            goto L_0x0033
        L_0x002f:
            java.lang.Object r4 = p988j$.util.Map.CC.$default$computeIfAbsent(r1, r4, r5)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.C25913e.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        synchronized (this.f64593b) {
            java.util.Map map = this.f64592a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    if (obj3 == null) {
                        obj2 = obj3;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj3);
                    if (apply != null) {
                        if (concurrentMap.replace(obj, obj3, apply)) {
                            obj2 = apply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, obj3)) {
                        obj2 = null;
                        break;
                    }
                }
            } else {
                obj2 = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj2;
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f64593b) {
            containsKey = this.f64592a.containsKey(obj);
        }
        return containsKey;
    }

    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f64593b) {
            containsValue = this.f64592a.containsValue(obj);
        }
        return containsValue;
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.f64593b) {
            if (this.f64595d == null) {
                this.f64595d = m64759a(this.f64592a.entrySet(), this.f64593b);
            }
            set = this.f64595d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f64593b) {
            equals = this.f64592a.equals(obj);
        }
        return equals;
    }

    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f64593b) {
            Map.EL.forEach(this.f64592a, biConsumer);
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f64593b) {
            obj2 = this.f64592a.get(obj);
        }
        return obj2;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        synchronized (this.f64593b) {
            java.util.Map map = this.f64592a;
            if (map instanceof Map) {
                obj3 = ((Map) map).getOrDefault(obj, obj2);
            } else {
                if (map instanceof ConcurrentMap) {
                    Object obj4 = ((ConcurrentMap) map).get(obj);
                    if (obj4 != null) {
                        obj2 = obj4;
                    }
                } else {
                    Object obj5 = map.get(obj);
                    if (obj5 != null || map.containsKey(obj)) {
                        obj2 = obj5;
                    }
                }
                obj3 = obj2;
            }
        }
        return obj3;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f64593b) {
            hashCode = this.f64592a.hashCode();
        }
        return hashCode;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f64593b) {
            isEmpty = this.f64592a.isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.f64593b) {
            if (this.f64594c == null) {
                this.f64594c = m64759a(this.f64592a.keySet(), this.f64593b);
            }
            set = this.f64594c;
        }
        return set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r3 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r6 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, p988j$.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f64593b
            monitor-enter(r0)
            java.util.Map r1 = r4.f64592a     // Catch:{ all -> 0x0046 }
            boolean r2 = r1 instanceof p988j$.util.Map     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0010
            j$.util.Map r1 = (p988j$.util.Map) r1     // Catch:{ all -> 0x0046 }
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch:{ all -> 0x0046 }
            goto L_0x0044
        L_0x0010:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0040
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch:{ all -> 0x0046 }
            r7.getClass()     // Catch:{ all -> 0x0046 }
            r6.getClass()     // Catch:{ all -> 0x0046 }
        L_0x001c:
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0046 }
        L_0x0020:
            if (r2 == 0) goto L_0x0038
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0030
            boolean r2 = r1.replace(r5, r2, r3)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x001c
            r6 = r3
            goto L_0x003e
        L_0x0030:
            boolean r2 = r1.remove(r5, r2)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x001c
            r6 = 0
            goto L_0x003e
        L_0x0038:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0020
        L_0x003e:
            r5 = r6
            goto L_0x0044
        L_0x0040:
            java.lang.Object r5 = p988j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return r5
        L_0x0046:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.C25913e.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f64593b) {
            put = this.f64592a.put(obj, obj2);
        }
        return put;
    }

    public final void putAll(java.util.Map map) {
        synchronized (this.f64593b) {
            this.f64592a.putAll(map);
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        synchronized (this.f64593b) {
            putIfAbsent = Map.EL.putIfAbsent(this.f64592a, obj, obj2);
        }
        return putIfAbsent;
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f64593b) {
            remove = this.f64592a.remove(obj);
        }
        return remove;
    }

    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f64593b) {
            java.util.Map map = this.f64592a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f64593b) {
            java.util.Map map = this.f64592a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f64593b) {
            java.util.Map map = this.f64592a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f64593b) {
            java.util.Map map = this.f64592a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                C25906u uVar = new C25906u(0, concurrentMap, biFunction);
                if (concurrentMap instanceof C25907v) {
                    ((C25907v) concurrentMap).forEach(uVar);
                } else {
                    C25782a.m64406a(concurrentMap, uVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final int size() {
        int size;
        synchronized (this.f64593b) {
            size = this.f64592a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f64593b) {
            obj = this.f64592a.toString();
        }
        return obj;
    }

    public final Collection values() {
        Collection collection;
        Collection collection2;
        synchronized (this.f64593b) {
            if (this.f64596e == null) {
                Collection values = this.f64592a.values();
                Object obj = this.f64593b;
                if (DesugarCollections.f64474e == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        collection2 = (Collection) DesugarCollections.f64474e.newInstance(new Object[]{values, obj});
                    } catch (InstantiationException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f64596e = collection2;
            }
            collection = this.f64596e;
        }
        return collection;
    }
}
