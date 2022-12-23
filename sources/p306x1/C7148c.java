package p306x1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import p242s1.C6333d0;

/* renamed from: x1.c */
public final class C7148c {

    /* renamed from: x */
    public static final C7149a f22197x = new C7149a();

    /* renamed from: a */
    public int f22198a;

    /* renamed from: b */
    public int f22199b;

    /* renamed from: c */
    public int f22200c = -1;

    /* renamed from: d */
    public float[] f22201d;

    /* renamed from: e */
    public float[] f22202e;

    /* renamed from: f */
    public float[] f22203f;

    /* renamed from: g */
    public float[] f22204g;

    /* renamed from: h */
    public int[] f22205h;

    /* renamed from: i */
    public int[] f22206i;

    /* renamed from: j */
    public int[] f22207j;

    /* renamed from: k */
    public int f22208k;

    /* renamed from: l */
    public VelocityTracker f22209l;

    /* renamed from: m */
    public float f22210m;

    /* renamed from: n */
    public float f22211n;

    /* renamed from: o */
    public int f22212o;

    /* renamed from: p */
    public final int f22213p;

    /* renamed from: q */
    public int f22214q;

    /* renamed from: r */
    public OverScroller f22215r;

    /* renamed from: s */
    public final C7151c f22216s;

    /* renamed from: t */
    public View f22217t;

    /* renamed from: u */
    public boolean f22218u;

    /* renamed from: v */
    public final ViewGroup f22219v;

    /* renamed from: w */
    public final C7150b f22220w = new C7150b();

    /* renamed from: x1.c$a */
    public class C7149a implements Interpolator {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: x1.c$b */
    public class C7150b implements Runnable {
        public C7150b() {
        }

        public final void run() {
            C7148c.this.mo23429r(0);
        }
    }

    /* renamed from: x1.c$c */
    public static abstract class C7151c {
        /* renamed from: a */
        public abstract int mo3593a(View view, int i);

        /* renamed from: b */
        public abstract int mo3594b(View view, int i);

        /* renamed from: c */
        public int mo3595c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo23436d() {
            return 0;
        }

        /* renamed from: e */
        public void mo3596e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo3597f() {
        }

        /* renamed from: g */
        public void mo3598g(int i, View view) {
        }

        /* renamed from: h */
        public abstract void mo3599h(int i);

        /* renamed from: i */
        public abstract void mo3600i(View view, int i, int i2);

        /* renamed from: j */
        public abstract void mo3601j(View view, float f, float f2);

        /* renamed from: k */
        public abstract boolean mo3602k(int i, View view);
    }

    public C7148c(Context context, ViewGroup viewGroup, C7151c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f22219v = viewGroup;
            this.f22216s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f22213p = i;
            this.f22212o = i;
            this.f22199b = viewConfiguration.getScaledTouchSlop();
            this.f22210m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f22211n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f22215r = new OverScroller(context, f22197x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: i */
    public static C7148c m16728i(ViewGroup viewGroup, float f, C7151c cVar) {
        C7148c cVar2 = new C7148c(viewGroup.getContext(), viewGroup, cVar);
        cVar2.f22199b = (int) ((1.0f / f) * ((float) cVar2.f22199b));
        return cVar2;
    }

    /* renamed from: l */
    public static boolean m16729l(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23414a() {
        mo23415b();
        if (this.f22198a == 2) {
            this.f22215r.getCurrX();
            this.f22215r.getCurrY();
            this.f22215r.abortAnimation();
            this.f22216s.mo3600i(this.f22217t, this.f22215r.getCurrX(), this.f22215r.getCurrY());
        }
        mo23429r(0);
    }

    /* renamed from: b */
    public final void mo23415b() {
        this.f22200c = -1;
        float[] fArr = this.f22201d;
        if (fArr != null) {
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f22202e, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f22203f, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f22204g, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f22205h, 0);
            Arrays.fill(this.f22206i, 0);
            Arrays.fill(this.f22207j, 0);
            this.f22208k = 0;
        }
        VelocityTracker velocityTracker = this.f22209l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22209l = null;
        }
    }

    /* renamed from: c */
    public final void mo23416c(int i, View view) {
        if (view.getParent() == this.f22219v) {
            this.f22217t = view;
            this.f22200c = i;
            this.f22216s.mo3598g(i, view);
            mo23429r(1);
            return;
        }
        StringBuilder k = C13555b.m33972k("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        k.append(this.f22219v);
        k.append(")");
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: d */
    public final boolean mo23417d(int i, float f, float f2, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f22205h[i] & i2) != i2 || (this.f22214q & i2) == 0 || (this.f22207j[i] & i2) == i2 || (this.f22206i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f22199b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f22216s.getClass();
        }
        if ((this.f22206i[i] & i2) != 0 || abs <= ((float) this.f22199b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo23418e(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f22216s.mo3595c(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f22216s.mo23436d() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            float f3 = f2 * f2;
            int i = this.f22199b;
            if (f3 + (f * f) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f22199b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f22199b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    public final void mo23419f(int i) {
        float[] fArr = this.f22201d;
        if (fArr != null) {
            int i2 = this.f22208k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f22202e[i] = 0.0f;
                this.f22203f[i] = 0.0f;
                this.f22204g[i] = 0.0f;
                this.f22205h[i] = 0;
                this.f22206i[i] = 0;
                this.f22207j[i] = 0;
                this.f22208k = (~i3) & i2;
            }
        }
    }

    /* renamed from: g */
    public final int mo23420g(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f22219v.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: h */
    public final boolean mo23421h(boolean z) {
        if (this.f22198a == 2) {
            boolean computeScrollOffset = this.f22215r.computeScrollOffset();
            int currX = this.f22215r.getCurrX();
            int currY = this.f22215r.getCurrY();
            int left = currX - this.f22217t.getLeft();
            int top = currY - this.f22217t.getTop();
            if (left != 0) {
                C6333d0.m15022j(left, this.f22217t);
            }
            if (top != 0) {
                C6333d0.m15023k(top, this.f22217t);
            }
            if (!(left == 0 && top == 0)) {
                this.f22216s.mo3600i(this.f22217t, currX, currY);
            }
            if (computeScrollOffset && currX == this.f22215r.getFinalX() && currY == this.f22215r.getFinalY()) {
                this.f22215r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f22219v.post(this.f22220w);
                } else {
                    mo23429r(0);
                }
            }
        }
        if (this.f22198a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final View mo23422j(int i, int i2) {
        for (int childCount = this.f22219v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f22219v;
            this.f22216s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final boolean mo23423k(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f22217t.getLeft();
        int top = this.f22217t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f22215r.abortAnimation();
            mo23429r(0);
            return false;
        }
        View view = this.f22217t;
        int i7 = (int) this.f22211n;
        int i8 = (int) this.f22210m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            if (i3 > 0) {
                i3 = i8;
            } else {
                i3 = -i8;
            }
        }
        int i9 = (int) this.f22211n;
        int i11 = (int) this.f22210m;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i11) {
            if (i4 > 0) {
                i4 = i11;
            } else {
                i4 = -i11;
            }
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i12 = abs5 + abs6;
        int i13 = abs3 + abs4;
        if (i3 != 0) {
            f = (float) abs5;
            f2 = (float) i12;
        } else {
            f = (float) abs3;
            f2 = (float) i13;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f4 = (float) abs6;
            f3 = (float) i12;
        } else {
            f4 = (float) abs4;
            f3 = (float) i13;
        }
        float f6 = f4 / f3;
        OverScroller overScroller = this.f22215r;
        overScroller.startScroll(left, top, i5, i6, (int) ((((float) mo23420g(i6, i4, this.f22216s.mo23436d())) * f6) + (((float) mo23420g(i5, i3, this.f22216s.mo3595c(view))) * f5)));
        mo23429r(2);
        return true;
    }

    /* renamed from: m */
    public final void mo23424m(MotionEvent motionEvent) {
        boolean z;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo23415b();
        }
        if (this.f22209l == null) {
            this.f22209l = VelocityTracker.obtain();
        }
        this.f22209l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View j = mo23422j((int) x, (int) y);
            mo23427p(x, y, pointerId);
            mo23433v(pointerId, j);
            if ((this.f22205h[pointerId] & this.f22214q) != 0) {
                this.f22216s.mo3597f();
            }
        } else if (actionMasked == 1) {
            if (this.f22198a == 1) {
                mo23425n();
            }
            mo23415b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f22198a == 1) {
                    this.f22218u = true;
                    this.f22216s.mo3601j(this.f22217t, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    this.f22218u = false;
                    if (this.f22198a == 1) {
                        mo23429r(0);
                    }
                }
                mo23415b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                mo23427p(x2, y2, pointerId2);
                if (this.f22198a == 0) {
                    mo23433v(pointerId2, mo23422j((int) x2, (int) y2));
                    if ((this.f22205h[pointerId2] & this.f22214q) != 0) {
                        this.f22216s.mo3597f();
                        return;
                    }
                    return;
                }
                if (m16729l(this.f22217t, (int) x2, (int) y2)) {
                    mo23433v(pointerId2, this.f22217t);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f22198a == 1 && pointerId3 == this.f22200c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f22200c) {
                            View j2 = mo23422j((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f22217t;
                            if (j2 == view && mo23433v(pointerId4, view)) {
                                i = this.f22200c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        mo23425n();
                    }
                }
                mo23419f(pointerId3);
            }
        } else if (this.f22198a == 1) {
            int i3 = this.f22200c;
            if ((this.f22208k & (1 << i3)) != 0) {
                i2 = 1;
            }
            if (i2 != 0) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f22203f;
                int i4 = this.f22200c;
                int i5 = (int) (x3 - fArr[i4]);
                int i6 = (int) (y3 - this.f22204g[i4]);
                int left = this.f22217t.getLeft() + i5;
                int top = this.f22217t.getTop() + i6;
                int left2 = this.f22217t.getLeft();
                int top2 = this.f22217t.getTop();
                if (i5 != 0) {
                    left = this.f22216s.mo3593a(this.f22217t, left);
                    C6333d0.m15022j(left - left2, this.f22217t);
                }
                if (i6 != 0) {
                    top = this.f22216s.mo3594b(this.f22217t, top);
                    C6333d0.m15023k(top - top2, this.f22217t);
                }
                if (!(i5 == 0 && i6 == 0)) {
                    this.f22216s.mo3600i(this.f22217t, left, top);
                }
                mo23428q(motionEvent);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i7 = 0; i7 < pointerCount2; i7++) {
                int pointerId5 = motionEvent.getPointerId(i7);
                if ((this.f22208k & (1 << pointerId5)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float x4 = motionEvent.getX(i7);
                    float y4 = motionEvent.getY(i7);
                    float f = x4 - this.f22201d[pointerId5];
                    float f2 = y4 - this.f22202e[pointerId5];
                    mo23426o(f, f2, pointerId5);
                    if (this.f22198a != 1) {
                        View j3 = mo23422j((int) x4, (int) y4);
                        if (mo23418e(j3, f, f2) && mo23433v(pointerId5, j3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            mo23428q(motionEvent);
        }
    }

    /* renamed from: n */
    public final void mo23425n() {
        this.f22209l.computeCurrentVelocity(1000, this.f22210m);
        float xVelocity = this.f22209l.getXVelocity(this.f22200c);
        float f = this.f22211n;
        float f2 = this.f22210m;
        float abs = Math.abs(xVelocity);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (abs < f) {
            xVelocity = BitmapDescriptorFactory.HUE_RED;
        } else if (abs > f2) {
            if (xVelocity > BitmapDescriptorFactory.HUE_RED) {
                xVelocity = f2;
            } else {
                xVelocity = -f2;
            }
        }
        float yVelocity = this.f22209l.getYVelocity(this.f22200c);
        float f4 = this.f22211n;
        float f5 = this.f22210m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > BitmapDescriptorFactory.HUE_RED) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        this.f22218u = true;
        this.f22216s.mo3601j(this.f22217t, xVelocity, f3);
        this.f22218u = false;
        if (this.f22198a == 1) {
            mo23429r(0);
        }
    }

    /* renamed from: o */
    public final void mo23426o(float f, float f2, int i) {
        boolean d = mo23417d(i, f, f2, 1);
        if (mo23417d(i, f2, f, 4)) {
            d |= true;
        }
        if (mo23417d(i, f, f2, 2)) {
            d |= true;
        }
        if (mo23417d(i, f2, f, 8)) {
            d |= true;
        }
        if (d) {
            int[] iArr = this.f22206i;
            iArr[i] = iArr[i] | d;
            this.f22216s.mo3596e(d ? 1 : 0, i);
        }
    }

    /* renamed from: p */
    public final void mo23427p(float f, float f2, int i) {
        float[] fArr = this.f22201d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f22202e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f22203f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f22204g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f22205h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f22206i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f22207j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f22201d = fArr2;
            this.f22202e = fArr3;
            this.f22203f = fArr4;
            this.f22204g = fArr5;
            this.f22205h = iArr;
            this.f22206i = iArr2;
            this.f22207j = iArr3;
        }
        float[] fArr9 = this.f22201d;
        this.f22203f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f22202e;
        this.f22204g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f22205h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f22219v.getLeft() + this.f22212o) {
            i2 = 1;
        }
        if (i5 < this.f22219v.getTop() + this.f22212o) {
            i2 |= 4;
        }
        if (i4 > this.f22219v.getRight() - this.f22212o) {
            i2 |= 2;
        }
        if (i5 > this.f22219v.getBottom() - this.f22212o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f22208k |= 1 << i;
    }

    /* renamed from: q */
    public final void mo23428q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            boolean z = true;
            if ((this.f22208k & (1 << pointerId)) == 0) {
                z = false;
            }
            if (z) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f22203f[pointerId] = x;
                this.f22204g[pointerId] = y;
            }
        }
    }

    /* renamed from: r */
    public final void mo23429r(int i) {
        this.f22219v.removeCallbacks(this.f22220w);
        if (this.f22198a != i) {
            this.f22198a = i;
            this.f22216s.mo3599h(i);
            if (this.f22198a == 0) {
                this.f22217t = null;
            }
        }
    }

    /* renamed from: s */
    public final boolean mo23430s(int i, int i2) {
        if (this.f22218u) {
            return mo23423k(i, i2, (int) this.f22209l.getXVelocity(this.f22200c), (int) this.f22209l.getYVelocity(this.f22200c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if (r12 != r11) goto L_0x00eb;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23431t(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo23415b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f22209l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f22209l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f22209l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0108
            if (r2 == r6) goto L_0x0103
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x0103
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0106
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.mo23419f(r1)
            goto L_0x0106
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo23427p(r7, r1, r2)
            int r3 = r0.f22198a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f22205h
            r1 = r1[r2]
            int r2 = r0.f22214q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0106
            x1.c$c r1 = r0.f22216s
            r1.mo3597f()
            goto L_0x0106
        L_0x005f:
            if (r3 != r4) goto L_0x0106
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo23422j(r3, r1)
            android.view.View r3 = r0.f22217t
            if (r1 != r3) goto L_0x0106
            r0.mo23433v(r2, r1)
            goto L_0x0106
        L_0x0070:
            float[] r2 = r0.f22201d
            if (r2 == 0) goto L_0x0106
            float[] r2 = r0.f22202e
            if (r2 != 0) goto L_0x007a
            goto L_0x0106
        L_0x007a:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00ff
            int r4 = r1.getPointerId(r3)
            int r7 = r0.f22208k
            int r8 = r6 << r4
            r7 = r7 & r8
            if (r7 == 0) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 != 0) goto L_0x0093
            goto L_0x00fc
        L_0x0093:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f22201d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f22202e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo23422j(r7, r8)
            if (r7 == 0) goto L_0x00b7
            boolean r8 = r0.mo23418e(r7, r9, r10)
            if (r8 == 0) goto L_0x00b7
            r8 = 1
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            if (r8 == 0) goto L_0x00eb
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            x1.c$c r13 = r0.f22216s
            int r12 = r13.mo3593a(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            x1.c$c r15 = r0.f22216s
            int r14 = r15.mo3594b(r7, r14)
            x1.c$c r15 = r0.f22216s
            int r15 = r15.mo3595c(r7)
            x1.c$c r5 = r0.f22216s
            int r5 = r5.mo23436d()
            if (r15 == 0) goto L_0x00e4
            if (r15 <= 0) goto L_0x00eb
            if (r12 != r11) goto L_0x00eb
        L_0x00e4:
            if (r5 == 0) goto L_0x00ff
            if (r5 <= 0) goto L_0x00eb
            if (r14 != r13) goto L_0x00eb
            goto L_0x00ff
        L_0x00eb:
            r0.mo23426o(r9, r10, r4)
            int r5 = r0.f22198a
            if (r5 != r6) goto L_0x00f3
            goto L_0x00ff
        L_0x00f3:
            if (r8 == 0) goto L_0x00fc
            boolean r4 = r0.mo23433v(r4, r7)
            if (r4 == 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00ff:
            r16.mo23428q(r17)
            goto L_0x0106
        L_0x0103:
            r16.mo23415b()
        L_0x0106:
            r5 = 0
            goto L_0x0137
        L_0x0108:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.mo23427p(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo23422j(r2, r3)
            android.view.View r3 = r0.f22217t
            if (r2 != r3) goto L_0x0129
            int r3 = r0.f22198a
            if (r3 != r4) goto L_0x0129
            r0.mo23433v(r1, r2)
        L_0x0129:
            int[] r2 = r0.f22205h
            r1 = r2[r1]
            int r2 = r0.f22214q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0137
            x1.c$c r1 = r0.f22216s
            r1.mo3597f()
        L_0x0137:
            int r1 = r0.f22198a
            if (r1 != r6) goto L_0x013c
            r5 = 1
        L_0x013c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p306x1.C7148c.mo23431t(android.view.MotionEvent):boolean");
    }

    /* renamed from: u */
    public final boolean mo23432u(View view, int i, int i2) {
        this.f22217t = view;
        this.f22200c = -1;
        boolean k = mo23423k(i, i2, 0, 0);
        if (!k && this.f22198a == 0 && this.f22217t != null) {
            this.f22217t = null;
        }
        return k;
    }

    /* renamed from: v */
    public final boolean mo23433v(int i, View view) {
        if (view == this.f22217t && this.f22200c == i) {
            return true;
        }
        if (view == null || !this.f22216s.mo3602k(i, view)) {
            return false;
        }
        this.f22200c = i;
        mo23416c(i, view);
        return true;
    }
}
