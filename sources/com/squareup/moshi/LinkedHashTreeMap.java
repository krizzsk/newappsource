package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: b */
    public static final C7987a f24208b = new C7987a();
    public final Comparator<? super K> comparator = f24208b;
    private LinkedHashTreeMap<K, V>.C13715c entrySet;
    public final C7994f<K, V> header = new C7994f<>();
    private LinkedHashTreeMap<K, V>.C16530d keySet;
    public int modCount = 0;
    public int size = 0;
    public C7994f<K, V>[] table = new C7994f[16];
    public int threshold = 12;

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    public class C7987a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    public static final class C7988b<K, V> {

        /* renamed from: a */
        public C7994f<K, V> f24209a;

        /* renamed from: b */
        public int f24210b;

        /* renamed from: c */
        public int f24211c;

        /* renamed from: d */
        public int f24212d;

        /* renamed from: a */
        public final void mo25019a(C7994f<K, V> fVar) {
            fVar.f24221d = null;
            fVar.f24219b = null;
            fVar.f24220c = null;
            fVar.f24227j = 1;
            int i = this.f24210b;
            if (i > 0) {
                int i2 = this.f24212d;
                if ((i2 & 1) == 0) {
                    this.f24212d = i2 + 1;
                    this.f24210b = i - 1;
                    this.f24211c++;
                }
            }
            fVar.f24219b = this.f24209a;
            this.f24209a = fVar;
            int i3 = this.f24212d + 1;
            this.f24212d = i3;
            int i4 = this.f24210b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f24212d = i3 + 1;
                this.f24210b = i4 - 1;
                this.f24211c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f24212d & i6) == i6) {
                    int i7 = this.f24211c;
                    if (i7 == 0) {
                        C7994f<K, V> fVar2 = this.f24209a;
                        C7994f<K, V> fVar3 = fVar2.f24219b;
                        C7994f<K, V> fVar4 = fVar3.f24219b;
                        fVar3.f24219b = fVar4.f24219b;
                        this.f24209a = fVar3;
                        fVar3.f24220c = fVar4;
                        fVar3.f24221d = fVar2;
                        fVar3.f24227j = fVar2.f24227j + 1;
                        fVar4.f24219b = fVar3;
                        fVar2.f24219b = fVar3;
                    } else if (i7 == 1) {
                        C7994f<K, V> fVar5 = this.f24209a;
                        C7994f<K, V> fVar6 = fVar5.f24219b;
                        this.f24209a = fVar6;
                        fVar6.f24221d = fVar5;
                        fVar6.f24227j = fVar5.f24227j + 1;
                        fVar5.f24219b = fVar6;
                        this.f24211c = 0;
                    } else if (i7 == 2) {
                        this.f24211c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    public final class C7989c extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c$a */
        public class C7990a extends LinkedHashTreeMap<K, V>.C16759e<Map.Entry<K, V>> {
            public C7990a(C7989c cVar) {
                super();
            }

            public final Object next() {
                return mo25030b();
            }
        }

        public C7989c() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.mo25004b((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C7990a(this);
        }

        public final boolean remove(Object obj) {
            C7994f b;
            if (!(obj instanceof Map.Entry) || (b = LinkedHashTreeMap.this.mo25004b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.mo25008d(b, true);
            return true;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    public final class C7991d extends AbstractSet<K> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d$a */
        public class C7992a extends LinkedHashTreeMap<K, V>.C16759e<K> {
            public C7992a(C7991d dVar) {
                super();
            }

            public final K next() {
                return mo25030b().f24224g;
            }
        }

        public C7991d() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C7992a(this);
        }

        public final boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.getClass();
            C7994f fVar = null;
            if (obj != null) {
                try {
                    fVar = linkedHashTreeMap.mo25003a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (fVar != null) {
                linkedHashTreeMap.mo25008d(fVar, true);
            }
            if (fVar != null) {
                return true;
            }
            return false;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    public abstract class C7993e<T> implements Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public C7994f<K, V> f24215b;

        /* renamed from: c */
        public C7994f<K, V> f24216c = null;

        /* renamed from: d */
        public int f24217d;

        public C7993e() {
            this.f24215b = LinkedHashTreeMap.this.header.f24222e;
            this.f24217d = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: b */
        public final C7994f<K, V> mo25030b() {
            C7994f<K, V> fVar = this.f24215b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (fVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f24217d) {
                this.f24215b = fVar.f24222e;
                this.f24216c = fVar;
                return fVar;
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
            return this.f24215b != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C7994f<K, V> fVar = this.f24216c;
            if (fVar != null) {
                LinkedHashTreeMap.this.mo25008d(fVar, true);
                this.f24216c = null;
                this.f24217d = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedHashTreeMap> cls = LinkedHashTreeMap.class;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final C7994f<K, V> mo25003a(K k, boolean z) {
        int i;
        C7994f<K, V> fVar;
        C7994f<K, V> fVar2;
        C7994f<K, V> fVar3;
        C7994f<K, V> fVar4;
        C7994f<K, V> fVar5;
        C7994f<K, V> fVar6;
        Comparable comparable;
        int i2;
        C7994f<K, V> fVar7;
        K k2 = k;
        Comparator<? super K> comparator2 = this.comparator;
        C7994f<K, V>[] fVarArr = this.table;
        int hashCode = k.hashCode();
        int i3 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i4 = ((i3 >>> 7) ^ i3) ^ (i3 >>> 4);
        int length = i4 & (fVarArr.length - 1);
        C7994f<K, V> fVar8 = fVarArr[length];
        C7994f<K, V> fVar9 = null;
        if (fVar8 != null) {
            if (comparator2 == f24208b) {
                comparable = (Comparable) k2;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(fVar8.f24224g);
                } else {
                    i2 = comparator2.compare(k2, fVar8.f24224g);
                }
                if (i2 == 0) {
                    return fVar8;
                }
                if (i2 < 0) {
                    fVar7 = fVar8.f24220c;
                } else {
                    fVar7 = fVar8.f24221d;
                }
                if (fVar7 == null) {
                    fVar = fVar8;
                    i = i2;
                    break;
                }
                fVar8 = fVar7;
            }
        } else {
            fVar = fVar8;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C7994f<K, V> fVar10 = this.header;
        if (fVar != null) {
            C7994f<K, V> fVar11 = new C7994f<>(fVar, k, i4, fVar10, fVar10.f24223f);
            if (i < 0) {
                fVar.f24220c = fVar11;
            } else {
                fVar.f24221d = fVar11;
            }
            mo25005c(fVar, true);
            fVar2 = fVar11;
        } else if (comparator2 != f24208b || (k2 instanceof Comparable)) {
            fVar2 = new C7994f<>(fVar, k, i4, fVar10, fVar10.f24223f);
            fVarArr[length] = fVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i5 = this.size;
        this.size = i5 + 1;
        if (i5 > this.threshold) {
            C7994f<K, V>[] fVarArr2 = this.table;
            int length2 = fVarArr2.length;
            int i6 = length2 * 2;
            C7994f<K, V>[] fVarArr3 = new C7994f[i6];
            C7988b bVar = new C7988b();
            C7988b bVar2 = new C7988b();
            for (int i7 = 0; i7 < length2; i7++) {
                C7994f<K, V> fVar12 = fVarArr2[i7];
                if (fVar12 != null) {
                    C7994f<K, V> fVar13 = fVar9;
                    for (C7994f<K, V> fVar14 = fVar12; fVar14 != null; fVar14 = fVar14.f24220c) {
                        fVar14.f24219b = fVar13;
                        fVar13 = fVar14;
                    }
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (fVar13 == null) {
                            fVar3 = fVar13;
                            fVar13 = fVar9;
                        } else {
                            fVar3 = fVar13.f24219b;
                            fVar13.f24219b = fVar9;
                            C7994f<K, V> fVar15 = fVar13.f24221d;
                            while (fVar15 != null) {
                                fVar15.f24219b = fVar3;
                                C7994f<K, V> fVar16 = fVar15;
                                fVar15 = fVar15.f24220c;
                                fVar3 = fVar16;
                            }
                        }
                        if (fVar13 == null) {
                            break;
                        }
                        if ((fVar13.f24225h & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                        fVar13 = fVar3;
                        fVar9 = null;
                    }
                    bVar.f24210b = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    bVar.f24212d = 0;
                    bVar.f24211c = 0;
                    bVar.f24209a = null;
                    bVar2.f24210b = ((Integer.highestOneBit(i9) * 2) - 1) - i9;
                    bVar2.f24212d = 0;
                    bVar2.f24211c = 0;
                    bVar2.f24209a = null;
                    C7994f<K, V> fVar17 = null;
                    while (fVar12 != null) {
                        fVar12.f24219b = fVar17;
                        C7994f<K, V> fVar18 = fVar12;
                        fVar12 = fVar12.f24220c;
                        fVar17 = fVar18;
                    }
                    while (true) {
                        if (fVar17 != null) {
                            C7994f<K, V> fVar19 = fVar17.f24219b;
                            fVar9 = null;
                            fVar17.f24219b = null;
                            C7994f<K, V> fVar20 = fVar17.f24221d;
                            while (true) {
                                C7994f<K, V> fVar21 = fVar20;
                                fVar4 = fVar19;
                                fVar19 = fVar21;
                                if (fVar19 == null) {
                                    break;
                                }
                                fVar19.f24219b = fVar4;
                                fVar20 = fVar19.f24220c;
                            }
                        } else {
                            fVar4 = fVar17;
                            fVar17 = null;
                            fVar9 = null;
                        }
                        if (fVar17 == null) {
                            break;
                        }
                        if ((fVar17.f24225h & length2) == 0) {
                            bVar.mo25019a(fVar17);
                        } else {
                            bVar2.mo25019a(fVar17);
                        }
                        fVar17 = fVar4;
                    }
                    if (i8 > 0) {
                        fVar5 = bVar.f24209a;
                        if (fVar5.f24219b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar5 = fVar9;
                    }
                    fVarArr3[i7] = fVar5;
                    int i11 = i7 + length2;
                    if (i9 > 0) {
                        fVar6 = bVar2.f24209a;
                        if (fVar6.f24219b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar6 = fVar9;
                    }
                    fVarArr3[i11] = fVar6;
                }
            }
            this.table = fVarArr3;
            this.threshold = (i6 / 4) + (i6 / 2);
        }
        this.modCount++;
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.moshi.LinkedHashTreeMap.C7994f<K, V> mo25004b(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            com.squareup.moshi.LinkedHashTreeMap$f r0 = r5.mo25003a(r0, r2)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r3 = 1
            if (r0 == 0) goto L_0x0028
            V r4 = r0.f24226i
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
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.mo25004b(java.util.Map$Entry):com.squareup.moshi.LinkedHashTreeMap$f");
    }

    /* renamed from: c */
    public final void mo25005c(C7994f<K, V> fVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (fVar != null) {
            C7994f<K, V> fVar2 = fVar.f24220c;
            C7994f<K, V> fVar3 = fVar.f24221d;
            int i5 = 0;
            if (fVar2 != null) {
                i = fVar2.f24227j;
            } else {
                i = 0;
            }
            if (fVar3 != null) {
                i2 = fVar3.f24227j;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C7994f<K, V> fVar4 = fVar3.f24220c;
                C7994f<K, V> fVar5 = fVar3.f24221d;
                if (fVar5 != null) {
                    i4 = fVar5.f24227j;
                } else {
                    i4 = 0;
                }
                if (fVar4 != null) {
                    i5 = fVar4.f24227j;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    mo25012g(fVar3);
                }
                mo25011f(fVar);
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C7994f<K, V> fVar6 = fVar2.f24220c;
                C7994f<K, V> fVar7 = fVar2.f24221d;
                if (fVar7 != null) {
                    i3 = fVar7.f24227j;
                } else {
                    i3 = 0;
                }
                if (fVar6 != null) {
                    i5 = fVar6.f24227j;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo25011f(fVar2);
                }
                mo25012g(fVar);
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                fVar.f24227j = i + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f24227j = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f24219b;
        }
    }

    public final void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C7994f<K, V> fVar = this.header;
        C7994f<K, V> fVar2 = fVar.f24222e;
        while (fVar2 != fVar) {
            C7994f<K, V> fVar3 = fVar2.f24222e;
            fVar2.f24223f = null;
            fVar2.f24222e = null;
            fVar2 = fVar3;
        }
        fVar.f24223f = fVar;
        fVar.f24222e = fVar;
    }

    public final boolean containsKey(Object obj) {
        C7994f fVar = null;
        if (obj != null) {
            try {
                fVar = mo25003a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return fVar != null;
    }

    /* renamed from: d */
    public final void mo25008d(C7994f<K, V> fVar, boolean z) {
        C7994f<K, V> fVar2;
        int i;
        C7994f<K, V> fVar3;
        if (z) {
            C7994f<K, V> fVar4 = fVar.f24223f;
            fVar4.f24222e = fVar.f24222e;
            fVar.f24222e.f24223f = fVar4;
            fVar.f24223f = null;
            fVar.f24222e = null;
        }
        C7994f<K, V> fVar5 = fVar.f24220c;
        C7994f<K, V> fVar6 = fVar.f24221d;
        C7994f<K, V> fVar7 = fVar.f24219b;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                mo25009e(fVar, fVar5);
                fVar.f24220c = null;
            } else if (fVar6 != null) {
                mo25009e(fVar, fVar6);
                fVar.f24221d = null;
            } else {
                mo25009e(fVar, (C7994f<K, V>) null);
            }
            mo25005c(fVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar5.f24227j > fVar6.f24227j) {
            C7994f<K, V> fVar8 = fVar5.f24221d;
            while (true) {
                C7994f<K, V> fVar9 = fVar8;
                fVar2 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                }
                fVar8 = fVar5.f24221d;
            }
        } else {
            C7994f<K, V> fVar10 = fVar6.f24220c;
            while (true) {
                C7994f<K, V> fVar11 = fVar6;
                fVar6 = fVar10;
                fVar3 = fVar11;
                if (fVar6 == null) {
                    break;
                }
                fVar10 = fVar6.f24220c;
            }
            fVar2 = fVar3;
        }
        mo25008d(fVar2, false);
        C7994f<K, V> fVar12 = fVar.f24220c;
        if (fVar12 != null) {
            i = fVar12.f24227j;
            fVar2.f24220c = fVar12;
            fVar12.f24219b = fVar2;
            fVar.f24220c = null;
        } else {
            i = 0;
        }
        C7994f<K, V> fVar13 = fVar.f24221d;
        if (fVar13 != null) {
            i2 = fVar13.f24227j;
            fVar2.f24221d = fVar13;
            fVar13.f24219b = fVar2;
            fVar.f24221d = null;
        }
        fVar2.f24227j = Math.max(i, i2) + 1;
        mo25009e(fVar, fVar2);
    }

    /* renamed from: e */
    public final void mo25009e(C7994f<K, V> fVar, C7994f<K, V> fVar2) {
        C7994f<K, V> fVar3 = fVar.f24219b;
        fVar.f24219b = null;
        if (fVar2 != null) {
            fVar2.f24219b = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f24225h;
            C7994f<K, V>[] fVarArr = this.table;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f24220c == fVar) {
            fVar3.f24220c = fVar2;
        } else {
            fVar3.f24221d = fVar2;
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.C13715c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.C13715c cVar2 = new C7989c();
        this.entrySet = cVar2;
        return cVar2;
    }

    /* renamed from: f */
    public final void mo25011f(C7994f<K, V> fVar) {
        int i;
        int i2;
        C7994f<K, V> fVar2 = fVar.f24220c;
        C7994f<K, V> fVar3 = fVar.f24221d;
        C7994f<K, V> fVar4 = fVar3.f24220c;
        C7994f<K, V> fVar5 = fVar3.f24221d;
        fVar.f24221d = fVar4;
        if (fVar4 != null) {
            fVar4.f24219b = fVar;
        }
        mo25009e(fVar, fVar3);
        fVar3.f24220c = fVar;
        fVar.f24219b = fVar3;
        int i3 = 0;
        if (fVar2 != null) {
            i = fVar2.f24227j;
        } else {
            i = 0;
        }
        if (fVar4 != null) {
            i2 = fVar4.f24227j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        fVar.f24227j = max;
        if (fVar5 != null) {
            i3 = fVar5.f24227j;
        }
        fVar3.f24227j = Math.max(max, i3) + 1;
    }

    /* renamed from: g */
    public final void mo25012g(C7994f<K, V> fVar) {
        int i;
        int i2;
        C7994f<K, V> fVar2 = fVar.f24220c;
        C7994f<K, V> fVar3 = fVar.f24221d;
        C7994f<K, V> fVar4 = fVar2.f24220c;
        C7994f<K, V> fVar5 = fVar2.f24221d;
        fVar.f24220c = fVar5;
        if (fVar5 != null) {
            fVar5.f24219b = fVar;
        }
        mo25009e(fVar, fVar2);
        fVar2.f24221d = fVar;
        fVar.f24219b = fVar2;
        int i3 = 0;
        if (fVar3 != null) {
            i = fVar3.f24227j;
        } else {
            i = 0;
        }
        if (fVar5 != null) {
            i2 = fVar5.f24227j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        fVar.f24227j = max;
        if (fVar4 != null) {
            i3 = fVar4.f24227j;
        }
        fVar2.f24227j = Math.max(max, i3) + 1;
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
            com.squareup.moshi.LinkedHashTreeMap$f r3 = r2.mo25003a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.f24226i
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.get(java.lang.Object):java.lang.Object");
    }

    public final Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C16530d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.C16530d dVar2 = new C7991d();
        this.keySet = dVar2;
        return dVar2;
    }

    public final V put(K k, V v) {
        if (k != null) {
            C7994f a = mo25003a(k, true);
            V v2 = a.f24226i;
            a.f24226i = v;
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
            com.squareup.moshi.LinkedHashTreeMap$f r3 = r2.mo25003a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000b
        L_0x0009:
        L_0x000a:
            r3 = r0
        L_0x000b:
            if (r3 == 0) goto L_0x0011
            r1 = 1
            r2.mo25008d(r3, r1)
        L_0x0011:
            if (r3 == 0) goto L_0x0015
            V r0 = r3.f24226i
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.size;
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    public static final class C7994f<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C7994f<K, V> f24219b;

        /* renamed from: c */
        public C7994f<K, V> f24220c;

        /* renamed from: d */
        public C7994f<K, V> f24221d;

        /* renamed from: e */
        public C7994f<K, V> f24222e;

        /* renamed from: f */
        public C7994f<K, V> f24223f;

        /* renamed from: g */
        public final K f24224g;

        /* renamed from: h */
        public final int f24225h;

        /* renamed from: i */
        public V f24226i;

        /* renamed from: j */
        public int f24227j;

        public C7994f() {
            this.f24224g = null;
            this.f24225h = -1;
            this.f24223f = this;
            this.f24222e = this;
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
                K r0 = r3.f24224g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f24226i
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
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.C7994f.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f24224g;
        }

        public final V getValue() {
            return this.f24226i;
        }

        public final int hashCode() {
            K k = this.f24224g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f24226i;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            V v2 = this.f24226i;
            this.f24226i = v;
            return v2;
        }

        public final String toString() {
            return this.f24224g + "=" + this.f24226i;
        }

        public C7994f(C7994f<K, V> fVar, K k, int i, C7994f<K, V> fVar2, C7994f<K, V> fVar3) {
            this.f24219b = fVar;
            this.f24224g = k;
            this.f24225h = i;
            this.f24227j = 1;
            this.f24222e = fVar2;
            this.f24223f = fVar3;
            fVar3.f24222e = this;
            fVar2.f24223f = this;
        }
    }
}
