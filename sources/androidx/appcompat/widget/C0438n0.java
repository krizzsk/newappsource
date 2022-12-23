package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p188o.C5901f;

/* renamed from: androidx.appcompat.widget.n0 */
public abstract class C0438n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f1576b;

    /* renamed from: c */
    public final int f1577c;

    /* renamed from: d */
    public final int f1578d;

    /* renamed from: e */
    public final View f1579e;

    /* renamed from: f */
    public C0439a f1580f;

    /* renamed from: g */
    public C0440b f1581g;

    /* renamed from: h */
    public boolean f1582h;

    /* renamed from: i */
    public int f1583i;

    /* renamed from: j */
    public final int[] f1584j = new int[2];

    /* renamed from: androidx.appcompat.widget.n0$a */
    public class C0439a implements Runnable {
        public C0439a() {
        }

        public final void run() {
            ViewParent parent = C0438n0.this.f1579e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$b */
    public class C0440b implements Runnable {
        public C0440b() {
        }

        public final void run() {
            C0438n0 n0Var = C0438n0.this;
            n0Var.mo2164a();
            View view = n0Var.f1579e;
            if (view.isEnabled() && !view.isLongClickable() && n0Var.mo1029c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                n0Var.f1582h = true;
            }
        }
    }

    public C0438n0(View view) {
        this.f1579e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1576b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1577c = tapTimeout;
        this.f1578d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void mo2164a() {
        C0440b bVar = this.f1581g;
        if (bVar != null) {
            this.f1579e.removeCallbacks(bVar);
        }
        C0439a aVar = this.f1580f;
        if (aVar != null) {
            this.f1579e.removeCallbacks(aVar);
        }
    }

    /* renamed from: b */
    public abstract C5901f mo1028b();

    /* renamed from: c */
    public abstract boolean mo1029c();

    /* renamed from: d */
    public boolean mo1333d() {
        C5901f b = mo1028b();
        if (b == null || !b.mo1048a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4 != 3) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r11 = r10.f1582h
            r0 = 0
            r1 = 1
            r2 = 3
            if (r11 == 0) goto L_0x006f
            android.view.View r3 = r10.f1579e
            o.f r4 = r10.mo1028b()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.mo1048a()
            if (r5 != 0) goto L_0x0016
            goto L_0x005f
        L_0x0016:
            androidx.appcompat.widget.l0 r4 = r4.mo1057n()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0023
            goto L_0x005f
        L_0x0023:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r12)
            int[] r6 = r10.f1584j
            r3.getLocationOnScreen(r6)
            r3 = r6[r0]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r10.f1584j
            r4.getLocationOnScreen(r3)
            r6 = r3[r0]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r10.f1583i
            boolean r3 = r4.mo2144b(r5, r3)
            r5.recycle()
            int r12 = r12.getActionMasked()
            if (r12 == r1) goto L_0x0058
            if (r12 == r2) goto L_0x0058
            r12 = 1
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            if (r3 == 0) goto L_0x005f
            if (r12 == 0) goto L_0x005f
            r12 = 1
            goto L_0x0060
        L_0x005f:
            r12 = 0
        L_0x0060:
            if (r12 != 0) goto L_0x006c
            boolean r12 = r10.mo1333d()
            if (r12 != 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r12 = 0
            goto L_0x0125
        L_0x006c:
            r12 = 1
            goto L_0x0125
        L_0x006f:
            android.view.View r3 = r10.f1579e
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r4 = r12.getActionMasked()
            if (r4 == 0) goto L_0x00d6
            if (r4 == r1) goto L_0x00d2
            r5 = 2
            if (r4 == r5) goto L_0x0088
            if (r4 == r2) goto L_0x00d2
            goto L_0x0102
        L_0x0088:
            int r2 = r10.f1583i
            int r2 = r12.findPointerIndex(r2)
            if (r2 < 0) goto L_0x0102
            float r4 = r12.getX(r2)
            float r12 = r12.getY(r2)
            float r2 = r10.f1576b
            float r5 = -r2
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c3
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c3
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r2
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c3
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r2
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x00c3
            r12 = 1
            goto L_0x00c4
        L_0x00c3:
            r12 = 0
        L_0x00c4:
            if (r12 != 0) goto L_0x0102
            r10.mo2164a()
            android.view.ViewParent r12 = r3.getParent()
            r12.requestDisallowInterceptTouchEvent(r1)
            r12 = 1
            goto L_0x0103
        L_0x00d2:
            r10.mo2164a()
            goto L_0x0102
        L_0x00d6:
            int r12 = r12.getPointerId(r0)
            r10.f1583i = r12
            androidx.appcompat.widget.n0$a r12 = r10.f1580f
            if (r12 != 0) goto L_0x00e7
            androidx.appcompat.widget.n0$a r12 = new androidx.appcompat.widget.n0$a
            r12.<init>()
            r10.f1580f = r12
        L_0x00e7:
            androidx.appcompat.widget.n0$a r12 = r10.f1580f
            int r2 = r10.f1577c
            long r4 = (long) r2
            r3.postDelayed(r12, r4)
            androidx.appcompat.widget.n0$b r12 = r10.f1581g
            if (r12 != 0) goto L_0x00fa
            androidx.appcompat.widget.n0$b r12 = new androidx.appcompat.widget.n0$b
            r12.<init>()
            r10.f1581g = r12
        L_0x00fa:
            androidx.appcompat.widget.n0$b r12 = r10.f1581g
            int r2 = r10.f1578d
            long r4 = (long) r2
            r3.postDelayed(r12, r4)
        L_0x0102:
            r12 = 0
        L_0x0103:
            if (r12 == 0) goto L_0x010d
            boolean r12 = r10.mo1029c()
            if (r12 == 0) goto L_0x010d
            r12 = 1
            goto L_0x010e
        L_0x010d:
            r12 = 0
        L_0x010e:
            if (r12 == 0) goto L_0x0125
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.f1579e
            r3.onTouchEvent(r2)
            r2.recycle()
        L_0x0125:
            r10.f1582h = r12
            if (r12 != 0) goto L_0x012b
            if (r11 == 0) goto L_0x012c
        L_0x012b:
            r0 = 1
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0438n0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f1582h = false;
        this.f1583i = -1;
        C0439a aVar = this.f1580f;
        if (aVar != null) {
            this.f1579e.removeCallbacks(aVar);
        }
    }
}
