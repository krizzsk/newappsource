package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import p114i.C5220f;
import p114i.C5224j;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f1017b;

    /* renamed from: c */
    public C0383a1 f1018c;

    /* renamed from: d */
    public View f1019d;

    /* renamed from: e */
    public View f1020e;

    /* renamed from: f */
    public Drawable f1021f;

    /* renamed from: g */
    public Drawable f1022g;

    /* renamed from: h */
    public Drawable f1023h;

    /* renamed from: i */
    public boolean f1024i;

    /* renamed from: j */
    public boolean f1025j;

    /* renamed from: k */
    public int f1026k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0385b bVar = new C0385b(this);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.ActionBar);
        this.f1021f = obtainStyledAttributes.getDrawable(C5224j.ActionBar_background);
        this.f1022g = obtainStyledAttributes.getDrawable(C5224j.ActionBar_backgroundStacked);
        this.f1026k = obtainStyledAttributes.getDimensionPixelSize(C5224j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C5220f.split_action_bar) {
            this.f1024i = true;
            this.f1023h = obtainStyledAttributes.getDrawable(C5224j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1024i ? !(this.f1021f == null && this.f1022g == null) : this.f1023h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public static int m742a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1021f;
        if (drawable != null && drawable.isStateful()) {
            this.f1021f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1022g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1022g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1023h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1023h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1018c;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1021f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1022g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1023h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1019d = findViewById(C5220f.action_bar);
        this.f1020e = findViewById(C5220f.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1017b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.a1 r5 = r4.f1018c
            r7 = 0
            r9 = 1
            r0 = 8
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r0) goto L_0x0033
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r0 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r0 = r0 - r2
            r5.layout(r6, r3, r8, r0)
        L_0x0033:
            boolean r6 = r4.f1024i
            if (r6 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r5 = r4.f1023h
            if (r5 == 0) goto L_0x00bc
            int r6 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            r5.setBounds(r7, r7, r6, r8)
            goto L_0x00bb
        L_0x0048:
            android.graphics.drawable.Drawable r6 = r4.f1021f
            if (r6 == 0) goto L_0x00a0
            android.view.View r6 = r4.f1019d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0072
            android.graphics.drawable.Drawable r6 = r4.f1021f
            android.view.View r7 = r4.f1019d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1019d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1019d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1019d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009f
        L_0x0072:
            android.view.View r6 = r4.f1020e
            if (r6 == 0) goto L_0x009a
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009a
            android.graphics.drawable.Drawable r6 = r4.f1021f
            android.view.View r7 = r4.f1020e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1020e
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1020e
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1020e
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009f
        L_0x009a:
            android.graphics.drawable.Drawable r6 = r4.f1021f
            r6.setBounds(r7, r7, r7, r7)
        L_0x009f:
            r7 = 1
        L_0x00a0:
            r4.f1025j = r1
            if (r1 == 0) goto L_0x00bc
            android.graphics.drawable.Drawable r6 = r4.f1022g
            if (r6 == 0) goto L_0x00bc
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00bb:
            r7 = 1
        L_0x00bc:
            if (r7 == 0) goto L_0x00c1
            r4.invalidate()
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (this.f1019d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f1026k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1019d != null) {
            int mode = View.MeasureSpec.getMode(i2);
            C0383a1 a1Var = this.f1018c;
            if (a1Var != null && a1Var.getVisibility() != 8 && mode != 1073741824) {
                View view = this.f1019d;
                boolean z2 = true;
                int i5 = 0;
                if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i5 = m742a(this.f1019d);
                } else {
                    View view2 = this.f1020e;
                    if (!(view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0)) {
                        z2 = false;
                    }
                    if (!z2) {
                        i5 = m742a(this.f1020e);
                    }
                }
                if (mode == Integer.MIN_VALUE) {
                    i3 = View.MeasureSpec.getSize(i2);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(m742a(this.f1018c) + i5, i3));
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1021f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1021f);
        }
        this.f1021f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1019d;
            if (view != null) {
                this.f1021f.setBounds(view.getLeft(), this.f1019d.getTop(), this.f1019d.getRight(), this.f1019d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1024i ? !(this.f1021f == null && this.f1022g == null) : this.f1023h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1023h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1023h);
        }
        this.f1023h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1024i && (drawable2 = this.f1023h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1024i ? this.f1021f == null && this.f1022g == null : this.f1023h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1022g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1022g);
        }
        this.f1022g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1025j && (drawable2 = this.f1022g) != null) {
                drawable2.setBounds(this.f1018c.getLeft(), this.f1018c.getTop(), this.f1018c.getRight(), this.f1018c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1024i ? !(this.f1021f == null && this.f1022g == null) : this.f1023h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0383a1 a1Var) {
        C0383a1 a1Var2 = this.f1018c;
        if (a1Var2 != null) {
            removeView(a1Var2);
        }
        this.f1018c = a1Var;
        if (a1Var != null) {
            addView(a1Var);
            ViewGroup.LayoutParams layoutParams = a1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            a1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1017b = z;
        if (z) {
            i = 393216;
        } else {
            i = SQLiteDatabase.OPEN_PRIVATECACHE;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1021f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1022g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1023h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f1021f || this.f1024i) && ((drawable != this.f1022g || !this.f1025j) && ((drawable != this.f1023h || !this.f1024i) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }
}
