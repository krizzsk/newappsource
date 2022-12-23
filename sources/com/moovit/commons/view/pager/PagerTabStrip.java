package com.moovit.commons.view.pager;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.viewpager.widget.PagerAdapter;
import ce0.C21100e;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.TabStrip;
import n00.C18498f;
import n00.C18501g;
import p370ar.C13506a;
import p622kz.C18159a;
import p622kz.C18165g;

public class PagerTabStrip extends TabStrip {

    /* renamed from: m */
    public final C15823a f41281m;

    /* renamed from: n */
    public boolean f41282n;

    /* renamed from: o */
    public C18501g f41283o;

    /* renamed from: p */
    public int f41284p;

    /* renamed from: q */
    public final LayoutInflater f41285q;

    /* renamed from: com.moovit.commons.view.pager.PagerTabStrip$a */
    public class C15823a extends C18498f {
        public C15823a() {
        }

        /* renamed from: c */
        public final void mo47334c(float f, int i) {
            PagerTabStrip pagerTabStrip = PagerTabStrip.this;
            pagerTabStrip.setPositionOffset((f + ((float) i)) - ((float) pagerTabStrip.f41281m.f47110f.getCurrentItem()));
        }

        /* renamed from: d */
        public final void mo47343d(int i) {
            PagerTabStrip pagerTabStrip = PagerTabStrip.this;
            int selectedTabPosition = pagerTabStrip.getSelectedTabPosition();
            pagerTabStrip.setSelectedTabPosition(i);
            pagerTabStrip.setPositionOffset((pagerTabStrip.getPositionOffset() + ((float) selectedTabPosition)) - ((float) i));
        }

        /* renamed from: h */
        public final void mo47335h() {
            PagerTabStrip.this.mo47336d();
            ViewPager viewPager = this.f47110f;
            if (viewPager != null && this.f47111g != null) {
                mo47343d(viewPager.getCurrentItem());
            }
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.pagerTabStripStyle);
    }

    /* renamed from: b */
    public final void mo47134b(int i) {
        ViewPager viewPager = this.f41281m.f47110f;
        if (viewPager == null) {
            setSelectedTabPosition(i);
        } else if (viewPager.getCurrentItem() != i) {
            viewPager.setCurrentItem(i, true);
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47336d() {
        /*
            r6 = this;
            boolean r0 = r6.f41282n
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.moovit.commons.view.pager.PagerTabStrip$a r0 = r6.f41281m
            androidx.viewpager.widget.PagerAdapter r0 = r0.f47111g
            r1 = 0
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x0012
        L_0x000e:
            int r0 = r0.getCount()
        L_0x0012:
            int r2 = r6.getChildCount()
            int r0 = r0 - r2
            r3 = 0
            if (r0 != 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            int r4 = java.lang.Math.abs(r0)
            if (r0 >= 0) goto L_0x002c
        L_0x0021:
            int r0 = r4 + -1
            if (r4 <= 0) goto L_0x005e
            int r2 = r2 + -1
            r6.removeViewAt(r2)
            r4 = r0
            goto L_0x0021
        L_0x002c:
            com.moovit.commons.view.pager.PagerTabStrip$a r0 = r6.f41281m
            androidx.viewpager.widget.PagerAdapter r0 = r0.f47111g
        L_0x0030:
            int r0 = r4 + -1
            if (r4 <= 0) goto L_0x005e
            android.view.LayoutInflater r2 = r6.f41285q
            int r4 = r6.f41284p
            if (r4 != 0) goto L_0x0055
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r4 = r6.getContext()
            int r5 = r6.getPagerTabTextViewStripStyle()
            r2.<init>(r4, r3, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r1, r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.weight = r5
            r2.setLayoutParams(r4)
            goto L_0x0059
        L_0x0055:
            android.view.View r2 = r2.inflate(r4, r6, r1)
        L_0x0059:
            r6.addView(r2)
            r4 = r0
            goto L_0x0030
        L_0x005e:
            com.moovit.commons.view.pager.PagerTabStrip$a r0 = r6.f41281m
            androidx.viewpager.widget.PagerAdapter r0 = r0.f47111g
            if (r0 == 0) goto L_0x009c
            n00.g r2 = r6.f41283o
            if (r2 != 0) goto L_0x0069
            goto L_0x009c
        L_0x0069:
            int r2 = r0.getCount()
        L_0x006d:
            if (r1 >= r2) goto L_0x009c
            n00.g r4 = r6.f41283o
            android.view.View r5 = r6.getChildAt(r1)
            ar.a r4 = (p370ar.C13506a) r4
            r4.getClass()
            boolean r4 = r5 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x0081
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x0090
        L_0x0081:
            int r4 = p622kz.C18162d.title
            android.view.View r4 = r5.findViewById(r4)
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L_0x008f
            r5 = r4
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x0090
        L_0x008f:
            r5 = r3
        L_0x0090:
            if (r5 == 0) goto L_0x0099
            java.lang.CharSequence r4 = r0.getPageTitle(r1)
            r5.setText(r4)
        L_0x0099:
            int r1 = r1 + 1
            goto L_0x006d
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.pager.PagerTabStrip.mo47336d():void");
    }

    public int getPagerTabTextViewStripStyle() {
        return C18159a.pagerTabStripTextViewTabStyle;
    }

    public int getTabViewResId() {
        return this.f41284p;
    }

    public C18501g getTabsAdapter() {
        return this.f41283o;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41281m.mo50918b(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15823a aVar = this.f41281m;
        aVar.f47108d = null;
        if (aVar.f47109e != -1) {
            aVar.mo50921g((ViewPager) null);
        }
    }

    public void setTabViewResId(int i) {
        C21100e.m49359q(i, "tabViewResId");
        this.f41284p = i;
        mo47336d();
        C15823a aVar = this.f41281m;
        ViewPager viewPager = aVar.f47110f;
        PagerAdapter pagerAdapter = aVar.f47111g;
        if (viewPager != null && pagerAdapter != null) {
            setSelectedTabPosition(viewPager.getCurrentItem());
        }
    }

    public void setTabsAdapter(C18501g gVar) {
        this.f41283o = gVar;
        mo47336d();
        C15823a aVar = this.f41281m;
        ViewPager viewPager = aVar.f47110f;
        PagerAdapter pagerAdapter = aVar.f47111g;
        if (viewPager != null && pagerAdapter != null) {
            setSelectedTabPosition(viewPager.getCurrentItem());
        }
    }

    public void setUseChildrenAsTabs(boolean z) {
        this.f41282n = z;
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15823a aVar = new C15823a();
        this.f41281m = aVar;
        this.f41285q = LayoutInflater.from(context);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.PagerTabStrip, i);
        try {
            setTabViewResId(o.getResourceId(C18165g.PagerTabStrip_tabViewLayoutId, 0));
            setUseChildrenAsTabs(o.getBoolean(C18165g.PagerTabStrip_useChildrenAsTabs, false));
            this.f41283o = o.getBoolean(C18165g.PagerTabStrip_useDefaultTabsAdapter, true) ? new C13506a(7) : null;
            aVar.mo50920f(o.getResourceId(C18165g.PagerTabStrip_pagerViewId, -1));
        } finally {
            o.recycle();
        }
    }
}
