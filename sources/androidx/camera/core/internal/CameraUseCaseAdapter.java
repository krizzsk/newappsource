package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0612l;
import androidx.camera.core.C0631r;
import androidx.camera.core.CameraControl;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0574c;
import androidx.camera.core.impl.C0585i;
import androidx.camera.core.impl.C0586j;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import mf0.C24361g;
import p054d0.C4274c1;
import p054d0.C4279f;
import p054d0.C4289j0;
import p066e0.C4434j;
import p066e0.C4437k;
import p115i0.C5227c;
import p115i0.C5230f;
import p115i0.C5231g;
import p115i0.C5234j;
import p304x.C7090q;

public final class CameraUseCaseAdapter implements C4279f {

    /* renamed from: b */
    public CameraInternal f2068b;

    /* renamed from: c */
    public final C4437k f2069c;

    /* renamed from: d */
    public final UseCaseConfigFactory f2070d;

    /* renamed from: e */
    public final C0606a f2071e;

    /* renamed from: f */
    public final ArrayList f2072f = new ArrayList();

    /* renamed from: g */
    public C4274c1 f2073g;

    /* renamed from: h */
    public C0574c f2074h = C4434j.f15499a;

    /* renamed from: i */
    public final Object f2075i = new Object();

    /* renamed from: j */
    public boolean f2076j = true;

    /* renamed from: k */
    public Config f2077k = null;

    /* renamed from: l */
    public List<UseCase> f2078l = new ArrayList();

    public static final class CameraException extends Exception {
        public CameraException(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$a */
    public static final class C0606a {

        /* renamed from: a */
        public final ArrayList f2079a = new ArrayList();

        public C0606a(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f2079a.add(it.next().getCameraInfoInternal().f22138a);
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0606a) {
                return this.f2079a.equals(((C0606a) obj).f2079a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2079a.hashCode() * 53;
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$b */
    public static class C0607b {

        /* renamed from: a */
        public C0595r<?> f2080a;

        /* renamed from: b */
        public C0595r<?> f2081b;

        public C0607b(C0595r<?> rVar, C0595r<?> rVar2) {
            this.f2080a = rVar;
            this.f2081b = rVar2;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<CameraInternal> linkedHashSet, C4437k kVar, UseCaseConfigFactory useCaseConfigFactory) {
        this.f2068b = linkedHashSet.iterator().next();
        this.f2071e = new C0606a(new LinkedHashSet(linkedHashSet));
        this.f2069c = kVar;
        this.f2070d = useCaseConfigFactory;
    }

    /* renamed from: d */
    public static ArrayList m1739d(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        int intValue;
        Object obj3;
        Object obj4;
        boolean z3;
        Object obj5;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase instanceof C0631r) {
                z6 = true;
            } else if (useCase instanceof C0612l) {
                z5 = true;
            }
        }
        if (!z5 || z6) {
            z = false;
        } else {
            z = true;
        }
        Iterator it2 = arrayList.iterator();
        boolean z7 = false;
        boolean z8 = false;
        while (it2.hasNext()) {
            UseCase useCase2 = (UseCase) it2.next();
            if (useCase2 instanceof C0631r) {
                z7 = true;
            } else if (useCase2 instanceof C0612l) {
                z8 = true;
            }
        }
        if (!z7 || z8) {
            z2 = false;
        } else {
            z2 = true;
        }
        Iterator it3 = arrayList2.iterator();
        Object obj6 = null;
        UseCase useCase3 = null;
        UseCase useCase4 = null;
        while (it3.hasNext()) {
            UseCase useCase5 = (UseCase) it3.next();
            if (useCase5 instanceof C0631r) {
                useCase3 = useCase5;
            } else if (useCase5 instanceof C0612l) {
                useCase4 = useCase5;
            }
        }
        if (z && useCase3 == null) {
            C0631r.C0633b bVar = new C0631r.C0633b();
            bVar.f2173a.mo2503w(C5231g.f17323t, "Preview-Extra");
            C0631r a = bVar.mo2575a();
            a.mo2572B(new C5227c(0));
            arrayList3.add(a);
        } else if (!z && useCase3 != null) {
            arrayList3.remove(useCase3);
        }
        if (z2 && useCase4 == null) {
            C0612l.C0617e eVar = new C0612l.C0617e();
            eVar.f2132a.mo2503w(C5231g.f17323t, "ImageCapture-Extra");
            C0589m mVar = eVar.f2132a;
            C0572a aVar = C0587k.f2005f;
            mVar.getClass();
            try {
                obj = mVar.mo2422a(aVar);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                C0589m mVar2 = eVar.f2132a;
                C0572a aVar2 = C0587k.f2008i;
                mVar2.getClass();
                try {
                    obj5 = mVar2.mo2422a(aVar2);
                } catch (IllegalArgumentException unused2) {
                    obj5 = null;
                }
                if (obj5 != null) {
                    throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
                }
            }
            C0589m mVar3 = eVar.f2132a;
            C0572a aVar3 = C0585i.f1994C;
            mVar3.getClass();
            try {
                obj2 = mVar3.mo2422a(aVar3);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Integer num = (Integer) obj2;
            if (num != null) {
                C0589m mVar4 = eVar.f2132a;
                C0572a aVar4 = C0585i.f1993B;
                mVar4.getClass();
                try {
                    obj4 = mVar4.mo2422a(aVar4);
                } catch (IllegalArgumentException unused4) {
                    obj4 = null;
                }
                if (obj4 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C24361g.m61177o(z3, "Cannot set buffer format with CaptureProcessor defined.");
                eVar.f2132a.mo2503w(C0586j.f2004e, num);
            } else {
                C0589m mVar5 = eVar.f2132a;
                C0572a aVar5 = C0585i.f1993B;
                mVar5.getClass();
                try {
                    obj3 = mVar5.mo2422a(aVar5);
                } catch (IllegalArgumentException unused5) {
                    obj3 = null;
                }
                if (obj3 != null) {
                    eVar.f2132a.mo2503w(C0586j.f2004e, 35);
                } else {
                    eVar.f2132a.mo2503w(C0586j.f2004e, 256);
                }
            }
            C0612l lVar = new C0612l(new C0585i(C0590n.m1678s(eVar.f2132a)));
            C0589m mVar6 = eVar.f2132a;
            C0572a aVar6 = C0587k.f2008i;
            mVar6.getClass();
            try {
                obj6 = mVar6.mo2422a(aVar6);
            } catch (IllegalArgumentException unused6) {
            }
            Size size = (Size) obj6;
            if (size != null) {
                new Rational(size.getWidth(), size.getHeight());
            }
            C0589m mVar7 = eVar.f2132a;
            C0572a aVar7 = C0585i.f1995D;
            int i = 2;
            mVar7.getClass();
            try {
                i = mVar7.mo2422a(aVar7);
            } catch (IllegalArgumentException unused7) {
            }
            if (((Integer) i).intValue() >= 1) {
                z4 = true;
            }
            C24361g.m61177o(z4, "Maximum outstanding image count must be at least 1");
            C0589m mVar8 = eVar.f2132a;
            C0572a aVar8 = C5230f.f17322s;
            Object x0 = C14226d.m35357x0();
            mVar8.getClass();
            try {
                x0 = mVar8.mo2422a(aVar8);
            } catch (IllegalArgumentException unused8) {
            }
            C24361g.m61185s((Executor) x0, "The IO executor can't be null");
            C0589m mVar9 = eVar.f2132a;
            C0572a aVar9 = C0585i.f2002z;
            if (!mVar9.mo2425e(aVar9) || (intValue = ((Integer) eVar.f2132a.mo2422a(aVar9)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                arrayList3.add(lVar);
            } else {
                throw new IllegalArgumentException(C16759e.m42349e("The flash mode is not allowed to set: ", intValue));
            }
        } else if (!z2 && useCase4 != null) {
            arrayList3.remove(useCase4);
        }
        return arrayList3;
    }

    /* renamed from: e */
    public static Matrix m1740e(Rect rect, Size size) {
        boolean z;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        C24361g.m61177o(z, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: a */
    public final void mo2525a(Collection<UseCase> collection) throws CameraException {
        synchronized (this.f2075i) {
            ArrayList arrayList = new ArrayList();
            for (UseCase next : collection) {
                if (this.f2072f.contains(next)) {
                    C4289j0.m11435b("CameraUseCaseAdapter");
                } else {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f2072f);
            List<UseCase> emptyList = Collections.emptyList();
            ArrayList arrayList3 = Collections.emptyList();
            if (mo2531k()) {
                arrayList2.removeAll(this.f2078l);
                arrayList2.addAll(arrayList);
                emptyList = m1739d(arrayList2, new ArrayList(this.f2078l));
                ArrayList arrayList4 = new ArrayList(emptyList);
                arrayList4.removeAll(this.f2078l);
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(this.f2078l);
                arrayList5.removeAll(emptyList);
                arrayList3 = arrayList5;
            }
            C4434j.C4435a aVar = (C4434j.C4435a) this.f2074h;
            aVar.getClass();
            UseCaseConfigFactory useCaseConfigFactory = (UseCaseConfigFactory) ((C0590n) aVar.getConfig()).mo2423b(C0574c.f1956a, UseCaseConfigFactory.f1950a);
            UseCaseConfigFactory useCaseConfigFactory2 = this.f2070d;
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                hashMap.put(useCase, new C0607b(useCase.mo2369d(false, useCaseConfigFactory), useCase.mo2369d(true, useCaseConfigFactory2)));
            }
            try {
                ArrayList arrayList6 = new ArrayList(this.f2072f);
                arrayList6.removeAll(arrayList3);
                HashMap f = mo2527f(this.f2068b.getCameraInfoInternal(), arrayList, arrayList6, hashMap);
                mo2533m(f, (List) collection);
                this.f2078l = emptyList;
                mo2528h(arrayList3);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UseCase useCase2 = (UseCase) it2.next();
                    C0607b bVar = (C0607b) hashMap.get(useCase2);
                    useCase2.mo2380o(this.f2068b, bVar.f2080a, bVar.f2081b);
                    Size size = (Size) f.get(useCase2);
                    size.getClass();
                    useCase2.f1866g = useCase2.mo2387v(size);
                }
                this.f2072f.addAll(arrayList);
                if (this.f2076j) {
                    this.f2068b.attachUseCases(arrayList);
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((UseCase) it3.next()).mo2379n();
                }
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final void mo2526b() {
        synchronized (this.f2075i) {
            if (!this.f2076j) {
                this.f2068b.attachUseCases(this.f2072f);
                synchronized (this.f2075i) {
                    if (this.f2077k != null) {
                        this.f2068b.getCameraControlInternal().mo23327d(this.f2077k);
                    }
                }
                Iterator it = this.f2072f.iterator();
                while (it.hasNext()) {
                    ((UseCase) it.next()).mo2379n();
                }
                this.f2076j = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03b2, code lost:
        if (p304x.C7085o1.m16609h(java.lang.Math.max(0, r8 - 16), r12, r15) == false) goto L_0x03ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x03dd A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap mo2527f(p066e0.C4443m r23, java.util.ArrayList r24, java.util.ArrayList r25, java.util.HashMap r26) {
        /*
            r22 = this;
            r0 = r22
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = r23.getCameraId()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r4 = r25.iterator()
        L_0x0014:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0043
            java.lang.Object r5 = r4.next()
            androidx.camera.core.UseCase r5 = (androidx.camera.core.UseCase) r5
            e0.k r6 = r0.f2069c
            int r7 = r5.mo2370e()
            android.util.Size r8 = r5.f1866g
            x.o0 r6 = (p304x.C7083o0) r6
            java.util.HashMap r6 = r6.f22002a
            java.lang.Object r6 = r6.get(r2)
            x.o1 r6 = (p304x.C7085o1) r6
            if (r6 == 0) goto L_0x0039
            androidx.camera.core.impl.b r6 = r6.mo23323j(r7, r8)
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            r1.add(r6)
            android.util.Size r6 = r5.f1866g
            r3.put(r5, r6)
            goto L_0x0014
        L_0x0043:
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x0682
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r5 = r24.iterator()
        L_0x0052:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0074
            java.lang.Object r6 = r5.next()
            androidx.camera.core.UseCase r6 = (androidx.camera.core.UseCase) r6
            r7 = r26
            java.lang.Object r8 = r7.get(r6)
            androidx.camera.core.internal.CameraUseCaseAdapter$b r8 = (androidx.camera.core.internal.CameraUseCaseAdapter.C0607b) r8
            androidx.camera.core.impl.r<?> r9 = r8.f2080a
            androidx.camera.core.impl.r<?> r8 = r8.f2081b
            r10 = r23
            androidx.camera.core.impl.r r8 = r6.mo2375j(r10, r9, r8)
            r4.put(r8, r6)
            goto L_0x0052
        L_0x0074:
            e0.k r5 = r0.f2069c
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Set r7 = r4.keySet()
            r6.<init>(r7)
            x.o0 r5 = (p304x.C7083o0) r5
            r5.getClass()
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ 1
            java.lang.String r8 = "No new use cases to be bound."
            mf0.C24361g.m61177o(r7, r8)
            java.util.HashMap r5 = r5.f22002a
            java.lang.Object r5 = r5.get(r2)
            x.o1 r5 = (p304x.C7085o1) r5
            if (r5 == 0) goto L_0x0676
            x.d1 r2 = r5.f22026o
            android.util.Size r7 = r2.mo23299a()
            r2.f21899b = r7
            e0.d r2 = r5.f22024m
            if (r2 != 0) goto L_0x00a9
            r5.mo23320d()
            goto L_0x00bc
        L_0x00a9:
            x.d1 r2 = r5.f22026o
            android.util.Size r2 = r2.mo23301d()
            e0.d r7 = r5.f22024m
            android.util.Size r8 = r7.f15487a
            android.util.Size r7 = r7.f15489c
            e0.d r9 = new e0.d
            r9.<init>(r8, r2, r7)
            r5.f22024m = r9
        L_0x00bc:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r7 = r6.iterator()
        L_0x00c5:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.r r8 = (androidx.camera.core.impl.C0595r) r8
            int r8 = r8.getInputFormat()
            android.util.Size r9 = new android.util.Size
            r10 = 640(0x280, float:8.97E-43)
            r11 = 480(0x1e0, float:6.73E-43)
            r9.<init>(r10, r11)
            androidx.camera.core.impl.b r8 = r5.mo23323j(r8, r9)
            r2.add(r8)
            goto L_0x00c5
        L_0x00e6:
            boolean r2 = r5.mo23317a(r2)
            java.lang.String r7 = " New configs: "
            java.lang.String r8 = "No supported surface combination is found for camera device - Id : "
            if (r2 == 0) goto L_0x0651
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r6.iterator()
        L_0x00fe:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0120
            java.lang.Object r11 = r10.next()
            androidx.camera.core.impl.r r11 = (androidx.camera.core.impl.C0595r) r11
            int r11 = r11.mo2496o()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r12 = r9.contains(r12)
            if (r12 != 0) goto L_0x00fe
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.add(r11)
            goto L_0x00fe
        L_0x0120:
            java.util.Collections.sort(r9)
            java.util.Collections.reverse(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x012a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x015c
            java.lang.Object r10 = r9.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.util.Iterator r11 = r6.iterator()
        L_0x013e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x012a
            java.lang.Object r12 = r11.next()
            androidx.camera.core.impl.r r12 = (androidx.camera.core.impl.C0595r) r12
            int r13 = r12.mo2496o()
            if (r10 != r13) goto L_0x013e
            int r12 = r6.indexOf(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.add(r12)
            goto L_0x013e
        L_0x015c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x0165:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x04e2
            java.lang.Object r11 = r10.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r11 = r6.get(r11)
            androidx.camera.core.impl.r r11 = (androidx.camera.core.impl.C0595r) r11
            int r12 = r11.getInputFormat()
            r13 = r11
            androidx.camera.core.impl.k r13 = (androidx.camera.core.impl.C0587k) r13
            java.util.List r14 = r13.mo2486d()
            if (r14 == 0) goto L_0x01aa
            java.util.Iterator r14 = r14.iterator()
        L_0x018c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01aa
            java.lang.Object r15 = r14.next()
            android.util.Pair r15 = (android.util.Pair) r15
            java.lang.Object r0 = r15.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x01a7
            java.lang.Object r0 = r15.second
            android.util.Size[] r0 = (android.util.Size[]) r0
            goto L_0x01ab
        L_0x01a7:
            r0 = r22
            goto L_0x018c
        L_0x01aa:
            r0 = 0
        L_0x01ab:
            if (r0 == 0) goto L_0x01ba
            android.util.Size[] r0 = r5.mo23318b(r0, r12)
            f0.b r14 = new f0.b
            r15 = 1
            r14.<init>(r15)
            java.util.Arrays.sort(r0, r14)
        L_0x01ba:
            if (r0 != 0) goto L_0x01c0
            android.util.Size[] r0 = r5.mo23321e(r12)
        L_0x01c0:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            android.util.Size r15 = r13.mo2493k()
            android.util.Size[] r16 = r5.mo23321e(r12)
            r23 = r10
            java.util.List r10 = java.util.Arrays.asList(r16)
            r24 = r7
            f0.b r7 = new f0.b
            r25 = r8
            r8 = 0
            r7.<init>(r8)
            java.lang.Object r7 = java.util.Collections.max(r10, r7)
            android.util.Size r7 = (android.util.Size) r7
            if (r15 == 0) goto L_0x01ef
            int r8 = p304x.C7085o1.m16608f(r7)
            int r10 = p304x.C7085o1.m16608f(r15)
            if (r8 >= r10) goto L_0x01f0
        L_0x01ef:
            r15 = r7
        L_0x01f0:
            f0.b r7 = new f0.b
            r8 = 1
            r7.<init>(r8)
            java.util.Arrays.sort(r0, r7)
            android.util.Size r7 = r5.mo23322g(r13)
            android.util.Size r8 = p304x.C7085o1.f22004q
            int r10 = p304x.C7085o1.m16608f(r8)
            r26 = r8
            int r8 = p304x.C7085o1.m16608f(r15)
            if (r8 >= r10) goto L_0x020e
            android.util.Size r8 = p304x.C7085o1.f22005r
            goto L_0x021a
        L_0x020e:
            if (r7 == 0) goto L_0x0218
            int r8 = p304x.C7085o1.m16608f(r7)
            if (r8 >= r10) goto L_0x0218
            r8 = r7
            goto L_0x021a
        L_0x0218:
            r8 = r26
        L_0x021a:
            int r10 = r0.length
            r16 = 0
            r17 = r3
            r3 = 0
        L_0x0220:
            if (r3 >= r10) goto L_0x0250
            r16 = r10
            r10 = r0[r3]
            r26 = r0
            int r0 = p304x.C7085o1.m16608f(r10)
            r18 = r4
            int r4 = p304x.C7085o1.m16608f(r15)
            if (r0 > r4) goto L_0x0247
            int r0 = p304x.C7085o1.m16608f(r10)
            int r4 = p304x.C7085o1.m16608f(r8)
            if (r0 < r4) goto L_0x0247
            boolean r0 = r14.contains(r10)
            if (r0 != 0) goto L_0x0247
            r14.add(r10)
        L_0x0247:
            int r3 = r3 + 1
            r0 = r26
            r10 = r16
            r4 = r18
            goto L_0x0220
        L_0x0250:
            r18 = r4
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x04d6
            y.s r0 = r5.f22016e
            java.lang.Class<a0.v> r3 = p001a0.C0032v.class
            e0.i0 r3 = p001a0.C0022m.m93a(r3)
            a0.v r3 = (p001a0.C0032v) r3
            r4 = 2
            r8 = 3
            if (r3 == 0) goto L_0x0267
            goto L_0x0275
        L_0x0267:
            e0.j0 r0 = p389bl.C13641g.m34121i(r0)
            java.lang.Class<a0.c> r3 = p001a0.C0011c.class
            e0.i0 r0 = r0.mo19960g(r3)
            a0.c r0 = (p001a0.C0011c) r0
            if (r0 == 0) goto L_0x0277
        L_0x0275:
            r0 = 2
            goto L_0x0278
        L_0x0277:
            r0 = 3
        L_0x0278:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x02de
            r10 = 1
            if (r0 == r10) goto L_0x02d4
            if (r0 == r4) goto L_0x02c2
            if (r0 == r8) goto L_0x0284
            goto L_0x02c0
        L_0x0284:
            android.util.Size r0 = r5.mo23322g(r13)
            boolean r3 = r13.hasTargetAspectRatio()
            if (r3 == 0) goto L_0x02b0
            int r0 = r13.getTargetAspectRatio()
            if (r0 == 0) goto L_0x02a6
            if (r0 == r10) goto L_0x029c
            java.lang.String r0 = "SupportedSurfaceCombination"
            p054d0.C4289j0.m11435b(r0)
            goto L_0x02c0
        L_0x029c:
            boolean r0 = r5.f22020i
            if (r0 == 0) goto L_0x02a3
            android.util.Rational r0 = p304x.C7085o1.f22010w
            goto L_0x02e7
        L_0x02a3:
            android.util.Rational r0 = p304x.C7085o1.f22011x
            goto L_0x02e7
        L_0x02a6:
            boolean r0 = r5.f22020i
            if (r0 == 0) goto L_0x02ad
            android.util.Rational r0 = p304x.C7085o1.f22008u
            goto L_0x02e7
        L_0x02ad:
            android.util.Rational r0 = p304x.C7085o1.f22009v
            goto L_0x02e7
        L_0x02b0:
            if (r0 == 0) goto L_0x02c0
            android.util.Rational r3 = new android.util.Rational
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            r3.<init>(r4, r0)
            goto L_0x02e8
        L_0x02c0:
            r3 = 0
            goto L_0x02e8
        L_0x02c2:
            android.util.Size r0 = r5.mo23319c(r3)
            android.util.Rational r3 = new android.util.Rational
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            r3.<init>(r4, r0)
            goto L_0x02e8
        L_0x02d4:
            boolean r0 = r5.f22020i
            if (r0 == 0) goto L_0x02db
            android.util.Rational r0 = p304x.C7085o1.f22010w
            goto L_0x02e7
        L_0x02db:
            android.util.Rational r0 = p304x.C7085o1.f22011x
            goto L_0x02e7
        L_0x02de:
            boolean r0 = r5.f22020i
            if (r0 == 0) goto L_0x02e5
            android.util.Rational r0 = p304x.C7085o1.f22008u
            goto L_0x02e7
        L_0x02e5:
            android.util.Rational r0 = p304x.C7085o1.f22009v
        L_0x02e7:
            r3 = r0
        L_0x02e8:
            if (r7 != 0) goto L_0x02ee
            android.util.Size r7 = r13.mo2487g()
        L_0x02ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r3 != 0) goto L_0x0308
            r0.addAll(r14)
            if (r7 == 0) goto L_0x0302
            p304x.C7085o1.m16610i(r0, r7)
        L_0x0302:
            r20 = r2
            r19 = r6
            goto L_0x0475
        L_0x0308:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            android.util.Rational r8 = p304x.C7085o1.f22008u
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4.put(r8, r10)
            android.util.Rational r8 = p304x.C7085o1.f22010w
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4.put(r8, r10)
            java.util.Iterator r8 = r14.iterator()
        L_0x0325:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0410
            java.lang.Object r10 = r8.next()
            android.util.Size r10 = (android.util.Size) r10
            java.util.Set r12 = r4.keySet()
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        L_0x033a:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x03e7
            java.lang.Object r14 = r12.next()
            android.util.Rational r14 = (android.util.Rational) r14
            if (r14 != 0) goto L_0x0352
            r20 = r2
            r19 = r6
            r26 = r8
            r16 = r12
            goto L_0x03ca
        L_0x0352:
            android.util.Rational r15 = new android.util.Rational
            r26 = r8
            int r8 = r10.getWidth()
            r16 = r12
            int r12 = r10.getHeight()
            r15.<init>(r8, r12)
            boolean r8 = r14.equals(r15)
            if (r8 == 0) goto L_0x036e
            r20 = r2
            r19 = r6
            goto L_0x03b4
        L_0x036e:
            int r8 = p304x.C7085o1.m16608f(r10)
            android.util.Size r12 = p304x.C7085o1.f22004q
            int r12 = p304x.C7085o1.m16608f(r12)
            if (r8 < r12) goto L_0x03c6
            int r8 = r10.getWidth()
            int r12 = r10.getHeight()
            android.util.Rational r15 = new android.util.Rational
            r19 = r6
            int r6 = r14.getDenominator()
            r20 = r2
            int r2 = r14.getNumerator()
            r15.<init>(r6, r2)
            int r2 = r8 % 16
            if (r2 != 0) goto L_0x03b6
            int r6 = r12 % 16
            if (r6 != 0) goto L_0x03b6
            int r2 = r12 + -16
            r6 = 0
            int r2 = java.lang.Math.max(r6, r2)
            boolean r2 = p304x.C7085o1.m16609h(r2, r8, r14)
            if (r2 != 0) goto L_0x03b4
            int r8 = r8 + -16
            int r2 = java.lang.Math.max(r6, r8)
            boolean r2 = p304x.C7085o1.m16609h(r2, r12, r15)
            if (r2 == 0) goto L_0x03ca
        L_0x03b4:
            r2 = 1
            goto L_0x03cb
        L_0x03b6:
            if (r2 != 0) goto L_0x03bd
            boolean r2 = p304x.C7085o1.m16609h(r12, r8, r14)
            goto L_0x03cb
        L_0x03bd:
            int r2 = r12 % 16
            if (r2 != 0) goto L_0x03ca
            boolean r2 = p304x.C7085o1.m16609h(r8, r12, r15)
            goto L_0x03cb
        L_0x03c6:
            r20 = r2
            r19 = r6
        L_0x03ca:
            r2 = 0
        L_0x03cb:
            if (r2 == 0) goto L_0x03dd
            java.lang.Object r2 = r4.get(r14)
            java.util.List r2 = (java.util.List) r2
            boolean r6 = r2.contains(r10)
            if (r6 != 0) goto L_0x03dc
            r2.add(r10)
        L_0x03dc:
            r13 = r14
        L_0x03dd:
            r8 = r26
            r12 = r16
            r6 = r19
            r2 = r20
            goto L_0x033a
        L_0x03e7:
            r20 = r2
            r19 = r6
            r26 = r8
            if (r13 != 0) goto L_0x0408
            android.util.Rational r2 = new android.util.Rational
            int r6 = r10.getWidth()
            int r8 = r10.getHeight()
            r2.<init>(r6, r8)
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Set r8 = java.util.Collections.singleton(r10)
            r6.<init>(r8)
            r4.put(r2, r6)
        L_0x0408:
            r8 = r26
            r6 = r19
            r2 = r20
            goto L_0x0325
        L_0x0410:
            r20 = r2
            r19 = r6
            if (r7 == 0) goto L_0x0434
            java.util.Set r2 = r4.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x041e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0434
            java.lang.Object r6 = r2.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r6 = r4.get(r6)
            java.util.List r6 = (java.util.List) r6
            p304x.C7085o1.m16610i(r6, r7)
            goto L_0x041e
        L_0x0434:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r6 = r4.keySet()
            r2.<init>(r6)
            x.o1$a r6 = new x.o1$a
            r6.<init>(r3)
            java.util.Collections.sort(r2, r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0449:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0475
            java.lang.Object r3 = r2.next()
            android.util.Rational r3 = (android.util.Rational) r3
            java.lang.Object r3 = r4.get(r3)
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x045f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0449
            java.lang.Object r6 = r3.next()
            android.util.Size r6 = (android.util.Size) r6
            boolean r7 = r0.contains(r6)
            if (r7 != 0) goto L_0x045f
            r0.add(r6)
            goto L_0x045f
        L_0x0475:
            b0.i r2 = r5.f22027p
            int r3 = r11.getInputFormat()
            r4 = 35
            if (r3 != r4) goto L_0x0482
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            goto L_0x0492
        L_0x0482:
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L_0x0489
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            goto L_0x0492
        L_0x0489:
            r4 = 32
            if (r3 != r4) goto L_0x0490
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            goto L_0x0492
        L_0x0490:
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
        L_0x0492:
            a0.o r2 = r2.f5281a
            if (r2 != 0) goto L_0x0497
            goto L_0x04c1
        L_0x0497:
            android.util.Size r2 = p001a0.C0024o.m94a(r3)
            if (r2 != 0) goto L_0x049e
            goto L_0x04c1
        L_0x049e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x04aa:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x04c0
            java.lang.Object r4 = r0.next()
            android.util.Size r4 = (android.util.Size) r4
            boolean r6 = r4.equals(r2)
            if (r6 != 0) goto L_0x04aa
            r3.add(r4)
            goto L_0x04aa
        L_0x04c0:
            r0 = r3
        L_0x04c1:
            r9.add(r0)
            r0 = r22
            r10 = r23
            r7 = r24
            r8 = r25
            r3 = r17
            r4 = r18
            r6 = r19
            r2 = r20
            goto L_0x0165
        L_0x04d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can not get supported output size under supported maximum for the format: "
            java.lang.String r1 = p379.C16759e.m42349e(r1, r12)
            r0.<init>(r1)
            throw r0
        L_0x04e2:
            r20 = r2
            r17 = r3
            r18 = r4
            r19 = r6
            r24 = r7
            r25 = r8
            java.util.Iterator r0 = r9.iterator()
            r2 = 1
        L_0x04f3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0506
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r2 = r2 * r3
            goto L_0x04f3
        L_0x0506:
            if (r2 == 0) goto L_0x0649
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
        L_0x050e:
            if (r3 >= r2) goto L_0x051b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x050e
        L_0x051b:
            r3 = 0
            java.lang.Object r3 = r9.get(r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r3 = r2 / r3
            r4 = 0
            r6 = r2
        L_0x052a:
            int r7 = r9.size()
            if (r4 >= r7) goto L_0x056c
            java.lang.Object r7 = r9.get(r4)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
        L_0x0537:
            if (r8 >= r2) goto L_0x054e
            java.lang.Object r10 = r0.get(r8)
            java.util.List r10 = (java.util.List) r10
            int r11 = r8 % r6
            int r11 = r11 / r3
            java.lang.Object r11 = r7.get(r11)
            android.util.Size r11 = (android.util.Size) r11
            r10.add(r11)
            int r8 = r8 + 1
            goto L_0x0537
        L_0x054e:
            int r7 = r9.size()
            int r7 = r7 + -1
            if (r4 >= r7) goto L_0x0569
            int r6 = r4 + 1
            java.lang.Object r6 = r9.get(r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int r6 = r3 / r6
            r21 = r6
            r6 = r3
            r3 = r21
        L_0x0569:
            int r4 = r4 + 1
            goto L_0x052a
        L_0x056c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0570:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05ea
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r4 = 0
        L_0x0582:
            int r6 = r2.size()
            if (r4 >= r6) goto L_0x05b0
            java.lang.Object r6 = r2.get(r4)
            android.util.Size r6 = (android.util.Size) r6
            r7 = r20
            java.lang.Object r8 = r7.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r19
            java.lang.Object r8 = r9.get(r8)
            androidx.camera.core.impl.r r8 = (androidx.camera.core.impl.C0595r) r8
            int r8 = r8.getInputFormat()
            androidx.camera.core.impl.b r6 = r5.mo23323j(r8, r6)
            r3.add(r6)
            int r4 = r4 + 1
            goto L_0x0582
        L_0x05b0:
            r9 = r19
            r7 = r20
            boolean r3 = r5.mo23317a(r3)
            if (r3 == 0) goto L_0x05e5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r3 = r9.iterator()
        L_0x05c3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x05ed
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.r r4 = (androidx.camera.core.impl.C0595r) r4
            int r6 = r9.indexOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = r7.indexOf(r6)
            java.lang.Object r6 = r2.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            r0.put(r4, r6)
            goto L_0x05c3
        L_0x05e5:
            r20 = r7
            r19 = r9
            goto L_0x0570
        L_0x05ea:
            r9 = r19
            r0 = 0
        L_0x05ed:
            if (r0 == 0) goto L_0x061c
            java.util.Set r1 = r18.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05f7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0619
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.camera.core.UseCase r3 = (androidx.camera.core.UseCase) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r0.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            r4 = r17
            r4.put(r3, r2)
            goto L_0x05f7
        L_0x0619:
            r4 = r17
            goto L_0x0683
        L_0x061c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r25)
            java.lang.String r3 = r5.f22014c
            r2.append(r3)
            java.lang.String r3 = " and Hardware level: "
            r2.append(r3)
            int r3 = r5.f22019h
            r2.append(r3)
            java.lang.String r3 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r2.append(r3)
            r2.append(r1)
            r3 = r24
            r2.append(r3)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0649:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find supported resolutions."
            r0.<init>(r1)
            throw r0
        L_0x0651:
            r9 = r6
            r3 = r7
            r25 = r8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r25)
            java.lang.String r4 = r5.f22014c
            r2.append(r4)
            java.lang.String r4 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0676:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No such camera id in supported combination list: "
            java.lang.String r1 = p379.C25541a.m63881k(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0682:
            r4 = r3
        L_0x0683:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.mo2527f(e0.m, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):java.util.HashMap");
    }

    public final CameraControl getCameraControl() {
        return this.f2068b.getCameraControlInternal();
    }

    /* renamed from: h */
    public final void mo2528h(List<UseCase> list) {
        synchronized (this.f2075i) {
            if (!list.isEmpty()) {
                this.f2068b.detachUseCases(list);
                for (UseCase next : list) {
                    if (this.f2072f.contains(next)) {
                        next.mo2383r(this.f2068b);
                    } else {
                        Objects.toString(next);
                        C4289j0.m11435b("CameraUseCaseAdapter");
                    }
                }
                this.f2072f.removeAll(list);
            }
        }
    }

    /* renamed from: i */
    public final void mo2529i() {
        synchronized (this.f2075i) {
            if (this.f2076j) {
                this.f2068b.detachUseCases(new ArrayList(this.f2072f));
                synchronized (this.f2075i) {
                    C7090q cameraControlInternal = this.f2068b.getCameraControlInternal();
                    this.f2077k = cameraControlInternal.mo23331h();
                    cameraControlInternal.mo23328e();
                }
                this.f2076j = false;
            }
        }
    }

    /* renamed from: j */
    public final List<UseCase> mo2530j() {
        ArrayList arrayList;
        synchronized (this.f2075i) {
            arrayList = new ArrayList(this.f2072f);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final boolean mo2531k() {
        boolean z;
        synchronized (this.f2075i) {
            C4434j.C4435a aVar = (C4434j.C4435a) this.f2074h;
            aVar.getClass();
            z = false;
            if (((Integer) ((C0590n) aVar.getConfig()).mo2423b(C0574c.f1957b, 0)).intValue() == 1) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2532l(java.util.Collection<androidx.camera.core.UseCase> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2075i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0028 }
            r1.<init>(r3)     // Catch:{ all -> 0x0028 }
            r2.mo2528h(r1)     // Catch:{ all -> 0x0028 }
            boolean r1 = r2.mo2531k()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            java.util.List<androidx.camera.core.UseCase> r1 = r2.f2078l     // Catch:{ all -> 0x0028 }
            r1.removeAll(r3)     // Catch:{ all -> 0x0028 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ CameraException -> 0x001e }
            r2.mo2525a(r3)     // Catch:{ CameraException -> 0x001e }
            goto L_0x0026
        L_0x001e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Failed to add extra fake Preview or ImageCapture use case!"
            r3.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.mo2532l(java.util.Collection):void");
    }

    /* renamed from: m */
    public final void mo2533m(HashMap hashMap, List list) {
        boolean z;
        synchronized (this.f2075i) {
            if (this.f2073g != null) {
                if (this.f2068b.getCameraInfoInternal().getLensFacing().intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Rect i = this.f2068b.getCameraControlInternal().mo23332i();
                Rational rational = this.f2073g.f15192b;
                int sensorRotationDegrees = this.f2068b.getCameraInfoInternal().getSensorRotationDegrees(this.f2073g.f15193c);
                C4274c1 c1Var = this.f2073g;
                HashMap a = C5234j.m13246a(i, z, rational, sensorRotationDegrees, c1Var.f15191a, c1Var.f15194d, hashMap);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UseCase useCase = (UseCase) it.next();
                    Rect rect = (Rect) a.get(useCase);
                    rect.getClass();
                    useCase.mo2389x(rect);
                    useCase.mo2388w(m1740e(this.f2068b.getCameraControlInternal().mo23332i(), (Size) hashMap.get(useCase)));
                }
            }
        }
    }
}
