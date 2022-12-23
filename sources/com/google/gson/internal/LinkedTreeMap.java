package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: b */
    public static final C14553a f36709b = new C14553a();
    public Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.C13555b entrySet;
    public final C14559e<K, V> header = new C14559e<>();
    private LinkedTreeMap<K, V>.C13715c keySet;
    public int modCount = 0;
    public C14559e<K, V> root;
    public int size = 0;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    public class C14553a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    public class C14554b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$b$a */
        public class C14555a extends LinkedTreeMap<K, V>.C16530d<Map.Entry<K, V>> {
            public C14555a(C14554b bVar) {
                super();
            }

            public final Object next() {
                return mo43699b();
            }
        }

        public C14554b() {
        }

        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.mo43674b((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C14555a(this);
        }

        public final boolean remove(Object obj) {
            C14559e b;
            if (!(obj instanceof Map.Entry) || (b = LinkedTreeMap.this.mo43674b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.mo43678d(b, true);
            return true;
        }

        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    public final class C14556c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$c$a */
        public class C14557a extends LinkedTreeMap<K, V>.C16530d<K> {
            public C14557a(C14556c cVar) {
                super();
            }

            public final K next() {
                return mo43699b().f36721g;
            }
        }

        public C14556c() {
        }

        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C14557a(this);
        }

        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.getClass();
            C14559e eVar = null;
            if (obj != null) {
                try {
                    eVar = linkedTreeMap.mo43673a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                linkedTreeMap.mo43678d(eVar, true);
            }
            if (eVar != null) {
                return true;
            }
            return false;
        }

        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    public abstract class C14558d<T> implements Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public C14559e<K, V> f36712b;

        /* renamed from: c */
        public C14559e<K, V> f36713c = null;

        /* renamed from: d */
        public int f36714d;

        public C14558d() {
            this.f36712b = LinkedTreeMap.this.header.f36719e;
            this.f36714d = LinkedTreeMap.this.modCount;
        }

        /* renamed from: b */
        public final C14559e<K, V> mo43699b() {
            C14559e<K, V> eVar = this.f36712b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.modCount == this.f36714d) {
                this.f36712b = eVar.f36719e;
                this.f36713c = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f36712b != LinkedTreeMap.this.header;
        }

        public final void remove() {
            C14559e<K, V> eVar = this.f36713c;
            if (eVar != null) {
                LinkedTreeMap.this.mo43678d(eVar, true);
                this.f36713c = null;
                this.f36714d = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedTreeMap> cls = LinkedTreeMap.class;
    }

    public LinkedTreeMap() {
        C14553a aVar = f36709b;
        this.comparator = aVar;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final C14559e<K, V> mo43673a(K k, boolean z) {
        int i;
        C14559e<K, V> eVar;
        Comparable comparable;
        C14559e<K, V> eVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C14559e<K, V> eVar3 = this.root;
        if (eVar3 != null) {
            if (comparator2 == f36709b) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar3.f36721g);
                } else {
                    i = comparator2.compare(k, eVar3.f36721g);
                }
                if (i == 0) {
                    return eVar3;
                }
                if (i < 0) {
                    eVar2 = eVar3.f36717c;
                } else {
                    eVar2 = eVar3.f36718d;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C14559e<K, V> eVar4 = this.header;
        if (eVar3 != null) {
            eVar = new C14559e<>(eVar3, k, eVar4, eVar4.f36720f);
            if (i < 0) {
                eVar3.f36717c = eVar;
            } else {
                eVar3.f36718d = eVar;
            }
            mo43675c(eVar3, true);
        } else if (comparator2 != f36709b || (k instanceof Comparable)) {
            eVar = new C14559e<>(eVar3, k, eVar4, eVar4.f36720f);
            this.root = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.gson.internal.LinkedTreeMap.C14559e<K, V> mo43674b(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            com.google.gson.internal.LinkedTreeMap$e r0 = r5.mo43673a(r0, r2)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r3 = 1
            if (r0 == 0) goto L_0x0028
            V r4 = r0.f36722h
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L_0x0024
            if (r4 == 0) goto L_0x0022
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = 0
            goto L_0x0025
        L_0x0024:
            r6 = 1
        L_0x0025:
            if (r6 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x002b
            r1 = r0
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.mo43674b(java.util.Map$Entry):com.google.gson.internal.LinkedTreeMap$e");
    }

    /* renamed from: c */
    public final void mo43675c(C14559e<K, V> eVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (eVar != null) {
            C14559e<K, V> eVar2 = eVar.f36717c;
            C14559e<K, V> eVar3 = eVar.f36718d;
            int i5 = 0;
            if (eVar2 != null) {
                i = eVar2.f36723i;
            } else {
                i = 0;
            }
            if (eVar3 != null) {
                i2 = eVar3.f36723i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C14559e<K, V> eVar4 = eVar3.f36717c;
                C14559e<K, V> eVar5 = eVar3.f36718d;
                if (eVar5 != null) {
                    i4 = eVar5.f36723i;
                } else {
                    i4 = 0;
                }
                if (eVar4 != null) {
                    i5 = eVar4.f36723i;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    mo43681f(eVar);
                } else {
                    mo43682g(eVar3);
                    mo43681f(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C14559e<K, V> eVar6 = eVar2.f36717c;
                C14559e<K, V> eVar7 = eVar2.f36718d;
                if (eVar7 != null) {
                    i3 = eVar7.f36723i;
                } else {
                    i3 = 0;
                }
                if (eVar6 != null) {
                    i5 = eVar6.f36723i;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    mo43682g(eVar);
                } else {
                    mo43681f(eVar2);
                    mo43682g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                eVar.f36723i = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f36723i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f36716b;
        }
    }

    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C14559e<K, V> eVar = this.header;
        eVar.f36720f = eVar;
        eVar.f36719e = eVar;
    }

    public final boolean containsKey(Object obj) {
        C14559e eVar = null;
        if (obj != null) {
            try {
                eVar = mo43673a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    /* renamed from: d */
    public final void mo43678d(C14559e<K, V> eVar, boolean z) {
        C14559e<K, V> eVar2;
        int i;
        C14559e<K, V> eVar3;
        if (z) {
            C14559e<K, V> eVar4 = eVar.f36720f;
            eVar4.f36719e = eVar.f36719e;
            eVar.f36719e.f36720f = eVar4;
        }
        C14559e<K, V> eVar5 = eVar.f36717c;
        C14559e<K, V> eVar6 = eVar.f36718d;
        C14559e<K, V> eVar7 = eVar.f36716b;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                mo43679e(eVar, eVar5);
                eVar.f36717c = null;
            } else if (eVar6 != null) {
                mo43679e(eVar, eVar6);
                eVar.f36718d = null;
            } else {
                mo43679e(eVar, (C14559e<K, V>) null);
            }
            mo43675c(eVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar5.f36723i > eVar6.f36723i) {
            C14559e<K, V> eVar8 = eVar5.f36718d;
            while (true) {
                C14559e<K, V> eVar9 = eVar8;
                eVar2 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f36718d;
            }
        } else {
            C14559e<K, V> eVar10 = eVar6.f36717c;
            while (true) {
                C14559e<K, V> eVar11 = eVar6;
                eVar6 = eVar10;
                eVar3 = eVar11;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f36717c;
            }
            eVar2 = eVar3;
        }
        mo43678d(eVar2, false);
        C14559e<K, V> eVar12 = eVar.f36717c;
        if (eVar12 != null) {
            i = eVar12.f36723i;
            eVar2.f36717c = eVar12;
            eVar12.f36716b = eVar2;
            eVar.f36717c = null;
        } else {
            i = 0;
        }
        C14559e<K, V> eVar13 = eVar.f36718d;
        if (eVar13 != null) {
            i2 = eVar13.f36723i;
            eVar2.f36718d = eVar13;
            eVar13.f36716b = eVar2;
            eVar.f36718d = null;
        }
        eVar2.f36723i = Math.max(i, i2) + 1;
        mo43679e(eVar, eVar2);
    }

    /* renamed from: e */
    public final void mo43679e(C14559e<K, V> eVar, C14559e<K, V> eVar2) {
        C14559e<K, V> eVar3 = eVar.f36716b;
        eVar.f36716b = null;
        if (eVar2 != null) {
            eVar2.f36716b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f36717c == eVar) {
            eVar3.f36717c = eVar2;
        } else {
            eVar3.f36718d = eVar2;
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.C13555b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.C13555b bVar2 = new C14554b();
        this.entrySet = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public final void mo43681f(C14559e<K, V> eVar) {
        int i;
        int i2;
        C14559e<K, V> eVar2 = eVar.f36717c;
        C14559e<K, V> eVar3 = eVar.f36718d;
        C14559e<K, V> eVar4 = eVar3.f36717c;
        C14559e<K, V> eVar5 = eVar3.f36718d;
        eVar.f36718d = eVar4;
        if (eVar4 != null) {
            eVar4.f36716b = eVar;
        }
        mo43679e(eVar, eVar3);
        eVar3.f36717c = eVar;
        eVar.f36716b = eVar3;
        int i3 = 0;
        if (eVar2 != null) {
            i = eVar2.f36723i;
        } else {
            i = 0;
        }
        if (eVar4 != null) {
            i2 = eVar4.f36723i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.f36723i = max;
        if (eVar5 != null) {
            i3 = eVar5.f36723i;
        }
        eVar3.f36723i = Math.max(max, i3) + 1;
    }

    /* renamed from: g */
    public final void mo43682g(C14559e<K, V> eVar) {
        int i;
        int i2;
        C14559e<K, V> eVar2 = eVar.f36717c;
        C14559e<K, V> eVar3 = eVar.f36718d;
        C14559e<K, V> eVar4 = eVar2.f36717c;
        C14559e<K, V> eVar5 = eVar2.f36718d;
        eVar.f36717c = eVar5;
        if (eVar5 != null) {
            eVar5.f36716b = eVar;
        }
        mo43679e(eVar, eVar2);
        eVar2.f36718d = eVar;
        eVar.f36716b = eVar2;
        int i3 = 0;
        if (eVar3 != null) {
            i = eVar3.f36723i;
        } else {
            i = 0;
        }
        if (eVar5 != null) {
            i2 = eVar5.f36723i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.f36723i = max;
        if (eVar4 != null) {
            i3 = eVar4.f36723i;
        }
        eVar2.f36723i = Math.max(max, i3) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$e r3 = r2.mo43673a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.f36722h
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.get(java.lang.Object):java.lang.Object");
    }

    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.C13715c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.C13715c cVar2 = new C14556c();
        this.keySet = cVar2;
        return cVar2;
    }

    public final V put(K k, V v) {
        if (k != null) {
            C14559e a = mo43673a(k, true);
            V v2 = a.f36722h;
            a.f36722h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x000a
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$e r3 = r2.mo43673a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000b
        L_0x0009:
        L_0x000a:
            r3 = r0
        L_0x000b:
            if (r3 == 0) goto L_0x0011
            r1 = 1
            r2.mo43678d(r3, r1)
        L_0x0011:
            if (r3 == 0) goto L_0x0015
            V r0 = r3.f36722h
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.size;
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$e */
    public static final class C14559e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C14559e<K, V> f36716b;

        /* renamed from: c */
        public C14559e<K, V> f36717c;

        /* renamed from: d */
        public C14559e<K, V> f36718d;

        /* renamed from: e */
        public C14559e<K, V> f36719e;

        /* renamed from: f */
        public C14559e<K, V> f36720f;

        /* renamed from: g */
        public final K f36721g;

        /* renamed from: h */
        public V f36722h;

        /* renamed from: i */
        public int f36723i;

        public C14559e() {
            this.f36721g = null;
            this.f36720f = this;
            this.f36719e = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f36721g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f36722h
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.C14559e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f36721g;
        }

        public final V getValue() {
            return this.f36722h;
        }

        public final int hashCode() {
            int i;
            K k = this.f36721g;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f36722h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public final V setValue(V v) {
            V v2 = this.f36722h;
            this.f36722h = v;
            return v2;
        }

        public final String toString() {
            return this.f36721g + "=" + this.f36722h;
        }

        public C14559e(C14559e<K, V> eVar, K k, C14559e<K, V> eVar2, C14559e<K, V> eVar3) {
            this.f36716b = eVar;
            this.f36721g = k;
            this.f36723i = 1;
            this.f36719e = eVar2;
            this.f36720f = eVar3;
            eVar3.f36719e = this;
            eVar2.f36720f = this;
        }
    }
}
