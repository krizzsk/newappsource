package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p020b1.C1441a;
import p020b1.C1442b;
import p020b1.C1443c;
import p033c1.C1757a;
import p033c1.C1758b;
import p090g1.C4732a;
import p141k1.C5450a;
import p229r1.C6232b;
import p229r1.C6236f;
import p241s0.C6313h;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6385q;
import p242s1.C6387r;
import p242s1.C6389s;
import p242s1.C6391t;
import p242s1.C6396v0;

public class CoordinatorLayout extends ViewGroup implements C6385q, C6387r {

    /* renamed from: v */
    public static final String f3241v;

    /* renamed from: w */
    public static final Class<?>[] f3242w = {Context.class, AttributeSet.class};

    /* renamed from: x */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f3243x = new ThreadLocal<>();

    /* renamed from: y */
    public static final C0754g f3244y = new C0754g();

    /* renamed from: z */
    public static final C6236f f3245z = new C6236f(12);

    /* renamed from: b */
    public final ArrayList f3246b;

    /* renamed from: c */
    public final C1757a f3247c;

    /* renamed from: d */
    public final ArrayList f3248d;

    /* renamed from: e */
    public final ArrayList f3249e;

    /* renamed from: f */
    public Paint f3250f;

    /* renamed from: g */
    public final int[] f3251g;

    /* renamed from: h */
    public final int[] f3252h;

    /* renamed from: i */
    public boolean f3253i;

    /* renamed from: j */
    public boolean f3254j;

    /* renamed from: k */
    public int[] f3255k;

    /* renamed from: l */
    public View f3256l;

    /* renamed from: m */
    public View f3257m;

    /* renamed from: n */
    public C0753f f3258n;

    /* renamed from: o */
    public boolean f3259o;

    /* renamed from: p */
    public C6396v0 f3260p;

    /* renamed from: q */
    public boolean f3261q;

    /* renamed from: r */
    public Drawable f3262r;

    /* renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f3263s;

    /* renamed from: t */
    public C0748a f3264t;

    /* renamed from: u */
    public final C6389s f3265u;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((C0752e) view.getLayoutParams()).f3286r;
        }

        public static void setTag(View view, Object obj) {
            ((C0752e) view.getLayoutParams()).f3286r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > BitmapDescriptorFactory.HUE_RED;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C6396v0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C6396v0 v0Var) {
            return v0Var;
        }

        public void onAttachedToLayoutParams(C0752e eVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0748a implements C6391t {
        public C0748a() {
        }

        public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
            boolean z;
            Behavior behavior;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!C6232b.m14816a(coordinatorLayout.f3260p, v0Var)) {
                coordinatorLayout.f3260p = v0Var;
                boolean z2 = true;
                if (v0Var.mo22506e() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                coordinatorLayout.f3261q = z;
                if (z || coordinatorLayout.getBackground() != null) {
                    z2 = false;
                }
                coordinatorLayout.setWillNotDraw(z2);
                if (!v0Var.f20044a.mo22528m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                        if (C6333d0.C6337d.m15042b(childAt) && (behavior = ((C0752e) childAt.getLayoutParams()).f3269a) != null) {
                            v0Var = behavior.onApplyWindowInsets(coordinatorLayout, childAt, v0Var);
                            if (v0Var.f20044a.mo22528m()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return v0Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0749b {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface C0750c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public class C0751d implements ViewGroup.OnHierarchyChangeListener {
        public C0751d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3263s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo3307v(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3263s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public class C0753f implements ViewTreeObserver.OnPreDrawListener {
        public C0753f() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.mo3307v(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public static class C0754g implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            float m = C6333d0.C6342i.m15096m((View) obj);
            float m2 = C6333d0.C6342i.m15096m((View) obj2);
            if (m > m2) {
                return -1;
            }
            if (m < m2) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f3241v = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            f3244y = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f3242w = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f3243x = r0
            r1.f r0 = new r1.f
            r1 = 12
            r0.<init>(r1)
            f3245z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1441a.coordinatorLayoutStyle);
    }

    /* renamed from: A */
    public static void m2273A(Rect rect) {
        rect.setEmpty();
        f3245z.mo22236a(rect);
    }

    /* renamed from: C */
    public static void m2274C(int i, View view) {
        C0752e eVar = (C0752e) view.getLayoutParams();
        int i2 = eVar.f3277i;
        if (i2 != i) {
            C6333d0.m15022j(i - i2, view);
            eVar.f3277i = i;
        }
    }

    /* renamed from: D */
    public static void m2275D(int i, View view) {
        C0752e eVar = (C0752e) view.getLayoutParams();
        int i2 = eVar.f3278j;
        if (i2 != i) {
            C6333d0.m15023k(i - i2, view);
            eVar.f3278j = i;
        }
    }

    /* renamed from: e */
    public static Rect m2276e() {
        Rect rect = (Rect) f3245z.mo22237b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: s */
    public static void m2277s(int i, Rect rect, Rect rect2, C0752e eVar, int i2, int i3) {
        int i4;
        int i5;
        int i6 = eVar.f3271c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = eVar.f3272d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        if (i11 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i11 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i12 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i12 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i8 == 1) {
            i4 -= i2 / 2;
        } else if (i8 != 5) {
            i4 -= i2;
        }
        if (i9 == 16) {
            i5 -= i3 / 2;
        } else if (i9 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: t */
    public static C0752e m2278t(View view) {
        C0752e eVar = (C0752e) view.getLayoutParams();
        if (!eVar.f3270b) {
            if (view instanceof C0749b) {
                eVar.mo3351b(((C0749b) view).getBehavior());
                eVar.f3270b = true;
            } else {
                C0750c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0750c) cls.getAnnotation(C0750c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo3351b((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        cVar.value().getClass();
                    }
                }
                eVar.f3270b = true;
            }
        }
        return eVar;
    }

    /* renamed from: B */
    public final void mo3262B(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C0752e) childAt.getLayoutParams()).f3269a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0752e) getChildAt(i2).getLayoutParams()).f3281m = false;
        }
        this.f3256l = null;
        this.f3253i = false;
    }

    /* renamed from: E */
    public final void mo3263E() {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15042b(this)) {
            if (this.f3264t == null) {
                this.f3264t = new C0748a();
            }
            C6333d0.C6342i.m15104u(this, this.f3264t);
            setSystemUiVisibility(1280);
            return;
        }
        C6333d0.C6342i.m15104u(this, (C6391t) null);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0752e) && super.checkLayoutParams(layoutParams);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0752e eVar = (C0752e) view.getLayoutParams();
        Behavior behavior = eVar.f3269a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > BitmapDescriptorFactory.HUE_RED) {
                if (this.f3250f == null) {
                    this.f3250f = new Paint();
                }
                this.f3250f.setColor(eVar.f3269a.getScrimColor(this, view));
                Paint paint = this.f3250f;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3250f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3262r;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public final void mo3267f(C0752e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: g */
    public final void mo3268g(View view) {
        List list = (List) ((C6313h) this.f3247c.f6159c).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                Behavior behavior = ((C0752e) view2.getLayoutParams()).f3269a;
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0752e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0752e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        mo3312z();
        return Collections.unmodifiableList(this.f3246b);
    }

    public final C6396v0 getLastWindowInsets() {
        return this.f3260p;
    }

    public int getNestedScrollAxes() {
        C6389s sVar = this.f3265u;
        return sVar.f20042b | sVar.f20041a;
    }

    public Drawable getStatusBarBackground() {
        return this.f3262r;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final boolean mo3278h(View view, View view2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect e = m2276e();
        if (view.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        mo3279l(view, z, e);
        Rect e2 = m2276e();
        if (view2.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo3279l(view2, z2, e2);
        try {
            if (e.left <= e2.right && e.top <= e2.bottom && e.right >= e2.left && e.bottom >= e2.top) {
                z3 = true;
            }
            return z3;
        } finally {
            m2273A(e);
            m2273A(e2);
        }
    }

    /* renamed from: i */
    public final void mo1280i(int i, View view) {
        C6389s sVar = this.f3265u;
        if (i == 1) {
            sVar.f20042b = 0;
        } else {
            sVar.f20041a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0752e eVar = (C0752e) childAt.getLayoutParams();
            if (eVar.mo3350a(i)) {
                Behavior behavior = eVar.f3269a;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    eVar.f3282n = false;
                } else if (i == 1) {
                    eVar.f3283o = false;
                }
                eVar.f3284p = false;
            }
        }
        this.f3257m = null;
    }

    /* renamed from: j */
    public final void mo1281j(View view, View view2, int i, int i2) {
        Behavior behavior;
        C6389s sVar = this.f3265u;
        if (i2 == 1) {
            sVar.f20042b = i;
        } else {
            sVar.f20041a = i;
        }
        this.f3257m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0752e eVar = (C0752e) childAt.getLayoutParams();
            if (eVar.mo3350a(i2) && (behavior = eVar.f3269a) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: k */
    public final void mo1282k(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0752e eVar = (C0752e) childAt.getLayoutParams();
                if (eVar.mo3350a(i3) && (behavior = eVar.f3269a) != null) {
                    int[] iArr2 = this.f3251g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3251g;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f3251g;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo3307v(1);
        }
    }

    /* renamed from: l */
    public final void mo3279l(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo3297r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: n */
    public final void mo1284n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0752e eVar = (C0752e) childAt.getLayoutParams();
                if (eVar.mo3350a(i5) && (behavior = eVar.f3269a) != null) {
                    int[] iArr2 = this.f3251g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3251g;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f3251g[1]);
                    } else {
                        i7 = Math.min(i9, this.f3251g[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo3307v(1);
        }
    }

    /* renamed from: o */
    public final void mo1285o(View view, int i, int i2, int i3, int i4, int i5) {
        mo1284n(view, i, i2, i3, i4, 0, this.f3252h);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3262B(false);
        if (this.f3259o) {
            if (this.f3258n == null) {
                this.f3258n = new C0753f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3258n);
        }
        if (this.f3260p == null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15042b(this)) {
                C6333d0.C6341h.m15083c(this);
            }
        }
        this.f3254j = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3262B(false);
        if (this.f3259o && this.f3258n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3258n);
        }
        View view = this.f3257m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3254j = false;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f3261q && this.f3262r != null) {
            C6396v0 v0Var = this.f3260p;
            if (v0Var != null) {
                i = v0Var.mo22506e();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f3262r.setBounds(0, 0, getWidth(), i);
                this.f3262r.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo3262B(true);
        }
        boolean y = mo3311y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo3262B(true);
        }
        return y;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int d = C6333d0.C6338e.m15063d(this);
        int size = this.f3246b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f3246b.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((C0752e) view.getLayoutParams()).f3269a) == null || !behavior.onLayoutChild(this, view, d))) {
                mo3309w(d, view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0198, code lost:
        if (r0.onMeasureChild(r30, r20, r8, r21, r23, 0) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo3312z()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r7.getChildAt(r1)
            c1.a r4 = r7.f3247c
            java.lang.Object r5 = r4.f6159c
            s0.h r5 = (p241s0.C6313h) r5
            int r5 = r5.f19969d
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x0034
            java.lang.Object r9 = r4.f6159c
            s0.h r9 = (p241s0.C6313h) r9
            java.lang.Object r9 = r9.mo22422l(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = 1
            goto L_0x0035
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r7.f3259o
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.f3254j
            if (r0 == 0) goto L_0x005b
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r7.f3258n
            if (r0 != 0) goto L_0x0052
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>()
            r7.f3258n = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r7.f3258n
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r7.f3259o = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r7.f3254j
            if (r0 == 0) goto L_0x006f
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r7.f3258n
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r7.f3258n
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r7.f3259o = r8
        L_0x0071:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            int r11 = p242s1.C6333d0.C6338e.m15063d(r30)
            if (r11 != r2) goto L_0x008b
            r12 = 1
            goto L_0x008c
        L_0x008b:
            r12 = 0
        L_0x008c:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            s1.v0 r3 = r7.f3260p
            if (r3 == 0) goto L_0x00b5
            boolean r3 = p242s1.C6333d0.C6337d.m15042b(r30)
            if (r3 == 0) goto L_0x00b5
            r19 = 1
            goto L_0x00b7
        L_0x00b5:
            r19 = 0
        L_0x00b7:
            java.util.ArrayList r2 = r7.f3246b
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x00c1:
            if (r3 >= r6) goto L_0x01ee
            java.util.ArrayList r0 = r7.f3246b
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00dd
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01e5
        L_0x00dd:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r1
            int r0 = r1.f3273e
            if (r0 < 0) goto L_0x013b
            if (r13 == 0) goto L_0x013b
            int[] r8 = r7.f3255k
            if (r8 != 0) goto L_0x00f5
            r30.toString()
            r22 = r2
        L_0x00f3:
            r0 = 0
            goto L_0x0104
        L_0x00f5:
            r22 = r2
            if (r0 < 0) goto L_0x0100
            int r2 = r8.length
            if (r0 < r2) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r0 = r8[r0]
            goto L_0x0104
        L_0x0100:
            r30.toString()
            goto L_0x00f3
        L_0x0104:
            int r2 = r1.f3271c
            if (r2 != 0) goto L_0x010b
            r2 = 8388661(0x800035, float:1.1755018E-38)
        L_0x010b:
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r11)
            r2 = r2 & 7
            r8 = 3
            if (r2 != r8) goto L_0x0116
            if (r12 == 0) goto L_0x011b
        L_0x0116:
            r8 = 5
            if (r2 != r8) goto L_0x0127
            if (r12 == 0) goto L_0x0127
        L_0x011b:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x013f
        L_0x0127:
            if (r2 != r8) goto L_0x012b
            if (r12 == 0) goto L_0x0130
        L_0x012b:
            r8 = 3
            if (r2 != r8) goto L_0x0139
            if (r12 == 0) goto L_0x0139
        L_0x0130:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x013f
        L_0x0139:
            r8 = 0
            goto L_0x013d
        L_0x013b:
            r22 = r2
        L_0x013d:
            r21 = 0
        L_0x013f:
            if (r19 == 0) goto L_0x0171
            boolean r0 = p242s1.C6333d0.C6337d.m15042b(r20)
            if (r0 != 0) goto L_0x0171
            s1.v0 r0 = r7.f3260p
            int r0 = r0.mo22504c()
            s1.v0 r2 = r7.f3260p
            int r2 = r2.mo22505d()
            int r2 = r2 + r0
            s1.v0 r0 = r7.f3260p
            int r0 = r0.mo22506e()
            s1.v0 r8 = r7.f3260p
            int r8 = r8.mo22503b()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0175
        L_0x0171:
            r8 = r31
            r23 = r32
        L_0x0175:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.f3269a
            if (r0 == 0) goto L_0x019b
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x01b5
            goto L_0x01a8
        L_0x019b:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x01a8:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01b5:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01e5:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00c1
        L_0x01ee:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0752e eVar = (C0752e) childAt.getLayoutParams();
                if (eVar.mo3350a(0) && (behavior = eVar.f3269a) != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo3307v(1);
        }
        return z2;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0752e eVar = (C0752e) childAt.getLayoutParams();
                if (eVar.mo3350a(0) && (behavior = eVar.f3269a) != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1282k(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1285o(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1281j(view, view2, i, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f3266b;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = m2278t(childAt).f3269a;
            if (!(id == -1 || behavior == null || (parcelable2 = sparseArray.get(id)) == null)) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C0752e) childAt.getLayoutParams()).f3269a;
            if (!(id == -1 || behavior == null || (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) == null)) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.f3266b = sparseArray;
        return savedState;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1300p(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo1280i(0, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3256l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo3311y(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f3256l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f3269a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f3256l
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.f3256l
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.mo3262B(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean mo1300p(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0752e eVar = (C0752e) childAt.getLayoutParams();
                Behavior behavior = eVar.f3269a;
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    if (i3 == 0) {
                        eVar.f3282n = onStartNestedScroll;
                    } else if (i3 == 1) {
                        eVar.f3283o = onStartNestedScroll;
                    }
                } else if (i3 == 0) {
                    eVar.f3282n = false;
                } else if (i3 == 1) {
                    eVar.f3283o = false;
                }
            }
        }
        return z;
    }

    /* renamed from: q */
    public final ArrayList mo3296q(View view) {
        C1757a aVar = this.f3247c;
        int i = ((C6313h) aVar.f6159c).f19969d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((C6313h) aVar.f6159c).mo22422l(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((C6313h) aVar.f6159c).mo22416h(i2));
            }
        }
        this.f3249e.clear();
        if (arrayList != null) {
            this.f3249e.addAll(arrayList);
        }
        return this.f3249e;
    }

    /* renamed from: r */
    public final void mo3297r(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C1758b.f6162a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C1758b.f6162a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C1758b.m5008a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C1758b.f6163b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C0752e) view.getLayoutParams()).f3269a;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3253i) {
            mo3262B(false);
            this.f3253i = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo3263E();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3263s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f3262r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3262r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3262r.setState(getDrawableState());
                }
                Drawable drawable4 = this.f3262r;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C5450a.m13600c(drawable4, C6333d0.C6338e.m15063d(this));
                Drawable drawable5 = this.f3262r;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f3262r.setCallback(this);
            }
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C4732a.getDrawable(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f3262r;
        if (drawable != null && drawable.isVisible() != z) {
            this.f3262r.setVisible(z, false);
        }
    }

    /* renamed from: u */
    public final boolean mo3306u(View view, int i, int i2) {
        Rect e = m2276e();
        mo3297r(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            e.setEmpty();
            f3245z.mo22236a(e);
        }
    }

    /* renamed from: v */
    public final void mo3307v(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i11;
        Rect rect2;
        int i12;
        int i13;
        boolean z4;
        Behavior behavior;
        int i14 = i;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int d = C6333d0.C6338e.m15063d(this);
        int size = this.f3246b.size();
        Rect e = m2276e();
        Rect e2 = m2276e();
        Rect e3 = m2276e();
        int i15 = i14;
        int i16 = 0;
        while (i16 < size) {
            View view = (View) this.f3246b.get(i16);
            C0752e eVar = (C0752e) view.getLayoutParams();
            if (i15 == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = e3;
                i2 = i16;
            } else {
                int i17 = 0;
                while (i17 < i16) {
                    if (eVar.f3280l == ((View) this.f3246b.get(i17))) {
                        C0752e eVar2 = (C0752e) view.getLayoutParams();
                        if (eVar2.f3279k != null) {
                            Rect e4 = m2276e();
                            Rect e5 = m2276e();
                            Rect e6 = m2276e();
                            mo3297r(eVar2.f3279k, e4);
                            mo3279l(view, false, e5);
                            int measuredWidth = view.getMeasuredWidth();
                            i13 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i18 = measuredWidth;
                            Rect rect3 = e6;
                            i12 = i16;
                            Rect rect4 = e5;
                            Rect rect5 = e4;
                            rect2 = e3;
                            C0752e eVar3 = eVar2;
                            i11 = i17;
                            m2277s(d, e4, rect3, eVar2, i18, measuredHeight);
                            Rect rect6 = rect3;
                            if (rect6.left == rect4.left && rect6.top == rect4.top) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            mo3267f(eVar3, rect6, i18, measuredHeight);
                            int i19 = rect6.left - rect4.left;
                            int i21 = rect6.top - rect4.top;
                            if (i19 != 0) {
                                C6333d0.m15022j(i19, view);
                            }
                            if (i21 != 0) {
                                C6333d0.m15023k(i21, view);
                            }
                            if (z4 && (behavior = eVar3.f3269a) != null) {
                                behavior.onDependentViewChanged(this, view, eVar3.f3279k);
                            }
                            rect5.setEmpty();
                            C6236f fVar = f3245z;
                            fVar.mo22236a(rect5);
                            rect4.setEmpty();
                            fVar.mo22236a(rect4);
                            rect6.setEmpty();
                            fVar.mo22236a(rect6);
                            i17 = i11 + 1;
                            size = i13;
                            i16 = i12;
                            e3 = rect2;
                        }
                    }
                    i11 = i17;
                    i13 = size;
                    rect2 = e3;
                    i12 = i16;
                    i17 = i11 + 1;
                    size = i13;
                    i16 = i12;
                    e3 = rect2;
                }
                int i22 = size;
                Rect rect7 = e3;
                i2 = i16;
                mo3279l(view, true, e2);
                if (eVar.f3275g != 0 && !e2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f3275g, d);
                    int i23 = absoluteGravity & 112;
                    if (i23 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i23 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i24 = absoluteGravity & 7;
                    if (i24 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i24 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (eVar.f3276h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    if (C6333d0.C6340g.m15076c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0752e eVar4 = (C0752e) view.getLayoutParams();
                        Behavior behavior2 = eVar4.f3269a;
                        Rect e7 = m2276e();
                        Rect e8 = m2276e();
                        e8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.getInsetDodgeRect(this, view, e7)) {
                            e7.set(e8);
                        } else if (!e8.contains(e7)) {
                            StringBuilder k = C13555b.m33972k("Rect should be within the child's bounds. Rect:");
                            k.append(e7.toShortString());
                            k.append(" | Bounds:");
                            k.append(e8.toShortString());
                            throw new IllegalArgumentException(k.toString());
                        }
                        e8.setEmpty();
                        C6236f fVar2 = f3245z;
                        fVar2.mo22236a(e8);
                        if (e7.isEmpty()) {
                            e7.setEmpty();
                            fVar2.mo22236a(e7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar4.f3276h, d);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (e7.top - eVar4.topMargin) - eVar4.f3278j) >= (i9 = e.top)) {
                                z2 = false;
                            } else {
                                m2275D(i9 - i8, view);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - e7.bottom) - eVar4.bottomMargin) + eVar4.f3278j) < (i7 = e.bottom)) {
                                m2275D(height - i7, view);
                                z2 = true;
                            }
                            if (!z2) {
                                m2275D(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (e7.left - eVar4.leftMargin) - eVar4.f3277i) >= (i6 = e.left)) {
                                z3 = false;
                            } else {
                                m2274C(i6 - i5, view);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - e7.right) - eVar4.rightMargin) + eVar4.f3277i) < (i4 = e.right)) {
                                m2274C(width - i4, view);
                                z3 = true;
                            }
                            if (!z3) {
                                m2274C(0, view);
                            }
                            e7.setEmpty();
                            fVar2.mo22236a(e7);
                        }
                    }
                }
                if (i14 != 2) {
                    rect = rect7;
                    rect.set(((C0752e) view.getLayoutParams()).f3285q);
                    if (rect.equals(e2)) {
                        i3 = i22;
                        i15 = i14;
                    } else {
                        ((C0752e) view.getLayoutParams()).f3285q.set(e2);
                    }
                } else {
                    rect = rect7;
                }
                i3 = i22;
                for (int i25 = i2 + 1; i25 < i3; i25++) {
                    View view2 = (View) this.f3246b.get(i25);
                    C0752e eVar5 = (C0752e) view2.getLayoutParams();
                    Behavior behavior3 = eVar5.f3269a;
                    if (behavior3 != null && behavior3.layoutDependsOn(this, view2, view)) {
                        if (i14 != 0 || !eVar5.f3284p) {
                            if (i14 != 2) {
                                z = behavior3.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior3.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i14 == 1) {
                                eVar5.f3284p = z;
                            }
                        } else {
                            eVar5.f3284p = false;
                        }
                    }
                }
                i15 = i14;
            }
            i16 = i2 + 1;
            size = i3;
            e3 = rect;
        }
        Rect rect8 = e3;
        e.setEmpty();
        C6236f fVar3 = f3245z;
        fVar3.mo22236a(e);
        e2.setEmpty();
        fVar3.mo22236a(e2);
        rect8.setEmpty();
        fVar3.mo22236a(rect8);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3262r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3309w(int r12, android.view.View r13) {
        /*
            r11 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r0
            android.view.View r1 = r0.f3279k
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0013
            int r4 = r0.f3274f
            r5 = -1
            if (r4 == r5) goto L_0x0013
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x01ab
            if (r1 == 0) goto L_0x0068
            android.graphics.Rect r0 = m2276e()
            android.graphics.Rect r2 = m2276e()
            r11.mo3297r(r1, r0)     // Catch:{ all -> 0x0058 }
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()     // Catch:{ all -> 0x0058 }
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r1     // Catch:{ all -> 0x0058 }
            int r3 = r13.getMeasuredWidth()     // Catch:{ all -> 0x0058 }
            int r4 = r13.getMeasuredHeight()     // Catch:{ all -> 0x0058 }
            r5 = r12
            r6 = r0
            r7 = r2
            r8 = r1
            r9 = r3
            r10 = r4
            m2277s(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0058 }
            r11.mo3267f(r1, r2, r3, r4)     // Catch:{ all -> 0x0058 }
            int r12 = r2.left     // Catch:{ all -> 0x0058 }
            int r1 = r2.top     // Catch:{ all -> 0x0058 }
            int r3 = r2.right     // Catch:{ all -> 0x0058 }
            int r4 = r2.bottom     // Catch:{ all -> 0x0058 }
            r13.layout(r12, r1, r3, r4)     // Catch:{ all -> 0x0058 }
            r0.setEmpty()
            r1.f r12 = f3245z
            r12.mo22236a(r0)
            r2.setEmpty()
            r12.mo22236a(r2)
            goto L_0x01aa
        L_0x0058:
            r12 = move-exception
            r0.setEmpty()
            r1.f r13 = f3245z
            r13.mo22236a(r0)
            r2.setEmpty()
            r13.mo22236a(r2)
            throw r12
        L_0x0068:
            int r0 = r0.f3273e
            if (r0 < 0) goto L_0x00fd
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r1
            int r4 = r1.f3271c
            if (r4 != 0) goto L_0x0079
            r4 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0079:
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r12)
            r5 = r4 & 7
            r4 = r4 & 112(0x70, float:1.57E-43)
            int r6 = r11.getWidth()
            int r7 = r11.getHeight()
            int r8 = r13.getMeasuredWidth()
            int r9 = r13.getMeasuredHeight()
            if (r12 != r2) goto L_0x0095
            int r0 = r6 - r0
        L_0x0095:
            int[] r12 = r11.f3255k
            if (r12 != 0) goto L_0x009e
            r11.toString()
        L_0x009c:
            r12 = 0
            goto L_0x00ab
        L_0x009e:
            if (r0 < 0) goto L_0x00a7
            int r10 = r12.length
            if (r0 < r10) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            r12 = r12[r0]
            goto L_0x00ab
        L_0x00a7:
            r11.toString()
            goto L_0x009c
        L_0x00ab:
            int r12 = r12 - r8
            if (r5 == r2) goto L_0x00b4
            r0 = 5
            if (r5 == r0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            int r12 = r12 + r8
            goto L_0x00b7
        L_0x00b4:
            int r0 = r8 / 2
            int r12 = r12 + r0
        L_0x00b7:
            r0 = 16
            if (r4 == r0) goto L_0x00c3
            r0 = 80
            if (r4 == r0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r3 = r9 + 0
            goto L_0x00c6
        L_0x00c3:
            int r0 = r9 / 2
            int r3 = r3 + r0
        L_0x00c6:
            int r0 = r11.getPaddingLeft()
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r11.getPaddingRight()
            int r6 = r6 - r2
            int r6 = r6 - r8
            int r2 = r1.rightMargin
            int r6 = r6 - r2
            int r12 = java.lang.Math.min(r12, r6)
            int r12 = java.lang.Math.max(r0, r12)
            int r0 = r11.getPaddingTop()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r2 = r11.getPaddingBottom()
            int r7 = r7 - r2
            int r7 = r7 - r9
            int r1 = r1.bottomMargin
            int r7 = r7 - r1
            int r1 = java.lang.Math.min(r3, r7)
            int r0 = java.lang.Math.max(r0, r1)
            int r8 = r8 + r12
            int r9 = r9 + r0
            r13.layout(r12, r0, r8, r9)
            goto L_0x01aa
        L_0x00fd:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r0
            android.graphics.Rect r7 = m2276e()
            int r1 = r11.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r11.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r11.getWidth()
            int r4 = r11.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r11.getHeight()
            int r5 = r11.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            s1.v0 r1 = r11.f3260p
            if (r1 == 0) goto L_0x016e
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            boolean r1 = p242s1.C6333d0.C6337d.m15042b(r11)
            if (r1 == 0) goto L_0x016e
            boolean r1 = p242s1.C6333d0.C6337d.m15042b(r13)
            if (r1 != 0) goto L_0x016e
            int r1 = r7.left
            s1.v0 r2 = r11.f3260p
            int r2 = r2.mo22504c()
            int r2 = r2 + r1
            r7.left = r2
            int r1 = r7.top
            s1.v0 r2 = r11.f3260p
            int r2 = r2.mo22506e()
            int r2 = r2 + r1
            r7.top = r2
            int r1 = r7.right
            s1.v0 r2 = r11.f3260p
            int r2 = r2.mo22505d()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            s1.v0 r2 = r11.f3260p
            int r2 = r2.mo22503b()
            int r1 = r1 - r2
            r7.bottom = r1
        L_0x016e:
            android.graphics.Rect r8 = m2276e()
            int r0 = r0.f3271c
            r1 = r0 & 7
            if (r1 != 0) goto L_0x017c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0 = r0 | r1
        L_0x017c:
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0182
            r0 = r0 | 48
        L_0x0182:
            r1 = r0
            int r2 = r13.getMeasuredWidth()
            int r3 = r13.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r12
            p242s1.C6357f.m15160b(r1, r2, r3, r4, r5, r6)
            int r12 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r13.layout(r12, r0, r1, r2)
            r7.setEmpty()
            r1.f r12 = f3245z
            r12.mo22236a(r7)
            r8.setEmpty()
            r12.mo22236a(r8)
        L_0x01aa:
            return
        L_0x01ab:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo3309w(int, android.view.View):void");
    }

    /* renamed from: x */
    public final void mo3310x(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: y */
    public final boolean mo3311y(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f3248d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i4);
            } else {
                i2 = i4;
            }
            arrayList.add(getChildAt(i2));
        }
        C0754g gVar = f3244y;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            C0752e eVar = (C0752e) view.getLayoutParams();
            Behavior behavior = eVar.f3269a;
            boolean z5 = true;
            if ((!z3 && !z4) || actionMasked == 0) {
                if (!z3 && behavior != null) {
                    if (i3 == 0) {
                        z3 = behavior.onInterceptTouchEvent(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z3 = behavior.onTouchEvent(this, view, motionEvent2);
                    }
                    if (z3) {
                        this.f3256l = view;
                    }
                }
                Behavior behavior2 = eVar.f3269a;
                if (behavior2 == null) {
                    eVar.f3281m = false;
                }
                boolean z6 = eVar.f3281m;
                if (z6) {
                    z = true;
                } else {
                    if (behavior2 != null) {
                        z2 = behavior2.blocksInteractionBelow(this, view);
                    } else {
                        z2 = false;
                    }
                    z = z2 | z6;
                    eVar.f3281m = z;
                }
                if (!z || z6) {
                    z5 = false;
                }
                if (z && !z5) {
                    break;
                }
                z4 = z5;
            } else if (behavior != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                }
                if (i3 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEvent3);
                } else if (i3 == 1) {
                    behavior.onTouchEvent(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r5 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x018b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0126  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3312z() {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.f3246b
            r0.clear()
            c1.a r0 = r11.f3247c
            java.lang.Object r1 = r0.f6159c
            s0.h r1 = (p241s0.C6313h) r1
            int r1 = r1.f19969d
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x002a
            java.lang.Object r4 = r0.f6159c
            s0.h r4 = (p241s0.C6313h) r4
            java.lang.Object r4 = r4.mo22422l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0027
            r4.clear()
            java.lang.Object r5 = r0.f6158b
            r1.d r5 = (p229r1.C6234d) r5
            r5.mo22236a(r4)
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x002a:
            java.lang.Object r0 = r0.f6159c
            s0.h r0 = (p241s0.C6313h) r0
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L_0x0036:
            if (r1 >= r0) goto L_0x01b8
            android.view.View r3 = r11.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = m2278t(r3)
            int r5 = r4.f3274f
            r6 = -1
            r7 = 0
            if (r5 != r6) goto L_0x004c
            r4.f3280l = r7
            r4.f3279k = r7
            goto L_0x00d2
        L_0x004c:
            android.view.View r5 = r4.f3279k
            if (r5 == 0) goto L_0x007d
            int r5 = r5.getId()
            int r6 = r4.f3274f
            if (r5 == r6) goto L_0x0059
            goto L_0x0076
        L_0x0059:
            android.view.View r5 = r4.f3279k
            android.view.ViewParent r6 = r5.getParent()
        L_0x005f:
            if (r6 == r11) goto L_0x0078
            if (r6 == 0) goto L_0x0072
            if (r6 != r3) goto L_0x0066
            goto L_0x0072
        L_0x0066:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x006d
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006d:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x005f
        L_0x0072:
            r4.f3280l = r7
            r4.f3279k = r7
        L_0x0076:
            r5 = 0
            goto L_0x007b
        L_0x0078:
            r4.f3280l = r5
            r5 = 1
        L_0x007b:
            if (r5 != 0) goto L_0x00d2
        L_0x007d:
            int r5 = r4.f3274f
            android.view.View r5 = r11.findViewById(r5)
            r4.f3279k = r5
            if (r5 == 0) goto L_0x00c8
            if (r5 != r11) goto L_0x009c
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0094
            r4.f3280l = r7
            r4.f3279k = r7
            goto L_0x00d2
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x009c:
            android.view.ViewParent r6 = r5.getParent()
        L_0x00a0:
            if (r6 == r11) goto L_0x00c5
            if (r6 == 0) goto L_0x00c5
            if (r6 != r3) goto L_0x00b9
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x00b1
            r4.f3280l = r7
            r4.f3279k = r7
            goto L_0x00d2
        L_0x00b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b9:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x00c0
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00c0:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x00a0
        L_0x00c5:
            r4.f3280l = r5
            goto L_0x00d2
        L_0x00c8:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0193
            r4.f3280l = r7
            r4.f3279k = r7
        L_0x00d2:
            c1.a r5 = r11.f3247c
            java.lang.Object r6 = r5.f6159c
            s0.h r6 = (p241s0.C6313h) r6
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L_0x00e5
            java.lang.Object r5 = r5.f6159c
            s0.h r5 = (p241s0.C6313h) r5
            r5.put(r3, r7)
        L_0x00e5:
            r5 = 0
        L_0x00e6:
            if (r5 >= r0) goto L_0x018f
            if (r5 != r1) goto L_0x00ec
            goto L_0x018b
        L_0x00ec:
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r8 = r4.f3280l
            if (r6 == r8) goto L_0x0123
            java.util.WeakHashMap<android.view.View, s1.p0> r8 = p242s1.C6333d0.f19990a
            int r8 = p242s1.C6333d0.C6338e.m15063d(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0752e) r9
            int r9 = r9.f3275g
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r8)
            if (r9 == 0) goto L_0x0113
            int r10 = r4.f3276h
            int r8 = android.view.Gravity.getAbsoluteGravity(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x0113
            r8 = 1
            goto L_0x0114
        L_0x0113:
            r8 = 0
        L_0x0114:
            if (r8 != 0) goto L_0x0123
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r8 = r4.f3269a
            if (r8 == 0) goto L_0x0121
            boolean r8 = r8.layoutDependsOn(r11, r3, r6)
            if (r8 == 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r8 = 0
            goto L_0x0124
        L_0x0123:
            r8 = 1
        L_0x0124:
            if (r8 == 0) goto L_0x018b
            c1.a r8 = r11.f3247c
            java.lang.Object r8 = r8.f6159c
            s0.h r8 = (p241s0.C6313h) r8
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L_0x0145
            c1.a r8 = r11.f3247c
            java.lang.Object r9 = r8.f6159c
            s0.h r9 = (p241s0.C6313h) r9
            boolean r9 = r9.containsKey(r6)
            if (r9 != 0) goto L_0x0145
            java.lang.Object r8 = r8.f6159c
            s0.h r8 = (p241s0.C6313h) r8
            r8.put(r6, r7)
        L_0x0145:
            c1.a r8 = r11.f3247c
            java.lang.Object r9 = r8.f6159c
            s0.h r9 = (p241s0.C6313h) r9
            boolean r9 = r9.containsKey(r6)
            if (r9 == 0) goto L_0x0183
            java.lang.Object r9 = r8.f6159c
            s0.h r9 = (p241s0.C6313h) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 == 0) goto L_0x0183
            java.lang.Object r9 = r8.f6159c
            s0.h r9 = (p241s0.C6313h) r9
            java.lang.Object r9 = r9.getOrDefault(r6, r7)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x017f
            java.lang.Object r9 = r8.f6158b
            r1.d r9 = (p229r1.C6234d) r9
            java.lang.Object r9 = r9.mo22237b()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0178
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0178:
            java.lang.Object r8 = r8.f6159c
            s0.h r8 = (p241s0.C6313h) r8
            r8.put(r6, r9)
        L_0x017f:
            r9.add(r3)
            goto L_0x018b
        L_0x0183:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x018b:
            int r5 = r5 + 1
            goto L_0x00e6
        L_0x018f:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0193:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = r4.f3274f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b8:
            java.util.ArrayList r0 = r11.f3246b
            c1.a r1 = r11.f3247c
            java.lang.Object r3 = r1.f6160d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f6161e
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            java.lang.Object r3 = r1.f6159c
            s0.h r3 = (p241s0.C6313h) r3
            int r3 = r3.f19969d
        L_0x01d0:
            if (r2 >= r3) goto L_0x01e8
            java.lang.Object r4 = r1.f6159c
            s0.h r4 = (p241s0.C6313h) r4
            java.lang.Object r4 = r4.mo22416h(r2)
            java.lang.Object r5 = r1.f6160d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f6161e
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.mo6515a(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01d0
        L_0x01e8:
            java.lang.Object r1 = r1.f6160d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.ArrayList r0 = r11.f3246b
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo3312z():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f3246b = new ArrayList();
        this.f3247c = new C1757a();
        this.f3248d = new ArrayList();
        this.f3249e = new ArrayList();
        this.f3251g = new int[2];
        this.f3252h = new int[2];
        this.f3265u = new C6389s();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C1443c.CoordinatorLayout, 0, C1442b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C1443c.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C1443c.CoordinatorLayout, attributeSet, typedArray, 0, C1442b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C1443c.CoordinatorLayout, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C1443c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3255k = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3255k.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f3255k;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f3262r = typedArray.getDrawable(C1443c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        mo3263E();
        super.setOnHierarchyChangeListener(new C0751d());
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15043c(this) == 0) {
            C6333d0.C6337d.m15059s(this, 1);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0752e) {
            return new C0752e((C0752e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0752e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0752e(layoutParams);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0747a();

        /* renamed from: b */
        public SparseArray<Parcelable> f3266b;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C0747a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3266b = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3266b.append(iArr[i], readParcelableArray[i]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3266b;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f3266b.keyAt(i3);
                parcelableArr[i3] = this.f3266b.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C0752e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f3269a;

        /* renamed from: b */
        public boolean f3270b = false;

        /* renamed from: c */
        public int f3271c = 0;

        /* renamed from: d */
        public int f3272d = 0;

        /* renamed from: e */
        public int f3273e = -1;

        /* renamed from: f */
        public int f3274f = -1;

        /* renamed from: g */
        public int f3275g = 0;

        /* renamed from: h */
        public int f3276h = 0;

        /* renamed from: i */
        public int f3277i;

        /* renamed from: j */
        public int f3278j;

        /* renamed from: k */
        public View f3279k;

        /* renamed from: l */
        public View f3280l;

        /* renamed from: m */
        public boolean f3281m;

        /* renamed from: n */
        public boolean f3282n;

        /* renamed from: o */
        public boolean f3283o;

        /* renamed from: p */
        public boolean f3284p;

        /* renamed from: q */
        public final Rect f3285q = new Rect();

        /* renamed from: r */
        public Object f3286r;

        public C0752e() {
            super(-2, -2);
        }

        /* renamed from: a */
        public final boolean mo3350a(int i) {
            if (i == 0) {
                return this.f3282n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3283o;
        }

        /* renamed from: b */
        public final void mo3351b(Behavior behavior) {
            Behavior behavior2 = this.f3269a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f3269a = behavior;
                this.f3286r = null;
                this.f3270b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public C0752e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior behavior;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1443c.CoordinatorLayout_Layout);
            this.f3271c = obtainStyledAttributes.getInteger(C1443c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f3274f = obtainStyledAttributes.getResourceId(C1443c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f3272d = obtainStyledAttributes.getInteger(C1443c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f3273e = obtainStyledAttributes.getInteger(C1443c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f3275g = obtainStyledAttributes.getInt(C1443c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f3276h = obtainStyledAttributes.getInt(C1443c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = C1443c.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3270b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i);
                String str = CoordinatorLayout.f3241v;
                if (TextUtils.isEmpty(string)) {
                    behavior = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f3241v;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.f3243x;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3242w);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e) {
                        throw new RuntimeException(C25541a.m63881k("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f3269a = behavior;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior2 = this.f3269a;
            if (behavior2 != null) {
                behavior2.onAttachedToLayoutParams(this);
            }
        }

        public C0752e(C0752e eVar) {
            super(eVar);
        }

        public C0752e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0752e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
