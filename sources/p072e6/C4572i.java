package p072e6;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p584jl.C17885a;

/* renamed from: e6.i */
public final class C4572i implements C4564b {

    /* renamed from: a */
    public final C4569g<C4573a, Object> f15736a = new C4569g<>();

    /* renamed from: b */
    public final C4574b f15737b = new C4574b();

    /* renamed from: c */
    public final HashMap f15738c = new HashMap();

    /* renamed from: d */
    public final HashMap f15739d = new HashMap();

    /* renamed from: e */
    public final int f15740e;

    /* renamed from: f */
    public int f15741f;

    /* renamed from: e6.i$a */
    public static final class C4573a implements C4578l {

        /* renamed from: a */
        public final C4574b f15742a;

        /* renamed from: b */
        public int f15743b;

        /* renamed from: c */
        public Class<?> f15744c;

        public C4573a(C4574b bVar) {
            this.f15742a = bVar;
        }

        /* renamed from: a */
        public final void mo20097a() {
            this.f15742a.mo20082f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4573a)) {
                return false;
            }
            C4573a aVar = (C4573a) obj;
            if (this.f15743b == aVar.f15743b && this.f15744c == aVar.f15744c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2 = this.f15743b * 31;
            Class<?> cls = this.f15744c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Key{size=");
            k.append(this.f15743b);
            k.append("array=");
            k.append(this.f15744c);
            k.append('}');
            return k.toString();
        }
    }

    /* renamed from: e6.i$b */
    public static final class C4574b extends C4565c {
        public C4574b() {
            super(0);
        }

        /* renamed from: a */
        public final C4578l mo20077a() {
            return new C4573a(this);
        }
    }

    public C4572i(int i) {
        this.f15740e = i;
    }

    /* renamed from: a */
    public final synchronized void mo20072a(int i) {
        if (i >= 40) {
            try {
                mo20073b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            mo20093f(this.f15740e / 2);
        }
    }

    /* renamed from: b */
    public final synchronized void mo20073b() {
        mo20093f(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T mo20074c(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.mo20096i(r7)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0053 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f15741f     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f15740e     // Catch:{ all -> 0x0053 }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x0053 }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0040
            e6.i$b r6 = r5.f15737b     // Catch:{ all -> 0x0053 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0053 }
            e6.l r6 = r6.mo20079c()     // Catch:{ all -> 0x0053 }
            e6.i$a r6 = (p072e6.C4572i.C4573a) r6     // Catch:{ all -> 0x0053 }
            r6.f15743b = r0     // Catch:{ all -> 0x0053 }
            r6.f15744c = r7     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x0040:
            e6.i$b r0 = r5.f15737b     // Catch:{ all -> 0x0053 }
            e6.l r0 = r0.mo20079c()     // Catch:{ all -> 0x0053 }
            e6.i$a r0 = (p072e6.C4572i.C4573a) r0     // Catch:{ all -> 0x0053 }
            r0.f15743b = r6     // Catch:{ all -> 0x0053 }
            r0.f15744c = r7     // Catch:{ all -> 0x0053 }
            r6 = r0
        L_0x004d:
            java.lang.Object r6 = r5.mo20095h(r6, r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return r6
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e6.C4572i.mo20074c(int, java.lang.Class):java.lang.Object");
    }

    /* renamed from: d */
    public final synchronized Object mo20075d() {
        Object h;
        Class cls = byte[].class;
        synchronized (this) {
            C4573a aVar = (C4573a) this.f15737b.mo20079c();
            aVar.f15743b = 8;
            aVar.f15744c = cls;
            h = mo20095h(aVar, cls);
        }
        return h;
    }

    /* renamed from: e */
    public final void mo20092e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> i2 = mo20096i(cls);
        Integer num = i2.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            i2.remove(Integer.valueOf(i));
        } else {
            i2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    public final void mo20093f(int i) {
        while (this.f15741f > i) {
            Object c = this.f15736a.mo20090c();
            C17885a.m44458r(c);
            C4563a<?> g = mo20094g(c.getClass());
            this.f15741f -= g.mo20068a() * g.mo20069b(c);
            mo20092e(g.mo20069b(c), c.getClass());
            if (Log.isLoggable(g.getTag(), 2)) {
                g.getTag();
                g.mo20069b(c);
            }
        }
    }

    /* renamed from: g */
    public final <T> C4563a<T> mo20094g(Class<T> cls) {
        C4563a<T> aVar = (C4563a) this.f15739d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C4571h();
            } else if (cls.equals(byte[].class)) {
                aVar = new C4568f();
            } else {
                StringBuilder k = C13555b.m33972k("No array pool found for: ");
                k.append(cls.getSimpleName());
                throw new IllegalArgumentException(k.toString());
            }
            this.f15739d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: h */
    public final <T> T mo20095h(C4573a aVar, Class<T> cls) {
        C4563a<T> g = mo20094g(cls);
        T a = this.f15736a.mo20088a(aVar);
        if (a != null) {
            this.f15741f -= g.mo20068a() * g.mo20069b(a);
            mo20092e(g.mo20069b(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(g.getTag(), 2)) {
            g.getTag();
        }
        return g.newArray(aVar.f15743b);
    }

    /* renamed from: i */
    public final NavigableMap<Integer, Integer> mo20096i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f15738c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f15738c.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void put(T t) {
        boolean z;
        Class<?> cls = t.getClass();
        C4563a<?> g = mo20094g(cls);
        int b = g.mo20069b(t);
        int a = g.mo20068a() * b;
        int i = 1;
        if (a <= this.f15740e / 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C4573a aVar = (C4573a) this.f15737b.mo20079c();
            aVar.f15743b = b;
            aVar.f15744c = cls;
            this.f15736a.mo20089b(aVar, t);
            NavigableMap<Integer, Integer> i2 = mo20096i(cls);
            Integer num = i2.get(Integer.valueOf(aVar.f15743b));
            Integer valueOf = Integer.valueOf(aVar.f15743b);
            if (num != null) {
                i = 1 + num.intValue();
            }
            i2.put(valueOf, Integer.valueOf(i));
            this.f15741f += a;
            mo20093f(this.f15740e);
        }
    }
}
