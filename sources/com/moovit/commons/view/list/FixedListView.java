package com.moovit.commons.view.list;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import i00.C17525d;
import i00.C17528g;
import i00.C17529h;
import i00.C17534j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.WeakHashMap;
import k00.C17988b;
import m00.C18310d;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p622kz.C18159a;
import p622kz.C18165g;
import p977zz.C20943i;
import p977zz.C20972w;

public class FixedListView extends C17529h {

    /* renamed from: A */
    public boolean f41188A;

    /* renamed from: B */
    public float f41189B;

    /* renamed from: C */
    public boolean f41190C;

    /* renamed from: D */
    public boolean f41191D;

    /* renamed from: E */
    public C17528g f41192E;

    /* renamed from: F */
    public float f41193F;

    /* renamed from: G */
    public final C15817f f41194G;

    /* renamed from: H */
    public int f41195H;

    /* renamed from: I */
    public final C15811a f41196I;

    /* renamed from: l */
    public final C17525d f41197l;

    /* renamed from: m */
    public Drawable f41198m;

    /* renamed from: n */
    public int f41199n;

    /* renamed from: o */
    public int f41200o;

    /* renamed from: p */
    public final TreeSet<Integer> f41201p;

    /* renamed from: q */
    public int f41202q;

    /* renamed from: r */
    public Drawable f41203r;

    /* renamed from: s */
    public boolean f41204s;

    /* renamed from: t */
    public C15813c f41205t;

    /* renamed from: u */
    public int[] f41206u;

    /* renamed from: v */
    public int f41207v;

    /* renamed from: w */
    public int f41208w;

    /* renamed from: x */
    public final ArrayList<Integer> f41209x;

    /* renamed from: y */
    public Drawable f41210y;

    /* renamed from: z */
    public int f41211z;

    /* renamed from: com.moovit.commons.view.list.FixedListView$a */
    public class C15811a extends C20972w {
        public C15811a(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* renamed from: com.moovit.commons.view.list.FixedListView$b */
    public class C15812b extends ListView {
        public C15812b(Context context) {
            super(context, (AttributeSet) null, 0);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: com.moovit.commons.view.list.FixedListView$c */
    public interface C15813c {
    }

    /* renamed from: com.moovit.commons.view.list.FixedListView$d */
    public class C15814d extends ViewGroup {

        /* renamed from: b */
        public final ListAdapter f41227b;

        /* renamed from: c */
        public final C15812b f41228c;

        /* renamed from: d */
        public final C15815a f41229d = new C15815a();

        /* renamed from: e */
        public int[] f41230e;

        /* renamed from: f */
        public boolean f41231f = false;

        /* renamed from: g */
        public boolean f41232g = false;

        /* renamed from: h */
        public int[] f41233h = null;

        /* renamed from: i */
        public int f41234i = 0;

        /* renamed from: j */
        public int f41235j = -1;

        /* renamed from: com.moovit.commons.view.list.FixedListView$d$a */
        public class C15815a extends DataSetObserver {
            public C15815a() {
            }

            public final void onChanged() {
                C15814d dVar = C15814d.this;
                dVar.f41231f = false;
                FixedListView.this.requestLayout();
            }
        }

        public C15814d(Context context, C18310d dVar) {
            super(context);
            this.f41227b = dVar;
            C15812b bVar = new C15812b(context);
            bVar.setSelector(17170445);
            this.f41228c = bVar;
            bVar.setAdapter(dVar);
            addView(bVar);
        }

        private int getViewHeightSum() {
            int[] iArr = this.f41230e;
            if (iArr.length == 0) {
                return 0;
            }
            return mo47248a(iArr.length - 1);
        }

        /* renamed from: a */
        public final int mo47248a(int i) {
            boolean z;
            int i2 = this.f41235j;
            int i3 = 0;
            if (i2 == -1 || i < i2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i3 = this.f41234i;
            }
            return this.f41230e[i] + i3;
        }

        /* renamed from: b */
        public final void mo47249b(int i) {
            int i2;
            int[] iArr;
            boolean z;
            int i3;
            int i4;
            int height = getHeight();
            int height2 = this.f41228c.getHeight();
            int min = Math.min(i, height - height2);
            C15812b bVar = this.f41228c;
            bVar.setTranslationY((float) (min - bVar.getTop()));
            int length = this.f41230e.length - 1;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 <= length) {
                    int i7 = (i6 + length) >>> 1;
                    int a = mo47248a(i7);
                    if (a >= min) {
                        if (a <= min) {
                            i6 = i7;
                            break;
                        }
                        length = i7 - 1;
                    } else {
                        i6 = i7 + 1;
                    }
                } else {
                    break;
                }
            }
            if (i6 == 0) {
                i2 = 0;
            } else {
                i2 = mo47248a(i6 - 1);
            }
            this.f41232g = true;
            this.f41228c.setSelectionFromTop(i6, -(min - i2));
            this.f41232g = false;
            UiUtils.m40258q(this.f41228c);
            int dividerHeight = this.f41228c.getDividerHeight();
            int count = this.f41227b.getCount();
            int childCount = this.f41228c.getChildCount();
            int[] iArr2 = this.f41233h;
            if (iArr2 == null || iArr2.length < childCount) {
                this.f41233h = new int[childCount];
            }
            int firstVisiblePosition = this.f41228c.getFirstVisiblePosition();
            int i8 = 0;
            boolean z2 = false;
            while (i8 < childCount) {
                View childAt = this.f41228c.getChildAt(i8);
                int positionForView = this.f41228c.getPositionForView(childAt);
                int height3 = childAt.getHeight();
                if (positionForView < count - 1) {
                    height3 += dividerHeight;
                }
                if (positionForView == 0) {
                    i4 = mo47248a(i5);
                } else {
                    i4 = mo47248a(positionForView) - mo47248a(positionForView - 1);
                }
                int i9 = height3 - i4;
                this.f41233h[positionForView - firstVisiblePosition] = i9;
                if (i9 != 0) {
                    z2 = true;
                }
                i8++;
                i5 = 0;
            }
            if (z2) {
                int i11 = this.f41235j;
                if (i11 == -1 || firstVisiblePosition < i11) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i3 = i11;
                } else {
                    i3 = firstVisiblePosition;
                }
                int max = Math.max(i11 - 1, this.f41228c.getLastVisiblePosition());
                int i12 = 0;
                while (i3 <= max) {
                    if (i3 == this.f41235j) {
                        i12 += this.f41234i;
                    }
                    int i13 = i3 - firstVisiblePosition;
                    if (i13 >= 0 && i13 < childCount) {
                        i12 += this.f41233h[i13];
                    }
                    int[] iArr3 = this.f41230e;
                    iArr3[i3] = iArr3[i3] + i12;
                    i3++;
                }
                if (max == this.f41235j - 1) {
                    this.f41234i += i12;
                } else {
                    this.f41234i = i12;
                    this.f41235j = max + 1;
                }
            }
            int i14 = min + height2;
            int viewHeightSum = getViewHeightSum();
            if ((i14 >= height && viewHeightSum > height) || i14 > viewHeightSum) {
                FixedListView fixedListView = FixedListView.this;
                int indexOfChild = fixedListView.indexOfChild(this);
                if (indexOfChild != -1) {
                    int[] iArr4 = fixedListView.f41206u;
                    int i15 = indexOfChild + 1;
                    int i16 = viewHeightSum - (iArr4[i15] - iArr4[indexOfChild]);
                    while (true) {
                        iArr = fixedListView.f41206u;
                        if (i15 >= iArr.length) {
                            break;
                        }
                        iArr[i15] = iArr[i15] + i16;
                        i15++;
                    }
                    int i17 = iArr[iArr.length - 1];
                    int size = fixedListView.getSize();
                    if (fixedListView.getScroll() + size > i17) {
                        fixedListView.setScroll(i17 - size);
                    }
                    fixedListView.requestLayout();
                    super.requestLayout();
                    return;
                }
                throw new IllegalArgumentException("No child " + this);
            }
        }

        public ListView getListView() {
            return this.f41228c;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f41227b.registerDataSetObserver(this.f41229d);
            this.f41231f = false;
        }

        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f41227b.unregisterDataSetObserver(this.f41229d);
        }

        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            C15812b bVar = this.f41228c;
            bVar.layout(0, 0, bVar.getMeasuredWidth(), this.f41228c.getMeasuredHeight());
        }

        public final void onMeasure(int i, int i2) {
            if (!this.f41231f) {
                int viewTypeCount = this.f41227b.getViewTypeCount();
                int[] iArr = new int[viewTypeCount];
                for (int i3 = 0; i3 < viewTypeCount; i3++) {
                    iArr[i3] = -1;
                }
                int dividerHeight = this.f41228c.getDividerHeight();
                int count = this.f41227b.getCount();
                int[] iArr2 = this.f41230e;
                if (iArr2 == null || count != iArr2.length) {
                    this.f41230e = new int[count];
                }
                int size = View.MeasureSpec.getSize(i2);
                int i4 = 0;
                for (int i5 = 0; i5 < count; i5++) {
                    int itemViewType = this.f41227b.getItemViewType(i5);
                    int i6 = iArr[itemViewType];
                    if (i6 == -1 || i4 < size) {
                        View view = this.f41227b.getView(i5, (View) null, this);
                        view.measure(i, ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), 0, view.getLayoutParams().height));
                        i6 = view.getMeasuredHeight();
                        iArr[itemViewType] = i6;
                    }
                    i4 += i6;
                    if (i5 < count - 1) {
                        i4 += dividerHeight;
                    }
                    this.f41230e[i5] = i4;
                }
                this.f41235j = -1;
                this.f41234i = 0;
                this.f41231f = true;
            }
            int viewHeightSum = getViewHeightSum();
            this.f41228c.measure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), viewHeightSum), 1073741824));
            setMeasuredDimension(this.f41228c.getMeasuredWidth(), viewHeightSum);
        }

        public final void requestLayout() {
            if (!this.f41232g) {
                this.f41231f = false;
                super.requestLayout();
            }
        }
    }

    /* renamed from: com.moovit.commons.view.list.FixedListView$e */
    public static class C15816e implements C15813c {
    }

    /* renamed from: com.moovit.commons.view.list.FixedListView$f */
    public static class C15817f {

        /* renamed from: a */
        public Drawable f41238a;

        /* renamed from: b */
        public int f41239b;
    }

    public FixedListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.fixedListViewStyle);
    }

    /* renamed from: g */
    public static boolean m40336g(View view) {
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: h */
    public static LayoutParams m40337h(Context context, int i, int i2, int i3) {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.f41218g = C17988b.m44611b(0, context);
        layoutParams.f41219h = i;
        layoutParams.f41221j = C17988b.m44611b(i2, context);
        layoutParams.f41222k = i3;
        return layoutParams;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Integer num;
        this.f41209x.clear();
        if (i < 0) {
            i = getChildCount();
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f41213b;
        if (z && layoutParams2.f41212a) {
            throw new IllegalArgumentException("A view can't be both sticky and collapsible");
        } else if (layoutParams2.f41217f < BitmapDescriptorFactory.HUE_RED || layoutParams2.f41216e < BitmapDescriptorFactory.HUE_RED) {
            if (z) {
                this.f41201p.add(Integer.valueOf(i));
                num = this.f41201p.higher(Integer.valueOf(i));
            } else {
                num = this.f41201p.ceiling(Integer.valueOf(i));
            }
            while (num != null) {
                this.f41201p.remove(num);
                this.f41201p.add(Integer.valueOf(num.intValue() + 1));
                num = this.f41201p.higher(Integer.valueOf(num.intValue() + 1));
            }
            super.addView(view, i, layoutParams);
        } else {
            throw new IllegalArgumentException("A view can't have both proportion and weight");
        }
    }

    /* renamed from: c */
    public final int mo47205c(int i) {
        Integer higher = this.f41201p.higher(Integer.valueOf(this.f41202q));
        if (higher == null) {
            return Integer.MAX_VALUE;
        }
        return (int) (getChildAt(higher.intValue()).getY() - ((float) i));
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final int mo47207d(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f41203r != null) {
            int i = this.f41202q;
            if (i >= 0) {
                View childAt = getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f41224m && !layoutParams.f41214c) {
                    int i2 = layoutParams.bottomMargin;
                    int min = (int) Math.min(Math.abs(childAt.getTranslationY()), (float) mo47205c(childAt.getHeight() + ((int) childAt.getY()) + i2));
                    Drawable drawable = this.f41203r;
                    int x = (int) childAt.getX();
                    int height = childAt.getHeight() + ((int) childAt.getY()) + i2;
                    C17534j.m43664a(canvas, drawable, x, childAt.getWidth(), height, min);
                }
            } else if (this.f41204s) {
                int scroll = getScroll() + getPaddingTop();
                Canvas canvas2 = canvas;
                C17534j.m43664a(canvas2, this.f41203r, 0, getWidth(), scroll, Math.min(Math.abs(getScroll()), mo47205c(scroll)));
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C15811a aVar = this.f41196I;
        if (aVar == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        View[] a = aVar.mo53043a();
        int length = a.length;
        View[] viewArr = aVar.f52728b;
        if (viewArr == null || viewArr.length != length) {
            aVar.f52728b = new View[length];
        }
        for (int i = 0; i < length; i++) {
            aVar.f52728b[i] = a[i];
        }
        try {
            C15811a aVar2 = this.f41196I;
            View[] a2 = aVar2.mo53043a();
            int childCount = aVar2.f52727a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                a2[i2] = aVar2.f52728b[FixedListView.this.getChildDrawingOrder(childCount, i2)];
            }
            aVar2.f52729c = true;
            return super.dispatchTouchEvent(motionEvent);
        } finally {
            this.f41196I.mo53044b();
        }
    }

    /* renamed from: e */
    public final int mo47210e(int i) {
        int i2;
        int[] iArr;
        int paddingTop = i - getPaddingTop();
        int binarySearch = Arrays.binarySearch(this.f41206u, paddingTop);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        if (binarySearch >= 0 && binarySearch + 1 < this.f41206u.length) {
            while (true) {
                i2 = binarySearch + 1;
                iArr = this.f41206u;
                if (i2 < iArr.length && iArr[binarySearch] == iArr[i2]) {
                    binarySearch = i2;
                }
            }
            if (i2 >= iArr.length || iArr[binarySearch] > paddingTop || paddingTop >= iArr[i2]) {
                return -1;
            }
            return binarySearch;
        }
        return -1;
    }

    /* renamed from: f */
    public final int mo47211f(int i) {
        int d = mo47207d(i + 1);
        int i2 = 0;
        if (d == -1) {
            return 0;
        }
        mo47221i(this.f41194G, getChildAt(i), getChildAt(d));
        C15817f fVar = this.f41194G;
        Drawable drawable = fVar.f41238a;
        int i3 = fVar.f41239b;
        if (i3 >= 0) {
            i2 = i3;
        } else if (drawable != null) {
            i2 = drawable.getIntrinsicHeight();
        }
        this.f41194G.f41238a = null;
        return i2;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActualFooterSize() {
        boolean z;
        Drawable drawable = this.f41210y;
        if (drawable == null || !this.f41188A) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return 0;
        }
        int i = this.f41211z;
        if (i >= 0) {
            return i;
        }
        return drawable.getIntrinsicHeight();
    }

    public final View getChildAt(int i) {
        C15811a aVar = this.f41196I;
        if (aVar == null || !aVar.f52729c) {
            return super.getChildAt(i);
        }
        return aVar.f52728b[i];
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int i3;
        if (this.f41209x.size() != i) {
            this.f41209x.clear();
            this.f41209x.ensureCapacity(i);
            Iterator<Integer> it = this.f41201p.iterator();
            if (it.hasNext()) {
                i3 = it.next().intValue();
            } else {
                i3 = -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 != i3) {
                    View childAt = getChildAt(i5);
                    if (((LayoutParams) childAt.getLayoutParams()).f41214c) {
                        this.f41209x.add(Integer.valueOf(i5));
                        i4++;
                    } else if (!((LayoutParams) childAt.getLayoutParams()).f41215d) {
                        ArrayList<Integer> arrayList = this.f41209x;
                        arrayList.add(arrayList.size() - i4, Integer.valueOf(i5));
                        i4 = 0;
                    }
                } else if (it.hasNext()) {
                    i3 = it.next().intValue();
                } else {
                    i3 = -1;
                }
            }
            Iterator<Integer> it2 = this.f41201p.iterator();
            while (it2.hasNext()) {
                this.f41209x.add(Integer.valueOf(it2.next().intValue()));
            }
            for (int i6 = 0; i6 < i; i6++) {
                if (((LayoutParams) getChildAt(i6).getLayoutParams()).f41215d) {
                    this.f41209x.add(Integer.valueOf(i6));
                }
            }
        }
        return this.f41209x.get(i2).intValue();
    }

    public int getContentSize() {
        int[] iArr = this.f41206u;
        return getPaddingBottom() + getPaddingTop() + getActualFooterSize() + iArr[iArr.length - 1];
    }

    public Drawable getDivider() {
        return this.f41198m;
    }

    public int getDividerSize() {
        return this.f41200o;
    }

    /* renamed from: i */
    public final void mo47221i(C15817f fVar, View view, View view2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
        int max = Math.max(this.f41199n, Math.max(layoutParams.f41222k, layoutParams2.f41219h));
        if (max == this.f41199n) {
            Drawable drawable = this.f41198m;
            int i = this.f41200o;
            fVar.f41238a = drawable;
            fVar.f41239b = i;
        } else if (max == layoutParams.f41222k) {
            Drawable drawable2 = layoutParams.f41221j;
            int i2 = layoutParams.f41223l;
            fVar.f41238a = drawable2;
            fVar.f41239b = i2;
        } else {
            Drawable drawable3 = layoutParams2.f41218g;
            int i3 = layoutParams2.f41220i;
            fVar.f41238a = drawable3;
            fVar.f41239b = i3;
        }
    }

    /* renamed from: j */
    public final void mo47222j() {
        if (!isLayoutRequested() || this.f41190C) {
            int scroll = getScroll();
            int paddingTop = getPaddingTop();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (((LayoutParams) childAt.getLayoutParams()).f41215d) {
                    childAt.setTranslationY((float) ((scroll - this.f41206u[i]) + paddingTop));
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo47223k() {
        if (!isLayoutRequested() || this.f41190C) {
            int scroll = getScroll();
            int e = mo47210e(getPaddingTop() + scroll + this.f41207v);
            if (e < 0 || !(getChildAt(e) instanceof C15814d)) {
                e = -1;
            }
            int i = this.f41195H;
            if (!(i == e || i == -1)) {
                View childAt = getChildAt(i);
                if (childAt instanceof C15814d) {
                    ((C15814d) childAt).mo47249b(0);
                }
            }
            this.f41195H = e;
            if (e != -1) {
                ((C15814d) getChildAt(e)).mo47249b(scroll - this.f41206u[this.f41195H]);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47224l() {
        /*
            r7 = this;
            boolean r0 = r7.isLayoutRequested()
            if (r0 == 0) goto L_0x000b
            boolean r0 = r7.f41190C
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            int r0 = r7.getScroll()
            java.util.TreeSet<java.lang.Integer> r1 = r7.f41201p
            boolean r1 = r1.isEmpty()
            r2 = -1
            if (r1 == 0) goto L_0x0019
            goto L_0x0042
        L_0x0019:
            int r1 = r7.getScroll()
            int r3 = r7.getPaddingTop()
            int r3 = r3 + r1
            int r1 = r7.f41207v
            int r3 = r3 + r1
            int[] r1 = r7.f41206u
            int r4 = r1.length
            int r4 = r4 + r2
            r1 = r1[r4]
            int r1 = r1 + r2
            int r1 = java.lang.Math.min(r3, r1)
            int r1 = r7.mo47210e(r1)
            java.util.TreeSet<java.lang.Integer> r3 = r7.f41201p
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.floor(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r1 = -1
            goto L_0x0048
        L_0x0044:
            int r1 = r1.intValue()
        L_0x0048:
            int r3 = r7.f41202q
            if (r3 == r2) goto L_0x0057
            if (r3 == r1) goto L_0x0057
            android.view.View r2 = r7.getChildAt(r3)
            r3 = 0
            float r3 = (float) r3
            r2.setTranslationY(r3)
        L_0x0057:
            if (r1 < 0) goto L_0x00a4
            android.view.View r2 = r7.getChildAt(r1)
            int[] r3 = r7.f41206u
            r3 = r3[r1]
            int r0 = r0 - r3
            int r3 = r7.getPaddingTop()
            int r3 = r3 + r0
            int r0 = r7.f41207v
            int r3 = r3 + r0
            java.util.TreeSet<java.lang.Integer> r0 = r7.f41201p
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.higher(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            com.moovit.commons.view.list.FixedListView$LayoutParams r4 = (com.moovit.commons.view.list.FixedListView.LayoutParams) r4
            int r4 = r4.bottomMargin
            if (r0 == 0) goto L_0x00a0
            int[] r5 = r7.f41206u
            int r6 = r0.intValue()
            r5 = r5[r6]
            int r6 = r2.getBottom()
            int r6 = r6 + r4
            int r6 = r6 + r3
            if (r5 >= r6) goto L_0x00a0
            int r5 = r2.getBottom()
            int r5 = r5 + r4
            int r5 = r5 + r3
            int[] r4 = r7.f41206u
            int r0 = r0.intValue()
            r0 = r4[r0]
            int r5 = r5 - r0
            int r3 = r3 - r5
        L_0x00a0:
            float r0 = (float) r3
            r2.setTranslationY(r0)
        L_0x00a4:
            r7.f41202q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.list.FixedListView.mo47224l():void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41191D = false;
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        int contentSize = getContentSize();
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = width - getPaddingRight();
        boolean z2 = false;
        int d = mo47207d(0);
        while (d != -1) {
            View childAt = getChildAt(d);
            d = mo47207d(d + 1);
            if (d == -1) {
                break;
            }
            mo47221i(this.f41194G, childAt, getChildAt(d));
            C15817f fVar = this.f41194G;
            Drawable drawable = fVar.f41238a;
            int i2 = fVar.f41239b;
            if (i2 < 0) {
                if (drawable == null) {
                    i2 = 0;
                } else {
                    i2 = drawable.getIntrinsicHeight();
                }
            }
            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
            int i3 = i2 + bottom;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, paddingRight, i3);
                drawable.draw(canvas);
            }
        }
        this.f41197l.mo49976b(canvas, this);
        Drawable drawable2 = this.f41210y;
        if (drawable2 == null || drawable2.getOpacity() != -1) {
            z = false;
        } else {
            z = true;
        }
        int actualFooterSize = getActualFooterSize();
        if (z) {
            i = contentSize;
        } else {
            i = contentSize - actualFooterSize;
        }
        this.f41197l.mo49975a(canvas, this, 0, i, width, getHeight());
        this.f41194G.f41238a = null;
        if (this.f41210y != null && this.f41188A) {
            z2 = true;
        }
        if (z2) {
            int paddingBottom = contentSize - getPaddingBottom();
            this.f41210y.setBounds(paddingLeft, paddingBottom - getActualFooterSize(), paddingRight, paddingBottom);
            this.f41210y.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f41190C = true;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i5 = paddingTop;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (m40336g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = layoutParams.topMargin + i5;
                int i8 = layoutParams.leftMargin + paddingLeft;
                int i9 = measuredWidth + i8;
                int i11 = i7 + measuredHeight;
                if (!layoutParams.f41212a) {
                    childAt.layout(i8, i7, i9, i11);
                }
                if (!layoutParams.f41214c) {
                    i5 += mo47211f(i6) + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
                }
                if (layoutParams.f41213b) {
                    childAt.setTranslationY((float) 0);
                }
            }
        }
        if (!this.f41191D) {
            setScroll((int) (this.f41193F * ((float) getHeight())));
        }
        setScroll(getScroll());
        mo47222j();
        mo47224l();
        int scroll = getScroll() + paddingTop + this.f41207v;
        int i12 = this.f41202q;
        if (i12 >= 0) {
            View childAt2 = getChildAt(i12);
            if (!((LayoutParams) childAt2.getLayoutParams()).f41214c) {
                scroll += childAt2.getHeight();
            }
        }
        mo47223k();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt3 = getChildAt(i13);
            if (m40336g(childAt3)) {
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                int measuredWidth2 = childAt3.getMeasuredWidth();
                int measuredHeight2 = childAt3.getMeasuredHeight();
                int i14 = layoutParams2.topMargin + paddingTop;
                int i15 = layoutParams2.leftMargin + paddingLeft;
                int i16 = measuredWidth2 + i15;
                int i17 = i14 + measuredHeight2;
                if (layoutParams2.f41212a) {
                    if (paddingTop >= scroll || i17 < scroll) {
                        childAt3.layout(i15, i14, i16, i17);
                    } else {
                        ((C15816e) this.f41205t).getClass();
                        childAt3.layout(i15, i17 - (i17 - scroll), i16, i17);
                        this.f41208w = i13;
                    }
                }
                if (!layoutParams2.f41214c) {
                    paddingTop = mo47211f(i13) + measuredHeight2 + layoutParams2.topMargin + layoutParams2.bottomMargin + paddingTop;
                }
            }
        }
        this.f41191D = true;
        this.f41190C = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = -1
            r0.f41208w = r1
            r0.f41202q = r1
            r1 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r3 = android.view.View.MeasureSpec.getSize(r22)
            int r4 = android.view.View.MeasureSpec.getMode(r22)
            int r5 = android.view.View.MeasureSpec.getSize(r23)
            int r6 = android.view.View.MeasureSpec.getMode(r23)
            int r7 = r21.getChildCount()
            r0.f41207v = r1
            int[] r8 = r0.f41206u
            int r8 = r8.length
            int r9 = r7 + 1
            if (r8 == r9) goto L_0x002d
            int[] r8 = new int[r9]
            r0.f41206u = r8
        L_0x002d:
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0032:
            if (r9 >= r7) goto L_0x00f8
            int[] r15 = r0.f41206u
            r15[r9] = r10
            android.view.View r15 = r0.getChildAt(r9)
            boolean r16 = m40336g(r15)
            if (r16 != 0) goto L_0x0046
            r19 = r5
            goto L_0x00f1
        L_0x0046:
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            r1 = r16
            com.moovit.commons.view.list.FixedListView$LayoutParams r1 = (com.moovit.commons.view.list.FixedListView.LayoutParams) r1
            int r14 = r0.f41207v
            int r14 = r5 - r14
            boolean r8 = r15 instanceof com.moovit.commons.view.list.FixedListView.C15814d
            r19 = r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == 0) goto L_0x005f
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            goto L_0x0076
        L_0x005f:
            float r8 = r1.f41216e
            r18 = 0
            int r20 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r20 < 0) goto L_0x0081
            if (r6 == 0) goto L_0x0079
            float r5 = (float) r14
            float r8 = r8 * r5
            int r5 = java.lang.Math.round(r8)
            r8 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
        L_0x0076:
            r8 = r5
            r5 = 0
            goto L_0x00ae
        L_0x0079:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Proportion can't be used in wrap_content height mode"
            r1.<init>(r2)
            throw r1
        L_0x0081:
            float r8 = r1.f41217f
            r18 = 0
            int r20 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r20 < 0) goto L_0x00a7
            int r11 = r11 + 1
            float r12 = r12 + r8
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != r8) goto L_0x0096
            r5 = 0
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            goto L_0x00ae
        L_0x0096:
            r5 = 0
            boolean r8 = r1.f41225n
            if (r8 == 0) goto L_0x00a2
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r8)
            goto L_0x00ae
        L_0x00a2:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            goto L_0x00ae
        L_0x00a7:
            r5 = 0
            int r8 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r8)
        L_0x00ae:
            int r14 = r21.getPaddingLeft()
            int r14 = r3 - r14
            int r16 = r21.getPaddingRight()
            int r14 = r14 - r16
            int r5 = r1.leftMargin
            int r14 = r14 - r5
            int r5 = r1.rightMargin
            int r14 = r14 - r5
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            r15.measure(r5, r8)
            int r5 = r15.getMeasuredWidth()
            int r8 = r1.leftMargin
            int r5 = r5 + r8
            int r8 = r1.rightMargin
            int r5 = r5 + r8
            int r8 = r15.getMeasuredHeight()
            int r14 = r1.topMargin
            int r8 = r8 + r14
            int r14 = r1.bottomMargin
            int r8 = r8 + r14
            boolean r14 = r1.f41215d
            if (r14 == 0) goto L_0x00e4
            int r14 = r0.f41207v
            int r14 = r14 + r8
            r0.f41207v = r14
        L_0x00e4:
            if (r5 <= r13) goto L_0x00e7
            r13 = r5
        L_0x00e7:
            boolean r1 = r1.f41214c
            if (r1 != 0) goto L_0x00f1
            int r1 = r0.mo47211f(r9)
            int r1 = r1 + r8
            int r10 = r10 + r1
        L_0x00f1:
            int r9 = r9 + 1
            r5 = r19
            r1 = 0
            goto L_0x0032
        L_0x00f8:
            r19 = r5
            int[] r1 = r0.f41206u
            r1[r7] = r10
            float r1 = r0.f41189B
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0106
            r12 = r1
        L_0x0106:
            r1 = 0
            r17 = 0
        L_0x0109:
            int r2 = r21.getChildCount()
            if (r1 >= r2) goto L_0x016f
            android.view.View r2 = r0.getChildAt(r1)
            boolean r3 = m40336g(r2)
            if (r3 != 0) goto L_0x011a
            goto L_0x011e
        L_0x011a:
            boolean r3 = r2 instanceof com.moovit.commons.view.list.FixedListView.C15814d
            if (r3 == 0) goto L_0x0122
        L_0x011e:
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            goto L_0x016c
        L_0x0122:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            com.moovit.commons.view.list.FixedListView$LayoutParams r3 = (com.moovit.commons.view.list.FixedListView.LayoutParams) r3
            int r4 = r3.leftMargin
            int r4 = r13 - r4
            int r5 = r3.rightMargin
            int r4 = r4 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            float r3 = r3.f41217f
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x0157
            int r11 = r11 + -1
            if (r6 != r5) goto L_0x0152
            int r5 = r19 - r10
            if (r11 != 0) goto L_0x0147
            int r5 = r5 - r17
            goto L_0x014f
        L_0x0147:
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 / r12
            int r5 = java.lang.Math.round(r3)
        L_0x014f:
            int r17 = r17 + r5
            goto L_0x015b
        L_0x0152:
            int r5 = r2.getMeasuredHeight()
            goto L_0x015b
        L_0x0157:
            int r5 = r2.getMeasuredHeight()
        L_0x015b:
            r3 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            r2.measure(r4, r5)
            int[] r2 = r0.f41206u
            r4 = r2[r1]
            int r4 = r4 + r17
            r2[r1] = r4
        L_0x016c:
            int r1 = r1 + 1
            goto L_0x0109
        L_0x016f:
            int[] r1 = r0.f41206u
            r2 = r1[r7]
            int r2 = r2 + r17
            r1[r7] = r2
            int r10 = r10 + r17
            int r1 = r21.getActualFooterSize()
            int r1 = r1 + r10
            int r2 = r21.getPaddingLeft()
            int r3 = r21.getPaddingRight()
            int r3 = r3 + r2
            int r3 = r3 + r13
            int r2 = r21.getPaddingTop()
            int r4 = r21.getPaddingBottom()
            int r4 = r4 + r2
            int r4 = r4 + r1
            int r1 = r21.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r2 = r21.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r4, r2)
            r3 = r23
            int r2 = android.view.View.resolveSize(r2, r3)
            r3 = r22
            int r1 = android.view.View.resolveSize(r1, r3)
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.list.FixedListView.onMeasure(int, int):void");
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mo47222j();
        mo47224l();
        if (!isLayoutRequested()) {
            int scroll = getScroll();
            int i5 = this.f41202q;
            if (i5 >= 0 && !((LayoutParams) getChildAt(i5).getLayoutParams()).f41214c) {
                int[] iArr = this.f41206u;
                int i6 = this.f41202q;
                scroll += iArr[i6 + 1] - iArr[i6];
            }
            int e = mo47210e(getPaddingTop() + scroll + this.f41207v);
            int i7 = -1;
            if (e >= 0) {
                if (!((LayoutParams) getChildAt(e).getLayoutParams()).f41212a) {
                    e = -1;
                }
                i7 = e;
            }
            int i8 = this.f41208w;
            if (i8 >= 0 && i8 != i7) {
                int[] iArr2 = this.f41206u;
                int f = (iArr2[i8 + 1] - iArr2[i8]) - mo47211f(i8);
                C15813c cVar = this.f41205t;
                View childAt = getChildAt(this.f41208w);
                ((C15816e) cVar).getClass();
                childAt.setTop(childAt.getBottom() - f);
            }
            if (i7 >= 0) {
                View childAt2 = getChildAt(i7);
                int max = Math.max(0, ((this.f41206u[i7 + 1] - scroll) - this.f41207v) - mo47211f(i7));
                ((C15816e) this.f41205t).getClass();
                childAt2.setTop(childAt2.getBottom() - max);
            }
            this.f41208w = i7;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
        mo47223k();
    }

    public final void removeAllViews() {
        this.f41209x.clear();
        this.f41201p.clear();
        this.f41195H = -1;
        super.removeAllViews();
    }

    public final void removeView(View view) {
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            removeViewAt(indexOfChild);
        }
    }

    public final void removeViewAt(int i) {
        this.f41209x.clear();
        View childAt = getChildAt(i);
        if (this.f41201p.contains(Integer.valueOf(i))) {
            this.f41201p.remove(Integer.valueOf(i));
        }
        Object ceiling = this.f41201p.ceiling(Integer.valueOf(i));
        while (true) {
            Integer num = (Integer) ceiling;
            if (num == null) {
                break;
            }
            this.f41201p.remove(num);
            this.f41201p.add(Integer.valueOf(num.intValue() - 1));
            ceiling = this.f41201p.ceiling(num);
        }
        if (((LayoutParams) childAt.getLayoutParams()).f41215d && this.f41207v >= 0) {
            this.f41207v = -1;
        }
        if (this.f41195H == i) {
            this.f41195H = -1;
        }
        super.removeViewAt(i);
    }

    public final void removeViews(int i, int i2) {
        if (i2 != 0) {
            this.f41209x.clear();
            super.removeViews(i, i2);
            this.f41201p.clear();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (((LayoutParams) getChildAt(i3).getLayoutParams()).f41213b) {
                    this.f41201p.add(Integer.valueOf(i3));
                }
            }
            int i4 = this.f41195H;
            if (i4 >= i && i4 < i + i2) {
                this.f41195H = -1;
            }
        }
    }

    public void setCollapser(C15813c cVar) {
        this.f41205t = cVar;
    }

    public void setDivider(Drawable drawable) {
        this.f41198m = drawable;
        invalidate();
        requestLayout();
    }

    public void setDividerPriority(int i) {
        this.f41199n = i;
        invalidate();
        requestLayout();
    }

    public void setDividerSize(int i) {
        this.f41200o = i;
        invalidate();
        requestLayout();
    }

    public void setFooter(int i) {
        setFooter(C17988b.m44611b(i, getContext()));
    }

    public void setFooterSize(int i) {
        this.f41211z = i;
        invalidate();
        requestLayout();
    }

    public void setFooterVisible(boolean z) {
        if (this.f41188A != z) {
            this.f41188A = z;
            requestLayout();
            invalidate();
        }
    }

    public void setInitialScrollOffset(float f) {
        C21100e.m49357p(f, "initialScrollOffset");
        this.f41193F = f;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (this.f41192E == null) {
            this.f41192E = new C17528g(this);
        }
        LayoutTransition layoutTransition2 = getLayoutTransition();
        if (layoutTransition2 != null) {
            layoutTransition2.removeTransitionListener(this.f41192E);
        }
        super.setLayoutTransition(layoutTransition);
        if (layoutTransition != null) {
            layoutTransition.addTransitionListener(this.f41192E);
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f41203r = drawable;
        invalidate();
    }

    public void setStickyShadow(int i) {
        setShadowDrawable(C17988b.m44611b(i, getContext()));
    }

    /* JADX INFO: finally extract failed */
    public FixedListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15811a aVar;
        this.f41200o = -1;
        this.f41201p = new TreeSet<>();
        this.f41202q = -1;
        this.f41205t = new C15816e();
        this.f41206u = new int[1];
        this.f41207v = -1;
        this.f41208w = -1;
        this.f41209x = new ArrayList<>();
        this.f41211z = -1;
        this.f41190C = false;
        this.f41191D = false;
        this.f41194G = new C15817f();
        this.f41195H = -1;
        if (!(!C20943i.m49051d(17))) {
            aVar = null;
        } else {
            aVar = new C15811a(this);
        }
        this.f41196I = aVar;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.FixedListView, i);
        try {
            setDivider(o.getDrawable(C18165g.FixedListView_android_divider));
            setDividerPriority(o.getInteger(C18165g.FixedListView_dividerPriority, 1));
            setDividerSize(o.getDimensionPixelSize(C18165g.FixedListView_dividerSize, -1));
            this.f41189B = o.getFloat(C18165g.FixedListView_android_weightSum, BitmapDescriptorFactory.HUE_RED);
            setFooter(o.getResourceId(C18165g.FixedListView_footer, 0));
            setFooterSize(o.getDimensionPixelSize(C18165g.FixedListView_footerSize, -1));
            setFooterVisible(o.getBoolean(C18165g.FixedListView_footerVisible, true));
            setShadowDrawable(o.getDrawable(C18165g.FixedListView_shadowDrawable));
            this.f41204s = o.getBoolean(C18165g.FixedListView_showShadowAtTop, true);
            setInitialScrollOffset(o.getFloat(C18165g.FixedListView_initialScrollOffset, BitmapDescriptorFactory.HUE_RED));
            this.f41197l = C17525d.m43657c(context);
            o.recycle();
            setChildrenDrawingOrderEnabled(true);
            setWillNotDraw(false);
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return (LayoutParams) layoutParams;
        }
        if (layoutParams == null) {
            return new LayoutParams();
        }
        return new LayoutParams(layoutParams);
    }

    public void setFooter(Drawable drawable) {
        this.f41210y = drawable;
        invalidate();
        requestLayout();
    }

    public void setDivider(int i) {
        setDivider(C17988b.m44611b(i, getContext()));
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public boolean f41212a = false;

        /* renamed from: b */
        public boolean f41213b = false;

        /* renamed from: c */
        public boolean f41214c = false;

        /* renamed from: d */
        public boolean f41215d = false;

        /* renamed from: e */
        public float f41216e = -1.0f;

        /* renamed from: f */
        public float f41217f = -1.0f;

        /* renamed from: g */
        public Drawable f41218g;

        /* renamed from: h */
        public int f41219h;

        /* renamed from: i */
        public int f41220i = -1;

        /* renamed from: j */
        public Drawable f41221j;

        /* renamed from: k */
        public int f41222k;

        /* renamed from: l */
        public int f41223l = -1;

        /* renamed from: m */
        public boolean f41224m;

        /* renamed from: n */
        public boolean f41225n;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray n = UiUtils.m40255n(context, attributeSet, C18165g.FixedListView_Layout);
            try {
                this.f41212a = n.getBoolean(C18165g.FixedListView_Layout_layout_collapsible, false);
                this.f41213b = n.getBoolean(C18165g.FixedListView_Layout_layout_sticky, false);
                this.f41214c = n.getBoolean(C18165g.FixedListView_Layout_layout_floating, false);
                this.f41215d = n.getBoolean(C18165g.FixedListView_Layout_layout_header, false);
                this.f41216e = n.getFloat(C18165g.FixedListView_Layout_layout_proportion, -1.0f);
                this.f41217f = n.getFloat(C18165g.FixedListView_Layout_layout_weight, -1.0f);
                this.f41218g = n.getDrawable(C18165g.FixedListView_Layout_layout_topDivider);
                this.f41219h = n.getInteger(C18165g.FixedListView_Layout_layout_topDividerPriority, 0);
                this.f41220i = n.getDimensionPixelSize(C18165g.FixedListView_Layout_layout_topDividerSize, -1);
                this.f41221j = n.getDrawable(C18165g.FixedListView_Layout_layout_bottomDivider);
                this.f41222k = n.getInteger(C18165g.FixedListView_Layout_layout_bottomDividerPriority, 0);
                this.f41223l = n.getDimensionPixelSize(C18165g.FixedListView_Layout_layout_bottomDividerSize, -1);
                this.f41224m = n.getBoolean(C18165g.FixedListView_Layout_layout_showStickyShadow, true);
                this.f41225n = n.getBoolean(C18165g.FixedListView_Layout_layout_measureHeightAtMost, false);
            } finally {
                n.recycle();
            }
        }

        public LayoutParams() {
            super(-1, -2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
