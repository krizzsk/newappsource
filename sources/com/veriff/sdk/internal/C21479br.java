package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import com.veriff.sdk.internal.C21508cg;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.veriff.sdk.internal.br */
class C21479br implements Runnable {

    /* renamed from: t */
    private static final Object f54025t = new Object();

    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f54026u = new ThreadLocal<StringBuilder>() {
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };

    /* renamed from: v */
    private static final AtomicInteger f54027v = new AtomicInteger();

    /* renamed from: w */
    private static final C21529cn f54028w = new C21529cn() {
        /* renamed from: a */
        public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + clVar);
        }

        /* renamed from: a */
        public boolean mo54408a(C21525cl clVar) {
            return true;
        }
    };

    /* renamed from: a */
    public final int f54029a = f54027v.incrementAndGet();

    /* renamed from: b */
    public final C21512ci f54030b;

    /* renamed from: c */
    public final C21491bx f54031c;

    /* renamed from: d */
    public final C21486bs f54032d;

    /* renamed from: e */
    public final C21532cp f54033e;

    /* renamed from: f */
    public final String f54034f;

    /* renamed from: g */
    public final C21525cl f54035g;

    /* renamed from: h */
    public final int f54036h;

    /* renamed from: i */
    public int f54037i;

    /* renamed from: j */
    public final C21529cn f54038j;

    /* renamed from: k */
    public C21476bp f54039k;

    /* renamed from: l */
    public List<C21476bp> f54040l;

    /* renamed from: m */
    public Bitmap f54041m;

    /* renamed from: n */
    public Future<?> f54042n;

    /* renamed from: o */
    public C21512ci.C21518d f54043o;

    /* renamed from: p */
    public Exception f54044p;

    /* renamed from: q */
    public int f54045q;

    /* renamed from: r */
    public int f54046r;

    /* renamed from: s */
    public C21512ci.C21519e f54047s;

    public C21479br(C21512ci ciVar, C21491bx bxVar, C21486bs bsVar, C21532cp cpVar, C21476bp bpVar, C21529cn cnVar) {
        this.f54030b = ciVar;
        this.f54031c = bxVar;
        this.f54032d = bsVar;
        this.f54033e = cpVar;
        this.f54039k = bpVar;
        this.f54034f = bpVar.mo54399d();
        this.f54035g = bpVar.mo54397b();
        this.f54047s = bpVar.mo54405j();
        this.f54036h = bpVar.mo54402g();
        this.f54037i = bpVar.mo54403h();
        this.f54038j = cnVar;
        this.f54046r = cnVar.mo54482a();
    }

    /* renamed from: a */
    public static int m51317a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static Bitmap m51318a(aca aca, C21525cl clVar) throws IOException {
        abk a = abr.m50508a(aca);
        boolean a2 = C21537cs.m51507a(a);
        boolean z = clVar.f54167r;
        BitmapFactory.Options c = C21529cn.m51463c(clVar);
        boolean a3 = C21529cn.m51462a(c);
        if (!a2) {
            InputStream h = a.mo53895h();
            if (a3) {
                C21503cc ccVar = new C21503cc(h);
                ccVar.mo54472a(false);
                long a4 = ccVar.mo54470a(1024);
                BitmapFactory.decodeStream(ccVar, (Rect) null, c);
                C21529cn.m51461a(clVar.f54157h, clVar.f54158i, c, clVar);
                ccVar.mo54471a(a4);
                ccVar.mo54472a(true);
                h = ccVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(h, (Rect) null, c);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] u = a.mo53919u();
        if (a3) {
            BitmapFactory.decodeByteArray(u, 0, u.length, c);
            C21529cn.m51461a(clVar.f54157h, clVar.f54158i, c, clVar);
        }
        return BitmapFactory.decodeByteArray(u, 0, u.length, c);
    }

    /* renamed from: a */
    private static boolean m51323a(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* renamed from: b */
    public static int m51324b(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: o */
    private C21512ci.C21519e m51325o() {
        boolean z;
        C21512ci.C21519e eVar = C21512ci.C21519e.LOW;
        List<C21476bp> list = this.f54040l;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C21476bp bpVar = this.f54039k;
        if (bpVar == null && !z) {
            z2 = false;
        }
        if (!z2) {
            return eVar;
        }
        if (bpVar != null) {
            eVar = bpVar.mo54405j();
        }
        if (z) {
            int size = this.f54040l.size();
            for (int i = 0; i < size; i++) {
                C21512ci.C21519e j = this.f54040l.get(i).mo54405j();
                if (j.ordinal() > eVar.ordinal()) {
                    eVar = j;
                }
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public void mo54412b(C21476bp bpVar) {
        boolean z;
        if (this.f54039k == bpVar) {
            this.f54039k = null;
            z = true;
        } else {
            List<C21476bp> list = this.f54040l;
            z = list != null ? list.remove(bpVar) : false;
        }
        if (z && bpVar.mo54405j() == this.f54047s) {
            this.f54047s = m51325o();
        }
        if (this.f54030b.f54119l) {
            C21537cs.m51506a("Hunter", "removed", bpVar.f54009b.mo54512a(), C21537cs.m51500a(this, "from "));
        }
    }

    /* renamed from: c */
    public boolean mo54414c() {
        Future<?> future = this.f54042n;
        return future != null && future.isCancelled();
    }

    /* renamed from: d */
    public boolean mo54415d() {
        return this.f54038j.mo54484b();
    }

    /* renamed from: e */
    public Bitmap mo54416e() {
        return this.f54041m;
    }

    /* renamed from: f */
    public String mo54417f() {
        return this.f54034f;
    }

    /* renamed from: g */
    public int mo54418g() {
        return this.f54036h;
    }

    /* renamed from: h */
    public C21525cl mo54419h() {
        return this.f54035g;
    }

    /* renamed from: i */
    public C21476bp mo54420i() {
        return this.f54039k;
    }

    /* renamed from: j */
    public C21512ci mo54421j() {
        return this.f54030b;
    }

    /* renamed from: k */
    public List<C21476bp> mo54422k() {
        return this.f54040l;
    }

    /* renamed from: l */
    public Exception mo54423l() {
        return this.f54044p;
    }

    /* renamed from: m */
    public C21512ci.C21518d mo54424m() {
        return this.f54043o;
    }

    /* renamed from: n */
    public C21512ci.C21519e mo54425n() {
        return this.f54047s;
    }

    public void run() {
        try {
            m51322a(this.f54035g);
            if (this.f54030b.f54119l) {
                C21537cs.m51505a("Hunter", "executing", C21537cs.m51499a(this));
            }
            Bitmap a = mo54409a();
            this.f54041m = a;
            if (a == null) {
                this.f54031c.mo54458c(this);
            } else {
                this.f54031c.mo54448a(this);
            }
        } catch (C21508cg.C21510b e) {
            if (!C21507cf.m51408c(e.f54107b) || e.f54106a != 504) {
                this.f54044p = e;
            }
            this.f54031c.mo54458c(this);
        } catch (IOException e2) {
            this.f54044p = e2;
            this.f54031c.mo54454b(this);
        } catch (OutOfMemoryError e3) {
            StringWriter stringWriter = new StringWriter();
            this.f54033e.mo54544e().mo54547a(new PrintWriter(stringWriter));
            this.f54044p = new RuntimeException(stringWriter.toString(), e3);
            this.f54031c.mo54458c(this);
        } catch (Exception e4) {
            this.f54044p = e4;
            this.f54031c.mo54458c(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* renamed from: b */
    public boolean mo54413b() {
        Future<?> future;
        if (this.f54039k != null) {
            return false;
        }
        List<C21476bp> list = this.f54040l;
        if ((list == null || list.isEmpty()) && (future = this.f54042n) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Bitmap mo54409a() throws IOException {
        Bitmap bitmap;
        if (C21506ce.m51404a(this.f54036h)) {
            bitmap = this.f54032d.mo54434a(this.f54034f);
            if (bitmap != null) {
                this.f54033e.mo54534a();
                this.f54043o = C21512ci.C21518d.MEMORY;
                if (this.f54030b.f54119l) {
                    C21537cs.m51506a("Hunter", "decoded", this.f54035g.mo54512a(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.f54046r == 0 ? C21507cf.OFFLINE.f54103d : this.f54037i;
        this.f54037i = i;
        C21529cn.C21530a a = this.f54038j.mo54407a(this.f54035g, i);
        if (a != null) {
            this.f54043o = a.mo54532c();
            this.f54045q = a.mo54533d();
            bitmap = a.mo54530a();
            if (bitmap == null) {
                aca b = a.mo54531b();
                try {
                    bitmap = m51318a(b, this.f54035g);
                } finally {
                    try {
                        b.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f54030b.f54119l) {
                C21537cs.m51505a("Hunter", "decoded", this.f54035g.mo54512a());
            }
            this.f54033e.mo54536a(bitmap);
            if (this.f54035g.mo54516e() || this.f54045q != 0) {
                synchronized (f54025t) {
                    if (this.f54035g.mo54517f() || this.f54045q != 0) {
                        bitmap = m51319a(this.f54035g, bitmap, this.f54045q);
                        if (this.f54030b.f54119l) {
                            C21537cs.m51505a("Hunter", "transformed", this.f54035g.mo54512a());
                        }
                    }
                    if (this.f54035g.mo54518g()) {
                        bitmap = m51320a(this.f54035g.f54156g, bitmap);
                        if (this.f54030b.f54119l) {
                            C21537cs.m51506a("Hunter", "transformed", this.f54035g.mo54512a(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f54033e.mo54540b(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    public void mo54410a(C21476bp bpVar) {
        boolean z = this.f54030b.f54119l;
        C21525cl clVar = bpVar.f54009b;
        if (this.f54039k == null) {
            this.f54039k = bpVar;
            if (z) {
                List<C21476bp> list = this.f54040l;
                if (list == null || list.isEmpty()) {
                    C21537cs.m51506a("Hunter", "joined", clVar.mo54512a(), "to empty hunter");
                } else {
                    C21537cs.m51506a("Hunter", "joined", clVar.mo54512a(), C21537cs.m51500a(this, "to "));
                }
            }
        } else {
            if (this.f54040l == null) {
                this.f54040l = new ArrayList(3);
            }
            this.f54040l.add(bpVar);
            if (z) {
                C21537cs.m51506a("Hunter", "joined", clVar.mo54512a(), C21537cs.m51500a(this, "to "));
            }
            C21512ci.C21519e j = bpVar.mo54405j();
            if (j.ordinal() > this.f54047s.ordinal()) {
                this.f54047s = j;
            }
        }
    }

    /* renamed from: a */
    public boolean mo54411a(boolean z, NetworkInfo networkInfo) {
        int i = this.f54046r;
        if (!(i > 0)) {
            return false;
        }
        this.f54046r = i - 1;
        return this.f54038j.mo54483a(z, networkInfo);
    }

    /* renamed from: a */
    public static void m51322a(C21525cl clVar) {
        String c = clVar.mo54514c();
        StringBuilder sb = f54026u.get();
        sb.ensureCapacity(c.length() + 8);
        sb.replace(8, sb.length(), c);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: a */
    public static C21479br m51321a(C21512ci ciVar, C21491bx bxVar, C21486bs bsVar, C21532cp cpVar, C21476bp bpVar) {
        C21525cl b = bpVar.mo54397b();
        List<C21529cn> a = ciVar.mo54488a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C21529cn cnVar = a.get(i);
            if (cnVar.mo54408a(b)) {
                return new C21479br(ciVar, bxVar, bsVar, cpVar, bpVar, cnVar);
            }
        }
        return new C21479br(ciVar, bxVar, bsVar, cpVar, bpVar, f54028w);
    }

    /* renamed from: a */
    public static Bitmap m51320a(List<C21536cr> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final C21536cr crVar = list.get(i);
            try {
                Bitmap a = crVar.mo54549a(bitmap);
                if (a == null) {
                    final StringBuilder k = C13555b.m33972k("Transformation ");
                    k.append(crVar.mo54550a());
                    k.append(" returned null after ");
                    k.append(i);
                    k.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C21536cr a2 : list) {
                        k.append(a2.mo54550a());
                        k.append(10);
                    }
                    C21512ci.f54109a.post(new Runnable() {
                        public void run() {
                            throw new NullPointerException(k.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C21512ci.f54109a.post(new Runnable() {
                        public void run() {
                            StringBuilder k = C13555b.m33972k("Transformation ");
                            k.append(crVar.mo54550a());
                            k.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(k.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C21512ci.f54109a.post(new Runnable() {
                        public void run() {
                            StringBuilder k = C13555b.m33972k("Transformation ");
                            k.append(crVar.mo54550a());
                            k.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(k.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                C21512ci.f54109a.post(new Runnable() {
                    public void run() {
                        StringBuilder k = C13555b.m33972k("Transformation ");
                        k.append(crVar.mo54550a());
                        k.append(" crashed with exception.");
                        throw new RuntimeException(k.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0262  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m51319a(com.veriff.sdk.internal.C21525cl r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            int r1 = r27.getWidth()
            int r2 = r27.getHeight()
            boolean r3 = r0.f54162m
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            boolean r4 = r26.mo54517f()
            if (r4 != 0) goto L_0x001f
            if (r28 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r3 = r1
            r5 = r2
            r0 = r9
            goto L_0x024e
        L_0x001f:
            int r4 = r0.f54157h
            int r6 = r0.f54158i
            float r7 = r0.f54163n
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0141
            double r10 = (double) r7
            double r12 = java.lang.Math.toRadians(r10)
            double r12 = java.lang.Math.cos(r12)
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.sin(r10)
            boolean r4 = r0.f54166q
            if (r4 == 0) goto L_0x00d3
            float r4 = r0.f54164o
            float r6 = r0.f54165p
            r9.setRotate(r7, r4, r6)
            float r4 = r0.f54164o
            double r6 = (double) r4
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 - r12
            double r6 = r6 * r14
            float r8 = r0.f54165p
            r16 = r2
            r17 = r3
            double r2 = (double) r8
            double r2 = r2 * r10
            double r2 = r2 + r6
            double r6 = (double) r8
            double r6 = r6 * r14
            double r14 = (double) r4
            double r14 = r14 * r10
            double r6 = r6 - r14
            int r4 = r0.f54157h
            double r14 = (double) r4
            double r14 = r14 * r12
            double r14 = r14 + r2
            r18 = r9
            double r8 = (double) r4
            double r8 = r8 * r10
            double r8 = r8 + r6
            r20 = r6
            double r5 = (double) r4
            double r5 = r5 * r12
            double r5 = r5 + r2
            int r7 = r0.f54158i
            r22 = r1
            double r0 = (double) r7
            double r0 = r0 * r10
            double r5 = r5 - r0
            double r0 = (double) r4
            double r0 = r0 * r10
            double r0 = r0 + r20
            r23 = r8
            double r8 = (double) r7
            double r8 = r8 * r12
            double r8 = r8 + r0
            double r0 = (double) r7
            double r0 = r0 * r10
            double r0 = r2 - r0
            double r10 = (double) r7
            double r10 = r10 * r12
            double r10 = r10 + r20
            double r12 = java.lang.Math.max(r2, r14)
            double r12 = java.lang.Math.max(r5, r12)
            double r12 = java.lang.Math.max(r0, r12)
            double r2 = java.lang.Math.min(r2, r14)
            double r2 = java.lang.Math.min(r5, r2)
            double r0 = java.lang.Math.min(r0, r2)
            r6 = r20
            r2 = r23
            double r4 = java.lang.Math.max(r6, r2)
            double r4 = java.lang.Math.max(r8, r4)
            double r4 = java.lang.Math.max(r10, r4)
            double r2 = java.lang.Math.min(r6, r2)
            double r2 = java.lang.Math.min(r8, r2)
            double r2 = java.lang.Math.min(r10, r2)
            double r12 = r12 - r0
            double r0 = java.lang.Math.floor(r12)
            int r0 = (int) r0
            double r4 = r4 - r2
            double r1 = java.lang.Math.floor(r4)
            int r6 = (int) r1
            r4 = r0
            r0 = r18
            goto L_0x0148
        L_0x00d3:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
            r0.setRotate(r7)
            r1 = r26
            int r2 = r1.f54157h
            double r3 = (double) r2
            double r3 = r3 * r12
            double r5 = (double) r2
            double r5 = r5 * r10
            double r7 = (double) r2
            double r7 = r7 * r12
            int r9 = r1.f54158i
            double r14 = (double) r9
            double r14 = r14 * r10
            double r7 = r7 - r14
            double r14 = (double) r2
            double r14 = r14 * r10
            double r1 = (double) r9
            double r1 = r1 * r12
            double r1 = r1 + r14
            double r14 = (double) r9
            double r14 = r14 * r10
            double r10 = -r14
            double r14 = (double) r9
            double r14 = r14 * r12
            r12 = 0
            r20 = r14
            double r14 = java.lang.Math.max(r12, r3)
            double r14 = java.lang.Math.max(r7, r14)
            double r14 = java.lang.Math.max(r10, r14)
            double r3 = java.lang.Math.min(r12, r3)
            double r3 = java.lang.Math.min(r7, r3)
            double r3 = java.lang.Math.min(r10, r3)
            double r7 = java.lang.Math.max(r12, r5)
            double r7 = java.lang.Math.max(r1, r7)
            r9 = r20
            double r7 = java.lang.Math.max(r9, r7)
            double r5 = java.lang.Math.min(r12, r5)
            double r1 = java.lang.Math.min(r1, r5)
            double r1 = java.lang.Math.min(r9, r1)
            double r14 = r14 - r3
            double r3 = java.lang.Math.floor(r14)
            int r4 = (int) r3
            double r7 = r7 - r1
            double r1 = java.lang.Math.floor(r7)
            int r6 = (int) r1
            goto L_0x0148
        L_0x0141:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
        L_0x0148:
            if (r28 == 0) goto L_0x016e
            int r1 = m51317a((int) r28)
            int r2 = m51324b((int) r28)
            if (r1 == 0) goto L_0x0165
            float r3 = (float) r1
            r0.preRotate(r3)
            r3 = 90
            if (r1 == r3) goto L_0x0160
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L_0x0165
        L_0x0160:
            r25 = r6
            r6 = r4
            r4 = r25
        L_0x0165:
            r1 = 1
            if (r2 == r1) goto L_0x016e
            float r1 = (float) r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r1, r2)
        L_0x016e:
            r1 = r26
            boolean r2 = r1.f54159j
            if (r2 == 0) goto L_0x0203
            if (r4 == 0) goto L_0x017e
            float r2 = (float) r4
            r3 = r22
            float r5 = (float) r3
            float r2 = r2 / r5
            r5 = r16
            goto L_0x0185
        L_0x017e:
            r3 = r22
            float r2 = (float) r6
            r5 = r16
            float r7 = (float) r5
            float r2 = r2 / r7
        L_0x0185:
            if (r6 == 0) goto L_0x018a
            float r7 = (float) r6
            float r8 = (float) r5
            goto L_0x018c
        L_0x018a:
            float r7 = (float) r4
            float r8 = (float) r3
        L_0x018c:
            float r7 = r7 / r8
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x01bc
            float r8 = (float) r5
            float r7 = r7 / r2
            float r7 = r7 * r8
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            int r1 = r1.f54160k
            r8 = r1 & 48
            r9 = 48
            if (r8 != r9) goto L_0x01a5
            r1 = 0
            goto L_0x01b1
        L_0x01a5:
            r8 = 80
            r1 = r1 & r8
            if (r1 != r8) goto L_0x01ad
            int r1 = r5 - r7
            goto L_0x01b1
        L_0x01ad:
            int r1 = r5 - r7
            int r1 = r1 / 2
        L_0x01b1:
            float r8 = (float) r6
            float r9 = (float) r7
            float r8 = r8 / r9
            r9 = r7
            r10 = r17
            r19 = 0
            r7 = r1
            r1 = r3
            goto L_0x01f4
        L_0x01bc:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x01eb
            float r8 = (float) r3
            float r2 = r2 / r7
            float r2 = r2 * r8
            double r8 = (double) r2
            double r8 = java.lang.Math.ceil(r8)
            int r2 = (int) r8
            int r1 = r1.f54160k
            r8 = r1 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01d3
            r1 = 0
            goto L_0x01de
        L_0x01d3:
            r8 = 5
            r1 = r1 & r8
            if (r1 != r8) goto L_0x01da
            int r1 = r3 - r2
            goto L_0x01de
        L_0x01da:
            int r1 = r3 - r2
            int r1 = r1 / 2
        L_0x01de:
            float r8 = (float) r4
            float r9 = (float) r2
            float r8 = r8 / r9
            r19 = r1
            r1 = r2
            r9 = r5
            r2 = r8
            r10 = r17
            r8 = r7
            r7 = 0
            goto L_0x01f4
        L_0x01eb:
            r1 = r3
            r9 = r5
            r2 = r7
            r8 = r2
            r10 = r17
            r7 = 0
            r19 = 0
        L_0x01f4:
            boolean r3 = m51323a((boolean) r10, (int) r3, (int) r5, (int) r4, (int) r6)
            if (r3 == 0) goto L_0x01fd
            r0.preScale(r2, r8)
        L_0x01fd:
            r6 = r7
            r8 = r9
            r5 = r19
            r7 = r1
            goto L_0x0252
        L_0x0203:
            r5 = r16
            r10 = r17
            r3 = r22
            boolean r1 = r1.f54161l
            if (r1 == 0) goto L_0x022d
            if (r4 == 0) goto L_0x0212
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x0214
        L_0x0212:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x0214:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x021a
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x021c
        L_0x021a:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x021c:
            float r2 = r2 / r7
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            r1 = r2
        L_0x0223:
            boolean r2 = m51323a((boolean) r10, (int) r3, (int) r5, (int) r4, (int) r6)
            if (r2 == 0) goto L_0x024e
            r0.preScale(r1, r1)
            goto L_0x024e
        L_0x022d:
            if (r4 != 0) goto L_0x0231
            if (r6 == 0) goto L_0x024e
        L_0x0231:
            if (r4 != r3) goto L_0x0235
            if (r6 == r5) goto L_0x024e
        L_0x0235:
            if (r4 == 0) goto L_0x023a
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x023c
        L_0x023a:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x023c:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x0242
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x0244
        L_0x0242:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x0244:
            float r2 = r2 / r7
            boolean r4 = m51323a((boolean) r10, (int) r3, (int) r5, (int) r4, (int) r6)
            if (r4 == 0) goto L_0x024e
            r0.preScale(r1, r2)
        L_0x024e:
            r7 = r3
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0252:
            r10 = 1
            r4 = r27
            r9 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            r1 = r27
            if (r0 == r1) goto L_0x0262
            r27.recycle()
            goto L_0x0263
        L_0x0262:
            r0 = r1
        L_0x0263:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21479br.m51319a(com.veriff.sdk.internal.cl, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
