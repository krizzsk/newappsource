package kotlin.collections.builders;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import df0.C23266a;
import df0.C23267b;
import df0.C23268c;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;
import nf0.C24497a;
import p584jl.C17885a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;
import rf0.C24805g;
import rf0.C24806h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006)*+,-.B\t\b\u0016¢\u0006\u0004\b'\u0010(J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00108\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"8\u0000@BX\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006/"}, mo59060d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "keysArray", "[Ljava/lang/Object;", "valuesArray", "", "presenceArray", "[I", "hashArray", "", "maxProbeDistance", "I", "length", "hashShift", "<set-?>", "size", "getSize", "()I", "Ldf0/b;", "keysView", "Ldf0/b;", "Ldf0/c;", "valuesView", "Ldf0/c;", "Ldf0/a;", "entriesView", "Ldf0/a;", "", "isReadOnly", "Z", "q", "()Z", "<init>", "()V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, C24497a {
    private C23266a<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public K[] keysArray;
    private C23267b<K> keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    public V[] valuesArray;
    private C23268c<V> valuesView;

    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    public static final class C23819a {
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C23820b<K, V> extends C23822d<K, V> implements Iterator<Map.Entry<K, V>>, C24497a, p988j$.util.Iterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23820b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C24362h.m61211f(mapBuilder, "map");
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final Object next() {
            if (this.f60186c < this.f60185b.length) {
                int i = this.f60186c;
                this.f60186c = i + 1;
                this.f60187d = i;
                C23821c cVar = new C23821c(this.f60185b, i);
                mo59236b();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C23821c<K, V> implements Map.Entry<K, V>, C24497a {

        /* renamed from: b */
        public final MapBuilder<K, V> f60183b;

        /* renamed from: c */
        public final int f60184c;

        public C23821c(MapBuilder<K, V> mapBuilder, int i) {
            C24362h.m61211f(mapBuilder, "map");
            this.f60183b = mapBuilder;
            this.f60184c = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C24362h.m61206a(entry.getKey(), getKey()) || !C24362h.m61206a(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final K getKey() {
            return this.f60183b.keysArray[this.f60184c];
        }

        public final V getValue() {
            V[] e = this.f60183b.valuesArray;
            C24362h.m61208c(e);
            return e[this.f60184c];
        }

        public final int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            this.f60183b.mo59210i();
            V[] g = this.f60183b.mo59206g();
            int i = this.f60184c;
            V v2 = g[i];
            g[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C23822d<K, V> {

        /* renamed from: b */
        public final MapBuilder<K, V> f60185b;

        /* renamed from: c */
        public int f60186c;

        /* renamed from: d */
        public int f60187d = -1;

        public C23822d(MapBuilder<K, V> mapBuilder) {
            C24362h.m61211f(mapBuilder, "map");
            this.f60185b = mapBuilder;
            mo59236b();
        }

        /* renamed from: b */
        public final void mo59236b() {
            while (this.f60186c < this.f60185b.length) {
                int[] d = this.f60185b.presenceArray;
                int i = this.f60186c;
                if (d[i] < 0) {
                    this.f60186c = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.f60186c < this.f60185b.length;
        }

        public final void remove() {
            boolean z;
            if (this.f60187d != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f60185b.mo59210i();
                this.f60185b.mo59226t(this.f60187d);
                this.f60187d = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C23823e<K, V> extends C23822d<K, V> implements java.util.Iterator<K>, C24497a, p988j$.util.Iterator {
        public C23823e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final K next() {
            if (this.f60186c < this.f60185b.length) {
                int i = this.f60186c;
                this.f60186c = i + 1;
                this.f60187d = i;
                K k = this.f60185b.keysArray[this.f60187d];
                mo59236b();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C23824f<K, V> extends C23822d<K, V> implements java.util.Iterator<V>, C24497a, p988j$.util.Iterator {
        public C23824f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final V next() {
            if (this.f60186c < this.f60185b.length) {
                int i = this.f60186c;
                this.f60186c = i + 1;
                this.f60187d = i;
                V[] e = this.f60185b.valuesArray;
                C24362h.m61208c(e);
                V v = e[this.f60187d];
                mo59236b();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new C23819a();
    }

    public MapBuilder() {
        this(8);
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final void clear() {
        mo59210i();
        C24805g p = new C24806h(0, this.length - 1).iterator();
        while (p.f62733d) {
            int nextInt = p.nextInt();
            int[] iArr = this.presenceArray;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C17885a.m44455p0(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C17885a.m44455p0(0, this.length, vArr);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsKey(Object obj) {
        return mo59216n(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo59217o(obj) >= 0;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        C23266a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        C23266a<K, V> aVar2 = new C23266a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (this.size != map.size() || !mo59212j(map.entrySet())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo59205f(K k) {
        mo59210i();
        while (true) {
            int p = mo59218p(k);
            int i = this.maxProbeDistance * 2;
            int length2 = this.hashArray.length / 2;
            if (i > length2) {
                i = length2;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[p];
                if (i3 <= 0) {
                    int i4 = this.length;
                    K[] kArr = this.keysArray;
                    if (i4 >= kArr.length) {
                        mo59215l(1);
                    } else {
                        int i5 = i4 + 1;
                        this.length = i5;
                        kArr[i4] = k;
                        this.presenceArray[i4] = p;
                        iArr[p] = i5;
                        this.size++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                } else if (C24362h.m61206a(this.keysArray[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        mo59222r(this.hashArray.length * 2);
                        break;
                    }
                    int i6 = p - 1;
                    if (p == 0) {
                        p = this.hashArray.length - 1;
                    } else {
                        p = i6;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final V[] mo59206g() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] k = C17885a.m44445k(this.keysArray.length);
        this.valuesArray = k;
        return k;
    }

    public final V get(Object obj) {
        int n = mo59216n(obj);
        if (n < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C24362h.m61208c(vArr);
        return vArr[n];
    }

    /* renamed from: h */
    public final void mo59208h() {
        mo59210i();
        this.isReadOnly = true;
    }

    public final int hashCode() {
        int i;
        int i2;
        C23820b bVar = new C23820b(this);
        int i3 = 0;
        while (bVar.hasNext()) {
            if (bVar.f60186c < bVar.f60185b.length) {
                int i4 = bVar.f60186c;
                bVar.f60186c = i4 + 1;
                bVar.f60187d = i4;
                Object obj = bVar.f60185b.keysArray[bVar.f60187d];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] e = bVar.f60185b.valuesArray;
                C24362h.m61208c(e);
                Object obj2 = e[bVar.f60187d];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                bVar.mo59236b();
                i3 += i ^ i2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i3;
    }

    /* renamed from: i */
    public final void mo59210i() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    /* renamed from: j */
    public final boolean mo59212j(Collection<?> collection) {
        C24362h.m61211f(collection, InneractiveMediationDefs.GENDER_MALE);
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo59213k((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo59213k(Map.Entry<? extends K, ? extends V> entry) {
        C24362h.m61211f(entry, "entry");
        int n = mo59216n(entry.getKey());
        if (n < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C24362h.m61208c(vArr);
        return C24362h.m61206a(vArr[n], entry.getValue());
    }

    public final Set<K> keySet() {
        C23267b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        C23267b<K> bVar2 = new C23267b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    /* renamed from: l */
    public final void mo59215l(int i) {
        V[] vArr;
        int i2 = this.length;
        int i3 = i + i2;
        if (i3 >= 0) {
            K[] kArr = this.keysArray;
            if (i3 > kArr.length) {
                int length2 = (kArr.length * 3) / 2;
                if (i3 <= length2) {
                    i3 = length2;
                }
                K[] copyOf = Arrays.copyOf(kArr, i3);
                C24362h.m61210e(copyOf, "copyOf(this, newSize)");
                this.keysArray = copyOf;
                V[] vArr2 = this.valuesArray;
                if (vArr2 != null) {
                    vArr = Arrays.copyOf(vArr2, i3);
                    C24362h.m61210e(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.valuesArray = vArr;
                int[] copyOf2 = Arrays.copyOf(this.presenceArray, i3);
                C24362h.m61210e(copyOf2, "copyOf(this, newSize)");
                this.presenceArray = copyOf2;
                if (i3 < 1) {
                    i3 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i3 * 3);
                if (highestOneBit > this.hashArray.length) {
                    mo59222r(highestOneBit);
                }
            } else if ((i2 + i3) - this.size > kArr.length) {
                mo59222r(this.hashArray.length);
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: n */
    public final int mo59216n(K k) {
        int p = mo59218p(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[p];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C24362h.m61206a(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = p - 1;
            if (p == 0) {
                p = this.hashArray.length - 1;
            } else {
                p = i4;
            }
        }
    }

    /* renamed from: o */
    public final int mo59217o(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                C24362h.m61208c(vArr);
                if (C24362h.m61206a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: p */
    public final int mo59218p(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.hashShift;
    }

    public final V put(K k, V v) {
        mo59210i();
        int f = mo59205f(k);
        V[] g = mo59206g();
        if (f < 0) {
            int i = (-f) - 1;
            V v2 = g[i];
            g[i] = v;
            return v2;
        }
        g[f] = v;
        return null;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        C24362h.m61211f(map, "from");
        mo59210i();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            mo59215l(entrySet.size());
            for (Map.Entry next : entrySet) {
                int f = mo59205f(next.getKey());
                Object[] g = mo59206g();
                if (f >= 0) {
                    g[f] = next.getValue();
                } else {
                    int i = (-f) - 1;
                    if (!C24362h.m61206a(next.getValue(), g[i])) {
                        g[i] = next.getValue();
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public final boolean mo59221q() {
        return this.isReadOnly;
    }

    /* renamed from: r */
    public final void mo59222r(int i) {
        boolean z;
        int i2;
        if (this.length > this.size) {
            V[] vArr = this.valuesArray;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.length;
                if (i3 >= i2) {
                    break;
                }
                if (this.presenceArray[i3] >= 0) {
                    K[] kArr = this.keysArray;
                    kArr[i4] = kArr[i3];
                    if (vArr != null) {
                        vArr[i4] = vArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            C17885a.m44455p0(i4, i2, this.keysArray);
            if (vArr != null) {
                C17885a.m44455p0(i4, this.length, vArr);
            }
            this.length = i4;
        }
        int[] iArr = this.hashArray;
        if (i != iArr.length) {
            this.hashArray = new int[i];
            this.hashShift = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            int length2 = iArr.length;
            C24362h.m61211f(iArr, "<this>");
            Arrays.fill(iArr, 0, length2, 0);
        }
        int i5 = 0;
        while (i5 < this.length) {
            int i6 = i5 + 1;
            int p = mo59218p(this.keysArray[i5]);
            int i7 = this.maxProbeDistance;
            while (true) {
                int[] iArr2 = this.hashArray;
                if (iArr2[p] == 0) {
                    iArr2[p] = i6;
                    this.presenceArray[i5] = p;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                int i8 = p - 1;
                if (p == 0) {
                    p = iArr2.length - 1;
                } else {
                    p = i8;
                }
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final V remove(Object obj) {
        mo59210i();
        int n = mo59216n(obj);
        if (n < 0) {
            n = -1;
        } else {
            mo59226t(n);
        }
        if (n < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C24362h.m61208c(vArr);
        V v = vArr[n];
        vArr[n] = null;
        return v;
    }

    /* renamed from: s */
    public final boolean mo59224s(Map.Entry<? extends K, ? extends V> entry) {
        C24362h.m61211f(entry, "entry");
        mo59210i();
        int n = mo59216n(entry.getKey());
        if (n < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C24362h.m61208c(vArr);
        if (!C24362h.m61206a(vArr[n], entry.getValue())) {
            return false;
        }
        mo59226t(n);
        return true;
    }

    public final int size() {
        return this.size;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59226t(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.keysArray
            java.lang.String r1 = "<this>"
            mf0.C24362h.m61211f(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.presenceArray
            r0 = r0[r12]
            int r1 = r11.maxProbeDistance
            int r1 = r1 * 2
            int[] r2 = r11.hashArray
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L_0x001e:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0028
            int[] r0 = r11.hashArray
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0029
        L_0x0028:
            r0 = r5
        L_0x0029:
            int r4 = r4 + 1
            int r5 = r11.maxProbeDistance
            if (r4 <= r5) goto L_0x0034
            int[] r0 = r11.hashArray
            r0[r1] = r2
            goto L_0x0063
        L_0x0034:
            int[] r5 = r11.hashArray
            r7 = r5[r0]
            if (r7 != 0) goto L_0x003d
            r5[r1] = r2
            goto L_0x0063
        L_0x003d:
            if (r7 >= 0) goto L_0x0042
            r5[r1] = r6
            goto L_0x005a
        L_0x0042:
            K[] r5 = r11.keysArray
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.mo59218p(r5)
            int r5 = r5 - r0
            int[] r9 = r11.hashArray
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x005c
            r9[r1] = r7
            int[] r4 = r11.presenceArray
            r4[r8] = r1
        L_0x005a:
            r1 = r0
            r4 = 0
        L_0x005c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x001e
            int[] r0 = r11.hashArray
            r0[r1] = r6
        L_0x0063:
            int[] r0 = r11.presenceArray
            r0[r12] = r6
            int r12 = r11.size
            int r12 = r12 + r6
            r11.size = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.mo59226t(int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append("{");
        int i = 0;
        C23820b bVar = new C23820b(this);
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            if (bVar.f60186c < bVar.f60185b.length) {
                int i2 = bVar.f60186c;
                bVar.f60186c = i2 + 1;
                bVar.f60187d = i2;
                Object obj = bVar.f60185b.keysArray[bVar.f60187d];
                if (C24362h.m61206a(obj, bVar.f60185b)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] e = bVar.f60185b.valuesArray;
                C24362h.m61208c(e);
                Object obj2 = e[bVar.f60187d];
                if (C24362h.m61206a(obj2, bVar.f60185b)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                bVar.mo59236b();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "sb.toString()");
        return sb2;
    }

    public final Collection<V> values() {
        C23268c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        C23268c<V> cVar2 = new C23268c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public MapBuilder(int i) {
        K[] k = C17885a.m44445k(i);
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = k;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[highestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
