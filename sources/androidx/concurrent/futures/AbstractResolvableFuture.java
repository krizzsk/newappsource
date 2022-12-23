package androidx.concurrent.futures;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.StringUtils;
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
import p358af.C13437d;
import p695od.C18728c;

public abstract class AbstractResolvableFuture<V> implements C18728c<V> {

    /* renamed from: e */
    public static final boolean f2294e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f2295f = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: g */
    public static final C0666a f2296g;

    /* renamed from: h */
    public static final Object f2297h = new Object();

    /* renamed from: b */
    public volatile Object f2298b;

    /* renamed from: c */
    public volatile C0668c f2299c;

    /* renamed from: d */
    public volatile C0672g f2300d;

    public static final class Failure {

        /* renamed from: a */
        public final Throwable f2301a;

        static {
            new Failure(new Throwable() {
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th) {
            boolean z = AbstractResolvableFuture.f2294e;
            th.getClass();
            this.f2301a = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$a */
    public static abstract class C0666a {
        /* renamed from: a */
        public abstract boolean mo2689a(AbstractResolvableFuture<?> abstractResolvableFuture, C0668c cVar, C0668c cVar2);

        /* renamed from: b */
        public abstract boolean mo2690b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo2691c(AbstractResolvableFuture<?> abstractResolvableFuture, C0672g gVar, C0672g gVar2);

        /* renamed from: d */
        public abstract void mo2692d(C0672g gVar, C0672g gVar2);

        /* renamed from: e */
        public abstract void mo2693e(C0672g gVar, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    public static final class C0667b {

        /* renamed from: b */
        public static final C0667b f2302b;

        /* renamed from: c */
        public static final C0667b f2303c;

        /* renamed from: a */
        public final Throwable f2304a;

        static {
            if (AbstractResolvableFuture.f2294e) {
                f2303c = null;
                f2302b = null;
                return;
            }
            f2303c = new C0667b(false, (Throwable) null);
            f2302b = new C0667b(true, (Throwable) null);
        }

        public C0667b(boolean z, Throwable th) {
            this.f2304a = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    public static final class C0668c {

        /* renamed from: d */
        public static final C0668c f2305d = new C0668c((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f2306a;

        /* renamed from: b */
        public final Executor f2307b;

        /* renamed from: c */
        public C0668c f2308c;

        public C0668c(Runnable runnable, Executor executor) {
            this.f2306a = runnable;
            this.f2307b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    public static final class C0669d extends C0666a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C0672g, Thread> f2309a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C0672g, C0672g> f2310b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0672g> f2311c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0668c> f2312d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f2313e;

        public C0669d(AtomicReferenceFieldUpdater<C0672g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0672g, C0672g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0672g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0668c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            this.f2309a = atomicReferenceFieldUpdater;
            this.f2310b = atomicReferenceFieldUpdater2;
            this.f2311c = atomicReferenceFieldUpdater3;
            this.f2312d = atomicReferenceFieldUpdater4;
            this.f2313e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final boolean mo2689a(AbstractResolvableFuture<?> abstractResolvableFuture, C0668c cVar, C0668c cVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0668c> atomicReferenceFieldUpdater = this.f2312d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != cVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo2690b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f2313e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo2691c(AbstractResolvableFuture<?> abstractResolvableFuture, C0672g gVar, C0672g gVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0672g> atomicReferenceFieldUpdater = this.f2311c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, gVar, gVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != gVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public final void mo2692d(C0672g gVar, C0672g gVar2) {
            this.f2310b.lazySet(gVar, gVar2);
        }

        /* renamed from: e */
        public final void mo2693e(C0672g gVar, Thread thread) {
            this.f2309a.lazySet(gVar, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    public static final class C0670e<V> implements Runnable {
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    public static final class C0671f extends C0666a {
        /* renamed from: a */
        public final boolean mo2689a(AbstractResolvableFuture<?> abstractResolvableFuture, C0668c cVar, C0668c cVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f2299c != cVar) {
                    return false;
                }
                abstractResolvableFuture.f2299c = cVar2;
                return true;
            }
        }

        /* renamed from: b */
        public final boolean mo2690b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f2298b != obj) {
                    return false;
                }
                abstractResolvableFuture.f2298b = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public final boolean mo2691c(AbstractResolvableFuture<?> abstractResolvableFuture, C0672g gVar, C0672g gVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f2300d != gVar) {
                    return false;
                }
                abstractResolvableFuture.f2300d = gVar2;
                return true;
            }
        }

        /* renamed from: d */
        public final void mo2692d(C0672g gVar, C0672g gVar2) {
            gVar.f2316b = gVar2;
        }

        /* renamed from: e */
        public final void mo2693e(C0672g gVar, Thread thread) {
            gVar.f2315a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    public static final class C0672g {

        /* renamed from: c */
        public static final C0672g f2314c = new C0672g(0);

        /* renamed from: a */
        public volatile Thread f2315a;

        /* renamed from: b */
        public volatile C0672g f2316b;

        public C0672g(int i) {
        }

        public C0672g() {
            AbstractResolvableFuture.f2296g.mo2693e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$g> r0 = androidx.concurrent.futures.AbstractResolvableFuture.C0672g.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f2294e = r1
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r1 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f2295f = r1
            androidx.concurrent.futures.AbstractResolvableFuture$d r1 = new androidx.concurrent.futures.AbstractResolvableFuture$d     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r2 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r5 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$c> r2 = androidx.concurrent.futures.AbstractResolvableFuture.C0668c.class
            java.lang.String r6 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$f r1 = new androidx.concurrent.futures.AbstractResolvableFuture$f
            r1.<init>()
        L_0x0054:
            f2296g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f2295f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f2297h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.<clinit>():void");
    }

    /* renamed from: b */
    public static void m1863b(AbstractResolvableFuture<?> abstractResolvableFuture) {
        C0672g gVar;
        C0668c cVar;
        do {
            gVar = abstractResolvableFuture.f2300d;
        } while (!f2296g.mo2691c(abstractResolvableFuture, gVar, C0672g.f2314c));
        while (gVar != null) {
            Thread thread = gVar.f2315a;
            if (thread != null) {
                gVar.f2315a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f2316b;
        }
        do {
            cVar = abstractResolvableFuture.f2299c;
        } while (!f2296g.mo2689a(abstractResolvableFuture, cVar, C0668c.f2305d));
        C0668c cVar2 = null;
        while (cVar != null) {
            C0668c cVar3 = cVar.f2308c;
            cVar.f2308c = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            C0668c cVar4 = cVar2.f2308c;
            Runnable runnable = cVar2.f2306a;
            if (!(runnable instanceof C0670e)) {
                m1864c(runnable, cVar2.f2307b);
                cVar2 = cVar4;
            } else {
                ((C0670e) runnable).getClass();
                throw null;
            }
        }
    }

    /* renamed from: c */
    public static void m1864c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f2295f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: a */
    public final void mo2677a(StringBuilder sb) {
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
        C0668c cVar = this.f2299c;
        if (cVar != C0668c.f2305d) {
            C0668c cVar2 = new C0668c(runnable, executor);
            do {
                cVar2.f2308c = cVar;
                if (!f2296g.mo2689a(this, cVar, cVar2)) {
                    cVar = this.f2299c;
                } else {
                    return;
                }
            } while (cVar != C0668c.f2305d);
        }
        m1864c(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        C0667b bVar;
        Object obj = this.f2298b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof C0670e)) {
            return false;
        }
        if (f2294e) {
            bVar = new C0667b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C0667b.f2302b;
        } else {
            bVar = C0667b.f2303c;
        }
        while (!f2296g.mo2690b(this, obj, bVar)) {
            obj = this.f2298b;
            if (!(obj instanceof C0670e)) {
            }
        }
        m1863b(this);
        if (!(obj instanceof C0670e)) {
            return true;
        }
        ((C0670e) obj).getClass();
        throw null;
        return false;
    }

    /* renamed from: d */
    public final V mo2680d(Object obj) throws ExecutionException {
        if (obj instanceof C0667b) {
            Throwable th = ((C0667b) obj).f2304a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f2301a);
        } else if (obj == f2297h) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: e */
    public String mo2681e() {
        Object obj = this.f2298b;
        if (obj instanceof C0670e) {
            StringBuilder k = C13555b.m33972k("setFuture=[");
            ((C0670e) obj).getClass();
            k.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            k.append("]");
            return k.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder k2 = C13555b.m33972k("remaining delay=[");
            k2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            k2.append(" ms]");
            return k2.toString();
        }
    }

    /* renamed from: f */
    public final void mo2682f(C0672g gVar) {
        gVar.f2315a = null;
        while (true) {
            C0672g gVar2 = this.f2300d;
            if (gVar2 != C0672g.f2314c) {
                C0672g gVar3 = null;
                while (gVar2 != null) {
                    C0672g gVar4 = gVar2.f2316b;
                    if (gVar2.f2315a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f2316b = gVar4;
                        if (gVar3.f2315a == null) {
                        }
                    } else if (!f2296g.mo2691c(this, gVar2, gVar4)) {
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
            Object obj = this.f2298b;
            if ((obj != null) && (!(obj instanceof C0670e))) {
                return mo2680d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0672g gVar = this.f2300d;
                if (gVar != C0672g.f2314c) {
                    C0672g gVar2 = new C0672g();
                    do {
                        C0666a aVar = f2296g;
                        aVar.mo2692d(gVar2, gVar);
                        if (aVar.mo2691c(this, gVar, gVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2298b;
                                    if ((obj2 != null) && (!(obj2 instanceof C0670e))) {
                                        return mo2680d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo2682f(gVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo2682f(gVar2);
                        } else {
                            gVar = this.f2300d;
                        }
                    } while (gVar != C0672g.f2314c);
                }
                return mo2680d(this.f2298b);
            }
            while (nanos > 0) {
                Object obj3 = this.f2298b;
                if ((obj3 != null) && (!(obj3 instanceof C0670e))) {
                    return mo2680d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractResolvableFuture = toString();
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
            throw new TimeoutException(C13437d.m33706k(sb, " for ", abstractResolvableFuture));
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f2298b instanceof C0667b;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f2298b;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C0670e)) & z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2298b instanceof C0667b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo2677a(sb);
        } else {
            try {
                str = mo2681e();
            } catch (RuntimeException e) {
                StringBuilder k = C13555b.m33972k("Exception thrown from implementation: ");
                k.append(e.getClass());
                str = k.toString();
            }
            if (str != null && !str.isEmpty()) {
                C16530d.m42019l(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                mo2677a(sb);
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
            Object obj2 = this.f2298b;
            if ((obj2 != null) && (!(obj2 instanceof C0670e))) {
                return mo2680d(obj2);
            }
            C0672g gVar = this.f2300d;
            if (gVar != C0672g.f2314c) {
                C0672g gVar2 = new C0672g();
                do {
                    C0666a aVar = f2296g;
                    aVar.mo2692d(gVar2, gVar);
                    if (aVar.mo2691c(this, gVar, gVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2298b;
                            } else {
                                mo2682f(gVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C0670e))));
                        return mo2680d(obj);
                    }
                    gVar = this.f2300d;
                } while (gVar != C0672g.f2314c);
            }
            return mo2680d(this.f2298b);
        }
        throw new InterruptedException();
    }
}
