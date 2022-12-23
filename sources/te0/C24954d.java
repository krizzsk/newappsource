package te0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: te0.d */
public final class C24954d {

    /* renamed from: a */
    public static final boolean f63077a;

    /* renamed from: b */
    public static final int f63078b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f63079c = new AtomicReference<>();

    /* renamed from: d */
    public static final ConcurrentHashMap f63080d = new ConcurrentHashMap();

    /* renamed from: te0.d$a */
    public static final class C24955a implements Runnable {
        public final void run() {
            Iterator it = new ArrayList(C24954d.f63080d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C24954d.f63080d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[SYNTHETIC, Splitter:B:10:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[LOOP:0: B:19:0x003b->B:30:0x0071, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            f63079c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f63080d = r0
            java.lang.String r0 = "rx2.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x001f }
            goto L_0x0021
        L_0x001f:
        L_0x0020:
            r0 = 1
        L_0x0021:
            f63077a = r0
            java.lang.String r2 = "rx2.purge-period-seconds"
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0035
        L_0x0033:
        L_0x0034:
            r0 = 1
        L_0x0035:
            f63078b = r0
            boolean r0 = f63077a
            if (r0 == 0) goto L_0x0075
        L_0x003b:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = f63079c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L_0x0046
            goto L_0x0075
        L_0x0046:
            io.reactivex.internal.schedulers.RxThreadFactory r3 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r4 = "RxSchedulerPurge"
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L_0x0051:
            boolean r3 = r0.compareAndSet(r2, r5)
            if (r3 == 0) goto L_0x0059
            r0 = 1
            goto L_0x0060
        L_0x0059:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L_0x0051
            r0 = 0
        L_0x0060:
            if (r0 == 0) goto L_0x0071
            te0.d$a r6 = new te0.d$a
            r6.<init>()
            int r0 = f63078b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L_0x0075
        L_0x0071:
            r5.shutdownNow()
            goto L_0x003b
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te0.C24954d.<clinit>():void");
    }
}
