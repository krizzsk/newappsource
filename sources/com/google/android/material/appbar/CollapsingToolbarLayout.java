package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C14047c;
import com.google.android.material.internal.C14050d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p141k1.C5450a;
import p229r1.C6232b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6391t;
import p242s1.C6396v0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13410k;
import p355ac.C13411l;
import p380bc.C13577a;
import p599kc.C18017a;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: E */
    public static final int f34165E = C13410k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    public int f34166A;

    /* renamed from: B */
    public boolean f34167B;

    /* renamed from: C */
    public int f34168C;

    /* renamed from: D */
    public boolean f34169D;

    /* renamed from: b */
    public boolean f34170b;

    /* renamed from: c */
    public int f34171c;

    /* renamed from: d */
    public ViewGroup f34172d;

    /* renamed from: e */
    public View f34173e;

    /* renamed from: f */
    public View f34174f;

    /* renamed from: g */
    public int f34175g;

    /* renamed from: h */
    public int f34176h;

    /* renamed from: i */
    public int f34177i;

    /* renamed from: j */
    public int f34178j;

    /* renamed from: k */
    public final Rect f34179k;

    /* renamed from: l */
    public final C14047c f34180l;

    /* renamed from: m */
    public final C18017a f34181m;

    /* renamed from: n */
    public boolean f34182n;

    /* renamed from: o */
    public boolean f34183o;

    /* renamed from: p */
    public Drawable f34184p;

    /* renamed from: q */
    public Drawable f34185q;

    /* renamed from: r */
    public int f34186r;

    /* renamed from: s */
    public boolean f34187s;

    /* renamed from: t */
    public ValueAnimator f34188t;

    /* renamed from: u */
    public long f34189u;

    /* renamed from: v */
    public int f34190v;

    /* renamed from: w */
    public C13884b f34191w;

    /* renamed from: x */
    public int f34192x;

    /* renamed from: y */
    public int f34193y;

    /* renamed from: z */
    public C6396v0 f34194z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C13883a implements C6391t {
        public C13883a() {
        }

        public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
            C6396v0 v0Var2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15042b(collapsingToolbarLayout)) {
                v0Var2 = v0Var;
            } else {
                v0Var2 = null;
            }
            if (!C6232b.m14816a(collapsingToolbarLayout.f34194z, v0Var2)) {
                collapsingToolbarLayout.f34194z = v0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return v0Var.f20044a.mo22526c();
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C13884b implements AppBarLayout.C13882f {
        public C13884b() {
        }

        /* renamed from: a */
        public final void mo40881a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f34192x = i;
            C6396v0 v0Var = collapsingToolbarLayout.f34194z;
            if (v0Var != null) {
                i2 = v0Var.mo22506e();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C13894i b = CollapsingToolbarLayout.m34621b(childAt);
                int i4 = layoutParams.f34195a;
                if (i4 == 1) {
                    CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
                    collapsingToolbarLayout2.getClass();
                    b.mo40977b(C21100e.m49377z(-i, 0, ((collapsingToolbarLayout2.getHeight() - CollapsingToolbarLayout.m34621b(childAt).f34236b) - childAt.getHeight()) - ((LayoutParams) childAt.getLayoutParams()).bottomMargin));
                } else if (i4 == 2) {
                    b.mo40977b(Math.round(((float) (-i)) * layoutParams.f34196b));
                }
            }
            CollapsingToolbarLayout.this.mo40886d();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout3.f34185q != null && i2 > 0) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15051k(collapsingToolbarLayout3);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            int d = (height - C6333d0.C6337d.m15044d(collapsingToolbarLayout4)) - i2;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            C14047c cVar = CollapsingToolbarLayout.this.f34180l;
            float f = (float) d;
            float min = Math.min(1.0f, ((float) scrimVisibleHeightTrigger) / f);
            cVar.f35017e = min;
            cVar.f35019f = C16759e.m42347c(1.0f, min, 0.5f, min);
            CollapsingToolbarLayout collapsingToolbarLayout5 = CollapsingToolbarLayout.this;
            C14047c cVar2 = collapsingToolbarLayout5.f34180l;
            cVar2.f35021g = collapsingToolbarLayout5.f34192x + d;
            cVar2.mo41872q(((float) Math.abs(i)) / f);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.collapsingToolbarLayoutStyle);
    }

    /* renamed from: b */
    public static C13894i m34621b(View view) {
        int i = C13405f.view_offset_helper;
        C13894i iVar = (C13894i) view.getTag(i);
        if (iVar != null) {
            return iVar;
        }
        C13894i iVar2 = new C13894i(view);
        view.setTag(i, iVar2);
        return iVar2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40883a() {
        /*
            r6 = this;
            boolean r0 = r6.f34170b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f34172d = r0
            r6.f34173e = r0
            int r1 = r6.f34171c
            r2 = -1
            if (r1 == r2) goto L_0x002f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f34172d = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r2 = r1.getParent()
        L_0x001d:
            if (r2 == r6) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001d
        L_0x002d:
            r6.f34173e = r1
        L_0x002f:
            android.view.ViewGroup r1 = r6.f34172d
            r2 = 0
            if (r1 != 0) goto L_0x0056
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0039:
            if (r3 >= r1) goto L_0x0054
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 != 0) goto L_0x004a
            boolean r5 = r4 instanceof android.widget.Toolbar
            if (r5 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r5 = 0
            goto L_0x004b
        L_0x004a:
            r5 = 1
        L_0x004b:
            if (r5 == 0) goto L_0x0051
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0054
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0054:
            r6.f34172d = r0
        L_0x0056:
            r6.mo40884c()
            r6.f34170b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.mo40883a():void");
    }

    /* renamed from: c */
    public final void mo40884c() {
        View view;
        if (!this.f34182n && (view = this.f34174f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f34174f);
            }
        }
        if (this.f34182n && this.f34172d != null) {
            if (this.f34174f == null) {
                this.f34174f = new View(getContext());
            }
            if (this.f34174f.getParent() == null) {
                this.f34172d.addView(this.f34174f, -1, -1);
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void mo40886d() {
        boolean z;
        if (this.f34184p != null || this.f34185q != null) {
            if (getHeight() + this.f34192x < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        mo40883a();
        if (this.f34172d == null && (drawable = this.f34184p) != null && this.f34186r > 0) {
            drawable.mutate().setAlpha(this.f34186r);
            this.f34184p.draw(canvas);
        }
        if (this.f34182n && this.f34183o) {
            if (!(this.f34172d == null || this.f34184p == null || this.f34186r <= 0)) {
                boolean z = true;
                if (this.f34193y != 1) {
                    z = false;
                }
                if (z) {
                    C14047c cVar = this.f34180l;
                    if (cVar.f35013c < cVar.f35019f) {
                        int save = canvas.save();
                        canvas.clipRect(this.f34184p.getBounds(), Region.Op.DIFFERENCE);
                        this.f34180l.mo41860d(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            }
            this.f34180l.mo41860d(canvas);
        }
        if (this.f34185q != null && this.f34186r > 0) {
            C6396v0 v0Var = this.f34194z;
            if (v0Var != null) {
                i = v0Var.mo22506e();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f34185q.setBounds(0, -this.f34192x, getWidth(), i - this.f34192x);
                this.f34185q.mutate().setAlpha(this.f34186r);
                this.f34185q.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean drawChild(android.graphics.Canvas r7, android.view.View r8, long r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f34184p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004d
            int r3 = r6.f34186r
            if (r3 <= 0) goto L_0x004d
            android.view.View r3 = r6.f34173e
            if (r3 == 0) goto L_0x0014
            if (r3 != r6) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r8 != r3) goto L_0x001a
            goto L_0x0018
        L_0x0014:
            android.view.ViewGroup r3 = r6.f34172d
            if (r8 != r3) goto L_0x001a
        L_0x0018:
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x004d
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r5 = r6.f34193y
            if (r5 != r1) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0038
            boolean r5 = r6.f34182n
            if (r5 == 0) goto L_0x0038
            int r4 = r8.getBottom()
        L_0x0038:
            r0.setBounds(r2, r2, r3, r4)
            android.graphics.drawable.Drawable r0 = r6.f34184p
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r6.f34186r
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r6.f34184p
            r0.draw(r7)
            r0 = 1
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            boolean r7 = super.drawChild(r7, r8, r9)
            if (r7 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f34185q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f34184p;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C14047c cVar = this.f34180l;
        if (cVar != null) {
            z |= cVar.mo41874s(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo40890e(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i11;
        int i12;
        boolean z5 = z;
        if (this.f34182n && (view = this.f34174f) != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            boolean z6 = false;
            if (!C6333d0.C6340g.m15075b(view) || this.f34174f.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f34183o = z2;
            if (z2 || z5) {
                if (C6333d0.C6338e.m15063d(this) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                View view2 = this.f34173e;
                if (view2 == null) {
                    view2 = this.f34172d;
                }
                int height = ((getHeight() - m34621b(view2).f34236b) - view2.getHeight()) - ((LayoutParams) view2.getLayoutParams()).bottomMargin;
                C14050d.m35033a(this, this.f34174f, this.f34179k);
                ViewGroup viewGroup = this.f34172d;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i7 = toolbar.getTitleMarginStart();
                    i6 = toolbar.getTitleMarginEnd();
                    i5 = toolbar.getTitleMarginTop();
                    i8 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                    i8 = 0;
                    i7 = 0;
                    i6 = 0;
                    i5 = 0;
                } else {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i7 = toolbar2.getTitleMarginStart();
                    i6 = toolbar2.getTitleMarginEnd();
                    i5 = toolbar2.getTitleMarginTop();
                    i8 = toolbar2.getTitleMarginBottom();
                }
                C14047c cVar = this.f34180l;
                Rect rect = this.f34179k;
                int i13 = rect.left;
                if (z3) {
                    i9 = i6;
                } else {
                    i9 = i7;
                }
                int i14 = i13 + i9;
                int i15 = rect.top + height + i5;
                int i16 = rect.right;
                if (!z3) {
                    i7 = i6;
                }
                int i17 = i16 - i7;
                int i18 = (rect.bottom + height) - i8;
                Rect rect2 = cVar.f35025i;
                if (rect2.left == i14 && rect2.top == i15 && rect2.right == i17 && rect2.bottom == i18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    rect2.set(i14, i15, i17, i18);
                    cVar.f35001S = true;
                    cVar.mo41864i();
                }
                C14047c cVar2 = this.f34180l;
                if (z3) {
                    i11 = this.f34177i;
                } else {
                    i11 = this.f34175g;
                }
                int i19 = this.f34179k.top + this.f34176h;
                int i21 = i3 - i;
                if (z3) {
                    i12 = this.f34175g;
                } else {
                    i12 = this.f34177i;
                }
                int i22 = i21 - i12;
                int i23 = (i4 - i2) - this.f34178j;
                Rect rect3 = cVar2.f35023h;
                if (rect3.left == i11 && rect3.top == i19 && rect3.right == i22 && rect3.bottom == i23) {
                    z6 = true;
                }
                if (!z6) {
                    rect3.set(i11, i19, i22, i23);
                    cVar2.f35001S = true;
                    cVar2.mo41864i();
                }
                this.f34180l.mo41865j(z5);
            }
        }
    }

    /* renamed from: f */
    public final void mo40891f() {
        CharSequence charSequence;
        if (this.f34172d != null && this.f34182n && TextUtils.isEmpty(this.f34180l.f34989G)) {
            ViewGroup viewGroup = this.f34172d;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public int getCollapsedTitleGravity() {
        return this.f34180l.f35031l;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f34180l.f35049x;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f34184p;
    }

    public int getExpandedTitleGravity() {
        return this.f34180l.f35029k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f34178j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f34177i;
    }

    public int getExpandedTitleMarginStart() {
        return this.f34175g;
    }

    public int getExpandedTitleMarginTop() {
        return this.f34176h;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f34180l.f34983A;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f34180l.f35042q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f34180l.f35026i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f34180l.f35026i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f34180l.f35026i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f34180l.f35036n0;
    }

    public int getScrimAlpha() {
        return this.f34186r;
    }

    public long getScrimAnimationDuration() {
        return this.f34189u;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f34190v;
        if (i2 >= 0) {
            return i2 + this.f34166A + this.f34168C;
        }
        C6396v0 v0Var = this.f34194z;
        if (v0Var != null) {
            i = v0Var.mo22506e();
        } else {
            i = 0;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int d = C6333d0.C6337d.m15044d(this);
        if (d > 0) {
            return Math.min((d * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f34185q;
    }

    public CharSequence getTitle() {
        if (this.f34182n) {
            return this.f34180l.f34989G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f34193y;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f34180l.f35004V;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z = true;
            if (this.f34193y != 1) {
                z = false;
            }
            if (z) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            setFitsSystemWindows(C6333d0.C6337d.m15042b(appBarLayout));
            if (this.f34191w == null) {
                this.f34191w = new C13884b();
            }
            appBarLayout.mo40824a(this.f34191w);
            C6333d0.C6341h.m15083c(this);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f34180l.mo41863h(configuration);
    }

    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        C13884b bVar = this.f34191w;
        if (!(bVar == null || !(parent instanceof AppBarLayout) || (arrayList = ((AppBarLayout) parent).f34135i) == null)) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C6396v0 v0Var = this.f34194z;
        if (v0Var != null) {
            int e = v0Var.mo22506e();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!C6333d0.C6337d.m15042b(childAt) && childAt.getTop() < e) {
                    C6333d0.m15023k(e, childAt);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            C13894i b = m34621b(getChildAt(i6));
            b.f34236b = b.f34235a.getTop();
            b.f34237c = b.f34235a.getLeft();
        }
        mo40890e(i, i2, i3, i4, false);
        mo40891f();
        mo40886d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m34621b(getChildAt(i7)).mo40976a();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        mo40883a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C6396v0 v0Var = this.f34194z;
        if (v0Var != null) {
            i3 = v0Var.mo22506e();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f34167B) && i3 > 0) {
            this.f34166A = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f34169D && this.f34180l.f35036n0 > 1) {
            mo40891f();
            mo40890e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            C14047c cVar = this.f34180l;
            int i6 = cVar.f35041q;
            if (i6 > 1) {
                TextPaint textPaint = cVar.f35003U;
                textPaint.setTextSize(cVar.f35033m);
                textPaint.setTypeface(cVar.f34983A);
                textPaint.setLetterSpacing(cVar.f35022g0);
                int i7 = i6 - 1;
                this.f34168C = i7 * Math.round(cVar.f35003U.descent() + (-cVar.f35003U.ascent()));
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f34168C, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f34172d;
        if (viewGroup != null) {
            View view = this.f34173e;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i4 = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(i4);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i5 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i5 = view.getMeasuredHeight();
            }
            setMinimumHeight(i5);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f34184p;
        if (drawable != null) {
            ViewGroup viewGroup = this.f34172d;
            boolean z = true;
            if (this.f34193y != 1) {
                z = false;
            }
            if (z && viewGroup != null && this.f34182n) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f34180l.mo41868m(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f34180l.mo41866k(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C14047c cVar = this.f34180l;
        if (cVar.mo41869n(typeface)) {
            cVar.mo41865j(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f34184p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f34184p = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f34172d;
                boolean z = true;
                if (this.f34193y != 1) {
                    z = false;
                }
                if (z && viewGroup != null && this.f34182n) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f34184p.setCallback(this);
                this.f34184p.setAlpha(this.f34186r);
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C4732a.getDrawable(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C14047c cVar = this.f34180l;
        if (cVar.f35029k != i) {
            cVar.f35029k = i;
            cVar.mo41865j(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f34178j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f34177i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f34175g = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f34176h = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f34180l.mo41870o(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C14047c cVar = this.f34180l;
        if (cVar.f35037o != colorStateList) {
            cVar.f35037o = colorStateList;
            cVar.mo41865j(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C14047c cVar = this.f34180l;
        if (cVar.mo41871p(typeface)) {
            cVar.mo41865j(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f34169D = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f34167B = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f34180l.f35042q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.f34180l.f35038o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.f34180l.f35040p0 = f;
    }

    public void setMaxLines(int i) {
        C14047c cVar = this.f34180l;
        if (i != cVar.f35036n0) {
            cVar.f35036n0 = i;
            Bitmap bitmap = cVar.f34993K;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.f34993K = null;
            }
            cVar.mo41865j(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f34180l.f34992J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f34186r) {
            if (!(this.f34184p == null || (viewGroup = this.f34172d) == null)) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15051k(viewGroup);
            }
            this.f34186r = i;
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f34189u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f34190v != i) {
            this.f34190v = i;
            mo40886d();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        TimeInterpolator timeInterpolator;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int i = 0;
        if (!C6333d0.C6340g.m15076c(this) || isInEditMode()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f34187s != z) {
            int i2 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                mo40883a();
                ValueAnimator valueAnimator = this.f34188t;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f34188t = valueAnimator2;
                    if (i2 > this.f34186r) {
                        timeInterpolator = C13577a.f33539c;
                    } else {
                        timeInterpolator = C13577a.f33540d;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f34188t.addUpdateListener(new C13893h(this));
                } else if (valueAnimator.isRunning()) {
                    this.f34188t.cancel();
                }
                this.f34188t.setDuration(this.f34189u);
                this.f34188t.setIntValues(new int[]{this.f34186r, i2});
                this.f34188t.start();
            } else {
                if (z) {
                    i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                }
                setScrimAlpha(i);
            }
            this.f34187s = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f34185q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f34185q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f34185q.setState(getDrawableState());
                }
                Drawable drawable4 = this.f34185q;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C5450a.m13600c(drawable4, C6333d0.C6338e.m15063d(this));
                Drawable drawable5 = this.f34185q;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f34185q.setCallback(this);
                this.f34185q.setAlpha(this.f34186r);
            }
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C4732a.getDrawable(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        C14047c cVar = this.f34180l;
        if (charSequence == null || !TextUtils.equals(cVar.f34989G, charSequence)) {
            cVar.f34989G = charSequence;
            cVar.f34990H = null;
            Bitmap bitmap = cVar.f34993K;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.f34993K = null;
            }
            cVar.mo41865j(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        boolean z;
        this.f34193y = i;
        boolean z2 = true;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f34180l.f35015d = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f34193y != 1) {
                z2 = false;
            }
            if (z2) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.f34184p == null) {
            float dimension = getResources().getDimension(C13403d.design_appbar_elevation);
            C18017a aVar = this.f34181m;
            setContentScrimColor(aVar.mo50512a(dimension, aVar.f46137d));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f34182n) {
            this.f34182n = z;
            setContentDescription(getTitle());
            mo40884c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C14047c cVar = this.f34180l;
        cVar.f35004V = timeInterpolator;
        cVar.mo41865j(false);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f34185q;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f34185q.setVisible(z, false);
        }
        Drawable drawable2 = this.f34184p;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f34184p.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f34184p || drawable == this.f34185q;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f34165E
            android.content.Context r11 = p883wc.C20289a.m47861a(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.f34170b = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f34179k = r0
            r6 = -1
            r10.f34190v = r6
            r7 = 0
            r10.f34166A = r7
            r10.f34168C = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.c r9 = new com.google.android.material.internal.c
            r9.<init>(r10)
            r10.f34180l = r9
            android.view.animation.DecelerateInterpolator r0 = p380bc.C13577a.f33541e
            r9.f35005W = r0
            r9.mo41865j(r7)
            r9.f34992J = r7
            kc.a r0 = new kc.a
            r0.<init>(r8)
            r10.f34181m = r0
            int[] r2 = p355ac.C13411l.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            int r0 = r9.f35029k
            if (r0 == r13) goto L_0x0053
            r9.f35029k = r13
            r9.mo41865j(r7)
        L_0x0053:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo41868m(r13)
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleMargin
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f34178j = r13
            r10.f34177i = r13
            r10.f34176h = r13
            r10.f34175g = r13
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x007b
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f34175g = r13
        L_0x007b:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0089
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f34177i = r13
        L_0x0089:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0097
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f34176h = r13
        L_0x0097:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00a5
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f34178j = r13
        L_0x00a5:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_titleEnabled
            boolean r13 = r12.getBoolean(r13, r11)
            r10.f34182n = r13
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_title
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = p355ac.C13410k.TextAppearance_Design_CollapsingToolbar_Expanded
            r9.mo41870o(r13)
            int r13 = p114i.C5223i.TextAppearance_AppCompat_Widget_ActionBar_Title
            r9.mo41866k(r13)
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00cf
            int r13 = r12.getResourceId(r13, r7)
            r9.mo41870o(r13)
        L_0x00cf:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00de
            int r13 = r12.getResourceId(r13, r7)
            r9.mo41866k(r13)
        L_0x00de:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00f3
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r8, r12, r13)
            android.content.res.ColorStateList r0 = r9.f35037o
            if (r0 == r13) goto L_0x00f3
            r9.f35037o = r13
            r9.mo41865j(r7)
        L_0x00f3:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0102
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r8, r12, r13)
            r9.mo41867l(r13)
        L_0x0102:
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.f34190v = r13
            int r13 = p355ac.C13411l.CollapsingToolbarLayout_maxLines
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0129
            int r11 = r12.getInt(r13, r11)
            int r13 = r9.f35036n0
            if (r11 == r13) goto L_0x0129
            r9.f35036n0 = r11
            android.graphics.Bitmap r11 = r9.f34993K
            if (r11 == 0) goto L_0x0126
            r11.recycle()
            r11 = 0
            r9.f34993K = r11
        L_0x0126:
            r9.mo41865j(r7)
        L_0x0129:
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x013e
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.f35004V = r11
            r9.mo41865j(r7)
        L_0x013e:
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_scrimAnimationDuration
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.f34189u = r0
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_titleCollapseMode
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_toolbarId
            int r11 = r12.getResourceId(r11, r6)
            r10.f34171c = r11
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f34167B = r11
            int r11 = p355ac.C13411l.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f34169D = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r11.<init>()
            java.util.WeakHashMap<android.view.View, s1.p0> r12 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6342i.m15104u(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m65754generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f34180l.mo41867l(colorStateList);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f34195a = 0;

        /* renamed from: b */
        public float f34196b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.CollapsingToolbarLayout_Layout);
            this.f34195a = obtainStyledAttributes.getInt(C13411l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f34196b = obtainStyledAttributes.getFloat(C13411l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
