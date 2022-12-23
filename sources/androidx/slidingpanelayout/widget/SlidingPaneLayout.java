package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p306x1.C7148c;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: b */
    public int f4752b;

    /* renamed from: c */
    public int f4753c;

    /* renamed from: d */
    public Drawable f4754d;

    /* renamed from: e */
    public Drawable f4755e;

    /* renamed from: f */
    public final int f4756f;

    /* renamed from: g */
    public boolean f4757g;

    /* renamed from: h */
    public View f4758h;

    /* renamed from: i */
    public float f4759i;

    /* renamed from: j */
    public float f4760j;

    /* renamed from: k */
    public int f4761k;

    /* renamed from: l */
    public boolean f4762l;

    /* renamed from: m */
    public int f4763m;

    /* renamed from: n */
    public float f4764n;

    /* renamed from: o */
    public float f4765o;

    /* renamed from: p */
    public final C7148c f4766p;

    /* renamed from: q */
    public boolean f4767q;

    /* renamed from: r */
    public boolean f4768r;

    /* renamed from: s */
    public final Rect f4769s;

    /* renamed from: t */
    public final ArrayList<C1265b> f4770t;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1263a();

        /* renamed from: b */
        public boolean f4776b;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public static class C1263a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4776b ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel, (ClassLoader) null);
            this.f4776b = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C1264a extends C6315a {

        /* renamed from: a */
        public final Rect f4777a = new Rect();

        public C1264a() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(gVar.f20334a);
            C6531g gVar2 = new C6531g(obtain);
            super.onInitializeAccessibilityNodeInfo(view, gVar2);
            Rect rect = this.f4777a;
            gVar2.mo22637d(rect);
            gVar.mo22642h(rect);
            obtain.getBoundsInScreen(rect);
            gVar.f20334a.setBoundsInScreen(rect);
            gVar.f20334a.setVisibleToUser(obtain.isVisibleToUser());
            gVar.f20334a.setPackageName(obtain.getPackageName());
            gVar.mo22644i(obtain.getClassName());
            gVar.mo22646k(obtain.getContentDescription());
            gVar.f20334a.setEnabled(obtain.isEnabled());
            gVar.f20334a.setClickable(obtain.isClickable());
            gVar.f20334a.setFocusable(obtain.isFocusable());
            gVar.f20334a.setFocused(obtain.isFocused());
            gVar.f20334a.setAccessibilityFocused(obtain.isAccessibilityFocused());
            gVar.f20334a.setSelected(obtain.isSelected());
            gVar.f20334a.setLongClickable(obtain.isLongClickable());
            gVar.mo22634a(obtain.getActions());
            gVar.f20334a.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            gVar.mo22644i(SlidingPaneLayout.class.getName());
            gVar.f20336c = -1;
            gVar.f20334a.setSource(view);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            ViewParent f = C6333d0.C6337d.m15046f(view);
            if (f instanceof View) {
                gVar.f20335b = -1;
                gVar.f20334a.setParent((View) f);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!SlidingPaneLayout.this.mo5215b(childAt) && childAt.getVisibility() == 0) {
                    C6333d0.C6337d.m15059s(childAt, 1);
                    gVar.f20334a.addChild(childAt);
                }
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!SlidingPaneLayout.this.mo5215b(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C1265b implements Runnable {

        /* renamed from: b */
        public final View f4779b;

        public C1265b(View view) {
            this.f4779b = view;
        }

        public final void run() {
            if (this.f4779b.getParent() == SlidingPaneLayout.this) {
                this.f4779b.setLayerType(0, (Paint) null);
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                View view = this.f4779b;
                slidingPaneLayout.getClass();
                Paint paint = ((LayoutParams) view.getLayoutParams()).f4775d;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6338e.m15068i(view, paint);
            }
            SlidingPaneLayout.this.f4770t.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C1266c extends C7148c.C7151c {
        public C1266c() {
        }

        /* renamed from: a */
        public final int mo3593a(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f4758h.getLayoutParams();
            if (SlidingPaneLayout.this.mo5216c()) {
                int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f4758h.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin));
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f4761k);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f4761k + paddingLeft);
        }

        /* renamed from: b */
        public final int mo3594b(View view, int i) {
            return view.getTop();
        }

        /* renamed from: c */
        public final int mo3595c(View view) {
            return SlidingPaneLayout.this.f4761k;
        }

        /* renamed from: e */
        public final void mo3596e(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f4766p.mo23416c(i2, slidingPaneLayout.f4758h);
        }

        /* renamed from: g */
        public final void mo3598g(int i, View view) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        /* renamed from: h */
        public final void mo3599h(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f4766p.f22198a != 0) {
                return;
            }
            if (slidingPaneLayout.f4759i == BitmapDescriptorFactory.HUE_RED) {
                slidingPaneLayout.mo5223f(slidingPaneLayout.f4758h);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                View view = slidingPaneLayout2.f4758h;
                slidingPaneLayout2.getClass();
                slidingPaneLayout2.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.f4767q = false;
                return;
            }
            slidingPaneLayout.getClass();
            slidingPaneLayout.sendAccessibilityEvent(32);
            SlidingPaneLayout.this.f4767q = true;
        }

        /* renamed from: i */
        public final void mo3600i(View view, int i, int i2) {
            int i3;
            int i4;
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f4758h == null) {
                slidingPaneLayout.f4759i = BitmapDescriptorFactory.HUE_RED;
            } else {
                boolean c = slidingPaneLayout.mo5216c();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f4758h.getLayoutParams();
                int width = slidingPaneLayout.f4758h.getWidth();
                if (c) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                if (c) {
                    i3 = slidingPaneLayout.getPaddingRight();
                } else {
                    i3 = slidingPaneLayout.getPaddingLeft();
                }
                if (c) {
                    i4 = layoutParams.rightMargin;
                } else {
                    i4 = layoutParams.leftMargin;
                }
                float f = ((float) (i - (i3 + i4))) / ((float) slidingPaneLayout.f4761k);
                slidingPaneLayout.f4759i = f;
                if (slidingPaneLayout.f4763m != 0) {
                    slidingPaneLayout.mo5219d(f);
                }
                if (layoutParams.f4774c) {
                    slidingPaneLayout.mo5214a(slidingPaneLayout.f4759i, slidingPaneLayout.f4752b, slidingPaneLayout.f4758h);
                }
                slidingPaneLayout.getClass();
            }
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: j */
        public final void mo3601j(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo5216c()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && SlidingPaneLayout.this.f4759i > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f4761k;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f4758h.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f4759i > 0.5f)) {
                    i += SlidingPaneLayout.this.f4761k;
                }
            }
            SlidingPaneLayout.this.f4766p.mo23430s(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: k */
        public final boolean mo3602k(int i, View view) {
            if (SlidingPaneLayout.this.f4762l) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f4773b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C1267d {
        /* renamed from: a */
        void mo5254a();

        /* renamed from: b */
        void mo5255b();

        /* renamed from: c */
        void mo5256c();
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo5214a(float f, int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > BitmapDescriptorFactory.HUE_RED && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f4775d == null) {
                layoutParams.f4775d = new Paint();
            }
            layoutParams.f4775d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f4775d);
            }
            Paint paint = ((LayoutParams) view.getLayoutParams()).f4775d;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6338e.m15068i(view, paint);
        } else if (view.getLayerType() != 0) {
            Paint paint2 = layoutParams.f4775d;
            if (paint2 != null) {
                paint2.setColorFilter((ColorFilter) null);
            }
            C1265b bVar = new C1265b(view);
            this.f4770t.add(bVar);
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15053m(this, bVar);
        }
    }

    /* renamed from: b */
    public final boolean mo5215b(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f4757g || !layoutParams.f4774c || this.f4759i <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo5216c() {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        if (!this.f4766p.mo23421h(true)) {
            return;
        }
        if (!this.f4757g) {
            this.f4766p.mo23414a();
            return;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5219d(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo5216c()
            android.view.View r1 = r9.f4758h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f4774c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f4758h
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f4760j
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f4763m
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f4760j = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f4760j
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f4753c
            r9.mo5214a(r5, r6, r4)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.mo5219d(float):void");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (mo5216c()) {
            drawable = this.f4755e;
        } else {
            drawable = this.f4754d;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo5216c()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f4757g && !layoutParams.f4773b && this.f4758h != null) {
            canvas.getClipBounds(this.f4769s);
            if (mo5216c()) {
                Rect rect = this.f4769s;
                rect.left = Math.max(rect.left, this.f4758h.getRight());
            } else {
                Rect rect2 = this.f4769s;
                rect2.right = Math.min(rect2.right, this.f4758h.getLeft());
            }
            canvas.clipRect(this.f4769s);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public final boolean mo5222e(float f) {
        int i;
        if (!this.f4757g) {
            return false;
        }
        boolean c = mo5216c();
        LayoutParams layoutParams = (LayoutParams) this.f4758h.getLayoutParams();
        if (c) {
            int paddingRight = getPaddingRight() + layoutParams.rightMargin;
            int width = this.f4758h.getWidth();
            i = (int) (((float) getWidth()) - (((f * ((float) this.f4761k)) + ((float) paddingRight)) + ((float) width)));
        } else {
            i = (int) ((f * ((float) this.f4761k)) + ((float) (getPaddingLeft() + layoutParams.leftMargin)));
        }
        C7148c cVar = this.f4766p;
        View view = this.f4758h;
        if (!cVar.mo23432u(view, i, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(this);
        return true;
    }

    /* renamed from: f */
    public final void mo5223f(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View childAt;
        boolean z;
        int i7;
        int i8;
        int i9;
        View view2 = view;
        boolean c = mo5216c();
        if (c) {
            i = getWidth() - getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        if (c) {
            i2 = getPaddingLeft();
        } else {
            i2 = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i6 = view.getLeft();
            i5 = view.getRight();
            i4 = view.getTop();
            i3 = view.getBottom();
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = c;
                } else {
                    if (c) {
                        i7 = i2;
                    } else {
                        i7 = i;
                    }
                    int max = Math.max(i7, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    z = c;
                    if (c) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    int min = Math.min(i8, childAt.getRight());
                    int min2 = Math.min(height, childAt.getBottom());
                    if (max < i6 || max2 < i4 || min > i5 || min2 > i3) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    childAt.setVisibility(i9);
                }
                i11++;
                view2 = view;
                c = z;
            } else {
                return;
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f4753c;
    }

    public int getParallaxDistance() {
        return this.f4763m;
    }

    public int getSliderFadeColor() {
        return this.f4752b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4768r = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4768r = true;
        int size = this.f4770t.size();
        for (int i = 0; i < size; i++) {
            this.f4770t.get(i).run();
        }
        this.f4770t.clear();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f4757g && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f4766p.getClass();
            this.f4767q = !C7148c.m16729l(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f4757g || (this.f4762l && actionMasked != 0)) {
            this.f4766p.mo23415b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f4766p.mo23415b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f4762l = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f4764n = x;
                this.f4765o = y;
                this.f4766p.getClass();
                if (C7148c.m16729l(this.f4758h, (int) x, (int) y) && mo5215b(this.f4758h)) {
                    z = true;
                    if (this.f4766p.mo23431t(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f4764n);
                float abs2 = Math.abs(y2 - this.f4765o);
                C7148c cVar = this.f4766p;
                if (abs > ((float) cVar.f22199b) && abs2 > abs) {
                    cVar.mo23415b();
                    this.f4762l = true;
                    return false;
                }
            }
            z = false;
            return this.f4766p.mo23431t(motionEvent) ? true : true;
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        boolean z2;
        float f;
        boolean c = mo5216c();
        if (c) {
            this.f4766p.f22214q = 2;
        } else {
            this.f4766p.f22214q = 1;
        }
        int i14 = i3 - i;
        if (c) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (c) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f4768r) {
            if (!this.f4757g || !this.f4767q) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            this.f4759i = f;
        }
        int i15 = i5;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f4773b) {
                    int i17 = i14 - i6;
                    int min = (Math.min(i5, i17 - this.f4756f) - i15) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f4761k = min;
                    if (c) {
                        i13 = layoutParams.rightMargin;
                    } else {
                        i13 = layoutParams.leftMargin;
                    }
                    if ((measuredWidth / 2) + i15 + i13 + min > i17) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f4774c = z2;
                    int i18 = (int) (((float) min) * this.f4759i);
                    i8 = i13 + i18 + i15;
                    this.f4759i = ((float) i18) / ((float) min);
                    i7 = 0;
                } else if (!this.f4757g || (i12 = this.f4763m) == 0) {
                    i8 = i5;
                    i7 = 0;
                } else {
                    i7 = (int) ((1.0f - this.f4759i) * ((float) i12));
                    i8 = i5;
                }
                if (c) {
                    i9 = (i14 - i8) + i7;
                    i11 = i9 - measuredWidth;
                } else {
                    i11 = i8 - i7;
                    i9 = i11 + measuredWidth;
                }
                childAt.layout(i11, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i15 = i8;
                i5 = childAt.getWidth() + i5;
            }
        }
        if (this.f4768r) {
            if (this.f4757g) {
                if (this.f4763m != 0) {
                    mo5219d(this.f4759i);
                }
                if (((LayoutParams) this.f4758h.getLayoutParams()).f4774c) {
                    mo5214a(this.f4759i, this.f4752b, this.f4758h);
                }
            } else {
                for (int i19 = 0; i19 < childCount; i19++) {
                    mo5214a(BitmapDescriptorFactory.HUE_RED, this.f4752b, getChildAt(i19));
                }
            }
            mo5223f(this.f4758h);
        }
        this.f4768r = false;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = Strategy.TTL_SECONDS_DEFAULT;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = Strategy.TTL_SECONDS_DEFAULT;
            }
        }
        boolean z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f4758h = null;
        int i16 = paddingLeft;
        int i17 = 0;
        boolean z4 = false;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            i5 = 8;
            if (i17 >= childCount) {
                break;
            }
            View childAt = getChildAt(i17);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f4774c = z3;
            } else {
                float f3 = layoutParams.f4772a;
                if (f3 > BitmapDescriptorFactory.HUE_RED) {
                    f2 += f3;
                    if (layoutParams.width == 0) {
                    }
                }
                int i18 = layoutParams.leftMargin + layoutParams.rightMargin;
                int i19 = layoutParams.width;
                if (i19 == -2) {
                    i12 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i18, Integer.MIN_VALUE);
                    f = f2;
                    i13 = Integer.MIN_VALUE;
                } else {
                    f = f2;
                    i13 = Integer.MIN_VALUE;
                    if (i19 == -1) {
                        i12 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i18, 1073741824);
                    } else {
                        i12 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    }
                }
                int i21 = layoutParams.height;
                if (i21 == -2) {
                    i14 = View.MeasureSpec.makeMeasureSpec(i3, i13);
                } else {
                    if (i21 == -1) {
                        i15 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        i15 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    }
                    i14 = i15;
                }
                childAt.measure(i12, i14);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i13 && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i16 -= measuredWidth;
                if (i16 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                layoutParams.f4773b = z2;
                z4 |= z2;
                if (z2) {
                    this.f4758h = childAt;
                }
                f2 = f;
            }
            i17++;
            z3 = false;
        }
        if (z4 || f2 > BitmapDescriptorFactory.HUE_RED) {
            int i22 = paddingLeft - this.f4756f;
            int i23 = 0;
            while (i23 < childCount) {
                View childAt2 = getChildAt(i23);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        if (layoutParams2.width != 0 || layoutParams2.f4772a <= BitmapDescriptorFactory.HUE_RED) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z4 || childAt2 == this.f4758h) {
                            if (layoutParams2.f4772a > BitmapDescriptorFactory.HUE_RED) {
                                if (layoutParams2.width == 0) {
                                    int i24 = layoutParams2.height;
                                    if (i24 == -2) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    } else if (i24 == -1) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                    } else {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                    }
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z4) {
                                    int i25 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i6 = i22;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
                                    if (i7 != i25) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i23++;
                                    i22 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i22;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((layoutParams2.f4772a * ((float) Math.max(0, i16))) / f2)), 1073741824), i8);
                                    i23++;
                                    i22 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i7 > i22 || layoutParams2.f4772a > BitmapDescriptorFactory.HUE_RED)) {
                            if (z) {
                                int i26 = layoutParams2.height;
                                if (i26 == -2) {
                                    i11 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i9 = 1073741824;
                                } else if (i26 == -1) {
                                    i9 = 1073741824;
                                    i11 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i9 = 1073741824;
                                    i11 = View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
                                }
                            } else {
                                i9 = 1073741824;
                                i11 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i22, i9), i11);
                        }
                    }
                }
                i6 = i22;
                i23++;
                i22 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i4);
        this.f4757g = z4;
        C7148c cVar = this.f4766p;
        if (cVar.f22198a != 0 && !z4) {
            cVar.mo23414a();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f4776b) {
            if (this.f4768r || mo5222e(1.0f)) {
                this.f4767q = true;
            }
        } else if (this.f4768r || mo5222e(BitmapDescriptorFactory.HUE_RED)) {
            this.f4767q = false;
        }
        this.f4767q = savedState.f4776b;
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z2 = this.f4757g;
        if (!z2) {
            z = this.f4767q;
        } else if (!z2 || this.f4759i == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        savedState.f4776b = z;
        return savedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f4768r = true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4757g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f4766p.mo23424m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f4764n = x;
            this.f4765o = y;
        } else if (actionMasked == 1 && mo5215b(this.f4758h)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f4764n;
            float f2 = y2 - this.f4765o;
            int i = this.f4766p.f22199b;
            if ((f2 * f2) + (f * f) < ((float) (i * i)) && C7148c.m16729l(this.f4758h, (int) x2, (int) y2) && (this.f4768r || mo5222e(BitmapDescriptorFactory.HUE_RED))) {
                this.f4767q = false;
            }
        }
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f4757g) {
            if (view == this.f4758h) {
                z = true;
            } else {
                z = false;
            }
            this.f4767q = z;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f4753c = i;
    }

    public void setPanelSlideListener(C1267d dVar) {
    }

    public void setParallaxDistance(int i) {
        this.f4763m = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f4754d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f4755e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C4732a.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C4732a.getDrawable(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f4752b = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final int[] f4771e = {16843137};

        /* renamed from: a */
        public float f4772a = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: b */
        public boolean f4773b;

        /* renamed from: c */
        public boolean f4774c;

        /* renamed from: d */
        public Paint f4775d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4771e);
            this.f4772a = obtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4752b = -858993460;
        this.f4768r = true;
        this.f4769s = new Rect();
        this.f4770t = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f4756f = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C6333d0.m15029q(this, new C1264a());
        C6333d0.C6337d.m15059s(this, 1);
        C7148c i2 = C7148c.m16728i(this, 0.5f, new C1266c());
        this.f4766p = i2;
        i2.f22211n = f * 400.0f;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
