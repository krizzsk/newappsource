package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.C1240t;
import androidx.recyclerview.widget.C1247x;
import androidx.recyclerview.widget.C1248y;
import androidx.recyclerview.widget.C1249z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C4093c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.C1134m implements C4091a, RecyclerView.C1149w.C1151b {

    /* renamed from: z */
    public static final Rect f14705z = new Rect();

    /* renamed from: b */
    public int f14706b;

    /* renamed from: c */
    public int f14707c;

    /* renamed from: d */
    public int f14708d;

    /* renamed from: e */
    public int f14709e = -1;

    /* renamed from: f */
    public boolean f14710f;

    /* renamed from: g */
    public boolean f14711g;

    /* renamed from: h */
    public List<C4092b> f14712h = new ArrayList();

    /* renamed from: i */
    public final C4093c f14713i = new C4093c(this);

    /* renamed from: j */
    public RecyclerView.C1145s f14714j;

    /* renamed from: k */
    public RecyclerView.C1152x f14715k;

    /* renamed from: l */
    public C4090b f14716l;

    /* renamed from: m */
    public C4089a f14717m = new C4089a();

    /* renamed from: n */
    public C1249z f14718n;

    /* renamed from: o */
    public C1249z f14719o;

    /* renamed from: p */
    public SavedState f14720p;

    /* renamed from: q */
    public int f14721q = -1;

    /* renamed from: r */
    public int f14722r = Integer.MIN_VALUE;

    /* renamed from: s */
    public int f14723s = Integer.MIN_VALUE;

    /* renamed from: t */
    public int f14724t = Integer.MIN_VALUE;

    /* renamed from: u */
    public SparseArray<View> f14725u = new SparseArray<>();

    /* renamed from: v */
    public final Context f14726v;

    /* renamed from: w */
    public View f14727w;

    /* renamed from: x */
    public int f14728x = -1;

    /* renamed from: y */
    public C4093c.C4094a f14729y = new C4093c.C4094a();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4088a();

        /* renamed from: b */
        public int f14739b;

        /* renamed from: c */
        public int f14740c;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        public class C4088a implements Parcelable.Creator<SavedState> {
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

        public final String toString() {
            StringBuilder k = C13555b.m33972k("SavedState{mAnchorPosition=");
            k.append(this.f14739b);
            k.append(", mAnchorOffset=");
            return C16530d.m42014g(k, this.f14740c, '}');
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14739b);
            parcel.writeInt(this.f14740c);
        }

        public SavedState(Parcel parcel) {
            this.f14739b = parcel.readInt();
            this.f14740c = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f14739b = savedState.f14739b;
            this.f14740c = savedState.f14740c;
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$a */
    public class C4089a {

        /* renamed from: a */
        public int f14741a;

        /* renamed from: b */
        public int f14742b;

        /* renamed from: c */
        public int f14743c;

        /* renamed from: d */
        public int f14744d = 0;

        /* renamed from: e */
        public boolean f14745e;

        /* renamed from: f */
        public boolean f14746f;

        /* renamed from: g */
        public boolean f14747g;

        public C4089a() {
        }

        /* renamed from: a */
        public static void m11035a(C4089a aVar) {
            int i;
            int i2;
            if (!FlexboxLayoutManager.this.mo16795j()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.f14710f) {
                    if (aVar.f14745e) {
                        i2 = flexboxLayoutManager.f14718n.mo5171g();
                    } else {
                        i2 = flexboxLayoutManager.getWidth() - FlexboxLayoutManager.this.f14718n.mo5175k();
                    }
                    aVar.f14743c = i2;
                    return;
                }
            }
            if (aVar.f14745e) {
                i = FlexboxLayoutManager.this.f14718n.mo5171g();
            } else {
                i = FlexboxLayoutManager.this.f14718n.mo5175k();
            }
            aVar.f14743c = i;
        }

        /* renamed from: b */
        public static void m11036b(C4089a aVar) {
            aVar.f14741a = -1;
            aVar.f14742b = -1;
            aVar.f14743c = Integer.MIN_VALUE;
            boolean z = false;
            aVar.f14746f = false;
            aVar.f14747g = false;
            if (FlexboxLayoutManager.this.mo16795j()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                int i = flexboxLayoutManager.f14707c;
                if (i == 0) {
                    if (flexboxLayoutManager.f14706b == 1) {
                        z = true;
                    }
                    aVar.f14745e = z;
                    return;
                }
                if (i == 2) {
                    z = true;
                }
                aVar.f14745e = z;
                return;
            }
            FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
            int i2 = flexboxLayoutManager2.f14707c;
            if (i2 == 0) {
                if (flexboxLayoutManager2.f14706b == 3) {
                    z = true;
                }
                aVar.f14745e = z;
                return;
            }
            if (i2 == 2) {
                z = true;
            }
            aVar.f14745e = z;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("AnchorInfo{mPosition=");
            k.append(this.f14741a);
            k.append(", mFlexLinePosition=");
            k.append(this.f14742b);
            k.append(", mCoordinate=");
            k.append(this.f14743c);
            k.append(", mPerpendicularCoordinate=");
            k.append(this.f14744d);
            k.append(", mLayoutFromEnd=");
            k.append(this.f14745e);
            k.append(", mValid=");
            k.append(this.f14746f);
            k.append(", mAssignedFromSavedState=");
            return C13715c.m34247m(k, this.f14747g, '}');
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public static class C4090b {

        /* renamed from: a */
        public int f14749a;

        /* renamed from: b */
        public boolean f14750b;

        /* renamed from: c */
        public int f14751c;

        /* renamed from: d */
        public int f14752d;

        /* renamed from: e */
        public int f14753e;

        /* renamed from: f */
        public int f14754f;

        /* renamed from: g */
        public int f14755g;

        /* renamed from: h */
        public int f14756h = 1;

        /* renamed from: i */
        public int f14757i = 1;

        /* renamed from: j */
        public boolean f14758j;

        public final String toString() {
            StringBuilder k = C13555b.m33972k("LayoutState{mAvailable=");
            k.append(this.f14749a);
            k.append(", mFlexLinePosition=");
            k.append(this.f14751c);
            k.append(", mPosition=");
            k.append(this.f14752d);
            k.append(", mOffset=");
            k.append(this.f14753e);
            k.append(", mScrollingOffset=");
            k.append(this.f14754f);
            k.append(", mLastScrollDelta=");
            k.append(this.f14755g);
            k.append(", mItemDirection=");
            k.append(this.f14756h);
            k.append(", mLayoutDirection=");
            return C16530d.m42014g(k, this.f14757i, '}');
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1134m.C1138d properties = RecyclerView.C1134m.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f4317a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f4319c) {
                    mo16844w(3);
                } else {
                    mo16844w(2);
                }
            }
        } else if (properties.f4319c) {
            mo16844w(1);
        } else {
            mo16844w(0);
        }
        int i4 = this.f14707c;
        if (i4 != 1) {
            if (i4 == 0) {
                removeAllViews();
                this.f14712h.clear();
                C4089a.m11036b(this.f14717m);
                this.f14717m.f14744d = 0;
            }
            this.f14707c = 1;
            this.f14718n = null;
            this.f14719o = null;
            requestLayout();
        }
        if (this.f14708d != 4) {
            removeAllViews();
            this.f14712h.clear();
            C4089a.m11036b(this.f14717m);
            this.f14717m.f14744d = 0;
            this.f14708d = 4;
            requestLayout();
        }
        this.f14726v = context;
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !isMeasurementCacheEnabled() || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo16767a(View view, int i, int i2, C4092b bVar) {
        calculateItemDecorationsForChild(view, f14705z);
        if (mo16795j()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            bVar.f14763e += rightDecorationWidth;
            bVar.f14764f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        bVar.f14763e += bottomDecorationHeight;
        bVar.f14764f += bottomDecorationHeight;
    }

    /* renamed from: b */
    public final int mo16769b(int i, int i2, int i3) {
        return RecyclerView.C1134m.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    /* renamed from: c */
    public final View mo16770c(int i) {
        View view = this.f14725u.get(i);
        if (view != null) {
            return view;
        }
        return this.f14714j.mo4919d(i);
    }

    public final boolean canScrollHorizontally() {
        int i;
        if (this.f14707c == 0) {
            return mo16795j();
        }
        if (mo16795j()) {
            int width = getWidth();
            View view = this.f14727w;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (width > i) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean canScrollVertically() {
        int i;
        if (this.f14707c == 0) {
            return !mo16795j();
        }
        if (mo16795j()) {
            return true;
        }
        int height = getHeight();
        View view = this.f14727w;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (height > i) {
            return true;
        }
        return false;
    }

    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final int computeHorizontalScrollExtent(RecyclerView.C1152x xVar) {
        return computeScrollExtent(xVar);
    }

    public final int computeHorizontalScrollOffset(RecyclerView.C1152x xVar) {
        return computeScrollOffset(xVar);
    }

    public final int computeHorizontalScrollRange(RecyclerView.C1152x xVar) {
        return computeScrollRange(xVar);
    }

    public final int computeScrollExtent(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b = xVar.mo4935b();
        mo16832k();
        View m = mo16834m(b);
        View o = mo16836o(b);
        if (xVar.mo4935b() == 0 || m == null || o == null) {
            return 0;
        }
        return Math.min(this.f14718n.mo5176l(), this.f14718n.mo5166b(o) - this.f14718n.mo5169e(m));
    }

    public final int computeScrollOffset(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b = xVar.mo4935b();
        View m = mo16834m(b);
        View o = mo16836o(b);
        if (!(xVar.mo4935b() == 0 || m == null || o == null)) {
            int position = getPosition(m);
            int position2 = getPosition(o);
            int abs = Math.abs(this.f14718n.mo5166b(o) - this.f14718n.mo5169e(m));
            int[] iArr = this.f14713i.f14779c;
            int i = iArr[position];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[position2] - i) + 1)))) + ((float) (this.f14718n.mo5175k() - this.f14718n.mo5169e(m))));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.C1152x xVar) {
        int i;
        if (getChildCount() == 0) {
            return 0;
        }
        int b = xVar.mo4935b();
        View m = mo16834m(b);
        View o = mo16836o(b);
        if (xVar.mo4935b() == 0 || m == null || o == null) {
            return 0;
        }
        View q = mo16838q(0, getChildCount());
        int i2 = -1;
        if (q == null) {
            i = -1;
        } else {
            i = getPosition(q);
        }
        View q2 = mo16838q(getChildCount() - 1, -1);
        if (q2 != null) {
            i2 = getPosition(q2);
        }
        return (int) ((((float) Math.abs(this.f14718n.mo5166b(o) - this.f14718n.mo5169e(m))) / ((float) ((i2 - i) + 1))) * ((float) xVar.mo4935b()));
    }

    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        int i2;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        if (i < getPosition(childAt)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo16795j()) {
            return new PointF(BitmapDescriptorFactory.HUE_RED, (float) i2);
        }
        return new PointF((float) i2, BitmapDescriptorFactory.HUE_RED);
    }

    public final int computeVerticalScrollExtent(RecyclerView.C1152x xVar) {
        return computeScrollExtent(xVar);
    }

    public final int computeVerticalScrollOffset(RecyclerView.C1152x xVar) {
        return computeScrollOffset(xVar);
    }

    public final int computeVerticalScrollRange(RecyclerView.C1152x xVar) {
        return computeScrollRange(xVar);
    }

    /* renamed from: d */
    public final int mo16772d(int i, int i2, int i3) {
        return RecyclerView.C1134m.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    /* renamed from: e */
    public final int mo16773e(View view) {
        int i;
        int i2;
        if (mo16795j()) {
            i2 = getTopDecorationHeight(view);
            i = getBottomDecorationHeight(view);
        } else {
            i2 = getLeftDecorationWidth(view);
            i = getRightDecorationWidth(view);
        }
        return i + i2;
    }

    /* renamed from: f */
    public final void mo16774f(C4092b bVar) {
    }

    public final int fixLayoutEndGap(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z) {
        boolean z2;
        int i2;
        int g;
        if (mo16795j() || !this.f14710f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int k = i - this.f14718n.mo5175k();
            if (k <= 0) {
                return 0;
            }
            i2 = mo16840s(k, sVar, xVar);
        } else {
            int g2 = this.f14718n.mo5171g() - i;
            if (g2 <= 0) {
                return 0;
            }
            i2 = -mo16840s(-g2, sVar, xVar);
        }
        int i3 = i + i2;
        if (!z || (g = this.f14718n.mo5171g() - i3) <= 0) {
            return i2;
        }
        this.f14718n.mo5179p(g);
        return g + i2;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z) {
        int i2;
        int k;
        if (mo16795j() || !this.f14710f) {
            int k2 = i - this.f14718n.mo5175k();
            if (k2 <= 0) {
                return 0;
            }
            i2 = -mo16840s(k2, sVar, xVar);
        } else {
            int g = this.f14718n.mo5171g() - i;
            if (g <= 0) {
                return 0;
            }
            i2 = mo16840s(-g, sVar, xVar);
        }
        int i3 = i + i2;
        if (!z || (k = i3 - this.f14718n.mo5175k()) <= 0) {
            return i2;
        }
        this.f14718n.mo5179p(-k);
        return i2 - k;
    }

    /* renamed from: g */
    public final View mo16775g(int i) {
        return mo16770c(i);
    }

    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final int getAlignContent() {
        return 5;
    }

    public final int getAlignItems() {
        return this.f14708d;
    }

    public final int getFlexDirection() {
        return this.f14706b;
    }

    public final int getFlexItemCount() {
        return this.f14715k.mo4935b();
    }

    public final List<C4092b> getFlexLinesInternal() {
        return this.f14712h;
    }

    public final int getFlexWrap() {
        return this.f14707c;
    }

    public final int getLargestMainSize() {
        if (this.f14712h.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f14712h.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f14712h.get(i2).f14763e);
        }
        return i;
    }

    public final int getMaxLine() {
        return this.f14709e;
    }

    public final int getSumOfCrossSize() {
        int size = this.f14712h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f14712h.get(i2).f14765g;
        }
        return i;
    }

    /* renamed from: h */
    public final void mo16793h(int i, View view) {
        this.f14725u.put(i, view);
    }

    /* renamed from: i */
    public final int mo16794i(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo16795j()) {
            i3 = getLeftDecorationWidth(view);
            i4 = getRightDecorationWidth(view);
        } else {
            i3 = getTopDecorationHeight(view);
            i4 = getBottomDecorationHeight(view);
        }
        return i4 + i3;
    }

    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: j */
    public final boolean mo16795j() {
        int i = this.f14706b;
        return i == 0 || i == 1;
    }

    /* renamed from: k */
    public final void mo16832k() {
        if (this.f14718n == null) {
            if (mo16795j()) {
                if (this.f14707c == 0) {
                    this.f14718n = new C1247x(this);
                    this.f14719o = new C1248y(this);
                    return;
                }
                this.f14718n = new C1248y(this);
                this.f14719o = new C1247x(this);
            } else if (this.f14707c == 0) {
                this.f14718n = new C1248y(this);
                this.f14719o = new C1247x(this);
            } else {
                this.f14718n = new C1247x(this);
                this.f14719o = new C1248y(this);
            }
        }
    }

    /* renamed from: l */
    public final int mo16833l(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, C4090b bVar) {
        boolean z;
        int i;
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
        int i15;
        int i16;
        RecyclerView.C1145s sVar2 = sVar;
        C4090b bVar2 = bVar;
        int i17 = bVar2.f14754f;
        if (i17 != Integer.MIN_VALUE) {
            int i18 = bVar2.f14749a;
            if (i18 < 0) {
                bVar2.f14754f = i17 + i18;
            }
            mo16842u(sVar2, bVar2);
        }
        int i19 = bVar2.f14749a;
        boolean j = mo16795j();
        int i21 = i19;
        int i22 = 0;
        while (true) {
            if (i21 <= 0 && !this.f14716l.f14750b) {
                break;
            }
            List<C4092b> list = this.f14712h;
            int i23 = bVar2.f14752d;
            if (i23 < 0 || i23 >= xVar.mo4935b() || (i16 = bVar2.f14751c) < 0 || i16 >= list.size()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                break;
            }
            C4092b bVar3 = this.f14712h.get(bVar2.f14751c);
            bVar2.f14752d = bVar3.f14773o;
            if (mo16795j()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i24 = bVar2.f14753e;
                if (bVar2.f14757i == -1) {
                    i24 -= bVar3.f14765g;
                }
                int i25 = bVar2.f14752d;
                float f = (float) this.f14717m.f14744d;
                float f2 = ((float) paddingLeft) - f;
                float f3 = ((float) (width - paddingRight)) - f;
                float max = Math.max(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i26 = bVar3.f14766h;
                int i27 = i25;
                int i28 = 0;
                while (i27 < i25 + i26) {
                    View c = mo16770c(i27);
                    if (c == null) {
                        i14 = i19;
                        i15 = i25;
                        i13 = i27;
                        i12 = i26;
                    } else {
                        i15 = i25;
                        int i29 = i26;
                        if (bVar2.f14757i == 1) {
                            calculateItemDecorationsForChild(c, f14705z);
                            addView(c);
                        } else {
                            calculateItemDecorationsForChild(c, f14705z);
                            addView(c, i28);
                            i28++;
                        }
                        i14 = i19;
                        int i31 = i28;
                        long j2 = this.f14713i.f14780d[i27];
                        int i32 = (int) j2;
                        int i33 = (int) (j2 >> 32);
                        LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                        if (shouldMeasureChild(c, i32, i33, layoutParams)) {
                            c.measure(i32, i33);
                        }
                        float leftDecorationWidth = f2 + ((float) (getLeftDecorationWidth(c) + layoutParams.leftMargin));
                        float rightDecorationWidth = f3 - ((float) (getRightDecorationWidth(c) + layoutParams.rightMargin));
                        int topDecorationHeight = getTopDecorationHeight(c) + i24;
                        if (this.f14710f) {
                            i13 = i27;
                            i12 = i29;
                            this.f14713i.mo16879o(c, bVar3, Math.round(rightDecorationWidth) - c.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), c.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            i13 = i27;
                            i12 = i29;
                            this.f14713i.mo16879o(c, bVar3, Math.round(leftDecorationWidth), topDecorationHeight, c.getMeasuredWidth() + Math.round(leftDecorationWidth), c.getMeasuredHeight() + topDecorationHeight);
                        }
                        float rightDecorationWidth2 = ((float) (getRightDecorationWidth(c) + c.getMeasuredWidth() + layoutParams.rightMargin)) + max + leftDecorationWidth;
                        f3 = rightDecorationWidth - (((float) (getLeftDecorationWidth(c) + (c.getMeasuredWidth() + layoutParams.leftMargin))) + max);
                        f2 = rightDecorationWidth2;
                        i28 = i31;
                    }
                    i27 = i13 + 1;
                    i25 = i15;
                    i19 = i14;
                    i26 = i12;
                }
                i2 = i19;
                bVar2.f14751c += this.f14716l.f14757i;
                i4 = bVar3.f14765g;
                i3 = i21;
                i = i22;
            } else {
                i2 = i19;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i34 = bVar2.f14753e;
                if (bVar2.f14757i == -1) {
                    int i35 = bVar3.f14765g;
                    int i36 = i34 - i35;
                    i5 = i34 + i35;
                    i34 = i36;
                } else {
                    i5 = i34;
                }
                int i37 = bVar2.f14752d;
                float f4 = (float) (height - paddingBottom);
                float f5 = (float) this.f14717m.f14744d;
                float f6 = ((float) paddingTop) - f5;
                float f7 = f4 - f5;
                float max2 = Math.max(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i38 = bVar3.f14766h;
                int i39 = i37;
                int i41 = 0;
                while (i39 < i37 + i38) {
                    View c2 = mo16770c(i39);
                    if (c2 == null) {
                        i9 = i21;
                        i8 = i22;
                        i7 = i39;
                        i11 = i38;
                        i6 = i37;
                    } else {
                        int i42 = i38;
                        i9 = i21;
                        i8 = i22;
                        long j3 = this.f14713i.f14780d[i39];
                        int i43 = (int) j3;
                        int i44 = (int) (j3 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) c2.getLayoutParams();
                        if (shouldMeasureChild(c2, i43, i44, layoutParams2)) {
                            c2.measure(i43, i44);
                        }
                        float topDecorationHeight2 = f6 + ((float) (getTopDecorationHeight(c2) + layoutParams2.topMargin));
                        float bottomDecorationHeight = f7 - ((float) (getBottomDecorationHeight(c2) + layoutParams2.rightMargin));
                        if (bVar2.f14757i == 1) {
                            calculateItemDecorationsForChild(c2, f14705z);
                            addView(c2);
                        } else {
                            calculateItemDecorationsForChild(c2, f14705z);
                            addView(c2, i41);
                            i41++;
                        }
                        int i45 = i41;
                        int leftDecorationWidth2 = getLeftDecorationWidth(c2) + i34;
                        int rightDecorationWidth3 = i5 - getRightDecorationWidth(c2);
                        boolean z2 = this.f14710f;
                        if (!z2) {
                            boolean z3 = z2;
                            i7 = i39;
                            i6 = i37;
                            i11 = i42;
                            if (this.f14711g) {
                                this.f14713i.mo16880p(c2, bVar3, z3, leftDecorationWidth2, Math.round(bottomDecorationHeight) - c2.getMeasuredHeight(), c2.getMeasuredWidth() + leftDecorationWidth2, Math.round(bottomDecorationHeight));
                            } else {
                                this.f14713i.mo16880p(c2, bVar3, z3, leftDecorationWidth2, Math.round(topDecorationHeight2), c2.getMeasuredWidth() + leftDecorationWidth2, c2.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        } else if (this.f14711g) {
                            i7 = i39;
                            i11 = i42;
                            i6 = i37;
                            this.f14713i.mo16880p(c2, bVar3, z2, rightDecorationWidth3 - c2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - c2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i7 = i39;
                            i6 = i37;
                            i11 = i42;
                            this.f14713i.mo16880p(c2, bVar3, z2, rightDecorationWidth3 - c2.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth3, c2.getMeasuredHeight() + Math.round(topDecorationHeight2));
                        }
                        float bottomDecorationHeight2 = ((float) (getBottomDecorationHeight(c2) + c2.getMeasuredHeight() + layoutParams2.topMargin)) + max2 + topDecorationHeight2;
                        f7 = bottomDecorationHeight - (((float) (getTopDecorationHeight(c2) + (c2.getMeasuredHeight() + layoutParams2.bottomMargin))) + max2);
                        f6 = bottomDecorationHeight2;
                        i41 = i45;
                    }
                    i39 = i7 + 1;
                    i38 = i11;
                    i21 = i9;
                    i22 = i8;
                    i37 = i6;
                }
                i3 = i21;
                i = i22;
                bVar2.f14751c += this.f14716l.f14757i;
                i4 = bVar3.f14765g;
            }
            i22 = i + i4;
            if (j || !this.f14710f) {
                bVar2.f14753e += bVar3.f14765g * bVar2.f14757i;
            } else {
                bVar2.f14753e -= bVar3.f14765g * bVar2.f14757i;
            }
            i21 = i3 - bVar3.f14765g;
            RecyclerView.C1145s sVar3 = sVar;
            i19 = i2;
        }
        int i46 = i19;
        int i47 = i22;
        int i48 = bVar2.f14749a - i47;
        bVar2.f14749a = i48;
        int i49 = bVar2.f14754f;
        if (i49 != Integer.MIN_VALUE) {
            int i51 = i49 + i47;
            bVar2.f14754f = i51;
            if (i48 < 0) {
                bVar2.f14754f = i51 + i48;
            }
            mo16842u(sVar, bVar2);
        }
        return i46 - bVar2.f14749a;
    }

    /* renamed from: m */
    public final View mo16834m(int i) {
        int i2;
        View r = mo16839r(0, getChildCount(), i);
        if (r == null || (i2 = this.f14713i.f14779c[getPosition(r)]) == -1) {
            return null;
        }
        return mo16835n(r, this.f14712h.get(i2));
    }

    /* renamed from: n */
    public final View mo16835n(View view, C4092b bVar) {
        boolean j = mo16795j();
        int i = bVar.f14766h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f14710f || j) {
                    if (this.f14718n.mo5169e(view) <= this.f14718n.mo5169e(childAt)) {
                    }
                } else if (this.f14718n.mo5166b(view) >= this.f14718n.mo5166b(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: o */
    public final View mo16836o(int i) {
        View r = mo16839r(getChildCount() - 1, -1, i);
        if (r == null) {
            return null;
        }
        return mo16837p(r, this.f14712h.get(this.f14713i.f14779c[getPosition(r)]));
    }

    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f14727w = (View) recyclerView.getParent();
    }

    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C1145s sVar) {
        super.onDetachedFromWindow(recyclerView, sVar);
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        mo16845x(i);
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        mo16845x(Math.min(i, i2));
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        mo16845x(i);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        mo16845x(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x028f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C1145s r21, androidx.recyclerview.widget.RecyclerView.C1152x r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r0.f14714j = r1
            r0.f14715k = r2
            int r3 = r22.mo4935b()
            if (r3 != 0) goto L_0x0015
            boolean r4 = r2.f4355g
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            int r4 = r20.getLayoutDirection()
            int r5 = r0.f14706b
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x005f
            if (r5 == r7) goto L_0x004e
            if (r5 == r6) goto L_0x003d
            r9 = 3
            if (r5 == r9) goto L_0x002c
            r0.f14710f = r8
            r0.f14711g = r8
            goto L_0x006f
        L_0x002c:
            if (r4 != r7) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            r0.f14710f = r4
            int r5 = r0.f14707c
            if (r5 != r6) goto L_0x003a
            r4 = r4 ^ r7
            r0.f14710f = r4
        L_0x003a:
            r0.f14711g = r7
            goto L_0x006f
        L_0x003d:
            if (r4 != r7) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            r0.f14710f = r4
            int r5 = r0.f14707c
            if (r5 != r6) goto L_0x004b
            r4 = r4 ^ r7
            r0.f14710f = r4
        L_0x004b:
            r0.f14711g = r8
            goto L_0x006f
        L_0x004e:
            if (r4 == r7) goto L_0x0052
            r4 = 1
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            r0.f14710f = r4
            int r4 = r0.f14707c
            if (r4 != r6) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            r0.f14711g = r4
            goto L_0x006f
        L_0x005f:
            if (r4 != r7) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            r0.f14710f = r4
            int r4 = r0.f14707c
            if (r4 != r6) goto L_0x006c
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            r0.f14711g = r4
        L_0x006f:
            r20.mo16832k()
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            if (r4 != 0) goto L_0x007d
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = new com.google.android.flexbox.FlexboxLayoutManager$b
            r4.<init>()
            r0.f14716l = r4
        L_0x007d:
            com.google.android.flexbox.c r4 = r0.f14713i
            r4.mo16874j(r3)
            com.google.android.flexbox.c r4 = r0.f14713i
            r4.mo16875k(r3)
            com.google.android.flexbox.c r4 = r0.f14713i
            r4.mo16873i(r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            r4.f14758j = r8
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r4 = r0.f14720p
            if (r4 == 0) goto L_0x00a1
            int r5 = r4.f14739b
            if (r5 < 0) goto L_0x009c
            if (r5 >= r3) goto L_0x009c
            r6 = 1
            goto L_0x009d
        L_0x009c:
            r6 = 0
        L_0x009d:
            if (r6 == 0) goto L_0x00a1
            r0.f14721q = r5
        L_0x00a1:
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.f14717m
            boolean r6 = r5.f14746f
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = -1
            if (r6 == 0) goto L_0x00b0
            int r6 = r0.f14721q
            if (r6 != r10) goto L_0x00b0
            if (r4 == 0) goto L_0x029a
        L_0x00b0:
            com.google.android.flexbox.FlexboxLayoutManager.C4089a.m11036b(r5)
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.f14717m
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r5 = r0.f14720p
            boolean r6 = r2.f4355g
            if (r6 != 0) goto L_0x01ae
            int r6 = r0.f14721q
            if (r6 != r10) goto L_0x00c1
            goto L_0x01ae
        L_0x00c1:
            if (r6 < 0) goto L_0x01aa
            int r11 = r22.mo4935b()
            if (r6 < r11) goto L_0x00cb
            goto L_0x01aa
        L_0x00cb:
            int r6 = r0.f14721q
            r4.f14741a = r6
            com.google.android.flexbox.c r11 = r0.f14713i
            int[] r11 = r11.f14779c
            r6 = r11[r6]
            r4.f14742b = r6
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r6 = r0.f14720p
            if (r6 == 0) goto L_0x00fb
            int r11 = r22.mo4935b()
            int r6 = r6.f14739b
            if (r6 < 0) goto L_0x00e7
            if (r6 >= r11) goto L_0x00e7
            r6 = 1
            goto L_0x00e8
        L_0x00e7:
            r6 = 0
        L_0x00e8:
            if (r6 == 0) goto L_0x00fb
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5175k()
            int r5 = r5.f14740c
            int r6 = r6 + r5
            r4.f14743c = r6
            r4.f14747g = r7
            r4.f14742b = r10
            goto L_0x01a8
        L_0x00fb:
            int r5 = r0.f14722r
            if (r5 != r9) goto L_0x0187
            int r5 = r0.f14721q
            android.view.View r5 = r0.findViewByPosition(r5)
            if (r5 == 0) goto L_0x016a
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5167c(r5)
            androidx.recyclerview.widget.z r11 = r0.f14718n
            int r11 = r11.mo5176l()
            if (r6 <= r11) goto L_0x011a
            com.google.android.flexbox.FlexboxLayoutManager.C4089a.m11035a(r4)
            goto L_0x01a8
        L_0x011a:
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5169e(r5)
            androidx.recyclerview.widget.z r11 = r0.f14718n
            int r11 = r11.mo5175k()
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x0135
            androidx.recyclerview.widget.z r5 = r0.f14718n
            int r5 = r5.mo5175k()
            r4.f14743c = r5
            r4.f14745e = r8
            goto L_0x01a8
        L_0x0135:
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5171g()
            androidx.recyclerview.widget.z r11 = r0.f14718n
            int r11 = r11.mo5166b(r5)
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x014f
            androidx.recyclerview.widget.z r5 = r0.f14718n
            int r5 = r5.mo5171g()
            r4.f14743c = r5
            r4.f14745e = r7
            goto L_0x01a8
        L_0x014f:
            boolean r6 = r4.f14745e
            if (r6 == 0) goto L_0x0161
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r5 = r6.mo5166b(r5)
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5180m()
            int r6 = r6 + r5
            goto L_0x0167
        L_0x0161:
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5169e(r5)
        L_0x0167:
            r4.f14743c = r6
            goto L_0x01a8
        L_0x016a:
            int r5 = r20.getChildCount()
            if (r5 <= 0) goto L_0x0183
            android.view.View r5 = r0.getChildAt(r8)
            if (r5 == 0) goto L_0x0183
            int r5 = r0.getPosition(r5)
            int r6 = r0.f14721q
            if (r6 >= r5) goto L_0x0180
            r5 = 1
            goto L_0x0181
        L_0x0180:
            r5 = 0
        L_0x0181:
            r4.f14745e = r5
        L_0x0183:
            com.google.android.flexbox.FlexboxLayoutManager.C4089a.m11035a(r4)
            goto L_0x01a8
        L_0x0187:
            boolean r5 = r20.mo16795j()
            if (r5 != 0) goto L_0x019d
            boolean r5 = r0.f14710f
            if (r5 == 0) goto L_0x019d
            int r5 = r0.f14722r
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5172h()
            int r5 = r5 - r6
            r4.f14743c = r5
            goto L_0x01a8
        L_0x019d:
            androidx.recyclerview.widget.z r5 = r0.f14718n
            int r5 = r5.mo5175k()
            int r6 = r0.f14722r
            int r5 = r5 + r6
            r4.f14743c = r5
        L_0x01a8:
            r5 = 1
            goto L_0x01af
        L_0x01aa:
            r0.f14721q = r10
            r0.f14722r = r9
        L_0x01ae:
            r5 = 0
        L_0x01af:
            if (r5 == 0) goto L_0x01b3
            goto L_0x0296
        L_0x01b3:
            int r5 = r20.getChildCount()
            if (r5 != 0) goto L_0x01bb
            goto L_0x028b
        L_0x01bb:
            boolean r5 = r4.f14745e
            if (r5 == 0) goto L_0x01c8
            int r5 = r22.mo4935b()
            android.view.View r5 = r0.mo16836o(r5)
            goto L_0x01d0
        L_0x01c8:
            int r5 = r22.mo4935b()
            android.view.View r5 = r0.mo16834m(r5)
        L_0x01d0:
            if (r5 == 0) goto L_0x028b
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r11 = r6.f14707c
            if (r11 != 0) goto L_0x01db
            androidx.recyclerview.widget.z r11 = r6.f14719o
            goto L_0x01dd
        L_0x01db:
            androidx.recyclerview.widget.z r11 = r6.f14718n
        L_0x01dd:
            boolean r6 = r6.mo16795j()
            if (r6 != 0) goto L_0x0200
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            boolean r6 = r6.f14710f
            if (r6 == 0) goto L_0x0200
            boolean r6 = r4.f14745e
            if (r6 == 0) goto L_0x01f9
            int r6 = r11.mo5169e(r5)
            int r11 = r11.mo5180m()
            int r11 = r11 + r6
            r4.f14743c = r11
            goto L_0x0216
        L_0x01f9:
            int r6 = r11.mo5166b(r5)
            r4.f14743c = r6
            goto L_0x0216
        L_0x0200:
            boolean r6 = r4.f14745e
            if (r6 == 0) goto L_0x0210
            int r6 = r11.mo5166b(r5)
            int r11 = r11.mo5180m()
            int r11 = r11 + r6
            r4.f14743c = r11
            goto L_0x0216
        L_0x0210:
            int r6 = r11.mo5169e(r5)
            r4.f14743c = r6
        L_0x0216:
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r6 = r6.getPosition(r5)
            r4.f14741a = r6
            r4.f14747g = r8
            com.google.android.flexbox.FlexboxLayoutManager r11 = com.google.android.flexbox.FlexboxLayoutManager.this
            com.google.android.flexbox.c r12 = r11.f14713i
            int[] r12 = r12.f14779c
            if (r6 == r10) goto L_0x0229
            goto L_0x022a
        L_0x0229:
            r6 = 0
        L_0x022a:
            r6 = r12[r6]
            if (r6 == r10) goto L_0x022f
            goto L_0x0230
        L_0x022f:
            r6 = 0
        L_0x0230:
            r4.f14742b = r6
            java.util.List<com.google.android.flexbox.b> r6 = r11.f14712h
            int r6 = r6.size()
            int r11 = r4.f14742b
            if (r6 <= r11) goto L_0x024a
            com.google.android.flexbox.FlexboxLayoutManager r6 = com.google.android.flexbox.FlexboxLayoutManager.this
            java.util.List<com.google.android.flexbox.b> r6 = r6.f14712h
            java.lang.Object r6 = r6.get(r11)
            com.google.android.flexbox.b r6 = (com.google.android.flexbox.C4092b) r6
            int r6 = r6.f14773o
            r4.f14741a = r6
        L_0x024a:
            boolean r6 = r2.f4355g
            if (r6 != 0) goto L_0x0289
            boolean r6 = r20.supportsPredictiveItemAnimations()
            if (r6 == 0) goto L_0x0289
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5169e(r5)
            androidx.recyclerview.widget.z r11 = r0.f14718n
            int r11 = r11.mo5171g()
            if (r6 >= r11) goto L_0x0273
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r5 = r6.mo5166b(r5)
            androidx.recyclerview.widget.z r6 = r0.f14718n
            int r6 = r6.mo5175k()
            if (r5 >= r6) goto L_0x0271
            goto L_0x0273
        L_0x0271:
            r5 = 0
            goto L_0x0274
        L_0x0273:
            r5 = 1
        L_0x0274:
            if (r5 == 0) goto L_0x0289
            boolean r5 = r4.f14745e
            if (r5 == 0) goto L_0x0281
            androidx.recyclerview.widget.z r5 = r0.f14718n
            int r5 = r5.mo5171g()
            goto L_0x0287
        L_0x0281:
            androidx.recyclerview.widget.z r5 = r0.f14718n
            int r5 = r5.mo5175k()
        L_0x0287:
            r4.f14743c = r5
        L_0x0289:
            r5 = 1
            goto L_0x028c
        L_0x028b:
            r5 = 0
        L_0x028c:
            if (r5 == 0) goto L_0x028f
            goto L_0x0296
        L_0x028f:
            com.google.android.flexbox.FlexboxLayoutManager.C4089a.m11035a(r4)
            r4.f14741a = r8
            r4.f14742b = r8
        L_0x0296:
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.f14717m
            r4.f14746f = r7
        L_0x029a:
            r20.detachAndScrapAttachedViews(r21)
            com.google.android.flexbox.FlexboxLayoutManager$a r4 = r0.f14717m
            boolean r5 = r4.f14745e
            if (r5 == 0) goto L_0x02a7
            r0.mo16847z(r4, r8, r7)
            goto L_0x02aa
        L_0x02a7:
            r0.mo16846y(r4, r8, r7)
        L_0x02aa:
            int r4 = r20.getWidth()
            int r5 = r20.getWidthMode()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r5 = r20.getHeight()
            int r6 = r20.getHeightMode()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            int r6 = r20.getWidth()
            int r11 = r20.getHeight()
            boolean r12 = r20.mo16795j()
            if (r12 == 0) goto L_0x02ef
            int r12 = r0.f14723s
            if (r12 == r9) goto L_0x02d8
            if (r12 == r6) goto L_0x02d8
            r9 = 1
            goto L_0x02d9
        L_0x02d8:
            r9 = 0
        L_0x02d9:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.f14716l
            boolean r13 = r12.f14750b
            if (r13 == 0) goto L_0x02ec
            android.content.Context r12 = r0.f14726v
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
            goto L_0x030d
        L_0x02ec:
            int r12 = r12.f14749a
            goto L_0x030d
        L_0x02ef:
            int r12 = r0.f14724t
            if (r12 == r9) goto L_0x02f7
            if (r12 == r11) goto L_0x02f7
            r9 = 1
            goto L_0x02f8
        L_0x02f7:
            r9 = 0
        L_0x02f8:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.f14716l
            boolean r13 = r12.f14750b
            if (r13 == 0) goto L_0x030b
            android.content.Context r12 = r0.f14726v
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.widthPixels
            goto L_0x030d
        L_0x030b:
            int r12 = r12.f14749a
        L_0x030d:
            r15 = r12
            r0.f14723s = r6
            r0.f14724t = r11
            int r6 = r0.f14728x
            r11 = 0
            if (r6 != r10) goto L_0x0383
            int r12 = r0.f14721q
            if (r12 != r10) goto L_0x031d
            if (r9 == 0) goto L_0x0383
        L_0x031d:
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            boolean r3 = r3.f14745e
            if (r3 == 0) goto L_0x0325
            goto L_0x0425
        L_0x0325:
            java.util.List<com.google.android.flexbox.b> r3 = r0.f14712h
            r3.clear()
            com.google.android.flexbox.c$a r3 = r0.f14729y
            r3.f14782a = r11
            r3.f14783b = r8
            boolean r3 = r20.mo16795j()
            if (r3 == 0) goto L_0x034c
            com.google.android.flexbox.c r11 = r0.f14713i
            com.google.android.flexbox.c$a r12 = r0.f14729y
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            int r3 = r3.f14741a
            java.util.List<com.google.android.flexbox.b> r6 = r0.f14712h
            r16 = 0
            r13 = r4
            r14 = r5
            r17 = r3
            r18 = r6
            r11.mo16867b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0361
        L_0x034c:
            com.google.android.flexbox.c r11 = r0.f14713i
            com.google.android.flexbox.c$a r12 = r0.f14729y
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            int r3 = r3.f14741a
            java.util.List<com.google.android.flexbox.b> r6 = r0.f14712h
            r16 = 0
            r13 = r5
            r14 = r4
            r17 = r3
            r18 = r6
            r11.mo16867b(r12, r13, r14, r15, r16, r17, r18)
        L_0x0361:
            com.google.android.flexbox.c$a r3 = r0.f14729y
            java.util.List<com.google.android.flexbox.b> r3 = r3.f14782a
            r0.f14712h = r3
            com.google.android.flexbox.c r3 = r0.f14713i
            r3.mo16872h(r4, r5, r8)
            com.google.android.flexbox.c r3 = r0.f14713i
            r3.mo16884u(r8)
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            com.google.android.flexbox.c r4 = r0.f14713i
            int[] r4 = r4.f14779c
            int r5 = r3.f14741a
            r4 = r4[r5]
            r3.f14742b = r4
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            r3.f14751c = r4
            goto L_0x0425
        L_0x0383:
            if (r6 == r10) goto L_0x038e
            com.google.android.flexbox.FlexboxLayoutManager$a r9 = r0.f14717m
            int r9 = r9.f14741a
            int r6 = java.lang.Math.min(r6, r9)
            goto L_0x0392
        L_0x038e:
            com.google.android.flexbox.FlexboxLayoutManager$a r6 = r0.f14717m
            int r6 = r6.f14741a
        L_0x0392:
            com.google.android.flexbox.c$a r9 = r0.f14729y
            r9.f14782a = r11
            r9.f14783b = r8
            boolean r9 = r20.mo16795j()
            if (r9 == 0) goto L_0x03da
            java.util.List<com.google.android.flexbox.b> r9 = r0.f14712h
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x03c3
            com.google.android.flexbox.c r3 = r0.f14713i
            java.util.List<com.google.android.flexbox.b> r9 = r0.f14712h
            r3.mo16869d(r6, r9)
            com.google.android.flexbox.c r11 = r0.f14713i
            com.google.android.flexbox.c$a r12 = r0.f14729y
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            int r3 = r3.f14741a
            java.util.List<com.google.android.flexbox.b> r9 = r0.f14712h
            r13 = r4
            r14 = r5
            r16 = r6
            r17 = r3
            r18 = r9
            r11.mo16867b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0415
        L_0x03c3:
            com.google.android.flexbox.c r9 = r0.f14713i
            r9.mo16873i(r3)
            com.google.android.flexbox.c r11 = r0.f14713i
            com.google.android.flexbox.c$a r12 = r0.f14729y
            r16 = 0
            java.util.List<com.google.android.flexbox.b> r3 = r0.f14712h
            r17 = -1
            r13 = r4
            r14 = r5
            r18 = r3
            r11.mo16867b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0415
        L_0x03da:
            java.util.List<com.google.android.flexbox.b> r9 = r0.f14712h
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x03ff
            com.google.android.flexbox.c r3 = r0.f14713i
            java.util.List<com.google.android.flexbox.b> r9 = r0.f14712h
            r3.mo16869d(r6, r9)
            com.google.android.flexbox.c r11 = r0.f14713i
            com.google.android.flexbox.c$a r12 = r0.f14729y
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            int r3 = r3.f14741a
            java.util.List<com.google.android.flexbox.b> r9 = r0.f14712h
            r13 = r5
            r14 = r4
            r16 = r6
            r17 = r3
            r18 = r9
            r11.mo16867b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0415
        L_0x03ff:
            com.google.android.flexbox.c r9 = r0.f14713i
            r9.mo16873i(r3)
            com.google.android.flexbox.c r11 = r0.f14713i
            com.google.android.flexbox.c$a r12 = r0.f14729y
            r16 = 0
            java.util.List<com.google.android.flexbox.b> r3 = r0.f14712h
            r17 = -1
            r13 = r5
            r14 = r4
            r18 = r3
            r11.mo16867b(r12, r13, r14, r15, r16, r17, r18)
        L_0x0415:
            com.google.android.flexbox.c$a r3 = r0.f14729y
            java.util.List<com.google.android.flexbox.b> r3 = r3.f14782a
            r0.f14712h = r3
            com.google.android.flexbox.c r3 = r0.f14713i
            r3.mo16872h(r4, r5, r6)
            com.google.android.flexbox.c r3 = r0.f14713i
            r3.mo16884u(r6)
        L_0x0425:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            r0.mo16833l(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$a r3 = r0.f14717m
            boolean r4 = r3.f14745e
            if (r4 == 0) goto L_0x0441
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            int r4 = r4.f14753e
            r0.mo16846y(r3, r7, r8)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            r0.mo16833l(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r3 = r3.f14753e
            goto L_0x0456
        L_0x0441:
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            int r4 = r4.f14753e
            r0.mo16847z(r3, r7, r8)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            r0.mo16833l(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r3 = r3.f14753e
            r19 = r4
            r4 = r3
            r3 = r19
        L_0x0456:
            int r5 = r20.getChildCount()
            if (r5 <= 0) goto L_0x0473
            com.google.android.flexbox.FlexboxLayoutManager$a r5 = r0.f14717m
            boolean r5 = r5.f14745e
            if (r5 == 0) goto L_0x046b
            int r3 = r0.fixLayoutEndGap(r3, r1, r2, r7)
            int r3 = r3 + r4
            r0.fixLayoutStartGap(r3, r1, r2, r8)
            goto L_0x0473
        L_0x046b:
            int r4 = r0.fixLayoutStartGap(r4, r1, r2, r7)
            int r4 = r4 + r3
            r0.fixLayoutEndGap(r4, r1, r2, r8)
        L_0x0473:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void onLayoutCompleted(RecyclerView.C1152x xVar) {
        super.onLayoutCompleted(xVar);
        this.f14720p = null;
        this.f14721q = -1;
        this.f14722r = Integer.MIN_VALUE;
        this.f14728x = -1;
        C4089a.m11036b(this.f14717m);
        this.f14725u.clear();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f14720p = (SavedState) parcelable;
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f14720p;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.f14739b = getPosition(childAt);
            savedState2.f14740c = this.f14718n.mo5169e(childAt) - this.f14718n.mo5175k();
        } else {
            savedState2.f14739b = -1;
        }
        return savedState2;
    }

    /* renamed from: p */
    public final View mo16837p(View view, C4092b bVar) {
        boolean j = mo16795j();
        int childCount = (getChildCount() - bVar.f14766h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f14710f || j) {
                    if (this.f14718n.mo5166b(view) >= this.f14718n.mo5166b(childAt)) {
                    }
                } else if (this.f14718n.mo5169e(view) <= this.f14718n.mo5169e(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: q */
    public final View mo16838q(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View childAt = getChildAt(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            boolean z3 = false;
            if (decoratedLeft >= width || decoratedRight >= paddingLeft) {
                z = true;
            } else {
                z = false;
            }
            if (decoratedTop >= height || decoratedBottom >= paddingTop) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: r */
    public final View mo16839r(int i, int i2, int i3) {
        int i4;
        int position;
        mo16832k();
        if (this.f14716l == null) {
            this.f14716l = new C4090b();
        }
        int k = this.f14718n.mo5175k();
        int g = this.f14718n.mo5171g();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).mo4706d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f14718n.mo5169e(childAt) >= k && this.f14718n.mo5166b(childAt) <= g) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e7  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16840s(int r19, androidx.recyclerview.widget.RecyclerView.C1145s r20, androidx.recyclerview.widget.RecyclerView.C1152x r21) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            r2 = 0
            if (r1 == 0) goto L_0x0201
            if (r19 != 0) goto L_0x000d
            goto L_0x0201
        L_0x000d:
            r18.mo16832k()
            com.google.android.flexbox.FlexboxLayoutManager$b r1 = r0.f14716l
            r3 = 1
            r1.f14758j = r3
            boolean r1 = r18.mo16795j()
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.f14710f
            if (r1 == 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r4 = -1
            if (r1 == 0) goto L_0x0028
            if (r19 >= 0) goto L_0x002c
            goto L_0x002a
        L_0x0028:
            if (r19 <= 0) goto L_0x002c
        L_0x002a:
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = -1
        L_0x002d:
            int r6 = java.lang.Math.abs(r19)
            com.google.android.flexbox.FlexboxLayoutManager$b r7 = r0.f14716l
            r7.f14757i = r5
            boolean r7 = r18.mo16795j()
            int r8 = r18.getWidth()
            int r9 = r18.getWidthMode()
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = r18.getHeight()
            int r10 = r18.getHeightMode()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            if (r7 != 0) goto L_0x0059
            boolean r10 = r0.f14710f
            if (r10 == 0) goto L_0x0059
            r10 = 1
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            if (r5 != r3) goto L_0x013b
            int r11 = r18.getChildCount()
            int r11 = r11 - r3
            android.view.View r11 = r0.getChildAt(r11)
            if (r11 != 0) goto L_0x0069
            goto L_0x01d7
        L_0x0069:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r0.f14716l
            androidx.recyclerview.widget.z r13 = r0.f14718n
            int r13 = r13.mo5166b(r11)
            r12.f14753e = r13
            int r12 = r0.getPosition(r11)
            com.google.android.flexbox.c r13 = r0.f14713i
            int[] r13 = r13.f14779c
            r13 = r13[r12]
            java.util.List<com.google.android.flexbox.b> r14 = r0.f14712h
            java.lang.Object r13 = r14.get(r13)
            com.google.android.flexbox.b r13 = (com.google.android.flexbox.C4092b) r13
            android.view.View r11 = r0.mo16837p(r11, r13)
            com.google.android.flexbox.FlexboxLayoutManager$b r13 = r0.f14716l
            r13.f14756h = r3
            int r12 = r12 + r3
            r13.f14752d = r12
            com.google.android.flexbox.c r14 = r0.f14713i
            int[] r14 = r14.f14779c
            int r15 = r14.length
            if (r15 > r12) goto L_0x009a
            r13.f14751c = r4
            goto L_0x009e
        L_0x009a:
            r12 = r14[r12]
            r13.f14751c = r12
        L_0x009e:
            if (r10 == 0) goto L_0x00c5
            androidx.recyclerview.widget.z r10 = r0.f14718n
            int r10 = r10.mo5169e(r11)
            r13.f14753e = r10
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f14716l
            androidx.recyclerview.widget.z r12 = r0.f14718n
            int r11 = r12.mo5169e(r11)
            int r11 = -r11
            androidx.recyclerview.widget.z r12 = r0.f14718n
            int r12 = r12.mo5175k()
            int r12 = r12 + r11
            r10.f14754f = r12
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f14716l
            int r11 = r10.f14754f
            int r11 = java.lang.Math.max(r11, r2)
            r10.f14754f = r11
            goto L_0x00de
        L_0x00c5:
            androidx.recyclerview.widget.z r10 = r0.f14718n
            int r10 = r10.mo5166b(r11)
            r13.f14753e = r10
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f14716l
            androidx.recyclerview.widget.z r12 = r0.f14718n
            int r11 = r12.mo5166b(r11)
            androidx.recyclerview.widget.z r12 = r0.f14718n
            int r12 = r12.mo5171g()
            int r11 = r11 - r12
            r10.f14754f = r11
        L_0x00de:
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f14716l
            int r10 = r10.f14751c
            if (r10 == r4) goto L_0x00ed
            java.util.List<com.google.android.flexbox.b> r4 = r0.f14712h
            int r4 = r4.size()
            int r4 = r4 - r3
            if (r10 <= r4) goto L_0x01cf
        L_0x00ed:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r3 = r3.f14752d
            int r4 = r18.getFlexItemCount()
            if (r3 > r4) goto L_0x01cf
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r4 = r3.f14754f
            int r14 = r6 - r4
            com.google.android.flexbox.c$a r11 = r0.f14729y
            r4 = 0
            r11.f14782a = r4
            r11.f14783b = r2
            if (r14 <= 0) goto L_0x01cf
            if (r7 == 0) goto L_0x0118
            com.google.android.flexbox.c r10 = r0.f14713i
            int r15 = r3.f14752d
            java.util.List<com.google.android.flexbox.b> r3 = r0.f14712h
            r16 = -1
            r12 = r8
            r13 = r9
            r17 = r3
            r10.mo16867b(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0127
        L_0x0118:
            com.google.android.flexbox.c r10 = r0.f14713i
            int r15 = r3.f14752d
            java.util.List<com.google.android.flexbox.b> r3 = r0.f14712h
            r16 = -1
            r12 = r9
            r13 = r8
            r17 = r3
            r10.mo16867b(r11, r12, r13, r14, r15, r16, r17)
        L_0x0127:
            com.google.android.flexbox.c r3 = r0.f14713i
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            int r4 = r4.f14752d
            r3.mo16872h(r8, r9, r4)
            com.google.android.flexbox.c r3 = r0.f14713i
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            int r4 = r4.f14752d
            r3.mo16884u(r4)
            goto L_0x01cf
        L_0x013b:
            android.view.View r7 = r0.getChildAt(r2)
            if (r7 != 0) goto L_0x0143
            goto L_0x01d7
        L_0x0143:
            com.google.android.flexbox.FlexboxLayoutManager$b r8 = r0.f14716l
            androidx.recyclerview.widget.z r9 = r0.f14718n
            int r9 = r9.mo5169e(r7)
            r8.f14753e = r9
            int r8 = r0.getPosition(r7)
            com.google.android.flexbox.c r9 = r0.f14713i
            int[] r9 = r9.f14779c
            r9 = r9[r8]
            java.util.List<com.google.android.flexbox.b> r11 = r0.f14712h
            java.lang.Object r9 = r11.get(r9)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C4092b) r9
            android.view.View r7 = r0.mo16835n(r7, r9)
            com.google.android.flexbox.FlexboxLayoutManager$b r9 = r0.f14716l
            r9.f14756h = r3
            com.google.android.flexbox.c r11 = r0.f14713i
            int[] r11 = r11.f14779c
            r11 = r11[r8]
            if (r11 != r4) goto L_0x0170
            r11 = 0
        L_0x0170:
            if (r11 <= 0) goto L_0x0184
            java.util.List<com.google.android.flexbox.b> r4 = r0.f14712h
            int r9 = r11 + -1
            java.lang.Object r4 = r4.get(r9)
            com.google.android.flexbox.b r4 = (com.google.android.flexbox.C4092b) r4
            com.google.android.flexbox.FlexboxLayoutManager$b r9 = r0.f14716l
            int r4 = r4.f14766h
            int r8 = r8 - r4
            r9.f14752d = r8
            goto L_0x0186
        L_0x0184:
            r9.f14752d = r4
        L_0x0186:
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f14716l
            if (r11 <= 0) goto L_0x018c
            int r11 = r11 - r3
            goto L_0x018d
        L_0x018c:
            r11 = 0
        L_0x018d:
            r4.f14751c = r11
            if (r10 == 0) goto L_0x01b5
            androidx.recyclerview.widget.z r3 = r0.f14718n
            int r3 = r3.mo5166b(r7)
            r4.f14753e = r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            androidx.recyclerview.widget.z r4 = r0.f14718n
            int r4 = r4.mo5166b(r7)
            androidx.recyclerview.widget.z r7 = r0.f14718n
            int r7 = r7.mo5171g()
            int r4 = r4 - r7
            r3.f14754f = r4
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r4 = r3.f14754f
            int r4 = java.lang.Math.max(r4, r2)
            r3.f14754f = r4
            goto L_0x01cf
        L_0x01b5:
            androidx.recyclerview.widget.z r3 = r0.f14718n
            int r3 = r3.mo5169e(r7)
            r4.f14753e = r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            androidx.recyclerview.widget.z r4 = r0.f14718n
            int r4 = r4.mo5169e(r7)
            int r4 = -r4
            androidx.recyclerview.widget.z r7 = r0.f14718n
            int r7 = r7.mo5175k()
            int r7 = r7 + r4
            r3.f14754f = r7
        L_0x01cf:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r4 = r3.f14754f
            int r4 = r6 - r4
            r3.f14749a = r4
        L_0x01d7:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f14716l
            int r4 = r3.f14754f
            r7 = r20
            r8 = r21
            int r3 = r0.mo16833l(r7, r8, r3)
            int r3 = r3 + r4
            if (r3 >= 0) goto L_0x01e7
            return r2
        L_0x01e7:
            if (r1 == 0) goto L_0x01ef
            if (r6 <= r3) goto L_0x01f4
            int r1 = -r5
            int r1 = r1 * r3
            goto L_0x01f6
        L_0x01ef:
            if (r6 <= r3) goto L_0x01f4
            int r1 = r5 * r3
            goto L_0x01f6
        L_0x01f4:
            r1 = r19
        L_0x01f6:
            androidx.recyclerview.widget.z r2 = r0.f14718n
            int r3 = -r1
            r2.mo5179p(r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r2 = r0.f14716l
            r2.f14755g = r1
            return r1
        L_0x0201:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo16840s(int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):int");
    }

    public final int scrollHorizontallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (!mo16795j() || this.f14707c == 0) {
            int s = mo16840s(i, sVar, xVar);
            this.f14725u.clear();
            return s;
        }
        int t = mo16841t(i);
        this.f14717m.f14744d += t;
        this.f14719o.mo5179p(-t);
        return t;
    }

    public final void scrollToPosition(int i) {
        this.f14721q = i;
        this.f14722r = Integer.MIN_VALUE;
        SavedState savedState = this.f14720p;
        if (savedState != null) {
            savedState.f14739b = -1;
        }
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (mo16795j() || (this.f14707c == 0 && !mo16795j())) {
            int s = mo16840s(i, sVar, xVar);
            this.f14725u.clear();
            return s;
        }
        int t = mo16841t(i);
        this.f14717m.f14744d += t;
        this.f14719o.mo5179p(-t);
        return t;
    }

    public final void setFlexLines(List<C4092b> list) {
        this.f14712h = list;
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C1152x xVar, int i) {
        C1240t tVar = new C1240t(recyclerView.getContext());
        tVar.f4336a = i;
        startSmoothScroll(tVar);
    }

    /* renamed from: t */
    public final int mo16841t(int i) {
        int i2;
        int i3;
        int i4;
        boolean z = false;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo16832k();
        boolean j = mo16795j();
        View view = this.f14727w;
        if (j) {
            i2 = view.getWidth();
        } else {
            i2 = view.getHeight();
        }
        if (j) {
            i3 = getWidth();
        } else {
            i3 = getHeight();
        }
        if (getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i3 + this.f14717m.f14744d) - i2, abs);
            }
            i4 = this.f14717m.f14744d;
            if (i4 + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((i3 - this.f14717m.f14744d) - i2, i);
        } else {
            i4 = this.f14717m.f14744d;
            if (i4 + i >= 0) {
                return i;
            }
        }
        return -i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4 = r0 - 1;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16842u(androidx.recyclerview.widget.RecyclerView.C1145s r12, com.google.android.flexbox.FlexboxLayoutManager.C4090b r13) {
        /*
            r11 = this;
            boolean r0 = r13.f14758j
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r13.f14757i
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L_0x0091
            int r0 = r13.f14754f
            if (r0 >= 0) goto L_0x0012
            goto L_0x011b
        L_0x0012:
            int r0 = r11.getChildCount()
            if (r0 != 0) goto L_0x001a
            goto L_0x011b
        L_0x001a:
            int r4 = r0 + -1
            android.view.View r5 = r11.getChildAt(r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x011b
        L_0x0024:
            com.google.android.flexbox.c r6 = r11.f14713i
            int[] r6 = r6.f14779c
            int r5 = r11.getPosition(r5)
            r5 = r6[r5]
            if (r5 != r3) goto L_0x0032
            goto L_0x011b
        L_0x0032:
            java.util.List<com.google.android.flexbox.b> r3 = r11.f14712h
            java.lang.Object r3 = r3.get(r5)
            com.google.android.flexbox.b r3 = (com.google.android.flexbox.C4092b) r3
            r6 = r4
        L_0x003b:
            if (r6 < 0) goto L_0x0089
            android.view.View r7 = r11.getChildAt(r6)
            if (r7 != 0) goto L_0x0044
            goto L_0x0086
        L_0x0044:
            int r8 = r13.f14754f
            boolean r9 = r11.mo16795j()
            if (r9 != 0) goto L_0x0059
            boolean r9 = r11.f14710f
            if (r9 == 0) goto L_0x0059
            androidx.recyclerview.widget.z r9 = r11.f14718n
            int r9 = r9.mo5166b(r7)
            if (r9 > r8) goto L_0x006a
            goto L_0x0068
        L_0x0059:
            androidx.recyclerview.widget.z r9 = r11.f14718n
            int r9 = r9.mo5169e(r7)
            androidx.recyclerview.widget.z r10 = r11.f14718n
            int r10 = r10.mo5170f()
            int r10 = r10 - r8
            if (r9 < r10) goto L_0x006a
        L_0x0068:
            r8 = 1
            goto L_0x006b
        L_0x006a:
            r8 = 0
        L_0x006b:
            if (r8 == 0) goto L_0x0089
            int r8 = r3.f14773o
            int r7 = r11.getPosition(r7)
            if (r8 != r7) goto L_0x0086
            if (r5 > 0) goto L_0x0079
            r0 = r6
            goto L_0x0089
        L_0x0079:
            int r0 = r13.f14757i
            int r5 = r5 + r0
            java.util.List<com.google.android.flexbox.b> r0 = r11.f14712h
            java.lang.Object r0 = r0.get(r5)
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.C4092b) r0
            r3 = r0
            r0 = r6
        L_0x0086:
            int r6 = r6 + -1
            goto L_0x003b
        L_0x0089:
            if (r4 < r0) goto L_0x011b
            r11.removeAndRecycleViewAt(r4, r12)
            int r4 = r4 + -1
            goto L_0x0089
        L_0x0091:
            int r0 = r13.f14754f
            if (r0 >= 0) goto L_0x0097
            goto L_0x011b
        L_0x0097:
            int r0 = r11.getChildCount()
            if (r0 != 0) goto L_0x009f
            goto L_0x011b
        L_0x009f:
            android.view.View r4 = r11.getChildAt(r1)
            if (r4 != 0) goto L_0x00a7
            goto L_0x011b
        L_0x00a7:
            com.google.android.flexbox.c r5 = r11.f14713i
            int[] r5 = r5.f14779c
            int r4 = r11.getPosition(r4)
            r4 = r5[r4]
            if (r4 != r3) goto L_0x00b5
            goto L_0x011b
        L_0x00b5:
            java.util.List<com.google.android.flexbox.b> r5 = r11.f14712h
            java.lang.Object r5 = r5.get(r4)
            com.google.android.flexbox.b r5 = (com.google.android.flexbox.C4092b) r5
            r6 = 0
        L_0x00be:
            if (r6 >= r0) goto L_0x0113
            android.view.View r7 = r11.getChildAt(r6)
            if (r7 != 0) goto L_0x00c7
            goto L_0x0110
        L_0x00c7:
            int r8 = r13.f14754f
            boolean r9 = r11.mo16795j()
            if (r9 != 0) goto L_0x00e3
            boolean r9 = r11.f14710f
            if (r9 == 0) goto L_0x00e3
            androidx.recyclerview.widget.z r9 = r11.f14718n
            int r9 = r9.mo5170f()
            androidx.recyclerview.widget.z r10 = r11.f14718n
            int r10 = r10.mo5169e(r7)
            int r9 = r9 - r10
            if (r9 > r8) goto L_0x00ed
            goto L_0x00eb
        L_0x00e3:
            androidx.recyclerview.widget.z r9 = r11.f14718n
            int r9 = r9.mo5166b(r7)
            if (r9 > r8) goto L_0x00ed
        L_0x00eb:
            r8 = 1
            goto L_0x00ee
        L_0x00ed:
            r8 = 0
        L_0x00ee:
            if (r8 == 0) goto L_0x0113
            int r8 = r5.f14774p
            int r7 = r11.getPosition(r7)
            if (r8 != r7) goto L_0x0110
            java.util.List<com.google.android.flexbox.b> r3 = r11.f14712h
            int r3 = r3.size()
            int r3 = r3 - r2
            if (r4 < r3) goto L_0x0103
            r3 = r6
            goto L_0x0113
        L_0x0103:
            int r3 = r13.f14757i
            int r4 = r4 + r3
            java.util.List<com.google.android.flexbox.b> r3 = r11.f14712h
            java.lang.Object r3 = r3.get(r4)
            com.google.android.flexbox.b r3 = (com.google.android.flexbox.C4092b) r3
            r5 = r3
            r3 = r6
        L_0x0110:
            int r6 = r6 + 1
            goto L_0x00be
        L_0x0113:
            if (r3 < 0) goto L_0x011b
            r11.removeAndRecycleViewAt(r3, r12)
            int r3 = r3 + -1
            goto L_0x0113
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo16842u(androidx.recyclerview.widget.RecyclerView$s, com.google.android.flexbox.FlexboxLayoutManager$b):void");
    }

    /* renamed from: v */
    public final void mo16843v() {
        int i;
        boolean z;
        if (mo16795j()) {
            i = getHeightMode();
        } else {
            i = getWidthMode();
        }
        C4090b bVar = this.f14716l;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f14750b = z;
    }

    /* renamed from: w */
    public final void mo16844w(int i) {
        if (this.f14706b != i) {
            removeAllViews();
            this.f14706b = i;
            this.f14718n = null;
            this.f14719o = null;
            this.f14712h.clear();
            C4089a.m11036b(this.f14717m);
            this.f14717m.f14744d = 0;
            requestLayout();
        }
    }

    /* renamed from: x */
    public final void mo16845x(int i) {
        int i2 = -1;
        View q = mo16838q(getChildCount() - 1, -1);
        if (q != null) {
            i2 = getPosition(q);
        }
        if (i < i2) {
            int childCount = getChildCount();
            this.f14713i.mo16874j(childCount);
            this.f14713i.mo16875k(childCount);
            this.f14713i.mo16873i(childCount);
            if (i < this.f14713i.f14779c.length) {
                this.f14728x = i;
                View childAt = getChildAt(0);
                if (childAt != null) {
                    this.f14721q = getPosition(childAt);
                    if (mo16795j() || !this.f14710f) {
                        this.f14722r = this.f14718n.mo5169e(childAt) - this.f14718n.mo5175k();
                        return;
                    }
                    this.f14722r = this.f14718n.mo5172h() + this.f14718n.mo5166b(childAt);
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo16846y(C4089a aVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            mo16843v();
        } else {
            this.f14716l.f14750b = false;
        }
        if (mo16795j() || !this.f14710f) {
            this.f14716l.f14749a = this.f14718n.mo5171g() - aVar.f14743c;
        } else {
            this.f14716l.f14749a = aVar.f14743c - getPaddingRight();
        }
        C4090b bVar = this.f14716l;
        bVar.f14752d = aVar.f14741a;
        bVar.f14756h = 1;
        bVar.f14757i = 1;
        bVar.f14753e = aVar.f14743c;
        bVar.f14754f = Integer.MIN_VALUE;
        bVar.f14751c = aVar.f14742b;
        if (z && this.f14712h.size() > 1 && (i = aVar.f14742b) >= 0 && i < this.f14712h.size() - 1) {
            C4090b bVar2 = this.f14716l;
            bVar2.f14751c++;
            bVar2.f14752d += this.f14712h.get(aVar.f14742b).f14766h;
        }
    }

    /* renamed from: z */
    public final void mo16847z(C4089a aVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            mo16843v();
        } else {
            this.f14716l.f14750b = false;
        }
        if (mo16795j() || !this.f14710f) {
            this.f14716l.f14749a = aVar.f14743c - this.f14718n.mo5175k();
        } else {
            this.f14716l.f14749a = (this.f14727w.getWidth() - aVar.f14743c) - this.f14718n.mo5175k();
        }
        C4090b bVar = this.f14716l;
        bVar.f14752d = aVar.f14741a;
        bVar.f14756h = 1;
        bVar.f14757i = -1;
        bVar.f14753e = aVar.f14743c;
        bVar.f14754f = Integer.MIN_VALUE;
        int i2 = aVar.f14742b;
        bVar.f14751c = i2;
        if (z && i2 > 0 && this.f14712h.size() > (i = aVar.f14742b)) {
            C4090b bVar2 = this.f14716l;
            bVar2.f14751c--;
            bVar2.f14752d -= this.f14712h.get(i).f14766h;
        }
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        mo16845x(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C4087a();

        /* renamed from: f */
        public float f14730f = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: g */
        public float f14731g = 1.0f;

        /* renamed from: h */
        public int f14732h = -1;

        /* renamed from: i */
        public float f14733i = -1.0f;

        /* renamed from: j */
        public int f14734j;

        /* renamed from: k */
        public int f14735k;

        /* renamed from: l */
        public int f14736l = 16777215;

        /* renamed from: m */
        public int f14737m = 16777215;

        /* renamed from: n */
        public boolean f14738n;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        public class C4087a implements Parcelable.Creator<LayoutParams> {
            public final Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final Object[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: G0 */
        public final boolean mo16749G0() {
            return this.f14738n;
        }

        /* renamed from: Q1 */
        public final int mo16750Q1() {
            return this.rightMargin;
        }

        /* renamed from: T1 */
        public final int mo16751T1() {
            return this.f14735k;
        }

        /* renamed from: b0 */
        public final int mo16752b0() {
            return this.f14732h;
        }

        /* renamed from: c0 */
        public final float mo16753c0() {
            return this.f14731g;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: f0 */
        public final int mo16754f0() {
            return this.f14734j;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxHeight() {
            return this.f14737m;
        }

        public final int getMaxWidth() {
            return this.f14736l;
        }

        public final int getOrder() {
            return 1;
        }

        public final int getWidth() {
            return this.width;
        }

        /* renamed from: m0 */
        public final int mo16760m0() {
            return this.topMargin;
        }

        /* renamed from: n0 */
        public final void mo16761n0(int i) {
            this.f14735k = i;
        }

        /* renamed from: p0 */
        public final float mo16762p0() {
            return this.f14730f;
        }

        /* renamed from: s1 */
        public final int mo16763s1() {
            return this.bottomMargin;
        }

        public final void setMinWidth(int i) {
            this.f14734j = i;
        }

        /* renamed from: v1 */
        public final int mo16765v1() {
            return this.leftMargin;
        }

        /* renamed from: w0 */
        public final float mo16766w0() {
            return this.f14733i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f14730f);
            parcel.writeFloat(this.f14731g);
            parcel.writeInt(this.f14732h);
            parcel.writeFloat(this.f14733i);
            parcel.writeInt(this.f14734j);
            parcel.writeInt(this.f14735k);
            parcel.writeInt(this.f14736l);
            parcel.writeInt(this.f14737m);
            parcel.writeByte(this.f14738n ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams() {
            super(-2, -2);
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f14730f = parcel.readFloat();
            this.f14731g = parcel.readFloat();
            this.f14732h = parcel.readInt();
            this.f14733i = parcel.readFloat();
            this.f14734j = parcel.readInt();
            this.f14735k = parcel.readInt();
            this.f14736l = parcel.readInt();
            this.f14737m = parcel.readInt();
            this.f14738n = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
