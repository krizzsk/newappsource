package com.moovit.commons.view.behavior;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6379o;
import p242s1.C6382p0;
import p306x1.C7148c;
import p622kz.C18165g;
import p977zz.C20936e0;

@Keep
public class MyBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_IDLE = 6;
    public static final int STATE_SETTLING = 2;
    /* access modifiers changed from: private */
    public int activePointerId;
    private BottomSheetBehavior.C13920c callback;
    private final C7148c.C7151c dragCallback;
    /* access modifiers changed from: private */
    public MyBottomSheetBehavior<V>.C13555b flingRunnable;
    private boolean ignoreEvents;
    private float initialTopOffsetPercentage;
    private int initialY;
    /* access modifiers changed from: private */
    public boolean isHideable;
    private boolean isNestedFling;
    private boolean isNestedScrolled;
    /* access modifiers changed from: private */
    public boolean isTouchingScrollingChild;
    /* access modifiers changed from: private */
    public int lastKnownOffset;
    private float maxFlingVelocity;
    /* access modifiers changed from: private */
    public int maxOffset;
    /* access modifiers changed from: private */
    public int minOffset;
    private boolean nestedScrollingChildManuallySet;
    /* access modifiers changed from: private */
    public WeakReference<View> nestedScrollingChildRef;
    /* access modifiers changed from: private */
    public int parentHeight;
    private int peekHeight;
    /* access modifiers changed from: private */
    public OverScroller scroller;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public C7148c viewDragHelper;
    /* access modifiers changed from: private */
    public WeakReference<V> viewRef;

    /* renamed from: com.moovit.commons.view.behavior.MyBottomSheetBehavior$a */
    public class C15805a extends C7148c.C7151c {
        public C15805a() {
        }

        /* renamed from: a */
        public final int mo3593a(View view, int i) {
            return view.getLeft();
        }

        /* renamed from: b */
        public final int mo3594b(View view, int i) {
            return C20936e0.m49036b(MyBottomSheetBehavior.this.minOffset, MyBottomSheetBehavior.this.isHideable ? MyBottomSheetBehavior.this.parentHeight : MyBottomSheetBehavior.this.maxOffset, i);
        }

        /* renamed from: d */
        public final int mo23436d() {
            int i;
            int i2;
            if (MyBottomSheetBehavior.this.isHideable) {
                i2 = MyBottomSheetBehavior.this.parentHeight;
                i = MyBottomSheetBehavior.this.minOffset;
            } else {
                i2 = MyBottomSheetBehavior.this.maxOffset;
                i = MyBottomSheetBehavior.this.minOffset;
            }
            return i2 - i;
        }

        /* renamed from: h */
        public final void mo3599h(int i) {
            if (i == 1) {
                MyBottomSheetBehavior.this.setStateInternal(1);
            }
        }

        /* renamed from: i */
        public final void mo3600i(View view, int i, int i2) {
            int unused = MyBottomSheetBehavior.this.lastKnownOffset = i2;
            MyBottomSheetBehavior.this.dispatchOnSlide(i2);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: j */
        public final void mo3601j(View view, float f, float f2) {
            int i;
            if (MyBottomSheetBehavior.this.isHideable) {
                i = MyBottomSheetBehavior.this.getFinalState(view, f2);
            } else {
                i = -1;
            }
            if (i != -1) {
                MyBottomSheetBehavior.this.setState(i);
            } else {
                MyBottomSheetBehavior.this.setStateInternal(6);
            }
        }

        /* renamed from: k */
        public final boolean mo3602k(int i, View view) {
            View view2;
            if (MyBottomSheetBehavior.this.state == 1 || MyBottomSheetBehavior.this.isTouchingScrollingChild) {
                return false;
            }
            if ((MyBottomSheetBehavior.this.state != 3 || MyBottomSheetBehavior.this.activePointerId != i || (view2 = (View) MyBottomSheetBehavior.this.nestedScrollingChildRef.get()) == null || !view2.canScrollVertically(-1)) && MyBottomSheetBehavior.this.viewRef != null && MyBottomSheetBehavior.this.viewRef.get() == view) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.moovit.commons.view.behavior.MyBottomSheetBehavior$b */
    public class C15806b implements Runnable {

        /* renamed from: b */
        public View f41168b;

        public C15806b(View view) {
            this.f41168b = view;
        }

        public final void run() {
            if (this.f41168b != null && MyBottomSheetBehavior.this.scroller != null) {
                if (MyBottomSheetBehavior.this.scroller.computeScrollOffset()) {
                    C6333d0.m15023k(MyBottomSheetBehavior.this.scroller.getCurrY() - this.f41168b.getTop(), this.f41168b);
                    C6333d0.C6337d.m15053m(this.f41168b, this);
                }
                int top = this.f41168b.getTop();
                if (MyBottomSheetBehavior.this.scroller.isFinished()) {
                    if (top == MyBottomSheetBehavior.this.minOffset) {
                        MyBottomSheetBehavior.this.setStateInternal(3);
                    } else if (top == MyBottomSheetBehavior.this.maxOffset) {
                        MyBottomSheetBehavior.this.setStateInternal(4);
                    } else if (top == MyBottomSheetBehavior.this.parentHeight) {
                        MyBottomSheetBehavior.this.setStateInternal(5);
                    } else {
                        MyBottomSheetBehavior.this.setStateInternal(6);
                    }
                    C15806b unused = MyBottomSheetBehavior.this.flingRunnable = null;
                }
                int unused2 = MyBottomSheetBehavior.this.lastKnownOffset = top;
                MyBottomSheetBehavior.this.dispatchOnSlide(top);
            }
        }
    }

    /* renamed from: com.moovit.commons.view.behavior.MyBottomSheetBehavior$c */
    public class C15807c implements Runnable {

        /* renamed from: b */
        public final View f41170b;

        /* renamed from: c */
        public final int f41171c;

        public C15807c(View view, int i) {
            this.f41170b = view;
            this.f41171c = i;
        }

        public final void run() {
            if (MyBottomSheetBehavior.this.flingRunnable == null) {
                if (MyBottomSheetBehavior.this.viewDragHelper == null || !MyBottomSheetBehavior.this.viewDragHelper.mo23421h(false)) {
                    MyBottomSheetBehavior.this.setStateInternal(this.f41171c);
                    return;
                }
                View view = this.f41170b;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15053m(view, this);
            }
        }
    }

    public MyBottomSheetBehavior() {
        this.maxFlingVelocity = BitmapDescriptorFactory.HUE_RED;
        this.nestedScrollingChildManuallySet = false;
        this.dragCallback = new C15805a();
        this.peekHeight = 0;
        this.isHideable = false;
        this.state = 4;
        this.initialTopOffsetPercentage = -1.0f;
    }

    private void consumeInitialTopOffset() {
        int round;
        float f = this.initialTopOffsetPercentage;
        if (f != -1.0f && this.state != 6 && this.minOffset < (round = Math.round(f * ((float) this.parentHeight))) && round < this.maxOffset) {
            this.state = 6;
            this.lastKnownOffset = round;
        }
        this.initialTopOffsetPercentage = -1.0f;
    }

    /* access modifiers changed from: private */
    public void dispatchOnSlide(int i) {
        BottomSheetBehavior.C13920c cVar;
        View view = (View) this.viewRef.get();
        if (view != null && (cVar = this.callback) != null) {
            int i2 = this.maxOffset;
            if (i > i2) {
                cVar.onSlide(view, ((float) (i2 - i)) / ((float) this.peekHeight));
            } else {
                cVar.onSlide(view, ((float) (i2 - i)) / ((float) (i2 - this.minOffset)));
            }
        }
    }

    private static View findScrollingChild(View view) {
        if (view instanceof C6379o) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    private boolean fling(View view, float f) {
        MyBottomSheetBehavior<V>.C13555b bVar = this.flingRunnable;
        if (bVar != null) {
            bVar.f41168b.removeCallbacks(bVar);
            bVar.f41168b = null;
            this.flingRunnable = null;
        }
        int finalState = getFinalState(view, f);
        if (finalState != -1) {
            setState(finalState);
            return true;
        } else if (!this.scroller.computeScrollOffset()) {
            return false;
        } else {
            setStateInternal(2);
            MyBottomSheetBehavior<V>.C13555b bVar2 = new C15806b(view);
            this.flingRunnable = bVar2;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15053m(view, bVar2);
            return true;
        }
    }

    public static <V extends View> MyBottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0752e) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C0752e) layoutParams).f3269a;
            if (behavior instanceof MyBottomSheetBehavior) {
                return (MyBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: private */
    public int getFinalState(View view, float f) {
        int i;
        boolean z;
        if (this.scroller == null) {
            this.scroller = new OverScroller(view.getContext());
        }
        int top = view.getTop();
        int i2 = this.minOffset;
        if (this.isHideable) {
            i = this.parentHeight;
        } else {
            i = this.maxOffset;
        }
        float maxFlingVelocity2 = getMaxFlingVelocity(view.getContext());
        OverScroller overScroller = this.scroller;
        int i3 = C20936e0.f52684d;
        int i4 = top;
        overScroller.fling(0, i4, 0, Math.round(Math.max(-maxFlingVelocity2, Math.min(maxFlingVelocity2, f))), 0, 0, i2, i);
        int finalY = this.scroller.getFinalY();
        if (top >= finalY) {
            z = true;
        } else {
            z = false;
        }
        if (!this.isHideable || this.maxOffset > finalY || finalY > this.parentHeight) {
            return -1;
        }
        if (z) {
            return 4;
        }
        return 5;
    }

    private float getMaxFlingVelocity(Context context) {
        if (this.maxFlingVelocity == BitmapDescriptorFactory.HUE_RED) {
            this.maxFlingVelocity = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        }
        return this.maxFlingVelocity;
    }

    public static String name(int i) {
        switch (i) {
            case 1:
                return "STATE_DRAGGING";
            case 2:
                return "STATE_SETTLING";
            case 3:
                return "STATE_EXPANDED";
            case 4:
                return "STATE_COLLAPSED";
            case 5:
                return "STATE_HIDDEN";
            case 6:
                return "STATE_IDLE";
            default:
                return "";
        }
    }

    private void reset() {
        this.activePointerId = -1;
    }

    /* access modifiers changed from: private */
    public void setStateInternal(int i) {
        BottomSheetBehavior.C13920c cVar;
        if (this.state != i) {
            this.state = i;
            View view = (View) this.viewRef.get();
            if (view != null && (cVar = this.callback) != null) {
                cVar.onStateChanged(view, i);
            }
        }
    }

    public final int getPeekHeight() {
        return this.peekHeight;
    }

    public final int getState() {
        return this.state;
    }

    public boolean isHideable() {
        return this.isHideable;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            View view = this.nestedScrollingChildRef.get();
            if (view != null && coordinatorLayout.mo3306u(view, x, this.initialY)) {
                this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.isTouchingScrollingChild = true;
            }
            if (this.activePointerId != -1 || coordinatorLayout.mo3306u(v, x, this.initialY)) {
                z = false;
            } else {
                z = true;
            }
            this.ignoreEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.isTouchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && this.viewDragHelper.mo23431t(motionEvent)) {
            return true;
        }
        View view2 = this.nestedScrollingChildRef.get();
        if (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.mo3306u(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.f22199b)) {
            return false;
        }
        return true;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15042b(coordinatorLayout) && !C6333d0.C6337d.m15042b(v)) {
            v.setFitsSystemWindows(true);
        }
        coordinatorLayout.mo3309w(i, v);
        int height = coordinatorLayout.getHeight();
        this.parentHeight = height;
        int max = Math.max(0, height - v.getHeight());
        this.minOffset = max;
        this.maxOffset = Math.max(this.parentHeight - this.peekHeight, max);
        int i2 = this.lastKnownOffset;
        consumeInitialTopOffset();
        int i3 = this.state;
        if (i3 == 3) {
            C6333d0.m15023k(this.minOffset, v);
        } else if (this.isHideable && i3 == 5) {
            C6333d0.m15023k(this.parentHeight, v);
        } else if (i3 == 4) {
            C6333d0.m15023k(this.maxOffset, v);
        } else if (i3 == 6) {
            C6333d0.m15023k(this.lastKnownOffset, v);
        } else if (i3 == 1 || i3 == 2) {
            C6333d0.m15023k(i2, v);
        }
        this.lastKnownOffset = v.getTop();
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new C7148c(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        this.viewRef = new WeakReference<>(v);
        if (!this.nestedScrollingChildManuallySet) {
            this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        }
        if (this.state == 6 && i2 != this.lastKnownOffset) {
            dispatchOnSlide(v.getTop());
        }
        return true;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != this.nestedScrollingChildRef.get() || this.state == 3) {
            return super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        this.isNestedFling = fling(v, -f2);
        return true;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.nestedScrollingChildRef.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.minOffset;
                if (i3 < i4) {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    C6333d0.m15023k(-i5, v);
                    setStateInternal(3);
                } else {
                    iArr[1] = i2;
                    C6333d0.m15023k(-i2, v);
                    setStateInternal(1);
                }
            } else if (i2 < 0) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!view.canScrollVertically(-1)) {
                    int i6 = this.maxOffset;
                    if (i3 <= i6 || this.isHideable) {
                        iArr[1] = i2;
                        C6333d0.m15023k(-i2, v);
                        setStateInternal(1);
                    } else {
                        int i7 = top - i6;
                        iArr[1] = i7;
                        C6333d0.m15023k(-i7, v);
                        setStateInternal(4);
                    }
                }
            }
            int top2 = v.getTop();
            this.lastKnownOffset = top2;
            dispatchOnSlide(top2);
            this.isNestedScrolled = true;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.f41165b;
        if (i == 1 || i == 2) {
            this.state = 4;
        } else {
            this.state = i;
        }
        this.lastKnownOffset = savedState.f41166c;
        this.initialTopOffsetPercentage = -1.0f;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.state, this.lastKnownOffset);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.isNestedScrolled = false;
        this.isNestedFling = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        int top = v.getTop();
        if (top == this.minOffset) {
            setStateInternal(3);
        } else if (top == this.maxOffset) {
            setStateInternal(4);
        } else if (top == this.parentHeight) {
            setStateInternal(5);
        } else if (view == this.nestedScrollingChildRef.get() && this.isNestedScrolled && !this.isNestedFling) {
            if (!this.isHideable || this.maxOffset >= top) {
                setStateInternal(6);
            } else {
                setState(5);
            }
            this.isNestedScrolled = false;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        C7148c cVar = this.viewDragHelper;
        if (cVar != null) {
            cVar.mo23424m(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(((float) this.initialY) - motionEvent.getY());
            C7148c cVar2 = this.viewDragHelper;
            if (abs > ((float) cVar2.f22199b)) {
                cVar2.mo23416c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.ignoreEvents;
    }

    public void setBottomSheetCallback(BottomSheetBehavior.C13920c cVar) {
        this.callback = cVar;
    }

    public void setHideable(boolean z) {
        this.isHideable = z;
    }

    public void setNestedScrollingChildView(View view) {
        this.nestedScrollingChildRef = new WeakReference<>(view);
        this.nestedScrollingChildManuallySet = true;
    }

    public final void setPeekHeight(int i) {
        this.peekHeight = Math.max(0, i);
        this.maxOffset = this.parentHeight - i;
    }

    public final void setState(int i) {
        int i2;
        if (i != this.state) {
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    if (i == 4) {
                        i2 = this.maxOffset;
                    } else if (i == 3) {
                        i2 = this.minOffset;
                    } else if (!this.isHideable || i != 5) {
                        throw new IllegalArgumentException(C16759e.m42349e("Illegal state argument: ", i));
                    } else {
                        i2 = this.parentHeight;
                    }
                    setStateInternal(2);
                    if (this.viewDragHelper.mo23432u(view, view.getLeft(), i2)) {
                        C15807c cVar = new C15807c(view, i);
                        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                        C6333d0.C6337d.m15053m(view, cVar);
                    }
                }
            } else if (i == 4 || i == 3 || (this.isHideable && i == 5)) {
                this.state = i;
            }
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15804a();

        /* renamed from: b */
        public final int f41165b;

        /* renamed from: c */
        public final int f41166c;

        /* renamed from: com.moovit.commons.view.behavior.MyBottomSheetBehavior$SavedState$a */
        public class C15804a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f41165b = parcel.readInt();
            this.f41166c = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f41165b);
            parcel.writeInt(this.f41166c);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f41165b = i;
            this.f41166c = i2;
        }
    }

    public MyBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxFlingVelocity = BitmapDescriptorFactory.HUE_RED;
        this.nestedScrollingChildManuallySet = false;
        this.dragCallback = new C15805a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18165g.MyBottomSheetBehavior_Params);
        try {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(C18165g.MyBottomSheetBehavior_Params_behavior_peekHeight, 0));
            setHideable(obtainStyledAttributes.getBoolean(C18165g.MyBottomSheetBehavior_Params_behavior_hideable, false));
            int i = obtainStyledAttributes.getInt(C18165g.MyBottomSheetBehavior_Params_behavior_state, 4);
            this.state = i;
            if (!this.isHideable && i == 5) {
                this.state = 4;
            }
            this.initialTopOffsetPercentage = obtainStyledAttributes.getFloat(C18165g.MyBottomSheetBehavior_Params_behavior_initialTopOffsetPercentage, -1.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
