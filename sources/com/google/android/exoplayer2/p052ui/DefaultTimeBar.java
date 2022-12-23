package com.google.android.exoplayer2.p052ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.p052ui.C4032c0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p054d0.C4268a1;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
public class DefaultTimeBar extends View implements C4032c0 {

    /* renamed from: Q */
    public static final /* synthetic */ int f14161Q = 0;

    /* renamed from: A */
    public final float f14162A;

    /* renamed from: B */
    public int f14163B;

    /* renamed from: C */
    public long f14164C;

    /* renamed from: D */
    public int f14165D;

    /* renamed from: E */
    public Rect f14166E;

    /* renamed from: F */
    public ValueAnimator f14167F;

    /* renamed from: G */
    public float f14168G;

    /* renamed from: H */
    public boolean f14169H;

    /* renamed from: I */
    public boolean f14170I;

    /* renamed from: J */
    public long f14171J;

    /* renamed from: K */
    public long f14172K;

    /* renamed from: L */
    public long f14173L;

    /* renamed from: M */
    public long f14174M;

    /* renamed from: N */
    public int f14175N;

    /* renamed from: O */
    public long[] f14176O;

    /* renamed from: P */
    public boolean[] f14177P;

    /* renamed from: b */
    public final Rect f14178b;

    /* renamed from: c */
    public final Rect f14179c;

    /* renamed from: d */
    public final Rect f14180d;

    /* renamed from: e */
    public final Rect f14181e;

    /* renamed from: f */
    public final Paint f14182f;

    /* renamed from: g */
    public final Paint f14183g;

    /* renamed from: h */
    public final Paint f14184h;

    /* renamed from: i */
    public final Paint f14185i;

    /* renamed from: j */
    public final Paint f14186j;

    /* renamed from: k */
    public final Paint f14187k;

    /* renamed from: l */
    public final Drawable f14188l;

    /* renamed from: m */
    public final int f14189m;

    /* renamed from: n */
    public final int f14190n;

    /* renamed from: o */
    public final int f14191o;

    /* renamed from: p */
    public final int f14192p;

    /* renamed from: q */
    public final int f14193q;

    /* renamed from: r */
    public final int f14194r;

    /* renamed from: s */
    public final int f14195s;

    /* renamed from: t */
    public final int f14196t;

    /* renamed from: u */
    public final int f14197u;

    /* renamed from: v */
    public final StringBuilder f14198v;

    /* renamed from: w */
    public final Formatter f14199w;

    /* renamed from: x */
    public final C4268a1 f14200x;

    /* renamed from: y */
    public final CopyOnWriteArraySet<C4032c0.C4033a> f14201y;

    /* renamed from: z */
    public final Point f14202z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static int m10702c(float f, int i) {
        return (int) ((((float) i) * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f14164C;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f14172K;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f14163B);
    }

    private String getProgressText() {
        return C6774a0.m15958r(this.f14198v, this.f14199w, this.f14173L);
    }

    private long getScrubberPosition() {
        if (this.f14179c.width() <= 0 || this.f14172K == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f14181e.width()) * this.f14172K) / ((long) this.f14179c.width());
    }

    /* renamed from: a */
    public final void mo16352a(C4032c0.C4033a aVar) {
        this.f14201y.add(aVar);
    }

    /* renamed from: b */
    public final void mo16353b(long[] jArr, boolean[] zArr, int i) {
        boolean z;
        if (i == 0 || !(jArr == null || zArr == null)) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        this.f14175N = i;
        this.f14176O = jArr;
        this.f14177P = zArr;
        mo16358g();
    }

    /* renamed from: d */
    public final boolean mo16354d(long j) {
        long j2;
        long j3 = this.f14172K;
        if (j3 <= 0) {
            return false;
        }
        if (this.f14170I) {
            j2 = this.f14171J;
        } else {
            j2 = this.f14173L;
        }
        long j4 = j2;
        long h = C6774a0.m15948h(j4 + j, 0, j3);
        if (h == j4) {
            return false;
        }
        if (!this.f14170I) {
            mo16356e(h);
        } else {
            mo16360h(h);
        }
        mo16358g();
        return true;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14188l;
        if (drawable != null && drawable.isStateful() && this.f14188l.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo16356e(long j) {
        this.f14171J = j;
        this.f14170I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<C4032c0.C4033a> it = this.f14201y.iterator();
        while (it.hasNext()) {
            it.next().mo16432a(j);
        }
    }

    /* renamed from: f */
    public final void mo16357f(boolean z) {
        removeCallbacks(this.f14200x);
        this.f14170I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<C4032c0.C4033a> it = this.f14201y.iterator();
        while (it.hasNext()) {
            it.next().mo16436d(this.f14171J, z);
        }
    }

    /* renamed from: g */
    public final void mo16358g() {
        long j;
        this.f14180d.set(this.f14179c);
        this.f14181e.set(this.f14179c);
        if (this.f14170I) {
            j = this.f14171J;
        } else {
            j = this.f14173L;
        }
        if (this.f14172K > 0) {
            int width = (int) ((((long) this.f14179c.width()) * this.f14174M) / this.f14172K);
            Rect rect = this.f14180d;
            Rect rect2 = this.f14179c;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f14179c.width()) * j) / this.f14172K);
            Rect rect3 = this.f14181e;
            Rect rect4 = this.f14179c;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f14180d;
            int i = this.f14179c.left;
            rect5.right = i;
            this.f14181e.right = i;
        }
        invalidate(this.f14178b);
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (((float) this.f14179c.width()) / this.f14162A);
        if (width != 0) {
            long j = this.f14172K;
            if (!(j == 0 || j == -9223372036854775807L)) {
                return j / ((long) width);
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: h */
    public final void mo16360h(long j) {
        if (this.f14171J != j) {
            this.f14171J = j;
            Iterator<C4032c0.C4033a> it = this.f14201y.iterator();
            while (it.hasNext()) {
                it.next().mo16435c(j);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14188l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        Paint paint;
        Canvas canvas2 = canvas;
        canvas.save();
        int height = this.f14179c.height();
        int centerY = this.f14179c.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.f14172K <= 0) {
            Rect rect = this.f14179c;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i2, this.f14184h);
        } else {
            Rect rect2 = this.f14180d;
            int i3 = rect2.left;
            int i4 = rect2.right;
            int max = Math.max(Math.max(this.f14179c.left, i4), this.f14181e.right);
            int i5 = this.f14179c.right;
            if (max < i5) {
                canvas.drawRect((float) max, (float) centerY, (float) i5, (float) i2, this.f14184h);
            }
            int max2 = Math.max(i3, this.f14181e.right);
            if (i4 > max2) {
                canvas.drawRect((float) max2, (float) centerY, (float) i4, (float) i2, this.f14183g);
            }
            if (this.f14181e.width() > 0) {
                Rect rect3 = this.f14181e;
                canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i2, this.f14182f);
            }
            if (this.f14175N != 0) {
                long[] jArr = this.f14176O;
                jArr.getClass();
                boolean[] zArr = this.f14177P;
                zArr.getClass();
                int i6 = this.f14192p / 2;
                for (int i7 = 0; i7 < this.f14175N; i7++) {
                    long h = C6774a0.m15948h(jArr[i7], 0, this.f14172K);
                    Rect rect4 = this.f14179c;
                    int min = Math.min(rect4.width() - this.f14192p, Math.max(0, ((int) ((((long) this.f14179c.width()) * h) / this.f14172K)) - i6)) + rect4.left;
                    if (zArr[i7]) {
                        paint = this.f14186j;
                    } else {
                        paint = this.f14185i;
                    }
                    Canvas canvas3 = canvas;
                    canvas3.drawRect((float) min, (float) centerY, (float) (min + this.f14192p), (float) i2, paint);
                }
            }
        }
        if (this.f14172K > 0) {
            Rect rect5 = this.f14181e;
            int g = C6774a0.m15947g(rect5.right, rect5.left, this.f14179c.right);
            int centerY2 = this.f14181e.centerY();
            Drawable drawable = this.f14188l;
            if (drawable == null) {
                if (this.f14170I || isFocused()) {
                    i = this.f14195s;
                } else if (isEnabled()) {
                    i = this.f14193q;
                } else {
                    i = this.f14194r;
                }
                canvas2.drawCircle((float) g, (float) centerY2, (float) ((int) ((((float) i) * this.f14168G) / 2.0f)), this.f14187k);
            } else {
                int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f14168G)) / 2;
                int intrinsicHeight = ((int) (((float) this.f14188l.getIntrinsicHeight()) * this.f14168G)) / 2;
                this.f14188l.setBounds(g - intrinsicWidth, centerY2 - intrinsicHeight, g + intrinsicWidth, centerY2 + intrinsicHeight);
                this.f14188l.draw(canvas2);
            }
        }
        canvas.restore();
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f14170I && !z) {
            mo16357f(false);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f14172K > 0) {
            if (C6774a0.f20959a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (mo16354d(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f14200x);
        postDelayed(r4.f14200x, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.mo16354d(r0)
            if (r0 == 0) goto L_0x0030
            d0.a1 r5 = r4.f14200x
            r4.removeCallbacks(r5)
            d0.a1 r5 = r4.f14200x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f14170I
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.mo16357f(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.f14169H) {
            i5 = 0;
        } else {
            i5 = this.f14196t;
        }
        if (this.f14191o == 1) {
            i7 = (i9 - getPaddingBottom()) - this.f14190n;
            int i11 = this.f14189m;
            i6 = ((i9 - getPaddingBottom()) - i11) - Math.max(i5 - (i11 / 2), 0);
        } else {
            i7 = (i9 - this.f14190n) / 2;
            i6 = (i9 - this.f14189m) / 2;
        }
        this.f14178b.set(paddingLeft, i7, paddingRight, this.f14190n + i7);
        Rect rect2 = this.f14179c;
        Rect rect3 = this.f14178b;
        rect2.set(rect3.left + i5, i6, rect3.right - i5, this.f14189m + i6);
        if (C6774a0.f20959a >= 29 && !((rect = this.f14166E) != null && rect.width() == i8 && this.f14166E.height() == i9)) {
            Rect rect4 = new Rect(0, 0, i8, i9);
            this.f14166E = rect4;
            setSystemGestureExclusionRects(Collections.singletonList(rect4));
        }
        mo16358g();
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f14190n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f14190n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f14188l;
        if (drawable != null && drawable.isStateful() && this.f14188l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        boolean z;
        Drawable drawable = this.f14188l;
        if (drawable != null) {
            if (C6774a0.f20959a < 23 || !drawable.setLayoutDirection(i)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r3 != 3) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x00ab
            long r2 = r7.f14172K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            goto L_0x00ab
        L_0x0011:
            android.graphics.Point r0 = r7.f14202z
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.f14202z
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x0083
            r5 = 3
            if (r3 == r4) goto L_0x0074
            r6 = 2
            if (r3 == r6) goto L_0x0036
            if (r3 == r5) goto L_0x0074
            goto L_0x00ab
        L_0x0036:
            boolean r8 = r7.f14170I
            if (r8 == 0) goto L_0x00ab
            int r8 = r7.f14197u
            if (r0 >= r8) goto L_0x0054
            int r8 = r7.f14165D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            android.graphics.Rect r0 = r7.f14181e
            int r8 = (int) r8
            android.graphics.Rect r1 = r7.f14179c
            int r2 = r1.left
            int r1 = r1.right
            int r8 = p277ub.C6774a0.m15947g(r8, r2, r1)
            r0.right = r8
            goto L_0x0066
        L_0x0054:
            r7.f14165D = r2
            float r8 = (float) r2
            android.graphics.Rect r0 = r7.f14181e
            int r8 = (int) r8
            android.graphics.Rect r1 = r7.f14179c
            int r2 = r1.left
            int r1 = r1.right
            int r8 = p277ub.C6774a0.m15947g(r8, r2, r1)
            r0.right = r8
        L_0x0066:
            long r0 = r7.getScrubberPosition()
            r7.mo16360h(r0)
            r7.mo16358g()
            r7.invalidate()
            return r4
        L_0x0074:
            boolean r0 = r7.f14170I
            if (r0 == 0) goto L_0x00ab
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x007f
            r1 = 1
        L_0x007f:
            r7.mo16357f(r1)
            return r4
        L_0x0083:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.f14178b
            int r8 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r8, r0)
            if (r0 == 0) goto L_0x00ab
            android.graphics.Rect r0 = r7.f14181e
            android.graphics.Rect r1 = r7.f14179c
            int r2 = r1.left
            int r1 = r1.right
            int r8 = p277ub.C6774a0.m15947g(r8, r2, r1)
            r0.right = r8
            long r0 = r7.getScrubberPosition()
            r7.mo16356e(r0)
            r7.mo16358g()
            r7.invalidate()
            return r4
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f14172K <= 0) {
            return false;
        }
        if (i == 8192) {
            if (mo16354d(-getPositionIncrement())) {
                mo16357f(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (mo16354d(getPositionIncrement())) {
                mo16357f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f14185i.setColor(i);
        invalidate(this.f14178b);
    }

    public void setBufferedColor(int i) {
        this.f14183g.setColor(i);
        invalidate(this.f14178b);
    }

    public void setBufferedPosition(long j) {
        this.f14174M = j;
        mo16358g();
    }

    public void setDuration(long j) {
        this.f14172K = j;
        if (this.f14170I && j == -9223372036854775807L) {
            mo16357f(true);
        }
        mo16358g();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f14170I && !z) {
            mo16357f(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        this.f14163B = i;
        this.f14164C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        this.f14163B = -1;
        this.f14164C = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f14186j.setColor(i);
        invalidate(this.f14178b);
    }

    public void setPlayedColor(int i) {
        this.f14182f.setColor(i);
        invalidate(this.f14178b);
    }

    public void setPosition(long j) {
        this.f14173L = j;
        setContentDescription(getProgressText());
        mo16358g();
    }

    public void setScrubberColor(int i) {
        this.f14187k.setColor(i);
        invalidate(this.f14178b);
    }

    public void setUnplayedColor(int i) {
        this.f14184h.setColor(i);
        invalidate(this.f14178b);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        AttributeSet attributeSet3 = attributeSet2;
        this.f14178b = new Rect();
        this.f14179c = new Rect();
        this.f14180d = new Rect();
        this.f14181e = new Rect();
        Paint paint = new Paint();
        this.f14182f = paint;
        Paint paint2 = new Paint();
        this.f14183g = paint2;
        Paint paint3 = new Paint();
        this.f14184h = paint3;
        Paint paint4 = new Paint();
        this.f14185i = paint4;
        Paint paint5 = new Paint();
        this.f14186j = paint5;
        Paint paint6 = new Paint();
        this.f14187k = paint6;
        paint6.setAntiAlias(true);
        this.f14201y = new CopyOnWriteArraySet<>();
        this.f14202z = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f14162A = f;
        this.f14197u = m10702c(f, -50);
        int c = m10702c(f, 4);
        int c2 = m10702c(f, 26);
        int c3 = m10702c(f, 4);
        int c4 = m10702c(f, 12);
        int c5 = m10702c(f, 0);
        int c6 = m10702c(f, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint4;
            Paint paint8 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, C4046o.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C4046o.DefaultTimeBar_scrubber_drawable);
                this.f14188l = drawable;
                if (drawable != null) {
                    int i3 = C6774a0.f20959a;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            boolean h = drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    c2 = Math.max(drawable.getMinimumHeight(), c2);
                }
                this.f14189m = obtainStyledAttributes.getDimensionPixelSize(C4046o.DefaultTimeBar_bar_height, c);
                this.f14190n = obtainStyledAttributes.getDimensionPixelSize(C4046o.DefaultTimeBar_touch_target_height, c2);
                this.f14191o = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_bar_gravity, 0);
                this.f14192p = obtainStyledAttributes.getDimensionPixelSize(C4046o.DefaultTimeBar_ad_marker_width, c3);
                this.f14193q = obtainStyledAttributes.getDimensionPixelSize(C4046o.DefaultTimeBar_scrubber_enabled_size, c4);
                this.f14194r = obtainStyledAttributes.getDimensionPixelSize(C4046o.DefaultTimeBar_scrubber_disabled_size, c5);
                this.f14195s = obtainStyledAttributes.getDimensionPixelSize(C4046o.DefaultTimeBar_scrubber_dragged_size, c6);
                int i4 = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_played_color, -1);
                int i5 = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_scrubber_color, -1);
                int i6 = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_buffered_color, -855638017);
                int i7 = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_unplayed_color, 872415231);
                int i8 = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_ad_marker_color, -1291845888);
                int i9 = obtainStyledAttributes.getInt(C4046o.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint7.setColor(i8);
                paint8.setColor(i9);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f14189m = c;
            this.f14190n = c2;
            this.f14191o = 0;
            this.f14192p = c3;
            this.f14193q = c4;
            this.f14194r = c5;
            this.f14195s = c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f14188l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f14198v = sb;
        this.f14199w = new Formatter(sb, Locale.getDefault());
        this.f14200x = new C4268a1(this, 8);
        Drawable drawable2 = this.f14188l;
        if (drawable2 != null) {
            this.f14196t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f14196t = (Math.max(this.f14194r, Math.max(this.f14193q, this.f14195s)) + 1) / 2;
        }
        this.f14168G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f14167F = valueAnimator;
        valueAnimator.addUpdateListener(new C4029b(this));
        this.f14172K = -9223372036854775807L;
        this.f14164C = -9223372036854775807L;
        this.f14163B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
