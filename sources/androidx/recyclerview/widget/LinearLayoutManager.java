package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1223o;
import androidx.recyclerview.widget.C1227p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1134m implements C1227p.C1236g, RecyclerView.C1149w.C1151b {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final C1114a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C1115b mLayoutChunkResult;
    private C1116c mLayoutState;
    public int mOrientation;
    public C1249z mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1113a();

        /* renamed from: b */
        public int f4191b;

        /* renamed from: c */
        public int f4192c;

        /* renamed from: d */
        public boolean f4193d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C1113a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4191b);
            parcel.writeInt(this.f4192c);
            parcel.writeInt(this.f4193d ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f4191b = parcel.readInt();
            this.f4192c = parcel.readInt();
            this.f4193d = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f4191b = savedState.f4191b;
            this.f4192c = savedState.f4192c;
            this.f4193d = savedState.f4193d;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1114a {

        /* renamed from: a */
        public C1249z f4194a;

        /* renamed from: b */
        public int f4195b;

        /* renamed from: c */
        public int f4196c;

        /* renamed from: d */
        public boolean f4197d;

        /* renamed from: e */
        public boolean f4198e;

        public C1114a() {
            mo4543d();
        }

        /* renamed from: a */
        public final void mo4540a() {
            int i;
            if (this.f4197d) {
                i = this.f4194a.mo5171g();
            } else {
                i = this.f4194a.mo5175k();
            }
            this.f4196c = i;
        }

        /* renamed from: b */
        public final void mo4541b(int i, View view) {
            if (this.f4197d) {
                this.f4196c = this.f4194a.mo5180m() + this.f4194a.mo5166b(view);
            } else {
                this.f4196c = this.f4194a.mo5169e(view);
            }
            this.f4195b = i;
        }

        /* renamed from: c */
        public final void mo4542c(int i, View view) {
            int m = this.f4194a.mo5180m();
            if (m >= 0) {
                mo4541b(i, view);
                return;
            }
            this.f4195b = i;
            if (this.f4197d) {
                int g = (this.f4194a.mo5171g() - m) - this.f4194a.mo5166b(view);
                this.f4196c = this.f4194a.mo5171g() - g;
                if (g > 0) {
                    int c = this.f4196c - this.f4194a.mo5167c(view);
                    int k = this.f4194a.mo5175k();
                    int min = c - (Math.min(this.f4194a.mo5169e(view) - k, 0) + k);
                    if (min < 0) {
                        this.f4196c = Math.min(g, -min) + this.f4196c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e = this.f4194a.mo5169e(view);
            int k2 = e - this.f4194a.mo5175k();
            this.f4196c = e;
            if (k2 > 0) {
                int g2 = (this.f4194a.mo5171g() - Math.min(0, (this.f4194a.mo5171g() - m) - this.f4194a.mo5166b(view))) - (this.f4194a.mo5167c(view) + e);
                if (g2 < 0) {
                    this.f4196c -= Math.min(k2, -g2);
                }
            }
        }

        /* renamed from: d */
        public final void mo4543d() {
            this.f4195b = -1;
            this.f4196c = Integer.MIN_VALUE;
            this.f4197d = false;
            this.f4198e = false;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("AnchorInfo{mPosition=");
            k.append(this.f4195b);
            k.append(", mCoordinate=");
            k.append(this.f4196c);
            k.append(", mLayoutFromEnd=");
            k.append(this.f4197d);
            k.append(", mValid=");
            return C13715c.m34247m(k, this.f4198e, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1115b {

        /* renamed from: a */
        public int f4199a;

        /* renamed from: b */
        public boolean f4200b;

        /* renamed from: c */
        public boolean f4201c;

        /* renamed from: d */
        public boolean f4202d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1116c {

        /* renamed from: a */
        public boolean f4203a = true;

        /* renamed from: b */
        public int f4204b;

        /* renamed from: c */
        public int f4205c;

        /* renamed from: d */
        public int f4206d;

        /* renamed from: e */
        public int f4207e;

        /* renamed from: f */
        public int f4208f;

        /* renamed from: g */
        public int f4209g;

        /* renamed from: h */
        public int f4210h = 0;

        /* renamed from: i */
        public int f4211i = 0;

        /* renamed from: j */
        public int f4212j;

        /* renamed from: k */
        public List<RecyclerView.C1119a0> f4213k = null;

        /* renamed from: l */
        public boolean f4214l;

        /* renamed from: a */
        public final void mo4545a(View view) {
            int b;
            int size = this.f4213k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4213k.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo4706d() && (b = (layoutParams.mo4704b() - this.f4206d) * this.f4207e) >= 0 && b < i) {
                    view2 = view3;
                    if (b == 0) {
                        break;
                    }
                    i = b;
                }
            }
            if (view2 == null) {
                this.f4206d = -1;
            } else {
                this.f4206d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).mo4704b();
            }
        }

        /* renamed from: b */
        public final View mo4546b(RecyclerView.C1145s sVar) {
            List<RecyclerView.C1119a0> list = this.f4213k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f4213k.get(i).itemView;
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (!layoutParams.mo4706d() && this.f4206d == layoutParams.mo4704b()) {
                        mo4545a(view);
                        return view;
                    }
                }
                return null;
            }
            View d = sVar.mo4919d(this.f4206d);
            this.f4206d += this.f4207e;
            return d;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C1249z zVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C1178f0.m3241a(xVar, zVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C1249z zVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C1178f0.m3242b(xVar, zVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C1249z zVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C1178f0.m3243c(xVar, zVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z) {
        int g;
        int g2 = this.mOrientationHelper.mo5171g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-g2, sVar, xVar);
        int i3 = i + i2;
        if (!z || (g = this.mOrientationHelper.mo5171g() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo5179p(g);
        return g + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z) {
        int k;
        int k2 = i - this.mOrientationHelper.mo5175k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(k2, sVar, xVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.mOrientationHelper.mo5175k()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo5179p(-k);
        return i2 - k;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i, int i2) {
        boolean z;
        RecyclerView.C1145s sVar2 = sVar;
        RecyclerView.C1152x xVar2 = xVar;
        if (xVar2.f4359k && getChildCount() != 0 && !xVar2.f4355g && supportsPredictiveItemAnimations()) {
            List<RecyclerView.C1119a0> list = sVar2.f4330d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1119a0 a0Var = list.get(i5);
                if (!a0Var.isRemoved()) {
                    char c = 1;
                    if (a0Var.getLayoutPosition() < position) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.mShouldReverseLayout) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.mOrientationHelper.mo5167c(a0Var.itemView);
                    } else {
                        i4 += this.mOrientationHelper.mo5167c(a0Var.itemView);
                    }
                }
            }
            this.mLayoutState.f4213k = list;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                C1116c cVar = this.mLayoutState;
                cVar.f4210h = i3;
                cVar.f4205c = 0;
                cVar.mo4545a((View) null);
                fill(sVar2, this.mLayoutState, xVar2, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                C1116c cVar2 = this.mLayoutState;
                cVar2.f4210h = i4;
                cVar2.f4205c = 0;
                cVar2.mo4545a((View) null);
                fill(sVar2, this.mLayoutState, xVar2, false);
            }
            this.mLayoutState.f4213k = null;
        }
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo5169e(childAt);
        }
    }

    private void recycleByLayoutState(RecyclerView.C1145s sVar, C1116c cVar) {
        if (cVar.f4203a && !cVar.f4214l) {
            int i = cVar.f4209g;
            int i2 = cVar.f4211i;
            if (cVar.f4208f == -1) {
                recycleViewsFromEnd(sVar, i, i2);
            } else {
                recycleViewsFromStart(sVar, i, i2);
            }
        }
    }

    private void recycleChildren(RecyclerView.C1145s sVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, sVar);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, sVar);
                i--;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C1145s sVar, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int f = (this.mOrientationHelper.mo5170f() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo5169e(childAt) < f || this.mOrientationHelper.mo5178o(childAt) < f) {
                        recycleChildren(sVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.mo5169e(childAt2) < f || this.mOrientationHelper.mo5178o(childAt2) < f) {
                    recycleChildren(sVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C1145s sVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt = getChildAt(i5);
                    if (this.mOrientationHelper.mo5166b(childAt) > i3 || this.mOrientationHelper.mo5177n(childAt) > i3) {
                        recycleChildren(sVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.mo5166b(childAt2) > i3 || this.mOrientationHelper.mo5177n(childAt2) > i3) {
                    recycleChildren(sVar, 0, i6);
                    return;
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, C1114a aVar) {
        View findReferenceChild;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            aVar.getClass();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
            if (layoutParams.mo4706d() || layoutParams.mo4704b() < 0 || layoutParams.mo4704b() >= xVar.mo4935b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                aVar.mo4542c(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        boolean z4 = this.mLastStackFromEnd;
        boolean z5 = this.mStackFromEnd;
        if (z4 != z5 || (findReferenceChild = findReferenceChild(sVar, xVar, aVar.f4197d, z5)) == null) {
            return false;
        }
        aVar.mo4541b(getPosition(findReferenceChild), findReferenceChild);
        if (!xVar.f4355g && supportsPredictiveItemAnimations()) {
            int e = this.mOrientationHelper.mo5169e(findReferenceChild);
            int b = this.mOrientationHelper.mo5166b(findReferenceChild);
            int k = this.mOrientationHelper.mo5175k();
            int g = this.mOrientationHelper.mo5171g();
            if (b > k || e >= k) {
                z = false;
            } else {
                z = true;
            }
            if (e >= g && b > g) {
                z3 = true;
            }
            if (z || z3) {
                if (aVar.f4197d) {
                    k = g;
                }
                aVar.f4196c = k;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C1152x xVar, C1114a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3 = false;
        if (!xVar.f4355g && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= xVar.mo4935b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                int i3 = this.mPendingScrollPosition;
                aVar.f4195b = i3;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null) {
                    if (savedState.f4191b >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        boolean z4 = savedState.f4193d;
                        aVar.f4197d = z4;
                        if (z4) {
                            aVar.f4196c = this.mOrientationHelper.mo5171g() - this.mPendingSavedState.f4192c;
                        } else {
                            aVar.f4196c = this.mOrientationHelper.mo5175k() + this.mPendingSavedState.f4192c;
                        }
                        return true;
                    }
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(i3);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.mShouldReverseLayout) {
                                z3 = true;
                            }
                            aVar.f4197d = z3;
                        }
                        aVar.mo4540a();
                    } else if (this.mOrientationHelper.mo5167c(findViewByPosition) > this.mOrientationHelper.mo5176l()) {
                        aVar.mo4540a();
                        return true;
                    } else if (this.mOrientationHelper.mo5169e(findViewByPosition) - this.mOrientationHelper.mo5175k() < 0) {
                        aVar.f4196c = this.mOrientationHelper.mo5175k();
                        aVar.f4197d = false;
                        return true;
                    } else if (this.mOrientationHelper.mo5171g() - this.mOrientationHelper.mo5166b(findViewByPosition) < 0) {
                        aVar.f4196c = this.mOrientationHelper.mo5171g();
                        aVar.f4197d = true;
                        return true;
                    } else {
                        if (aVar.f4197d) {
                            i2 = this.mOrientationHelper.mo5180m() + this.mOrientationHelper.mo5166b(findViewByPosition);
                        } else {
                            i2 = this.mOrientationHelper.mo5169e(findViewByPosition);
                        }
                        aVar.f4196c = i2;
                    }
                    return true;
                }
                boolean z5 = this.mShouldReverseLayout;
                aVar.f4197d = z5;
                if (z5) {
                    aVar.f4196c = this.mOrientationHelper.mo5171g() - this.mPendingScrollPositionOffset;
                } else {
                    aVar.f4196c = this.mOrientationHelper.mo5175k() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, C1114a aVar) {
        int i;
        if (!updateAnchorFromPendingData(xVar, aVar) && !updateAnchorFromChildren(sVar, xVar, aVar)) {
            aVar.mo4540a();
            if (this.mStackFromEnd) {
                i = xVar.mo4935b() - 1;
            } else {
                i = 0;
            }
            aVar.f4195b = i;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.C1152x xVar) {
        int i3;
        int i4;
        this.mLayoutState.f4214l = resolveIsInfinite();
        this.mLayoutState.f4208f = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(xVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        C1116c cVar = this.mLayoutState;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f4210h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.f4211i = max;
        if (z2) {
            cVar.f4210h = this.mOrientationHelper.mo5172h() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            C1116c cVar2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i5 = -1;
            }
            cVar2.f4207e = i5;
            int position = getPosition(childClosestToEnd);
            C1116c cVar3 = this.mLayoutState;
            cVar2.f4206d = position + cVar3.f4207e;
            cVar3.f4204b = this.mOrientationHelper.mo5166b(childClosestToEnd);
            i4 = this.mOrientationHelper.mo5166b(childClosestToEnd) - this.mOrientationHelper.mo5171g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C1116c cVar4 = this.mLayoutState;
            cVar4.f4210h = this.mOrientationHelper.mo5175k() + cVar4.f4210h;
            C1116c cVar5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i5 = -1;
            }
            cVar5.f4207e = i5;
            int position2 = getPosition(childClosestToStart);
            C1116c cVar6 = this.mLayoutState;
            cVar5.f4206d = position2 + cVar6.f4207e;
            cVar6.f4204b = this.mOrientationHelper.mo5169e(childClosestToStart);
            i4 = (-this.mOrientationHelper.mo5169e(childClosestToStart)) + this.mOrientationHelper.mo5175k();
        }
        C1116c cVar7 = this.mLayoutState;
        cVar7.f4205c = i2;
        if (z) {
            cVar7.f4205c = i2 - i4;
        }
        cVar7.f4209g = i4;
    }

    private void updateLayoutStateToFillEnd(C1114a aVar) {
        updateLayoutStateToFillEnd(aVar.f4195b, aVar.f4196c);
    }

    private void updateLayoutStateToFillStart(C1114a aVar) {
        updateLayoutStateToFillStart(aVar.f4195b, aVar.f4196c);
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.C1152x xVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(xVar);
        if (this.mLayoutState.f4208f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C1152x xVar, RecyclerView.C1134m.C1137c cVar) {
        int i3;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            updateLayoutState(i3, Math.abs(i), true, xVar);
            collectPrefetchPositionsForLayoutState(xVar, this.mLayoutState, cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void collectInitialPrefetchPositions(int r7, androidx.recyclerview.widget.RecyclerView.C1134m.C1137c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.mPendingSavedState
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f4191b
            if (r4 < 0) goto L_0x000d
            r5 = 1
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f4193d
            goto L_0x0022
        L_0x0013:
            r6.resolveShouldLayoutReverse()
            boolean r0 = r6.mShouldReverseLayout
            int r4 = r6.mPendingScrollPosition
            if (r4 != r1) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            r0 = 0
        L_0x0027:
            int r2 = r6.mInitialPrefetchItemCount
            if (r0 >= r2) goto L_0x0039
            if (r4 < 0) goto L_0x0039
            if (r4 >= r7) goto L_0x0039
            r2 = r8
            androidx.recyclerview.widget.o$b r2 = (androidx.recyclerview.widget.C1223o.C1225b) r2
            r2.mo5117a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.collectInitialPrefetchPositions(int, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.C1152x xVar, C1116c cVar, RecyclerView.C1134m.C1137c cVar2) {
        int i = cVar.f4206d;
        if (i >= 0 && i < xVar.mo4935b()) {
            ((C1223o.C1225b) cVar2).mo5117a(i, Math.max(0, cVar.f4209g));
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.C1152x xVar) {
        return computeScrollExtent(xVar);
    }

    public int computeHorizontalScrollOffset(RecyclerView.C1152x xVar) {
        return computeScrollOffset(xVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.C1152x xVar) {
        return computeScrollRange(xVar);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, (float) i2);
    }

    public int computeVerticalScrollExtent(RecyclerView.C1152x xVar) {
        return computeScrollExtent(xVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.C1152x xVar) {
        return computeScrollOffset(xVar);
    }

    public int computeVerticalScrollRange(RecyclerView.C1152x xVar) {
        return computeScrollRange(xVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.mOrientation == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.mOrientation == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.mOrientation == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.mOrientation != 1 && isLayoutRTL()) {
            return 1;
        } else {
            return -1;
        }
    }

    public C1116c createLayoutState() {
        return new C1116c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.C1145s sVar, C1116c cVar, RecyclerView.C1152x xVar, boolean z) {
        boolean z2;
        int i = cVar.f4205c;
        int i2 = cVar.f4209g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f4209g = i2 + i;
            }
            recycleByLayoutState(sVar, cVar);
        }
        int i3 = cVar.f4205c + cVar.f4210h;
        C1115b bVar = this.mLayoutChunkResult;
        while (true) {
            if (!cVar.f4214l && i3 <= 0) {
                break;
            }
            int i4 = cVar.f4206d;
            if (i4 < 0 || i4 >= xVar.mo4935b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                break;
            }
            bVar.f4199a = 0;
            bVar.f4200b = false;
            bVar.f4201c = false;
            bVar.f4202d = false;
            layoutChunk(sVar, xVar, cVar, bVar);
            if (!bVar.f4200b) {
                int i5 = cVar.f4204b;
                int i6 = bVar.f4199a;
                cVar.f4204b = (cVar.f4208f * i6) + i5;
                if (!bVar.f4201c || cVar.f4213k != null || !xVar.f4355g) {
                    cVar.f4205c -= i6;
                    i3 -= i6;
                }
                int i7 = cVar.f4209g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f4209g = i8;
                    int i9 = cVar.f4205c;
                    if (i9 < 0) {
                        cVar.f4209g = i8 + i9;
                    }
                    recycleByLayoutState(sVar, cVar);
                }
                if (z && bVar.f4202d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f4205c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        char c;
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo5169e(getChildAt(i)) < this.mOrientationHelper.mo5175k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo5082a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo5082a(i, i2, i4, i3);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        int i3;
        ensureLayoutState();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo5082a(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.mo5082a(i, i2, i3, i4);
    }

    public View findReferenceChild(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3;
        boolean z4;
        ensureLayoutState();
        int childCount = getChildCount();
        int i3 = -1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
        } else {
            i3 = childCount;
            i2 = 0;
            i = 1;
        }
        int b = xVar.mo4935b();
        int k = this.mOrientationHelper.mo5175k();
        int g = this.mOrientationHelper.mo5171g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int e = this.mOrientationHelper.mo5169e(childAt);
            int b2 = this.mOrientationHelper.mo5166b(childAt);
            if (position >= 0 && position < b) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).mo4706d()) {
                    if (b2 > k || e >= k) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (e < g || b2 <= g) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = childAt;
                    }
                    view2 = childAt;
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i2 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.C1152x xVar) {
        boolean z;
        if (xVar.f4349a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.mOrientationHelper.mo5176l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, C1116c cVar, C1115b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View b = cVar.mo4546b(sVar);
        if (b == null) {
            bVar.f4200b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b.getLayoutParams();
        if (cVar.f4213k == null) {
            boolean z3 = this.mShouldReverseLayout;
            if (cVar.f4208f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(b);
            } else {
                addView(b, 0);
            }
        } else {
            boolean z4 = this.mShouldReverseLayout;
            if (cVar.f4208f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(b);
            } else {
                addDisappearingView(b, 0);
            }
        }
        measureChildWithMargins(b, 0, 0);
        bVar.f4199a = this.mOrientationHelper.mo5167c(b);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.mo5168d(b);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.mo5168d(b) + i4;
            }
            if (cVar.f4208f == -1) {
                int i6 = cVar.f4204b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f4199a;
            } else {
                int i7 = cVar.f4204b;
                i3 = i7;
                i2 = i5;
                i = bVar.f4199a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d = this.mOrientationHelper.mo5168d(b) + paddingTop;
            if (cVar.f4208f == -1) {
                int i8 = cVar.f4204b;
                i2 = i8;
                i3 = paddingTop;
                i = d;
                i4 = i8 - bVar.f4199a;
            } else {
                int i9 = cVar.f4204b;
                i3 = paddingTop;
                i2 = bVar.f4199a + i9;
                i = d;
                i4 = i9;
            }
        }
        layoutDecoratedWithMargins(b, i4, i3, i2, i);
        if (layoutParams.mo4706d() || layoutParams.mo4705c()) {
            bVar.f4201c = true;
        }
        bVar.f4202d = b.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, C1114a aVar, int i) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C1145s sVar) {
        super.onDetachedFromWindow(recyclerView, sVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(sVar);
            sVar.f4327a.clear();
            sVar.mo4920e();
        }
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        int convertFocusDirectionToLayoutDirection;
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.mo5176l()) * MAX_SCROLL_FACTOR), false, xVar);
        C1116c cVar = this.mLayoutState;
        cVar.f4209g = Integer.MIN_VALUE;
        cVar.f4203a = false;
        fill(sVar, cVar, xVar, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View findViewByPosition;
        int i8;
        int i9;
        boolean z;
        int i11 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && xVar.mo4935b() == 0) {
            removeAndRecycleAllViews(sVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            int i12 = savedState.f4191b;
            if (i12 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.mPendingScrollPosition = i12;
            }
        }
        ensureLayoutState();
        this.mLayoutState.f4203a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C1114a aVar = this.mAnchorInfo;
        if (!aVar.f4198e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.mo4543d();
            C1114a aVar2 = this.mAnchorInfo;
            aVar2.f4197d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(sVar, xVar, aVar2);
            this.mAnchorInfo.f4198e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo5169e(focusedChild) >= this.mOrientationHelper.mo5171g() || this.mOrientationHelper.mo5166b(focusedChild) <= this.mOrientationHelper.mo5175k())) {
            this.mAnchorInfo.mo4542c(getPosition(focusedChild), focusedChild);
        }
        C1116c cVar = this.mLayoutState;
        if (cVar.f4212j >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f4208f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(xVar, iArr);
        int k = this.mOrientationHelper.mo5175k() + Math.max(0, this.mReusableIntPair[0]);
        int h = this.mOrientationHelper.mo5172h() + Math.max(0, this.mReusableIntPair[1]);
        if (!(!xVar.f4355g || (i7 = this.mPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i7)) == null)) {
            if (this.mShouldReverseLayout) {
                i8 = this.mOrientationHelper.mo5171g() - this.mOrientationHelper.mo5166b(findViewByPosition);
                i9 = this.mPendingScrollPositionOffset;
            } else {
                i9 = this.mOrientationHelper.mo5169e(findViewByPosition) - this.mOrientationHelper.mo5175k();
                i8 = this.mPendingScrollPositionOffset;
            }
            int i13 = i8 - i9;
            if (i13 > 0) {
                k += i13;
            } else {
                h -= i13;
            }
        }
        C1114a aVar3 = this.mAnchorInfo;
        if (!aVar3.f4197d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i11 = 1;
        }
        onAnchorReady(sVar, xVar, aVar3, i11);
        detachAndScrapAttachedViews(sVar);
        this.mLayoutState.f4214l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f4211i = 0;
        C1114a aVar4 = this.mAnchorInfo;
        if (aVar4.f4197d) {
            updateLayoutStateToFillStart(aVar4);
            C1116c cVar2 = this.mLayoutState;
            cVar2.f4210h = k;
            fill(sVar, cVar2, xVar, false);
            C1116c cVar3 = this.mLayoutState;
            i3 = cVar3.f4204b;
            int i14 = cVar3.f4206d;
            int i15 = cVar3.f4205c;
            if (i15 > 0) {
                h += i15;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C1116c cVar4 = this.mLayoutState;
            cVar4.f4210h = h;
            cVar4.f4206d += cVar4.f4207e;
            fill(sVar, cVar4, xVar, false);
            C1116c cVar5 = this.mLayoutState;
            i2 = cVar5.f4204b;
            int i16 = cVar5.f4205c;
            if (i16 > 0) {
                updateLayoutStateToFillStart(i14, i3);
                C1116c cVar6 = this.mLayoutState;
                cVar6.f4210h = i16;
                fill(sVar, cVar6, xVar, false);
                i3 = this.mLayoutState.f4204b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            C1116c cVar7 = this.mLayoutState;
            cVar7.f4210h = h;
            fill(sVar, cVar7, xVar, false);
            C1116c cVar8 = this.mLayoutState;
            int i17 = cVar8.f4204b;
            int i18 = cVar8.f4206d;
            int i19 = cVar8.f4205c;
            if (i19 > 0) {
                k += i19;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C1116c cVar9 = this.mLayoutState;
            cVar9.f4210h = k;
            cVar9.f4206d += cVar9.f4207e;
            fill(sVar, cVar9, xVar, false);
            C1116c cVar10 = this.mLayoutState;
            int i21 = cVar10.f4204b;
            int i22 = cVar10.f4205c;
            if (i22 > 0) {
                updateLayoutStateToFillEnd(i18, i17);
                C1116c cVar11 = this.mLayoutState;
                cVar11.f4210h = i22;
                fill(sVar, cVar11, xVar, false);
                i2 = this.mLayoutState.f4204b;
            } else {
                i2 = i17;
            }
            i3 = i21;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i2, sVar, xVar, true);
                i5 = i3 + fixLayoutEndGap;
                i4 = i2 + fixLayoutEndGap;
                i6 = fixLayoutStartGap(i5, sVar, xVar, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i3, sVar, xVar, true);
                i5 = i3 + fixLayoutStartGap;
                i4 = i2 + fixLayoutStartGap;
                i6 = fixLayoutEndGap(i4, sVar, xVar, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        layoutForPredictiveAnimations(sVar, xVar, i3, i2);
        if (!xVar.f4355g) {
            C1249z zVar = this.mOrientationHelper;
            zVar.f4700b = zVar.mo5176l();
        } else {
            this.mAnchorInfo.mo4543d();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(RecyclerView.C1152x xVar) {
        super.onLayoutCompleted(xVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.mo4543d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f4191b = -1;
            }
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.f4193d = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.f4192c = this.mOrientationHelper.mo5171g() - this.mOrientationHelper.mo5166b(childClosestToEnd);
                savedState2.f4191b = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState2.f4191b = getPosition(childClosestToStart);
                savedState2.f4192c = this.mOrientationHelper.mo5169e(childClosestToStart) - this.mOrientationHelper.mo5175k();
            }
        } else {
            savedState2.f4191b = -1;
        }
        return savedState2;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        char c;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5171g() - (this.mOrientationHelper.mo5167c(view) + this.mOrientationHelper.mo5169e(view2)));
                return;
            }
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5171g() - this.mOrientationHelper.mo5166b(view2));
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5169e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5166b(view2) - this.mOrientationHelper.mo5167c(view));
        }
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.mo5173i() == 0 && this.mOrientationHelper.mo5170f() == 0) {
            return true;
        }
        return false;
    }

    public int scrollBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f4203a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, xVar);
        C1116c cVar = this.mLayoutState;
        int fill = fill(sVar, cVar, xVar, false) + cVar.f4209g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo5179p(-i);
        this.mLayoutState.f4212j = i;
        return i;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, sVar, xVar);
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f4191b = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f4191b = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, sVar, xVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                C1249z a = C1249z.m3371a(this, i);
                this.mOrientationHelper = a;
                this.mAnchorInfo.f4194a = a;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("invalid orientation:", i));
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    public boolean shouldMeasureTwice() {
        if (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) {
            return false;
        }
        return true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C1152x xVar, int i) {
        C1240t tVar = new C1240t(recyclerView.getContext());
        tVar.f4336a = i;
        startSmoothScroll(tVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        boolean z = true;
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int e = this.mOrientationHelper.mo5169e(getChildAt(0));
            if (this.mShouldReverseLayout) {
                int i = 1;
                while (i < getChildCount()) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int e2 = this.mOrientationHelper.mo5169e(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder k = C13555b.m33972k("detected invalid position. loc invalid? ");
                        if (e2 >= e) {
                            z = false;
                        }
                        k.append(z);
                        throw new RuntimeException(k.toString());
                    } else if (e2 <= e) {
                        i++;
                    } else {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < getChildCount()) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int e3 = this.mOrientationHelper.mo5169e(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder k2 = C13555b.m33972k("detected invalid position. loc invalid? ");
                    if (e3 >= e) {
                        z = false;
                    }
                    k2.append(z);
                    throw new RuntimeException(k2.toString());
                } else if (e3 >= e) {
                    i2++;
                } else {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1114a();
        this.mLayoutChunkResult = new C1115b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f4205c = this.mOrientationHelper.mo5171g() - i2;
        C1116c cVar = this.mLayoutState;
        cVar.f4207e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f4206d = i;
        cVar.f4208f = 1;
        cVar.f4204b = i2;
        cVar.f4209g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f4205c = i2 - this.mOrientationHelper.mo5175k();
        C1116c cVar = this.mLayoutState;
        cVar.f4206d = i;
        cVar.f4207e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f4208f = -1;
        cVar.f4204b = i2;
        cVar.f4209g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1114a();
        this.mLayoutChunkResult = new C1115b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.C1134m.C1138d properties = RecyclerView.C1134m.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f4317a);
        setReverseLayout(properties.f4319c);
        setStackFromEnd(properties.f4320d);
    }
}
