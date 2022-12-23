package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.widget.C0797i;
import androidx.swiperefreshlayout.widget.C1278d;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p242s1.C6333d0;
import p242s1.C6379o;
import p242s1.C6381p;
import p242s1.C6382p0;
import p242s1.C6385q;
import p242s1.C6387r;
import p242s1.C6389s;

public class SwipeRefreshLayout extends ViewGroup implements C6387r, C6385q, C6379o {

    /* renamed from: L */
    public static final int[] f4782L = {16842766};

    /* renamed from: A */
    public C1278d f4783A;

    /* renamed from: B */
    public C1280e f4784B;

    /* renamed from: C */
    public C1281f f4785C;

    /* renamed from: D */
    public C1282g f4786D;

    /* renamed from: E */
    public C1282g f4787E;

    /* renamed from: F */
    public boolean f4788F;

    /* renamed from: G */
    public int f4789G;

    /* renamed from: H */
    public boolean f4790H;

    /* renamed from: I */
    public C1269a f4791I = new C1269a();

    /* renamed from: J */
    public final C1271c f4792J = new C1271c();

    /* renamed from: K */
    public final C1272d f4793K = new C1272d();

    /* renamed from: b */
    public View f4794b;

    /* renamed from: c */
    public C1274f f4795c;

    /* renamed from: d */
    public boolean f4796d = false;

    /* renamed from: e */
    public int f4797e;

    /* renamed from: f */
    public float f4798f = -1.0f;

    /* renamed from: g */
    public float f4799g;

    /* renamed from: h */
    public final C6389s f4800h;

    /* renamed from: i */
    public final C6381p f4801i;

    /* renamed from: j */
    public final int[] f4802j = new int[2];

    /* renamed from: k */
    public final int[] f4803k = new int[2];

    /* renamed from: l */
    public final int[] f4804l = new int[2];

    /* renamed from: m */
    public boolean f4805m;

    /* renamed from: n */
    public int f4806n;

    /* renamed from: o */
    public int f4807o;

    /* renamed from: p */
    public float f4808p;

    /* renamed from: q */
    public float f4809q;

    /* renamed from: r */
    public boolean f4810r;

    /* renamed from: s */
    public int f4811s = -1;

    /* renamed from: t */
    public final DecelerateInterpolator f4812t;

    /* renamed from: u */
    public C1275a f4813u;

    /* renamed from: v */
    public int f4814v = -1;

    /* renamed from: w */
    public int f4815w;

    /* renamed from: x */
    public int f4816x;

    /* renamed from: y */
    public int f4817y;

    /* renamed from: z */
    public int f4818z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class C1269a implements Animation.AnimationListener {
        public C1269a() {
        }

        public final void onAnimationEnd(Animation animation) {
            C1274f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4796d) {
                swipeRefreshLayout.f4783A.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                SwipeRefreshLayout.this.f4783A.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f4788F && (fVar = swipeRefreshLayout2.f4795c) != null) {
                    fVar.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f4807o = swipeRefreshLayout3.f4813u.getTop();
                return;
            }
            swipeRefreshLayout.mo5272f();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C1270b implements Animation.AnimationListener {
        public C1270b() {
        }

        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            C1281f fVar = new C1281f(swipeRefreshLayout);
            swipeRefreshLayout.f4785C = fVar;
            fVar.setDuration(150);
            C1275a aVar = swipeRefreshLayout.f4813u;
            aVar.f4824b = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f4813u.startAnimation(swipeRefreshLayout.f4785C);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C1271c extends Animation {
        public C1271c() {
        }

        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.f4817y - Math.abs(swipeRefreshLayout.f4816x);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f4815w;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.f4813u.getTop());
            C1278d dVar = SwipeRefreshLayout.this.f4783A;
            float f2 = 1.0f - f;
            C1278d.C1279a aVar = dVar.f4833b;
            if (f2 != aVar.f4854p) {
                aVar.f4854p = f2;
            }
            dVar.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C1272d extends Animation {
        public C1272d() {
        }

        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo5271e(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public interface C1273e {
        /* renamed from: a */
        boolean mo5327a();
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public interface C1274f {
        void onRefresh();
    }

    static {
        Class<SwipeRefreshLayout> cls = SwipeRefreshLayout.class;
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4797e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4806n = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f4812t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4789G = (int) (displayMetrics.density * 40.0f);
        this.f4813u = new C1275a(getContext());
        C1278d dVar = new C1278d(getContext());
        this.f4783A = dVar;
        dVar.mo5340c(1);
        this.f4813u.setImageDrawable(this.f4783A);
        this.f4813u.setVisibility(8);
        addView(this.f4813u);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f4817y = i;
        this.f4798f = (float) i;
        this.f4800h = new C6389s();
        this.f4801i = new C6381p(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f4789G;
        this.f4807o = i2;
        this.f4816x = i2;
        mo5271e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4782L);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f4813u.getBackground().setAlpha(i);
        this.f4783A.setAlpha(i);
    }

    /* renamed from: a */
    public final boolean mo5263a() {
        View view = this.f4794b;
        if (view instanceof ListView) {
            return C0797i.m2410a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: b */
    public final void mo5264b() {
        if (this.f4794b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f4813u)) {
                    this.f4794b = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo5265c(float f) {
        if (f > this.f4798f) {
            mo5273g(true, true);
            return;
        }
        this.f4796d = false;
        C1278d dVar = this.f4783A;
        C1278d.C1279a aVar = dVar.f4833b;
        aVar.f4843e = BitmapDescriptorFactory.HUE_RED;
        aVar.f4844f = BitmapDescriptorFactory.HUE_RED;
        dVar.invalidateSelf();
        C1270b bVar = new C1270b();
        this.f4815w = this.f4807o;
        this.f4793K.reset();
        this.f4793K.setDuration(200);
        this.f4793K.setInterpolator(this.f4812t);
        C1275a aVar2 = this.f4813u;
        aVar2.f4824b = bVar;
        aVar2.clearAnimation();
        this.f4813u.startAnimation(this.f4793K);
        C1278d dVar2 = this.f4783A;
        C1278d.C1279a aVar3 = dVar2.f4833b;
        if (aVar3.f4852n) {
            aVar3.f4852n = false;
        }
        dVar2.invalidateSelf();
    }

    /* renamed from: d */
    public final void mo5266d(float f) {
        C1278d dVar = this.f4783A;
        C1278d.C1279a aVar = dVar.f4833b;
        boolean z = true;
        if (!aVar.f4852n) {
            aVar.f4852n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.f4798f));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f4798f;
        int i = this.f4818z;
        if (i <= 0) {
            i = this.f4817y;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f4816x + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f4813u.getVisibility() != 0) {
            this.f4813u.setVisibility(0);
        }
        this.f4813u.setScaleX(1.0f);
        this.f4813u.setScaleY(1.0f);
        if (f < this.f4798f) {
            if (this.f4783A.f4833b.f4858t > 76) {
                C1282g gVar = this.f4786D;
                if (gVar == null || !gVar.hasStarted() || gVar.hasEnded()) {
                    z = false;
                }
                if (!z) {
                    C1282g gVar2 = new C1282g(this, this.f4783A.f4833b.f4858t, 76);
                    gVar2.setDuration(300);
                    C1275a aVar2 = this.f4813u;
                    aVar2.f4824b = null;
                    aVar2.clearAnimation();
                    this.f4813u.startAnimation(gVar2);
                    this.f4786D = gVar2;
                }
            }
        } else if (this.f4783A.f4833b.f4858t < 255) {
            C1282g gVar3 = this.f4787E;
            if (gVar3 == null || !gVar3.hasStarted() || gVar3.hasEnded()) {
                z = false;
            }
            if (!z) {
                C1282g gVar4 = new C1282g(this, this.f4783A.f4833b.f4858t, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                gVar4.setDuration(300);
                C1275a aVar3 = this.f4813u;
                aVar3.f4824b = null;
                aVar3.clearAnimation();
                this.f4813u.startAnimation(gVar4);
                this.f4787E = gVar4;
            }
        }
        C1278d dVar2 = this.f4783A;
        float min2 = Math.min(0.8f, max * 0.8f);
        C1278d.C1279a aVar4 = dVar2.f4833b;
        aVar4.f4843e = BitmapDescriptorFactory.HUE_RED;
        aVar4.f4844f = min2;
        dVar2.invalidateSelf();
        C1278d dVar3 = this.f4783A;
        float min3 = Math.min(1.0f, max);
        C1278d.C1279a aVar5 = dVar3.f4833b;
        if (min3 != aVar5.f4854p) {
            aVar5.f4854p = min3;
        }
        dVar3.invalidateSelf();
        C1278d dVar4 = this.f4783A;
        dVar4.f4833b.f4845g = ((pow * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f4807o);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4801i.mo22483a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4801i.mo22484b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f4801i.mo22485c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4801i.mo22487e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: e */
    public final void mo5271e(float f) {
        int i = this.f4815w;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f4816x - i)) * f))) - this.f4813u.getTop());
    }

    /* renamed from: f */
    public final void mo5272f() {
        this.f4813u.clearAnimation();
        this.f4783A.stop();
        this.f4813u.setVisibility(8);
        setColorViewAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        setTargetOffsetTopAndBottom(this.f4816x - this.f4807o);
        this.f4807o = this.f4813u.getTop();
    }

    /* renamed from: g */
    public final void mo5273g(boolean z, boolean z2) {
        if (this.f4796d != z) {
            this.f4788F = z2;
            mo5264b();
            this.f4796d = z;
            if (z) {
                int i = this.f4807o;
                C1269a aVar = this.f4791I;
                this.f4815w = i;
                this.f4792J.reset();
                this.f4792J.setDuration(200);
                this.f4792J.setInterpolator(this.f4812t);
                if (aVar != null) {
                    this.f4813u.f4824b = aVar;
                }
                this.f4813u.clearAnimation();
                this.f4813u.startAnimation(this.f4792J);
                return;
            }
            C1269a aVar2 = this.f4791I;
            C1281f fVar = new C1281f(this);
            this.f4785C = fVar;
            fVar.setDuration(150);
            C1275a aVar3 = this.f4813u;
            aVar3.f4824b = aVar2;
            aVar3.clearAnimation();
            this.f4813u.startAnimation(this.f4785C);
        }
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f4814v;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        C6389s sVar = this.f4800h;
        return sVar.f20042b | sVar.f20041a;
    }

    public int getProgressCircleDiameter() {
        return this.f4789G;
    }

    public int getProgressViewEndOffset() {
        return this.f4817y;
    }

    public int getProgressViewStartOffset() {
        return this.f4816x;
    }

    /* renamed from: h */
    public final void mo5279h(float f) {
        float f2 = this.f4809q;
        int i = this.f4797e;
        if (f - f2 > ((float) i) && !this.f4810r) {
            this.f4808p = f2 + ((float) i);
            this.f4810r = true;
            this.f4783A.setAlpha(76);
        }
    }

    public final boolean hasNestedScrollingParent() {
        if (this.f4801i.mo22488f(0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo1280i(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f4801i.f20038d;
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

    /* renamed from: n */
    public final void mo1284n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            int[] iArr2 = this.f4803k;
            if (i5 == 0) {
                this.f4801i.mo22486d(i, i2, i3, i4, iArr2, i5, iArr);
            }
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = i4 + this.f4803k[1];
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !mo5263a()) {
                float abs = this.f4799g + ((float) Math.abs(i6));
                this.f4799g = abs;
                mo5266d(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    /* renamed from: o */
    public final void mo1285o(View view, int i, int i2, int i3, int i4, int i5) {
        mo1284n(view, i, i2, i3, i4, i5, this.f4804l);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5272f();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        mo5264b();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || mo5263a() || this.f4796d || this.f4805m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f4811s;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    mo5279h(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f4811s) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.f4811s = motionEvent.getPointerId(i);
                        }
                    }
                }
            }
            this.f4810r = false;
            this.f4811s = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4816x - this.f4813u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4811s = pointerId;
            this.f4810r = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4809q = motionEvent.getY(findPointerIndex2);
        }
        return this.f4810r;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f4794b == null) {
                mo5264b();
            }
            View view = this.f4794b;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f4813u.getMeasuredWidth();
                int measuredHeight2 = this.f4813u.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f4807o;
                this.f4813u.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4794b == null) {
            mo5264b();
        }
        View view = this.f4794b;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f4813u.measure(View.MeasureSpec.makeMeasureSpec(this.f4789G, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4789G, 1073741824));
            this.f4814v = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f4813u) {
                    this.f4814v = i3;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f4799g;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f4799g = BitmapDescriptorFactory.HUE_RED;
                } else {
                    this.f4799g = f - f2;
                    iArr[1] = i2;
                }
                mo5266d(this.f4799g);
            }
        }
        int[] iArr2 = this.f4802j;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1284n(view, i, i2, i3, i4, 0, this.f4804l);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4800h.f20041a = i;
        startNestedScroll(i & 2);
        this.f4799g = BitmapDescriptorFactory.HUE_RED;
        this.f4805m = true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f4819b);
    }

    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4796d);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f4796d && (i & 2) != 0;
    }

    public final void onStopNestedScroll(View view) {
        this.f4800h.f20041a = 0;
        this.f4805m = false;
        float f = this.f4799g;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            mo5265c(f);
            this.f4799g = BitmapDescriptorFactory.HUE_RED;
        }
        stopNestedScroll();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || mo5263a() || this.f4796d || this.f4805m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4811s = motionEvent.getPointerId(0);
            this.f4810r = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4811s);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f4810r) {
                this.f4810r = false;
                mo5265c((motionEvent.getY(findPointerIndex) - this.f4808p) * 0.5f);
            }
            this.f4811s = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f4811s);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            mo5279h(y);
            if (this.f4810r) {
                float f = (y - this.f4808p) * 0.5f;
                if (f <= BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                mo5266d(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f4811s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.f4811s) {
                    if (actionIndex2 == 0) {
                        i = 1;
                    }
                    this.f4811s = motionEvent.getPointerId(i);
                }
            }
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo1300p(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f4794b;
        if (view != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (!C6333d0.C6342i.m15099p(view)) {
                if (!this.f4790H && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f4813u.setScaleX(f);
        this.f4813u.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        mo5264b();
        C1278d dVar = this.f4783A;
        C1278d.C1279a aVar = dVar.f4833b;
        aVar.f4847i = iArr;
        aVar.mo5349a(0);
        dVar.f4833b.mo5349a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C4732a.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f4798f = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo5272f();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f4790H = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        C6381p pVar = this.f4801i;
        if (pVar.f20038d) {
            View view = pVar.f20037c;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15109z(view);
        }
        pVar.f20038d = z;
    }

    public void setOnChildScrollUpCallback(C1273e eVar) {
    }

    public void setOnRefreshListener(C1274f fVar) {
        this.f4795c = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f4813u.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C4732a.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f4796d == z) {
            mo5273g(z, false);
            return;
        }
        this.f4796d = z;
        setTargetOffsetTopAndBottom((this.f4817y + this.f4816x) - this.f4807o);
        this.f4788F = false;
        C1269a aVar = this.f4791I;
        this.f4813u.setVisibility(0);
        this.f4783A.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        C1280e eVar = new C1280e(this);
        this.f4784B = eVar;
        eVar.setDuration((long) this.f4806n);
        if (aVar != null) {
            this.f4813u.f4824b = aVar;
        }
        this.f4813u.clearAnimation();
        this.f4813u.startAnimation(this.f4784B);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f4789G = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4789G = (int) (displayMetrics.density * 40.0f);
            }
            this.f4813u.setImageDrawable((Drawable) null);
            this.f4783A.mo5340c(i);
            this.f4813u.setImageDrawable(this.f4783A);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f4818z = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f4813u.bringToFront();
        C6333d0.m15023k(i, this.f4813u);
        this.f4807o = this.f4813u.getTop();
    }

    public final boolean startNestedScroll(int i) {
        return this.f4801i.mo22489g(i, 0);
    }

    public final void stopNestedScroll() {
        this.f4801i.mo22490h(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1268a();

        /* renamed from: b */
        public final boolean f4819b;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        public class C1268a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f4819b = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f4819b ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4819b = parcel.readByte() != 0;
        }
    }
}
