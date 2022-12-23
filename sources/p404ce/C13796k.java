package p404ce;

import androidx.camera.camera2.internal.C0509c;
import com.facebook.appevents.C2342l;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p011aa.C0141e;
import p304x.C7078n;
import p316y.C7229u;
import p765re.C19255a;
import p885we.C20291a;
import p956ze.C20837a;
import p956ze.C20839b;

/* renamed from: ce.k */
public final class C13796k extends C0141e implements C19255a {

    /* renamed from: h */
    public static final C13794i f33955h = new C13794i(0);

    /* renamed from: b */
    public final HashMap f33956b = new HashMap();

    /* renamed from: c */
    public final HashMap f33957c = new HashMap();

    /* renamed from: d */
    public final HashMap f33958d = new HashMap();

    /* renamed from: e */
    public final C13801n f33959e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f33960f = new AtomicReference<>();

    /* renamed from: g */
    public final C13792g f33961g;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13796k(java.util.concurrent.Executor r6, java.util.ArrayList r7, java.util.ArrayList r8, p404ce.C13792g r9) {
        /*
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f33956b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f33957c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f33958d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r5.f33960f = r0
            ce.n r0 = new ce.n
            r0.<init>(r6)
            r5.f33959e = r0
            r5.f33961g = r9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Class<ce.n> r9 = p404ce.C13801n.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<we.d> r2 = p885we.C20294d.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.Class<we.c> r4 = p885we.C20293c.class
            r1[r2] = r4
            ce.b r9 = p404ce.C13784b.m34445b(r0, r9, r1)
            r6.add(r9)
            java.lang.Class<re.a> r9 = p765re.C19255a.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            ce.b r9 = p404ce.C13784b.m34445b(r5, r9, r0)
            r6.add(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x0052:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0064
            java.lang.Object r9 = r8.next()
            ce.b r9 = (p404ce.C13784b) r9
            if (r9 == 0) goto L_0x0052
            r6.add(r9)
            goto L_0x0052
        L_0x0064:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x006d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x007b
            java.lang.Object r9 = r7.next()
            r8.add(r9)
            goto L_0x006d
        L_0x007b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            monitor-enter(r5)
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0085:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x00aa
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0121 }
            ze.b r9 = (p956ze.C20839b) r9     // Catch:{ all -> 0x0121 }
            java.lang.Object r9 = r9.get()     // Catch:{ InvalidRegistrarException -> 0x00a6 }
            com.google.firebase.components.ComponentRegistrar r9 = (com.google.firebase.components.ComponentRegistrar) r9     // Catch:{ InvalidRegistrarException -> 0x00a6 }
            if (r9 == 0) goto L_0x0085
            ce.g r0 = r5.f33961g     // Catch:{ InvalidRegistrarException -> 0x00a6 }
            java.util.List r9 = r0.mo243a(r9)     // Catch:{ InvalidRegistrarException -> 0x00a6 }
            r6.addAll(r9)     // Catch:{ InvalidRegistrarException -> 0x00a6 }
            r8.remove()     // Catch:{ InvalidRegistrarException -> 0x00a6 }
            goto L_0x0085
        L_0x00a6:
            r8.remove()     // Catch:{ all -> 0x0121 }
            goto L_0x0085
        L_0x00aa:
            java.util.HashMap r8 = r5.f33956b     // Catch:{ all -> 0x0121 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0121 }
            if (r8 == 0) goto L_0x00b6
            p404ce.C13797l.m34465a(r6)     // Catch:{ all -> 0x0121 }
            goto L_0x00c7
        L_0x00b6:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0121 }
            java.util.HashMap r9 = r5.f33956b     // Catch:{ all -> 0x0121 }
            java.util.Set r9 = r9.keySet()     // Catch:{ all -> 0x0121 }
            r8.<init>(r9)     // Catch:{ all -> 0x0121 }
            r8.addAll(r6)     // Catch:{ all -> 0x0121 }
            p404ce.C13797l.m34465a(r8)     // Catch:{ all -> 0x0121 }
        L_0x00c7:
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x0121 }
        L_0x00cb:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x00e7
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0121 }
            ce.b r9 = (p404ce.C13784b) r9     // Catch:{ all -> 0x0121 }
            ce.o r0 = new ce.o     // Catch:{ all -> 0x0121 }
            ce.h r1 = new ce.h     // Catch:{ all -> 0x0121 }
            r1.<init>(r5, r9)     // Catch:{ all -> 0x0121 }
            r0.<init>(r1)     // Catch:{ all -> 0x0121 }
            java.util.HashMap r1 = r5.f33956b     // Catch:{ all -> 0x0121 }
            r1.put(r9, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00cb
        L_0x00e7:
            java.util.ArrayList r6 = r5.mo40725s(r6)     // Catch:{ all -> 0x0121 }
            r7.addAll(r6)     // Catch:{ all -> 0x0121 }
            java.util.ArrayList r6 = r5.mo40726t()     // Catch:{ all -> 0x0121 }
            r7.addAll(r6)     // Catch:{ all -> 0x0121 }
            r5.mo40724r()     // Catch:{ all -> 0x0121 }
            monitor-exit(r5)     // Catch:{ all -> 0x0121 }
            java.util.Iterator r6 = r7.iterator()
        L_0x00fd:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x010d
            java.lang.Object r7 = r6.next()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r7.run()
            goto L_0x00fd
        L_0x010d:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r6 = r5.f33960f
            java.lang.Object r6 = r6.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0120
            java.util.HashMap r7 = r5.f33956b
            boolean r6 = r6.booleanValue()
            r5.mo40722p(r7, r6)
        L_0x0120:
            return
        L_0x0121:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0121 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p404ce.C13796k.<init>(java.util.concurrent.Executor, java.util.ArrayList, java.util.ArrayList, ce.g):void");
    }

    /* renamed from: e */
    public final synchronized <T> C20839b<Set<T>> mo40718e(Class<T> cls) {
        C13803p pVar = (C13803p) this.f33958d.get(cls);
        if (pVar != null) {
            return pVar;
        }
        return f33955h;
    }

    /* renamed from: h */
    public final synchronized <T> C20839b<T> mo40719h(Class<T> cls) {
        return (C20839b) this.f33957c.get(cls);
    }

    /* renamed from: j */
    public final <T> C20837a<T> mo40720j(Class<T> cls) {
        C20839b<T> h = mo40719h(cls);
        if (h == null) {
            return new C13805r(C13805r.f33979c, C13805r.f33980d);
        }
        if (h instanceof C13805r) {
            return (C13805r) h;
        }
        return new C13805r((C2342l) null, h);
    }

    /* renamed from: p */
    public final void mo40722p(Map<C13784b<?>, C20839b<?>> map, boolean z) {
        ArrayDeque<C20291a> arrayDeque;
        Set<Map.Entry> set;
        boolean z2;
        for (Map.Entry next : map.entrySet()) {
            C20839b bVar = (C20839b) next.getValue();
            int i = ((C13784b) next.getKey()).f33936d;
            boolean z3 = false;
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (i == 2) {
                    z3 = true;
                }
                if (z3) {
                    if (!z) {
                    }
                }
            }
            bVar.get();
        }
        C13801n nVar = this.f33959e;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.f33971b;
                if (arrayDeque != null) {
                    nVar.f33971b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (arrayDeque != null) {
            for (C20291a aVar : arrayDeque) {
                aVar.getClass();
                synchronized (nVar) {
                    ArrayDeque arrayDeque2 = nVar.f33971b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar);
                    } else {
                        synchronized (nVar) {
                            Map map2 = (Map) nVar.f33970a.get((Object) null);
                            if (map2 == null) {
                                set = Collections.emptySet();
                            } else {
                                set = map2.entrySet();
                            }
                        }
                        for (Map.Entry entry : set) {
                            ((Executor) entry.getValue()).execute(new C7229u(12, entry, aVar));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo40723q(boolean z) {
        boolean z2;
        HashMap hashMap;
        AtomicReference<Boolean> atomicReference = this.f33960f;
        Boolean valueOf = Boolean.valueOf(z);
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, valueOf)) {
                if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (z2) {
            synchronized (this) {
                hashMap = new HashMap(this.f33956b);
            }
            mo40722p(hashMap, z);
        }
    }

    /* renamed from: r */
    public final void mo40724r() {
        boolean z;
        boolean z2;
        for (C13784b bVar : this.f33956b.keySet()) {
            Iterator<C13800m> it = bVar.f33935c.iterator();
            while (true) {
                if (it.hasNext()) {
                    C13800m next = it.next();
                    boolean z3 = true;
                    if (next.f33968b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !this.f33958d.containsKey(next.f33967a)) {
                        this.f33958d.put(next.f33967a, new C13803p(Collections.emptySet()));
                    } else if (this.f33957c.containsKey(next.f33967a)) {
                        continue;
                    } else {
                        int i = next.f33968b;
                        if (i == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (i != 2) {
                                z3 = false;
                            }
                            if (!z3) {
                                this.f33957c.put(next.f33967a, new C13805r(C13805r.f33979c, C13805r.f33980d));
                            }
                        } else {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{bVar, next.f33967a}));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public final ArrayList mo40725s(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13784b bVar = (C13784b) it.next();
            if (bVar.f33937e == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C20839b bVar2 = (C20839b) this.f33956b.get(bVar);
                for (Class next : bVar.f33934b) {
                    if (!this.f33957c.containsKey(next)) {
                        this.f33957c.put(next, bVar2);
                    } else {
                        arrayList2.add(new C0509c(9, (C13805r) ((C20839b) this.f33957c.get(next)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: t */
    public final ArrayList mo40726t() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f33956b.entrySet()) {
            C13784b bVar = (C13784b) entry.getKey();
            if (bVar.f33937e == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C20839b bVar2 = (C20839b) entry.getValue();
                for (Class next : bVar.f33934b) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f33958d.containsKey(entry2.getKey())) {
                this.f33958d.put((Class) entry2.getKey(), new C13803p((Set) ((Collection) entry2.getValue())));
            } else {
                C13803p pVar = (C13803p) this.f33958d.get(entry2.getKey());
                for (C20839b nVar : (Set) entry2.getValue()) {
                    arrayList.add(new C7078n(8, pVar, nVar));
                }
            }
        }
        return arrayList;
    }
}
