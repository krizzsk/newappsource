package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.widget.C0789d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p055d1.C4325a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6379o;
import p242s1.C6381p;
import p242s1.C6382p0;
import p242s1.C6387r;
import p242s1.C6389s;
import p255t1.C6531g;
import p255t1.C6539i;
import p358af.C13437d;

public class NestedScrollView extends FrameLayout implements C6387r, C6379o {

    /* renamed from: C */
    public static final float f3360C = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: D */
    public static final C0779a f3361D = new C0779a();

    /* renamed from: E */
    public static final int[] f3362E = {16843130};

    /* renamed from: A */
    public float f3363A;

    /* renamed from: B */
    public C0781c f3364B;

    /* renamed from: b */
    public final float f3365b;

    /* renamed from: c */
    public long f3366c;

    /* renamed from: d */
    public final Rect f3367d;

    /* renamed from: e */
    public OverScroller f3368e;

    /* renamed from: f */
    public EdgeEffect f3369f;

    /* renamed from: g */
    public EdgeEffect f3370g;

    /* renamed from: h */
    public int f3371h;

    /* renamed from: i */
    public boolean f3372i;

    /* renamed from: j */
    public boolean f3373j;

    /* renamed from: k */
    public View f3374k;

    /* renamed from: l */
    public boolean f3375l;

    /* renamed from: m */
    public VelocityTracker f3376m;

    /* renamed from: n */
    public boolean f3377n;

    /* renamed from: o */
    public boolean f3378o;

    /* renamed from: p */
    public int f3379p;

    /* renamed from: q */
    public int f3380q;

    /* renamed from: r */
    public int f3381r;

    /* renamed from: s */
    public int f3382s;

    /* renamed from: t */
    public final int[] f3383t;

    /* renamed from: u */
    public final int[] f3384u;

    /* renamed from: v */
    public int f3385v;

    /* renamed from: w */
    public int f3386w;

    /* renamed from: x */
    public SavedState f3387x;

    /* renamed from: y */
    public final C6389s f3388y;

    /* renamed from: z */
    public final C6381p f3389z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0778a();

        /* renamed from: b */
        public int f3390b;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C0778a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("HorizontalScrollView.SavedState{");
            k.append(Integer.toHexString(System.identityHashCode(this)));
            k.append(" scrollPosition=");
            return C13437d.m33707l(k, this.f3390b, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3390b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3390b = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0779a extends C6315a {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C6539i.m15473c(accessibilityEvent, nestedScrollView.getScrollX());
            C6539i.m15474d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            gVar.mo22644i(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                gVar.mo22648m(true);
                if (nestedScrollView.getScrollY() > 0) {
                    gVar.mo22635b(C6531g.C6532a.f20341i);
                    gVar.mo22635b(C6531g.C6532a.f20345m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    gVar.mo22635b(C6531g.C6532a.f20340h);
                    gVar.mo22635b(C6531g.C6532a.f20346n);
                }
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo3508v(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo3508v(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C0780b {
        /* renamed from: a */
        public static boolean m2381a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C0781c {
        /* renamed from: a */
        void mo940a(NestedScrollView nestedScrollView, int i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4325a.nestedScrollViewStyle);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3363A == BitmapDescriptorFactory.HUE_RED) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3363A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3363A;
    }

    /* renamed from: l */
    public static boolean m2359l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m2359l((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final boolean mo3443b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo3469m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo3452d(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3367d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3367d);
            mo3452d(mo3444c(this.f3367d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!mo3469m(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(SQLiteDatabase.OPEN_SHAREDCACHE);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: c */
    public final int mo3444c(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r18 = this;
            r0 = r18
            android.widget.OverScroller r1 = r0.f3368e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            android.widget.OverScroller r1 = r0.f3368e
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r0.f3368e
            int r1 = r1.getCurrY()
            int r2 = r0.f3386w
            int r2 = r1 - r2
            int r3 = r18.getHeight()
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 1082130432(0x40800000, float:4.0)
            if (r2 <= 0) goto L_0x004c
            android.widget.EdgeEffect r7 = r0.f3369f
            float r7 = androidx.core.widget.C0789d.m2395a(r7)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x004c
            int r5 = -r2
            float r5 = (float) r5
            float r5 = r5 * r6
            float r7 = (float) r3
            float r5 = r5 / r7
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 / r6
            android.widget.EdgeEffect r6 = r0.f3369f
            float r4 = androidx.core.widget.C0789d.m2396b(r6, r5, r4)
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            if (r3 == r2) goto L_0x0071
            android.widget.EdgeEffect r4 = r0.f3369f
            r4.finish()
            goto L_0x0071
        L_0x004c:
            if (r2 >= 0) goto L_0x0072
            android.widget.EdgeEffect r7 = r0.f3370g
            float r7 = androidx.core.widget.C0789d.m2395a(r7)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0072
            float r5 = (float) r2
            float r5 = r5 * r6
            float r3 = (float) r3
            float r5 = r5 / r3
            float r3 = r3 / r6
            android.widget.EdgeEffect r6 = r0.f3370g
            float r4 = androidx.core.widget.C0789d.m2396b(r6, r5, r4)
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            if (r3 == r2) goto L_0x0071
            android.widget.EdgeEffect r4 = r0.f3370g
            r4.finish()
        L_0x0071:
            int r2 = r2 - r3
        L_0x0072:
            r0.f3386w = r1
            int[] r7 = r0.f3384u
            r1 = 0
            r9 = 1
            r7[r9] = r1
            r4 = 0
            r8 = 0
            r6 = 1
            s1.p r3 = r0.f3389z
            r5 = r2
            r3.mo22485c(r4, r5, r6, r7, r8)
            int[] r3 = r0.f3384u
            r3 = r3[r9]
            int r2 = r2 - r3
            int r3 = r18.getScrollRange()
            if (r2 == 0) goto L_0x00b7
            int r4 = r18.getScrollY()
            int r5 = r18.getScrollX()
            r0.mo3497s(r2, r5, r4, r3)
            int r5 = r18.getScrollY()
            int r12 = r5 - r4
            int r2 = r2 - r12
            int[] r4 = r0.f3384u
            r4[r9] = r1
            int[] r15 = r0.f3383t
            r16 = 1
            s1.p r10 = r0.f3389z
            r11 = 0
            r13 = 0
            r14 = r2
            r17 = r4
            r10.mo22487e(r11, r12, r13, r14, r15, r16, r17)
            int[] r4 = r0.f3384u
            r4 = r4[r9]
            int r2 = r2 - r4
        L_0x00b7:
            if (r2 == 0) goto L_0x00f9
            int r4 = r18.getOverScrollMode()
            if (r4 == 0) goto L_0x00c3
            if (r4 != r9) goto L_0x00c4
            if (r3 <= 0) goto L_0x00c4
        L_0x00c3:
            r1 = 1
        L_0x00c4:
            if (r1 == 0) goto L_0x00f1
            if (r2 >= 0) goto L_0x00dd
            android.widget.EdgeEffect r1 = r0.f3369f
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00f1
            android.widget.EdgeEffect r1 = r0.f3369f
            android.widget.OverScroller r2 = r0.f3368e
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
            goto L_0x00f1
        L_0x00dd:
            android.widget.EdgeEffect r1 = r0.f3370g
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00f1
            android.widget.EdgeEffect r1 = r0.f3370g
            android.widget.OverScroller r2 = r0.f3368e
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
        L_0x00f1:
            android.widget.OverScroller r1 = r0.f3368e
            r1.abortAnimation()
            r0.mo3510x(r9)
        L_0x00f9:
            android.widget.OverScroller r1 = r0.f3368e
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0107
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15051k(r18)
            goto L_0x010a
        L_0x0107:
            r0.mo3510x(r9)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* renamed from: d */
    public final void mo3452d(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3378o) {
            mo3508v(0, i, false);
        } else {
            scrollBy(0, i);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3459e(keyEvent);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3389z.mo22483a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3389z.mo22484b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3389z.mo22485c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3389z.mo22487e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f3369f.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C0780b.m2381a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C0780b.m2381a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f3369f.setSize(width, height);
            if (this.f3369f.draw(canvas)) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15051k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f3370g.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C0780b.m2381a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (C0780b.m2381a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, BitmapDescriptorFactory.HUE_RED);
            this.f3370g.setSize(width2, height2);
            if (this.f3370g.draw(canvas)) {
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6337d.m15051k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3459e(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f3367d
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fc
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ed
            r4 = 20
            if (r0 == r4) goto L_0x00dd
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fc
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00c1
            android.graphics.Rect r7 = r6.f3367d
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d2
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f3367d
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d2
            int r1 = r1 - r0
            r7.top = r1
            goto L_0x00d2
        L_0x00c1:
            android.graphics.Rect r7 = r6.f3367d
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f3367d
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d2
            r7.top = r2
        L_0x00d2:
            android.graphics.Rect r7 = r6.f3367d
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.mo3506t(r5, r1, r0)
            goto L_0x00fc
        L_0x00dd:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e8
            boolean r2 = r6.mo3443b(r3)
            goto L_0x00fc
        L_0x00e8:
            boolean r2 = r6.mo3461g(r3)
            goto L_0x00fc
        L_0x00ed:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f8
            boolean r2 = r6.mo3443b(r5)
            goto L_0x00fc
        L_0x00f8:
            boolean r2 = r6.mo3461g(r5)
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3459e(android.view.KeyEvent):boolean");
    }

    /* renamed from: f */
    public final void mo3460f(int i) {
        if (getChildCount() > 0) {
            this.f3368e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f3389z.mo22489g(2, 1);
            this.f3386w = getScrollY();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    /* renamed from: g */
    public final boolean mo3461g(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f3367d;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3367d.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f3367d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3367d;
        return mo3506t(i, rect3.top, rect3.bottom);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C6389s sVar = this.f3388y;
        return sVar.f20042b | sVar.f20041a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final boolean hasNestedScrollingParent() {
        if (this.f3389z.mo22488f(0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo1280i(int i, View view) {
        C6389s sVar = this.f3388y;
        if (i == 1) {
            sVar.f20042b = 0;
        } else {
            sVar.f20041a = 0;
        }
        mo3510x(i);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f3389z.f20038d;
    }

    /* renamed from: j */
    public final void mo1281j(View view, View view2, int i, int i2) {
        C6389s sVar = this.f3388y;
        if (i2 == 1) {
            sVar.f20042b = i;
        } else {
            sVar.f20041a = i;
        }
        this.f3389z.mo22489g(2, i2);
    }

    /* renamed from: k */
    public final void mo1282k(View view, int i, int i2, int[] iArr, int i3) {
        this.f3389z.mo22485c(i, i2, i3, iArr, (int[]) null);
    }

    /* renamed from: m */
    public final boolean mo3469m(View view, int i, int i2) {
        view.getDrawingRect(this.f3367d);
        offsetDescendantRectToMyCoords(view, this.f3367d);
        if (this.f3367d.bottom + i < getScrollY() || this.f3367d.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void mo1284n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo3491q(iArr, i4, i5);
    }

    /* renamed from: o */
    public final void mo1285o(View view, int i, int i2, int i3, int i4, int i5) {
        mo3491q((int[]) null, i4, i5);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3373j = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00c7
            boolean r0 = r8.f3375l
            if (r0 != 0) goto L_0x00c7
            r0 = 2
            boolean r0 = com.google.android.play.core.assetpacks.C14256d1.m35490h(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = com.google.android.play.core.assetpacks.C14256d1.m35490h(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00c7
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x0080
            int r2 = r8.getOverScrollMode()
            if (r2 == 0) goto L_0x0059
            if (r2 != r6) goto L_0x0057
            int r2 = r8.getScrollRange()
            if (r2 <= 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = 0
            goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            if (r2 == 0) goto L_0x0064
            boolean r9 = com.google.android.play.core.assetpacks.C14256d1.m35490h(r9, r5)
            if (r9 != 0) goto L_0x0064
            r9 = 1
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            if (r9 == 0) goto L_0x007e
            android.widget.EdgeEffect r9 = r8.f3369f
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.C0789d.m2396b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f3369f
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x00bc
        L_0x007e:
            r0 = 0
            goto L_0x00ba
        L_0x0080:
            if (r0 <= r2) goto L_0x00ba
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L_0x0093
            if (r7 != r6) goto L_0x0091
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r7 = 0
            goto L_0x0094
        L_0x0093:
            r7 = 1
        L_0x0094:
            if (r7 == 0) goto L_0x009e
            boolean r9 = com.google.android.play.core.assetpacks.C14256d1.m35490h(r9, r5)
            if (r9 != 0) goto L_0x009e
            r9 = 1
            goto L_0x009f
        L_0x009e:
            r9 = 0
        L_0x009f:
            if (r9 == 0) goto L_0x00b7
            android.widget.EdgeEffect r9 = r8.f3370g
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.C0789d.m2396b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f3370g
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L_0x00b7:
            r9 = r1
            r1 = r2
            goto L_0x00bc
        L_0x00ba:
            r1 = r0
            r9 = 0
        L_0x00bc:
            if (r1 == r3) goto L_0x00c6
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00c6:
            return r9
        L_0x00c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r12.f3375l
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0099
            r5 = -1
            if (r0 == r1) goto L_0x006b
            if (r0 == r2) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0123
        L_0x0020:
            r12.mo3492r(r13)
            goto L_0x0123
        L_0x0025:
            int r0 = r12.f3382s
            if (r0 != r5) goto L_0x002b
            goto L_0x0123
        L_0x002b:
            int r0 = r13.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0033
            goto L_0x0123
        L_0x0033:
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            int r3 = r12.f3371h
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f3379p
            if (r3 <= r5) goto L_0x0123
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0123
            r12.f3375l = r1
            r12.f3371h = r0
            android.view.VelocityTracker r0 = r12.f3376m
            if (r0 != 0) goto L_0x0059
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f3376m = r0
        L_0x0059:
            android.view.VelocityTracker r0 = r12.f3376m
            r0.addMovement(r13)
            r12.f3385v = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0123
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0123
        L_0x006b:
            r12.f3375l = r4
            r12.f3382s = r5
            android.view.VelocityTracker r13 = r12.f3376m
            if (r13 == 0) goto L_0x0078
            r13.recycle()
            r12.f3376m = r3
        L_0x0078:
            android.widget.OverScroller r5 = r12.f3368e
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0094
            java.util.WeakHashMap<android.view.View, s1.p0> r13 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15051k(r12)
        L_0x0094:
            r12.mo3510x(r4)
            goto L_0x0123
        L_0x0099:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00cd
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00cd
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00cd
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00cd
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00cd
            r5 = 1
            goto L_0x00ce
        L_0x00cd:
            r5 = 0
        L_0x00ce:
            if (r5 != 0) goto L_0x00ec
            boolean r13 = r12.mo3509w(r13)
            if (r13 != 0) goto L_0x00e0
            android.widget.OverScroller r13 = r12.f3368e
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r1 = 0
        L_0x00e0:
            r12.f3375l = r1
            android.view.VelocityTracker r13 = r12.f3376m
            if (r13 == 0) goto L_0x0123
            r13.recycle()
            r12.f3376m = r3
            goto L_0x0123
        L_0x00ec:
            r12.f3371h = r0
            int r0 = r13.getPointerId(r4)
            r12.f3382s = r0
            android.view.VelocityTracker r0 = r12.f3376m
            if (r0 != 0) goto L_0x00ff
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f3376m = r0
            goto L_0x0102
        L_0x00ff:
            r0.clear()
        L_0x0102:
            android.view.VelocityTracker r0 = r12.f3376m
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f3368e
            r0.computeScrollOffset()
            boolean r13 = r12.mo3509w(r13)
            if (r13 != 0) goto L_0x011c
            android.widget.OverScroller r13 = r12.f3368e
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            r12.f3375l = r1
            s1.p r13 = r12.f3389z
            r13.mo22489g(r2, r4)
        L_0x0123:
            boolean r13 = r12.f3375l
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f3372i = false;
        View view = this.f3374k;
        if (view != null && m2359l(view, this)) {
            View view2 = this.f3374k;
            view2.getDrawingRect(this.f3367d);
            offsetDescendantRectToMyCoords(view2, this.f3367d);
            int c = mo3444c(this.f3367d);
            if (c != 0) {
                scrollBy(0, c);
            }
        }
        this.f3374k = null;
        if (!this.f3373j) {
            if (this.f3387x != null) {
                scrollTo(getScrollX(), this.f3387x.f3390b);
                this.f3387x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3373j = true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3377n && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f2, true);
        mo3460f((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1282k(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo3491q((int[]) null, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1281j(view, view2, i, 0);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !(true ^ mo3469m(view, 0, getHeight()))) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3387x = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3390b = getScrollY();
        return savedState;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0781c cVar = this.f3364B;
        if (cVar != null) {
            cVar.mo940a(this, i2);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo3469m(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3367d);
            offsetDescendantRectToMyCoords(findFocus, this.f3367d);
            mo3452d(mo3444c(this.f3367d));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1300p(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo1280i(0, view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            android.view.VelocityTracker r2 = r0.f3376m
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f3376m = r2
        L_0x000e:
            int r2 = r22.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r0.f3385v = r3
        L_0x0017:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r22)
            int r5 = r0.f3385v
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            r5 = 2
            r7 = 1
            if (r2 == 0) goto L_0x02d9
            r8 = -1
            r9 = 0
            if (r2 == r7) goto L_0x023c
            if (r2 == r5) goto L_0x009e
            r5 = 3
            if (r2 == r5) goto L_0x005c
            r3 = 5
            if (r2 == r3) goto L_0x0049
            r3 = 6
            if (r2 == r3) goto L_0x0037
            goto L_0x030f
        L_0x0037:
            r21.mo3492r(r22)
            int r2 = r0.f3382s
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.f3371h = r1
            goto L_0x030f
        L_0x0049:
            int r2 = r22.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.f3371h = r3
            int r1 = r1.getPointerId(r2)
            r0.f3382s = r1
            goto L_0x030f
        L_0x005c:
            boolean r1 = r0.f3375l
            if (r1 == 0) goto L_0x0082
            int r1 = r21.getChildCount()
            if (r1 <= 0) goto L_0x0082
            android.widget.OverScroller r10 = r0.f3368e
            int r11 = r21.getScrollX()
            int r12 = r21.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r21.getScrollRange()
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0082
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15051k(r21)
        L_0x0082:
            r0.f3382s = r8
            r0.f3375l = r3
            android.view.VelocityTracker r1 = r0.f3376m
            if (r1 == 0) goto L_0x008f
            r1.recycle()
            r0.f3376m = r9
        L_0x008f:
            r0.mo3510x(r3)
            android.widget.EdgeEffect r1 = r0.f3369f
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f3370g
            r1.onRelease()
            goto L_0x030f
        L_0x009e:
            int r2 = r0.f3382s
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r8) goto L_0x00a8
            goto L_0x030f
        L_0x00a8:
            float r5 = r1.getY(r2)
            int r5 = (int) r5
            int r8 = r0.f3371h
            int r8 = r8 - r5
            float r9 = r1.getX(r2)
            int r10 = r21.getWidth()
            float r10 = (float) r10
            float r9 = r9 / r10
            float r10 = (float) r8
            int r11 = r21.getHeight()
            float r11 = (float) r11
            float r10 = r10 / r11
            android.widget.EdgeEffect r11 = r0.f3369f
            float r11 = androidx.core.widget.C0789d.m2395a(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00e6
            android.widget.EdgeEffect r11 = r0.f3369f
            float r10 = -r10
            float r9 = androidx.core.widget.C0789d.m2396b(r11, r10, r9)
            float r9 = -r9
            android.widget.EdgeEffect r10 = r0.f3369f
            float r10 = androidx.core.widget.C0789d.m2395a(r10)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00e4
            android.widget.EdgeEffect r6 = r0.f3369f
            r6.onRelease()
        L_0x00e4:
            r6 = r9
            goto L_0x0108
        L_0x00e6:
            android.widget.EdgeEffect r11 = r0.f3370g
            float r11 = androidx.core.widget.C0789d.m2395a(r11)
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0108
            android.widget.EdgeEffect r11 = r0.f3370g
            float r9 = r12 - r9
            float r9 = androidx.core.widget.C0789d.m2396b(r11, r10, r9)
            android.widget.EdgeEffect r10 = r0.f3370g
            float r10 = androidx.core.widget.C0789d.m2395a(r10)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00e4
            android.widget.EdgeEffect r6 = r0.f3370g
            r6.onRelease()
            goto L_0x00e4
        L_0x0108:
            int r9 = r21.getHeight()
            float r9 = (float) r9
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L_0x0118
            r21.invalidate()
        L_0x0118:
            int r8 = r8 - r6
            boolean r6 = r0.f3375l
            if (r6 != 0) goto L_0x0139
            int r6 = java.lang.Math.abs(r8)
            int r9 = r0.f3379p
            if (r6 <= r9) goto L_0x0139
            android.view.ViewParent r6 = r21.getParent()
            if (r6 == 0) goto L_0x012e
            r6.requestDisallowInterceptTouchEvent(r7)
        L_0x012e:
            r0.f3375l = r7
            if (r8 <= 0) goto L_0x0136
            int r6 = r0.f3379p
            int r8 = r8 - r6
            goto L_0x0139
        L_0x0136:
            int r6 = r0.f3379p
            int r8 = r8 + r6
        L_0x0139:
            boolean r6 = r0.f3375l
            if (r6 == 0) goto L_0x030f
            r14 = 0
            int[] r6 = r0.f3384u
            int[] r9 = r0.f3383t
            r16 = 0
            s1.p r13 = r0.f3389z
            r15 = r8
            r17 = r6
            r18 = r9
            boolean r6 = r13.mo22485c(r14, r15, r16, r17, r18)
            if (r6 == 0) goto L_0x015f
            int[] r6 = r0.f3384u
            r6 = r6[r7]
            int r8 = r8 - r6
            int r6 = r0.f3385v
            int[] r9 = r0.f3383t
            r9 = r9[r7]
            int r6 = r6 + r9
            r0.f3385v = r6
        L_0x015f:
            int[] r6 = r0.f3383t
            r6 = r6[r7]
            int r5 = r5 - r6
            r0.f3371h = r5
            int r5 = r21.getScrollY()
            int r6 = r21.getScrollRange()
            int r9 = r21.getOverScrollMode()
            if (r9 == 0) goto L_0x017b
            if (r9 != r7) goto L_0x0179
            if (r6 <= 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r9 = 0
            goto L_0x017c
        L_0x017b:
            r9 = 1
        L_0x017c:
            int r10 = r21.getScrollY()
            boolean r10 = r0.mo3497s(r8, r3, r10, r6)
            if (r10 == 0) goto L_0x0195
            s1.p r10 = r0.f3389z
            android.view.ViewParent r10 = r10.mo22488f(r3)
            if (r10 == 0) goto L_0x0190
            r10 = 1
            goto L_0x0191
        L_0x0190:
            r10 = 0
        L_0x0191:
            if (r10 != 0) goto L_0x0195
            r10 = 1
            goto L_0x0196
        L_0x0195:
            r10 = 0
        L_0x0196:
            int r11 = r21.getScrollY()
            int r15 = r11 - r5
            int r17 = r8 - r15
            int[] r11 = r0.f3384u
            r11[r7] = r3
            int[] r14 = r0.f3383t
            r19 = 0
            s1.p r13 = r0.f3389z
            r16 = 0
            r18 = 0
            r20 = r14
            r14 = r16
            r16 = r18
            r18 = r20
            r20 = r11
            r13.mo22487e(r14, r15, r16, r17, r18, r19, r20)
            int r11 = r0.f3371h
            int[] r13 = r0.f3383t
            r13 = r13[r7]
            int r11 = r11 - r13
            r0.f3371h = r11
            int r11 = r0.f3385v
            int r11 = r11 + r13
            r0.f3385v = r11
            if (r9 == 0) goto L_0x0232
            int[] r9 = r0.f3384u
            r9 = r9[r7]
            int r8 = r8 - r9
            int r5 = r5 + r8
            if (r5 >= 0) goto L_0x01f6
            android.widget.EdgeEffect r5 = r0.f3369f
            int r6 = -r8
            float r6 = (float) r6
            int r8 = r21.getHeight()
            float r8 = (float) r8
            float r6 = r6 / r8
            float r1 = r1.getX(r2)
            int r2 = r21.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            androidx.core.widget.C0789d.m2396b(r5, r6, r1)
            android.widget.EdgeEffect r1 = r0.f3370g
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x021c
            android.widget.EdgeEffect r1 = r0.f3370g
            r1.onRelease()
            goto L_0x021c
        L_0x01f6:
            if (r5 <= r6) goto L_0x021c
            android.widget.EdgeEffect r5 = r0.f3370g
            float r6 = (float) r8
            int r8 = r21.getHeight()
            float r8 = (float) r8
            float r6 = r6 / r8
            float r1 = r1.getX(r2)
            int r2 = r21.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r12 = r12 - r1
            androidx.core.widget.C0789d.m2396b(r5, r6, r12)
            android.widget.EdgeEffect r1 = r0.f3369f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x021c
            android.widget.EdgeEffect r1 = r0.f3369f
            r1.onRelease()
        L_0x021c:
            android.widget.EdgeEffect r1 = r0.f3369f
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x022c
            android.widget.EdgeEffect r1 = r0.f3370g
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0232
        L_0x022c:
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15051k(r21)
            goto L_0x0233
        L_0x0232:
            r3 = r10
        L_0x0233:
            if (r3 == 0) goto L_0x030f
            android.view.VelocityTracker r1 = r0.f3376m
            r1.clear()
            goto L_0x030f
        L_0x023c:
            android.view.VelocityTracker r1 = r0.f3376m
            r2 = 1000(0x3e8, float:1.401E-42)
            int r5 = r0.f3381r
            float r5 = (float) r5
            r1.computeCurrentVelocity(r2, r5)
            int r2 = r0.f3382s
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r5 = r0.f3380q
            if (r2 < r5) goto L_0x02a2
            android.widget.EdgeEffect r2 = r0.f3369f
            float r2 = androidx.core.widget.C0789d.m2395a(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0272
            android.widget.EdgeEffect r2 = r0.f3369f
            boolean r2 = r0.mo3507u(r2, r1)
            if (r2 == 0) goto L_0x026d
            android.widget.EdgeEffect r2 = r0.f3369f
            r2.onAbsorb(r1)
            goto L_0x028e
        L_0x026d:
            int r2 = -r1
            r0.mo3460f(r2)
            goto L_0x028e
        L_0x0272:
            android.widget.EdgeEffect r2 = r0.f3370g
            float r2 = androidx.core.widget.C0789d.m2395a(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0290
            android.widget.EdgeEffect r2 = r0.f3370g
            int r5 = -r1
            boolean r2 = r0.mo3507u(r2, r5)
            if (r2 == 0) goto L_0x028b
            android.widget.EdgeEffect r2 = r0.f3370g
            r2.onAbsorb(r5)
            goto L_0x028e
        L_0x028b:
            r0.mo3460f(r5)
        L_0x028e:
            r2 = 1
            goto L_0x0291
        L_0x0290:
            r2 = 0
        L_0x0291:
            if (r2 != 0) goto L_0x02be
            int r1 = -r1
            float r2 = (float) r1
            boolean r5 = r0.dispatchNestedPreFling(r6, r2)
            if (r5 != 0) goto L_0x02be
            r0.dispatchNestedFling(r6, r2, r7)
            r0.mo3460f(r1)
            goto L_0x02be
        L_0x02a2:
            android.widget.OverScroller r10 = r0.f3368e
            int r11 = r21.getScrollX()
            int r12 = r21.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r21.getScrollRange()
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x02be
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15051k(r21)
        L_0x02be:
            r0.f3382s = r8
            r0.f3375l = r3
            android.view.VelocityTracker r1 = r0.f3376m
            if (r1 == 0) goto L_0x02cb
            r1.recycle()
            r0.f3376m = r9
        L_0x02cb:
            r0.mo3510x(r3)
            android.widget.EdgeEffect r1 = r0.f3369f
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f3370g
            r1.onRelease()
            goto L_0x030f
        L_0x02d9:
            int r2 = r21.getChildCount()
            if (r2 != 0) goto L_0x02e0
            return r3
        L_0x02e0:
            boolean r2 = r0.f3375l
            if (r2 == 0) goto L_0x02ed
            android.view.ViewParent r2 = r21.getParent()
            if (r2 == 0) goto L_0x02ed
            r2.requestDisallowInterceptTouchEvent(r7)
        L_0x02ed:
            android.widget.OverScroller r2 = r0.f3368e
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x02fd
            android.widget.OverScroller r2 = r0.f3368e
            r2.abortAnimation()
            r0.mo3510x(r7)
        L_0x02fd:
            float r2 = r22.getY()
            int r2 = (int) r2
            r0.f3371h = r2
            int r1 = r1.getPointerId(r3)
            r0.f3382s = r1
            s1.p r1 = r0.f3389z
            r1.mo22489g(r5, r3)
        L_0x030f:
            android.view.VelocityTracker r1 = r0.f3376m
            if (r1 == 0) goto L_0x0316
            r1.addMovement(r4)
        L_0x0316:
            r4.recycle()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean mo1300p(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: q */
    public final void mo3491q(int[] iArr, int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3389z.mo22487e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: r */
    public final void mo3492r(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3382s) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3371h = (int) motionEvent.getY(i);
            this.f3382s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3376m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f3372i) {
            view2.getDrawingRect(this.f3367d);
            offsetDescendantRectToMyCoords(view2, this.f3367d);
            int c = mo3444c(this.f3367d);
            if (c != 0) {
                scrollBy(0, c);
            }
        } else {
            this.f3374k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c = mo3444c(rect);
        if (c != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, c);
            } else {
                mo3508v(0, c, false);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f3376m) != null) {
            velocityTracker.recycle();
            this.f3376m = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f3372i = true;
        super.requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3497s(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            if (r11 >= 0) goto L_0x001d
        L_0x001a:
            r10 = 1
            r11 = 0
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r12 <= r13) goto L_0x0022
            r12 = r13
            goto L_0x0025
        L_0x0022:
            if (r12 >= 0) goto L_0x0027
            r12 = 0
        L_0x0025:
            r13 = 1
            goto L_0x0028
        L_0x0027:
            r13 = 0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            s1.p r2 = r9.f3389z
            android.view.ViewParent r2 = r2.mo22488f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f3368e
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3497s(int, int, int, int):boolean");
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3377n) {
            this.f3377n = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C6381p pVar = this.f3389z;
        if (pVar.f20038d) {
            View view = pVar.f20037c;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15109z(view);
        }
        pVar.f20038d = z;
    }

    public void setOnScrollChangeListener(C0781c cVar) {
        this.f3364B = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3378o = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.f3389z.mo22489g(i, 0);
    }

    public final void stopNestedScroll() {
        mo3510x(0);
    }

    /* renamed from: t */
    public final boolean mo3506t(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        if (i5 == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                if (i6 >= top || bottom >= i7) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            if (z) {
                i4 = i6 - scrollY;
            } else {
                i4 = i7 - i8;
            }
            mo3452d(i4);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z2;
    }

    /* renamed from: u */
    public final boolean mo3507u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float a = C0789d.m2395a(edgeEffect) * ((float) getHeight());
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / (this.f3365b * 0.015f)));
        double d = (double) f3360C;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) (this.f3365b * 0.015f)))) < a) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void mo3508v(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3366c > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3368e;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z) {
                    this.f3389z.mo22489g(2, 1);
                } else {
                    mo3510x(1);
                }
                this.f3386w = getScrollY();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15051k(this);
            } else {
                if (!this.f3368e.isFinished()) {
                    this.f3368e.abortAnimation();
                    mo3510x(1);
                }
                scrollBy(i, i2);
            }
            this.f3366c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: w */
    public final boolean mo3509w(MotionEvent motionEvent) {
        boolean z;
        if (C0789d.m2395a(this.f3369f) != BitmapDescriptorFactory.HUE_RED) {
            C0789d.m2396b(this.f3369f, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (C0789d.m2395a(this.f3370g) == BitmapDescriptorFactory.HUE_RED) {
            return z;
        }
        C0789d.m2396b(this.f3370g, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: x */
    public final void mo3510x(int i) {
        this.f3389z.mo22490h(i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f3367d = new Rect();
        this.f3372i = true;
        this.f3373j = false;
        this.f3374k = null;
        this.f3375l = false;
        this.f3378o = true;
        this.f3382s = -1;
        this.f3383t = new int[2];
        this.f3384u = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C0789d.C0791b.m2398a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f3369f = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C0789d.C0791b.m2398a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f3370g = edgeEffect2;
        this.f3365b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3368e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3379p = viewConfiguration.getScaledTouchSlop();
        this.f3380q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3381r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3362E, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3388y = new C6389s();
        this.f3389z = new C6381p(this);
        setNestedScrollingEnabled(true);
        C6333d0.m15029q(this, f3361D);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
