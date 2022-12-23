package sa0;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.components.MapPos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ma0.C12895a;
import ma0.C12902c;
import ma0.C12906d;
import na0.C12925d;
import na0.C12932j;
import na0.C12936m;
import p066e0.C4436j0;
import p845um.C19958a;
import pa0.C12999b;
import ra0.C13054a;
import va0.C13188a;
import va0.C13189b;
import ya0.C13275b;
import ya0.C13281g;

/* renamed from: sa0.k */
public final class C13102k extends Thread {

    /* renamed from: A */
    public static AtomicInteger f32497A = new AtomicInteger(0);

    /* renamed from: B */
    public static final double f32498B = Math.sqrt(2.0d);

    /* renamed from: b */
    public C13103l f32499b;

    /* renamed from: c */
    public final ArrayList<Integer> f32500c = new ArrayList<>();

    /* renamed from: d */
    public C12902c f32501d;

    /* renamed from: e */
    public C12895a f32502e;

    /* renamed from: f */
    public C13189b f32503f;

    /* renamed from: g */
    public C12925d.C12926a f32504g;

    /* renamed from: h */
    public C12999b f32505h;

    /* renamed from: i */
    public C12932j f32506i;

    /* renamed from: j */
    public C13097f f32507j;

    /* renamed from: k */
    public volatile boolean f32508k;

    /* renamed from: l */
    public volatile boolean f32509l;

    /* renamed from: m */
    public volatile long f32510m = Long.MAX_VALUE;

    /* renamed from: n */
    public double[] f32511n;

    /* renamed from: o */
    public float[] f32512o;

    /* renamed from: p */
    public double[] f32513p;

    /* renamed from: q */
    public C4436j0 f32514q;

    /* renamed from: r */
    public C4436j0 f32515r;

    /* renamed from: s */
    public MapPos f32516s;

    /* renamed from: t */
    public MapPos f32517t;

    /* renamed from: u */
    public C12936m f32518u;

    /* renamed from: v */
    public float f32519v;

    /* renamed from: w */
    public int f32520w;

    /* renamed from: x */
    public float f32521x;

    /* renamed from: y */
    public final ArrayList f32522y = new ArrayList();

    /* renamed from: z */
    public final ArrayList f32523z = new ArrayList();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13102k(sa0.C13097f r3, na0.C12925d r4, sa0.C13103l r5) {
        /*
            r2 = this;
            java.lang.String r0 = "RasterCullThread-"
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = f32497A
            int r1 = r1.incrementAndGet()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f32500c = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.f32510m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f32522y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f32523z = r0
            r2.f32507j = r3
            r2.f32499b = r5
            ma0.c r3 = r4.f32004b
            r2.f32501d = r3
            ma0.a r3 = r4.f32005c
            r2.f32502e = r3
            va0.b r3 = r4.f32007e
            r2.f32503f = r3
            na0.d$a r3 = r4.f32003a
            r2.f32504g = r3
            pa0.b r3 = r4.f32009g
            r2.f32505h = r3
            na0.j r3 = r4.f32011i
            r2.f32506i = r3
            r3 = 1
            r2.setPriority(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13102k.<init>(sa0.f, na0.d, sa0.l):void");
    }

    /* renamed from: a */
    public final void mo39994a(int i) {
        synchronized (this) {
            if (this.f32508k) {
                this.f32510m = Math.min(this.f32510m, System.currentTimeMillis() + ((long) i));
                notify();
            }
        }
    }

    /* renamed from: b */
    public final void mo39995b() {
        this.f32514q = new C4436j0(this.f32512o, this.f32511n);
        if (!this.f32506i.f32034a) {
            this.f32515r = new C4436j0(this.f32512o, this.f32511n);
            return;
        }
        double h = (double) ((C13096e) this.f32507j).mo39971h(this.f32516s.f24177d);
        double f = (double) ((C13096e) this.f32507j).mo39969f(this.f32516s.f24177d);
        double d = h * ((double) this.f32506i.f32035b);
        double d2 = d * ((double) this.f32519v);
        MapPos mapPos = this.f32516s;
        double d3 = mapPos.f24175b;
        double d4 = d3;
        MapPos mapPos2 = this.f32517t;
        double d5 = f;
        double d6 = d3 + ((mapPos2.f24175b - d3) / 3.0d);
        double d7 = mapPos.f24176c;
        double d8 = ((mapPos2.f24176c - d7) / 3.0d) + d7;
        this.f32517t = new MapPos(d6, d8, mapPos2.f24177d);
        this.f32512o = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        double[] dArr = new double[16];
        double[] dArr2 = dArr;
        this.f32511n = dArr;
        double d9 = mapPos.f24177d;
        C12936m mVar = this.f32518u;
        C19958a.m47442r(dArr2, d4, d7, d9, d6, d8, mVar.f32066a, mVar.f32067b, mVar.f32068c);
        C19958a.m47434i(this.f32512o, -d2, d2, -d, d, h, d5);
        this.f32515r = new C4436j0(this.f32512o, this.f32511n);
    }

    /* renamed from: c */
    public final void mo39996c() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        long j;
        List list;
        C13054a aVar;
        Bitmap bitmap;
        this.f32503f.mo40065b();
        List<C13054a> e = this.f32505h.mo39888e();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < e.size(); i2++) {
            arrayList.add(new LinkedList());
        }
        Iterator it = this.f32522y.iterator();
        while (it.hasNext()) {
            C13098g gVar = (C13098g) it.next();
            Iterator<C13054a> it2 = e.iterator();
            int i3 = 0;
            while (true) {
                if (it2.hasNext()) {
                    C13054a next = it2.next();
                    if (next.f32171b) {
                        List list2 = (List) arrayList.get(i3);
                        long j2 = next.f32290g + gVar.f32023d;
                        int i4 = next.f32289f;
                        C12902c cVar = this.f32501d;
                        synchronized (cVar) {
                            C12902c.C12905c cVar2 = (C12902c.C12905c) cVar.f31927d.mo40145a(j2);
                            z = true;
                            if (cVar2 == null) {
                                cVar2 = (C12902c.C12905c) cVar.f31928e.mo40150d(j2);
                                if (cVar2 == null) {
                                    C12906d dVar = cVar.f31930g;
                                    synchronized (dVar) {
                                        if (dVar.f31939a == 0) {
                                            bitmap = null;
                                        } else {
                                            bitmap = (Bitmap) dVar.f31942d.mo40145a(j2);
                                        }
                                    }
                                    if (bitmap == null) {
                                        z2 = false;
                                    } else {
                                        cVar2 = cVar.mo39767a(j2, bitmap);
                                    }
                                } else {
                                    cVar.f31925b += cVar2.f31935d;
                                    cVar.f31927d.mo40146d(j2, cVar2);
                                }
                            }
                            cVar2.f31936e = cVar.f31926c;
                            z2 = true;
                        }
                        if (z2) {
                            list2.add(new C13054a.C13055a(gVar.f32481h, gVar.f32483j, gVar.f32482i, gVar.f32484k, j2, this.f32499b.f32528e));
                        } else {
                            long j3 = next.f32290g;
                            this.f32500c.clear();
                            int i5 = i4;
                            long j4 = j2;
                            if (this.f32501d.mo39769c(gVar.f32488o.f32023d + j3) == 0 || this.f32501d.mo39769c(gVar.f32489p.f32023d + j3) == 0 || this.f32501d.mo39769c(gVar.f32490q.f32023d + j3) == 0 || this.f32501d.mo39769c(gVar.f32491r.f32023d + j3) == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                mo39999f(gVar, j3, list2);
                                aVar = next;
                                list = list2;
                                i = i3;
                                j = j4;
                            } else {
                                long j5 = j3;
                                j = j4;
                                aVar = next;
                                list = list2;
                                i = i3;
                                z = mo40000g(gVar, gVar, 5, i5, j5, list) | mo39999f(gVar, j5, list);
                            }
                            if (!z) {
                                list.add(new C13054a.C13055a(gVar.f32481h, gVar.f32483j, gVar.f32482i, gVar.f32484k, j, this.f32499b.f32528e));
                            }
                            long j6 = j;
                            byte[] a = this.f32502e.mo39758a(j6);
                            if (a == null) {
                                if (!this.f32504g.mo39790a(j6)) {
                                    synchronized (aVar) {
                                        try {
                                            if (aVar.f32172c != null) {
                                                aVar.f32172c.f32007e.mo40066c(new C13188a(gVar, aVar, false), Integer.MAX_VALUE, (Object) null);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else if (!this.f32501d.mo39768b(j6, a)) {
                                this.f32502e.mo39759b(j6);
                            }
                            i3 = i + 1;
                        }
                    }
                    i3++;
                }
            }
        }
        Iterator it3 = this.f32522y.iterator();
        while (it3.hasNext()) {
            ((C13098g) it3.next()).f32492s = null;
        }
        int i6 = 0;
        for (C13054a next2 : e) {
            if (next2.f32171b) {
                List<C13054a.C13055a> list3 = (List) arrayList.get(i6);
                synchronized (next2) {
                    next2.f32294k = list3;
                    C12925d dVar2 = next2.f32172c;
                    if (dVar2 != null) {
                        dVar2.f32012j.mo39976m();
                    }
                }
            }
            i6++;
        }
    }

    /* renamed from: d */
    public final void mo39997d() {
        this.f32522y.clear();
        this.f32523z.clear();
        boolean z = this.f32506i.f32039f;
        mo39998e(new C13098g(0));
        if (z) {
            mo39998e(new C13098g(-1));
            mo39998e(new C13098g(1));
        }
        C13101j jVar = new C13101j();
        Collections.sort(this.f32522y, jVar);
        Collections.sort(this.f32523z, jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        if ((java.lang.Math.hypot(r7 - r4.f24175b, ((double) r1.f32480g) - r4.f24176c) * r2) < 1000000.0d) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00af, code lost:
        if (((((((double) r1.f32480g) * r4[7]) + (r7 * r4[3])) + r4[15]) * r2) < (f32498B * 1000000.0d)) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        r2 = false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39998e(sa0.C13098g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r1.f32022c
            r3 = 24
            if (r2 <= r3) goto L_0x000b
            return
        L_0x000b:
            e0.j0 r2 = r0.f32515r
            float r3 = r1.f32479f
            float r4 = r1.f32480g
            float r5 = r1.f32486m
            r6 = 0
            r7 = 0
        L_0x0015:
            r8 = 6
            r9 = 3
            r10 = 1
            if (r7 >= r8) goto L_0x003b
            java.lang.Object r8 = r2.f15501b
            double[][] r8 = (double[][]) r8
            r8 = r8[r7]
            r11 = r8[r6]
            double r13 = (double) r3
            double r11 = r11 * r13
            r13 = r8[r10]
            r15 = r7
            double r6 = (double) r4
            double r13 = r13 * r6
            double r13 = r13 + r11
            r6 = r8[r9]
            double r13 = r13 + r6
            float r6 = -r5
            double r6 = (double) r6
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0037
            r2 = 0
            goto L_0x003f
        L_0x0037:
            int r7 = r15 + 1
            r6 = 0
            goto L_0x0015
        L_0x003b:
            r2.getClass()
            r2 = 1
        L_0x003f:
            if (r2 != 0) goto L_0x0042
            return
        L_0x0042:
            e0.j0 r2 = r0.f32515r
            float r3 = r1.f32481h
            float r4 = r1.f32483j
            float r5 = r1.f32482i
            float r6 = r1.f32484k
            boolean r2 = r2.mo19963j(r3, r4, r5, r6)
            if (r2 != 0) goto L_0x0053
            return
        L_0x0053:
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r4 = r1.f32022c
            float r4 = (float) r4
            na0.j r5 = r0.f32506i
            float r5 = r5.f32045l
            float r4 = r4 - r5
            double r4 = (double) r4
            double r2 = java.lang.Math.pow(r2, r4)
            e0.j0 r4 = r0.f32514q
            float r5 = r1.f32481h
            float r6 = r1.f32483j
            float r7 = r1.f32482i
            float r8 = r1.f32484k
            boolean r4 = r4.mo19963j(r5, r6, r7, r8)
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r4 != 0) goto L_0x0090
            float r4 = r1.f32479f
            double r7 = (double) r4
            com.nutiteq.components.MapPos r4 = r0.f32516s
            double r11 = r4.f24175b
            double r7 = r7 - r11
            float r11 = r1.f32480g
            double r11 = (double) r11
            double r13 = r4.f24176c
            double r11 = r11 - r13
            double r7 = java.lang.Math.hypot(r7, r11)
            double r7 = r7 * r2
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b3
            goto L_0x00b1
        L_0x0090:
            float r4 = r1.f32479f
            double r7 = (double) r4
            double[] r4 = r0.f32513p
            r11 = r4[r9]
            double r7 = r7 * r11
            float r11 = r1.f32480g
            double r11 = (double) r11
            r13 = 7
            r13 = r4[r13]
            double r11 = r11 * r13
            double r11 = r11 + r7
            r7 = 15
            r7 = r4[r7]
            double r11 = r11 + r7
            double r11 = r11 * r2
            double r2 = f32498B
            double r2 = r2 * r5
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
        L_0x00b1:
            r2 = 1
            goto L_0x00b4
        L_0x00b3:
            r2 = 0
        L_0x00b4:
            sa0.g r3 = new sa0.g
            r4 = 0
            r3.<init>(r1, r4)
            r1.f32488o = r3
            sa0.g r3 = new sa0.g
            r3.<init>(r1, r10)
            r1.f32489p = r3
            sa0.g r3 = new sa0.g
            r4 = 2
            r3.<init>(r1, r4)
            r1.f32490q = r3
            sa0.g r3 = new sa0.g
            r3.<init>(r1, r9)
            r1.f32491r = r3
            if (r2 == 0) goto L_0x0114
            int r2 = r0.f32520w
            int r3 = r1.f32022c
            if (r2 <= r3) goto L_0x0114
            sa0.g r2 = r1.f32488o
            r0.mo39998e(r2)
            sa0.g r2 = r1.f32489p
            r0.mo39998e(r2)
            sa0.g r2 = r1.f32490q
            r0.mo39998e(r2)
            sa0.g r2 = r1.f32491r
            r0.mo39998e(r2)
            int r2 = r1.f32022c
            int r3 = r0.f32520w
            na0.j r4 = r0.f32506i
            int r4 = r4.f32048o
            int r3 = r3 - r4
            if (r2 != r3) goto L_0x012e
            java.util.ArrayList r2 = r0.f32523z
            float r3 = r1.f32479f
            double r3 = (double) r3
            com.nutiteq.components.MapPos r5 = r0.f32516s
            double r6 = r5.f24175b
            double r3 = r3 - r6
            float r6 = r1.f32480g
            double r6 = (double) r6
            double r8 = r5.f24176c
            double r6 = r6 - r8
            double r3 = java.lang.Math.hypot(r3, r6)
            float r3 = (float) r3
            r1.f32487n = r3
            r2.add(r1)
            goto L_0x012e
        L_0x0114:
            java.util.ArrayList r2 = r0.f32522y
            float r3 = r1.f32479f
            double r3 = (double) r3
            com.nutiteq.components.MapPos r5 = r0.f32516s
            double r6 = r5.f24175b
            double r3 = r3 - r6
            float r6 = r1.f32480g
            double r6 = (double) r6
            double r8 = r5.f24176c
            double r6 = r6 - r8
            double r3 = java.lang.Math.hypot(r3, r6)
            float r3 = (float) r3
            r1.f32487n = r3
            r2.add(r1)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13102k.mo39998e(sa0.g):void");
    }

    /* renamed from: f */
    public final boolean mo39999f(C13098g gVar, long j, List list) {
        int size = list.size();
        long j2 = j + gVar.f32488o.f32023d;
        if (this.f32501d.mo39769c(j2) != 0) {
            C13098g gVar2 = gVar.f32488o;
            list.add(new C13054a.C13055a(gVar2.f32481h, gVar2.f32483j, gVar2.f32482i, gVar2.f32484k, j2, this.f32499b.f32528e));
        }
        long j3 = j + gVar.f32489p.f32023d;
        if (this.f32501d.mo39769c(j3) != 0) {
            C13098g gVar3 = gVar.f32489p;
            list.add(new C13054a.C13055a(gVar3.f32481h, gVar3.f32483j, gVar3.f32482i, gVar3.f32484k, j3, this.f32499b.f32528e));
        }
        long j4 = j + gVar.f32490q.f32023d;
        if (this.f32501d.mo39769c(j4) != 0) {
            C13098g gVar4 = gVar.f32490q;
            list.add(new C13054a.C13055a(gVar4.f32481h, gVar4.f32483j, gVar4.f32482i, gVar4.f32484k, j4, this.f32499b.f32528e));
        }
        long j5 = j + gVar.f32491r.f32023d;
        if (this.f32501d.mo39769c(j5) != 0) {
            C13098g gVar5 = gVar.f32491r;
            list.add(new C13054a.C13055a(gVar5.f32481h, gVar5.f32483j, gVar5.f32482i, gVar5.f32484k, j5, this.f32499b.f32528e));
        }
        if (list.size() > size) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo40000g(C13098g gVar, C13098g gVar2, int i, int i2, long j, List<C13054a.C13055a> list) {
        C13103l lVar;
        C13103l lVar2;
        C13098g gVar3 = gVar;
        C13098g gVar4 = gVar2;
        int i3 = i;
        C13098g gVar5 = gVar4.f32492s;
        if (gVar5 == null || i3 <= 1) {
            return false;
        }
        long j2 = j + gVar5.f32023d;
        if (this.f32501d.mo39769c(j2) != 0) {
            C13103l lVar3 = this.f32499b;
            int i4 = gVar4.f32478e;
            if (i4 == 0) {
                lVar = lVar3.f32529f;
            } else if (i4 == 1) {
                lVar = lVar3.f32530g;
            } else if (i4 != 2) {
                lVar = lVar3.f32532i;
            } else {
                lVar = lVar3.f32531h;
            }
            for (int size = this.f32500c.size() - 1; size >= 0; size--) {
                int intValue = this.f32500c.get(size).intValue();
                if (intValue == 0) {
                    lVar2 = lVar.f32529f;
                } else if (intValue == 1) {
                    lVar2 = lVar.f32530g;
                } else if (intValue != 2) {
                    lVar2 = lVar.f32532i;
                } else {
                    lVar2 = lVar.f32531h;
                }
            }
            list.add(new C13054a.C13055a(gVar3.f32481h, gVar3.f32483j, gVar3.f32482i, gVar3.f32484k, j2, lVar.f32528e));
            return true;
        }
        this.f32500c.add(Integer.valueOf(gVar4.f32478e));
        return mo40000g(gVar, gVar5, i3 - 1, i2, j, list);
    }

    /* renamed from: h */
    public final void mo40001h() {
        C13096e eVar;
        C13096e eVar2;
        C13096e eVar3;
        ((C13096e) this.f32507j).mo39983q(true);
        try {
            eVar = (C13096e) this.f32507j;
            eVar.f32410E0.lock();
            double[] dArr = (double[]) eVar.f32451n.clone();
            eVar.f32410E0.unlock();
            this.f32511n = dArr;
            eVar2 = (C13096e) this.f32507j;
            eVar2.f32410E0.lock();
            float[] fArr = (float[]) eVar2.f32446k.clone();
            eVar2.f32410E0.unlock();
            this.f32512o = fArr;
            eVar3 = (C13096e) this.f32507j;
            eVar3.f32410E0.lock();
            double[] dArr2 = new double[16];
            C19958a.m47433h(0, dArr2, eVar3.f32446k);
            double[] dArr3 = new double[16];
            C19958a.m47438n(dArr3, 0, dArr2, 0, eVar3.f32451n);
            eVar3.f32410E0.unlock();
            this.f32513p = dArr3;
            this.f32516s = ((C13096e) this.f32507j).mo39967d();
            this.f32517t = ((C13096e) this.f32507j).mo39970g();
            this.f32518u = ((C13096e) this.f32507j).mo39972i();
            C13097f fVar = this.f32507j;
            float f = ((C13096e) fVar).f32471x;
            this.f32519v = ((C13096e) fVar).f32433U;
            this.f32521x = ((C13096e) fVar).f32429Q;
            ((C13096e) fVar).mo39983q(false);
            this.f32520w = (int) ((((float) Math.log(this.f32516s.f24177d / ((double) this.f32521x))) / C13275b.f32934a) + this.f32506i.f32045l + 0.001f);
        } catch (Throwable th) {
            ((C13096e) this.f32507j).mo39983q(false);
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo40002i() {
        try {
            join();
            this.f32507j = null;
            this.f32499b = null;
            this.f32501d = null;
            this.f32502e = null;
            this.f32503f = null;
            this.f32504g = null;
            this.f32505h = null;
            this.f32506i = null;
            this.f32522y.clear();
            this.f32523z.clear();
            this.f32511n = null;
            this.f32512o = null;
            this.f32513p = null;
            this.f32514q = null;
            this.f32515r = null;
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: j */
    public final void mo40003j() {
        boolean z;
        byte[] bArr;
        K k;
        List<C13054a> e = this.f32505h.mo39888e();
        Iterator it = this.f32523z.iterator();
        while (it.hasNext()) {
            C13098g gVar = (C13098g) it.next();
            Iterator<C13054a> it2 = e.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C13054a next = it2.next();
                    if (next.f32171b) {
                        long j = next.f32290g + gVar.f32023d;
                        if (this.f32501d.mo39769c(j) != 0) {
                            continue;
                        } else {
                            C12902c cVar = this.f32501d;
                            synchronized (cVar) {
                                Iterator it3 = cVar.f31929f.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((C12902c.C12905c) it3.next()).f31932a == j) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            if (z) {
                                continue;
                            } else {
                                C12895a aVar = this.f32502e;
                                synchronized (aVar) {
                                    if (aVar.f31909a == 0) {
                                        bArr = null;
                                    } else {
                                        C13281g.C13282a a = aVar.f31911c.f32949a.mo40149a(j);
                                        if (a != null) {
                                            k = a.f32956d;
                                        } else {
                                            k = null;
                                        }
                                        bArr = (byte[]) k;
                                    }
                                }
                                if (bArr == null && !this.f32504g.mo39790a(j)) {
                                    synchronized (next) {
                                        try {
                                            if (next.f32172c != null) {
                                                next.f32172c.f32007e.mo40066c(new C13188a(gVar, next, true), Integer.MAX_VALUE, (Object) null);
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|(1:21)|22|23|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
        L_0x0000:
            boolean r0 = r11.f32509l
            if (r0 != 0) goto L_0x005b
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r11)
            long r2 = r11.f32510m     // Catch:{ all -> 0x0058 }
            r4 = 1
            long r4 = r4 + r0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x001d
            r11.f32510m = r6     // Catch:{ all -> 0x0058 }
            r2 = r8
            goto L_0x001f
        L_0x001d:
            long r2 = r11.f32510m     // Catch:{ all -> 0x0058 }
        L_0x001f:
            monitor-exit(r11)     // Catch:{ all -> 0x0058 }
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x003c
            monitor-enter(r11)
            boolean r4 = r11.f32509l     // Catch:{ InterruptedException -> 0x0038 }
            if (r4 == 0) goto L_0x002b
            monitor-exit(r11)     // Catch:{ all -> 0x0036 }
            return
        L_0x002b:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            long r8 = r2 - r0
        L_0x0032:
            r11.wait(r8)     // Catch:{ InterruptedException -> 0x0038 }
            goto L_0x0038
        L_0x0036:
            r0 = move-exception
            goto L_0x003a
        L_0x0038:
            monitor-exit(r11)     // Catch:{ all -> 0x0036 }
            goto L_0x0000
        L_0x003a:
            monitor-exit(r11)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x003c:
            monitor-enter(r11)
            r11.mo40001h()     // Catch:{ all -> 0x0055 }
            r11.mo39995b()     // Catch:{ all -> 0x0055 }
            r11.mo39997d()     // Catch:{ all -> 0x0055 }
            r11.mo39996c()     // Catch:{ all -> 0x0055 }
            r11.mo40003j()     // Catch:{ all -> 0x0055 }
            sa0.f r0 = r11.f32507j     // Catch:{ all -> 0x0055 }
            sa0.e r0 = (sa0.C13096e) r0     // Catch:{ all -> 0x0055 }
            r0.mo39976m()     // Catch:{ all -> 0x0055 }
            monitor-exit(r11)
            goto L_0x0000
        L_0x0055:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0058:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C13102k.run():void");
    }

    public final void start() {
        super.start();
    }
}
