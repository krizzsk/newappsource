package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import p260t6.C6598d;

/* renamed from: com.bumptech.glide.request.a */
public final class C2215a implements RequestCoordinator, C6598d {

    /* renamed from: a */
    public final Object f7223a;

    /* renamed from: b */
    public final RequestCoordinator f7224b;

    /* renamed from: c */
    public volatile C6598d f7225c;

    /* renamed from: d */
    public volatile C6598d f7226d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f7227e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f7228f;

    public C2215a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f7227e = requestState;
        this.f7228f = requestState;
        this.f7223a = obj;
        this.f7224b = requestCoordinator;
    }

    /* renamed from: a */
    public final boolean mo11016a() {
        boolean z;
        synchronized (this.f7223a) {
            if (!this.f7225c.mo11024a()) {
                if (!this.f7226d.mo11024a()) {
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
        synchronized (this.f7223a) {
            RequestCoordinator requestCoordinator = this.f7224b;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo11017b(this)) {
                    z2 = false;
                    if (z2 && mo11041k(dVar)) {
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
        synchronized (this.f7223a) {
            RequestCoordinator.RequestState requestState = this.f7227e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            if (requestState == requestState2 && this.f7228f == requestState2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void clear() {
        synchronized (this.f7223a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f7227e = requestState;
            this.f7225c.clear();
            if (this.f7228f != requestState) {
                this.f7228f = requestState;
                this.f7226d.clear();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo11028d(C6598d dVar) {
        if (!(dVar instanceof C2215a)) {
            return false;
        }
        C2215a aVar = (C2215a) dVar;
        if (!this.f7225c.mo11028d(aVar.f7225c) || !this.f7226d.mo11028d(aVar.f7226d)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo11029e() {
        boolean z;
        synchronized (this.f7223a) {
            RequestCoordinator.RequestState requestState = this.f7227e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2) {
                if (this.f7228f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11018f(p260t6.C6598d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7223a
            monitor-enter(r0)
            t6.d r1 = r2.f7226d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f7227e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f7228f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f7228f = r1     // Catch:{ all -> 0x002b }
            t6.d r3 = r2.f7226d     // Catch:{ all -> 0x002b }
            r3.mo11035j()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f7228f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f7224b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo11018f(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2215a.mo11018f(t6.d):void");
    }

    /* renamed from: g */
    public final void mo11019g(C6598d dVar) {
        synchronized (this.f7223a) {
            if (dVar.equals(this.f7225c)) {
                this.f7227e = RequestCoordinator.RequestState.SUCCESS;
            } else if (dVar.equals(this.f7226d)) {
                this.f7228f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f7224b;
            if (requestCoordinator != null) {
                requestCoordinator.mo11019g(this);
            }
        }
    }

    public final RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f7223a) {
            RequestCoordinator requestCoordinator2 = this.f7224b;
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
        synchronized (this.f7223a) {
            RequestCoordinator requestCoordinator = this.f7224b;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo11021h(this)) {
                    z2 = false;
                    if (z2 && mo11041k(dVar)) {
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
        synchronized (this.f7223a) {
            RequestCoordinator requestCoordinator = this.f7224b;
            z = false;
            if (requestCoordinator != null) {
                if (!requestCoordinator.mo11022i(this)) {
                    z2 = false;
                    if (z2 && mo11041k(dVar)) {
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
        synchronized (this.f7223a) {
            RequestCoordinator.RequestState requestState = this.f7227e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                if (this.f7228f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final void mo11035j() {
        synchronized (this.f7223a) {
            RequestCoordinator.RequestState requestState = this.f7227e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f7227e = requestState2;
                this.f7225c.mo11035j();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo11041k(C6598d dVar) {
        if (dVar.equals(this.f7225c) || (this.f7227e == RequestCoordinator.RequestState.FAILED && dVar.equals(this.f7226d))) {
            return true;
        }
        return false;
    }

    public final void pause() {
        synchronized (this.f7223a) {
            RequestCoordinator.RequestState requestState = this.f7227e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f7227e = RequestCoordinator.RequestState.PAUSED;
                this.f7225c.pause();
            }
            if (this.f7228f == requestState2) {
                this.f7228f = RequestCoordinator.RequestState.PAUSED;
                this.f7226d.pause();
            }
        }
    }
}
