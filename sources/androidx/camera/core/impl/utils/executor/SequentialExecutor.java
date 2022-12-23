package androidx.camera.core.impl.utils.executor;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class SequentialExecutor implements Executor {

    /* renamed from: b */
    public final ArrayDeque f2061b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f2062c;

    /* renamed from: d */
    public final C0605b f2063d = new C0605b();

    /* renamed from: e */
    public WorkerRunningState f2064e = WorkerRunningState.IDLE;

    /* renamed from: f */
    public long f2065f = 0;

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* renamed from: androidx.camera.core.impl.utils.executor.SequentialExecutor$a */
    public class C0604a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f2066b;

        public C0604a(Runnable runnable) {
            this.f2066b = runnable;
        }

        public final void run() {
            this.f2066b.run();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.executor.SequentialExecutor$b */
    public final class C0605b implements Runnable {
        public C0605b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r3.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2523a() {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch:{ all -> 0x0059 }
                java.util.ArrayDeque r2 = r2.f2061b     // Catch:{ all -> 0x0059 }
                monitor-enter(r2)     // Catch:{ all -> 0x0059 }
                if (r0 != 0) goto L_0x0026
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch:{ all -> 0x0056 }
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r0.f2064e     // Catch:{ all -> 0x0056 }
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x0056 }
                if (r3 != r4) goto L_0x001c
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                long r5 = r0.f2065f     // Catch:{ all -> 0x0056 }
                r7 = 1
                long r5 = r5 + r7
                r0.f2065f = r5     // Catch:{ all -> 0x0056 }
                r0.f2064e = r4     // Catch:{ all -> 0x0056 }
                r0 = 1
            L_0x0026:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch:{ all -> 0x0056 }
                java.util.ArrayDeque r3 = r3.f2061b     // Catch:{ all -> 0x0056 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0056 }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x0056 }
                if (r3 != 0) goto L_0x0043
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch:{ all -> 0x0056 }
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x0056 }
                r0.f2064e = r3     // Catch:{ all -> 0x0056 }
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0042
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0042:
                return
            L_0x0043:
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0059 }
                r1 = r1 | r2
                r3.run()     // Catch:{ RuntimeException -> 0x004d }
                goto L_0x0002
            L_0x004d:
                java.lang.String r2 = "SequentialExecutor"
                r3.toString()     // Catch:{ all -> 0x0059 }
                p054d0.C4289j0.m11435b(r2)     // Catch:{ all -> 0x0059 }
                goto L_0x0002
            L_0x0056:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0056 }
                throw r0     // Catch:{ all -> 0x0059 }
            L_0x0059:
                r0 = move-exception
                if (r1 == 0) goto L_0x0063
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0063:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.C0605b.mo2523a():void");
        }

        public final void run() {
            try {
                mo2523a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.f2061b) {
                    SequentialExecutor.this.f2064e = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }
    }

    public SequentialExecutor(Executor executor) {
        executor.getClass();
        this.f2062c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f2062c.execute(r8.f2063d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r8.f2064e == r9) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = r8.f2061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r8.f2065f != r3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r8.f2064e != r9) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r8.f2064e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        monitor-enter(r8.f2061b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3 = r8.f2064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r3 == androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        if ((r9 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            r9.getClass()
            java.util.ArrayDeque r0 = r8.f2061b
            monitor-enter(r0)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r8.f2064e     // Catch:{ all -> 0x0075 }
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x0075 }
            if (r1 == r2) goto L_0x006e
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED     // Catch:{ all -> 0x0075 }
            if (r1 != r2) goto L_0x0011
            goto L_0x006e
        L_0x0011:
            long r3 = r8.f2065f     // Catch:{ all -> 0x0075 }
            androidx.camera.core.impl.utils.executor.SequentialExecutor$a r1 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$a     // Catch:{ all -> 0x0075 }
            r1.<init>(r9)     // Catch:{ all -> 0x0075 }
            java.util.ArrayDeque r9 = r8.f2061b     // Catch:{ all -> 0x0075 }
            r9.add(r1)     // Catch:{ all -> 0x0075 }
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r9 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x0075 }
            r8.f2064e = r9     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.f2062c     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            androidx.camera.core.impl.utils.executor.SequentialExecutor$b r7 = r8.f2063d     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r8.f2064e
            if (r1 == r9) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.util.ArrayDeque r6 = r8.f2061b
            monitor-enter(r6)
            long r0 = r8.f2065f     // Catch:{ all -> 0x0045 }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r8.f2064e     // Catch:{ all -> 0x0045 }
            if (r0 != r9) goto L_0x0043
            r8.f2064e = r2     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            throw r9
        L_0x0048:
            r9 = move-exception
            goto L_0x004b
        L_0x004a:
            r9 = move-exception
        L_0x004b:
            java.util.ArrayDeque r2 = r8.f2061b
            monitor-enter(r2)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r8.f2064e     // Catch:{ all -> 0x006b }
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x006b }
            if (r3 == r4) goto L_0x0058
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x006b }
            if (r3 != r4) goto L_0x0061
        L_0x0058:
            java.util.ArrayDeque r3 = r8.f2061b     // Catch:{ all -> 0x006b }
            boolean r1 = r3.removeLastOccurrence(r1)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            boolean r1 = r9 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            return
        L_0x006a:
            throw r9     // Catch:{ all -> 0x006b }
        L_0x006b:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            throw r9
        L_0x006e:
            java.util.ArrayDeque r1 = r8.f2061b     // Catch:{ all -> 0x0075 }
            r1.add(r9)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.execute(java.lang.Runnable):void");
    }
}
