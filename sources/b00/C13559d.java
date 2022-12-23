package b00;

/* renamed from: b00.d */
public abstract class C13559d implements Runnable, C13556a {

    /* renamed from: b */
    public boolean f33502b = false;

    /* renamed from: c */
    public Thread f33503c = null;

    /* renamed from: d */
    public boolean f33504d = false;

    /* renamed from: a */
    public abstract void mo40445a();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean cancel(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f33502b     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1.f33504d     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000a
            goto L_0x0018
        L_0x000a:
            r0 = 1
            r1.f33502b = r0     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x0016
            java.lang.Thread r2 = r1.f33503c     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x0016
            r2.interrupt()     // Catch:{ all -> 0x001b }
        L_0x0016:
            monitor-exit(r1)
            return r0
        L_0x0018:
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.C13559d.cancel(boolean):boolean");
    }

    public final void run() {
        synchronized (this) {
            if (this.f33504d) {
                throw new IllegalStateException("CancelableRunnable may not be run more than once");
            } else if (!this.f33502b) {
                this.f33503c = Thread.currentThread();
                try {
                    mo40445a();
                    synchronized (this) {
                        this.f33503c = null;
                        this.f33504d = true;
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f33503c = null;
                        this.f33504d = true;
                        throw th;
                    }
                }
            }
        }
    }
}
