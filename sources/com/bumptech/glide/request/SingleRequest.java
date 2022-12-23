package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2118d;
import com.bumptech.glide.C2125f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2172e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p025b6.C1487b;
import p025b6.C1492e;
import p060d6.C4385f;
import p060d6.C4397l;
import p108h6.C5100k;
import p169m6.C5708b;
import p260t6.C6595a;
import p260t6.C6598d;
import p260t6.C6599e;
import p260t6.C6601f;
import p260t6.C6603h;
import p273u6.C6719i;
import p273u6.C6720j;
import p285v6.C6871e;
import p311x6.C7163b;
import p311x6.C7171h;
import p311x6.C7176l;
import p322y6.C7341d;

public final class SingleRequest<R> implements C6598d, C6719i, C6603h {

    /* renamed from: B */
    public static final boolean f7195B = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public RuntimeException f7196A;

    /* renamed from: a */
    public final C7341d.C7342a f7197a;

    /* renamed from: b */
    public final Object f7198b;

    /* renamed from: c */
    public final C6601f<R> f7199c;

    /* renamed from: d */
    public final RequestCoordinator f7200d;

    /* renamed from: e */
    public final Context f7201e;

    /* renamed from: f */
    public final C2125f f7202f;

    /* renamed from: g */
    public final Object f7203g;

    /* renamed from: h */
    public final Class<R> f7204h;

    /* renamed from: i */
    public final C6595a<?> f7205i;

    /* renamed from: j */
    public final int f7206j;

    /* renamed from: k */
    public final int f7207k;

    /* renamed from: l */
    public final Priority f7208l;

    /* renamed from: m */
    public final C6720j<R> f7209m;

    /* renamed from: n */
    public final List<C6601f<R>> f7210n;

    /* renamed from: o */
    public final C6871e<? super R> f7211o;

    /* renamed from: p */
    public final Executor f7212p;

    /* renamed from: q */
    public C4397l<R> f7213q;

    /* renamed from: r */
    public C2172e.C2178d f7214r;

    /* renamed from: s */
    public volatile C2172e f7215s;

    /* renamed from: t */
    public Status f7216t;

    /* renamed from: u */
    public Drawable f7217u;

    /* renamed from: v */
    public Drawable f7218v;

    /* renamed from: w */
    public Drawable f7219w;

    /* renamed from: x */
    public int f7220x;

    /* renamed from: y */
    public int f7221y;

    /* renamed from: z */
    public boolean f7222z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C2125f fVar, Object obj, Object obj2, Class cls, C6595a aVar, int i, int i2, Priority priority, C6720j jVar, C6599e eVar, ArrayList arrayList, RequestCoordinator requestCoordinator, C2172e eVar2, C6871e eVar3, Executor executor) {
        C2125f fVar2 = fVar;
        if (f7195B) {
            String.valueOf(hashCode());
        }
        this.f7197a = new C7341d.C7342a();
        this.f7198b = obj;
        this.f7201e = context;
        this.f7202f = fVar2;
        this.f7203g = obj2;
        this.f7204h = cls;
        this.f7205i = aVar;
        this.f7206j = i;
        this.f7207k = i2;
        this.f7208l = priority;
        this.f7209m = jVar;
        this.f7199c = eVar;
        this.f7210n = arrayList;
        this.f7200d = requestCoordinator;
        this.f7215s = eVar2;
        this.f7211o = eVar3;
        this.f7212p = executor;
        this.f7216t = Status.PENDING;
        if (this.f7196A == null) {
            if (fVar2.f6915h.f6918a.containsKey(C2118d.C2122d.class)) {
                this.f7196A = new RuntimeException("Glide request origin trace");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11024a() {
        boolean z;
        synchronized (this.f7198b) {
            if (this.f7216t == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo11025b(int i, int i2) {
        Object obj;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        Status status;
        C1492e eVar;
        int i4 = i;
        int i5 = i2;
        this.f7197a.mo23560a();
        Object obj2 = this.f7198b;
        synchronized (obj2) {
            try {
                boolean z4 = f7195B;
                if (z4) {
                    int i6 = C7171h.f22255a;
                    SystemClock.elapsedRealtimeNanos();
                }
                if (this.f7216t == Status.WAITING_FOR_SIZE) {
                    Status status2 = Status.RUNNING;
                    this.f7216t = status2;
                    float f = this.f7205i.f20418c;
                    if (i4 != Integer.MIN_VALUE) {
                        i4 = Math.round(((float) i4) * f);
                    }
                    this.f7220x = i4;
                    if (i5 == Integer.MIN_VALUE) {
                        i3 = i5;
                    } else {
                        i3 = Math.round(f * ((float) i5));
                    }
                    this.f7221y = i3;
                    if (z4) {
                        int i7 = C7171h.f22255a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    C2172e eVar2 = this.f7215s;
                    C2125f fVar = this.f7202f;
                    Object obj3 = this.f7203g;
                    C6595a<?> aVar = this.f7205i;
                    C1487b bVar = aVar.f20428m;
                    int i8 = this.f7220x;
                    int i9 = this.f7221y;
                    Class<?> cls = aVar.f20435t;
                    Class<R> cls2 = this.f7204h;
                    Priority priority = this.f7208l;
                    C4385f fVar2 = aVar.f20419d;
                    C7163b bVar2 = aVar.f20434s;
                    boolean z5 = aVar.f20429n;
                    Status status3 = status2;
                    boolean z6 = aVar.f20441z;
                    C1492e eVar3 = aVar.f20433r;
                    Object obj4 = obj2;
                    try {
                        z = aVar.f20425j;
                        z2 = aVar.f20439x;
                        z3 = aVar.f20416A;
                        status = status3;
                        eVar = eVar3;
                        obj = obj4;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        C2172e.C2178d b = eVar2.mo10962b(fVar, obj3, bVar, i8, i9, cls, cls2, priority, fVar2, bVar2, z5, z6, eVar, z, z2, z3, aVar.f20440y, this, this.f7212p);
                        try {
                            this.f7214r = b;
                            if (this.f7216t != status) {
                                this.f7214r = null;
                            }
                            if (z4) {
                                int i11 = C7171h.f22255a;
                                SystemClock.elapsedRealtimeNanos();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo11026c() {
        boolean z;
        synchronized (this.f7198b) {
            if (this.f7216t == Status.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r5.f7215s.getClass();
        com.bumptech.glide.load.engine.C2172e.m5660d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7198b
            monitor-enter(r0)
            boolean r1 = r5.f7222z     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0047
            y6.d$a r1 = r5.f7197a     // Catch:{ all -> 0x004f }
            r1.mo23560a()     // Catch:{ all -> 0x004f }
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f7216t     // Catch:{ all -> 0x004f }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x004f }
            if (r1 != r2) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0014:
            r5.mo11030f()     // Catch:{ all -> 0x004f }
            d6.l<R> r1 = r5.f7213q     // Catch:{ all -> 0x004f }
            r3 = 0
            if (r1 == 0) goto L_0x001f
            r5.f7213q = r3     // Catch:{ all -> 0x004f }
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            com.bumptech.glide.request.RequestCoordinator r3 = r5.f7200d     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x002d
            boolean r3 = r3.mo11022i(r5)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x0039
            u6.j<R> r3 = r5.f7209m     // Catch:{ all -> 0x004f }
            android.graphics.drawable.Drawable r4 = r5.mo11031g()     // Catch:{ all -> 0x004f }
            r3.mo22005d(r4)     // Catch:{ all -> 0x004f }
        L_0x0039:
            r5.f7216t = r2     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0046
            com.bumptech.glide.load.engine.e r0 = r5.f7215s
            r0.getClass()
            com.bumptech.glide.load.engine.C2172e.m5660d(r1)
        L_0x0046:
            return
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004f }
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    /* renamed from: d */
    public final boolean mo11028d(C6598d dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C6595a<?> aVar;
        Priority priority;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        C6595a<?> aVar2;
        Priority priority2;
        int i6;
        boolean z;
        C6598d dVar2 = dVar;
        if (!(dVar2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f7198b) {
            i = this.f7206j;
            i2 = this.f7207k;
            obj = this.f7203g;
            cls = this.f7204h;
            aVar = this.f7205i;
            priority = this.f7208l;
            List<C6601f<R>> list = this.f7210n;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        SingleRequest singleRequest = (SingleRequest) dVar2;
        synchronized (singleRequest.f7198b) {
            i4 = singleRequest.f7206j;
            i5 = singleRequest.f7207k;
            obj2 = singleRequest.f7203g;
            cls2 = singleRequest.f7204h;
            aVar2 = singleRequest.f7205i;
            priority2 = singleRequest.f7208l;
            List<C6601f<R>> list2 = singleRequest.f7210n;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5) {
            char[] cArr = C7176l.f22265a;
            if (obj == null) {
                if (obj2 == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (obj instanceof C5100k) {
                z = ((C5100k) obj).mo20837a();
            } else {
                z = obj.equals(obj2);
            }
            if (!z || !cls.equals(cls2) || !aVar.equals(aVar2) || priority != priority2 || i3 != i6) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo11029e() {
        boolean z;
        synchronized (this.f7198b) {
            if (this.f7216t == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final void mo11030f() {
        if (!this.f7222z) {
            this.f7197a.mo23560a();
            this.f7209m.mo22753j(this);
            C2172e.C2178d dVar = this.f7214r;
            if (dVar != null) {
                synchronized (C2172e.this) {
                    dVar.f7083a.mo10973h(dVar.f7084b);
                }
                this.f7214r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* renamed from: g */
    public final Drawable mo11031g() {
        int i;
        if (this.f7218v == null) {
            C6595a<?> aVar = this.f7205i;
            Drawable drawable = aVar.f20423h;
            this.f7218v = drawable;
            if (drawable == null && (i = aVar.f20424i) > 0) {
                this.f7218v = mo11033i(i);
            }
        }
        return this.f7218v;
    }

    /* renamed from: h */
    public final boolean mo11032h() {
        RequestCoordinator requestCoordinator = this.f7200d;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo11016a();
    }

    /* renamed from: i */
    public final Drawable mo11033i(int i) {
        Resources.Theme theme = this.f7205i.f20437v;
        if (theme == null) {
            theme = this.f7201e.getTheme();
        }
        C2125f fVar = this.f7202f;
        return C5708b.m14020a(fVar, fVar, i, theme);
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f7198b) {
            Status status = this.f7216t;
            if (status != Status.RUNNING) {
                if (status != Status.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c4, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11035j() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7198b
            monitor-enter(r0)
            boolean r1 = r5.f7222z     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00cd
            y6.d$a r1 = r5.f7197a     // Catch:{ all -> 0x00d5 }
            r1.mo23560a()     // Catch:{ all -> 0x00d5 }
            int r1 = p311x6.C7171h.f22255a     // Catch:{ all -> 0x00d5 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r5.f7203g     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x0050
            int r1 = r5.f7206j     // Catch:{ all -> 0x00d5 }
            int r2 = r5.f7207k     // Catch:{ all -> 0x00d5 }
            boolean r1 = p311x6.C7176l.m16789i(r1, r2)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f7206j     // Catch:{ all -> 0x00d5 }
            r5.f7220x = r1     // Catch:{ all -> 0x00d5 }
            int r1 = r5.f7207k     // Catch:{ all -> 0x00d5 }
            r5.f7221y = r1     // Catch:{ all -> 0x00d5 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.f7219w     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x003d
            t6.a<?> r1 = r5.f7205i     // Catch:{ all -> 0x00d5 }
            android.graphics.drawable.Drawable r2 = r1.f20431p     // Catch:{ all -> 0x00d5 }
            r5.f7219w = r2     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x003d
            int r1 = r1.f20432q     // Catch:{ all -> 0x00d5 }
            if (r1 <= 0) goto L_0x003d
            android.graphics.drawable.Drawable r1 = r5.mo11033i(r1)     // Catch:{ all -> 0x00d5 }
            r5.f7219w = r1     // Catch:{ all -> 0x00d5 }
        L_0x003d:
            android.graphics.drawable.Drawable r1 = r5.f7219w     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x0043
            r1 = 5
            goto L_0x0044
        L_0x0043:
            r1 = 3
        L_0x0044:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00d5 }
            r5.mo11036k(r2, r1)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            return
        L_0x0050:
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f7216t     // Catch:{ all -> 0x00d5 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00d5 }
            if (r1 == r2) goto L_0x00c5
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00d5 }
            r3 = 0
            if (r1 != r2) goto L_0x0064
            d6.l<R> r1 = r5.f7213q     // Catch:{ all -> 0x00d5 }
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00d5 }
            r5.mo11037l(r1, r2, r3)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            return
        L_0x0064:
            java.util.List<t6.f<R>> r1 = r5.f7210n     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x006d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d5 }
            t6.f r2 = (p260t6.C6601f) r2     // Catch:{ all -> 0x00d5 }
            boolean r4 = r2 instanceof p260t6.C6596b     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x006d
            t6.b r2 = (p260t6.C6596b) r2     // Catch:{ all -> 0x00d5 }
            r2.getClass()     // Catch:{ all -> 0x00d5 }
            goto L_0x006d
        L_0x0083:
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x00d5 }
            r5.f7216t = r1     // Catch:{ all -> 0x00d5 }
            int r2 = r5.f7206j     // Catch:{ all -> 0x00d5 }
            int r4 = r5.f7207k     // Catch:{ all -> 0x00d5 }
            boolean r2 = p311x6.C7176l.m16789i(r2, r4)     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x0099
            int r2 = r5.f7206j     // Catch:{ all -> 0x00d5 }
            int r4 = r5.f7207k     // Catch:{ all -> 0x00d5 }
            r5.mo11025b(r2, r4)     // Catch:{ all -> 0x00d5 }
            goto L_0x009e
        L_0x0099:
            u6.j<R> r2 = r5.f7209m     // Catch:{ all -> 0x00d5 }
            r2.mo22742a(r5)     // Catch:{ all -> 0x00d5 }
        L_0x009e:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f7216t     // Catch:{ all -> 0x00d5 }
            com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00d5 }
            if (r2 == r4) goto L_0x00a6
            if (r2 != r1) goto L_0x00bc
        L_0x00a6:
            com.bumptech.glide.request.RequestCoordinator r1 = r5.f7200d     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r1.mo11017b(r5)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00b1
        L_0x00b0:
            r3 = 1
        L_0x00b1:
            if (r3 == 0) goto L_0x00bc
            u6.j<R> r1 = r5.f7209m     // Catch:{ all -> 0x00d5 }
            android.graphics.drawable.Drawable r2 = r5.mo11031g()     // Catch:{ all -> 0x00d5 }
            r1.mo22743b(r2)     // Catch:{ all -> 0x00d5 }
        L_0x00bc:
            boolean r1 = f7195B     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00c3
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00d5 }
        L_0x00c3:
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            return
        L_0x00c5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00cd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo11035j():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ce A[Catch:{ all -> 0x0082 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11036k(com.bumptech.glide.load.engine.GlideException r8, int r9) {
        /*
            r7 = this;
            y6.d$a r0 = r7.f7197a
            r0.mo23560a()
            java.lang.Object r0 = r7.f7198b
            monitor-enter(r0)
            java.lang.RuntimeException r1 = r7.f7196A     // Catch:{ all -> 0x00d6 }
            r8.mo10943g(r1)     // Catch:{ all -> 0x00d6 }
            com.bumptech.glide.f r1 = r7.f7202f     // Catch:{ all -> 0x00d6 }
            int r1 = r1.f6916i     // Catch:{ all -> 0x00d6 }
            r2 = 0
            if (r1 > r9) goto L_0x0035
            java.lang.Object r9 = r7.f7203g     // Catch:{ all -> 0x00d6 }
            java.util.Objects.toString(r9)     // Catch:{ all -> 0x00d6 }
            r9 = 4
            if (r1 > r9) goto L_0x0035
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00d6 }
            r9.<init>()     // Catch:{ all -> 0x00d6 }
            com.bumptech.glide.load.engine.GlideException.m5638a(r8, r9)     // Catch:{ all -> 0x00d6 }
            int r1 = r9.size()     // Catch:{ all -> 0x00d6 }
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x0035
            int r4 = r3 + 1
            java.lang.Object r3 = r9.get(r3)     // Catch:{ all -> 0x00d6 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x00d6 }
            r3 = r4
            goto L_0x0029
        L_0x0035:
            r9 = 0
            r7.f7214r = r9     // Catch:{ all -> 0x00d6 }
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.FAILED     // Catch:{ all -> 0x00d6 }
            r7.f7216t = r1     // Catch:{ all -> 0x00d6 }
            r1 = 1
            r7.f7222z = r1     // Catch:{ all -> 0x00d6 }
            java.util.List<t6.f<R>> r3 = r7.f7210n     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x005f
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0082 }
            r4 = 0
        L_0x0048:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0082 }
            t6.f r5 = (p260t6.C6601f) r5     // Catch:{ all -> 0x0082 }
            java.lang.Object r6 = r7.f7203g     // Catch:{ all -> 0x0082 }
            r7.mo11032h()     // Catch:{ all -> 0x0082 }
            boolean r5 = r5.mo22747f(r8, r6)     // Catch:{ all -> 0x0082 }
            r4 = r4 | r5
            goto L_0x0048
        L_0x005f:
            r4 = 0
        L_0x0060:
            t6.f<R> r3 = r7.f7199c     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0071
            java.lang.Object r5 = r7.f7203g     // Catch:{ all -> 0x0082 }
            r7.mo11032h()     // Catch:{ all -> 0x0082 }
            boolean r8 = r3.mo22747f(r8, r5)     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0071
            r8 = 1
            goto L_0x0072
        L_0x0071:
            r8 = 0
        L_0x0072:
            r8 = r8 | r4
            if (r8 != 0) goto L_0x00c8
            com.bumptech.glide.request.RequestCoordinator r8 = r7.f7200d     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0084
            boolean r8 = r8.mo11017b(r7)     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r1 = 0
            goto L_0x0084
        L_0x0082:
            r8 = move-exception
            goto L_0x00d3
        L_0x0084:
            if (r1 != 0) goto L_0x0087
            goto L_0x00c8
        L_0x0087:
            java.lang.Object r8 = r7.f7203g     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x00a3
            android.graphics.drawable.Drawable r8 = r7.f7219w     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x00a1
            t6.a<?> r8 = r7.f7205i     // Catch:{ all -> 0x0082 }
            android.graphics.drawable.Drawable r9 = r8.f20431p     // Catch:{ all -> 0x0082 }
            r7.f7219w = r9     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x00a1
            int r8 = r8.f20432q     // Catch:{ all -> 0x0082 }
            if (r8 <= 0) goto L_0x00a1
            android.graphics.drawable.Drawable r8 = r7.mo11033i(r8)     // Catch:{ all -> 0x0082 }
            r7.f7219w = r8     // Catch:{ all -> 0x0082 }
        L_0x00a1:
            android.graphics.drawable.Drawable r9 = r7.f7219w     // Catch:{ all -> 0x0082 }
        L_0x00a3:
            if (r9 != 0) goto L_0x00bd
            android.graphics.drawable.Drawable r8 = r7.f7217u     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x00bb
            t6.a<?> r8 = r7.f7205i     // Catch:{ all -> 0x0082 }
            android.graphics.drawable.Drawable r9 = r8.f20421f     // Catch:{ all -> 0x0082 }
            r7.f7217u = r9     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x00bb
            int r8 = r8.f20422g     // Catch:{ all -> 0x0082 }
            if (r8 <= 0) goto L_0x00bb
            android.graphics.drawable.Drawable r8 = r7.mo11033i(r8)     // Catch:{ all -> 0x0082 }
            r7.f7217u = r8     // Catch:{ all -> 0x0082 }
        L_0x00bb:
            android.graphics.drawable.Drawable r9 = r7.f7217u     // Catch:{ all -> 0x0082 }
        L_0x00bd:
            if (r9 != 0) goto L_0x00c3
            android.graphics.drawable.Drawable r9 = r7.mo11031g()     // Catch:{ all -> 0x0082 }
        L_0x00c3:
            u6.j<R> r8 = r7.f7209m     // Catch:{ all -> 0x0082 }
            r8.mo10888i(r9)     // Catch:{ all -> 0x0082 }
        L_0x00c8:
            r7.f7222z = r2     // Catch:{ all -> 0x00d6 }
            com.bumptech.glide.request.RequestCoordinator r8 = r7.f7200d     // Catch:{ all -> 0x00d6 }
            if (r8 == 0) goto L_0x00d1
            r8.mo11018f(r7)     // Catch:{ all -> 0x00d6 }
        L_0x00d1:
            monitor-exit(r0)     // Catch:{ all -> 0x00d6 }
            return
        L_0x00d3:
            r7.f7222z = r2     // Catch:{ all -> 0x00d6 }
            throw r8     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d6 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo11036k(com.bumptech.glide.load.engine.GlideException, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.f7215s.getClass();
        com.bumptech.glide.load.engine.C2172e.m5660d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11037l(p060d6.C4397l<?> r7, com.bumptech.glide.load.DataSource r8, boolean r9) {
        /*
            r6 = this;
            y6.d$a r9 = r6.f7197a
            r9.mo23560a()
            r9 = 0
            java.lang.Object r0 = r6.f7198b     // Catch:{ all -> 0x00cc }
            monitor-enter(r0)     // Catch:{ all -> 0x00cc }
            r6.f7214r = r9     // Catch:{ all -> 0x00be }
            r1 = 5
            if (r7 != 0) goto L_0x0030
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r8.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.Class<R> r2 = r6.f7204h     // Catch:{ all -> 0x00be }
            r8.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00be }
            r7.<init>(r8)     // Catch:{ all -> 0x00be }
            r6.mo11036k(r7, r1)     // Catch:{ all -> 0x00be }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            return
        L_0x0030:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x0068
            java.lang.Class<R> r3 = r6.f7204h     // Catch:{ all -> 0x00be }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00be }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x0043
            goto L_0x0068
        L_0x0043:
            com.bumptech.glide.request.RequestCoordinator r1 = r6.f7200d     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.mo11021h(r6)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0063
            r6.f7213q = r9     // Catch:{ all -> 0x00ba }
            com.bumptech.glide.request.SingleRequest$Status r8 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00ba }
            r6.f7216t = r8     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
        L_0x005a:
            com.bumptech.glide.load.engine.e r8 = r6.f7215s
            r8.getClass()
            com.bumptech.glide.load.engine.C2172e.m5660d(r7)
            return
        L_0x0063:
            r6.mo11038m(r7, r2, r8)     // Catch:{ all -> 0x00be }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            return
        L_0x0068:
            r6.f7213q = r9     // Catch:{ all -> 0x00ba }
            com.bumptech.glide.load.engine.GlideException r8 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.Class<R> r3 = r6.f7204h     // Catch:{ all -> 0x00ba }
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0087
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00ba }
            goto L_0x0089
        L_0x0087:
            java.lang.String r3 = ""
        L_0x0089:
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            r9.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00a9
            java.lang.String r2 = ""
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00ab:
            r9.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00ba }
            r8.<init>(r9)     // Catch:{ all -> 0x00ba }
            r6.mo11036k(r8, r1)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x005a
        L_0x00ba:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto L_0x00c3
        L_0x00be:
            r7 = move-exception
            r8 = r6
        L_0x00c0:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00c3:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r8     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r8 = move-exception
            goto L_0x00ce
        L_0x00c7:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00c0
        L_0x00cc:
            r8 = move-exception
            r7 = r6
        L_0x00ce:
            if (r9 == 0) goto L_0x00d8
            com.bumptech.glide.load.engine.e r7 = r7.f7215s
            r7.getClass()
            com.bumptech.glide.load.engine.C2172e.m5660d(r9)
        L_0x00d8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo11037l(d6.l, com.bumptech.glide.load.DataSource, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public final void mo11038m(C4397l lVar, Object obj, DataSource dataSource) {
        mo11032h();
        this.f7216t = Status.COMPLETE;
        this.f7213q = lVar;
        if (this.f7202f.f6916i <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.f7203g);
            int i = C7171h.f22255a;
            SystemClock.elapsedRealtimeNanos();
        }
        this.f7222z = true;
        try {
            List<C6601f<R>> list = this.f7210n;
            if (list != null) {
                for (C6601f<R> g : list) {
                    g.mo22748g(obj, this.f7203g, this.f7209m);
                }
            }
            C6601f<R> fVar = this.f7199c;
            if (fVar != null) {
                fVar.mo22748g(obj, this.f7203g, this.f7209m);
            }
            this.f7209m.mo10887h(obj, this.f7211o.mo23123a(dataSource));
            this.f7222z = false;
            RequestCoordinator requestCoordinator = this.f7200d;
            if (requestCoordinator != null) {
                requestCoordinator.mo11019g(this);
            }
        } catch (Throwable th) {
            this.f7222z = false;
            throw th;
        }
    }

    public final void pause() {
        synchronized (this.f7198b) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f7198b) {
            obj = this.f7203g;
            cls = this.f7204h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
