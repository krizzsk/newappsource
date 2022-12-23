package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p260t6.C6598d;

/* renamed from: com.bumptech.glide.request.b */
public final class C2216b implements RequestCoordinator, C6598d {

    /* renamed from: a */
    public final RequestCoordinator f7229a;

    /* renamed from: b */
    public final Object f7230b;

    /* renamed from: c */
    public volatile C6598d f7231c;

    /* renamed from: d */
    public volatile C6598d f7232d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f7233e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f7234f;

    /* renamed from: g */
    public boolean f7235g;

    public C2216b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f7233e = requestState;
        this.f7234f = requestState;
        this.f7230b = obj;
        this.f7229a = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean mo11016a() {
        boolean z;
        synchronized (this.f7230b) {
            if (!this.f7232d.mo11024a()) {
                if (!this.f7231c.mo11024a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo11017b(C6598d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f7230b) {
            RequestCoordinator requestCoordinator = this.f7229a;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo11017b(this)) {
                    z2 = false;
                    if (z2 && dVar.equals(this.f7231c) && !mo11016a()) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo11026c() {
        boolean z;
        synchronized (this.f7230b) {
            if (this.f7233e == RequestCoordinator.RequestState.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void clear() {
        synchronized (this.f7230b) {
            this.f7235g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f7233e = requestState;
            this.f7234f = requestState;
            this.f7232d.clear();
            this.f7231c.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11028d(p260t6.C6598d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.C2216b
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.b r4 = (com.bumptech.glide.request.C2216b) r4
            t6.d r0 = r3.f7231c
            if (r0 != 0) goto L_0x0010
            t6.d r0 = r4.f7231c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            t6.d r0 = r3.f7231c
            t6.d r2 = r4.f7231c
            boolean r0 = r0.mo11028d(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            t6.d r0 = r3.f7232d
            if (r0 != 0) goto L_0x0023
            t6.d r4 = r4.f7232d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            t6.d r0 = r3.f7232d
            t6.d r4 = r4.f7232d
            boolean r4 = r0.mo11028d(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2216b.mo11028d(t6.d):boolean");
    }

    /* renamed from: e */
    public final boolean mo11029e() {
        boolean z;
        synchronized (this.f7230b) {
            if (this.f7233e == RequestCoordinator.RequestState.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11018f(p260t6.C6598d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7230b
            monitor-enter(r0)
            t6.d r1 = r2.f7231c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f7234f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f7233e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f7229a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo11018f(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2216b.mo11018f(t6.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11019g(p260t6.C6598d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7230b
            monitor-enter(r0)
            t6.d r1 = r2.f7232d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f7234f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f7233e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f7229a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo11019g(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f7234f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            t6.d r3 = r2.f7232d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2216b.mo11019g(t6.d):void");
    }

    public final RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f7230b) {
            RequestCoordinator requestCoordinator2 = this.f7229a;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.getRoot();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    /* renamed from: h */
    public final boolean mo11021h(C6598d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f7230b) {
            RequestCoordinator requestCoordinator = this.f7229a;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo11021h(this)) {
                    z2 = false;
                    if (z2 && (dVar.equals(this.f7231c) || this.f7233e != RequestCoordinator.RequestState.SUCCESS)) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo11022i(C6598d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.f7230b) {
            RequestCoordinator requestCoordinator = this.f7229a;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo11022i(this)) {
                    z2 = false;
                    if (z2 && dVar.equals(this.f7231c) && this.f7233e != RequestCoordinator.RequestState.PAUSED) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f7230b) {
            if (this.f7233e == RequestCoordinator.RequestState.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final void mo11035j() {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2;
        synchronized (this.f7230b) {
            this.f7235g = true;
            try {
                if (!(this.f7233e == RequestCoordinator.RequestState.SUCCESS || this.f7234f == (requestState2 = RequestCoordinator.RequestState.RUNNING))) {
                    this.f7234f = requestState2;
                    this.f7232d.mo11035j();
                }
                if (this.f7235g && this.f7233e != (requestState = RequestCoordinator.RequestState.RUNNING)) {
                    this.f7233e = requestState;
                    this.f7231c.mo11035j();
                }
            } finally {
                this.f7235g = false;
            }
        }
    }

    public final void pause() {
        synchronized (this.f7230b) {
            if (!this.f7234f.isComplete()) {
                this.f7234f = RequestCoordinator.RequestState.PAUSED;
                this.f7232d.pause();
            }
            if (!this.f7233e.isComplete()) {
                this.f7233e = RequestCoordinator.RequestState.PAUSED;
                this.f7231c.pause();
            }
        }
    }
}
