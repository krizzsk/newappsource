package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ce0.C21100e;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: c */
    public C13885a f34199c;

    /* renamed from: d */
    public OverScroller f34200d;

    /* renamed from: e */
    public boolean f34201e;

    /* renamed from: f */
    public int f34202f = -1;

    /* renamed from: g */
    public int f34203g;

    /* renamed from: h */
    public int f34204h = -1;

    /* renamed from: i */
    public VelocityTracker f34205i;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    public class C13885a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f34206b;

        /* renamed from: c */
        public final V f34207c;

        public C13885a(CoordinatorLayout coordinatorLayout, V v) {
            this.f34206b = coordinatorLayout;
            this.f34207c = v;
        }

        public final void run() {
            OverScroller overScroller;
            if (this.f34207c != null && (overScroller = HeaderBehavior.this.f34200d) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo40959i(this.f34206b, this.f34207c, headerBehavior.f34200d.getCurrY());
                    V v = this.f34207c;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15053m(v, this);
                    return;
                }
                HeaderBehavior.this.mo40868g(this.f34206b, this.f34207c);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: c */
    public boolean mo40864c(V v) {
        return false;
    }

    /* renamed from: d */
    public int mo40865d(V v) {
        return -v.getHeight();
    }

    /* renamed from: e */
    public int mo40866e(V v) {
        return v.getHeight();
    }

    /* renamed from: f */
    public int mo40867f() {
        return mo40972a();
    }

    /* renamed from: g */
    public void mo40868g(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: h */
    public int mo40869h(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int z;
        int a = mo40972a();
        if (i2 == 0 || a < i2 || a > i3 || a == (z = C21100e.m49377z(i, i2, i3))) {
            return 0;
        }
        C13894i iVar = this.f34220a;
        if (iVar != null) {
            iVar.mo40977b(z);
        } else {
            this.f34221b = z;
        }
        return a - z;
    }

    /* renamed from: i */
    public final void mo40959i(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo40869h(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f34204h < 0) {
            this.f34204h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f34201e) {
            int i = this.f34202f;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f34203g) > this.f34204h) {
                this.f34203g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f34202f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!mo40864c(v) || !coordinatorLayout.mo3306u(v, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.f34201e = z;
            if (z) {
                this.f34203g = y2;
                this.f34202f = motionEvent.getPointerId(0);
                if (this.f34205i == null) {
                    this.f34205i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f34200d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f34200d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f34205i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r8 = 1
            r9 = 0
            r1 = 0
            r3 = -1
            if (r0 == r8) goto L_0x005e
            r4 = 2
            if (r0 == r4) goto L_0x0034
            r2 = 3
            if (r0 == r2) goto L_0x00c5
            r1 = 6
            if (r0 == r1) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            int r1 = r7.getPointerId(r0)
            r6.f34202f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f34203g = r0
            goto L_0x005b
        L_0x0034:
            int r0 = r6.f34202f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r3) goto L_0x003d
            return r9
        L_0x003d:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f34203g
            int r1 = r1 - r0
            r6.f34203g = r0
            int r4 = r6.mo40865d(r2)
            r5 = 0
            int r0 = r19.mo40867f()
            int r3 = r0 - r1
            r0 = r19
            r1 = r20
            r2 = r21
            r0.mo40869h(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = 0
            goto L_0x00d3
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f34205i
            if (r0 == 0) goto L_0x00c5
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f34205i
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.f34205i
            int r4 = r6.f34202f
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.mo40866e(r2)
            int r4 = -r4
            r18 = 0
            com.google.android.material.appbar.HeaderBehavior$a r5 = r6.f34199c
            if (r5 == 0) goto L_0x0084
            r2.removeCallbacks(r5)
            r6.f34199c = r1
        L_0x0084:
            android.widget.OverScroller r5 = r6.f34200d
            if (r5 != 0) goto L_0x0093
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.f34200d = r5
        L_0x0093:
            android.widget.OverScroller r10 = r6.f34200d
            r11 = 0
            int r12 = r19.mo40972a()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f34200d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            com.google.android.material.appbar.HeaderBehavior$a r0 = new com.google.android.material.appbar.HeaderBehavior$a
            r4 = r20
            r0.<init>(r4, r2)
            r6.f34199c = r0
            java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15053m(r2, r0)
            goto L_0x00c3
        L_0x00be:
            r4 = r20
            r19.mo40868g(r20, r21)
        L_0x00c3:
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            r6.f34201e = r9
            r6.f34202f = r3
            android.view.VelocityTracker r2 = r6.f34205i
            if (r2 == 0) goto L_0x00d3
            r2.recycle()
            r6.f34205i = r1
        L_0x00d3:
            android.view.VelocityTracker r1 = r6.f34205i
            if (r1 == 0) goto L_0x00da
            r1.addMovement(r7)
        L_0x00da:
            boolean r1 = r6.f34201e
            if (r1 != 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
