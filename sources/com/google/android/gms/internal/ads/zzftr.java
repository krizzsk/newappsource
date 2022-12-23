package com.google.android.gms.internal.ads;

import com.appboy.support.StringUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class zzftr<V> extends zzfwb implements zzfvj<V> {
    private static final Logger zzaT = Logger.getLogger(zzftr.class.getName());
    /* access modifiers changed from: private */
    public static final zza zzaU;
    private static final Object zzaX = new Object();
    public static final boolean zzd;
    /* access modifiers changed from: private */
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    public volatile Object value;
    /* access modifiers changed from: private */
    public volatile zzk waiters;

    abstract class zza {
        public /* synthetic */ zza(C255881 r1) {
        }

        public abstract zzd zza(zzftr zzftr, zzd zzd);

        public abstract zzk zzb(zzftr zzftr, zzk zzk);

        public abstract void zzc(zzk zzk, zzk zzk2);

        public abstract void zzd(zzk zzk, Thread thread);

        public abstract boolean zze(zzftr zzftr, zzd zzd, zzd zzd2);

        public abstract boolean zzf(zzftr zzftr, Object obj, Object obj2);

        public abstract boolean zzg(zzftr zzftr, zzk zzk, zzk zzk2);
    }

    final class zzb {
        public static final zzb zza;
        public static final zzb zzb;
        public final boolean zzc;
        public final Throwable zzd;

        static {
            if (zzftr.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, (Throwable) null);
            zza = new zzb(true, (Throwable) null);
        }

        public zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        public static final zzd zza = new zzd();
        public zzd next;
        public final Runnable zzb;
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zze extends zza {
        public final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        public final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        public final AtomicReferenceFieldUpdater<zzftr, zzk> zzc;
        public final AtomicReferenceFieldUpdater<zzftr, zzd> zzd;
        public final AtomicReferenceFieldUpdater<zzftr, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super((C255881) null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        public final zzd zza(zzftr zzftr, zzd zzd2) {
            return this.zzd.getAndSet(zzftr, zzd2);
        }

        public final zzk zzb(zzftr zzftr, zzk zzk) {
            return this.zzc.getAndSet(zzftr, zzk);
        }

        public final void zzc(zzk zzk, zzk zzk2) {
            this.zzb.lazySet(zzk, zzk2);
        }

        public final void zzd(zzk zzk, Thread thread) {
            this.zza.lazySet(zzk, thread);
        }

        public final boolean zze(zzftr zzftr, zzd zzd2, zzd zzd3) {
            return zzfts.zza(this.zzd, zzftr, zzd2, zzd3);
        }

        public final boolean zzf(zzftr zzftr, Object obj, Object obj2) {
            return zzfts.zza(this.zze, zzftr, obj, obj2);
        }

        public final boolean zzg(zzftr zzftr, zzk zzk, zzk zzk2) {
            return zzfts.zza(this.zzc, zzftr, zzk, zzk2);
        }
    }

    final class zzf<V> implements Runnable {
        public final zzftr<V> zza;
        public final zzfvj<? extends V> zzb;

        public zzf(zzftr zzftr, zzfvj zzfvj) {
            this.zza = zzftr;
            this.zzb = zzfvj;
        }

        public final void run() {
            if (this.zza.value == this) {
                if (zzftr.zzaU.zzf(this.zza, this, zzftr.zzf(this.zzb))) {
                    zzftr.zzy(this.zza);
                }
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            super((C255881) null);
        }

        public /* synthetic */ zzg(C255881 r1) {
            super((C255881) null);
        }

        public final zzd zza(zzftr zzftr, zzd zzd) {
            zzd zzi;
            synchronized (zzftr) {
                zzi = zzftr.listeners;
                if (zzi != zzd) {
                    zzd unused = zzftr.listeners = zzd;
                }
            }
            return zzi;
        }

        public final zzk zzb(zzftr zzftr, zzk zzk) {
            zzk zzk2;
            synchronized (zzftr) {
                zzk2 = zzftr.waiters;
                if (zzk2 != zzk) {
                    zzk unused = zzftr.waiters = zzk;
                }
            }
            return zzk2;
        }

        public final void zzc(zzk zzk, zzk zzk2) {
            zzk.next = zzk2;
        }

        public final void zzd(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        public final boolean zze(zzftr zzftr, zzd zzd, zzd zzd2) {
            synchronized (zzftr) {
                if (zzftr.listeners != zzd) {
                    return false;
                }
                zzd unused = zzftr.listeners = zzd2;
                return true;
            }
        }

        public final boolean zzf(zzftr zzftr, Object obj, Object obj2) {
            synchronized (zzftr) {
                if (zzftr.value != obj) {
                    return false;
                }
                Object unused = zzftr.value = obj2;
                return true;
            }
        }

        public final boolean zzg(zzftr zzftr, zzk zzk, zzk zzk2) {
            synchronized (zzftr) {
                if (zzftr.waiters != zzk) {
                    return false;
                }
                zzk unused = zzftr.waiters = zzk2;
                return true;
            }
        }
    }

    interface zzh<V> extends zzfvj<V> {
    }

    abstract class zzi<V> extends zzftr<V> implements zzh<V> {
    }

    final class zzj extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzftr.zzj.C255901());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.android.gms.internal.ads.zzftr$zzk> r0 = com.google.android.gms.internal.ads.zzftr.zzk.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.android.gms.internal.ads.zzftr$zzj$1 r1 = new com.google.android.gms.internal.ads.zzftr$zzj$1     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.android.gms.internal.ads.zzftr> r2 = com.google.android.gms.internal.ads.zzftr.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                zzc = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                zzb = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                zzd = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                zze = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                zzf = r2     // Catch:{ Exception -> 0x0053 }
                zza = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                com.google.android.gms.internal.ads.zzfpi.zzb(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftr.zzj.<clinit>():void");
        }

        private zzj() {
            super((C255881) null);
        }

        public /* synthetic */ zzj(C255881 r1) {
            super((C255881) null);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final com.google.android.gms.internal.ads.zzftr.zzd zza(com.google.android.gms.internal.ads.zzftr r3, com.google.android.gms.internal.ads.zzftr.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzftr$zzd r0 = r3.listeners
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftr.zzj.zza(com.google.android.gms.internal.ads.zzftr, com.google.android.gms.internal.ads.zzftr$zzd):com.google.android.gms.internal.ads.zzftr$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final com.google.android.gms.internal.ads.zzftr.zzk zzb(com.google.android.gms.internal.ads.zzftr r3, com.google.android.gms.internal.ads.zzftr.zzk r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzftr$zzk r0 = r3.waiters
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftr.zzj.zzb(com.google.android.gms.internal.ads.zzftr, com.google.android.gms.internal.ads.zzftr$zzk):com.google.android.gms.internal.ads.zzftr$zzk");
        }

        public final void zzc(zzk zzk, zzk zzk2) {
            zza.putObject(zzk, zzf, zzk2);
        }

        public final void zzd(zzk zzk, Thread thread) {
            zza.putObject(zzk, zze, thread);
        }

        public final boolean zze(zzftr zzftr, zzd zzd2, zzd zzd3) {
            return zzftt.zza(zza, zzftr, zzb, zzd2, zzd3);
        }

        public final boolean zzf(zzftr zzftr, Object obj, Object obj2) {
            return zzftt.zza(zza, zzftr, zzd, obj, obj2);
        }

        public final boolean zzg(zzftr zzftr, zzk zzk, zzk zzk2) {
            return zzftt.zza(zza, zzftr, zzc, zzk, zzk2);
        }
    }

    final class zzk {
        public static final zzk zza = new zzk(false);
        public volatile zzk next;
        public volatile Thread thread;

        public zzk() {
            zzftr.zzaU.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zza2;
        Class<zzk> cls = zzk.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        try {
            zza2 = new zzj((C255881) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            zza2 = new zzg((C255881) null);
        }
        zzaU = zza2;
        if (th != null) {
            Logger logger = zzaT;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    private final void zzA(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zza) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (!zzaU.zzg(this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else if (obj == zzaX) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    public static Object zzf(zzfvj zzfvj) {
        Throwable zzp;
        if (zzfvj instanceof zzh) {
            Object obj = ((zzftr) zzfvj).value;
            if (obj instanceof zzb) {
                zzb zzb2 = (zzb) obj;
                if (zzb2.zzc) {
                    Throwable th = zzb2.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzfvj instanceof zzfwb) && (zzp = ((zzfwb) zzfvj).zzp()) != null) {
            return new zzc(zzp);
        } else {
            boolean isCancelled = zzfvj.isCancelled();
            if ((!zzd) && isCancelled) {
                zzb zzb3 = zzb.zzb;
                zzb3.getClass();
                return zzb3;
            }
            try {
                Object zzg2 = zzg(zzfvj);
                if (isCancelled) {
                    String valueOf = String.valueOf(zzfvj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                    sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb.append(valueOf);
                    return new zzb(false, new IllegalArgumentException(sb.toString()));
                } else if (zzg2 == null) {
                    return zzaX;
                } else {
                    return zzg2;
                }
            } catch (ExecutionException e) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfvj)), e));
                }
                return new zzc(e.getCause());
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfvj)), e2));
                }
                return new zzb(false, e2);
            } catch (Throwable th2) {
                return new zzc(th2);
            }
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
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
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else if (zzg2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzw(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzx(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                str = zzfpg.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                str = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (str != null) {
                C16530d.m42019l(sb, ", info=[", str, "]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzv(sb);
        }
    }

    private final void zzx(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    public static void zzy(zzftr<V> zzftr) {
        zzd zzd2 = null;
        while (true) {
            for (zzk zzb2 = zzaU.zzb(zzftr, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzftr.zzb();
            zzd zzd3 = zzd2;
            zzd zza2 = zzaU.zza(zzftr, zzd.zza);
            zzd zzd4 = zzd3;
            while (zza2 != null) {
                zzd zzd5 = zza2.next;
                zza2.next = zzd4;
                zzd4 = zza2;
                zza2 = zzd5;
            }
            while (true) {
                if (zzd4 != null) {
                    zzd2 = zzd4.next;
                    Runnable runnable = zzd4.zzb;
                    runnable.getClass();
                    if (runnable instanceof zzf) {
                        zzf zzf2 = (zzf) runnable;
                        zzftr = zzf2.zza;
                        if (zzftr.value == zzf2) {
                            if (zzaU.zzf(zzftr, zzf2, zzf(zzf2.zzb))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = zzd4.zzc;
                        executor.getClass();
                        zzz(runnable, executor);
                    }
                    zzd4 = zzd2;
                } else {
                    return;
                }
            }
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzaT;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", C13715c.m34246l(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzfvj<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = zzd
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzftr$zzb r3 = new com.google.android.gms.internal.ads.zzftr$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzftr$zzb r3 = com.google.android.gms.internal.ads.zzftr.zzb.zza
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzftr$zzb r3 = com.google.android.gms.internal.ads.zzftr.zzb.zzb
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.zzftr$zza r6 = zzaU
            boolean r6 = r6.zzf(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.zzr()
        L_0x0038:
            zzy(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzftr$zzf r0 = (com.google.android.gms.internal.ads.zzftr.zzf) r0
            com.google.android.gms.internal.ads.zzfvj<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzftr.zzh
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.zzftr r4 = (com.google.android.gms.internal.ads.zzftr) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = 1
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftr.cancel(boolean):boolean");
    }

    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zza) {
                zzk zzk3 = new zzk();
                do {
                    zza zza2 = zzaU;
                    zza2.zzc(zzk3, zzk2);
                    if (zza2.zzg(this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzA(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public void zzb() {
    }

    public void zzc(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzfos.zzc(runnable, "Runnable was null.");
        zzfos.zzc(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzaU.zze(this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zza);
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzaX;
        }
        if (!zzaU.zzf(this, (Object) null, obj)) {
            return false;
        }
        zzy(this);
        return true;
    }

    public boolean zze(Throwable th) {
        th.getClass();
        if (!zzaU.zzf(this, (Object) null, new zzc(th))) {
            return false;
        }
        zzy(this);
        return true;
    }

    public final Throwable zzp() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public void zzr() {
    }

    public final void zzs(Future future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzt(zzfvj zzfvj) {
        zzf zzf2;
        zzc zzc2;
        zzfvj.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzfvj.isDone()) {
                if (!zzaU.zzf(this, (Object) null, zzf(zzfvj))) {
                    return false;
                }
                zzy(this);
                return true;
            }
            zzf2 = new zzf(this, zzfvj);
            if (zzaU.zzf(this, (Object) null, zzf2)) {
                try {
                    zzfvj.zzc(zzf2, zzfuo.INSTANCE);
                } catch (Throwable unused) {
                    zzc2 = zzc.zza;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfvj.cancel(((zzb) obj).zzc);
        }
        return false;
        zzaU.zzf(this, zzf2, zzc2);
        return true;
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x01c2
            java.lang.Object r6 = r0.value
            r7 = 1
            if (r6 == 0) goto L_0x0017
            r8 = 1
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            boolean r9 = r6 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            r9 = r9 ^ r7
            r8 = r8 & r9
            if (r8 == 0) goto L_0x0023
            java.lang.Object r1 = zzB(r6)
            return r1
        L_0x0023:
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 + r4
            goto L_0x0030
        L_0x002f:
            r10 = r8
        L_0x0030:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzftr$zzk r6 = r0.waiters
            com.google.android.gms.internal.ads.zzftr$zzk r14 = com.google.android.gms.internal.ads.zzftr.zzk.zza
            if (r6 == r14) goto L_0x0091
            com.google.android.gms.internal.ads.zzftr$zzk r14 = new com.google.android.gms.internal.ads.zzftr$zzk
            r14.<init>()
        L_0x0041:
            com.google.android.gms.internal.ads.zzftr$zza r15 = zzaU
            r15.zzc(r14, r6)
            boolean r6 = r15.zzg(r0, r6, r14)
            if (r6 == 0) goto L_0x0087
        L_0x004c:
            r8 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r4 = java.lang.Math.min(r4, r8)
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x007e
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            boolean r6 = r4 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            r6 = r6 ^ r7
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0070
            java.lang.Object r1 = zzB(r4)
            return r1
        L_0x0070:
            long r4 = java.lang.System.nanoTime()
            long r4 = r10 - r4
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.zzA(r14)
            goto L_0x00bd
        L_0x007e:
            r0.zzA(r14)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L_0x0087:
            com.google.android.gms.internal.ads.zzftr$zzk r6 = r0.waiters
            com.google.android.gms.internal.ads.zzftr$zzk r8 = com.google.android.gms.internal.ads.zzftr.zzk.zza
            if (r6 != r8) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            r8 = 0
            goto L_0x0041
        L_0x0091:
            java.lang.Object r1 = r0.value
            r1.getClass()
            java.lang.Object r1 = zzB(r1)
            return r1
        L_0x009b:
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c6
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L_0x00a5
            r5 = 1
            goto L_0x00a6
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            boolean r6 = r4 instanceof com.google.android.gms.internal.ads.zzftr.zzf
            r6 = r6 ^ r7
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r1 = zzB(r4)
            return r1
        L_0x00b1:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x00c0
            long r4 = java.lang.System.nanoTime()
            long r4 = r10 - r4
        L_0x00bd:
            r8 = 0
            goto L_0x009b
        L_0x00c0:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L_0x00c6:
            java.lang.String r6 = r18.toString()
            java.lang.String r8 = r21.toString()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            java.lang.String r10 = r21.toString()
            java.lang.String r9 = r10.toLowerCase(r9)
            java.lang.String r10 = java.lang.String.valueOf(r9)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 28
            r11.<init>(r10)
            java.lang.String r10 = "Waited "
            r11.append(r10)
            r11.append(r1)
            java.lang.String r1 = " "
            r11.append(r1)
            r11.append(r9)
            java.lang.String r2 = r11.toString()
            long r9 = r4 + r12
            r14 = 0
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 >= 0) goto L_0x0188
            java.lang.String r9 = " (plus "
            java.lang.String r2 = r2.concat(r9)
            long r4 = -r4
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = r3.convert(r4, r9)
            long r16 = r3.toNanos(r9)
            long r4 = r4 - r16
            int r3 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0124
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r7 = 0
        L_0x0124:
            if (r3 <= 0) goto L_0x015e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r3 = r3 + 21
            int r3 = r3 + r11
            r12.<init>(r3)
            r12.append(r2)
            r12.append(r9)
            r12.append(r1)
            r12.append(r8)
            java.lang.String r2 = r12.toString()
            if (r7 == 0) goto L_0x0156
            java.lang.String r3 = ","
            java.lang.String r2 = r2.concat(r3)
        L_0x0156:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r2.concat(r1)
        L_0x015e:
            if (r7 == 0) goto L_0x017e
            java.lang.String r1 = java.lang.String.valueOf(r2)
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 33
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = " nanoseconds "
            r3.append(r1)
            java.lang.String r2 = r3.toString()
        L_0x017e:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "delay)"
            java.lang.String r2 = r1.concat(r2)
        L_0x0188:
            boolean r1 = r18.isDone()
            if (r1 == 0) goto L_0x019e
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x019e:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r6)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 5
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = " for "
            java.lang.String r2 = p379.C13715c.m34245k(r5, r2, r3, r6)
            r1.<init>(r2)
            throw r1
        L_0x01c2:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftr.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
