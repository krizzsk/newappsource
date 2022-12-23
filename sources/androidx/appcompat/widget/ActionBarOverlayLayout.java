package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.C0274w;
import androidx.appcompat.view.menu.C0291f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5220f;
import p129j1.C5349b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6385q;
import p242s1.C6387r;
import p242s1.C6389s;
import p242s1.C6396v0;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0412h0, C6385q, C6387r {

    /* renamed from: C */
    public static final int[] f1040C = {C5215a.actionBarSize, 16842841};

    /* renamed from: A */
    public final C0311c f1041A;

    /* renamed from: B */
    public final C6389s f1042B;

    /* renamed from: b */
    public int f1043b;

    /* renamed from: c */
    public int f1044c = 0;

    /* renamed from: d */
    public ContentFrameLayout f1045d;

    /* renamed from: e */
    public ActionBarContainer f1046e;

    /* renamed from: f */
    public C0415i0 f1047f;

    /* renamed from: g */
    public Drawable f1048g;

    /* renamed from: h */
    public boolean f1049h;

    /* renamed from: i */
    public boolean f1050i;

    /* renamed from: j */
    public boolean f1051j;

    /* renamed from: k */
    public boolean f1052k;

    /* renamed from: l */
    public boolean f1053l;

    /* renamed from: m */
    public int f1054m;

    /* renamed from: n */
    public int f1055n;

    /* renamed from: o */
    public final Rect f1056o = new Rect();

    /* renamed from: p */
    public final Rect f1057p = new Rect();

    /* renamed from: q */
    public final Rect f1058q = new Rect();

    /* renamed from: r */
    public C6396v0 f1059r;

    /* renamed from: s */
    public C6396v0 f1060s;

    /* renamed from: t */
    public C6396v0 f1061t;

    /* renamed from: u */
    public C6396v0 f1062u;

    /* renamed from: v */
    public C0312d f1063v;

    /* renamed from: w */
    public OverScroller f1064w;

    /* renamed from: x */
    public ViewPropertyAnimator f1065x;

    /* renamed from: y */
    public final C0309a f1066y;

    /* renamed from: z */
    public final C0310b f1067z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0309a extends AnimatorListenerAdapter {
        public C0309a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1065x = null;
            actionBarOverlayLayout.f1053l = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1065x = null;
            actionBarOverlayLayout.f1053l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0310b implements Runnable {
        public C0310b() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.mo1301q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1065x = actionBarOverlayLayout.f1046e.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.f1066y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0311c implements Runnable {
        public C0311c() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.mo1301q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1065x = actionBarOverlayLayout.f1046e.animate().translationY((float) (-ActionBarOverlayLayout.this.f1046e.getHeight())).setListener(ActionBarOverlayLayout.this.f1066y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0312d {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C6396v0 v0Var = C6396v0.f20043b;
        this.f1059r = v0Var;
        this.f1060s = v0Var;
        this.f1061t = v0Var;
        this.f1062u = v0Var;
        this.f1066y = new C0309a();
        this.f1067z = new C0310b();
        this.f1041A = new C0311c();
        mo1302r(context);
        this.f1042B = new C6389s();
    }

    /* renamed from: m */
    public static boolean m746m(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        int i;
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        int i2 = layoutParams.leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            layoutParams.leftMargin = i3;
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = layoutParams.topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            layoutParams.topMargin = i5;
            z2 = true;
        }
        int i6 = layoutParams.rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            layoutParams.rightMargin = i7;
            z2 = true;
        }
        if (!z || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z2;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    /* renamed from: a */
    public final boolean mo1263a() {
        mo1303s();
        return this.f1047f.mo2104a();
    }

    /* renamed from: b */
    public final void mo1264b(C0291f fVar, AppCompatDelegateImpl.C0225d dVar) {
        mo1303s();
        this.f1047f.mo2105b(fVar, dVar);
    }

    /* renamed from: c */
    public final boolean mo1265c() {
        mo1303s();
        return this.f1047f.mo2106c();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final boolean mo1267d() {
        mo1303s();
        return this.f1047f.mo2108d();
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1048g != null && !this.f1049h) {
            if (this.f1046e.getVisibility() == 0) {
                i = (int) (this.f1046e.getTranslationY() + ((float) this.f1046e.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f1048g.setBounds(0, i, getWidth(), this.f1048g.getIntrinsicHeight() + i);
            this.f1048g.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean mo1269e() {
        mo1303s();
        return this.f1047f.mo2109e();
    }

    /* renamed from: f */
    public final void mo1270f() {
        mo1303s();
        this.f1047f.mo2110f();
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public final boolean mo1272g() {
        mo1303s();
        return this.f1047f.mo2111g();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1046e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C6389s sVar = this.f1042B;
        return sVar.f20042b | sVar.f20041a;
    }

    public CharSequence getTitle() {
        mo1303s();
        return this.f1047f.getTitle();
    }

    /* renamed from: h */
    public final void mo1279h(int i) {
        mo1303s();
        if (i == 2) {
            this.f1047f.mo2120n();
        } else if (i == 5) {
            this.f1047f.mo2134v();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: i */
    public final void mo1280i(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public final void mo1281j(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: k */
    public final void mo1282k(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: l */
    public final void mo1283l() {
        mo1303s();
        this.f1047f.mo2122p();
    }

    /* renamed from: n */
    public final void mo1284n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1285o(view, i, i2, i3, i4, i5);
    }

    /* renamed from: o */
    public final void mo1285o(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1303s();
        C6396v0 i = C6396v0.m15249i(windowInsets, this);
        boolean m = m746m(this.f1046e, new Rect(i.mo22504c(), i.mo22506e(), i.mo22505d(), i.mo22503b()), false);
        Rect rect = this.f1056o;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15085b(this, i, rect);
        Rect rect2 = this.f1056o;
        C6396v0 l = i.f20044a.mo22519l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f1059r = l;
        boolean z = true;
        if (!this.f1060s.equals(l)) {
            this.f1060s = this.f1059r;
            m = true;
        }
        if (!this.f1057p.equals(this.f1056o)) {
            this.f1057p.set(this.f1056o);
        } else {
            z = m;
        }
        if (z) {
            requestLayout();
        }
        return i.f20044a.mo22530a().f20044a.mo22526c().f20044a.mo22525b().mo22509h();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1302r(getContext());
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6341h.m15083c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1301q();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        C6396v0.C6401e eVar;
        mo1303s();
        measureChildWithMargins(this.f1046e, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1046e.getLayoutParams();
        int max = Math.max(0, this.f1046e.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f1046e.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1046e.getMeasuredState());
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if ((C6333d0.C6337d.m15047g(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f1043b;
            if (this.f1051j && this.f1046e.getTabContainer() != null) {
                i3 += this.f1043b;
            }
        } else {
            i3 = this.f1046e.getVisibility() != 8 ? this.f1046e.getMeasuredHeight() : 0;
        }
        this.f1058q.set(this.f1056o);
        C6396v0 v0Var = this.f1059r;
        this.f1061t = v0Var;
        if (this.f1050i || z) {
            C5349b a = C5349b.m13418a(v0Var.mo22504c(), this.f1061t.mo22506e() + i3, this.f1061t.mo22505d(), this.f1061t.mo22503b() + 0);
            C6396v0 v0Var2 = this.f1061t;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                eVar = new C6396v0.C6400d(v0Var2);
            } else if (i4 >= 29) {
                eVar = new C6396v0.C6399c(v0Var2);
            } else {
                eVar = new C6396v0.C6398b(v0Var2);
            }
            eVar.mo22513d(a);
            this.f1061t = eVar.mo22511b();
        } else {
            Rect rect = this.f1058q;
            rect.top += i3;
            rect.bottom += 0;
            this.f1061t = v0Var.f20044a.mo22519l(0, i3, 0, 0);
        }
        m746m(this.f1045d, this.f1058q, true);
        if (!this.f1062u.equals(this.f1061t)) {
            C6396v0 v0Var3 = this.f1061t;
            this.f1062u = v0Var3;
            C6333d0.m15014b(this.f1045d, v0Var3);
        }
        measureChildWithMargins(this.f1045d, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1045d.getLayoutParams();
        int max3 = Math.max(max, this.f1045d.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f1045d.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1045d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f1052k || !z) {
            return false;
        }
        this.f1064w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1064w.getFinalY() > this.f1046e.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo1301q();
            this.f1041A.run();
        } else {
            mo1301q();
            this.f1067z.run();
        }
        this.f1053l = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1054m + i2;
        this.f1054m = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (androidx.appcompat.app.C0274w) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            s1.s r1 = r0.f1042B
            r1.f20041a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f1054m = r1
            r0.mo1301q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.f1063v
            if (r1 == 0) goto L_0x001d
            androidx.appcompat.app.w r1 = (androidx.appcompat.app.C0274w) r1
            n.g r2 = r1.f815t
            if (r2 == 0) goto L_0x001d
            r2.mo21645a()
            r2 = 0
            r1.f815t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1046e.getVisibility() != 0) {
            return false;
        }
        return this.f1052k;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f1052k && !this.f1053l) {
            if (this.f1054m <= this.f1046e.getHeight()) {
                mo1301q();
                postDelayed(this.f1067z, 600);
                return;
            }
            mo1301q();
            postDelayed(this.f1041A, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        mo1303s();
        int i2 = this.f1055n ^ i;
        this.f1055n = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0312d dVar = this.f1063v;
        if (dVar != null) {
            ((C0274w) dVar).f811p = !z2;
            if (z || !z2) {
                C0274w wVar = (C0274w) dVar;
                if (wVar.f812q) {
                    wVar.f812q = false;
                    wVar.mo991D(true);
                }
            } else {
                C0274w wVar2 = (C0274w) dVar;
                if (!wVar2.f812q) {
                    wVar2.f812q = true;
                    wVar2.mo991D(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f1063v != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1044c = i;
        C0312d dVar = this.f1063v;
        if (dVar != null) {
            ((C0274w) dVar).f810o = i;
        }
    }

    /* renamed from: p */
    public final boolean mo1300p(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: q */
    public final void mo1301q() {
        removeCallbacks(this.f1067z);
        removeCallbacks(this.f1041A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1065x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void mo1302r(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1040C);
        boolean z2 = false;
        this.f1043b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1048g = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1049h = z2;
        this.f1064w = new OverScroller(context);
    }

    /* renamed from: s */
    public final void mo1303s() {
        C0415i0 i0Var;
        if (this.f1045d == null) {
            this.f1045d = (ContentFrameLayout) findViewById(C5220f.action_bar_activity_content);
            this.f1046e = (ActionBarContainer) findViewById(C5220f.action_bar_container);
            View findViewById = findViewById(C5220f.action_bar);
            if (findViewById instanceof C0415i0) {
                i0Var = (C0415i0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                i0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder k = C13555b.m33972k("Can't make a decor toolbar out of ");
                k.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(k.toString());
            }
            this.f1047f = i0Var;
        }
    }

    public void setActionBarHideOffset(int i) {
        mo1301q();
        this.f1046e.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1046e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0312d dVar) {
        this.f1063v = dVar;
        if (getWindowToken() != null) {
            ((C0274w) this.f1063v).f810o = this.f1044c;
            int i = this.f1055n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6341h.m15083c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1051j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1052k) {
            this.f1052k = z;
            if (!z) {
                mo1301q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1303s();
        this.f1047f.setIcon(i);
    }

    public void setLogo(int i) {
        mo1303s();
        this.f1047f.mo2125s(i);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1050i = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f1049h = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1303s();
        this.f1047f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1303s();
        this.f1047f.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo1303s();
        this.f1047f.setIcon(drawable);
    }
}
