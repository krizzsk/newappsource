package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.C0687a;
import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.C0698e;
import androidx.constraintlayout.core.widgets.C0700f;
import androidx.constraintlayout.core.widgets.C0703h;
import androidx.constraintlayout.core.widgets.C0704i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.C0717a;
import androidx.constraintlayout.motion.widget.C0722c;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.events.Events;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p002a1.C0037a;
import p002a1.C0042d;
import p002a1.C0043e;
import p066e0.C4436j0;
import p242s1.C6387r;
import p279v0.C6821c;
import p292w0.C6960a;
import p292w0.C6961b;
import p292w0.C6962c;
import p305x0.C7129b;
import p317y0.C7238b;
import p328z0.C7376a;
import p328z0.C7377b;
import p328z0.C7390k;
import p328z0.C7392l;
import p328z0.C7393m;
import p328z0.C7394n;
import p328z0.C7395o;
import p328z0.C7396p;
import p328z0.C7397q;
import p328z0.C7398r;

public class MotionLayout extends ConstraintLayout implements C6387r {

    /* renamed from: J0 */
    public static boolean f2657J0;

    /* renamed from: A */
    public C0716i f2658A;

    /* renamed from: A0 */
    public Rect f2659A0;

    /* renamed from: B */
    public int f2660B = 0;

    /* renamed from: B0 */
    public boolean f2661B0;

    /* renamed from: C */
    public C0712e f2662C;

    /* renamed from: C0 */
    public TransitionState f2663C0;

    /* renamed from: D */
    public boolean f2664D = false;

    /* renamed from: D0 */
    public C0713f f2665D0;

    /* renamed from: E */
    public C7238b f2666E = new C7238b();

    /* renamed from: E0 */
    public boolean f2667E0;

    /* renamed from: F */
    public C0711d f2668F = new C0711d();

    /* renamed from: F0 */
    public RectF f2669F0;

    /* renamed from: G */
    public C7377b f2670G;

    /* renamed from: G0 */
    public View f2671G0;

    /* renamed from: H */
    public int f2672H;

    /* renamed from: H0 */
    public Matrix f2673H0;

    /* renamed from: I */
    public int f2674I;

    /* renamed from: I0 */
    public ArrayList<Integer> f2675I0;

    /* renamed from: J */
    public boolean f2676J = false;

    /* renamed from: K */
    public float f2677K;

    /* renamed from: L */
    public float f2678L;

    /* renamed from: M */
    public long f2679M;

    /* renamed from: N */
    public float f2680N;

    /* renamed from: O */
    public boolean f2681O = false;

    /* renamed from: P */
    public ArrayList<MotionHelper> f2682P = null;

    /* renamed from: Q */
    public ArrayList<MotionHelper> f2683Q = null;

    /* renamed from: R */
    public ArrayList<MotionHelper> f2684R = null;

    /* renamed from: S */
    public CopyOnWriteArrayList<C0716i> f2685S = null;

    /* renamed from: T */
    public int f2686T = 0;

    /* renamed from: U */
    public long f2687U = -1;

    /* renamed from: h */
    public C0717a f2688h;

    /* renamed from: i */
    public C7395o f2689i;

    /* renamed from: j */
    public Interpolator f2690j = null;

    /* renamed from: k */
    public float f2691k = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: l */
    public int f2692l = -1;

    /* renamed from: l0 */
    public float f2693l0 = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m */
    public int f2694m = -1;

    /* renamed from: m0 */
    public int f2695m0 = 0;

    /* renamed from: n */
    public int f2696n = -1;

    /* renamed from: n0 */
    public float f2697n0 = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: o */
    public int f2698o = 0;

    /* renamed from: o0 */
    public boolean f2699o0 = false;

    /* renamed from: p */
    public int f2700p = 0;

    /* renamed from: p0 */
    public int f2701p0;

    /* renamed from: q */
    public boolean f2702q = true;

    /* renamed from: q0 */
    public int f2703q0;

    /* renamed from: r */
    public HashMap<View, C7394n> f2704r = new HashMap<>();

    /* renamed from: r0 */
    public int f2705r0;

    /* renamed from: s */
    public long f2706s = 0;

    /* renamed from: s0 */
    public int f2707s0;

    /* renamed from: t */
    public float f2708t = 1.0f;

    /* renamed from: t0 */
    public int f2709t0;

    /* renamed from: u */
    public float f2710u = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: u0 */
    public int f2711u0;

    /* renamed from: v */
    public float f2712v = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: v0 */
    public float f2713v0;

    /* renamed from: w */
    public long f2714w;

    /* renamed from: w0 */
    public C4436j0 f2715w0 = new C4436j0(1);

    /* renamed from: x */
    public float f2716x = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: x0 */
    public boolean f2717x0 = false;

    /* renamed from: y */
    public boolean f2718y;

    /* renamed from: y0 */
    public C0715h f2719y0;

    /* renamed from: z */
    public boolean f2720z = false;

    /* renamed from: z0 */
    public Runnable f2721z0 = null;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class C0708a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f2722b;

        public C0708a(View view) {
            this.f2722b = view;
        }

        public final void run() {
            this.f2722b.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class C0709b implements Runnable {
        public C0709b() {
        }

        public final void run() {
            MotionLayout.this.f2719y0.mo2999a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public static /* synthetic */ class C0710c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2724a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2724a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2724a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2724a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2724a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0710c.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C0711d extends C7395o {

        /* renamed from: a */
        public float f2725a = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: b */
        public float f2726b = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: c */
        public float f2727c;

        public C0711d() {
        }

        /* renamed from: a */
        public final float mo2986a() {
            return MotionLayout.this.f2691k;
        }

        public final float getInterpolation(float f) {
            float f2 = this.f2725a;
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                float f3 = this.f2727c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.f2691k = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f2726b;
            }
            float f4 = this.f2727c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.f2691k = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f2726b;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public class C0712e {

        /* renamed from: a */
        public float[] f2729a;

        /* renamed from: b */
        public int[] f2730b;

        /* renamed from: c */
        public float[] f2731c;

        /* renamed from: d */
        public Path f2732d;

        /* renamed from: e */
        public Paint f2733e;

        /* renamed from: f */
        public Paint f2734f;

        /* renamed from: g */
        public Paint f2735g;

        /* renamed from: h */
        public Paint f2736h;

        /* renamed from: i */
        public Paint f2737i;

        /* renamed from: j */
        public float[] f2738j;

        /* renamed from: k */
        public int f2739k;

        /* renamed from: l */
        public Rect f2740l = new Rect();

        /* renamed from: m */
        public int f2741m = 1;

        public C0712e() {
            Paint paint = new Paint();
            this.f2733e = paint;
            paint.setAntiAlias(true);
            this.f2733e.setColor(-21965);
            this.f2733e.setStrokeWidth(2.0f);
            this.f2733e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2734f = paint2;
            paint2.setAntiAlias(true);
            this.f2734f.setColor(-2067046);
            this.f2734f.setStrokeWidth(2.0f);
            this.f2734f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f2735g = paint3;
            paint3.setAntiAlias(true);
            this.f2735g.setColor(-13391360);
            this.f2735g.setStrokeWidth(2.0f);
            this.f2735g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2736h = paint4;
            paint4.setAntiAlias(true);
            this.f2736h.setColor(-13391360);
            this.f2736h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2738j = new float[8];
            Paint paint5 = new Paint();
            this.f2737i = paint5;
            paint5.setAntiAlias(true);
            this.f2735g.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED));
            this.f2731c = new float[100];
            this.f2730b = new int[50];
        }

        /* renamed from: a */
        public final void mo2988a(Canvas canvas, int i, int i2, C7394n nVar) {
            int i3;
            int i4;
            int i5;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i6 = i;
            C7394n nVar2 = nVar;
            if (i6 == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i7 = 0; i7 < this.f2739k; i7++) {
                    int i8 = this.f2730b[i7];
                    if (i8 == 1) {
                        z = true;
                    }
                    if (i8 == 0) {
                        z2 = true;
                    }
                }
                if (z) {
                    float[] fArr = this.f2729a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f2735g);
                }
                if (z2) {
                    mo2989b(canvas);
                }
            }
            if (i6 == 2) {
                float[] fArr2 = this.f2729a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f2735g);
            }
            if (i6 == 3) {
                mo2989b(canvas);
            }
            canvas2.drawLines(this.f2729a, this.f2733e);
            View view = nVar2.f22726b;
            if (view != null) {
                i4 = view.getWidth();
                i3 = nVar2.f22726b.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i9 = 1;
            while (i9 < i2 - 1) {
                if (i6 == 4 && this.f2730b[i9 - 1] == 0) {
                    i5 = i9;
                } else {
                    float[] fArr3 = this.f2731c;
                    int i11 = i9 * 2;
                    float f3 = fArr3[i11];
                    float f4 = fArr3[i11 + 1];
                    this.f2732d.reset();
                    this.f2732d.moveTo(f3, f4 + 10.0f);
                    this.f2732d.lineTo(f3 + 10.0f, f4);
                    this.f2732d.lineTo(f3, f4 - 10.0f);
                    this.f2732d.lineTo(f3 - 10.0f, f4);
                    this.f2732d.close();
                    int i12 = i9 - 1;
                    C7396p pVar = nVar2.f22745u.get(i12);
                    if (i6 == 4) {
                        int i13 = this.f2730b[i12];
                        if (i13 == 1) {
                            mo2991d(canvas2, f3 - BitmapDescriptorFactory.HUE_RED, f4 - BitmapDescriptorFactory.HUE_RED);
                        } else if (i13 == 0) {
                            mo2990c(canvas2, f3 - BitmapDescriptorFactory.HUE_RED, f4 - BitmapDescriptorFactory.HUE_RED);
                        } else if (i13 == 2) {
                            f = f4;
                            f2 = f3;
                            i5 = i9;
                            mo2992e(canvas, f3 - BitmapDescriptorFactory.HUE_RED, f4 - BitmapDescriptorFactory.HUE_RED, i4, i3);
                            canvas2.drawPath(this.f2732d, this.f2737i);
                        }
                        f = f4;
                        f2 = f3;
                        i5 = i9;
                        canvas2.drawPath(this.f2732d, this.f2737i);
                    } else {
                        f = f4;
                        f2 = f3;
                        i5 = i9;
                    }
                    if (i6 == 2) {
                        mo2991d(canvas2, f2 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i6 == 3) {
                        mo2990c(canvas2, f2 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i6 == 6) {
                        mo2992e(canvas, f2 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED, i4, i3);
                    }
                    canvas2.drawPath(this.f2732d, this.f2737i);
                }
                i9 = i5 + 1;
            }
            float[] fArr4 = this.f2729a;
            if (fArr4.length > 1) {
                canvas2.drawCircle(fArr4[0], fArr4[1], 8.0f, this.f2734f);
                float[] fArr5 = this.f2729a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, this.f2734f);
            }
        }

        /* renamed from: b */
        public final void mo2989b(Canvas canvas) {
            float[] fArr = this.f2729a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f2735g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f2735g);
        }

        /* renamed from: c */
        public final void mo2990c(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f2729a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder k = C13555b.m33972k("");
            k.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb = k.toString();
            mo2993f(this.f2736h, sb);
            canvas2.drawText(sb, ((min2 / 2.0f) - ((float) (this.f2740l.width() / 2))) + min, f2 - 20.0f, this.f2736h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f2735g);
            StringBuilder k2 = C13555b.m33972k("");
            k2.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb2 = k2.toString();
            mo2993f(this.f2736h, sb2);
            canvas2.drawText(sb2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f2740l.height() / 2))), this.f2736h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f2735g);
        }

        /* renamed from: d */
        public final void mo2991d(Canvas canvas, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            float[] fArr = this.f2729a;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f5 - f7), (double) (f6 - f8));
            float f9 = f7 - f5;
            float f11 = f8 - f6;
            float f12 = (((f4 - f6) * f11) + ((f3 - f5) * f9)) / (hypot * hypot);
            float f13 = f5 + (f9 * f12);
            float f14 = f6 + (f12 * f11);
            Path path = new Path();
            path.moveTo(f, f4);
            path.lineTo(f13, f14);
            float hypot2 = (float) Math.hypot((double) (f13 - f3), (double) (f14 - f4));
            StringBuilder k = C13555b.m33972k("");
            k.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb = k.toString();
            mo2993f(this.f2736h, sb);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - ((float) (this.f2740l.width() / 2)), -20.0f, this.f2736h);
            canvas.drawLine(f3, f4, f13, f14, this.f2735g);
        }

        /* renamed from: e */
        public final void mo2992e(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder k = C13555b.m33972k("");
            k.append(((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            String sb = k.toString();
            mo2993f(this.f2736h, sb);
            canvas2.drawText(sb, ((f / 2.0f) - ((float) (this.f2740l.width() / 2))) + BitmapDescriptorFactory.HUE_RED, f2 - 20.0f, this.f2736h);
            canvas.drawLine(f, f2, Math.min(BitmapDescriptorFactory.HUE_RED, 1.0f), f2, this.f2735g);
            StringBuilder k2 = C13555b.m33972k("");
            k2.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            String sb2 = k2.toString();
            mo2993f(this.f2736h, sb2);
            canvas2.drawText(sb2, f + 5.0f, BitmapDescriptorFactory.HUE_RED - ((f2 / 2.0f) - ((float) (this.f2740l.height() / 2))), this.f2736h);
            canvas.drawLine(f, f2, f, Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f), this.f2735g);
        }

        /* renamed from: f */
        public final void mo2993f(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f2740l);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public class C0713f {

        /* renamed from: a */
        public C0697d f2743a = new C0697d();

        /* renamed from: b */
        public C0697d f2744b = new C0697d();

        /* renamed from: c */
        public C0738a f2745c = null;

        /* renamed from: d */
        public C0738a f2746d = null;

        /* renamed from: e */
        public int f2747e;

        /* renamed from: f */
        public int f2748f;

        public C0713f() {
        }

        /* renamed from: c */
        public static void m2151c(C0697d dVar, C0697d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> arrayList = dVar.f21718w0;
            HashMap hashMap = new HashMap();
            hashMap.put(dVar, dVar2);
            dVar2.f21718w0.clear();
            dVar2.mo2797j(dVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof C0687a) {
                    constraintWidget = new C0687a();
                } else if (next instanceof C0700f) {
                    constraintWidget = new C0700f();
                } else if (next instanceof C0698e) {
                    constraintWidget = new C0698e();
                } else if (next instanceof C0703h) {
                    constraintWidget = new C0703h();
                } else if (next instanceof C6960a) {
                    constraintWidget = new C6961b();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.f21718w0.add(constraintWidget);
                ConstraintWidget constraintWidget2 = constraintWidget.f2406W;
                if (constraintWidget2 != null) {
                    ((C6962c) constraintWidget2).f21718w0.remove(constraintWidget);
                    constraintWidget.mo2779G();
                }
                constraintWidget.f2406W = dVar2;
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).mo2797j(next2, hashMap);
            }
        }

        /* renamed from: d */
        public static ConstraintWidget m2152d(C0697d dVar, View view) {
            if (dVar.f2427i0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.f21718w0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.f2427i0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo2994a() {
            Interpolator interpolator;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f2704r.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                C7394n nVar = new C7394n(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, nVar);
                MotionLayout.this.f2704r.put(childAt, nVar);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C7394n nVar2 = MotionLayout.this.f2704r.get(childAt2);
                if (nVar2 != null) {
                    if (this.f2745c != null) {
                        ConstraintWidget d = m2152d(this.f2743a, childAt2);
                        if (d != null) {
                            Rect c = MotionLayout.m2119c(MotionLayout.this, d);
                            C0738a aVar = this.f2745c;
                            int width = MotionLayout.this.getWidth();
                            int height = MotionLayout.this.getHeight();
                            int i3 = aVar.f3113c;
                            if (i3 != 0) {
                                C7394n.m17033g(c, nVar2.f22725a, i3, width, height);
                            }
                            C7396p pVar = nVar2.f22730f;
                            pVar.f22754d = BitmapDescriptorFactory.HUE_RED;
                            pVar.f22755e = BitmapDescriptorFactory.HUE_RED;
                            nVar2.mo23624f(pVar);
                            nVar2.f22730f.mo23630d((float) c.left, (float) c.top, (float) c.width(), (float) c.height());
                            C0738a.C0739a i4 = aVar.mo3240i(nVar2.f22727c);
                            nVar2.f22730f.mo23627a(i4);
                            nVar2.f22736l = i4.f3120d.f3213g;
                            nVar2.f22732h.mo23617d(c, aVar, i3, nVar2.f22727c);
                            nVar2.f22719C = i4.f3122f.f3234i;
                            C0738a.C0742c cVar = i4.f3120d;
                            nVar2.f22721E = cVar.f3216j;
                            nVar2.f22722F = cVar.f3215i;
                            Context context = nVar2.f22726b.getContext();
                            C0738a.C0742c cVar2 = i4.f3120d;
                            int i5 = cVar2.f3218l;
                            String str = cVar2.f3217k;
                            int i6 = cVar2.f3219m;
                            if (i5 == -2) {
                                interpolator = AnimationUtils.loadInterpolator(context, i6);
                            } else if (i5 == -1) {
                                interpolator = new C7393m(C6821c.m16106c(str));
                            } else if (i5 == 0) {
                                interpolator = new AccelerateDecelerateInterpolator();
                            } else if (i5 == 1) {
                                interpolator = new AccelerateInterpolator();
                            } else if (i5 == 2) {
                                interpolator = new DecelerateInterpolator();
                            } else if (i5 == 4) {
                                interpolator = new BounceInterpolator();
                            } else if (i5 != 5) {
                                interpolator = null;
                            } else {
                                interpolator = new OvershootInterpolator();
                            }
                            nVar2.f22723G = interpolator;
                        } else if (MotionLayout.this.f2660B != 0) {
                            C7376a.m16987b();
                            C7376a.m16989d(childAt2);
                            childAt2.getClass();
                        }
                    } else {
                        MotionLayout.this.getClass();
                    }
                    if (this.f2746d != null) {
                        ConstraintWidget d2 = m2152d(this.f2744b, childAt2);
                        if (d2 != null) {
                            Rect c2 = MotionLayout.m2119c(MotionLayout.this, d2);
                            C0738a aVar2 = this.f2746d;
                            int width2 = MotionLayout.this.getWidth();
                            int height2 = MotionLayout.this.getHeight();
                            int i7 = aVar2.f3113c;
                            if (i7 != 0) {
                                C7394n.m17033g(c2, nVar2.f22725a, i7, width2, height2);
                                c2 = nVar2.f22725a;
                            }
                            C7396p pVar2 = nVar2.f22731g;
                            pVar2.f22754d = 1.0f;
                            pVar2.f22755e = 1.0f;
                            nVar2.mo23624f(pVar2);
                            nVar2.f22731g.mo23630d((float) c2.left, (float) c2.top, (float) c2.width(), (float) c2.height());
                            nVar2.f22731g.mo23627a(aVar2.mo3240i(nVar2.f22727c));
                            nVar2.f22733i.mo23617d(c2, aVar2, i7, nVar2.f22727c);
                        } else if (MotionLayout.this.f2660B != 0) {
                            C7376a.m16987b();
                            C7376a.m16989d(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                C7394n nVar3 = (C7394n) sparseArray.get(iArr[i8]);
                int i9 = nVar3.f22730f.f22762l;
                if (i9 != -1) {
                    C7394n nVar4 = (C7394n) sparseArray.get(i9);
                    nVar3.f22730f.mo23631f(nVar4, nVar4.f22730f);
                    nVar3.f22731g.mo23631f(nVar4, nVar4.f22731g);
                }
            }
        }

        /* renamed from: b */
        public final void mo2995b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f2694m == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C0697d dVar = this.f2744b;
                C0738a aVar = this.f2746d;
                if (aVar == null || aVar.f3113c == 0) {
                    i6 = i;
                } else {
                    i6 = i2;
                }
                if (aVar == null || aVar.f3113c == 0) {
                    i7 = i2;
                } else {
                    i7 = i;
                }
                motionLayout2.resolveSystem(dVar, optimizationLevel, i6, i7);
                C0738a aVar2 = this.f2745c;
                if (aVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C0697d dVar2 = this.f2743a;
                    int i9 = aVar2.f3113c;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(dVar2, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            C0738a aVar3 = this.f2745c;
            if (aVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C0697d dVar3 = this.f2743a;
                int i11 = aVar3.f3113c;
                if (i11 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i11 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                motionLayout4.resolveSystem(dVar3, optimizationLevel, i4, i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C0697d dVar4 = this.f2744b;
            C0738a aVar4 = this.f2746d;
            if (aVar4 == null || aVar4.f3113c == 0) {
                i3 = i;
            } else {
                i3 = i2;
            }
            if (aVar4 == null || aVar4.f3113c == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(dVar4, optimizationLevel, i3, i);
        }

        /* renamed from: e */
        public final void mo2996e(C0738a aVar, C0738a aVar2) {
            this.f2745c = aVar;
            this.f2746d = aVar2;
            this.f2743a = new C0697d();
            C0697d dVar = new C0697d();
            this.f2744b = dVar;
            C0697d dVar2 = this.f2743a;
            MotionLayout motionLayout = MotionLayout.this;
            boolean z = MotionLayout.f2657J0;
            C0697d dVar3 = motionLayout.mLayoutWidget;
            C7129b.C7131b bVar = dVar3.f2510A0;
            dVar2.f2510A0 = bVar;
            dVar2.f2529y0.f22167f = bVar;
            C7129b.C7131b bVar2 = dVar3.f2510A0;
            dVar.f2510A0 = bVar2;
            dVar.f2529y0.f22167f = bVar2;
            dVar2.f21718w0.clear();
            this.f2744b.f21718w0.clear();
            m2151c(MotionLayout.this.mLayoutWidget, this.f2743a);
            m2151c(MotionLayout.this.mLayoutWidget, this.f2744b);
            if (((double) MotionLayout.this.f2712v) > 0.5d) {
                if (aVar != null) {
                    mo2998g(this.f2743a, aVar);
                }
                mo2998g(this.f2744b, aVar2);
            } else {
                mo2998g(this.f2744b, aVar2);
                if (aVar != null) {
                    mo2998g(this.f2743a, aVar);
                }
            }
            this.f2743a.f2511B0 = MotionLayout.this.isRtl();
            C0697d dVar4 = this.f2743a;
            dVar4.f2528x0.mo23381c(dVar4);
            this.f2744b.f2511B0 = MotionLayout.this.isRtl();
            C0697d dVar5 = this.f2744b;
            dVar5.f2528x0.mo23381c(dVar5);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C0697d dVar6 = this.f2743a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar6.mo2786P(dimensionBehaviour);
                    this.f2744b.mo2786P(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    C0697d dVar7 = this.f2743a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar7.mo2787Q(dimensionBehaviour2);
                    this.f2744b.mo2787Q(dimensionBehaviour2);
                }
            }
        }

        /* renamed from: f */
        public final void mo2997f() {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            float f;
            boolean z4;
            float f2;
            float f3;
            boolean z5;
            MotionLayout motionLayout = MotionLayout.this;
            int i2 = motionLayout.f2698o;
            int i3 = motionLayout.f2700p;
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            MotionLayout motionLayout2 = MotionLayout.this;
            motionLayout2.f2709t0 = mode;
            motionLayout2.f2711u0 = mode2;
            motionLayout2.getOptimizationLevel();
            mo2995b(i2, i3);
            int i4 = 0;
            boolean z6 = true;
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                mo2995b(i2, i3);
                MotionLayout.this.f2701p0 = this.f2743a.mo2807u();
                MotionLayout.this.f2703q0 = this.f2743a.mo2802o();
                MotionLayout.this.f2705r0 = this.f2744b.mo2807u();
                MotionLayout.this.f2707s0 = this.f2744b.mo2802o();
                MotionLayout motionLayout3 = MotionLayout.this;
                if (motionLayout3.f2701p0 == motionLayout3.f2705r0 && motionLayout3.f2703q0 == motionLayout3.f2707s0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                motionLayout3.f2699o0 = z5;
            }
            MotionLayout motionLayout4 = MotionLayout.this;
            int i5 = motionLayout4.f2701p0;
            int i6 = motionLayout4.f2703q0;
            int i7 = motionLayout4.f2709t0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout4.f2713v0 * ((float) (motionLayout4.f2705r0 - i5))) + ((float) i5));
            }
            int i8 = motionLayout4.f2711u0;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                i6 = (int) ((motionLayout4.f2713v0 * ((float) (motionLayout4.f2707s0 - i6))) + ((float) i6));
            }
            int i9 = i6;
            C0697d dVar = this.f2743a;
            if (dVar.f2520K0 || this.f2744b.f2520K0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVar.f2521L0 || this.f2744b.f2521L0) {
                z3 = true;
            } else {
                z3 = false;
            }
            motionLayout4.resolveMeasuredDimension(i2, i3, i5, i9, z2, z3);
            MotionLayout motionLayout5 = MotionLayout.this;
            int childCount = motionLayout5.getChildCount();
            motionLayout5.f2665D0.mo2994a();
            motionLayout5.f2720z = true;
            SparseArray sparseArray = new SparseArray();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = motionLayout5.getChildAt(i11);
                sparseArray.put(childAt.getId(), motionLayout5.f2704r.get(childAt));
            }
            int width = motionLayout5.getWidth();
            int height = motionLayout5.getHeight();
            C0717a.C0719b bVar = motionLayout5.f2688h.f2759c;
            if (bVar != null) {
                i = bVar.f2792p;
            } else {
                i = -1;
            }
            if (i != -1) {
                for (int i12 = 0; i12 < childCount; i12++) {
                    C7394n nVar = motionLayout5.f2704r.get(motionLayout5.getChildAt(i12));
                    if (nVar != null) {
                        nVar.f22718B = i;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[motionLayout5.f2704r.size()];
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                C7394n nVar2 = motionLayout5.f2704r.get(motionLayout5.getChildAt(i14));
                int i15 = nVar2.f22730f.f22762l;
                if (i15 != -1) {
                    sparseBooleanArray.put(i15, true);
                    iArr[i13] = nVar2.f22730f.f22762l;
                    i13++;
                }
            }
            if (motionLayout5.f2684R != null) {
                for (int i16 = 0; i16 < i13; i16++) {
                    C7394n nVar3 = motionLayout5.f2704r.get(motionLayout5.findViewById(iArr[i16]));
                    if (nVar3 != null) {
                        motionLayout5.f2688h.mo3005f(nVar3);
                    }
                }
                Iterator<MotionHelper> it = motionLayout5.f2684R.iterator();
                while (it.hasNext()) {
                    it.next().mo2916u(motionLayout5, motionLayout5.f2704r);
                }
                for (int i17 = 0; i17 < i13; i17++) {
                    C7394n nVar4 = motionLayout5.f2704r.get(motionLayout5.findViewById(iArr[i17]));
                    if (nVar4 != null) {
                        nVar4.mo23625h(width, height, motionLayout5.getNanoTime());
                    }
                }
            } else {
                for (int i18 = 0; i18 < i13; i18++) {
                    C7394n nVar5 = motionLayout5.f2704r.get(motionLayout5.findViewById(iArr[i18]));
                    if (nVar5 != null) {
                        motionLayout5.f2688h.mo3005f(nVar5);
                        nVar5.mo23625h(width, height, motionLayout5.getNanoTime());
                    }
                }
            }
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt2 = motionLayout5.getChildAt(i19);
                C7394n nVar6 = motionLayout5.f2704r.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar6 != null) {
                    motionLayout5.f2688h.mo3005f(nVar6);
                    nVar6.mo23625h(width, height, motionLayout5.getNanoTime());
                }
            }
            C0717a.C0719b bVar2 = motionLayout5.f2688h.f2759c;
            if (bVar2 != null) {
                f = bVar2.f2785i;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (f != BitmapDescriptorFactory.HUE_RED) {
                if (((double) f) < 0.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float abs = Math.abs(f);
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                int i21 = 0;
                float f6 = Float.MAX_VALUE;
                float f7 = -3.4028235E38f;
                while (true) {
                    if (i21 >= childCount) {
                        z6 = false;
                        break;
                    }
                    C7394n nVar7 = motionLayout5.f2704r.get(motionLayout5.getChildAt(i21));
                    if (!Float.isNaN(nVar7.f22736l)) {
                        break;
                    }
                    C7396p pVar = nVar7.f22731g;
                    float f8 = pVar.f22756f;
                    float f9 = pVar.f22757g;
                    if (z4) {
                        f3 = f9 - f8;
                    } else {
                        f3 = f9 + f8;
                    }
                    f6 = Math.min(f6, f3);
                    f7 = Math.max(f7, f3);
                    i21++;
                }
                if (z6) {
                    for (int i22 = 0; i22 < childCount; i22++) {
                        C7394n nVar8 = motionLayout5.f2704r.get(motionLayout5.getChildAt(i22));
                        if (!Float.isNaN(nVar8.f22736l)) {
                            f4 = Math.min(f4, nVar8.f22736l);
                            f5 = Math.max(f5, nVar8.f22736l);
                        }
                    }
                    while (i4 < childCount) {
                        C7394n nVar9 = motionLayout5.f2704r.get(motionLayout5.getChildAt(i4));
                        if (!Float.isNaN(nVar9.f22736l)) {
                            nVar9.f22738n = 1.0f / (1.0f - abs);
                            if (z4) {
                                nVar9.f22737m = abs - (((f5 - nVar9.f22736l) / (f5 - f4)) * abs);
                            } else {
                                nVar9.f22737m = abs - (((nVar9.f22736l - f4) * abs) / (f5 - f4));
                            }
                        }
                        i4++;
                    }
                    return;
                }
                while (i4 < childCount) {
                    C7394n nVar10 = motionLayout5.f2704r.get(motionLayout5.getChildAt(i4));
                    C7396p pVar2 = nVar10.f22731g;
                    float f11 = pVar2.f22756f;
                    float f12 = pVar2.f22757g;
                    if (z4) {
                        f2 = f12 - f11;
                    } else {
                        f2 = f12 + f11;
                    }
                    nVar10.f22738n = 1.0f / (1.0f - abs);
                    nVar10.f22737m = abs - (((f2 - f6) * abs) / (f7 - f6));
                    i4++;
                }
            }
        }

        /* renamed from: g */
        public final void mo2998g(C0697d dVar, C0738a aVar) {
            C0738a.C0739a aVar2;
            C0738a.C0739a aVar3;
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (!(aVar == null || aVar.f3113c == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                C0697d dVar2 = this.f2744b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824);
                boolean z = MotionLayout.f2657J0;
                motionLayout.resolveSystem(dVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator<ConstraintWidget> it = dVar.f21718w0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f2431k0 = true;
                sparseArray.put(((View) next.f2427i0).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.f21718w0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.f2427i0;
                int id = view.getId();
                if (aVar.f3116f.containsKey(Integer.valueOf(id)) && (aVar3 = aVar.f3116f.get(Integer.valueOf(id))) != null) {
                    aVar3.mo3244a(layoutParams);
                }
                next2.mo2788R(aVar.mo3240i(view.getId()).f3121e.f3168c);
                next2.mo2785O(aVar.mo3240i(view.getId()).f3121e.f3170d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    if (aVar.f3116f.containsKey(Integer.valueOf(id2)) && (aVar2 = aVar.f3116f.get(Integer.valueOf(id2))) != null && (next2 instanceof C6961b)) {
                        constraintHelper.mo2873o(aVar2, (C6961b) next2, layoutParams, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo3168t();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z2 = MotionLayout.f2657J0;
                motionLayout2.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (aVar.mo3240i(view.getId()).f3119c.f3222c == 1) {
                    next2.f2429j0 = view.getVisibility();
                } else {
                    next2.f2429j0 = aVar.mo3240i(view.getId()).f3119c.f3221b;
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.f21718w0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof C0704i) {
                    C6960a aVar4 = (C6960a) next3;
                    ((ConstraintHelper) next3.f2427i0).mo2918s(aVar4, sparseArray);
                    C0704i iVar = (C0704i) aVar4;
                    for (int i = 0; i < iVar.f21717x0; i++) {
                        ConstraintWidget constraintWidget = iVar.f21716w0[i];
                        if (constraintWidget != null) {
                            constraintWidget.f2391H = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public static class C0714g {

        /* renamed from: b */
        public static C0714g f2750b = new C0714g();

        /* renamed from: a */
        public VelocityTracker f2751a;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public class C0715h {

        /* renamed from: a */
        public float f2752a = Float.NaN;

        /* renamed from: b */
        public float f2753b = Float.NaN;

        /* renamed from: c */
        public int f2754c = -1;

        /* renamed from: d */
        public int f2755d = -1;

        public C0715h() {
        }

        /* renamed from: a */
        public final void mo2999a() {
            int i = this.f2754c;
            if (!(i == -1 && this.f2755d == -1)) {
                if (i == -1) {
                    MotionLayout motionLayout = MotionLayout.this;
                    int i2 = this.f2755d;
                    if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.f2719y0 == null) {
                            motionLayout.f2719y0 = new C0715h();
                        }
                        motionLayout.f2719y0.f2755d = i2;
                    } else {
                        motionLayout.mo2924B(i2, -1);
                    }
                } else {
                    int i3 = this.f2755d;
                    if (i3 == -1) {
                        MotionLayout.this.mo2982y(i);
                    } else {
                        MotionLayout.this.mo2983z(i, i3);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.f2753b)) {
                MotionLayout motionLayout2 = MotionLayout.this;
                float f = this.f2752a;
                float f2 = this.f2753b;
                if (!motionLayout2.isAttachedToWindow()) {
                    if (motionLayout2.f2719y0 == null) {
                        motionLayout2.f2719y0 = new C0715h();
                    }
                    C0715h hVar = motionLayout2.f2719y0;
                    hVar.f2752a = f;
                    hVar.f2753b = f2;
                } else {
                    motionLayout2.setProgress(f);
                    motionLayout2.setState(TransitionState.MOVING);
                    motionLayout2.f2691k = f2;
                    float f3 = 1.0f;
                    int i4 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i4 != 0) {
                        if (i4 <= 0) {
                            f3 = BitmapDescriptorFactory.HUE_RED;
                        }
                        motionLayout2.mo2927d(f3);
                    } else if (!(f == BitmapDescriptorFactory.HUE_RED || f == 1.0f)) {
                        if (f <= 0.5f) {
                            f3 = BitmapDescriptorFactory.HUE_RED;
                        }
                        motionLayout2.mo2927d(f3);
                    }
                }
                this.f2752a = Float.NaN;
                this.f2753b = Float.NaN;
                this.f2754c = -1;
                this.f2755d = -1;
            } else if (!Float.isNaN(this.f2752a)) {
                MotionLayout.this.setProgress(this.f2752a);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface C0716i {
        /* renamed from: a */
        void mo2851a(int i);

        /* renamed from: b */
        void mo2919b();

        /* renamed from: c */
        void mo2852c();

        /* renamed from: d */
        void mo2920d();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new HashMap();
        this.f2659A0 = new Rect();
        this.f2661B0 = false;
        this.f2663C0 = TransitionState.UNDEFINED;
        this.f2665D0 = new C0713f();
        this.f2667E0 = false;
        this.f2669F0 = new RectF();
        this.f2671G0 = null;
        this.f2673H0 = null;
        this.f2675I0 = new ArrayList<>();
        mo2978u(attributeSet);
    }

    /* renamed from: c */
    public static Rect m2119c(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.f2659A0.top = constraintWidget.mo2809w();
        motionLayout.f2659A0.left = constraintWidget.mo2808v();
        Rect rect = motionLayout.f2659A0;
        int u = constraintWidget.mo2807u();
        Rect rect2 = motionLayout.f2659A0;
        rect.right = u + rect2.left;
        int o = constraintWidget.mo2802o();
        Rect rect3 = motionLayout.f2659A0;
        rect2.bottom = o + rect3.top;
        return rect3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1 != 7) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if ((((r4 * r6) - (((r3 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if ((((((r3 * r6) * r6) / 2.0f) + (r4 * r6)) + r1) < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x0074;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2923A(float r15, float r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r8 = r15
            r4 = r16
            r1 = r17
            androidx.constraintlayout.motion.widget.a r2 = r0.f2688h
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            float r2 = r0.f2712v
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            r2 = 1
            r0.f2664D = r2
            long r5 = r14.getNanoTime()
            r0.f2706s = r5
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            int r3 = r3.mo3002c()
            float r3 = (float) r3
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r3 / r5
            r0.f2708t = r5
            r0.f2716x = r8
            r0.f2720z = r2
            r3 = 7
            r6 = 6
            r7 = 2
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 0
            if (r1 == 0) goto L_0x00d1
            if (r1 == r2) goto L_0x00d1
            if (r1 == r7) goto L_0x00d1
            r12 = 4
            if (r1 == r12) goto L_0x00bb
            r12 = 5
            if (r1 == r12) goto L_0x0045
            if (r1 == r6) goto L_0x00d1
            if (r1 == r3) goto L_0x00d1
            goto L_0x0170
        L_0x0045:
            float r1 = r0.f2712v
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            float r3 = r3.mo3006g()
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0063
            float r6 = r4 / r3
            float r7 = r4 * r6
            float r3 = r3 * r6
            float r3 = r3 * r6
            float r3 = r3 / r5
            float r7 = r7 - r3
            float r7 = r7 + r1
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0073
            goto L_0x0074
        L_0x0063:
            float r6 = -r4
            float r6 = r6 / r3
            float r7 = r4 * r6
            float r3 = r3 * r6
            float r3 = r3 * r6
            float r3 = r3 / r5
            float r3 = r3 + r7
            float r3 = r3 + r1
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            if (r2 == 0) goto L_0x008c
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f2668F
            float r2 = r0.f2712v
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            float r3 = r3.mo3006g()
            r1.f2725a = r4
            r1.f2726b = r2
            r1.f2727c = r3
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f2668F
            r0.f2689i = r1
            goto L_0x0170
        L_0x008c:
            y0.b r1 = r0.f2666E
            float r2 = r0.f2712v
            float r5 = r0.f2708t
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            float r6 = r3.mo3006g()
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            androidx.constraintlayout.motion.widget.a$b r3 = r3.f2759c
            if (r3 == 0) goto L_0x00a6
            androidx.constraintlayout.motion.widget.b r3 = r3.f2788l
            if (r3 == 0) goto L_0x00a6
            float r3 = r3.f2822s
            r7 = r3
            goto L_0x00a7
        L_0x00a6:
            r7 = 0
        L_0x00a7:
            r3 = r15
            r4 = r16
            r1.mo23540b(r2, r3, r4, r5, r6, r7)
            r0.f2691k = r11
            int r1 = r0.f2694m
            r0.f2716x = r8
            r0.f2694m = r1
            y0.b r1 = r0.f2666E
            r0.f2689i = r1
            goto L_0x0170
        L_0x00bb:
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f2668F
            float r2 = r0.f2712v
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            float r3 = r3.mo3006g()
            r1.f2725a = r4
            r1.f2726b = r2
            r1.f2727c = r3
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f2668F
            r0.f2689i = r1
            goto L_0x0170
        L_0x00d1:
            if (r1 == r2) goto L_0x00dd
            if (r1 != r3) goto L_0x00d6
            goto L_0x00dd
        L_0x00d6:
            if (r1 == r7) goto L_0x00da
            if (r1 != r6) goto L_0x00de
        L_0x00da:
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00de
        L_0x00dd:
            r8 = 0
        L_0x00de:
            androidx.constraintlayout.motion.widget.a r1 = r0.f2688h
            androidx.constraintlayout.motion.widget.a$b r2 = r1.f2759c
            if (r2 == 0) goto L_0x00eb
            androidx.constraintlayout.motion.widget.b r3 = r2.f2788l
            if (r3 == 0) goto L_0x00eb
            int r3 = r3.f2803D
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            if (r3 != 0) goto L_0x010e
            y0.b r2 = r0.f2666E
            float r3 = r0.f2712v
            float r6 = r1.mo3006g()
            androidx.constraintlayout.motion.widget.a r1 = r0.f2688h
            androidx.constraintlayout.motion.widget.a$b r1 = r1.f2759c
            if (r1 == 0) goto L_0x0104
            androidx.constraintlayout.motion.widget.b r1 = r1.f2788l
            if (r1 == 0) goto L_0x0104
            float r1 = r1.f2822s
            r7 = r1
            goto L_0x0105
        L_0x0104:
            r7 = 0
        L_0x0105:
            r1 = r2
            r2 = r3
            r3 = r8
            r4 = r16
            r1.mo23540b(r2, r3, r4, r5, r6, r7)
            goto L_0x0166
        L_0x010e:
            y0.b r1 = r0.f2666E
            float r3 = r0.f2712v
            if (r2 == 0) goto L_0x011b
            androidx.constraintlayout.motion.widget.b r4 = r2.f2788l
            if (r4 == 0) goto L_0x011b
            float r4 = r4.f2829z
            goto L_0x011c
        L_0x011b:
            r4 = 0
        L_0x011c:
            if (r2 == 0) goto L_0x0125
            androidx.constraintlayout.motion.widget.b r5 = r2.f2788l
            if (r5 == 0) goto L_0x0125
            float r5 = r5.f2800A
            goto L_0x0126
        L_0x0125:
            r5 = 0
        L_0x0126:
            if (r2 == 0) goto L_0x012f
            androidx.constraintlayout.motion.widget.b r6 = r2.f2788l
            if (r6 == 0) goto L_0x012f
            float r6 = r6.f2828y
            goto L_0x0130
        L_0x012f:
            r6 = 0
        L_0x0130:
            if (r2 == 0) goto L_0x0139
            androidx.constraintlayout.motion.widget.b r7 = r2.f2788l
            if (r7 == 0) goto L_0x0139
            float r7 = r7.f2801B
            goto L_0x013a
        L_0x0139:
            r7 = 0
        L_0x013a:
            if (r2 == 0) goto L_0x0143
            androidx.constraintlayout.motion.widget.b r2 = r2.f2788l
            if (r2 == 0) goto L_0x0143
            int r2 = r2.f2802C
            goto L_0x0144
        L_0x0143:
            r2 = 0
        L_0x0144:
            v0.k r9 = r1.f22390b
            if (r9 != 0) goto L_0x014f
            v0.k r9 = new v0.k
            r9.<init>()
            r1.f22390b = r9
        L_0x014f:
            v0.k r9 = r1.f22390b
            r1.f22391c = r9
            double r12 = (double) r8
            r9.f21144c = r12
            double r12 = (double) r6
            r9.f21142a = r12
            r9.f21146e = r3
            double r5 = (double) r5
            r9.f21143b = r5
            r9.f21148g = r4
            r9.f21149h = r7
            r9.f21150i = r2
            r9.f21145d = r11
        L_0x0166:
            int r1 = r0.f2694m
            r0.f2716x = r8
            r0.f2694m = r1
            y0.b r1 = r0.f2666E
            r0.f2689i = r1
        L_0x0170:
            r0.f2718y = r10
            long r1 = r14.getNanoTime()
            r0.f2706s = r1
            r14.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2923A(float, float, int):void");
    }

    /* renamed from: B */
    public final void mo2924B(int i, int i2) {
        float f;
        C0043e eVar;
        C0717a aVar = this.f2688h;
        if (!(aVar == null || (eVar = aVar.f2758b) == null)) {
            int i3 = this.f2694m;
            float f2 = (float) -1;
            C0043e.C0044a aVar2 = eVar.f41b.get(i);
            if (aVar2 == null) {
                i3 = i;
            } else {
                int i4 = (f2 > -1.0f ? 1 : (f2 == -1.0f ? 0 : -1));
                if (i4 != 0 && i4 != 0) {
                    Iterator<C0043e.C0045b> it = aVar2.f43b.iterator();
                    C0043e.C0045b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            C0043e.C0045b next = it.next();
                            if (next.mo23a(f2, f2)) {
                                if (i3 == next.f49e) {
                                    break;
                                }
                                bVar = next;
                            }
                        } else {
                            i3 = bVar != null ? bVar.f49e : aVar2.f44c;
                        }
                    }
                } else if (aVar2.f44c != i3) {
                    Iterator<C0043e.C0045b> it2 = aVar2.f43b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (i3 == it2.next().f49e) {
                                break;
                            }
                        } else {
                            i3 = aVar2.f44c;
                            break;
                        }
                    }
                }
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i5 = this.f2694m;
        if (i5 != i) {
            if (this.f2692l == i) {
                mo2927d(BitmapDescriptorFactory.HUE_RED);
                if (i2 > 0) {
                    this.f2708t = ((float) i2) / 1000.0f;
                }
            } else if (this.f2696n == i) {
                mo2927d(1.0f);
                if (i2 > 0) {
                    this.f2708t = ((float) i2) / 1000.0f;
                }
            } else {
                this.f2696n = i;
                if (i5 != -1) {
                    mo2983z(i5, i);
                    mo2927d(1.0f);
                    this.f2712v = BitmapDescriptorFactory.HUE_RED;
                    mo2927d(1.0f);
                    this.f2721z0 = null;
                    if (i2 > 0) {
                        this.f2708t = ((float) i2) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f2664D = false;
                this.f2716x = 1.0f;
                this.f2710u = BitmapDescriptorFactory.HUE_RED;
                this.f2712v = BitmapDescriptorFactory.HUE_RED;
                this.f2714w = getNanoTime();
                this.f2706s = getNanoTime();
                this.f2718y = false;
                this.f2689i = null;
                if (i2 == -1) {
                    this.f2708t = ((float) this.f2688h.mo3002c()) / 1000.0f;
                }
                this.f2692l = -1;
                this.f2688h.mo3013n(-1, this.f2696n);
                SparseArray sparseArray = new SparseArray();
                if (i2 == 0) {
                    this.f2708t = ((float) this.f2688h.mo3002c()) / 1000.0f;
                } else if (i2 > 0) {
                    this.f2708t = ((float) i2) / 1000.0f;
                }
                int childCount = getChildCount();
                this.f2704r.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.f2704r.put(childAt, new C7394n(childAt));
                    sparseArray.put(childAt.getId(), this.f2704r.get(childAt));
                }
                this.f2720z = true;
                this.f2665D0.mo2996e((C0738a) null, this.f2688h.mo3001b(i));
                mo2981x();
                this.f2665D0.mo2994a();
                int childCount2 = getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt2 = getChildAt(i7);
                    C7394n nVar = this.f2704r.get(childAt2);
                    if (nVar != null) {
                        C7396p pVar = nVar.f22730f;
                        pVar.f22754d = BitmapDescriptorFactory.HUE_RED;
                        pVar.f22755e = BitmapDescriptorFactory.HUE_RED;
                        pVar.mo23630d(childAt2.getX(), childAt2.getY(), (float) childAt2.getWidth(), (float) childAt2.getHeight());
                        C7392l lVar = nVar.f22732h;
                        lVar.getClass();
                        childAt2.getX();
                        childAt2.getY();
                        childAt2.getWidth();
                        childAt2.getHeight();
                        lVar.mo23615b(childAt2);
                    }
                }
                int width = getWidth();
                int height = getHeight();
                if (this.f2684R != null) {
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C7394n nVar2 = this.f2704r.get(getChildAt(i8));
                        if (nVar2 != null) {
                            this.f2688h.mo3005f(nVar2);
                        }
                    }
                    Iterator<MotionHelper> it3 = this.f2684R.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo2916u(this, this.f2704r);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C7394n nVar3 = this.f2704r.get(getChildAt(i9));
                        if (nVar3 != null) {
                            nVar3.mo23625h(width, height, getNanoTime());
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        C7394n nVar4 = this.f2704r.get(getChildAt(i11));
                        if (nVar4 != null) {
                            this.f2688h.mo3005f(nVar4);
                            nVar4.mo23625h(width, height, getNanoTime());
                        }
                    }
                }
                C0717a.C0719b bVar2 = this.f2688h.f2759c;
                if (bVar2 != null) {
                    f = bVar2.f2785i;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    float f3 = Float.MAX_VALUE;
                    float f4 = -3.4028235E38f;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        C7396p pVar2 = this.f2704r.get(getChildAt(i12)).f22731g;
                        float f5 = pVar2.f22757g + pVar2.f22756f;
                        f3 = Math.min(f3, f5);
                        f4 = Math.max(f4, f5);
                    }
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C7394n nVar5 = this.f2704r.get(getChildAt(i13));
                        C7396p pVar3 = nVar5.f22731g;
                        float f6 = pVar3.f22756f;
                        float f7 = pVar3.f22757g;
                        nVar5.f22738n = 1.0f / (1.0f - f);
                        nVar5.f22737m = f - ((((f6 + f7) - f3) * f) / (f4 - f3));
                    }
                }
                this.f2710u = BitmapDescriptorFactory.HUE_RED;
                this.f2712v = BitmapDescriptorFactory.HUE_RED;
                this.f2720z = true;
                invalidate();
            }
        }
    }

    /* renamed from: C */
    public final void mo2925C(int i, C0738a aVar) {
        C0717a aVar2 = this.f2688h;
        if (aVar2 != null) {
            aVar2.f2763g.put(i, aVar);
        }
        this.f2665D0.mo2996e(this.f2688h.mo3001b(this.f2692l), this.f2688h.mo3001b(this.f2696n));
        mo2981x();
        if (this.f2694m == i) {
            aVar.mo3236b(this);
        }
    }

    /* renamed from: D */
    public final void mo2926D(int i, View... viewArr) {
        C0738a aVar;
        C0717a aVar2 = this.f2688h;
        if (aVar2 != null) {
            C0724d dVar = aVar2.f2773q;
            dVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<C0722c> it = dVar.f2865b.iterator();
            while (it.hasNext()) {
                C0722c next = it.next();
                if (next.f2830a == i) {
                    for (View view : viewArr) {
                        if (next.mo3023b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        int currentState = dVar.f2864a.getCurrentState();
                        if (next.f2834e == 2) {
                            next.mo3022a(dVar, dVar.f2864a, currentState, (C0738a) null, viewArr2);
                        } else if (currentState == -1) {
                            dVar.f2864a.toString();
                        } else {
                            C0717a aVar3 = dVar.f2864a.f2688h;
                            if (aVar3 == null) {
                                aVar = null;
                            } else {
                                aVar = aVar3.mo3001b(currentState);
                            }
                            C0738a aVar4 = aVar;
                            if (aVar4 != null) {
                                next.mo3022a(dVar, dVar.f2864a, currentState, aVar4, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo2927d(float f) {
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            float f2 = this.f2712v;
            float f3 = this.f2710u;
            if (f2 != f3 && this.f2718y) {
                this.f2712v = f3;
            }
            float f4 = this.f2712v;
            if (f4 != f) {
                this.f2664D = false;
                this.f2716x = f;
                this.f2708t = ((float) aVar.mo3002c()) / 1000.0f;
                setProgress(this.f2716x);
                this.f2689i = null;
                this.f2690j = this.f2688h.mo3004e();
                this.f2718y = false;
                this.f2706s = getNanoTime();
                this.f2720z = true;
                this.f2710u = f4;
                this.f2712v = f4;
                invalidate();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r2 = r0.f2684R
            if (r2 == 0) goto L_0x001c
            java.util.Iterator r2 = r2.iterator()
        L_0x000c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x001c
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionHelper r3 = (androidx.constraintlayout.motion.widget.MotionHelper) r3
            r3.getClass()
            goto L_0x000c
        L_0x001c:
            r2 = 0
            r0.mo2930f(r2)
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            r4 = 0
            if (r3 == 0) goto L_0x0058
            androidx.constraintlayout.motion.widget.d r3 = r3.f2773q
            if (r3 == 0) goto L_0x0058
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f2867d
            if (r5 != 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            java.util.Iterator r5 = r5.iterator()
        L_0x0032:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0042
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.motion.widget.c$a r6 = (androidx.constraintlayout.motion.widget.C0722c.C0723a) r6
            r6.mo3027a()
            goto L_0x0032
        L_0x0042:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f2867d
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r6 = r3.f2868e
            r5.removeAll(r6)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f2868e
            r5.clear()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f2867d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0058
            r3.f2867d = r4
        L_0x0058:
            super.dispatchDraw(r28)
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            if (r3 != 0) goto L_0x0060
            return
        L_0x0060:
            int r3 = r0.f2660B
            r4 = 1
            r3 = r3 & r4
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 1092616192(0x41200000, float:10.0)
            if (r3 != r4) goto L_0x0127
            boolean r3 = r27.isInEditMode()
            if (r3 != 0) goto L_0x0127
            int r3 = r0.f2686T
            int r3 = r3 + r4
            r0.f2686T = r3
            long r7 = r27.getNanoTime()
            long r9 = r0.f2687U
            r11 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x00a2
            long r9 = r7 - r9
            r11 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a4
            int r3 = r0.f2686T
            float r3 = (float) r3
            float r9 = (float) r9
            r10 = 814313567(0x3089705f, float:1.0E-9)
            float r9 = r9 * r10
            float r3 = r3 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r9
            r0.f2693l0 = r3
            r0.f2686T = r2
            r0.f2687U = r7
            goto L_0x00a4
        L_0x00a2:
            r0.f2687U = r7
        L_0x00a4:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r7 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r7)
            float r7 = r27.getProgress()
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            float r7 = (float) r7
            float r7 = r7 / r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            float r9 = r0.f2693l0
            r8.append(r9)
            java.lang.String r9 = " fps "
            r8.append(r9)
            int r9 = r0.f2692l
            java.lang.String r9 = p328z0.C7376a.m16990e(r9, r0)
            r8.append(r9)
            java.lang.String r9 = " -> "
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r8 = p379.C13555b.m33972k(r8)
            int r9 = r0.f2696n
            java.lang.String r9 = p328z0.C7376a.m16990e(r9, r0)
            r8.append(r9)
            java.lang.String r9 = " (progress: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " ) state="
            r8.append(r7)
            int r7 = r0.f2694m
            r9 = -1
            if (r7 != r9) goto L_0x00fd
            java.lang.String r7 = "undefined"
            goto L_0x0101
        L_0x00fd:
            java.lang.String r7 = p328z0.C7376a.m16990e(r7, r0)
        L_0x0101:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r8)
            int r8 = r27.getHeight()
            int r8 = r8 + -29
            float r8 = (float) r8
            r1.drawText(r7, r5, r8, r3)
            r8 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r8)
            int r8 = r27.getHeight()
            int r8 = r8 + -30
            float r8 = (float) r8
            r1.drawText(r7, r6, r8, r3)
        L_0x0127:
            int r3 = r0.f2660B
            if (r3 <= r4) goto L_0x0526
            androidx.constraintlayout.motion.widget.MotionLayout$e r3 = r0.f2662C
            if (r3 != 0) goto L_0x0136
            androidx.constraintlayout.motion.widget.MotionLayout$e r3 = new androidx.constraintlayout.motion.widget.MotionLayout$e
            r3.<init>()
            r0.f2662C = r3
        L_0x0136:
            androidx.constraintlayout.motion.widget.MotionLayout$e r3 = r0.f2662C
            java.util.HashMap<android.view.View, z0.n> r4 = r0.f2704r
            androidx.constraintlayout.motion.widget.a r7 = r0.f2688h
            int r7 = r7.mo3002c()
            int r8 = r0.f2660B
            r3.getClass()
            if (r4 == 0) goto L_0x0526
            int r9 = r4.size()
            if (r9 != 0) goto L_0x014f
            goto L_0x0528
        L_0x014f:
            r28.save()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
            boolean r9 = r9.isInEditMode()
            r10 = 2
            if (r9 != 0) goto L_0x01a7
            r9 = r8 & 1
            if (r9 != r10) goto L_0x01a7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r11 = r11.f2696n
            java.lang.String r10 = r10.getResourceName(r11)
            r9.append(r10)
            java.lang.String r10 = ":"
            r9.append(r10)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
            float r10 = r10.getProgress()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r10 = r10.getHeight()
            int r10 = r10 + -30
            float r10 = (float) r10
            android.graphics.Paint r11 = r3.f2736h
            r1.drawText(r9, r6, r10, r11)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r6 = r6.getHeight()
            int r6 = r6 + -29
            float r6 = (float) r6
            android.graphics.Paint r10 = r3.f2733e
            r1.drawText(r9, r5, r6, r10)
        L_0x01a7:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = r1
        L_0x01b0:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0523
            java.lang.Object r6 = r4.next()
            z0.n r6 = (p328z0.C7394n) r6
            z0.p r9 = r6.f22730f
            int r9 = r9.f22753c
            java.util.ArrayList<z0.p> r10 = r6.f22745u
            java.util.Iterator r10 = r10.iterator()
        L_0x01c6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01d9
            java.lang.Object r11 = r10.next()
            z0.p r11 = (p328z0.C7396p) r11
            int r11 = r11.f22753c
            int r9 = java.lang.Math.max(r9, r11)
            goto L_0x01c6
        L_0x01d9:
            z0.p r10 = r6.f22731g
            int r10 = r10.f22753c
            int r9 = java.lang.Math.max(r9, r10)
            if (r8 <= 0) goto L_0x01e6
            if (r9 != 0) goto L_0x01e6
            r9 = 1
        L_0x01e6:
            if (r9 != 0) goto L_0x01e9
            goto L_0x01b0
        L_0x01e9:
            float[] r15 = r3.f2731c
            int[] r10 = r3.f2730b
            if (r15 == 0) goto L_0x024e
            v0.b[] r11 = r6.f22734j
            r11 = r11[r2]
            double[] r14 = r11.mo23041g()
            if (r10 == 0) goto L_0x0215
            java.util.ArrayList<z0.p> r11 = r6.f22745u
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L_0x0200:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0215
            java.lang.Object r13 = r11.next()
            z0.p r13 = (p328z0.C7396p) r13
            int r16 = r12 + 1
            int r13 = r13.f22766p
            r10[r12] = r13
            r12 = r16
            goto L_0x0200
        L_0x0215:
            r10 = 0
            r11 = 0
            r13 = 0
            r17 = 0
        L_0x021a:
            int r10 = r14.length
            if (r13 >= r10) goto L_0x0247
            v0.b[] r10 = r6.f22734j
            r2 = r10[r2]
            r10 = r14[r13]
            double[] r12 = r6.f22740p
            r2.mo23037c(r10, r12)
            z0.p r10 = r6.f22730f
            r11 = r14[r13]
            int[] r2 = r6.f22739o
            r18 = r4
            double[] r4 = r6.f22740p
            r19 = r13
            r13 = r2
            r2 = r14
            r14 = r4
            r4 = r15
            r16 = r17
            r10.mo23628c(r11, r13, r14, r15, r16)
            int r17 = r17 + 2
            int r13 = r19 + 1
            r10 = 0
            r14 = r2
            r4 = r18
            r2 = 0
            goto L_0x021a
        L_0x0247:
            r18 = r4
            int r17 = r17 / 2
            r2 = r17
            goto L_0x0253
        L_0x024e:
            r18 = r4
            r17 = 0
            r2 = 0
        L_0x0253:
            r3.f2739k = r2
            r2 = 1
            if (r9 < r2) goto L_0x0514
            int r2 = r7 / 16
            float[] r4 = r3.f2729a
            if (r4 == 0) goto L_0x0263
            int r4 = r4.length
            int r10 = r2 * 2
            if (r4 == r10) goto L_0x0270
        L_0x0263:
            int r4 = r2 * 2
            float[] r4 = new float[r4]
            r3.f2729a = r4
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r3.f2732d = r4
        L_0x0270:
            int r4 = r3.f2741m
            float r4 = (float) r4
            r5.translate(r4, r4)
            android.graphics.Paint r4 = r3.f2733e
            r5 = 1996488704(0x77000000, float:2.5961484E33)
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f2737i
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f2734f
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f2735g
            r4.setColor(r5)
            float[] r4 = r3.f2729a
            int r5 = r2 + -1
            float r5 = (float) r5
            r10 = 1065353216(0x3f800000, float:1.0)
            float r5 = r10 / r5
            java.util.HashMap<java.lang.String, y0.d> r11 = r6.f22749y
            java.lang.String r12 = "translationX"
            if (r11 != 0) goto L_0x029e
            r11 = 0
            goto L_0x02a4
        L_0x029e:
            java.lang.Object r11 = r11.get(r12)
            v0.j r11 = (p279v0.C6831j) r11
        L_0x02a4:
            r15 = r11
            java.util.HashMap<java.lang.String, y0.d> r11 = r6.f22749y
            java.lang.String r13 = "translationY"
            if (r11 != 0) goto L_0x02ae
            r11 = 0
            goto L_0x02b4
        L_0x02ae:
            java.lang.Object r11 = r11.get(r13)
            v0.j r11 = (p279v0.C6831j) r11
        L_0x02b4:
            r14 = r11
            java.util.HashMap<java.lang.String, y0.c> r11 = r6.f22750z
            if (r11 != 0) goto L_0x02bb
            r11 = 0
            goto L_0x02c1
        L_0x02bb:
            java.lang.Object r11 = r11.get(r12)
            y0.c r11 = (p317y0.C7239c) r11
        L_0x02c1:
            java.util.HashMap<java.lang.String, y0.c> r12 = r6.f22750z
            if (r12 != 0) goto L_0x02c7
            r12 = 0
            goto L_0x02cd
        L_0x02c7:
            java.lang.Object r12 = r12.get(r13)
            y0.c r12 = (p317y0.C7239c) r12
        L_0x02cd:
            r13 = r12
            r12 = 0
        L_0x02cf:
            if (r12 >= r2) goto L_0x03db
            r17 = r2
            float r2 = (float) r12
            float r2 = r2 * r5
            r19 = r5
            float r5 = r6.f22738n
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x02fe
            float r10 = r6.f22737m
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 >= 0) goto L_0x02e5
            r2 = 0
        L_0x02e5:
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x02fe
            r20 = r7
            r21 = r8
            double r7 = (double) r2
            r22 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r16 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r16 >= 0) goto L_0x0302
            float r2 = r2 - r10
            float r2 = r2 * r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r5)
            goto L_0x0302
        L_0x02fe:
            r20 = r7
            r21 = r8
        L_0x0302:
            double r7 = (double) r2
            z0.p r5 = r6.f22730f
            v0.c r5 = r5.f22752b
            java.util.ArrayList<z0.p> r10 = r6.f22745u
            java.util.Iterator r10 = r10.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
            r22 = 0
        L_0x0311:
            boolean r23 = r10.hasNext()
            if (r23 == 0) goto L_0x033f
            java.lang.Object r23 = r10.next()
            r24 = r7
            r7 = r23
            z0.p r7 = (p328z0.C7396p) r7
            v0.c r8 = r7.f22752b
            if (r8 == 0) goto L_0x033c
            r23 = r8
            float r8 = r7.f22754d
            int r26 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r26 >= 0) goto L_0x0332
            r22 = r8
            r5 = r23
            goto L_0x033c
        L_0x0332:
            boolean r8 = java.lang.Float.isNaN(r16)
            if (r8 == 0) goto L_0x033c
            float r7 = r7.f22754d
            r16 = r7
        L_0x033c:
            r7 = r24
            goto L_0x0311
        L_0x033f:
            r24 = r7
            if (r5 == 0) goto L_0x035d
            boolean r7 = java.lang.Float.isNaN(r16)
            if (r7 == 0) goto L_0x034b
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x034b:
            float r7 = r2 - r22
            float r16 = r16 - r22
            float r7 = r7 / r16
            double r7 = (double) r7
            double r7 = r5.mo23049a(r7)
            float r5 = (float) r7
            float r5 = r5 * r16
            float r5 = r5 + r22
            double r7 = (double) r5
            goto L_0x035f
        L_0x035d:
            r7 = r24
        L_0x035f:
            v0.b[] r5 = r6.f22734j
            r10 = 0
            r5 = r5[r10]
            double[] r10 = r6.f22740p
            r5.mo23037c(r7, r10)
            v0.a r5 = r6.f22735k
            if (r5 == 0) goto L_0x0378
            double[] r10 = r6.f22740p
            r16 = r11
            int r11 = r10.length
            if (r11 <= 0) goto L_0x037a
            r5.mo23037c(r7, r10)
            goto L_0x037a
        L_0x0378:
            r16 = r11
        L_0x037a:
            z0.p r10 = r6.f22730f
            int[] r5 = r6.f22739o
            double[] r11 = r6.f22740p
            int r22 = r12 * 2
            r23 = r12
            r0 = r16
            r16 = r11
            r11 = r7
            r7 = r13
            r13 = r5
            r5 = r14
            r14 = r16
            r8 = r15
            r15 = r4
            r16 = r22
            r10.mo23628c(r11, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x03a1
            r10 = r4[r22]
            float r11 = r0.mo23055a(r2)
            float r11 = r11 + r10
            r4[r22] = r11
            goto L_0x03ac
        L_0x03a1:
            if (r8 == 0) goto L_0x03ac
            r10 = r4[r22]
            float r11 = r8.mo23064a(r2)
            float r11 = r11 + r10
            r4[r22] = r11
        L_0x03ac:
            if (r7 == 0) goto L_0x03ba
            int r22 = r22 + 1
            r10 = r4[r22]
            float r2 = r7.mo23055a(r2)
            float r2 = r2 + r10
            r4[r22] = r2
            goto L_0x03c7
        L_0x03ba:
            if (r5 == 0) goto L_0x03c7
            int r22 = r22 + 1
            r10 = r4[r22]
            float r2 = r5.mo23064a(r2)
            float r2 = r2 + r10
            r4[r22] = r2
        L_0x03c7:
            int r12 = r23 + 1
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = r0
            r14 = r5
            r13 = r7
            r15 = r8
            r2 = r17
            r5 = r19
            r7 = r20
            r8 = r21
            r0 = r27
            goto L_0x02cf
        L_0x03db:
            r20 = r7
            r21 = r8
            int r0 = r3.f2739k
            r3.mo2988a(r1, r9, r0, r6)
            android.graphics.Paint r0 = r3.f2733e
            r2 = -21965(0xffffffffffffaa33, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f2734f
            r2 = -2067046(0xffffffffffe0759a, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f2737i
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f2735g
            r2 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r0.setColor(r2)
            int r0 = r3.f2741m
            int r0 = -r0
            float r0 = (float) r0
            r1.translate(r0, r0)
            int r0 = r3.f2739k
            r3.mo2988a(r1, r9, r0, r6)
            r0 = 5
            if (r9 != r0) goto L_0x0512
            android.graphics.Path r0 = r3.f2732d
            r0.reset()
            r0 = 0
        L_0x0415:
            r2 = 50
            if (r0 > r2) goto L_0x04ea
            float r4 = (float) r0
            float r2 = (float) r2
            float r4 = r4 / r2
            float[] r2 = r3.f2738j
            r5 = 0
            float r4 = r6.mo23620b(r5, r4)
            v0.b[] r5 = r6.f22734j
            r7 = 0
            r5 = r5[r7]
            double r7 = (double) r4
            double[] r4 = r6.f22740p
            r5.mo23037c(r7, r4)
            z0.p r4 = r6.f22730f
            int[] r5 = r6.f22739o
            double[] r7 = r6.f22740p
            float r8 = r4.f22756f
            float r9 = r4.f22757g
            float r10 = r4.f22758h
            float r11 = r4.f22759i
            r12 = 0
        L_0x043d:
            int r13 = r5.length
            if (r12 >= r13) goto L_0x045c
            r13 = r7[r12]
            float r13 = (float) r13
            r14 = r5[r12]
            r15 = 1
            if (r14 == r15) goto L_0x0458
            r15 = 2
            if (r14 == r15) goto L_0x0456
            r15 = 3
            if (r14 == r15) goto L_0x0454
            r15 = 4
            if (r14 == r15) goto L_0x0452
            goto L_0x0459
        L_0x0452:
            r11 = r13
            goto L_0x0459
        L_0x0454:
            r10 = r13
            goto L_0x0459
        L_0x0456:
            r9 = r13
            goto L_0x0459
        L_0x0458:
            r8 = r13
        L_0x0459:
            int r12 = r12 + 1
            goto L_0x043d
        L_0x045c:
            z0.n r4 = r4.f22764n
            if (r4 == 0) goto L_0x0484
            r4 = 0
            double r4 = (double) r4
            double r7 = (double) r8
            double r12 = (double) r9
            double r14 = java.lang.Math.sin(r12)
            double r14 = r14 * r7
            double r14 = r14 + r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r9 = r10 / r9
            r16 = r0
            double r0 = (double) r9
            double r14 = r14 - r0
            float r0 = (float) r14
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r7
            double r4 = r4 - r12
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r11 / r1
            double r7 = (double) r1
            double r4 = r4 - r7
            float r9 = (float) r4
            r8 = r0
            goto L_0x0486
        L_0x0484:
            r16 = r0
        L_0x0486:
            float r10 = r10 + r8
            float r11 = r11 + r9
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r0)
            java.lang.Float.isNaN(r0)
            r0 = 0
            float r8 = r8 + r0
            float r9 = r9 + r0
            float r10 = r10 + r0
            float r11 = r11 + r0
            r0 = 0
            r2[r0] = r8
            r0 = 1
            r2[r0] = r9
            r0 = 2
            r2[r0] = r10
            r0 = 3
            r2[r0] = r9
            r0 = 4
            r2[r0] = r10
            r0 = 5
            r2[r0] = r11
            r0 = 6
            r2[r0] = r8
            r1 = 7
            r2[r1] = r11
            android.graphics.Path r2 = r3.f2732d
            float[] r4 = r3.f2738j
            r5 = 0
            r5 = r4[r5]
            r7 = 1
            r4 = r4[r7]
            r2.moveTo(r5, r4)
            android.graphics.Path r2 = r3.f2732d
            float[] r4 = r3.f2738j
            r5 = 2
            r5 = r4[r5]
            r7 = 3
            r4 = r4[r7]
            r2.lineTo(r5, r4)
            android.graphics.Path r2 = r3.f2732d
            float[] r4 = r3.f2738j
            r5 = 4
            r5 = r4[r5]
            r7 = 5
            r4 = r4[r7]
            r2.lineTo(r5, r4)
            android.graphics.Path r2 = r3.f2732d
            float[] r4 = r3.f2738j
            r0 = r4[r0]
            r1 = r4[r1]
            r2.lineTo(r0, r1)
            android.graphics.Path r0 = r3.f2732d
            r0.close()
            int r0 = r16 + 1
            r1 = r28
            goto L_0x0415
        L_0x04ea:
            android.graphics.Paint r0 = r3.f2733e
            r1 = 1140850688(0x44000000, float:512.0)
            r0.setColor(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r28
            r1.translate(r0, r0)
            android.graphics.Path r0 = r3.f2732d
            android.graphics.Paint r2 = r3.f2733e
            r1.drawPath(r0, r2)
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.translate(r0, r0)
            android.graphics.Paint r0 = r3.f2733e
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r0.setColor(r2)
            android.graphics.Path r0 = r3.f2732d
            android.graphics.Paint r2 = r3.f2733e
            r1.drawPath(r0, r2)
        L_0x0512:
            r5 = r1
            goto L_0x0518
        L_0x0514:
            r20 = r7
            r21 = r8
        L_0x0518:
            r2 = 0
            r0 = r27
            r4 = r18
            r7 = r20
            r8 = r21
            goto L_0x01b0
        L_0x0523:
            r28.restore()
        L_0x0526:
            r0 = r27
        L_0x0528:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r0.f2684R
            if (r1 == 0) goto L_0x0540
            java.util.Iterator r1 = r1.iterator()
        L_0x0530:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0540
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.getClass()
            goto L_0x0530
        L_0x0540:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final void mo2929e(boolean z) {
        float f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C7394n nVar = this.f2704r.get(getChildAt(i));
            if (nVar != null && Events.VALUE_TYPE_BUTTON.equals(C7376a.m16989d(nVar.f22726b)) && nVar.f22717A != null) {
                int i2 = 0;
                while (true) {
                    C7390k[] kVarArr = nVar.f22717A;
                    if (i2 >= kVarArr.length) {
                        break;
                    }
                    C7390k kVar = kVarArr[i2];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    kVar.mo23612h(nVar.f22726b, f);
                    i2++;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x020e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0170  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2930f(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            long r1 = r0.f2714w
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r22.getNanoTime()
            r0.f2714w = r1
        L_0x0010:
            float r1 = r0.f2712v
            r2 = -1
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            r0.f2694m = r2
        L_0x0020:
            boolean r5 = r0.f2681O
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x0032
            boolean r5 = r0.f2720z
            if (r5 == 0) goto L_0x0240
            if (r23 != 0) goto L_0x0032
            float r5 = r0.f2716x
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0240
        L_0x0032:
            float r5 = r0.f2716x
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = r22.getNanoTime()
            z0.o r5 = r0.f2689i
            boolean r10 = r5 instanceof p328z0.C7395o
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.f2714w
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f2708t
            float r10 = r10 / r12
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            float r12 = r0.f2712v
            float r12 = r12 + r10
            boolean r13 = r0.f2718y
            if (r13 == 0) goto L_0x005d
            float r12 = r0.f2716x
        L_0x005d:
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.f2716x
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.f2716x
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.f2716x
            r0.f2720z = r6
            r14 = 1
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            r0.f2712v = r12
            r0.f2710u = r12
            r0.f2714w = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto L_0x0103
            if (r14 != 0) goto L_0x0103
            boolean r14 = r0.f2664D
            if (r14 == 0) goto L_0x00e5
            long r2 = r0.f2706s
            long r2 = r8 - r2
            float r2 = (float) r2
            float r2 = r2 * r11
            float r2 = r5.getInterpolation(r2)
            z0.o r3 = r0.f2689i
            y0.b r5 = r0.f2666E
            r10 = 2
            if (r3 != r5) goto L_0x00a7
            v0.m r3 = r5.f22391c
            boolean r3 = r3.mo23069b()
            if (r3 == 0) goto L_0x00a5
            r3 = 2
            goto L_0x00a8
        L_0x00a5:
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            r0.f2712v = r2
            r0.f2714w = r8
            z0.o r5 = r0.f2689i
            boolean r8 = r5 instanceof p328z0.C7395o
            if (r8 == 0) goto L_0x0107
            float r5 = r5.mo2986a()
            r0.f2691k = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.f2708t
            float r8 = r8 * r9
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x00c8
            if (r3 != r10) goto L_0x00c8
            r0.f2720z = r6
        L_0x00c8:
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d7
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x00d7
            r0.f2712v = r4
            r0.f2720z = r6
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00d7:
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0107
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0107
            r0.f2712v = r8
            r0.f2720z = r6
            r2 = 0
            goto L_0x0107
        L_0x00e5:
            float r2 = r5.getInterpolation(r12)
            z0.o r3 = r0.f2689i
            boolean r5 = r3 instanceof p328z0.C7395o
            if (r5 == 0) goto L_0x00f6
            float r3 = r3.mo2986a()
            r0.f2691k = r3
            goto L_0x0101
        L_0x00f6:
            float r12 = r12 + r10
            float r3 = r3.getInterpolation(r12)
            float r3 = r3 - r2
            float r3 = r3 * r1
            float r3 = r3 / r10
            r0.f2691k = r3
        L_0x0101:
            r12 = r2
            goto L_0x0105
        L_0x0103:
            r0.f2691k = r10
        L_0x0105:
            r2 = r12
            r3 = 0
        L_0x0107:
            float r5 = r0.f2691k
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0116
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r5)
        L_0x0116:
            if (r3 == r7) goto L_0x013f
            if (r13 <= 0) goto L_0x0120
            float r3 = r0.f2716x
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x012b
        L_0x0120:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x012f
            float r3 = r0.f2716x
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x012f
        L_0x012b:
            float r2 = r0.f2716x
            r0.f2720z = r6
        L_0x012f:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0138
            r3 = 0
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x013f
        L_0x0138:
            r0.f2720z = r6
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x013f:
            int r3 = r22.getChildCount()
            r0.f2681O = r6
            long r8 = r22.getNanoTime()
            r0.f2713v0 = r2
            android.view.animation.Interpolator r5 = r0.f2690j
            if (r5 != 0) goto L_0x0151
            r5 = r2
            goto L_0x0155
        L_0x0151:
            float r5 = r5.getInterpolation(r2)
        L_0x0155:
            android.view.animation.Interpolator r10 = r0.f2690j
            if (r10 == 0) goto L_0x016d
            float r11 = r0.f2708t
            float r11 = r1 / r11
            float r11 = r11 + r2
            float r10 = r10.getInterpolation(r11)
            r0.f2691k = r10
            android.view.animation.Interpolator r11 = r0.f2690j
            float r11 = r11.getInterpolation(r2)
            float r10 = r10 - r11
            r0.f2691k = r10
        L_0x016d:
            r10 = 0
        L_0x016e:
            if (r10 >= r3) goto L_0x0196
            android.view.View r11 = r0.getChildAt(r10)
            java.util.HashMap<android.view.View, z0.n> r12 = r0.f2704r
            java.lang.Object r12 = r12.get(r11)
            r16 = r12
            z0.n r16 = (p328z0.C7394n) r16
            if (r16 == 0) goto L_0x0193
            boolean r12 = r0.f2681O
            e0.j0 r15 = r0.f2715w0
            r17 = r5
            r18 = r8
            r20 = r11
            r21 = r15
            boolean r11 = r16.mo23623e(r17, r18, r20, r21)
            r11 = r11 | r12
            r0.f2681O = r11
        L_0x0193:
            int r10 = r10 + 1
            goto L_0x016e
        L_0x0196:
            if (r13 <= 0) goto L_0x019e
            float r3 = r0.f2716x
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a9
        L_0x019e:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x01ab
            float r3 = r0.f2716x
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01ab
        L_0x01a9:
            r3 = 1
            goto L_0x01ac
        L_0x01ab:
            r3 = 0
        L_0x01ac:
            boolean r5 = r0.f2681O
            if (r5 != 0) goto L_0x01bb
            boolean r5 = r0.f2720z
            if (r5 != 0) goto L_0x01bb
            if (r3 == 0) goto L_0x01bb
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r5)
        L_0x01bb:
            boolean r5 = r0.f2699o0
            if (r5 == 0) goto L_0x01c2
            r22.requestLayout()
        L_0x01c2:
            boolean r5 = r0.f2681O
            r3 = r3 ^ r7
            r3 = r3 | r5
            r0.f2681O = r3
            r3 = 0
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x01e7
            int r3 = r0.f2692l
            r5 = -1
            if (r3 == r5) goto L_0x01e7
            int r5 = r0.f2694m
            if (r5 == r3) goto L_0x01e7
            r0.f2694m = r3
            androidx.constraintlayout.motion.widget.a r5 = r0.f2688h
            androidx.constraintlayout.widget.a r3 = r5.mo3001b(r3)
            r3.mo3235a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r6 = 1
        L_0x01e7:
            double r8 = (double) r2
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x0205
            int r3 = r0.f2694m
            int r5 = r0.f2696n
            if (r3 == r5) goto L_0x0205
            r0.f2694m = r5
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            androidx.constraintlayout.widget.a r3 = r3.mo3001b(r5)
            r3.mo3235a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r6 = 1
        L_0x0205:
            boolean r3 = r0.f2681O
            if (r3 != 0) goto L_0x0223
            boolean r3 = r0.f2720z
            if (r3 == 0) goto L_0x020e
            goto L_0x0223
        L_0x020e:
            if (r13 <= 0) goto L_0x0214
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x021d
        L_0x0214:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0226
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0226
        L_0x021d:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            goto L_0x0226
        L_0x0223:
            r22.invalidate()
        L_0x0226:
            boolean r3 = r0.f2681O
            if (r3 != 0) goto L_0x0240
            boolean r3 = r0.f2720z
            if (r3 != 0) goto L_0x0240
            if (r13 <= 0) goto L_0x0234
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x023d
        L_0x0234:
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0240
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0240
        L_0x023d:
            r22.mo2979v()
        L_0x0240:
            float r1 = r0.f2712v
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0252
            int r1 = r0.f2694m
            int r2 = r0.f2696n
            if (r1 == r2) goto L_0x024d
            goto L_0x024e
        L_0x024d:
            r7 = r6
        L_0x024e:
            r0.f2694m = r2
        L_0x0250:
            r6 = r7
            goto L_0x0262
        L_0x0252:
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0262
            int r1 = r0.f2694m
            int r2 = r0.f2692l
            if (r1 == r2) goto L_0x025e
            goto L_0x025f
        L_0x025e:
            r7 = r6
        L_0x025f:
            r0.f2694m = r2
            goto L_0x0250
        L_0x0262:
            boolean r1 = r0.f2667E0
            r1 = r1 | r6
            r0.f2667E0 = r1
            if (r6 == 0) goto L_0x0270
            boolean r1 = r0.f2717x0
            if (r1 != 0) goto L_0x0270
            r22.requestLayout()
        L_0x0270:
            float r1 = r0.f2712v
            r0.f2710u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2930f(boolean):void");
    }

    public int[] getConstraintSetIds() {
        C0717a aVar = this.f2688h;
        if (aVar == null) {
            return null;
        }
        int size = aVar.f2763g.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = aVar.f2763g.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f2694m;
    }

    public ArrayList<C0717a.C0719b> getDefinedTransitions() {
        C0717a aVar = this.f2688h;
        if (aVar == null) {
            return null;
        }
        return aVar.f2760d;
    }

    public C7377b getDesignTool() {
        if (this.f2670G == null) {
            this.f2670G = new C7377b();
        }
        return this.f2670G;
    }

    public int getEndState() {
        return this.f2696n;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f2712v;
    }

    public C0717a getScene() {
        return this.f2688h;
    }

    public int getStartState() {
        return this.f2692l;
    }

    public float getTargetPosition() {
        return this.f2716x;
    }

    public Bundle getTransitionState() {
        if (this.f2719y0 == null) {
            this.f2719y0 = new C0715h();
        }
        C0715h hVar = this.f2719y0;
        MotionLayout motionLayout = MotionLayout.this;
        hVar.f2755d = motionLayout.f2696n;
        hVar.f2754c = motionLayout.f2692l;
        hVar.f2753b = motionLayout.getVelocity();
        hVar.f2752a = MotionLayout.this.getProgress();
        C0715h hVar2 = this.f2719y0;
        hVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.f2752a);
        bundle.putFloat("motion.velocity", hVar2.f2753b);
        bundle.putInt("motion.StartState", hVar2.f2754c);
        bundle.putInt("motion.EndState", hVar2.f2755d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            this.f2708t = ((float) aVar.mo3002c()) / 1000.0f;
        }
        return (long) (this.f2708t * 1000.0f);
    }

    public float getVelocity() {
        return this.f2691k;
    }

    /* renamed from: i */
    public final void mo1280i(int i, View view) {
        C0721b bVar;
        float f;
        boolean z;
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            float f2 = this.f2680N;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                float f4 = this.f2677K / f2;
                float f5 = this.f2678L / f2;
                C0717a.C0719b bVar2 = aVar.f2759c;
                if (bVar2 != null && (bVar = bVar2.f2788l) != null) {
                    boolean z2 = false;
                    bVar.f2816m = false;
                    float progress = bVar.f2821r.getProgress();
                    bVar.f2821r.mo2958r(bVar.f2807d, progress, bVar.f2811h, bVar.f2810g, bVar.f2817n);
                    float f6 = bVar.f2814k;
                    float[] fArr = bVar.f2817n;
                    float f7 = fArr[0];
                    float f8 = bVar.f2815l;
                    float f9 = fArr[1];
                    if (f6 != BitmapDescriptorFactory.HUE_RED) {
                        f = (f4 * f6) / f7;
                    } else {
                        f = (f5 * f8) / f9;
                    }
                    if (!Float.isNaN(f)) {
                        progress += f / 3.0f;
                    }
                    if (progress != BitmapDescriptorFactory.HUE_RED) {
                        if (progress != 1.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i2 = bVar.f2806c;
                        if (i2 != 3) {
                            z2 = true;
                        }
                        if (z2 && z) {
                            MotionLayout motionLayout = bVar.f2821r;
                            if (((double) progress) >= 0.5d) {
                                f3 = 1.0f;
                            }
                            motionLayout.mo2923A(f3, f, i2);
                        }
                    }
                }
            }
        }
    }

    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j */
    public final void mo1281j(View view, View view2, int i, int i2) {
        this.f2679M = getNanoTime();
        this.f2680N = BitmapDescriptorFactory.HUE_RED;
        this.f2677K = BitmapDescriptorFactory.HUE_RED;
        this.f2678L = BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* renamed from: k */
    public final void mo1282k(View view, int i, int i2, int[] iArr, int i3) {
        C0717a.C0719b bVar;
        boolean z;
        boolean z2;
        ? r1;
        C0721b bVar2;
        float f;
        float f2;
        C0721b bVar3;
        C0721b bVar4;
        C0721b bVar5;
        int i4;
        View view2 = view;
        int i5 = i;
        int i6 = i2;
        C0717a aVar = this.f2688h;
        if (aVar != null && (bVar = aVar.f2759c) != null && z) {
            int i7 = -1;
            if (!(!bVar.f2791o) || (bVar5 = bVar.f2788l) == null || (i4 = bVar5.f2808e) == -1 || view.getId() == i4) {
                C0717a.C0719b bVar6 = aVar.f2759c;
                if (bVar6 == null || (bVar4 = bVar6.f2788l) == null) {
                    z2 = false;
                } else {
                    z2 = bVar4.f2824u;
                }
                if (z2) {
                    C0721b bVar7 = bVar.f2788l;
                    if (!(bVar7 == null || (bVar7.f2826w & 4) == 0)) {
                        i7 = i6;
                    }
                    float f3 = this.f2710u;
                    if ((f3 == 1.0f || f3 == BitmapDescriptorFactory.HUE_RED) && view2.canScrollVertically(i7)) {
                        return;
                    }
                }
                C0721b bVar8 = bVar.f2788l;
                if (!(bVar8 == null || (bVar8.f2826w & 1) == 0)) {
                    float f4 = (float) i5;
                    float f5 = (float) i6;
                    C0717a.C0719b bVar9 = aVar.f2759c;
                    if (bVar9 == null || (bVar3 = bVar9.f2788l) == null) {
                        f2 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        float progress = bVar3.f2821r.getProgress();
                        bVar3.f2821r.mo2958r(bVar3.f2807d, progress, bVar3.f2811h, bVar3.f2810g, bVar3.f2817n);
                        float f6 = bVar3.f2814k;
                        if (f6 != BitmapDescriptorFactory.HUE_RED) {
                            float[] fArr = bVar3.f2817n;
                            if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                                fArr[0] = 1.0E-7f;
                            }
                            f2 = (f4 * f6) / fArr[0];
                        } else {
                            float[] fArr2 = bVar3.f2817n;
                            if (fArr2[1] == BitmapDescriptorFactory.HUE_RED) {
                                fArr2[1] = 1.0E-7f;
                            }
                            f2 = (f5 * bVar3.f2815l) / fArr2[1];
                        }
                    }
                    float f7 = this.f2712v;
                    if ((f7 <= BitmapDescriptorFactory.HUE_RED && f2 < BitmapDescriptorFactory.HUE_RED) || (f7 >= 1.0f && f2 > BitmapDescriptorFactory.HUE_RED)) {
                        view2.setNestedScrollingEnabled(false);
                        view2.post(new C0708a(view2));
                        return;
                    }
                }
                float f8 = this.f2710u;
                long nanoTime = getNanoTime();
                float f9 = (float) i5;
                this.f2677K = f9;
                float f11 = (float) i6;
                this.f2678L = f11;
                this.f2680N = (float) (((double) (nanoTime - this.f2679M)) * 1.0E-9d);
                this.f2679M = nanoTime;
                C0717a.C0719b bVar10 = aVar.f2759c;
                if (!(bVar10 == null || (bVar2 = bVar10.f2788l) == null)) {
                    float progress2 = bVar2.f2821r.getProgress();
                    if (!bVar2.f2816m) {
                        bVar2.f2816m = true;
                        bVar2.f2821r.setProgress(progress2);
                    }
                    bVar2.f2821r.mo2958r(bVar2.f2807d, progress2, bVar2.f2811h, bVar2.f2810g, bVar2.f2817n);
                    float f12 = bVar2.f2814k;
                    float[] fArr3 = bVar2.f2817n;
                    if (((double) Math.abs((bVar2.f2815l * fArr3[1]) + (f12 * fArr3[0]))) < 0.01d) {
                        float[] fArr4 = bVar2.f2817n;
                        fArr4[0] = 0.01f;
                        fArr4[1] = 0.01f;
                    }
                    float f13 = bVar2.f2814k;
                    if (f13 != BitmapDescriptorFactory.HUE_RED) {
                        f = (f9 * f13) / bVar2.f2817n[0];
                    } else {
                        f = (f11 * bVar2.f2815l) / bVar2.f2817n[1];
                    }
                    float max = Math.max(Math.min(progress2 + f, 1.0f), BitmapDescriptorFactory.HUE_RED);
                    if (max != bVar2.f2821r.getProgress()) {
                        bVar2.f2821r.setProgress(max);
                    }
                }
                if (f8 != this.f2710u) {
                    iArr[0] = i5;
                    r1 = 1;
                    iArr[1] = i6;
                } else {
                    r1 = 1;
                }
                mo2930f(false);
                if (iArr[0] != 0 || iArr[r1] != 0) {
                    this.f2676J = r1;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo2945l() {
        CopyOnWriteArrayList<C0716i> copyOnWriteArrayList;
        if ((this.f2658A != null || ((copyOnWriteArrayList = this.f2685S) != null && !copyOnWriteArrayList.isEmpty())) && this.f2697n0 != this.f2710u) {
            if (this.f2695m0 != -1) {
                C0716i iVar = this.f2658A;
                if (iVar != null) {
                    iVar.mo2920d();
                }
                CopyOnWriteArrayList<C0716i> copyOnWriteArrayList2 = this.f2685S;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0716i> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2920d();
                    }
                }
            }
            this.f2695m0 = -1;
            this.f2697n0 = this.f2710u;
            C0716i iVar2 = this.f2658A;
            if (iVar2 != null) {
                iVar2.mo2852c();
            }
            CopyOnWriteArrayList<C0716i> copyOnWriteArrayList3 = this.f2685S;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0716i> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2852c();
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo1284n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f2676J && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f2676J = false;
    }

    /* renamed from: o */
    public final void mo1285o(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final void onAttachedToWindow() {
        C0717a.C0719b bVar;
        int i;
        boolean z;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        C0717a aVar = this.f2688h;
        if (!(aVar == null || (i = this.f2694m) == -1)) {
            C0738a b = aVar.mo3001b(i);
            C0717a aVar2 = this.f2688h;
            for (int i2 = 0; i2 < aVar2.f2763g.size(); i2++) {
                int keyAt = aVar2.f2763g.keyAt(i2);
                int i3 = aVar2.f2765i.get(keyAt);
                int size = aVar2.f2765i.size();
                while (true) {
                    if (i3 <= 0) {
                        z = false;
                        break;
                    } else if (i3 == keyAt) {
                        break;
                    } else {
                        int i4 = size - 1;
                        if (size < 0) {
                            break;
                        }
                        i3 = aVar2.f2765i.get(i3);
                        size = i4;
                    }
                }
                z = true;
                if (z) {
                    break;
                }
                aVar2.mo3012m(keyAt, this);
            }
            ArrayList<MotionHelper> arrayList = this.f2684R;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            if (b != null) {
                b.mo3236b(this);
            }
            this.f2692l = this.f2694m;
        }
        mo2979v();
        C0715h hVar = this.f2719y0;
        if (hVar == null) {
            C0717a aVar3 = this.f2688h;
            if (aVar3 != null && (bVar = aVar3.f2759c) != null && bVar.f2790n == 4) {
                mo2927d(1.0f);
                this.f2721z0 = null;
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.f2661B0) {
            post(new C0709b());
        } else {
            hVar.mo2999a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0721b bVar;
        int i;
        RectF b;
        int currentState;
        C0738a aVar;
        boolean z;
        C0722c cVar;
        C0717a aVar2 = this.f2688h;
        if (aVar2 != null && this.f2702q) {
            C0724d dVar = aVar2.f2773q;
            if (!(dVar == null || (currentState = dVar.f2864a.getCurrentState()) == -1)) {
                if (dVar.f2866c == null) {
                    dVar.f2866c = new HashSet<>();
                    Iterator<C0722c> it = dVar.f2865b.iterator();
                    while (it.hasNext()) {
                        C0722c next = it.next();
                        int childCount = dVar.f2864a.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = dVar.f2864a.getChildAt(i2);
                            if (next.mo3024c(childAt)) {
                                childAt.getId();
                                dVar.f2866c.add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<C0722c.C0723a> arrayList = dVar.f2867d;
                int i3 = 2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<C0722c.C0723a> it2 = dVar.f2867d.iterator();
                    while (it2.hasNext()) {
                        C0722c.C0723a next2 = it2.next();
                        if (action != 1) {
                            if (action != 2) {
                                next2.getClass();
                            } else {
                                next2.f2853c.f22726b.getHitRect(next2.f2862l);
                                if (!next2.f2862l.contains((int) x, (int) y) && !next2.f2858h) {
                                    next2.mo3028b();
                                }
                            }
                        } else if (!next2.f2858h) {
                            next2.mo3028b();
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    C0717a aVar3 = dVar.f2864a.f2688h;
                    if (aVar3 == null) {
                        aVar = null;
                    } else {
                        aVar = aVar3.mo3001b(currentState);
                    }
                    C0738a aVar4 = aVar;
                    Iterator<C0722c> it3 = dVar.f2865b.iterator();
                    while (it3.hasNext()) {
                        C0722c next3 = it3.next();
                        int i4 = next3.f2831b;
                        if (i4 != 1 ? i4 != i3 ? !(i4 == 3 && action == 0) : action != 1 : action != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            Iterator<View> it4 = dVar.f2866c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.mo3024c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        cVar = next3;
                                        next3.mo3022a(dVar, dVar.f2864a, currentState, aVar4, next4);
                                    } else {
                                        cVar = next3;
                                    }
                                    next3 = cVar;
                                    i3 = 2;
                                }
                            }
                        }
                    }
                }
            }
            C0717a.C0719b bVar2 = this.f2688h.f2759c;
            if (bVar2 != null && (!bVar2.f2791o) && (bVar = bVar2.f2788l) != null && ((motionEvent.getAction() != 0 || (b = bVar.mo3019b(this, new RectF())) == null || b.contains(motionEvent.getX(), motionEvent.getY())) && (i = bVar.f2808e) != -1)) {
                View view = this.f2671G0;
                if (view == null || view.getId() != i) {
                    this.f2671G0 = findViewById(i);
                }
                View view2 = this.f2671G0;
                if (view2 != null) {
                    this.f2669F0.set((float) view2.getLeft(), (float) this.f2671G0.getTop(), (float) this.f2671G0.getRight(), (float) this.f2671G0.getBottom());
                    if (this.f2669F0.contains(motionEvent.getX(), motionEvent.getY())) {
                        if (!mo2976t((float) this.f2671G0.getLeft(), (float) this.f2671G0.getTop(), motionEvent, this.f2671G0)) {
                            return onTouchEvent(motionEvent);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2717x0 = true;
        try {
            if (this.f2688h == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f2672H == i5 && this.f2674I == i6)) {
                mo2981x();
                mo2930f(true);
            }
            this.f2672H = i5;
            this.f2674I = i6;
            this.f2717x0 = false;
        } finally {
            this.f2717x0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r9 != false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            if (r3 != 0) goto L_0x000e
            super.onMeasure(r18, r19)
            return
        L_0x000e:
            int r3 = r0.f2698o
            r4 = 0
            r5 = 1
            if (r3 != r1) goto L_0x001b
            int r3 = r0.f2700p
            if (r3 == r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            boolean r6 = r0.f2667E0
            if (r6 == 0) goto L_0x0029
            r0.f2667E0 = r4
            r17.mo2979v()
            r17.mo2980w()
            r3 = 1
        L_0x0029:
            boolean r6 = r0.mDirtyHierarchy
            if (r6 == 0) goto L_0x002e
            r3 = 1
        L_0x002e:
            r0.f2698o = r1
            r0.f2700p = r2
            androidx.constraintlayout.motion.widget.a r6 = r0.f2688h
            int r6 = r6.mo3007h()
            androidx.constraintlayout.motion.widget.a r7 = r0.f2688h
            androidx.constraintlayout.motion.widget.a$b r7 = r7.f2759c
            r8 = -1
            if (r7 != 0) goto L_0x0041
            r7 = -1
            goto L_0x0043
        L_0x0041:
            int r7 = r7.f2779c
        L_0x0043:
            if (r3 != 0) goto L_0x0055
            androidx.constraintlayout.motion.widget.MotionLayout$f r9 = r0.f2665D0
            int r10 = r9.f2747e
            if (r6 != r10) goto L_0x0052
            int r9 = r9.f2748f
            if (r7 == r9) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r9 = 0
            goto L_0x0053
        L_0x0052:
            r9 = 1
        L_0x0053:
            if (r9 == 0) goto L_0x007a
        L_0x0055:
            int r9 = r0.f2692l
            if (r9 == r8) goto L_0x007a
            super.onMeasure(r18, r19)
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = r0.f2665D0
            androidx.constraintlayout.motion.widget.a r2 = r0.f2688h
            androidx.constraintlayout.widget.a r2 = r2.mo3001b(r6)
            androidx.constraintlayout.motion.widget.a r3 = r0.f2688h
            androidx.constraintlayout.widget.a r3 = r3.mo3001b(r7)
            r1.mo2996e(r2, r3)
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = r0.f2665D0
            r1.mo2997f()
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = r0.f2665D0
            r1.f2747e = r6
            r1.f2748f = r7
            r1 = 0
            goto L_0x0080
        L_0x007a:
            if (r3 == 0) goto L_0x007f
            super.onMeasure(r18, r19)
        L_0x007f:
            r1 = 1
        L_0x0080:
            boolean r2 = r0.f2699o0
            if (r2 != 0) goto L_0x0086
            if (r1 == 0) goto L_0x00d7
        L_0x0086:
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r17.getPaddingLeft()
            int r3 = r17.getPaddingRight()
            int r3 = r3 + r1
            androidx.constraintlayout.core.widgets.d r1 = r0.mLayoutWidget
            int r1 = r1.mo2807u()
            int r1 = r1 + r3
            androidx.constraintlayout.core.widgets.d r3 = r0.mLayoutWidget
            int r3 = r3.mo2802o()
            int r3 = r3 + r2
            int r2 = r0.f2709t0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r6) goto L_0x00ae
            if (r2 != 0) goto L_0x00be
        L_0x00ae:
            int r1 = r0.f2701p0
            float r2 = (float) r1
            float r7 = r0.f2713v0
            int r8 = r0.f2705r0
            int r8 = r8 - r1
            float r1 = (float) r8
            float r7 = r7 * r1
            float r7 = r7 + r2
            int r1 = (int) r7
            r17.requestLayout()
        L_0x00be:
            int r2 = r0.f2711u0
            if (r2 == r6) goto L_0x00c4
            if (r2 != 0) goto L_0x00d4
        L_0x00c4:
            int r2 = r0.f2703q0
            float r3 = (float) r2
            float r6 = r0.f2713v0
            int r7 = r0.f2707s0
            int r7 = r7 - r2
            float r2 = (float) r7
            float r6 = r6 * r2
            float r6 = r6 + r3
            int r3 = (int) r6
            r17.requestLayout()
        L_0x00d4:
            r0.setMeasuredDimension(r1, r3)
        L_0x00d7:
            float r1 = r0.f2716x
            float r2 = r0.f2712v
            float r1 = r1 - r2
            float r1 = java.lang.Math.signum(r1)
            long r2 = r17.getNanoTime()
            z0.o r6 = r0.f2689i
            boolean r7 = r6 instanceof p317y0.C7238b
            r8 = 814313567(0x3089705f, float:1.0E-9)
            r9 = 0
            if (r7 != 0) goto L_0x00fb
            long r10 = r0.f2714w
            long r10 = r2 - r10
            float r7 = (float) r10
            float r7 = r7 * r1
            float r7 = r7 * r8
            float r10 = r0.f2708t
            float r7 = r7 / r10
            goto L_0x00fc
        L_0x00fb:
            r7 = 0
        L_0x00fc:
            float r10 = r0.f2712v
            float r10 = r10 + r7
            boolean r7 = r0.f2718y
            if (r7 == 0) goto L_0x0105
            float r10 = r0.f2716x
        L_0x0105:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x010f
            float r11 = r0.f2716x
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0119
        L_0x010f:
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x011c
            float r11 = r0.f2716x
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x011c
        L_0x0119:
            float r10 = r0.f2716x
            goto L_0x011d
        L_0x011c:
            r5 = 0
        L_0x011d:
            if (r6 == 0) goto L_0x0134
            if (r5 != 0) goto L_0x0134
            boolean r5 = r0.f2664D
            if (r5 == 0) goto L_0x0130
            long r10 = r0.f2706s
            long r2 = r2 - r10
            float r2 = (float) r2
            float r2 = r2 * r8
            float r10 = r6.getInterpolation(r2)
            goto L_0x0134
        L_0x0130:
            float r10 = r6.getInterpolation(r10)
        L_0x0134:
            if (r7 <= 0) goto L_0x013c
            float r2 = r0.f2716x
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0146
        L_0x013c:
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0148
            float r1 = r0.f2716x
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0148
        L_0x0146:
            float r10 = r0.f2716x
        L_0x0148:
            r0.f2713v0 = r10
            int r1 = r17.getChildCount()
            long r2 = r17.getNanoTime()
            android.view.animation.Interpolator r5 = r0.f2690j
            if (r5 != 0) goto L_0x0157
            goto L_0x015b
        L_0x0157:
            float r10 = r5.getInterpolation(r10)
        L_0x015b:
            if (r4 >= r1) goto L_0x0178
            android.view.View r15 = r0.getChildAt(r4)
            java.util.HashMap<android.view.View, z0.n> r5 = r0.f2704r
            java.lang.Object r5 = r5.get(r15)
            r11 = r5
            z0.n r11 = (p328z0.C7394n) r11
            if (r11 == 0) goto L_0x0175
            e0.j0 r5 = r0.f2715w0
            r12 = r10
            r13 = r2
            r16 = r5
            r11.mo23623e(r12, r13, r15, r16)
        L_0x0175:
            int r4 = r4 + 1
            goto L_0x015b
        L_0x0178:
            boolean r1 = r0.f2699o0
            if (r1 == 0) goto L_0x017f
            r17.requestLayout()
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i) {
        C0721b bVar;
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            boolean isRtl = isRtl();
            aVar.f2772p = isRtl;
            C0717a.C0719b bVar2 = aVar.f2759c;
            if (bVar2 != null && (bVar = bVar2.f2788l) != null) {
                bVar.mo3020c(isRtl);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x083d  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0844  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x084c  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x085b  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x085e  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0863 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            androidx.constraintlayout.motion.widget.a r2 = r0.f2688h
            if (r2 == 0) goto L_0x0865
            boolean r3 = r0.f2702q
            if (r3 == 0) goto L_0x0865
            boolean r2 = r2.mo3014o()
            if (r2 == 0) goto L_0x0865
            androidx.constraintlayout.motion.widget.a r2 = r0.f2688h
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f2759c
            r4 = 1
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.f2791o
            r3 = r3 ^ r4
            if (r3 != 0) goto L_0x0023
            boolean r1 = super.onTouchEvent(r30)
            return r1
        L_0x0023:
            int r3 = r29.getCurrentState()
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = r2.f2771o
            if (r6 != 0) goto L_0x003f
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r2.f2757a
            r6.getClass()
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = androidx.constraintlayout.motion.widget.MotionLayout.C0714g.f2750b
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.f2751a = r7
            r2.f2771o = r6
        L_0x003f:
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = r2.f2771o
            android.view.VelocityTracker r6 = r6.f2751a
            if (r6 == 0) goto L_0x0048
            r6.addMovement(r1)
        L_0x0048:
            r6 = 2
            r8 = -1
            if (r3 == r8) goto L_0x0220
            int r11 = r30.getAction()
            if (r11 == 0) goto L_0x01b6
            if (r11 == r6) goto L_0x0056
            goto L_0x0220
        L_0x0056:
            boolean r11 = r2.f2769m
            if (r11 == 0) goto L_0x005c
            goto L_0x0220
        L_0x005c:
            float r11 = r30.getRawY()
            float r12 = r2.f2775s
            float r11 = r11 - r12
            float r12 = r30.getRawX()
            float r13 = r2.f2774r
            float r12 = r12 - r13
            double r13 = (double) r12
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0076
            double r13 = (double) r11
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0224
        L_0x0076:
            android.view.MotionEvent r13 = r2.f2768l
            if (r13 != 0) goto L_0x007c
            goto L_0x0224
        L_0x007c:
            if (r3 == r8) goto L_0x017c
            a1.e r14 = r2.f2758b
            if (r14 == 0) goto L_0x0089
            int r14 = r14.mo21a(r3)
            if (r14 == r8) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r14 = r3
        L_0x008a:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r10 = r2.f2760d
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L_0x00b1
            java.lang.Object r17 = r10.next()
            r8 = r17
            androidx.constraintlayout.motion.widget.a$b r8 = (androidx.constraintlayout.motion.widget.C0717a.C0719b) r8
            int r6 = r8.f2780d
            if (r6 == r14) goto L_0x00ab
            int r6 = r8.f2779c
            if (r6 != r14) goto L_0x00ae
        L_0x00ab:
            r15.add(r8)
        L_0x00ae:
            r6 = 2
            r8 = -1
            goto L_0x0095
        L_0x00b1:
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            java.util.Iterator r8 = r15.iterator()
            r10 = 0
            r14 = 0
        L_0x00bc:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x017e
            java.lang.Object r15 = r8.next()
            androidx.constraintlayout.motion.widget.a$b r15 = (androidx.constraintlayout.motion.widget.C0717a.C0719b) r15
            boolean r4 = r15.f2791o
            if (r4 == 0) goto L_0x00ce
            goto L_0x0169
        L_0x00ce:
            androidx.constraintlayout.motion.widget.b r4 = r15.f2788l
            if (r4 == 0) goto L_0x0169
            boolean r7 = r2.f2772p
            r4.mo3020c(r7)
            androidx.constraintlayout.motion.widget.b r4 = r15.f2788l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.f2757a
            android.graphics.RectF r4 = r4.mo3019b(r7, r6)
            if (r4 == 0) goto L_0x00f1
            float r7 = r13.getX()
            float r9 = r13.getY()
            boolean r4 = r4.contains(r7, r9)
            if (r4 != 0) goto L_0x00f1
            goto L_0x0169
        L_0x00f1:
            androidx.constraintlayout.motion.widget.b r4 = r15.f2788l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.f2757a
            android.graphics.RectF r4 = r4.mo3018a(r7, r6)
            if (r4 == 0) goto L_0x010a
            float r7 = r13.getX()
            float r9 = r13.getY()
            boolean r4 = r4.contains(r7, r9)
            if (r4 != 0) goto L_0x010a
            goto L_0x0169
        L_0x010a:
            androidx.constraintlayout.motion.widget.b r4 = r15.f2788l
            float r7 = r4.f2814k
            float r7 = r7 * r12
            float r9 = r4.f2815l
            float r9 = r9 * r11
            float r9 = r9 + r7
            boolean r4 = r4.f2813j
            if (r4 == 0) goto L_0x014e
            float r4 = r13.getX()
            androidx.constraintlayout.motion.widget.b r7 = r15.f2788l
            r7.getClass()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 - r7
            float r9 = r13.getY()
            r18 = r6
            androidx.constraintlayout.motion.widget.b r6 = r15.f2788l
            r6.getClass()
            float r9 = r9 - r7
            float r6 = r12 + r4
            float r7 = r11 + r9
            r19 = r8
            double r7 = (double) r7
            r20 = r11
            r21 = r12
            double r11 = (double) r6
            double r6 = java.lang.Math.atan2(r7, r11)
            double r11 = (double) r4
            double r8 = (double) r9
            double r8 = java.lang.Math.atan2(r11, r8)
            double r6 = r6 - r8
            float r4 = (float) r6
            r6 = 1092616192(0x41200000, float:10.0)
            float r9 = r4 * r6
            goto L_0x0156
        L_0x014e:
            r18 = r6
            r19 = r8
            r20 = r11
            r21 = r12
        L_0x0156:
            int r4 = r15.f2779c
            if (r4 != r3) goto L_0x015d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0160
        L_0x015d:
            r4 = 1066192077(0x3f8ccccd, float:1.1)
        L_0x0160:
            float r4 = r4 * r9
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0171
            r10 = r4
            r14 = r15
            goto L_0x0171
        L_0x0169:
            r18 = r6
            r19 = r8
            r20 = r11
            r21 = r12
        L_0x0171:
            r6 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r4 = 1
            goto L_0x00bc
        L_0x017c:
            androidx.constraintlayout.motion.widget.a$b r14 = r2.f2759c
        L_0x017e:
            if (r14 == 0) goto L_0x0220
            r0.setTransition((androidx.constraintlayout.motion.widget.C0717a.C0719b) r14)
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f2759c
            androidx.constraintlayout.motion.widget.b r3 = r3.f2788l
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.f2757a
            android.graphics.RectF r3 = r3.mo3019b(r4, r5)
            if (r3 == 0) goto L_0x01a3
            android.view.MotionEvent r4 = r2.f2768l
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.f2768l
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L_0x01a3
            r3 = 1
            goto L_0x01a4
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            r2.f2770n = r3
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f2759c
            androidx.constraintlayout.motion.widget.b r3 = r3.f2788l
            float r4 = r2.f2774r
            float r5 = r2.f2775s
            r3.f2819p = r4
            r3.f2820q = r5
            r4 = 0
            r3.f2816m = r4
            goto L_0x0220
        L_0x01b6:
            r4 = 0
            float r3 = r30.getRawX()
            r2.f2774r = r3
            float r3 = r30.getRawY()
            r2.f2775s = r3
            r2.f2768l = r1
            r2.f2769m = r4
            androidx.constraintlayout.motion.widget.a$b r1 = r2.f2759c
            androidx.constraintlayout.motion.widget.b r1 = r1.f2788l
            if (r1 == 0) goto L_0x0224
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f2757a
            android.graphics.RectF r1 = r1.mo3018a(r3, r5)
            if (r1 == 0) goto L_0x01ee
            android.view.MotionEvent r3 = r2.f2768l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f2768l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x01ee
            r1 = 0
            r2.f2768l = r1
            r1 = 1
            r2.f2769m = r1
            goto L_0x0224
        L_0x01ee:
            androidx.constraintlayout.motion.widget.a$b r1 = r2.f2759c
            androidx.constraintlayout.motion.widget.b r1 = r1.f2788l
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f2757a
            android.graphics.RectF r1 = r1.mo3019b(r3, r5)
            if (r1 == 0) goto L_0x0210
            android.view.MotionEvent r3 = r2.f2768l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f2768l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x0210
            r1 = 1
            r2.f2770n = r1
            goto L_0x0213
        L_0x0210:
            r1 = 0
            r2.f2770n = r1
        L_0x0213:
            androidx.constraintlayout.motion.widget.a$b r1 = r2.f2759c
            androidx.constraintlayout.motion.widget.b r1 = r1.f2788l
            float r3 = r2.f2774r
            float r2 = r2.f2775s
            r1.f2819p = r3
            r1.f2820q = r2
            goto L_0x0224
        L_0x0220:
            boolean r3 = r2.f2769m
            if (r3 == 0) goto L_0x0227
        L_0x0224:
            r4 = 0
            goto L_0x084f
        L_0x0227:
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f2759c
            if (r3 == 0) goto L_0x0821
            androidx.constraintlayout.motion.widget.b r3 = r3.f2788l
            if (r3 == 0) goto L_0x0821
            boolean r4 = r2.f2770n
            if (r4 != 0) goto L_0x0821
            androidx.constraintlayout.motion.widget.MotionLayout$g r4 = r2.f2771o
            boolean r5 = r3.f2813j
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            if (r5 == 0) goto L_0x05c8
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x0245
            r5.addMovement(r1)
        L_0x0245:
            int r5 = r30.getAction()
            if (r5 == 0) goto L_0x05b7
            r18 = 1135869952(0x43b40000, float:360.0)
            r19 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r5 == r11) goto L_0x0419
            r11 = 2
            if (r5 == r11) goto L_0x0257
            goto L_0x0821
        L_0x0257:
            r30.getRawY()
            r30.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r19
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f2821r
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r19
            int r7 = r3.f2812i
            r8 = -1
            if (r7 == r8) goto L_0x02ad
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            android.view.View r5 = r5.findViewById(r7)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f2821r
            int[] r7 = r3.f2818o
            r6.getLocationOnScreen(r7)
            int[] r6 = r3.f2818o
            r7 = 0
            r6 = r6[r7]
            float r6 = (float) r6
            int r7 = r5.getLeft()
            int r8 = r5.getRight()
            int r8 = r8 + r7
            float r7 = (float) r8
            float r7 = r7 / r19
            float r6 = r6 + r7
            int[] r7 = r3.f2818o
            r8 = 1
            r7 = r7[r8]
            float r7 = (float) r7
            int r8 = r5.getTop()
            int r5 = r5.getBottom()
            int r5 = r5 + r8
            float r5 = (float) r5
            float r5 = r5 / r19
            float r5 = r5 + r7
            r28 = r6
            r6 = r5
            r5 = r28
            goto L_0x02fa
        L_0x02ad:
            int r7 = r3.f2807d
            r8 = -1
            if (r7 == r8) goto L_0x02fa
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f2821r
            java.util.HashMap<android.view.View, z0.n> r11 = r8.f2704r
            android.view.View r7 = r8.findViewById(r7)
            java.lang.Object r7 = r11.get(r7)
            z0.n r7 = (p328z0.C7394n) r7
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f2821r
            z0.p r7 = r7.f22730f
            int r7 = r7.f22762l
            android.view.View r7 = r8.findViewById(r7)
            if (r7 != 0) goto L_0x02cd
            goto L_0x02fa
        L_0x02cd:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            int[] r6 = r3.f2818o
            r5.getLocationOnScreen(r6)
            int[] r5 = r3.f2818o
            r6 = 0
            r5 = r5[r6]
            float r5 = (float) r5
            int r6 = r7.getLeft()
            int r8 = r7.getRight()
            int r8 = r8 + r6
            float r6 = (float) r8
            float r6 = r6 / r19
            float r5 = r5 + r6
            int[] r6 = r3.f2818o
            r8 = 1
            r6 = r6[r8]
            float r6 = (float) r6
            int r8 = r7.getTop()
            int r7 = r7.getBottom()
            int r7 = r7 + r8
            float r7 = (float) r7
            float r7 = r7 / r19
            float r6 = r6 + r7
        L_0x02fa:
            float r7 = r30.getRawX()
            float r7 = r7 - r5
            float r8 = r30.getRawY()
            float r8 = r8 - r6
            float r11 = r30.getRawY()
            float r11 = r11 - r6
            double r11 = (double) r11
            float r13 = r30.getRawX()
            float r13 = r13 - r5
            double r14 = (double) r13
            double r11 = java.lang.Math.atan2(r11, r14)
            float r13 = r3.f2820q
            float r13 = r13 - r6
            double r13 = (double) r13
            float r6 = r3.f2819p
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan2(r13, r5)
            double r5 = r11 - r5
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 / r13
            float r5 = (float) r5
            r6 = 1134886912(0x43a50000, float:330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0339
            float r5 = r5 - r18
            goto L_0x0341
        L_0x0339:
            r6 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0341
            float r5 = r5 + r18
        L_0x0341:
            float r6 = java.lang.Math.abs(r5)
            double r13 = (double) r6
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x034e
            boolean r6 = r3.f2816m
            if (r6 == 0) goto L_0x0821
        L_0x034e:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f2821r
            float r6 = r6.getProgress()
            boolean r9 = r3.f2816m
            if (r9 != 0) goto L_0x0360
            r9 = 1
            r3.f2816m = r9
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f2821r
            r9.setProgress(r6)
        L_0x0360:
            int r9 = r3.f2807d
            r10 = -1
            if (r9 == r10) goto L_0x038a
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f2821r
            float r13 = r3.f2811h
            float r14 = r3.f2810g
            float[] r15 = r3.f2817n
            r22 = r10
            r23 = r9
            r24 = r6
            r25 = r13
            r26 = r14
            r27 = r15
            r22.mo2958r(r23, r24, r25, r26, r27)
            float[] r9 = r3.f2817n
            r10 = 1
            r13 = r9[r10]
            double r13 = (double) r13
            double r13 = java.lang.Math.toDegrees(r13)
            float r13 = (float) r13
            r9[r10] = r13
            goto L_0x038f
        L_0x038a:
            r10 = 1
            float[] r9 = r3.f2817n
            r9[r10] = r18
        L_0x038f:
            float r9 = r3.f2825v
            float r5 = r5 * r9
            float[] r9 = r3.f2817n
            r9 = r9[r10]
            float r5 = r5 / r9
            float r5 = r5 + r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r6)
            r9 = 0
            float r5 = java.lang.Math.max(r5, r9)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f2821r
            float r10 = r10.getProgress()
            int r13 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x0406
            int r13 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x03b6
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x03c0
        L_0x03b6:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f2821r
            if (r13 != 0) goto L_0x03bc
            r9 = 1
            goto L_0x03bd
        L_0x03bc:
            r9 = 0
        L_0x03bd:
            r6.mo2929e(r9)
        L_0x03c0:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f2821r
            r6.setProgress(r5)
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x03ce
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r6)
        L_0x03ce:
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x03d7
            float r5 = r5.getXVelocity()
            goto L_0x03d8
        L_0x03d7:
            r5 = 0
        L_0x03d8:
            android.view.VelocityTracker r4 = r4.f2751a
            if (r4 == 0) goto L_0x03e1
            float r10 = r4.getYVelocity()
            goto L_0x03e2
        L_0x03e1:
            r10 = 0
        L_0x03e2:
            double r9 = (double) r10
            double r4 = (double) r5
            double r13 = java.lang.Math.hypot(r9, r4)
            double r4 = java.lang.Math.atan2(r9, r4)
            double r4 = r4 - r11
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r13
            double r6 = (double) r7
            double r8 = (double) r8
            double r6 = java.lang.Math.hypot(r6, r8)
            double r4 = r4 / r6
            float r4 = (float) r4
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            double r6 = (double) r4
            double r6 = java.lang.Math.toDegrees(r6)
            float r4 = (float) r6
            r5.f2691k = r4
            goto L_0x040b
        L_0x0406:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f2821r
            r5 = 0
            r4.f2691k = r5
        L_0x040b:
            float r4 = r30.getRawX()
            r3.f2819p = r4
            float r4 = r30.getRawY()
            r3.f2820q = r4
            goto L_0x0821
        L_0x0419:
            r5 = 0
            r3.f2816m = r5
            r5 = 16
            android.view.VelocityTracker r9 = r4.f2751a
            if (r9 == 0) goto L_0x0425
            r9.computeCurrentVelocity(r5)
        L_0x0425:
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x042e
            float r5 = r5.getXVelocity()
            goto L_0x042f
        L_0x042e:
            r5 = 0
        L_0x042f:
            android.view.VelocityTracker r4 = r4.f2751a
            if (r4 == 0) goto L_0x0438
            float r4 = r4.getYVelocity()
            goto L_0x0439
        L_0x0438:
            r4 = 0
        L_0x0439:
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f2821r
            float r9 = r9.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f2821r
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r10 = r10 / r19
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f2821r
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r19
            int r14 = r3.f2812i
            r15 = -1
            if (r14 == r15) goto L_0x0485
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f2821r
            android.view.View r10 = r10.findViewById(r14)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f2821r
            int[] r14 = r3.f2818o
            r11.getLocationOnScreen(r14)
            int[] r11 = r3.f2818o
            r14 = 0
            r11 = r11[r14]
            float r11 = (float) r11
            int r14 = r10.getLeft()
            int r15 = r10.getRight()
            int r15 = r15 + r14
            float r14 = (float) r15
            float r14 = r14 / r19
            float r14 = r14 + r11
            int[] r11 = r3.f2818o
            r15 = 1
            r11 = r11[r15]
            float r11 = (float) r11
            int r15 = r10.getTop()
            int r10 = r10.getBottom()
            goto L_0x04ca
        L_0x0485:
            int r14 = r3.f2807d
            r15 = -1
            if (r14 == r15) goto L_0x04d0
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f2821r
            java.util.HashMap<android.view.View, z0.n> r11 = r10.f2704r
            android.view.View r10 = r10.findViewById(r14)
            java.lang.Object r10 = r11.get(r10)
            z0.n r10 = (p328z0.C7394n) r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f2821r
            z0.p r10 = r10.f22730f
            int r10 = r10.f22762l
            android.view.View r10 = r11.findViewById(r10)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f2821r
            int[] r14 = r3.f2818o
            r11.getLocationOnScreen(r14)
            int[] r11 = r3.f2818o
            r14 = 0
            r11 = r11[r14]
            float r11 = (float) r11
            int r14 = r10.getLeft()
            int r15 = r10.getRight()
            int r15 = r15 + r14
            float r14 = (float) r15
            float r14 = r14 / r19
            float r14 = r14 + r11
            int[] r11 = r3.f2818o
            r15 = 1
            r11 = r11[r15]
            float r11 = (float) r11
            int r15 = r10.getTop()
            int r10 = r10.getBottom()
        L_0x04ca:
            int r10 = r10 + r15
            float r10 = (float) r10
            float r10 = r10 / r19
            float r11 = r11 + r10
            r10 = r14
        L_0x04d0:
            float r14 = r30.getRawX()
            float r14 = r14 - r10
            float r10 = r30.getRawY()
            float r10 = r10 - r11
            double r6 = (double) r10
            double r12 = (double) r14
            double r6 = java.lang.Math.atan2(r6, r12)
            double r6 = java.lang.Math.toDegrees(r6)
            int r12 = r3.f2807d
            r13 = -1
            if (r12 == r13) goto L_0x050e
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r3.f2821r
            float r11 = r3.f2811h
            float r15 = r3.f2810g
            float[] r8 = r3.f2817n
            r22 = r13
            r23 = r12
            r24 = r9
            r25 = r11
            r26 = r15
            r27 = r8
            r22.mo2958r(r23, r24, r25, r26, r27)
            float[] r8 = r3.f2817n
            r11 = 1
            r12 = r8[r11]
            double r12 = (double) r12
            double r12 = java.lang.Math.toDegrees(r12)
            float r12 = (float) r12
            r8[r11] = r12
            goto L_0x0513
        L_0x050e:
            r11 = 1
            float[] r8 = r3.f2817n
            r8[r11] = r18
        L_0x0513:
            float r4 = r4 + r10
            double r10 = (double) r4
            float r5 = r5 + r14
            double r4 = (double) r5
            double r4 = java.lang.Math.atan2(r10, r4)
            double r4 = java.lang.Math.toDegrees(r4)
            double r4 = r4 - r6
            float r4 = (float) r4
            r5 = 1115291648(0x427a0000, float:62.5)
            float r4 = r4 * r5
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L_0x053b
            r5 = 1077936128(0x40400000, float:3.0)
            float r13 = r4 * r5
            float r5 = r3.f2825v
            float r13 = r13 * r5
            float[] r5 = r3.f2817n
            r6 = 1
            r5 = r5[r6]
            float r13 = r13 / r5
            float r13 = r13 + r9
            goto L_0x053c
        L_0x053b:
            r13 = r9
        L_0x053c:
            r5 = 0
            int r6 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x05a3
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x05a3
            int r5 = r3.f2806c
            r6 = 3
            if (r5 == r6) goto L_0x05a3
            float r6 = r3.f2825v
            float r4 = r4 * r6
            float[] r6 = r3.f2817n
            r7 = 1
            r6 = r6[r7]
            float r4 = r4 / r6
            double r6 = (double) r13
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x055f
            r6 = 0
            goto L_0x0561
        L_0x055f:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0561:
            r7 = 6
            if (r5 != r7) goto L_0x0571
            float r5 = r9 + r4
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x056f
            float r4 = java.lang.Math.abs(r4)
        L_0x056f:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0571:
            int r5 = r3.f2806c
            r7 = 7
            if (r5 != r7) goto L_0x0584
            float r5 = r9 + r4
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0583
            float r4 = java.lang.Math.abs(r4)
            float r4 = -r4
        L_0x0583:
            r6 = 0
        L_0x0584:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            int r7 = r3.f2806c
            r8 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r8
            r5.mo2923A(r6, r4, r7)
            r4 = 0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x059a
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0821
        L_0x059a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f2821r
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x0821
        L_0x05a3:
            r4 = 0
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x05ae
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0821
        L_0x05ae:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f2821r
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x0821
        L_0x05b7:
            float r4 = r30.getRawX()
            r3.f2819p = r4
            float r4 = r30.getRawY()
            r3.f2820q = r4
            r4 = 0
            r3.f2816m = r4
            goto L_0x0822
        L_0x05c8:
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x05cf
            r5.addMovement(r1)
        L_0x05cf:
            int r5 = r30.getAction()
            if (r5 == 0) goto L_0x0811
            r6 = 1
            if (r5 == r6) goto L_0x0720
            r6 = 2
            if (r5 == r6) goto L_0x05dd
            goto L_0x0821
        L_0x05dd:
            float r5 = r30.getRawY()
            float r6 = r3.f2820q
            float r5 = r5 - r6
            float r6 = r30.getRawX()
            float r7 = r3.f2819p
            float r6 = r6 - r7
            float r7 = r3.f2814k
            float r7 = r7 * r6
            float r8 = r3.f2815l
            float r8 = r8 * r5
            float r8 = r8 + r7
            float r7 = java.lang.Math.abs(r8)
            float r8 = r3.f2827x
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0602
            boolean r7 = r3.f2816m
            if (r7 == 0) goto L_0x0821
        L_0x0602:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f2821r
            float r7 = r7.getProgress()
            boolean r8 = r3.f2816m
            if (r8 != 0) goto L_0x0614
            r8 = 1
            r3.f2816m = r8
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f2821r
            r8.setProgress(r7)
        L_0x0614:
            int r8 = r3.f2807d
            r12 = -1
            if (r8 == r12) goto L_0x0633
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f2821r
            float r13 = r3.f2811h
            float r14 = r3.f2810g
            float[] r15 = r3.f2817n
            r22 = r12
            r23 = r8
            r24 = r7
            r25 = r13
            r26 = r14
            r27 = r15
            r22.mo2958r(r23, r24, r25, r26, r27)
            r13 = 0
            r14 = 1
            goto L_0x0654
        L_0x0633:
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f2821r
            int r8 = r8.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f2821r
            int r12 = r12.getHeight()
            int r8 = java.lang.Math.min(r8, r12)
            float r8 = (float) r8
            float[] r12 = r3.f2817n
            float r13 = r3.f2815l
            float r13 = r13 * r8
            r14 = 1
            r12[r14] = r13
            float r13 = r3.f2814k
            float r8 = r8 * r13
            r13 = 0
            r12[r13] = r8
        L_0x0654:
            float r8 = r3.f2814k
            float[] r12 = r3.f2817n
            r15 = r12[r13]
            float r8 = r8 * r15
            float r13 = r3.f2815l
            r12 = r12[r14]
            float r13 = r13 * r12
            float r13 = r13 + r8
            float r8 = r3.f2825v
            float r13 = r13 * r8
            float r8 = java.lang.Math.abs(r13)
            double r12 = (double) r8
            r8 = 1008981770(0x3c23d70a, float:0.01)
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x067c
            float[] r9 = r3.f2817n
            r10 = 0
            r9[r10] = r8
            r12 = 1
            r9[r12] = r8
            goto L_0x067e
        L_0x067c:
            r10 = 0
            r12 = 1
        L_0x067e:
            float r9 = r3.f2814k
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x068b
            float[] r5 = r3.f2817n
            r5 = r5[r10]
            float r6 = r6 / r5
            goto L_0x0691
        L_0x068b:
            float[] r6 = r3.f2817n
            r6 = r6[r12]
            float r6 = r5 / r6
        L_0x0691:
            float r7 = r7 + r6
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.min(r7, r5)
            r5 = 0
            float r6 = java.lang.Math.max(r6, r5)
            int r5 = r3.f2806c
            r7 = 6
            if (r5 != r7) goto L_0x06a6
            float r6 = java.lang.Math.max(r6, r8)
        L_0x06a6:
            int r5 = r3.f2806c
            r7 = 7
            if (r5 != r7) goto L_0x06b2
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            float r6 = java.lang.Math.min(r6, r5)
        L_0x06b2:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            float r5 = r5.getProgress()
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x070d
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x06c7
            r7 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x06d1
        L_0x06c7:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            if (r8 != 0) goto L_0x06cd
            r7 = 1
            goto L_0x06ce
        L_0x06cd:
            r7 = 0
        L_0x06ce:
            r5.mo2929e(r7)
        L_0x06d1:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f2821r
            r5.setProgress(r6)
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x06df
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r6)
        L_0x06df:
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x06e8
            float r5 = r5.getXVelocity()
            goto L_0x06e9
        L_0x06e8:
            r5 = 0
        L_0x06e9:
            android.view.VelocityTracker r4 = r4.f2751a
            if (r4 == 0) goto L_0x06f2
            float r4 = r4.getYVelocity()
            goto L_0x06f3
        L_0x06f2:
            r4 = 0
        L_0x06f3:
            float r6 = r3.f2814k
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0701
            float[] r4 = r3.f2817n
            r6 = 0
            r4 = r4[r6]
            float r5 = r5 / r4
            goto L_0x0708
        L_0x0701:
            float[] r5 = r3.f2817n
            r6 = 1
            r5 = r5[r6]
            float r5 = r4 / r5
        L_0x0708:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f2821r
            r4.f2691k = r5
            goto L_0x0712
        L_0x070d:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f2821r
            r5 = 0
            r4.f2691k = r5
        L_0x0712:
            float r4 = r30.getRawX()
            r3.f2819p = r4
            float r4 = r30.getRawY()
            r3.f2820q = r4
            goto L_0x0821
        L_0x0720:
            r5 = 0
            r3.f2816m = r5
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x072c
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r6)
        L_0x072c:
            android.view.VelocityTracker r5 = r4.f2751a
            if (r5 == 0) goto L_0x0735
            float r5 = r5.getXVelocity()
            goto L_0x0736
        L_0x0735:
            r5 = 0
        L_0x0736:
            android.view.VelocityTracker r4 = r4.f2751a
            if (r4 == 0) goto L_0x073f
            float r4 = r4.getYVelocity()
            goto L_0x0740
        L_0x073f:
            r4 = 0
        L_0x0740:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f2821r
            float r6 = r6.getProgress()
            int r7 = r3.f2807d
            r8 = -1
            if (r7 == r8) goto L_0x0765
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f2821r
            float r9 = r3.f2811h
            float r10 = r3.f2810g
            float[] r12 = r3.f2817n
            r22 = r8
            r23 = r7
            r24 = r6
            r25 = r9
            r26 = r10
            r27 = r12
            r22.mo2958r(r23, r24, r25, r26, r27)
            r9 = 0
            r10 = 1
            goto L_0x0786
        L_0x0765:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f2821r
            int r7 = r7.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f2821r
            int r8 = r8.getHeight()
            int r7 = java.lang.Math.min(r7, r8)
            float r7 = (float) r7
            float[] r8 = r3.f2817n
            float r9 = r3.f2815l
            float r9 = r9 * r7
            r10 = 1
            r8[r10] = r9
            float r9 = r3.f2814k
            float r7 = r7 * r9
            r9 = 0
            r8[r9] = r7
        L_0x0786:
            float r7 = r3.f2814k
            float[] r8 = r3.f2817n
            r12 = r8[r9]
            r8 = r8[r10]
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0795
            float r5 = r5 / r12
            goto L_0x0797
        L_0x0795:
            float r5 = r4 / r8
        L_0x0797:
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 != 0) goto L_0x07a3
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r5 / r4
            float r4 = r4 + r6
            goto L_0x07a4
        L_0x07a3:
            r4 = r6
        L_0x07a4:
            r7 = 0
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x07fe
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x07fe
            int r7 = r3.f2806c
            r8 = 3
            if (r7 == r8) goto L_0x07fe
            double r8 = (double) r4
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x07bd
            r4 = 0
            goto L_0x07bf
        L_0x07bd:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x07bf:
            r8 = 6
            if (r7 != r8) goto L_0x07d0
            float r4 = r6 + r5
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x07ce
            float r4 = java.lang.Math.abs(r5)
            r5 = r4
        L_0x07ce:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x07d0:
            int r7 = r3.f2806c
            r8 = 7
            if (r7 != r8) goto L_0x07e4
            float r4 = r6 + r5
            r7 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x07e3
            float r4 = java.lang.Math.abs(r5)
            float r4 = -r4
            r5 = r4
        L_0x07e3:
            r4 = 0
        L_0x07e4:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f2821r
            int r8 = r3.f2806c
            r7.mo2923A(r4, r5, r8)
            r4 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x07f6
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x0821
        L_0x07f6:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f2821r
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x0821
        L_0x07fe:
            r5 = 0
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0809
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0821
        L_0x0809:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f2821r
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r4)
            goto L_0x0821
        L_0x0811:
            float r4 = r30.getRawX()
            r3.f2819p = r4
            float r4 = r30.getRawY()
            r3.f2820q = r4
            r4 = 0
            r3.f2816m = r4
            goto L_0x0822
        L_0x0821:
            r4 = 0
        L_0x0822:
            float r3 = r30.getRawX()
            r2.f2774r = r3
            float r3 = r30.getRawY()
            r2.f2775s = r3
            int r1 = r30.getAction()
            r3 = 1
            if (r1 != r3) goto L_0x084f
            androidx.constraintlayout.motion.widget.MotionLayout$g r1 = r2.f2771o
            if (r1 == 0) goto L_0x084f
            android.view.VelocityTracker r3 = r1.f2751a
            if (r3 == 0) goto L_0x0844
            r3.recycle()
            r3 = 0
            r1.f2751a = r3
            goto L_0x0845
        L_0x0844:
            r3 = 0
        L_0x0845:
            r2.f2771o = r3
            int r1 = r0.f2694m
            r3 = -1
            if (r1 == r3) goto L_0x084f
            r2.mo3000a(r1, r0)
        L_0x084f:
            androidx.constraintlayout.motion.widget.a r1 = r0.f2688h
            androidx.constraintlayout.motion.widget.a$b r1 = r1.f2759c
            r2 = 4
            int r3 = r1.f2794r
            r2 = r2 & r3
            if (r2 == 0) goto L_0x085b
            r9 = 1
            goto L_0x085c
        L_0x085b:
            r9 = 0
        L_0x085c:
            if (r9 == 0) goto L_0x0863
            androidx.constraintlayout.motion.widget.b r1 = r1.f2788l
            boolean r1 = r1.f2816m
            return r1
        L_0x0863:
            r1 = 1
            return r1
        L_0x0865:
            boolean r1 = super.onTouchEvent(r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f2685S == null) {
                this.f2685S = new CopyOnWriteArrayList<>();
            }
            this.f2685S.add(motionHelper);
            if (motionHelper.f2653j) {
                if (this.f2682P == null) {
                    this.f2682P = new ArrayList<>();
                }
                this.f2682P.add(motionHelper);
            }
            if (motionHelper.f2654k) {
                if (this.f2683Q == null) {
                    this.f2683Q = new ArrayList<>();
                }
                this.f2683Q.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f2684R == null) {
                    this.f2684R = new ArrayList<>();
                }
                this.f2684R.add(motionHelper);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f2682P;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f2683Q;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p */
    public final boolean mo1300p(View view, View view2, int i, int i2) {
        C0717a.C0719b bVar;
        C0721b bVar2;
        C0717a aVar = this.f2688h;
        if (aVar == null || (bVar = aVar.f2759c) == null || (bVar2 = bVar.f2788l) == null || (bVar2.f2826w & 2) != 0) {
            return false;
        }
        return true;
    }

    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* renamed from: q */
    public final void mo2957q() {
        int i;
        CopyOnWriteArrayList<C0716i> copyOnWriteArrayList;
        if ((this.f2658A != null || ((copyOnWriteArrayList = this.f2685S) != null && !copyOnWriteArrayList.isEmpty())) && this.f2695m0 == -1) {
            this.f2695m0 = this.f2694m;
            if (!this.f2675I0.isEmpty()) {
                ArrayList<Integer> arrayList = this.f2675I0;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f2694m;
            if (!(i == i2 || i2 == -1)) {
                this.f2675I0.add(Integer.valueOf(i2));
            }
        }
        mo2980w();
        Runnable runnable = this.f2721z0;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: r */
    public final void mo2958r(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, C7394n> hashMap = this.f2704r;
        View viewById = getViewById(i);
        C7394n nVar = hashMap.get(viewById);
        if (nVar != null) {
            nVar.mo23622d(f, f2, f3, fArr);
            viewById.getY();
        } else if (viewById != null) {
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    public final void requestLayout() {
        C0717a aVar;
        C0717a.C0719b bVar;
        if (!this.f2699o0 && this.f2694m == -1 && (aVar = this.f2688h) != null && (bVar = aVar.f2759c) != null) {
            int i = bVar.f2793q;
            if (i != 0) {
                if (i == 2) {
                    int childCount = getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        this.f2704r.get(getChildAt(i2)).f22728d = true;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public final C0717a.C0719b mo2960s(int i) {
        Iterator<C0717a.C0719b> it = this.f2688h.f2760d.iterator();
        while (it.hasNext()) {
            C0717a.C0719b next = it.next();
            if (next.f2777a == i) {
                return next;
            }
        }
        return null;
    }

    public void setDebugMode(int i) {
        this.f2660B = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f2661B0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f2702q = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f2688h != null) {
            setState(TransitionState.MOVING);
            Interpolator e = this.f2688h.mo3004e();
            if (e != null) {
                setProgress(e.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f2683Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2683Q.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f2682P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2682P.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (!isAttachedToWindow()) {
            if (this.f2719y0 == null) {
                this.f2719y0 = new C0715h();
            }
            this.f2719y0.f2752a = f;
            return;
        }
        if (i <= 0) {
            if (this.f2712v == 1.0f && this.f2694m == this.f2696n) {
                setState(TransitionState.MOVING);
            }
            this.f2694m = this.f2692l;
            if (this.f2712v == BitmapDescriptorFactory.HUE_RED) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f2712v == BitmapDescriptorFactory.HUE_RED && this.f2694m == this.f2692l) {
                setState(TransitionState.MOVING);
            }
            this.f2694m = this.f2696n;
            if (this.f2712v == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.f2694m = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f2688h != null) {
            this.f2718y = true;
            this.f2716x = f;
            this.f2710u = f;
            this.f2714w = -1;
            this.f2706s = -1;
            this.f2689i = null;
            this.f2720z = true;
            invalidate();
        }
    }

    public void setScene(C0717a aVar) {
        C0721b bVar;
        this.f2688h = aVar;
        boolean isRtl = isRtl();
        aVar.f2772p = isRtl;
        C0717a.C0719b bVar2 = aVar.f2759c;
        if (!(bVar2 == null || (bVar = bVar2.f2788l) == null)) {
            bVar.mo3020c(isRtl);
        }
        mo2981x();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f2719y0 == null) {
                this.f2719y0 = new C0715h();
            }
            C0715h hVar = this.f2719y0;
            hVar.f2754c = i;
            hVar.f2755d = i;
            return;
        }
        this.f2694m = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.f2694m != -1) {
            TransitionState transitionState3 = this.f2663C0;
            this.f2663C0 = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                mo2945l();
            }
            int i = C0710c.f2724a[transitionState3.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == transitionState4) {
                    mo2945l();
                }
                if (transitionState == transitionState2) {
                    mo2957q();
                }
            } else if (i == 3 && transitionState == transitionState2) {
                mo2957q();
            }
        }
    }

    public void setTransition(int i) {
        if (this.f2688h != null) {
            C0717a.C0719b s = mo2960s(i);
            this.f2692l = s.f2780d;
            this.f2696n = s.f2779c;
            if (!isAttachedToWindow()) {
                if (this.f2719y0 == null) {
                    this.f2719y0 = new C0715h();
                }
                C0715h hVar = this.f2719y0;
                hVar.f2754c = this.f2692l;
                hVar.f2755d = this.f2696n;
                return;
            }
            float f = Float.NaN;
            int i2 = this.f2694m;
            if (i2 == this.f2692l) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (i2 == this.f2696n) {
                f = 1.0f;
            }
            C0717a aVar = this.f2688h;
            aVar.f2759c = s;
            C0721b bVar = s.f2788l;
            if (bVar != null) {
                bVar.mo3020c(aVar.f2772p);
            }
            this.f2665D0.mo2996e(this.f2688h.mo3001b(this.f2692l), this.f2688h.mo3001b(this.f2696n));
            mo2981x();
            if (this.f2712v != f) {
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    mo2929e(true);
                    this.f2688h.mo3001b(this.f2692l).mo3236b(this);
                } else if (f == 1.0f) {
                    mo2929e(false);
                    this.f2688h.mo3001b(this.f2696n).mo3236b(this);
                }
            }
            this.f2712v = Float.isNaN(f) ? BitmapDescriptorFactory.HUE_RED : f;
            if (Float.isNaN(f)) {
                C7376a.m16987b();
                mo2927d(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            setProgress(f);
        }
    }

    public void setTransitionDuration(int i) {
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            C0717a.C0719b bVar = aVar.f2759c;
            if (bVar != null) {
                bVar.f2784h = Math.max(i, 8);
            } else {
                aVar.f2766j = i;
            }
        }
    }

    public void setTransitionListener(C0716i iVar) {
        this.f2658A = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2719y0 == null) {
            this.f2719y0 = new C0715h();
        }
        C0715h hVar = this.f2719y0;
        hVar.getClass();
        hVar.f2752a = bundle.getFloat("motion.progress");
        hVar.f2753b = bundle.getFloat("motion.velocity");
        hVar.f2754c = bundle.getInt("motion.StartState");
        hVar.f2755d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f2719y0.mo2999a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2976t(float r8, float r9, android.view.MotionEvent r10, android.view.View r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r11.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r11.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.mo2976t(r4, r5, r10, r3)
            if (r3 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x00ab
            android.graphics.RectF r2 = r7.f2669F0
            int r3 = r11.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r11.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r11.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r11.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r10.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f2669F0
            float r3 = r10.getX()
            float r4 = r10.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x00ab
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            android.graphics.Matrix r2 = r11.getMatrix()
            boolean r3 = r2.isIdentity()
            if (r3 == 0) goto L_0x0085
            r10.offsetLocation(r8, r9)
            boolean r11 = r11.onTouchEvent(r10)
            float r8 = -r8
            float r9 = -r9
            r10.offsetLocation(r8, r9)
            goto L_0x00a8
        L_0x0085:
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r10)
            r10.offsetLocation(r8, r9)
            android.graphics.Matrix r8 = r7.f2673H0
            if (r8 != 0) goto L_0x0097
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r7.f2673H0 = r8
        L_0x0097:
            android.graphics.Matrix r8 = r7.f2673H0
            r2.invert(r8)
            android.graphics.Matrix r8 = r7.f2673H0
            r10.transform(r8)
            boolean r11 = r11.onTouchEvent(r10)
            r10.recycle()
        L_0x00a8:
            if (r11 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = r0
        L_0x00ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo2976t(float, float, android.view.MotionEvent, android.view.View):boolean");
    }

    public final String toString() {
        Context context = getContext();
        return C7376a.m16988c(this.f2692l, context) + "->" + C7376a.m16988c(this.f2696n, context) + " (pos:" + this.f2712v + " Dpos/Dt:" + this.f2691k;
    }

    /* renamed from: u */
    public final void mo2978u(AttributeSet attributeSet) {
        C0717a aVar;
        C0717a aVar2;
        int i;
        f2657J0 = isInEditMode();
        int i2 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0042d.MotionLayout_layoutDescription) {
                    this.f2688h = new C0717a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0042d.MotionLayout_currentState) {
                    this.f2694m = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0042d.MotionLayout_motionProgress) {
                    this.f2716x = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                    this.f2720z = true;
                } else if (index == C0042d.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C0042d.MotionLayout_showPaths) {
                    if (this.f2660B == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.f2660B = i;
                    }
                } else if (index == C0042d.MotionLayout_motionDebug) {
                    this.f2660B = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.f2688h = null;
            }
        }
        if (!(this.f2660B == 0 || (aVar2 = this.f2688h) == null)) {
            int h = aVar2.mo3007h();
            C0717a aVar3 = this.f2688h;
            C0738a b = aVar3.mo3001b(aVar3.mo3007h());
            C7376a.m16988c(h, getContext());
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (b.mo3241j(childAt.getId()) == null) {
                    C7376a.m16989d(childAt);
                }
            }
            Integer[] numArr = (Integer[]) b.f3116f.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = numArr[i5].intValue();
            }
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr[i6];
                C7376a.m16988c(i7, getContext());
                findViewById(iArr[i6]);
                int i8 = b.mo3240i(i7).f3121e.f3170d;
                int i9 = b.mo3240i(i7).f3121e.f3168c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<C0717a.C0719b> it = this.f2688h.f2760d.iterator();
            while (it.hasNext()) {
                C0717a.C0719b next = it.next();
                C0717a.C0719b bVar = this.f2688h.f2759c;
                int i11 = next.f2780d;
                int i12 = next.f2779c;
                C7376a.m16988c(i11, getContext());
                C7376a.m16988c(i12, getContext());
                sparseIntArray.get(i11);
                sparseIntArray2.get(i12);
                sparseIntArray.put(i11, i12);
                sparseIntArray2.put(i12, i11);
                this.f2688h.mo3001b(i11);
                this.f2688h.mo3001b(i12);
            }
        }
        if (this.f2694m == -1 && (aVar = this.f2688h) != null) {
            this.f2694m = aVar.mo3007h();
            this.f2692l = this.f2688h.mo3007h();
            C0717a.C0719b bVar2 = this.f2688h.f2759c;
            if (bVar2 != null) {
                i2 = bVar2.f2779c;
            }
            this.f2696n = i2;
        }
    }

    /* renamed from: v */
    public final void mo2979v() {
        C0717a.C0719b bVar;
        C0721b bVar2;
        View findViewById;
        View findViewById2;
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            if (aVar.mo3000a(this.f2694m, this)) {
                requestLayout();
                return;
            }
            int i = this.f2694m;
            View view = null;
            if (i != -1) {
                C0717a aVar2 = this.f2688h;
                Iterator<C0717a.C0719b> it = aVar2.f2760d.iterator();
                while (it.hasNext()) {
                    C0717a.C0719b next = it.next();
                    if (next.f2789m.size() > 0) {
                        Iterator<C0717a.C0719b.C0720a> it2 = next.f2789m.iterator();
                        while (it2.hasNext()) {
                            int i2 = it2.next().f2796c;
                            if (!(i2 == -1 || (findViewById2 = findViewById(i2)) == null)) {
                                findViewById2.setOnClickListener((View.OnClickListener) null);
                            }
                        }
                    }
                }
                Iterator<C0717a.C0719b> it3 = aVar2.f2762f.iterator();
                while (it3.hasNext()) {
                    C0717a.C0719b next2 = it3.next();
                    if (next2.f2789m.size() > 0) {
                        Iterator<C0717a.C0719b.C0720a> it4 = next2.f2789m.iterator();
                        while (it4.hasNext()) {
                            int i3 = it4.next().f2796c;
                            if (!(i3 == -1 || (findViewById = findViewById(i3)) == null)) {
                                findViewById.setOnClickListener((View.OnClickListener) null);
                            }
                        }
                    }
                }
                Iterator<C0717a.C0719b> it5 = aVar2.f2760d.iterator();
                while (it5.hasNext()) {
                    C0717a.C0719b next3 = it5.next();
                    if (next3.f2789m.size() > 0) {
                        Iterator<C0717a.C0719b.C0720a> it6 = next3.f2789m.iterator();
                        while (it6.hasNext()) {
                            it6.next().mo3016a(this, i, next3);
                        }
                    }
                }
                Iterator<C0717a.C0719b> it7 = aVar2.f2762f.iterator();
                while (it7.hasNext()) {
                    C0717a.C0719b next4 = it7.next();
                    if (next4.f2789m.size() > 0) {
                        Iterator<C0717a.C0719b.C0720a> it8 = next4.f2789m.iterator();
                        while (it8.hasNext()) {
                            it8.next().mo3016a(this, i, next4);
                        }
                    }
                }
            }
            if (this.f2688h.mo3014o() && (bVar = this.f2688h.f2759c) != null && (bVar2 = bVar.f2788l) != null) {
                int i4 = bVar2.f2807d;
                if (i4 != -1 && (view = bVar2.f2821r.findViewById(i4)) == null) {
                    C7376a.m16988c(bVar2.f2807d, bVar2.f2821r.getContext());
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new C7397q());
                    nestedScrollView.setOnScrollChangeListener(new C7398r());
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo2980w() {
        CopyOnWriteArrayList<C0716i> copyOnWriteArrayList;
        if (this.f2658A != null || ((copyOnWriteArrayList = this.f2685S) != null && !copyOnWriteArrayList.isEmpty())) {
            Iterator<Integer> it = this.f2675I0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C0716i iVar = this.f2658A;
                if (iVar != null) {
                    iVar.mo2851a(next.intValue());
                }
                CopyOnWriteArrayList<C0716i> copyOnWriteArrayList2 = this.f2685S;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0716i> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo2851a(next.intValue());
                    }
                }
            }
            this.f2675I0.clear();
        }
    }

    /* renamed from: x */
    public final void mo2981x() {
        this.f2665D0.mo2997f();
        invalidate();
    }

    /* renamed from: y */
    public final void mo2982y(int i) {
        C0738a aVar;
        C0037a.C0038a aVar2;
        int a;
        C0738a aVar3;
        setState(TransitionState.SETUP);
        this.f2694m = i;
        this.f2692l = -1;
        this.f2696n = -1;
        C0037a aVar4 = this.mConstraintLayoutSpec;
        if (aVar4 != null) {
            float f = (float) -1;
            int i2 = aVar4.f22b;
            if (i2 == i) {
                if (i == -1) {
                    aVar2 = aVar4.f24d.valueAt(0);
                } else {
                    aVar2 = aVar4.f24d.get(i2);
                }
                int i3 = aVar4.f23c;
                if ((i3 == -1 || !aVar2.f27b.get(i3).mo20a(f, f)) && aVar4.f23c != (a = aVar2.mo19a(f, f))) {
                    if (a == -1) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2.f27b.get(a).f35f;
                    }
                    if (a != -1) {
                        int i4 = aVar2.f27b.get(a).f34e;
                    }
                    if (aVar3 != null) {
                        aVar4.f23c = a;
                        aVar3.mo3236b(aVar4.f21a);
                        return;
                    }
                    return;
                }
                return;
            }
            aVar4.f22b = i;
            C0037a.C0038a aVar5 = aVar4.f24d.get(i);
            int a2 = aVar5.mo19a(f, f);
            if (a2 == -1) {
                aVar = aVar5.f29d;
            } else {
                aVar = aVar5.f27b.get(a2).f35f;
            }
            if (a2 != -1) {
                int i5 = aVar5.f27b.get(a2).f34e;
            }
            if (aVar != null) {
                aVar4.f23c = a2;
                aVar.mo3236b(aVar4.f21a);
                return;
            }
            return;
        }
        C0717a aVar6 = this.f2688h;
        if (aVar6 != null) {
            aVar6.mo3001b(i).mo3236b(this);
        }
    }

    /* renamed from: z */
    public final void mo2983z(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f2719y0 == null) {
                this.f2719y0 = new C0715h();
            }
            C0715h hVar = this.f2719y0;
            hVar.f2754c = i;
            hVar.f2755d = i2;
            return;
        }
        C0717a aVar = this.f2688h;
        if (aVar != null) {
            this.f2692l = i;
            this.f2696n = i2;
            aVar.mo3013n(i, i2);
            this.f2665D0.mo2996e(this.f2688h.mo3001b(i), this.f2688h.mo3001b(i2));
            mo2981x();
            this.f2712v = BitmapDescriptorFactory.HUE_RED;
            mo2927d(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public void setTransition(C0717a.C0719b bVar) {
        int i;
        long j;
        C0721b bVar2;
        C0717a aVar = this.f2688h;
        aVar.f2759c = bVar;
        if (!(bVar == null || (bVar2 = bVar.f2788l) == null)) {
            bVar2.mo3020c(aVar.f2772p);
        }
        setState(TransitionState.SETUP);
        int i2 = this.f2694m;
        C0717a.C0719b bVar3 = this.f2688h.f2759c;
        int i3 = -1;
        if (bVar3 == null) {
            i = -1;
        } else {
            i = bVar3.f2779c;
        }
        if (i2 == i) {
            this.f2712v = 1.0f;
            this.f2710u = 1.0f;
            this.f2716x = 1.0f;
        } else {
            this.f2712v = BitmapDescriptorFactory.HUE_RED;
            this.f2710u = BitmapDescriptorFactory.HUE_RED;
            this.f2716x = BitmapDescriptorFactory.HUE_RED;
        }
        boolean z = true;
        if ((bVar.f2794r & 1) == 0) {
            z = false;
        }
        if (z) {
            j = -1;
        } else {
            j = getNanoTime();
        }
        this.f2714w = j;
        int h = this.f2688h.mo3007h();
        C0717a aVar2 = this.f2688h;
        C0717a.C0719b bVar4 = aVar2.f2759c;
        if (bVar4 != null) {
            i3 = bVar4.f2779c;
        }
        if (h != this.f2692l || i3 != this.f2696n) {
            this.f2692l = h;
            this.f2696n = i3;
            aVar2.mo3013n(h, i3);
            this.f2665D0.mo2996e(this.f2688h.mo3001b(this.f2692l), this.f2688h.mo3001b(this.f2696n));
            C0713f fVar = this.f2665D0;
            int i4 = this.f2692l;
            int i5 = this.f2696n;
            fVar.f2747e = i4;
            fVar.f2748f = i5;
            fVar.mo2997f();
            mo2981x();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new HashMap();
        this.f2659A0 = new Rect();
        this.f2661B0 = false;
        this.f2663C0 = TransitionState.UNDEFINED;
        this.f2665D0 = new C0713f();
        this.f2667E0 = false;
        this.f2669F0 = new RectF();
        this.f2671G0 = null;
        this.f2673H0 = null;
        this.f2675I0 = new ArrayList<>();
        mo2978u(attributeSet);
    }
}
