package p214q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: q.b */
public class C6120b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public C6123c<K, V> f19472b;

    /* renamed from: c */
    public C6123c<K, V> f19473c;

    /* renamed from: d */
    public WeakHashMap<C6126f<K, V>, Boolean> f19474d = new WeakHashMap<>();

    /* renamed from: e */
    public int f19475e = 0;

    /* renamed from: q.b$a */
    public static class C6121a<K, V> extends C6125e<K, V> {
        public C6121a(C6123c<K, V> cVar, C6123c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public final C6123c<K, V> mo22086b(C6123c<K, V> cVar) {
            return cVar.f19479e;
        }

        /* renamed from: c */
        public final C6123c<K, V> mo22087c(C6123c<K, V> cVar) {
            return cVar.f19478d;
        }
    }

    /* renamed from: q.b$b */
    public static class C6122b<K, V> extends C6125e<K, V> {
        public C6122b(C6123c<K, V> cVar, C6123c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public final C6123c<K, V> mo22086b(C6123c<K, V> cVar) {
            return cVar.f19478d;
        }

        /* renamed from: c */
        public final C6123c<K, V> mo22087c(C6123c<K, V> cVar) {
            return cVar.f19479e;
        }
    }

    /* renamed from: q.b$c */
    public static class C6123c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f19476b;

        /* renamed from: c */
        public final V f19477c;

        /* renamed from: d */
        public C6123c<K, V> f19478d;

        /* renamed from: e */
        public C6123c<K, V> f19479e;

        public C6123c(K k, V v) {
            this.f19476b = k;
            this.f19477c = v;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6123c)) {
                return false;
            }
            C6123c cVar = (C6123c) obj;
            if (!this.f19476b.equals(cVar.f19476b) || !this.f19477c.equals(cVar.f19477c)) {
                return false;
            }
            return true;
        }

        public final K getKey() {
            return this.f19476b;
        }

        public final V getValue() {
            return this.f19477c;
        }

        public final int hashCode() {
            return this.f19476b.hashCode() ^ this.f19477c.hashCode();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f19476b + "=" + this.f19477c;
        }
    }

    /* renamed from: q.b$d */
    public class C6124d implements Iterator<Map.Entry<K, V>>, C6126f<K, V> {

        /* renamed from: b */
        public C6123c<K, V> f19480b;

        /* renamed from: c */
        public boolean f19481c = true;

        public C6124d() {
        }

        /* renamed from: a */
        public final void mo22094a(C6123c<K, V> cVar) {
            boolean z;
            C6123c<K, V> cVar2 = this.f19480b;
            if (cVar == cVar2) {
                C6123c<K, V> cVar3 = cVar2.f19479e;
                this.f19480b = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f19481c = z;
            }
        }

        public final boolean hasNext() {
            if (!this.f19481c) {
                C6123c<K, V> cVar = this.f19480b;
                if (cVar == null || cVar.f19478d == null) {
                    return false;
                }
                return true;
            } else if (C6120b.this.f19472b != null) {
                return true;
            } else {
                return false;
            }
        }

        public final Object next() {
            C6123c<K, V> cVar;
            if (this.f19481c) {
                this.f19481c = false;
                this.f19480b = C6120b.this.f19472b;
            } else {
                C6123c<K, V> cVar2 = this.f19480b;
                if (cVar2 != null) {
                    cVar = cVar2.f19478d;
                } else {
                    cVar = null;
                }
                this.f19480b = cVar;
            }
            return this.f19480b;
        }
    }

    /* renamed from: q.b$e */
    public static abstract class C6125e<K, V> implements Iterator<Map.Entry<K, V>>, C6126f<K, V> {

        /* renamed from: b */
        public C6123c<K, V> f19483b;

        /* renamed from: c */
        public C6123c<K, V> f19484c;

        public C6125e(C6123c<K, V> cVar, C6123c<K, V> cVar2) {
            this.f19483b = cVar2;
            this.f19484c = cVar;
        }

        /* renamed from: a */
        public final void mo22094a(C6123c<K, V> cVar) {
            C6123c<K, V> cVar2 = null;
            if (this.f19483b == cVar && cVar == this.f19484c) {
                this.f19484c = null;
                this.f19483b = null;
            }
            C6123c<K, V> cVar3 = this.f19483b;
            if (cVar3 == cVar) {
                this.f19483b = mo22086b(cVar3);
            }
            C6123c<K, V> cVar4 = this.f19484c;
            if (cVar4 == cVar) {
                C6123c<K, V> cVar5 = this.f19483b;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = mo22087c(cVar4);
                }
                this.f19484c = cVar2;
            }
        }

        /* renamed from: b */
        public abstract C6123c<K, V> mo22086b(C6123c<K, V> cVar);

        /* renamed from: c */
        public abstract C6123c<K, V> mo22087c(C6123c<K, V> cVar);

        public final boolean hasNext() {
            return this.f19484c != null;
        }

        public final Object next() {
            C6123c<K, V> cVar;
            C6123c<K, V> cVar2 = this.f19484c;
            C6123c<K, V> cVar3 = this.f19483b;
            if (cVar2 == cVar3 || cVar3 == null) {
                cVar = null;
            } else {
                cVar = mo22087c(cVar2);
            }
            this.f19484c = cVar;
            return cVar2;
        }
    }

    /* renamed from: q.b$f */
    public interface C6126f<K, V> {
        /* renamed from: a */
        void mo22094a(C6123c<K, V> cVar);
    }

    /* renamed from: a */
    public C6123c<K, V> mo22079a(K k) {
        C6123c<K, V> cVar = this.f19472b;
        while (cVar != null && !cVar.f19476b.equals(k)) {
            cVar = cVar.f19478d;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo22080b(K k, V v) {
        C6123c a = mo22079a(k);
        if (a != null) {
            return a.f19477c;
        }
        C6123c<K, V> cVar = new C6123c<>(k, v);
        this.f19475e++;
        C6123c<K, V> cVar2 = this.f19473c;
        if (cVar2 == null) {
            this.f19472b = cVar;
            this.f19473c = cVar;
            return null;
        }
        cVar2.f19478d = cVar;
        cVar.f19479e = cVar2;
        this.f19473c = cVar;
        return null;
    }

    /* renamed from: d */
    public V mo22081d(K k) {
        C6123c a = mo22079a(k);
        if (a == null) {
            return null;
        }
        this.f19475e--;
        if (!this.f19474d.isEmpty()) {
            for (C6126f<K, V> a2 : this.f19474d.keySet()) {
                a2.mo22094a(a);
            }
        }
        C6123c<K, V> cVar = a.f19479e;
        if (cVar != null) {
            cVar.f19478d = a.f19478d;
        } else {
            this.f19472b = a.f19478d;
        }
        C6123c<K, V> cVar2 = a.f19478d;
        if (cVar2 != null) {
            cVar2.f19479e = cVar;
        } else {
            this.f19473c = cVar;
        }
        a.f19478d = null;
        a.f19479e = null;
        return a.f19477c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p214q.C6120b.C6125e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p214q.C6120b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            q.b r7 = (p214q.C6120b) r7
            int r1 = r6.f19475e
            int r3 = r7.f19475e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            q.b$e r3 = (p214q.C6120b.C6125e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            q.b$e r4 = (p214q.C6120b.C6125e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            q.b$e r7 = (p214q.C6120b.C6125e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p214q.C6120b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C6125e eVar = (C6125e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        C6121a aVar = new C6121a(this.f19472b, this.f19473c);
        this.f19474d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[");
        Iterator it = iterator();
        while (true) {
            C6125e eVar = (C6125e) it;
            if (eVar.hasNext()) {
                k.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    k.append(", ");
                }
            } else {
                k.append("]");
                return k.toString();
            }
        }
    }
}
