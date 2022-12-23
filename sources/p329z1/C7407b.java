package p329z1;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p329z1.C7401a;
import p329z1.C7407b;
import p718pc.C18900h;

/* renamed from: z1.b */
public abstract class C7407b<T extends C7407b<T>> implements C7401a.C7403b {

    /* renamed from: l */
    public static final C7409b f22782l = new C7409b();

    /* renamed from: m */
    public static final C7410c f22783m = new C7410c();

    /* renamed from: n */
    public static final C7411d f22784n = new C7411d();

    /* renamed from: o */
    public static final C7412e f22785o = new C7412e();

    /* renamed from: p */
    public static final C7413f f22786p = new C7413f();

    /* renamed from: q */
    public static final C7408a f22787q = new C7408a();

    /* renamed from: a */
    public float f22788a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    public float f22789b = Float.MAX_VALUE;

    /* renamed from: c */
    public boolean f22790c = false;

    /* renamed from: d */
    public final Object f22791d;

    /* renamed from: e */
    public final C7418c f22792e;

    /* renamed from: f */
    public boolean f22793f = false;

    /* renamed from: g */
    public float f22794g = -3.4028235E38f;

    /* renamed from: h */
    public long f22795h = 0;

    /* renamed from: i */
    public float f22796i;

    /* renamed from: j */
    public final ArrayList<C7415h> f22797j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<C7416i> f22798k = new ArrayList<>();

    /* renamed from: z1.b$a */
    public static class C7408a extends C7417j {
        public C7408a() {
            super("alpha");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((View) obj).getAlpha();
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* renamed from: z1.b$b */
    public static class C7409b extends C7417j {
        public C7409b() {
            super("scaleX");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((View) obj).getScaleX();
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* renamed from: z1.b$c */
    public static class C7410c extends C7417j {
        public C7410c() {
            super("scaleY");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((View) obj).getScaleY();
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* renamed from: z1.b$d */
    public static class C7411d extends C7417j {
        public C7411d() {
            super("rotation");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((View) obj).getRotation();
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* renamed from: z1.b$e */
    public static class C7412e extends C7417j {
        public C7412e() {
            super("rotationX");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((View) obj).getRotationX();
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* renamed from: z1.b$f */
    public static class C7413f extends C7417j {
        public C7413f() {
            super("rotationY");
        }

        /* renamed from: a */
        public final float mo23637a(Object obj) {
            return ((View) obj).getRotationY();
        }

        /* renamed from: b */
        public final void mo23638b(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* renamed from: z1.b$g */
    public static class C7414g {

        /* renamed from: a */
        public float f22799a;

        /* renamed from: b */
        public float f22800b;
    }

    /* renamed from: z1.b$h */
    public interface C7415h {
        /* renamed from: a */
        void mo23639a();
    }

    /* renamed from: z1.b$i */
    public interface C7416i {
        /* renamed from: a */
        void mo23640a();
    }

    /* renamed from: z1.b$j */
    public static abstract class C7417j extends C7418c {
        public C7417j(String str) {
            super(str);
        }
    }

    public C7407b(Object obj) {
        C18900h.C18901a aVar = C18900h.f48107r;
        this.f22791d = obj;
        this.f22792e = aVar;
        if (aVar == f22784n || aVar == f22785o || aVar == f22786p) {
            this.f22796i = 0.1f;
        } else if (aVar == f22787q) {
            this.f22796i = 0.00390625f;
        } else if (aVar == f22782l || aVar == f22783m) {
            this.f22796i = 0.00390625f;
        } else {
            this.f22796i = 1.0f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23634a(long r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            long r3 = r0.f22795h
            r5 = 0
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0015
            r0.f22795h = r1
            float r1 = r0.f22789b
            r0.mo23636b(r1)
            return r5
        L_0x0015:
            long r13 = r1 - r3
            r0.f22795h = r1
            r1 = r0
            z1.d r1 = (p329z1.C7419d) r1
            boolean r2 = r1.f22804t
            r3 = 0
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r15 = 1
            if (r2 == 0) goto L_0x003f
            float r2 = r1.f22803s
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0032
            z1.e r8 = r1.f22802r
            double r9 = (double) r2
            r8.f22813i = r9
            r1.f22803s = r4
        L_0x0032:
            z1.e r2 = r1.f22802r
            double r8 = r2.f22813i
            float r2 = (float) r8
            r1.f22789b = r2
            r1.f22788a = r3
            r1.f22804t = r5
            goto L_0x00d4
        L_0x003f:
            float r2 = r1.f22803s
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            z1.e r2 = r1.f22802r
            double r8 = r2.f22813i
            float r8 = r1.f22789b
            double r8 = (double) r8
            float r10 = r1.f22788a
            double r10 = (double) r10
            r16 = 2
            long r23 = r13 / r16
            r16 = r2
            r17 = r8
            r19 = r10
            r21 = r23
            z1.b$g r2 = r16.mo23642a(r17, r19, r21)
            z1.e r8 = r1.f22802r
            float r9 = r1.f22803s
            double r9 = (double) r9
            r8.f22813i = r9
            r1.f22803s = r4
            float r9 = r2.f22799a
            double r9 = (double) r9
            float r2 = r2.f22800b
            double r11 = (double) r2
            r18 = r8
            r19 = r9
            r21 = r11
            z1.b$g r2 = r18.mo23642a(r19, r21, r23)
            float r8 = r2.f22799a
            r1.f22789b = r8
            float r2 = r2.f22800b
            r1.f22788a = r2
            goto L_0x0095
        L_0x0081:
            z1.e r8 = r1.f22802r
            float r2 = r1.f22789b
            double r9 = (double) r2
            float r2 = r1.f22788a
            double r11 = (double) r2
            z1.b$g r2 = r8.mo23642a(r9, r11, r13)
            float r8 = r2.f22799a
            r1.f22789b = r8
            float r2 = r2.f22800b
            r1.f22788a = r2
        L_0x0095:
            float r2 = r1.f22789b
            float r8 = r1.f22794g
            float r2 = java.lang.Math.max(r2, r8)
            r1.f22789b = r2
            float r2 = java.lang.Math.min(r2, r4)
            r1.f22789b = r2
            float r8 = r1.f22788a
            z1.e r9 = r1.f22802r
            r9.getClass()
            float r8 = java.lang.Math.abs(r8)
            double r10 = (double) r8
            double r12 = r9.f22809e
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c8
            double r10 = r9.f22813i
            float r8 = (float) r10
            float r2 = r2 - r8
            float r2 = java.lang.Math.abs(r2)
            double r10 = (double) r2
            double r8 = r9.f22808d
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c8
            r2 = 1
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            if (r2 == 0) goto L_0x00d6
            z1.e r2 = r1.f22802r
            double r8 = r2.f22813i
            float r2 = (float) r8
            r1.f22789b = r2
            r1.f22788a = r3
        L_0x00d4:
            r1 = 1
            goto L_0x00d7
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            float r2 = r0.f22789b
            float r2 = java.lang.Math.min(r2, r4)
            r0.f22789b = r2
            float r3 = r0.f22794g
            float r2 = java.lang.Math.max(r2, r3)
            r0.f22789b = r2
            r0.mo23636b(r2)
            if (r1 == 0) goto L_0x014f
            r0.f22793f = r5
            java.lang.ThreadLocal<z1.a> r2 = p329z1.C7401a.f22770g
            java.lang.Object r3 = r2.get()
            if (r3 != 0) goto L_0x00fe
            z1.a r3 = new z1.a
            r3.<init>()
            r2.set(r3)
        L_0x00fe:
            java.lang.Object r2 = r2.get()
            z1.a r2 = (p329z1.C7401a) r2
            s0.h<z1.a$b, java.lang.Long> r3 = r2.f22771a
            r3.remove(r0)
            java.util.ArrayList<z1.a$b> r3 = r2.f22772b
            int r3 = r3.indexOf(r0)
            if (r3 < 0) goto L_0x0119
            java.util.ArrayList<z1.a$b> r4 = r2.f22772b
            r8 = 0
            r4.set(r3, r8)
            r2.f22776f = r15
        L_0x0119:
            r0.f22795h = r6
            r0.f22790c = r5
        L_0x011d:
            java.util.ArrayList<z1.b$h> r2 = r0.f22797j
            int r2 = r2.size()
            if (r5 >= r2) goto L_0x013b
            java.util.ArrayList<z1.b$h> r2 = r0.f22797j
            java.lang.Object r2 = r2.get(r5)
            if (r2 == 0) goto L_0x0138
            java.util.ArrayList<z1.b$h> r2 = r0.f22797j
            java.lang.Object r2 = r2.get(r5)
            z1.b$h r2 = (p329z1.C7407b.C7415h) r2
            r2.mo23639a()
        L_0x0138:
            int r5 = r5 + 1
            goto L_0x011d
        L_0x013b:
            java.util.ArrayList<z1.b$h> r2 = r0.f22797j
            int r3 = r2.size()
        L_0x0141:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x014f
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x0141
            r2.remove(r3)
            goto L_0x0141
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p329z1.C7407b.mo23634a(long):boolean");
    }

    /* renamed from: b */
    public final void mo23636b(float f) {
        this.f22792e.mo23638b(this.f22791d, f);
        for (int i = 0; i < this.f22798k.size(); i++) {
            if (this.f22798k.get(i) != null) {
                this.f22798k.get(i).mo23640a();
            }
        }
        ArrayList<C7416i> arrayList = this.f22798k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
