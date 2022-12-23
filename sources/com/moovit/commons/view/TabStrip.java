package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18159a;
import p622kz.C18165g;

public class TabStrip extends LinearLayout {

    /* renamed from: b */
    public final C15800a f41143b;

    /* renamed from: c */
    public int f41144c;

    /* renamed from: d */
    public int f41145d;

    /* renamed from: e */
    public float f41146e;

    /* renamed from: f */
    public Drawable f41147f;

    /* renamed from: g */
    public int f41148g;

    /* renamed from: h */
    public HorizontalScrollView f41149h;

    /* renamed from: i */
    public boolean f41150i;

    /* renamed from: j */
    public int f41151j;

    /* renamed from: k */
    public int f41152k;

    /* renamed from: l */
    public final int[] f41153l;

    /* renamed from: com.moovit.commons.view.TabStrip$a */
    public class C15800a implements View.OnClickListener {
        public C15800a() {
        }

        public final void onClick(View view) {
            TabStrip tabStrip = TabStrip.this;
            tabStrip.mo47134b(tabStrip.indexOfChild(view));
        }
    }

    /* renamed from: com.moovit.commons.view.TabStrip$b */
    public class C15801b implements ViewGroup.OnHierarchyChangeListener {
        public C15801b() {
        }

        public final void onChildViewAdded(View view, View view2) {
            view2.setOnClickListener(TabStrip.this.f41143b);
        }

        public final void onChildViewRemoved(View view, View view2) {
            TabStrip.this.getClass();
            view2.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: com.moovit.commons.view.TabStrip$c */
    public interface C15802c {
        /* renamed from: a */
        void mo47161a();

        /* renamed from: b */
        void mo47162b();
    }

    public TabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.tabStripStyle);
    }

    private int getActualIndicatorSize() {
        int i = this.f41148g;
        Drawable drawable = this.f41147f;
        return Math.max(i, drawable == null ? 0 : drawable.getIntrinsicHeight());
    }

    private float getActualPositionOffset() {
        int tabCount;
        int i = this.f41144c;
        float f = this.f41146e;
        if (((float) i) + f < BitmapDescriptorFactory.HUE_RED) {
            tabCount = -i;
        } else if (((float) i) + f <= ((float) (getTabCount() - 1))) {
            return this.f41146e;
        } else {
            tabCount = (getTabCount() - 1) - this.f41144c;
        }
        return (float) tabCount;
    }

    private void setAttachedAncestorScrollView(int i) {
        View view = null;
        if (i != 0) {
            View view2 = this;
            while (true) {
                ViewParent parent = view2.getParent();
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
                if (view2.getId() == i) {
                    view = view2;
                    break;
                }
            }
        }
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
        if (horizontalScrollView != null) {
            setAncestorScrollView(horizontalScrollView);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("No ancestor found with id ", i));
    }

    /* renamed from: a */
    public final void mo47133a(int[] iArr) {
        int i;
        int i2;
        float actualPositionOffset = getActualPositionOffset();
        int i3 = this.f41144c;
        int i4 = (int) (((float) i3) + actualPositionOffset);
        float f = actualPositionOffset - ((float) (i4 - i3));
        View childAt = getChildAt(i4);
        View childAt2 = getChildAt(this.f41144c);
        if (f == BitmapDescriptorFactory.HUE_RED) {
            i2 = childAt.getLeft() - childAt2.getLeft();
            i = childAt.getRight() - childAt2.getRight();
        } else {
            View childAt3 = getChildAt(i4 + 1);
            float f2 = 1.0f - f;
            float left = ((float) childAt3.getLeft()) * f;
            i = (int) (((f * ((float) childAt3.getRight())) + (f2 * ((float) childAt.getRight()))) - ((float) childAt2.getRight()));
            i2 = (int) ((left + (((float) childAt.getLeft()) * f2)) - ((float) childAt2.getLeft()));
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    /* renamed from: b */
    public void mo47134b(int i) {
        setSelectedTabPosition(i);
    }

    /* renamed from: c */
    public final void mo47135c() {
        View selectedTab;
        if (this.f41149h != null && (selectedTab = getSelectedTab()) != null) {
            int[] iArr = this.f41153l;
            mo47133a(iArr);
            int i = iArr[0];
            while (selectedTab != null && selectedTab != this.f41149h) {
                i += selectedTab.getLeft();
                selectedTab = (View) selectedTab.getParent();
            }
            this.f41149h.scrollTo(Math.max(0, i - this.f41152k), 0);
        }
    }

    public Drawable getIndicator() {
        return this.f41147f;
    }

    public int getIndicatorSize() {
        return this.f41148g;
    }

    public int getPermanentScrollOffset() {
        return this.f41152k;
    }

    public float getPositionOffset() {
        return this.f41146e;
    }

    public View getSelectedTab() {
        int i = this.f41144c;
        if (i >= 0) {
            return getChildAt(i);
        }
        return null;
    }

    public int getSelectedTabPosition() {
        return this.f41144c;
    }

    public int getTabCount() {
        return getChildCount();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41150i = true;
        int i = this.f41151j;
        if (i > 0) {
            setAttachedAncestorScrollView(i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41150i = false;
        this.f41149h = null;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41144c >= 0 && this.f41147f != null) {
            View selectedTab = getSelectedTab();
            mo47133a(this.f41153l);
            int left = selectedTab.getLeft() + this.f41153l[0];
            int right = selectedTab.getRight() + this.f41153l[1];
            int actualIndicatorSize = getActualIndicatorSize();
            int height = getHeight();
            this.f41147f.setBounds(left, height - actualIndicatorSize, right, height);
            this.f41147f.draw(canvas);
        }
    }

    public final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        if (this.f41144c < 0 && (i = this.f41145d) >= 0) {
            setSelectedTabPosition(i);
        } else if (isInEditMode() && getChildCount() > 0) {
            setSelectedTabPosition(0);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
        int i = bundle.getInt("selectedTabPosition", -1);
        if (i < getTabCount()) {
            setSelectedTabPosition(i);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("selectedTabPosition", this.f41144c);
        return bundle;
    }

    public void setAncestorScrollView(HorizontalScrollView horizontalScrollView) {
        this.f41149h = horizontalScrollView;
    }

    public void setIndicator(Drawable drawable) {
        Drawable drawable2;
        if (drawable == null) {
            drawable2 = null;
        } else {
            drawable2 = drawable.mutate();
        }
        this.f41147f = drawable2;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f41148g = i;
        invalidate();
    }

    public void setOnTabSelectionListener(C15802c cVar) {
    }

    public void setPermanentScrollOffset(int i) {
        this.f41152k = i;
        mo47135c();
    }

    public void setPositionOffset(float f) {
        this.f41146e = f;
        mo47135c();
        invalidate();
    }

    public void setSelectedTab(View view) {
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            if (getChildAt(i) == view) {
                setSelectedTabPosition(i);
                return;
            }
        }
    }

    public void setSelectedTabPosition(int i) {
        if (i < -1 || i >= getTabCount()) {
            StringBuilder r = C25541a.m63887r("position (", i, ") is not valid (tabCount=");
            r.append(getTabCount());
            throw new IllegalArgumentException(r.toString());
        }
        int i2 = this.f41144c;
        if (i2 != i) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                childAt.setSelected(false);
            }
            this.f41144c = i;
            mo47135c();
            View childAt2 = getChildAt(i);
            if (childAt2 != null) {
                childAt2.setSelected(true);
            }
            invalidate();
        }
    }

    /* JADX INFO: finally extract failed */
    public TabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41143b = new C15800a();
        this.f41144c = -1;
        this.f41150i = false;
        this.f41151j = -1;
        this.f41153l = new int[2];
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.TabStrip, i);
        try {
            setIndicator(o.getDrawable(C18165g.TabStrip_indicator));
            setIndicatorSize(o.getDimensionPixelSize(C18165g.TabStrip_indicatorSize, 1));
            setAncestorScrollView(o.getResourceId(C18165g.TabStrip_scrollViewId, -1));
            setPermanentScrollOffset(o.getDimensionPixelOffset(C18165g.TabStrip_permanentScrollOffset, 0));
            this.f41145d = o.getInt(C18165g.TabStrip_initialSelectedTab, -1);
            o.recycle();
            setOrientation(0);
            setWillNotDraw(false);
            setOnHierarchyChangeListener(new C15801b());
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public void setAncestorScrollView(int i) {
        if (i <= 0) {
            setAncestorScrollView((HorizontalScrollView) null);
        } else if (this.f41150i) {
            setAttachedAncestorScrollView(i);
        } else {
            setAncestorScrollView((HorizontalScrollView) null);
            this.f41151j = i;
        }
    }
}
