package p030bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: bo.app.h0 */
public class C1592h0 implements C1600i0 {

    /* renamed from: i */
    public static final String f5733i = AppboyLogger.getBrazeLogTag(C1592h0.class);

    /* renamed from: a */
    public final ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> f5734a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> f5735b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentMap<Class<?>, Object> f5736c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Executor f5737d;

    /* renamed from: e */
    public final C1550c4 f5738e;

    /* renamed from: f */
    public final Object f5739f = new Object();

    /* renamed from: g */
    public final Object f5740g = new Object();

    /* renamed from: h */
    public final Object f5741h = new Object();

    public C1592h0(Executor executor, C1550c4 c4Var) {
        this.f5737d = executor;
        this.f5738e = c4Var;
    }

    /* renamed from: a */
    public <T> void mo6132a(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        synchronized (this.f5739f) {
            mo6135a(iEventSubscriber, cls, this.f5734a);
        }
    }

    /* renamed from: b */
    public <T> boolean mo6137b(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        boolean a;
        synchronized (this.f5740g) {
            a = mo6135a(iEventSubscriber, cls, this.f5735b);
        }
        return a;
    }

    /* renamed from: c */
    public <T> boolean mo6138c(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        boolean a;
        synchronized (this.f5739f) {
            a = mo6136a(this.f5734a.get(cls), iEventSubscriber);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r0.isEmpty() == false) goto L_0x00a9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void mo6134a(T r9, java.lang.Class<T> r10) {
        /*
            r8 = this;
            bo.app.c4 r0 = r8.f5738e
            boolean r0 = r0.mo5958a()
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = f5733i
            java.lang.String r1 = "SDK is disabled. Not publishing event class: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r10 = r10.getName()
            r1.append(r10)
            java.lang.String r10 = " and message: "
            r1.append(r10)
            java.lang.String r9 = r9.toString()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.appboy.support.AppboyLogger.m5448d(r0, r9)
            return
        L_0x002b:
            java.lang.String r0 = f5733i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.getName()
            r1.append(r2)
            java.lang.String r2 = " fired: "
            r1.append(r2)
            java.lang.String r2 = r9.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.appboy.support.AppboyLogger.m5451d((java.lang.String) r0, (java.lang.String) r1, (boolean) r2)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.appboy.events.IEventSubscriber<?>>> r0 = r8.f5734a
            java.lang.Object r0 = r0.get(r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            r1 = 1
            if (r0 == 0) goto L_0x007f
            java.util.concurrent.CopyOnWriteArraySet r3 = r8.mo6130a(r10, (java.util.concurrent.CopyOnWriteArraySet<com.appboy.events.IEventSubscriber<?>>) r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0078
            java.lang.Object r4 = r3.next()
            com.appboy.events.IEventSubscriber r4 = (com.appboy.events.IEventSubscriber) r4
            java.util.concurrent.Executor r5 = r8.f5737d
            x.e r6 = new x.e
            r7 = 7
            r6.<init>(r7, r4, r9)
            r5.execute(r6)
            goto L_0x0060
        L_0x0078:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007f
            r2 = 1
        L_0x007f:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.appboy.events.IEventSubscriber<?>>> r0 = r8.f5735b
            java.lang.Object r0 = r0.get(r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            if (r0 == 0) goto L_0x00a8
            java.util.concurrent.CopyOnWriteArraySet r3 = r8.mo6130a(r10, (java.util.concurrent.CopyOnWriteArraySet<com.appboy.events.IEventSubscriber<?>>) r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0091:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r3.next()
            com.appboy.events.IEventSubscriber r4 = (com.appboy.events.IEventSubscriber) r4
            r4.trigger(r9)
            goto L_0x0091
        L_0x00a1:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r1 = r2
        L_0x00a9:
            if (r1 != 0) goto L_0x00ce
            java.lang.String r0 = f5733i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.appboy.support.AppboyLogger.m5453i(r0, r1)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.Object> r0 = r8.f5736c
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.Object> r1 = r8.f5736c     // Catch:{ all -> 0x00cb }
            r1.put(r10, r9)     // Catch:{ all -> 0x00cb }
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00ce
        L_0x00cb:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            throw r9
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1592h0.mo6134a(java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: a */
    public void mo6131a() {
        synchronized (this.f5739f) {
            this.f5734a.clear();
        }
        synchronized (this.f5740g) {
            this.f5735b.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r0 = new java.util.concurrent.CopyOnWriteArraySet();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> boolean mo6135a(com.appboy.events.IEventSubscriber<T> r2, java.lang.Class<T> r3, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.appboy.events.IEventSubscriber<?>>> r4) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0028
            if (r3 != 0) goto L_0x0007
            java.lang.String r2 = "null eventClass"
            goto L_0x000b
        L_0x0007:
            java.lang.String r2 = r3.getName()
        L_0x000b:
            java.lang.String r3 = f5733i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Error: Attempted to add a null subscriber for eventClass "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = ". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r3, (java.lang.String) r2)
            r2 = 0
            return r2
        L_0x0028:
            java.lang.Object r0 = r4.get(r3)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            if (r0 != 0) goto L_0x003d
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            java.lang.Object r4 = r4.putIfAbsent(r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            if (r4 != 0) goto L_0x003e
        L_0x003d:
            r4 = r0
        L_0x003e:
            boolean r2 = r4.add(r2)
            r1.mo6133a(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1592h0.mo6135a(com.appboy.events.IEventSubscriber, java.lang.Class, java.util.concurrent.ConcurrentMap):boolean");
    }

    /* renamed from: a */
    public final <T> void mo6133a(Class<T> cls) {
        synchronized (this.f5741h) {
            if (this.f5736c.containsKey(cls)) {
                String str = f5733i;
                AppboyLogger.m5457v(str, "Publishing cached event for class: " + cls);
                Object remove = this.f5736c.remove(cls);
                if (remove != null) {
                    mo6134a(remove, cls);
                }
            }
        }
    }

    /* renamed from: a */
    public final <T> boolean mo6136a(CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet, IEventSubscriber<T> iEventSubscriber) {
        return (copyOnWriteArraySet == null || iEventSubscriber == null || !copyOnWriteArraySet.remove(iEventSubscriber)) ? false : true;
    }

    /* renamed from: a */
    public final <T> CopyOnWriteArraySet<IEventSubscriber<T>> mo6130a(Class<T> cls, CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet) {
        String str = f5733i;
        StringBuilder k = C13555b.m33972k("Triggering ");
        k.append(cls.getName());
        k.append(" on ");
        k.append(copyOnWriteArraySet.size());
        k.append(" subscribers.");
        AppboyLogger.m5451d(str, k.toString(), false);
        return copyOnWriteArraySet;
    }
}
