package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.core.widget.a */
public abstract class C0782a implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f3391r = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    public final C0783a f3392b;

    /* renamed from: c */
    public final AccelerateInterpolator f3393c = new AccelerateInterpolator();

    /* renamed from: d */
    public final View f3394d;

    /* renamed from: e */
    public C0784b f3395e;

    /* renamed from: f */
    public float[] f3396f = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: g */
    public float[] f3397g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    public int f3398h;

    /* renamed from: i */
    public int f3399i;

    /* renamed from: j */
    public float[] f3400j = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: k */
    public float[] f3401k = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: l */
    public float[] f3402l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    public boolean f3403m;

    /* renamed from: n */
    public boolean f3404n;

    /* renamed from: o */
    public boolean f3405o;

    /* renamed from: p */
    public boolean f3406p;

    /* renamed from: q */
    public boolean f3407q;

    /* renamed from: androidx.core.widget.a$a */
    public static class C0783a {

        /* renamed from: a */
        public int f3408a;

        /* renamed from: b */
        public int f3409b;

        /* renamed from: c */
        public float f3410c;

        /* renamed from: d */
        public float f3411d;

        /* renamed from: e */
        public long f3412e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f3413f = 0;

        /* renamed from: g */
        public long f3414g = -1;

        /* renamed from: h */
        public float f3415h;

        /* renamed from: i */
        public int f3416i;

        /* renamed from: a */
        public final float mo3523a(long j) {
            long j2 = this.f3412e;
            if (j < j2) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j3 = this.f3414g;
            if (j3 < 0 || j < j3) {
                return C0782a.m2383b(((float) (j - j2)) / ((float) this.f3408a), BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            float f = this.f3415h;
            return (C0782a.m2383b(((float) (j - j3)) / ((float) this.f3416i), BitmapDescriptorFactory.HUE_RED, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    public class C0784b implements Runnable {
        public C0784b() {
        }

        public final void run() {
            boolean z;
            C0782a aVar = C0782a.this;
            if (aVar.f3406p) {
                if (aVar.f3404n) {
                    aVar.f3404n = false;
                    C0783a aVar2 = aVar.f3392b;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f3412e = currentAnimationTimeMillis;
                    aVar2.f3414g = -1;
                    aVar2.f3413f = currentAnimationTimeMillis;
                    aVar2.f3415h = 0.5f;
                }
                C0783a aVar3 = C0782a.this.f3392b;
                if (aVar3.f3414g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar3.f3414g + ((long) aVar3.f3416i)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || !C0782a.this.mo3521e()) {
                    C0782a.this.f3406p = false;
                    return;
                }
                C0782a aVar4 = C0782a.this;
                if (aVar4.f3405o) {
                    aVar4.f3405o = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    aVar4.f3394d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f3413f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.mo3523a(currentAnimationTimeMillis2);
                    aVar3.f3413f = currentAnimationTimeMillis2;
                    C0797i.m2411b(((C0796h) C0782a.this).f3421s, (int) (((float) (currentAnimationTimeMillis2 - aVar3.f3413f)) * ((a * 4.0f) + (-4.0f * a * a)) * aVar3.f3411d));
                    View view = C0782a.this.f3394d;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15053m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public C0782a(View view) {
        C0783a aVar = new C0783a();
        this.f3392b = aVar;
        this.f3394d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f3402l;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f3401k;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f3398h = 1;
        float[] fArr3 = this.f3397g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3396f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3400j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f3399i = f3391r;
        aVar.f3408a = 500;
        aVar.f3409b = 500;
    }

    /* renamed from: b */
    public static float m2383b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo3518a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3396f
            r0 = r0[r7]
            float[] r1 = r3.f3397g
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m2383b(r0, r2, r1)
            float r1 = r3.mo3519c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.mo3519c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0026
            android.view.animation.AccelerateInterpolator r5 = r3.f3393c
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L_0x0030
        L_0x0026:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            android.view.animation.AccelerateInterpolator r5 = r3.f3393c
            float r4 = r5.getInterpolation(r4)
        L_0x0030:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m2383b(r4, r5, r0)
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r0 = r3.f3400j
            r0 = r0[r7]
            float[] r1 = r3.f3401k
            r1 = r1[r7]
            float[] r2 = r3.f3402l
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0056
            float r4 = r4 * r0
            float r4 = m2383b(r4, r1, r7)
            return r4
        L_0x0056:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m2383b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0782a.mo3518a(float, float, float, int):float");
    }

    /* renamed from: c */
    public final float mo3519c(float f, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i = this.f3398h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    return 1.0f - (f / f2);
                }
                if (!this.f3406p || i != 1) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < BitmapDescriptorFactory.HUE_RED) {
            return f / (-f2);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: d */
    public final void mo3520d() {
        int i = 0;
        if (this.f3404n) {
            this.f3406p = false;
            return;
        }
        C0783a aVar = this.f3392b;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f3412e);
        int i3 = aVar.f3409b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f3416i = i;
        aVar.f3415h = aVar.mo3523a(currentAnimationTimeMillis);
        aVar.f3414g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3521e() {
        /*
            r9 = this;
            androidx.core.widget.a$a r0 = r9.f3392b
            float r1 = r0.f3411d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f3410c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            androidx.core.widget.h r4 = (androidx.core.widget.C0796h) r4
            android.widget.ListView r4 = r4.f3421s
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0782a.mo3521e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3407q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.mo3520d()
            goto L_0x007f
        L_0x001a:
            r5.f3405o = r2
            r5.f3403m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3394d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo3518a(r0, r3, r4, r1)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3394d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo3518a(r7, r6, r3, r2)
            androidx.core.widget.a$a r7 = r5.f3392b
            r7.f3410c = r0
            r7.f3411d = r6
            boolean r6 = r5.f3406p
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.mo3521e()
            if (r6 == 0) goto L_0x007f
            androidx.core.widget.a$b r6 = r5.f3395e
            if (r6 != 0) goto L_0x0061
            androidx.core.widget.a$b r6 = new androidx.core.widget.a$b
            r6.<init>()
            r5.f3395e = r6
        L_0x0061:
            r5.f3406p = r2
            r5.f3404n = r2
            boolean r6 = r5.f3403m
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f3399i
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f3394d
            androidx.core.widget.a$b r0 = r5.f3395e
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, s1.p0> r6 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15054n(r7, r0, r3)
            goto L_0x007d
        L_0x0078:
            androidx.core.widget.a$b r6 = r5.f3395e
            r6.run()
        L_0x007d:
            r5.f3403m = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0782a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
