package com.veriff.sdk.internal;

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

/* renamed from: com.veriff.sdk.internal.bg */
final class C21438bg<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: g */
    public static final /* synthetic */ boolean f53930g = true;

    /* renamed from: h */
    private static final Comparator<Comparable> f53931h = new Comparator<Comparable>() {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: a */
    public Comparator<? super K> f53932a;

    /* renamed from: b */
    public C21447f<K, V>[] f53933b;

    /* renamed from: c */
    public final C21447f<K, V> f53934c;

    /* renamed from: d */
    public int f53935d;

    /* renamed from: e */
    public int f53936e;

    /* renamed from: f */
    public int f53937f;

    /* renamed from: i */
    private C21438bg<K, V>.C13715c f53938i;

    /* renamed from: j */
    private C21438bg<K, V>.C16530d f53939j;

    /* renamed from: com.veriff.sdk.internal.bg$c */
    public final class C21442c extends AbstractSet<Map.Entry<K, V>> {
        public C21442c() {
        }

        public void clear() {
            C21438bg.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C21438bg.this.mo54292a((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C21438bg<K, V>.C16759e<Map.Entry<K, V>>(this) {
                {
                    C21438bg bgVar = C21438bg.this;
                }

                /* renamed from: a */
                public Map.Entry<K, V> next() {
                    return mo54321b();
                }
            };
        }

        public boolean remove(Object obj) {
            C21447f a;
            if (!(obj instanceof Map.Entry) || (a = C21438bg.this.mo54292a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C21438bg.this.mo54293a(a, true);
            return true;
        }

        public int size() {
            return C21438bg.this.f53935d;
        }
    }

    /* renamed from: com.veriff.sdk.internal.bg$d */
    public final class C21444d extends AbstractSet<K> {
        public C21444d() {
        }

        public void clear() {
            C21438bg.this.clear();
        }

        public boolean contains(Object obj) {
            return C21438bg.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C21438bg<K, V>.C16759e<K>(this) {
                {
                    C21438bg bgVar = C21438bg.this;
                }

                public K next() {
                    return mo54321b().f53956f;
                }
            };
        }

        public boolean remove(Object obj) {
            return C21438bg.this.mo54294b(obj) != null;
        }

        public int size() {
            return C21438bg.this.f53935d;
        }
    }

    /* renamed from: com.veriff.sdk.internal.bg$e */
    public abstract class C21446e<T> implements Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public C21447f<K, V> f53947b;

        /* renamed from: c */
        public C21447f<K, V> f53948c = null;

        /* renamed from: d */
        public int f53949d;

        public C21446e() {
            this.f53947b = C21438bg.this.f53934c.f53954d;
            this.f53949d = C21438bg.this.f53936e;
        }

        /* renamed from: b */
        public final C21447f<K, V> mo54321b() {
            C21447f<K, V> fVar = this.f53947b;
            C21438bg bgVar = C21438bg.this;
            if (fVar == bgVar.f53934c) {
                throw new NoSuchElementException();
            } else if (bgVar.f53936e == this.f53949d) {
                this.f53947b = fVar.f53954d;
                this.f53948c = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f53947b != C21438bg.this.f53934c;
        }

        public final void remove() {
            C21447f<K, V> fVar = this.f53948c;
            if (fVar != null) {
                C21438bg.this.mo54293a(fVar, true);
                this.f53948c = null;
                this.f53949d = C21438bg.this.f53936e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<C21438bg> cls = C21438bg.class;
    }

    public C21438bg() {
        this((Comparator) null);
    }

    /* renamed from: a */
    private static int m51171a(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public C21447f<K, V> mo54291a(K k, boolean z) {
        int i;
        C21447f<K, V> fVar;
        C21447f<K, V> fVar2;
        int i2;
        Comparator<? super K> comparator = this.f53932a;
        C21447f<K, V>[] fVarArr = this.f53933b;
        int a = m51171a(k.hashCode());
        int length = (fVarArr.length - 1) & a;
        C21447f<K, V> fVar3 = fVarArr[length];
        if (fVar3 != null) {
            Comparable comparable = comparator == f53931h ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(fVar3.f53956f);
                } else {
                    i2 = comparator.compare(k, fVar3.f53956f);
                }
                if (i2 == 0) {
                    return fVar3;
                }
                C21447f<K, V> fVar4 = i2 < 0 ? fVar3.f53952b : fVar3.f53953c;
                if (fVar4 == null) {
                    fVar = fVar3;
                    i = i2;
                    break;
                }
                fVar3 = fVar4;
            }
        } else {
            fVar = fVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C21447f<K, V> fVar5 = this.f53934c;
        if (fVar != null) {
            fVar2 = new C21447f<>(fVar, k, a, fVar5, fVar5.f53955e);
            if (i < 0) {
                fVar.f53952b = fVar2;
            } else {
                fVar.f53953c = fVar2;
            }
            m51178b(fVar, true);
        } else if (comparator != f53931h || (k instanceof Comparable)) {
            fVar2 = new C21447f<>(fVar, k, a, fVar5, fVar5.f53955e);
            fVarArr[length] = fVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.f53935d;
        this.f53935d = i3 + 1;
        if (i3 > this.f53937f) {
            m51172a();
        }
        this.f53936e++;
        return fVar2;
    }

    /* renamed from: b */
    public C21447f<K, V> mo54294b(Object obj) {
        C21447f<K, V> a = mo54290a(obj);
        if (a != null) {
            mo54293a(a, true);
        }
        return a;
    }

    public void clear() {
        Arrays.fill(this.f53933b, (Object) null);
        this.f53935d = 0;
        this.f53936e++;
        C21447f<K, V> fVar = this.f53934c;
        C21447f<K, V> fVar2 = fVar.f53954d;
        while (fVar2 != fVar) {
            C21447f<K, V> fVar3 = fVar2.f53954d;
            fVar2.f53955e = null;
            fVar2.f53954d = null;
            fVar2 = fVar3;
        }
        fVar.f53955e = fVar;
        fVar.f53954d = fVar;
    }

    public boolean containsKey(Object obj) {
        return mo54290a(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C21438bg<K, V>.C13715c cVar = this.f53938i;
        if (cVar != null) {
            return cVar;
        }
        C21438bg<K, V>.C13715c cVar2 = new C21442c();
        this.f53938i = cVar2;
        return cVar2;
    }

    public V get(Object obj) {
        C21447f a = mo54290a(obj);
        if (a != null) {
            return a.f53958h;
        }
        return null;
    }

    public Set<K> keySet() {
        C21438bg<K, V>.C16530d dVar = this.f53939j;
        if (dVar != null) {
            return dVar;
        }
        C21438bg<K, V>.C16530d dVar2 = new C21444d();
        this.f53939j = dVar2;
        return dVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C21447f a = mo54291a(k, true);
            V v2 = a.f53958h;
            a.f53958h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C21447f b = mo54294b(obj);
        if (b != null) {
            return b.f53958h;
        }
        return null;
    }

    public int size() {
        return this.f53935d;
    }

    public C21438bg(Comparator<? super K> comparator) {
        this.f53935d = 0;
        this.f53936e = 0;
        this.f53932a = comparator == null ? f53931h : comparator;
        this.f53934c = new C21447f<>();
        C21447f<K, V>[] fVarArr = new C21447f[16];
        this.f53933b = fVarArr;
        this.f53937f = (fVarArr.length / 4) + (fVarArr.length / 2);
    }

    /* renamed from: com.veriff.sdk.internal.bg$b */
    public static class C21441b<K, V> {

        /* renamed from: a */
        private C21447f<K, V> f53944a;

        /* renamed from: a */
        public void mo54309a(C21447f<K, V> fVar) {
            C21447f<K, V> fVar2 = null;
            while (fVar != null) {
                fVar.f53951a = fVar2;
                fVar2 = fVar;
                fVar = fVar.f53952b;
            }
            this.f53944a = fVar2;
        }

        /* renamed from: a */
        public C21447f<K, V> mo54308a() {
            C21447f<K, V> fVar = this.f53944a;
            if (fVar == null) {
                return null;
            }
            C21447f<K, V> fVar2 = fVar.f53951a;
            fVar.f53951a = null;
            C21447f<K, V> fVar3 = fVar.f53953c;
            while (true) {
                C21447f<K, V> fVar4 = fVar2;
                fVar2 = fVar3;
                C21447f<K, V> fVar5 = fVar4;
                if (fVar2 != null) {
                    fVar2.f53951a = fVar5;
                    fVar3 = fVar2.f53952b;
                } else {
                    this.f53944a = fVar5;
                    return fVar;
                }
            }
        }
    }

    /* renamed from: b */
    private void m51178b(C21447f<K, V> fVar, boolean z) {
        while (fVar != null) {
            C21447f<K, V> fVar2 = fVar.f53952b;
            C21447f<K, V> fVar3 = fVar.f53953c;
            int i = 0;
            int i2 = fVar2 != null ? fVar2.f53959i : 0;
            int i3 = fVar3 != null ? fVar3.f53959i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C21447f<K, V> fVar4 = fVar3.f53952b;
                C21447f<K, V> fVar5 = fVar3.f53953c;
                int i5 = fVar5 != null ? fVar5.f53959i : 0;
                if (fVar4 != null) {
                    i = fVar4.f53959i;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m51173a(fVar);
                } else if (f53930g || i6 == 1) {
                    m51177b(fVar3);
                    m51173a(fVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C21447f<K, V> fVar6 = fVar2.f53952b;
                C21447f<K, V> fVar7 = fVar2.f53953c;
                int i7 = fVar7 != null ? fVar7.f53959i : 0;
                if (fVar6 != null) {
                    i = fVar6.f53959i;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m51177b(fVar);
                } else if (f53930g || i8 == -1) {
                    m51173a(fVar2);
                    m51177b(fVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                fVar.f53959i = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f53930g || i4 == -1 || i4 == 1) {
                fVar.f53959i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            fVar = fVar.f53951a;
        }
    }

    /* renamed from: com.veriff.sdk.internal.bg$f */
    public static final class C21447f<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C21447f<K, V> f53951a;

        /* renamed from: b */
        public C21447f<K, V> f53952b;

        /* renamed from: c */
        public C21447f<K, V> f53953c;

        /* renamed from: d */
        public C21447f<K, V> f53954d;

        /* renamed from: e */
        public C21447f<K, V> f53955e;

        /* renamed from: f */
        public final K f53956f;

        /* renamed from: g */
        public final int f53957g;

        /* renamed from: h */
        public V f53958h;

        /* renamed from: i */
        public int f53959i;

        public C21447f() {
            this.f53956f = null;
            this.f53957g = -1;
            this.f53955e = this;
            this.f53954d = this;
        }

        /* renamed from: a */
        public C21447f<K, V> mo54323a() {
            C21447f<K, V> fVar = this;
            for (C21447f<K, V> fVar2 = this.f53952b; fVar2 != null; fVar2 = fVar2.f53952b) {
                fVar = fVar2;
            }
            return fVar;
        }

        /* renamed from: b */
        public C21447f<K, V> mo54324b() {
            C21447f<K, V> fVar = this;
            for (C21447f<K, V> fVar2 = this.f53953c; fVar2 != null; fVar2 = fVar2.f53953c) {
                fVar = fVar2;
            }
            return fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f53956f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f53958h
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
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21438bg.C21447f.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f53956f;
        }

        public V getValue() {
            return this.f53958h;
        }

        public int hashCode() {
            int i;
            K k = this.f53956f;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f53958h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f53958h;
            this.f53958h = v;
            return v2;
        }

        public String toString() {
            return this.f53956f + "=" + this.f53958h;
        }

        public C21447f(C21447f<K, V> fVar, K k, int i, C21447f<K, V> fVar2, C21447f<K, V> fVar3) {
            this.f53951a = fVar;
            this.f53956f = k;
            this.f53957g = i;
            this.f53959i = 1;
            this.f53954d = fVar2;
            this.f53955e = fVar3;
            fVar3.f53954d = this;
            fVar2.f53955e = this;
        }
    }

    /* renamed from: com.veriff.sdk.internal.bg$a */
    public static final class C21440a<K, V> {

        /* renamed from: a */
        private C21447f<K, V> f53940a;

        /* renamed from: b */
        private int f53941b;

        /* renamed from: c */
        private int f53942c;

        /* renamed from: d */
        private int f53943d;

        /* renamed from: a */
        public void mo54306a(int i) {
            this.f53941b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f53943d = 0;
            this.f53942c = 0;
            this.f53940a = null;
        }

        /* renamed from: a */
        public void mo54307a(C21447f<K, V> fVar) {
            fVar.f53953c = null;
            fVar.f53951a = null;
            fVar.f53952b = null;
            fVar.f53959i = 1;
            int i = this.f53941b;
            if (i > 0) {
                int i2 = this.f53943d;
                if ((i2 & 1) == 0) {
                    this.f53943d = i2 + 1;
                    this.f53941b = i - 1;
                    this.f53942c++;
                }
            }
            fVar.f53951a = this.f53940a;
            this.f53940a = fVar;
            int i3 = this.f53943d + 1;
            this.f53943d = i3;
            int i4 = this.f53941b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f53943d = i3 + 1;
                this.f53941b = i4 - 1;
                this.f53942c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f53943d & i6) == i6) {
                    int i7 = this.f53942c;
                    if (i7 == 0) {
                        C21447f<K, V> fVar2 = this.f53940a;
                        C21447f<K, V> fVar3 = fVar2.f53951a;
                        C21447f<K, V> fVar4 = fVar3.f53951a;
                        fVar3.f53951a = fVar4.f53951a;
                        this.f53940a = fVar3;
                        fVar3.f53952b = fVar4;
                        fVar3.f53953c = fVar2;
                        fVar3.f53959i = fVar2.f53959i + 1;
                        fVar4.f53951a = fVar3;
                        fVar2.f53951a = fVar3;
                    } else if (i7 == 1) {
                        C21447f<K, V> fVar5 = this.f53940a;
                        C21447f<K, V> fVar6 = fVar5.f53951a;
                        this.f53940a = fVar6;
                        fVar6.f53953c = fVar5;
                        fVar6.f53959i = fVar5.f53959i + 1;
                        fVar5.f53951a = fVar6;
                        this.f53942c = 0;
                    } else if (i7 == 2) {
                        this.f53942c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public C21447f<K, V> mo54305a() {
            C21447f<K, V> fVar = this.f53940a;
            if (fVar.f53951a == null) {
                return fVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C21447f<K, V> mo54290a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo54291a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C21447f<K, V> mo54292a(Map.Entry<?, ?> entry) {
        C21447f<K, V> a = mo54290a((Object) entry.getKey());
        if (a != null && m51175a((Object) a.f53958h, (Object) entry.getValue())) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m51175a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m51177b(C21447f<K, V> fVar) {
        C21447f<K, V> fVar2 = fVar.f53952b;
        C21447f<K, V> fVar3 = fVar.f53953c;
        C21447f<K, V> fVar4 = fVar2.f53952b;
        C21447f<K, V> fVar5 = fVar2.f53953c;
        fVar.f53952b = fVar5;
        if (fVar5 != null) {
            fVar5.f53951a = fVar;
        }
        m51174a(fVar, fVar2);
        fVar2.f53953c = fVar;
        fVar.f53951a = fVar2;
        int i = 0;
        int max = Math.max(fVar3 != null ? fVar3.f53959i : 0, fVar5 != null ? fVar5.f53959i : 0) + 1;
        fVar.f53959i = max;
        if (fVar4 != null) {
            i = fVar4.f53959i;
        }
        fVar2.f53959i = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    public void mo54293a(C21447f<K, V> fVar, boolean z) {
        int i;
        if (z) {
            C21447f<K, V> fVar2 = fVar.f53955e;
            fVar2.f53954d = fVar.f53954d;
            fVar.f53954d.f53955e = fVar2;
            fVar.f53955e = null;
            fVar.f53954d = null;
        }
        C21447f<K, V> fVar3 = fVar.f53952b;
        C21447f<K, V> fVar4 = fVar.f53953c;
        C21447f<K, V> fVar5 = fVar.f53951a;
        int i2 = 0;
        if (fVar3 == null || fVar4 == null) {
            if (fVar3 != null) {
                m51174a(fVar, fVar3);
                fVar.f53952b = null;
            } else if (fVar4 != null) {
                m51174a(fVar, fVar4);
                fVar.f53953c = null;
            } else {
                m51174a(fVar, (C21447f<K, V>) null);
            }
            m51178b(fVar5, false);
            this.f53935d--;
            this.f53936e++;
            return;
        }
        C21447f<K, V> b = fVar3.f53959i > fVar4.f53959i ? fVar3.mo54324b() : fVar4.mo54323a();
        mo54293a(b, false);
        C21447f<K, V> fVar6 = fVar.f53952b;
        if (fVar6 != null) {
            i = fVar6.f53959i;
            b.f53952b = fVar6;
            fVar6.f53951a = b;
            fVar.f53952b = null;
        } else {
            i = 0;
        }
        C21447f<K, V> fVar7 = fVar.f53953c;
        if (fVar7 != null) {
            i2 = fVar7.f53959i;
            b.f53953c = fVar7;
            fVar7.f53951a = b;
            fVar.f53953c = null;
        }
        b.f53959i = Math.max(i, i2) + 1;
        m51174a(fVar, b);
    }

    /* renamed from: a */
    private void m51174a(C21447f<K, V> fVar, C21447f<K, V> fVar2) {
        C21447f<K, V> fVar3 = fVar.f53951a;
        fVar.f53951a = null;
        if (fVar2 != null) {
            fVar2.f53951a = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f53957g;
            C21447f<K, V>[] fVarArr = this.f53933b;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f53952b == fVar) {
            fVar3.f53952b = fVar2;
        } else if (f53930g || fVar3.f53953c == fVar) {
            fVar3.f53953c = fVar2;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private void m51173a(C21447f<K, V> fVar) {
        C21447f<K, V> fVar2 = fVar.f53952b;
        C21447f<K, V> fVar3 = fVar.f53953c;
        C21447f<K, V> fVar4 = fVar3.f53952b;
        C21447f<K, V> fVar5 = fVar3.f53953c;
        fVar.f53953c = fVar4;
        if (fVar4 != null) {
            fVar4.f53951a = fVar;
        }
        m51174a(fVar, fVar3);
        fVar3.f53952b = fVar;
        fVar.f53951a = fVar3;
        int i = 0;
        int max = Math.max(fVar2 != null ? fVar2.f53959i : 0, fVar4 != null ? fVar4.f53959i : 0) + 1;
        fVar.f53959i = max;
        if (fVar5 != null) {
            i = fVar5.f53959i;
        }
        fVar3.f53959i = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    private void m51172a() {
        C21447f<K, V>[] a = m51176a(this.f53933b);
        this.f53933b = a;
        this.f53937f = (a.length / 4) + (a.length / 2);
    }

    /* renamed from: a */
    public static <K, V> C21447f<K, V>[] m51176a(C21447f<K, V>[] fVarArr) {
        int length = fVarArr.length;
        C21447f<K, V>[] fVarArr2 = new C21447f[(length * 2)];
        C21441b bVar = new C21441b();
        C21440a aVar = new C21440a();
        C21440a aVar2 = new C21440a();
        for (int i = 0; i < length; i++) {
            C21447f<K, V> fVar = fVarArr[i];
            if (fVar != null) {
                bVar.mo54309a(fVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C21447f a = bVar.mo54308a();
                    if (a == null) {
                        break;
                    } else if ((a.f53957g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                aVar.mo54306a(i2);
                aVar2.mo54306a(i3);
                bVar.mo54309a(fVar);
                while (true) {
                    C21447f a2 = bVar.mo54308a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f53957g & length) == 0) {
                        aVar.mo54307a(a2);
                    } else {
                        aVar2.mo54307a(a2);
                    }
                }
                C21447f<K, V> fVar2 = null;
                fVarArr2[i] = i2 > 0 ? aVar.mo54305a() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar2 = aVar2.mo54305a();
                }
                fVarArr2[i4] = fVar2;
            }
        }
        return fVarArr2;
    }
}
