package com.moovit.commons.view.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.moovit.commons.utils.collections.CollectionHashMap;
import i00.C17534j;
import java.util.Collection;
import java.util.Map;
import k00.C17988b;
import p622kz.C18159a;
import p622kz.C18165g;

public class SectionedListView extends FakeWindowBgListView {

    /* renamed from: c */
    public Drawable f41241c;

    /* renamed from: d */
    public int f41242d;

    /* renamed from: e */
    public Drawable f41243e;

    /* renamed from: f */
    public int f41244f;

    /* renamed from: g */
    public boolean f41245g;

    /* renamed from: h */
    public boolean f41246h;

    /* renamed from: i */
    public boolean f41247i;

    /* renamed from: j */
    public Drawable f41248j;

    /* renamed from: k */
    public final CollectionHashMap.ArrayListHashMap<Integer, View> f41249k;

    /* renamed from: l */
    public final CollectionHashMap.ArrayListHashMap<Integer, View> f41250l;

    /* renamed from: com.moovit.commons.view.list.SectionedListView$a */
    public static abstract class C15818a implements AdapterView.OnItemClickListener {
        /* renamed from: a */
        public abstract void mo45032a(C15819a aVar, int i, int i2);

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C15819a aVar = (C15819a) adapterView.getAdapter();
            int B = aVar.mo47287B(i);
            mo45032a(aVar, B, aVar.mo47314s(i, B));
        }
    }

    public SectionedListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.sectionedListViewStyle);
    }

    private View getPressedChild() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.isPressed()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo47261a(int i, View view) {
        this.f41250l.mo47001a(Integer.valueOf(i), view);
        C15819a adapter = getAdapter();
        if (adapter != null) {
            adapter.f41266v.mo47001a(Integer.valueOf(i), view);
            adapter.mo47313p();
        }
    }

    @Deprecated
    public final void addFooterView(View view, Object obj, boolean z) {
        throw new UnsupportedOperationException("Use addSectionFooterView(int sectionIndex, View view)");
    }

    @Deprecated
    public final void addHeaderView(View view, Object obj, boolean z) {
        throw new UnsupportedOperationException("Use addSectionHeaderView(int sectionIndex, View view)");
    }

    /* renamed from: b */
    public final void mo47264b(int i) {
        boolean z;
        C15819a adapter = getAdapter();
        if (adapter != null) {
            if (adapter.f41266v.remove(Integer.valueOf(i)) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                adapter.mo47313p();
            }
        }
        this.f41250l.remove(Integer.valueOf(i));
    }

    public final void dispatchDraw(Canvas canvas) {
        int firstVisiblePosition;
        int i;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f41248j;
        if (drawable != null && (firstVisiblePosition = getFirstVisiblePosition()) >= 0 && getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (firstVisiblePosition == 0) {
                i = getListPaddingTop() - childAt.getTop();
            } else {
                i = Integer.MAX_VALUE;
            }
            if (i != 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int scrollY = getScrollY() + getPaddingTop();
                C17534j.m43664a(canvas, drawable, paddingLeft, (getWidth() - paddingLeft) - paddingRight, scrollY, i);
            }
        }
    }

    public Drawable getItemDivider() {
        return this.f41241c;
    }

    public int getItemDividerSize() {
        return this.f41242d;
    }

    public Drawable getSectionDivider() {
        return this.f41243e;
    }

    public int getSectionDividerSize() {
        return this.f41244f;
    }

    public final int[] onCreateDrawableState(int i) {
        View pressedChild = getPressedChild();
        if (pressedChild == null) {
            return super.onCreateDrawableState(i);
        }
        int[] drawableState = pressedChild.getDrawableState();
        return View.mergeDrawableStates(super.onCreateDrawableState(i + drawableState.length), drawableState);
    }

    @Deprecated
    public final boolean removeFooterView(View view) {
        throw new UnsupportedOperationException("Use removeSectionFooterView(int sectionIndex, View view)");
    }

    @Deprecated
    public final boolean removeHeaderView(View view) {
        throw new UnsupportedOperationException("Use removeSectionHeaderView(int sectionIndex, View view)");
    }

    public void setAddStartSectionDivider(boolean z) {
        this.f41247i = z;
        C15819a adapter = getAdapter();
        if (adapter != null && adapter.f41264t != z) {
            adapter.f41264t = z;
            adapter.mo47313p();
        }
    }

    public void setFooterDividersEnabled(boolean z) {
        this.f41246h = z;
        C15819a adapter = getAdapter();
        if (adapter != null && adapter.f41263s != z) {
            adapter.f41263s = z;
            adapter.mo47313p();
        }
    }

    public void setHeaderDividersEnabled(boolean z) {
        this.f41245g = z;
        C15819a adapter = getAdapter();
        if (adapter != null && adapter.f41262r != z) {
            adapter.f41262r = z;
            adapter.mo47313p();
        }
    }

    public void setItemDivider(Drawable drawable) {
        this.f41241c = drawable;
        C15819a adapter = getAdapter();
        adapter.f41255k = drawable;
        adapter.mo47313p();
    }

    public void setItemDividerSize(int i) {
        this.f41242d = i;
        C15819a adapter = getAdapter();
        if (adapter != null) {
            adapter.f41254j = i;
        }
        requestLayout();
        invalidate();
    }

    public void setSectionDivider(Drawable drawable) {
        this.f41243e = drawable;
        C15819a adapter = getAdapter();
        if (adapter != null) {
            adapter.f41255k = drawable;
            adapter.mo47313p();
        }
    }

    public void setSectionDividerSize(int i) {
        this.f41244f = i;
        C15819a adapter = getAdapter();
        if (adapter != null) {
            adapter.f41256l = i;
        }
        requestLayout();
        invalidate();
    }

    public void setSectionedAdapter(C15819a<?, ?, ?, ?> aVar) {
        if (aVar != null) {
            aVar.f41267w = false;
            if (aVar.f41253i == null) {
                aVar.f41253i = this.f41241c;
                aVar.mo47313p();
            }
            aVar.f41254j = this.f41242d;
            if (aVar.f41255k == null) {
                aVar.f41255k = this.f41243e;
                aVar.mo47313p();
            }
            aVar.f41254j = this.f41242d;
            boolean z = this.f41247i;
            if (aVar.f41264t != z) {
                aVar.f41264t = z;
                aVar.mo47313p();
            }
            boolean z2 = this.f41245g;
            if (aVar.f41262r != z2) {
                aVar.f41262r = z2;
                aVar.mo47313p();
            }
            CollectionHashMap.ArrayListHashMap<Integer, View> arrayListHashMap = this.f41249k;
            aVar.f41265u.clear();
            for (Map.Entry next : arrayListHashMap.entrySet()) {
                aVar.f41265u.mo47002b((Integer) next.getKey(), (Collection) next.getValue());
            }
            aVar.mo47313p();
            boolean z3 = this.f41246h;
            if (aVar.f41263s != z3) {
                aVar.f41263s = z3;
                aVar.mo47313p();
            }
            CollectionHashMap.ArrayListHashMap<Integer, View> arrayListHashMap2 = this.f41250l;
            aVar.f41266v.clear();
            for (Map.Entry next2 : arrayListHashMap2.entrySet()) {
                aVar.f41266v.mo47002b((Integer) next2.getKey(), (Collection) next2.getValue());
            }
            aVar.mo47313p();
            aVar.f41267w = true;
            aVar.notifyDataSetChanged();
        }
        super.setAdapter(aVar);
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f41248j = drawable;
        invalidate();
    }

    public void setStickyShadow(int i) {
        setShadowDrawable(C17988b.m44611b(i, getContext()));
    }

    public SectionedListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41249k = new CollectionHashMap.ArrayListHashMap<>();
        this.f41250l = new CollectionHashMap.ArrayListHashMap<>();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C18165g.SectionedListView, i, 0);
        try {
            this.f41241c = obtainStyledAttributes.getDrawable(C18165g.SectionedListView_itemDivider);
            this.f41243e = obtainStyledAttributes.getDrawable(C18165g.SectionedListView_sectionDivider);
            this.f41242d = obtainStyledAttributes.getDimensionPixelSize(C18165g.SectionedListView_itemDividerSize, -1);
            this.f41244f = obtainStyledAttributes.getDimensionPixelSize(C18165g.SectionedListView_sectionDividerSize, -1);
            this.f41245g = obtainStyledAttributes.getBoolean(C18165g.SectionedListView_android_headerDividersEnabled, false);
            this.f41246h = obtainStyledAttributes.getBoolean(C18165g.SectionedListView_android_footerDividersEnabled, false);
            this.f41247i = obtainStyledAttributes.getBoolean(C18165g.SectionedListView_addStartSectionDivider, false);
            setShadowDrawable(obtainStyledAttributes.getDrawable(C18165g.SectionedListView_shadowDrawable));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Deprecated
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C15819a) {
            setSectionedAdapter((C15819a) listAdapter);
            return;
        }
        throw new UnsupportedOperationException("May only use a SectionedListAdapter");
    }

    public C15819a<?, ?, ?, ?> getAdapter() {
        return (C15819a) super.getAdapter();
    }
}
