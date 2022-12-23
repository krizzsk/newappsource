package androidx.work.impl.utils.futures;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001a0.C0016g;
import p358af.C13437d;
import p695od.C18728c;

public abstract class AbstractFuture<V> implements C18728c<V> {

    /* renamed from: e */
    public static final boolean f5236e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f5237f = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: g */
    public static final C1413a f5238g;

    /* renamed from: h */
    public static final Object f5239h = new Object();

    /* renamed from: b */
    public volatile Object f5240b;

    /* renamed from: c */
    public volatile C1415c f5241c;

    /* renamed from: d */
    public volatile C1419g f5242d;

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f5243b = new Failure(new Throwable() {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f5244a;

        public Failure(Throwable th) {
            boolean z = AbstractFuture.f5236e;
            th.getClass();
            this.f5244a = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$a */
    public static abstract class C1413a {
        /* renamed from: a */
        public abstract boolean mo5748a(AbstractFuture<?> abstractFuture, C1415c cVar, C1415c cVar2);

        /* renamed from: b */
        public abstract boolean mo5749b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo5750c(AbstractFuture<?> abstractFuture, C1419g gVar, C1419g gVar2);

        /* renamed from: d */
        public abstract void mo5751d(C1419g gVar, C1419g gVar2);

        /* renamed from: e */
        public abstract void mo5752e(C1419g gVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    public static final class C1414b {

        /* renamed from: c */
        public static final C1414b f5245c;

        /* renamed from: d */
        public static final C1414b f5246d;

        /* renamed from: a */
        public final boolean f5247a;

        /* renamed from: b */
        public final Throwable f5248b;

        static {
            if (AbstractFuture.f5236e) {
                f5246d = null;
                f5245c = null;
                return;
            }
            f5246d = new C1414b(false, (Throwable) null);
            f5245c = new C1414b(true, (Throwable) null);
        }

        public C1414b(boolean z, Throwable th) {
            this.f5247a = z;
            this.f5248b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    public static final class C1415c {

        /* renamed from: d */
        public static final C1415c f5249d = new C1415c((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f5250a;

        /* renamed from: b */
        public final Executor f5251b;

        /* renamed from: c */
        public C1415c f5252c;

        public C1415c(Runnable runnable, Executor executor) {
            this.f5250a = runnable;
            this.f5251b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    public static final class C1416d extends C1413a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C1419g, Thread> f5253a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C1419g, C1419g> f5254b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C1419g> f5255c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C1415c> f5256d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f5257e;

        public C1416d(AtomicReferenceFieldUpdater<C1419g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1419g, C1419g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C1419g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C1415c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f5253a = atomicReferenceFieldUpdater;
            this.f5254b = atomicReferenceFieldUpdater2;
            this.f5255c = atomicReferenceFieldUpdater3;
            this.f5256d = atomicReferenceFieldUpdater4;
            this.f5257e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final boolean mo5748a(AbstractFuture<?> abstractFuture, C1415c cVar, C1415c cVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C1415c> atomicReferenceFieldUpdater = this.f5256d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != cVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo5749b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f5257e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo5750c(AbstractFuture<?> abstractFuture, C1419g gVar, C1419g gVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C1419g> atomicReferenceFieldUpdater = this.f5255c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, gVar, gVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != gVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public final void mo5751d(C1419g gVar, C1419g gVar2) {
            this.f5254b.lazySet(gVar, gVar2);
        }

        /* renamed from: e */
        public final void mo5752e(C1419g gVar, Thread thread) {
            this.f5253a.lazySet(gVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    public static final class C1417e<V> implements Runnable {

        /* renamed from: b */
        public final AbstractFuture<V> f5258b;

        /* renamed from: c */
        public final C18728c<? extends V> f5259c;

        public C1417e(AbstractFuture<V> abstractFuture, C18728c<? extends V> cVar) {
            this.f5258b = abstractFuture;
            this.f5259c = cVar;
        }

        public final void run() {
            if (this.f5258b.f5240b == this) {
                if (AbstractFuture.f5238g.mo5749b(this.f5258b, this, AbstractFuture.m3783e(this.f5259c))) {
                    AbstractFuture.m3781b(this.f5258b);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    public static final class C1418f extends C1413a {
        /* renamed from: a */
        public final boolean mo5748a(AbstractFuture<?> abstractFuture, C1415c cVar, C1415c cVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f5241c != cVar) {
                    return false;
                }
                abstractFuture.f5241c = cVar2;
                return true;
            }
        }

        /* renamed from: b */
        public final boolean mo5749b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f5240b != obj) {
                    return false;
                }
                abstractFuture.f5240b = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public final boolean mo5750c(AbstractFuture<?> abstractFuture, C1419g gVar, C1419g gVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f5242d != gVar) {
                    return false;
                }
                abstractFuture.f5242d = gVar2;
                return true;
            }
        }

        /* renamed from: d */
        public final void mo5751d(C1419g gVar, C1419g gVar2) {
            gVar.f5262b = gVar2;
        }

        /* renamed from: e */
        public final void mo5752e(C1419g gVar, Thread thread) {
            gVar.f5261a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    public static final class C1419g {

        /* renamed from: c */
        public static final C1419g f5260c = new C1419g(0);

        /* renamed from: a */
        public volatile Thread f5261a;

        /* renamed from: b */
        public volatile C1419g f5262b;

        public C1419g(int i) {
        }

        public C1419g() {
            AbstractFuture.f5238g.mo5752e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.AbstractFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.AbstractFuture$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.AbstractFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.AbstractFuture$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$g> r0 = androidx.work.impl.utils.futures.AbstractFuture.C1419g.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f5236e = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f5237f = r1
            androidx.work.impl.utils.futures.AbstractFuture$d r1 = new androidx.work.impl.utils.futures.AbstractFuture$d     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r2 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$c> r2 = androidx.work.impl.utils.futures.AbstractFuture.C1415c.class
            java.lang.String r6 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$f r1 = new androidx.work.impl.utils.futures.AbstractFuture$f
            r1.<init>()
        L_0x0054:
            f5238g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f5237f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5239h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    /* renamed from: b */
    public static void m3781b(AbstractFuture<?> abstractFuture) {
        AbstractFuture<V> abstractFuture2;
        C1415c cVar;
        C1415c cVar2;
        C1415c cVar3 = null;
        AbstractFuture<?> abstractFuture3 = abstractFuture;
        while (true) {
            C1419g gVar = abstractFuture3.f5242d;
            if (f5238g.mo5750c(abstractFuture3, gVar, C1419g.f5260c)) {
                while (gVar != null) {
                    Thread thread = gVar.f5261a;
                    if (thread != null) {
                        gVar.f5261a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f5262b;
                }
                do {
                    cVar = abstractFuture3.f5241c;
                } while (!f5238g.mo5748a(abstractFuture3, cVar, C1415c.f5249d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f5252c;
                    cVar3.f5252c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f5252c;
                    Runnable runnable = cVar2.f5250a;
                    if (runnable instanceof C1417e) {
                        C1417e eVar = (C1417e) runnable;
                        AbstractFuture<V> abstractFuture4 = eVar.f5258b;
                        if (abstractFuture4.f5240b == eVar) {
                            if (f5238g.mo5749b(abstractFuture4, eVar, m3783e(eVar.f5259c))) {
                                abstractFuture2 = abstractFuture4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m3782c(runnable, cVar2.f5251b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
            abstractFuture2 = abstractFuture3;
            abstractFuture3 = abstractFuture2;
        }
    }

    /* renamed from: c */
    public static void m3782c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5237f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m3783e(p695od.C18728c<?> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.impl.utils.futures.AbstractFuture
            r1 = 0
            if (r0 == 0) goto L_0x0023
            androidx.work.impl.utils.futures.AbstractFuture r5 = (androidx.work.impl.utils.futures.AbstractFuture) r5
            java.lang.Object r5 = r5.f5240b
            boolean r0 = r5 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1414b
            if (r0 == 0) goto L_0x0022
            r0 = r5
            androidx.work.impl.utils.futures.AbstractFuture$b r0 = (androidx.work.impl.utils.futures.AbstractFuture.C1414b) r0
            boolean r2 = r0.f5247a
            if (r2 == 0) goto L_0x0022
            java.lang.Throwable r5 = r0.f5248b
            if (r5 == 0) goto L_0x0020
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = new androidx.work.impl.utils.futures.AbstractFuture$b
            java.lang.Throwable r0 = r0.f5248b
            r5.<init>(r1, r0)
            goto L_0x0022
        L_0x0020:
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = androidx.work.impl.utils.futures.AbstractFuture.C1414b.f5246d
        L_0x0022:
            return r5
        L_0x0023:
            boolean r0 = r5.isCancelled()
            boolean r2 = f5236e
            r3 = 1
            r2 = r2 ^ r3
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0031
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = androidx.work.impl.utils.futures.AbstractFuture.C1414b.f5246d
            return r5
        L_0x0031:
            r2 = 0
        L_0x0032:
            java.lang.Object r3 = r5.get()     // Catch:{ InterruptedException -> 0x008a, all -> 0x004b }
            if (r2 == 0) goto L_0x003f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x003f:
            if (r3 != 0) goto L_0x004a
            java.lang.Object r3 = f5239h     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r5 = move-exception
            goto L_0x0056
        L_0x0046:
            r2 = move-exception
            goto L_0x005c
        L_0x0048:
            r5 = move-exception
            goto L_0x0080
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            if (r2 == 0) goto L_0x0055
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0055:
            throw r3     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0056:
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            r0.<init>(r5)
            return r0
        L_0x005c:
            if (r0 != 0) goto L_0x007a
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L_0x007a:
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = new androidx.work.impl.utils.futures.AbstractFuture$b
            r5.<init>(r1, r2)
            return r5
        L_0x0080:
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
        L_0x008a:
            r2 = 1
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.m3783e(od.c):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo5737a(StringBuilder sb) {
        Object obj;
        String str;
        boolean z = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            str = "this future";
        } else {
            str = String.valueOf(obj);
        }
        sb.append(str);
        sb.append("]");
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C1415c cVar = this.f5241c;
        if (cVar != C1415c.f5249d) {
            C1415c cVar2 = new C1415c(runnable, executor);
            do {
                cVar2.f5252c = cVar;
                if (!f5238g.mo5748a(this, cVar, cVar2)) {
                    cVar = this.f5241c;
                } else {
                    return;
                }
            } while (cVar != C1415c.f5249d);
        }
        m3782c(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [od.c<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5240b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1417e
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f5236e
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = new androidx.work.impl.utils.futures.AbstractFuture$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = androidx.work.impl.utils.futures.AbstractFuture.C1414b.f5245c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = androidx.work.impl.utils.futures.AbstractFuture.C1414b.f5246d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$a r6 = f5238g
            boolean r6 = r6.mo5749b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            m3781b(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1417e
            if (r4 == 0) goto L_0x005d
            androidx.work.impl.utils.futures.AbstractFuture$e r0 = (androidx.work.impl.utils.futures.AbstractFuture.C1417e) r0
            od.c<? extends V> r0 = r0.f5259c
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0050
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f5240b
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1417e
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = 1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.f5240b
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1417e
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final V mo5739d(Object obj) throws ExecutionException {
        if (obj instanceof C1414b) {
            Throwable th = ((C1414b) obj).f5248b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f5244a);
        } else if (obj == f5239h) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: f */
    public final String mo5740f() {
        String str;
        Object obj = this.f5240b;
        if (obj instanceof C1417e) {
            StringBuilder k = C13555b.m33972k("setFuture=[");
            C18728c<? extends V> cVar = ((C1417e) obj).f5259c;
            if (cVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(cVar);
            }
            return C0016g.m31o(k, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder k2 = C13555b.m33972k("remaining delay=[");
            k2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            k2.append(" ms]");
            return k2.toString();
        }
    }

    /* renamed from: g */
    public final void mo5741g(C1419g gVar) {
        gVar.f5261a = null;
        while (true) {
            C1419g gVar2 = this.f5242d;
            if (gVar2 != C1419g.f5260c) {
                C1419g gVar3 = null;
                while (gVar2 != null) {
                    C1419g gVar4 = gVar2.f5262b;
                    if (gVar2.f5261a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f5262b = gVar4;
                        if (gVar3.f5261a == null) {
                        }
                    } else if (!f5238g.mo5750c(this, gVar2, gVar4)) {
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f5240b;
            if ((obj != null) && (!(obj instanceof C1417e))) {
                return mo5739d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1419g gVar = this.f5242d;
                if (gVar != C1419g.f5260c) {
                    C1419g gVar2 = new C1419g();
                    do {
                        C1413a aVar = f5238g;
                        aVar.mo5751d(gVar2, gVar);
                        if (aVar.mo5750c(this, gVar, gVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5240b;
                                    if ((obj2 != null) && (!(obj2 instanceof C1417e))) {
                                        return mo5739d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo5741g(gVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo5741g(gVar2);
                        } else {
                            gVar = this.f5242d;
                        }
                    } while (gVar != C1419g.f5260c);
                }
                return mo5739d(this.f5240b);
            }
            while (nanos > 0) {
                Object obj3 = this.f5240b;
                if ((obj3 != null) && (!(obj3 instanceof C1417e))) {
                    return mo5739d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder g = C16759e.m42351g("Waited ", j, " ");
            g.append(timeUnit.toString().toLowerCase(locale));
            String sb = g.toString();
            if (nanos + 1000 < 0) {
                String k = C25541a.m63881k(sb, " (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str = k + convert + " " + lowerCase;
                    if (z) {
                        str = C25541a.m63881k(str, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                    k = C25541a.m63881k(str, " ");
                }
                if (z) {
                    k = C16530d.m42012e(k, nanos2, " nanoseconds ");
                }
                sb = C25541a.m63881k(k, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(C25541a.m63881k(sb, " but future completed as timeout expired"));
            }
            throw new TimeoutException(C13437d.m33706k(sb, " for ", abstractFuture));
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f5240b instanceof C1414b;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f5240b;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C1417e)) & z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5240b instanceof C1414b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo5737a(sb);
        } else {
            try {
                str = mo5740f();
            } catch (RuntimeException e) {
                StringBuilder k = C13555b.m33972k("Exception thrown from implementation: ");
                k.append(e.getClass());
                str = k.toString();
            }
            if (str != null && !str.isEmpty()) {
                C16530d.m42019l(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                mo5737a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5240b;
            if ((obj2 != null) && (!(obj2 instanceof C1417e))) {
                return mo5739d(obj2);
            }
            C1419g gVar = this.f5242d;
            if (gVar != C1419g.f5260c) {
                C1419g gVar2 = new C1419g();
                do {
                    C1413a aVar = f5238g;
                    aVar.mo5751d(gVar2, gVar);
                    if (aVar.mo5750c(this, gVar, gVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5240b;
                            } else {
                                mo5741g(gVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1417e))));
                        return mo5739d(obj);
                    }
                    gVar = this.f5242d;
                } while (gVar != C1419g.f5260c);
            }
            return mo5739d(this.f5240b);
        }
        throw new InterruptedException();
    }
}
