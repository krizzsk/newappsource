package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1223o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import p001a0.C0016g;
import p255t1.C6531g;
import p358af.C13437d;

public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    public int[] mCachedBorders;
    public final Rect mDecorInsets = new Rect();
    public boolean mPendingSpanCountChange = false;
    public final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    public final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    public View[] mSet;
    public int mSpanCount = -1;
    public C1112b mSpanSizeLookup = new C1111a();
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1111a extends C1112b {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C1112b {

        /* renamed from: a */
        public final SparseIntArray f4189a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f4190b = new SparseIntArray();

        /* renamed from: a */
        public static int m2991a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        /* renamed from: b */
        public final void mo4487b() {
            this.f4189a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setSpanCount(RecyclerView.C1134m.getProperties(context, attributeSet, i, i2).f4318b);
    }

    private void assignSpans(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.mSet[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(sVar, xVar, getPosition(view));
            layoutParams.f4188g = spanSize;
            layoutParams.f4187f = i4;
            i4 += spanSize;
            i3 += i2;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int b = layoutParams.mo4704b();
            this.mPreLayoutSpanSizeCache.put(b, layoutParams.f4188g);
            this.mPreLayoutSpanIndexCache.put(b, layoutParams.f4187f);
        }
    }

    private void calculateItemBorders(int i) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.C1152x xVar) {
        int i;
        if (!(getChildCount() == 0 || xVar.mo4935b() == 0)) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            boolean z = !isSmoothScrollbarEnabled;
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(z, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(z, true);
            if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                C1112b bVar = this.mSpanSizeLookup;
                int position = getPosition(findFirstVisibleChildClosestToStart);
                int i2 = this.mSpanCount;
                bVar.getClass();
                int a = C1112b.m2991a(position, i2);
                C1112b bVar2 = this.mSpanSizeLookup;
                int position2 = getPosition(findFirstVisibleChildClosestToEnd);
                int i3 = this.mSpanCount;
                bVar2.getClass();
                int a2 = C1112b.m2991a(position2, i3);
                int min = Math.min(a, a2);
                int max = Math.max(a, a2);
                C1112b bVar3 = this.mSpanSizeLookup;
                int i4 = this.mSpanCount;
                bVar3.getClass();
                int a3 = C1112b.m2991a(xVar.mo4935b() - 1, i4) + 1;
                if (this.mShouldReverseLayout) {
                    i = Math.max(0, (a3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return i;
                }
                int abs = Math.abs(this.mOrientationHelper.mo5166b(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo5169e(findFirstVisibleChildClosestToStart));
                C1112b bVar4 = this.mSpanSizeLookup;
                int position3 = getPosition(findFirstVisibleChildClosestToStart);
                int i5 = this.mSpanCount;
                bVar4.getClass();
                int a4 = C1112b.m2991a(position3, i5);
                C1112b bVar5 = this.mSpanSizeLookup;
                int position4 = getPosition(findFirstVisibleChildClosestToEnd);
                int i6 = this.mSpanCount;
                bVar5.getClass();
                return Math.round((((float) i) * (((float) abs) / ((float) ((C1112b.m2991a(position4, i6) - a4) + 1)))) + ((float) (this.mOrientationHelper.mo5175k() - this.mOrientationHelper.mo5169e(findFirstVisibleChildClosestToStart))));
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0 || xVar.mo4935b() == 0) {
            return 0;
        }
        ensureLayoutState();
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
        View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
        if (findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null) {
            return 0;
        }
        if (!isSmoothScrollbarEnabled()) {
            C1112b bVar = this.mSpanSizeLookup;
            int i = this.mSpanCount;
            bVar.getClass();
            return C1112b.m2991a(xVar.mo4935b() - 1, i) + 1;
        }
        int b = this.mOrientationHelper.mo5166b(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo5169e(findFirstVisibleChildClosestToStart);
        C1112b bVar2 = this.mSpanSizeLookup;
        int position = getPosition(findFirstVisibleChildClosestToStart);
        int i2 = this.mSpanCount;
        bVar2.getClass();
        int a = C1112b.m2991a(position, i2);
        C1112b bVar3 = this.mSpanSizeLookup;
        int position2 = getPosition(findFirstVisibleChildClosestToEnd);
        int i3 = this.mSpanCount;
        bVar3.getClass();
        int a2 = C1112b.m2991a(position2, i3);
        C1112b bVar4 = this.mSpanSizeLookup;
        int i4 = this.mSpanCount;
        bVar4.getClass();
        return (int) ((((float) b) / ((float) ((a2 - a) + 1))) * ((float) (C1112b.m2991a(xVar.mo4935b() - 1, i4) + 1)));
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, LinearLayoutManager.C1114a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int spanIndex = getSpanIndex(sVar, xVar, aVar.f4195b);
        if (z) {
            while (spanIndex > 0) {
                int i2 = aVar.f4195b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f4195b = i3;
                    spanIndex = getSpanIndex(sVar, xVar, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = xVar.mo4935b() - 1;
        int i4 = aVar.f4195b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int spanIndex2 = getSpanIndex(sVar, xVar, i5);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i4 = i5;
            spanIndex = spanIndex2;
        }
        aVar.f4195b = i4;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i) {
        if (!xVar.f4355g) {
            C1112b bVar = this.mSpanSizeLookup;
            int i2 = this.mSpanCount;
            bVar.getClass();
            return C1112b.m2991a(i, i2);
        }
        int b = sVar.mo4917b(i);
        if (b == -1) {
            return 0;
        }
        C1112b bVar2 = this.mSpanSizeLookup;
        int i3 = this.mSpanCount;
        bVar2.getClass();
        return C1112b.m2991a(b, i3);
    }

    private int getSpanIndex(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i) {
        if (!xVar.f4355g) {
            C1112b bVar = this.mSpanSizeLookup;
            int i2 = this.mSpanCount;
            bVar.getClass();
            return i % i2;
        }
        int i3 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = sVar.mo4917b(i);
        if (b == -1) {
            return 0;
        }
        C1112b bVar2 = this.mSpanSizeLookup;
        int i4 = this.mSpanCount;
        bVar2.getClass();
        return b % i4;
    }

    private int getSpanSize(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i) {
        if (!xVar.f4355g) {
            this.mSpanSizeLookup.getClass();
            return 1;
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (sVar.mo4917b(i) == -1) {
            return 1;
        }
        this.mSpanSizeLookup.getClass();
        return 1;
    }

    private void guessMeasurement(float f, int i) {
        calculateItemBorders(Math.max(Math.round(f * ((float) this.mSpanCount)), i));
    }

    private void measureChild(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f4298c;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.f4187f, layoutParams.f4188g);
        if (this.mOrientation == 1) {
            i2 = RecyclerView.C1134m.getChildMeasureSpec(spaceForSpanRange, i, i5, layoutParams.width, false);
            i3 = RecyclerView.C1134m.getChildMeasureSpec(this.mOrientationHelper.mo5176l(), getHeightMode(), i4, layoutParams.height, true);
        } else {
            int childMeasureSpec = RecyclerView.C1134m.getChildMeasureSpec(spaceForSpanRange, i, i4, layoutParams.height, false);
            int childMeasureSpec2 = RecyclerView.C1134m.getChildMeasureSpec(this.mOrientationHelper.mo5176l(), getWidthMode(), i5, layoutParams.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i2, i3, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            z2 = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void updateMeasurements() {
        int i;
        int i2;
        if (getOrientation() == 1) {
            i2 = getWidth() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = getHeight() - getPaddingBottom();
            i = getPaddingTop();
        }
        calculateItemBorders(i2 - i);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.C1152x xVar, LinearLayoutManager.C1116c cVar, RecyclerView.C1134m.C1137c cVar2) {
        boolean z;
        int i = this.mSpanCount;
        int i2 = 0;
        while (i2 < this.mSpanCount) {
            int i3 = cVar.f4206d;
            if (i3 < 0 || i3 >= xVar.mo4935b()) {
                z = false;
            } else {
                z = true;
            }
            if (z && i > 0) {
                ((C1223o.C1225b) cVar2).mo5117a(cVar.f4206d, Math.max(0, cVar.f4209g));
                this.mSpanSizeLookup.getClass();
                i--;
                cVar.f4206d += cVar.f4207e;
                i2++;
            } else {
                return;
            }
        }
    }

    public int computeHorizontalScrollOffset(RecyclerView.C1152x xVar) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(xVar);
        }
        return super.computeHorizontalScrollOffset(xVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.C1152x xVar) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(xVar);
        }
        return super.computeHorizontalScrollRange(xVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.C1152x xVar) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(xVar);
        }
        return super.computeVerticalScrollOffset(xVar);
    }

    public int computeVerticalScrollRange(RecyclerView.C1152x xVar) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(xVar);
        }
        return super.computeVerticalScrollRange(xVar);
    }

    public View findReferenceChild(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z, boolean z2) {
        int i;
        int childCount = getChildCount();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = getChildCount() - 1;
            i3 = -1;
        } else {
            i2 = childCount;
            i = 0;
        }
        int b = xVar.mo4935b();
        ensureLayoutState();
        int k = this.mOrientationHelper.mo5175k();
        int g = this.mOrientationHelper.mo5171g();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < b && getSpanIndex(sVar, xVar, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).mo4706d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.mo5169e(childAt) < g && this.mOrientationHelper.mo5166b(childAt) >= k) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getColumnCountForAccessibility(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (xVar.mo4935b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(sVar, xVar, xVar.mo4935b() - 1) + 1;
    }

    public int getRowCountForAccessibility(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (xVar.mo4935b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(sVar, xVar, xVar.mo4935b() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.mCachedBorders;
        int i3 = this.mSpanCount;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public C1112b getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    public void layoutChunk(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, LinearLayoutManager.C1116c cVar, LinearLayoutManager.C1115b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        View b;
        RecyclerView.C1145s sVar2 = sVar;
        RecyclerView.C1152x xVar2 = xVar;
        LinearLayoutManager.C1116c cVar2 = cVar;
        LinearLayoutManager.C1115b bVar2 = bVar;
        int j = this.mOrientationHelper.mo5174j();
        boolean z4 = false;
        if (j != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (getChildCount() > 0) {
            i = this.mCachedBorders[this.mSpanCount];
        } else {
            i = 0;
        }
        if (z) {
            updateMeasurements();
        }
        if (cVar2.f4207e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i15 = this.mSpanCount;
        if (!z2) {
            i15 = getSpanIndex(sVar2, xVar2, cVar2.f4206d) + getSpanSize(sVar2, xVar2, cVar2.f4206d);
        }
        int i16 = 0;
        while (i16 < this.mSpanCount) {
            int i17 = cVar2.f4206d;
            if (i17 < 0 || i17 >= xVar.mo4935b()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || i15 <= 0) {
                break;
            }
            int i18 = cVar2.f4206d;
            int spanSize = getSpanSize(sVar2, xVar2, i18);
            if (spanSize <= this.mSpanCount) {
                i15 -= spanSize;
                if (i15 < 0 || (b = cVar2.mo4546b(sVar2)) == null) {
                    break;
                }
                this.mSet[i16] = b;
                i16++;
            } else {
                throw new IllegalArgumentException(C13437d.m33707l(C0016g.m35s("Item at position ", i18, " requires ", spanSize, " spans but GridLayoutManager has only "), this.mSpanCount, " spans."));
            }
        }
        if (i16 == 0) {
            bVar2.f4200b = true;
            return;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        assignSpans(sVar2, xVar2, i16, z2);
        int i19 = 0;
        int i21 = 0;
        while (i19 < i16) {
            View view = this.mSet[i19];
            if (cVar2.f4213k == null) {
                if (z2) {
                    addView(view);
                } else {
                    addView(view, z4);
                }
            } else if (z2) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, z4 ? 1 : 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, j, z4);
            int c = this.mOrientationHelper.mo5167c(view);
            if (c > i21) {
                i21 = c;
            }
            float d = (((float) this.mOrientationHelper.mo5168d(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f4188g);
            if (d > f) {
                f = d;
            }
            i19++;
            z4 = false;
        }
        if (z) {
            guessMeasurement(f, i);
            i21 = 0;
            for (int i22 = 0; i22 < i16; i22++) {
                View view2 = this.mSet[i22];
                measureChild(view2, 1073741824, true);
                int c2 = this.mOrientationHelper.mo5167c(view2);
                if (c2 > i21) {
                    i21 = c2;
                }
            }
        }
        for (int i23 = 0; i23 < i16; i23++) {
            View view3 = this.mSet[i23];
            if (this.mOrientationHelper.mo5167c(view3) != i21) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f4298c;
                int i24 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i25 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(layoutParams.f4187f, layoutParams.f4188g);
                if (this.mOrientation == 1) {
                    i14 = RecyclerView.C1134m.getChildMeasureSpec(spaceForSpanRange, 1073741824, i25, layoutParams.width, false);
                    i13 = View.MeasureSpec.makeMeasureSpec(i21 - i24, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                    i13 = RecyclerView.C1134m.getChildMeasureSpec(spaceForSpanRange, 1073741824, i24, layoutParams.height, false);
                    i14 = makeMeasureSpec;
                }
                measureChildWithDecorationsAndMargin(view3, i14, i13, true);
            }
        }
        bVar2.f4199a = i21;
        if (this.mOrientation == 1) {
            if (cVar2.f4208f == -1) {
                i4 = cVar2.f4204b;
                i5 = i4 - i21;
            } else {
                int i26 = cVar2.f4204b;
                int i27 = i26;
                i4 = i21 + i26;
                i5 = i27;
            }
            i3 = 0;
            i2 = 0;
        } else {
            if (cVar2.f4208f == -1) {
                int i28 = cVar2.f4204b;
                i2 = i28 - i21;
                i3 = i28;
            } else {
                int i29 = cVar2.f4204b;
                i3 = i21 + i29;
                i2 = i29;
            }
            i4 = 0;
            i5 = 0;
        }
        int i31 = 0;
        while (i31 < i16) {
            View view4 = this.mSet[i31];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    i12 = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams2.f4187f];
                    i11 = i12 - this.mOrientationHelper.mo5168d(view4);
                } else {
                    i11 = this.mCachedBorders[layoutParams2.f4187f] + getPaddingLeft();
                    i12 = this.mOrientationHelper.mo5168d(view4) + i11;
                }
                i7 = i12;
                i9 = i5;
                i8 = i4;
                i6 = i11;
            } else {
                int paddingTop = getPaddingTop() + this.mCachedBorders[layoutParams2.f4187f];
                i9 = paddingTop;
                i8 = this.mOrientationHelper.mo5168d(view4) + paddingTop;
                i7 = i3;
                i6 = i2;
            }
            layoutDecoratedWithMargins(view4, i6, i9, i7, i8);
            if (layoutParams2.mo4706d() || layoutParams2.mo4705c()) {
                bVar2.f4201c = true;
            }
            bVar2.f4202d |= view4.hasFocusable();
            i31++;
            i5 = i9;
            i4 = i8;
            i3 = i7;
            i2 = i6;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    public void onAnchorReady(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, LinearLayoutManager.C1114a aVar, int i) {
        super.onAnchorReady(sVar, xVar, aVar, i);
        updateMeasurements();
        if (xVar.mo4935b() > 0 && !xVar.f4355g) {
            ensureAnchorIsInCorrectSpan(sVar, xVar, aVar, i);
        }
        ensureViewSet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == r7) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1145s r26, androidx.recyclerview.widget.RecyclerView.C1152x r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.findContainingItemView(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f4187f
            int r5 = r5.f4188g
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.convertFocusDirectionToLayoutDirection(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.mShouldReverseLayout
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.getChildCount()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.getChildCount()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.isLayoutRTL()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.getSpanGroupIndex(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.getSpanGroupIndex(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f4187f
            r18 = r3
            int r3 = r9.f4188g
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.isViewPartiallyVisible(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f4187f
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f4187f
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, View view, C6531g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, gVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(sVar, xVar, layoutParams2.mo4704b());
        if (this.mOrientation == 0) {
            gVar.mo22645j(C6531g.C6534c.m15467a(layoutParams2.f4187f, layoutParams2.f4188g, spanGroupIndex, 1, false));
        } else {
            gVar.mo22645j(C6531g.C6534c.m15467a(spanGroupIndex, 1, layoutParams2.f4187f, layoutParams2.f4188g, false));
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.mo4487b();
        this.mSpanSizeLookup.f4190b.clear();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.mo4487b();
        this.mSpanSizeLookup.f4190b.clear();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.mo4487b();
        this.mSpanSizeLookup.f4190b.clear();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.mo4487b();
        this.mSpanSizeLookup.f4190b.clear();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.mo4487b();
        this.mSpanSizeLookup.f4190b.clear();
    }

    public void onLayoutChildren(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (xVar.f4355g) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(sVar, xVar);
        clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(RecyclerView.C1152x xVar) {
        super.onLayoutCompleted(xVar);
        this.mPendingSpanCountChange = false;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, sVar, xVar);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, sVar, xVar);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            i4 = RecyclerView.C1134m.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            i3 = RecyclerView.C1134m.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            i3 = RecyclerView.C1134m.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            i4 = RecyclerView.C1134m.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public void setSpanCount(int i) {
        if (i != this.mSpanCount) {
            this.mPendingSpanCountChange = true;
            if (i >= 1) {
                this.mSpanCount = i;
                this.mSpanSizeLookup.mo4487b();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException(C16759e.m42349e("Span count should be at least 1. Provided ", i));
        }
    }

    public void setSpanSizeLookup(C1112b bVar) {
        this.mSpanSizeLookup = bVar;
    }

    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.mUsingSpansToEstimateScrollBarDimensions = z;
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    public static int[] calculateItemBorders(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: f */
        public int f4187f = -1;

        /* renamed from: g */
        public int f4188g = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        setSpanCount(i);
    }
}
