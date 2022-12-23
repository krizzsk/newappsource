package com.moovit.commons.view.pager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import n00.C18492b;
import n00.C18494c;
import p622kz.C18165g;
import p977zz.C20936e0;

public class ViewPager extends androidx.viewpager.widget.ViewPager {

    /* renamed from: h */
    public static final Class<?> f41297h = androidx.viewpager.widget.ViewPager.class;

    /* renamed from: b */
    public boolean f41298b = false;

    /* renamed from: c */
    public Integer f41299c = null;

    /* renamed from: d */
    public final C15825a f41300d = new C15825a();

    /* renamed from: e */
    public boolean f41301e;

    /* renamed from: f */
    public int f41302f = 0;

    /* renamed from: g */
    public final boolean f41303g;

    /* renamed from: com.moovit.commons.view.pager.ViewPager$a */
    public class C15825a extends DataSetObserver {
        public C15825a() {
        }

        public final void onChanged() {
            ViewPager viewPager = ViewPager.this;
            if (viewPager.mo47355d()) {
                viewPager.setCurrentLogicalItem(C20936e0.m49036b(0, viewPager.getPageCount() - 1, viewPager.f41302f));
            }
        }

        public final void onInvalidated() {
            super.onInvalidated();
        }
    }

    /* renamed from: com.moovit.commons.view.pager.ViewPager$b */
    public class C15826b extends ViewPager.SimpleOnPageChangeListener {
        public C15826b() {
        }

        public final void onPageSelected(int i) {
            ViewPager viewPager = ViewPager.this;
            viewPager.f41302f = viewPager.mo47353b(i);
        }
    }

    /* renamed from: com.moovit.commons.view.pager.ViewPager$c */
    public static abstract class C15827c extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: b */
        public Integer f41306b;

        /* renamed from: c */
        public Integer f41307c;

        /* renamed from: a */
        public abstract void mo45259a(int i);

        /* renamed from: b */
        public void mo47364b() {
        }

        public void onPageScrollStateChanged(int i) {
            this.f41307c = Integer.valueOf(i);
            if (i == 0) {
                Integer num = this.f41306b;
                if (num != null) {
                    mo45259a(num.intValue());
                    this.f41306b = null;
                    this.f41307c = null;
                }
            } else if (i == 1) {
                this.f41306b = null;
                this.f41307c = null;
            }
        }

        public final void onPageSelected(int i) {
            Integer valueOf = Integer.valueOf(i);
            this.f41306b = valueOf;
            valueOf.intValue();
            mo47364b();
            Integer num = this.f41307c;
            if (num != null && num.intValue() == 0) {
                mo45259a(i);
                this.f41306b = null;
                this.f41307c = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray n = UiUtils.m40255n(context, attributeSet, C18165g.ViewPager);
        try {
            if (n.getBoolean(C18165g.ViewPager_useChildrenAsPages, false)) {
                setAdapter(new C18492b((PagerAdapter) new C18494c(this), this));
                this.f41298b = true;
            }
            this.f41301e = n.getBoolean(C18165g.ViewPager_manualSwipingEnabled, true);
            this.f41303g = n.getBoolean(C18165g.ViewPager_measureHeightByChildren, true);
            n.recycle();
            addOnPageChangeListener(new C15826b());
        } catch (Throwable th) {
            n.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final Object mo47352a(int i) {
        Object obj;
        try {
            Field declaredField = f41297h.getDeclaredField("mItems");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(this);
            if (arrayList.isEmpty()) {
                return null;
            }
            Class<?> cls = arrayList.get(0).getClass();
            Field declaredField2 = cls.getDeclaredField("position");
            Field declaredField3 = cls.getDeclaredField("object");
            if (!declaredField2.isAccessible()) {
                declaredField2.setAccessible(true);
            }
            if (!declaredField3.isAccessible()) {
                declaredField3.setAccessible(true);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                int intValue = ((Integer) declaredField2.get(obj)).intValue();
                if (intValue >= i) {
                    if (intValue == i) {
                    }
                }
            }
            obj = null;
            if (obj != null) {
                return declaredField3.get(obj);
            }
            return null;
        } catch (ClassCastException | IllegalAccessException | NoSuchFieldException e) {
            throw new ApplicationBugException(e);
        }
    }

    /* renamed from: b */
    public final int mo47353b(int i) {
        return mo47355d() ? (getPageCount() - 1) - i : i;
    }

    /* renamed from: c */
    public final int mo47354c(int i) {
        return mo47355d() ? (getPageCount() - 1) - i : i;
    }

    /* renamed from: d */
    public final boolean mo47355d() {
        return (getAdapter() instanceof C18492b) && C15780a.m40268a(getContext());
    }

    /* renamed from: e */
    public final void mo47356e(int i, boolean z) {
        setCurrentItem(mo47354c(i), z);
    }

    public int getCurrentLogicalItem() {
        return mo47353b(super.getCurrentItem());
    }

    public int getPageCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    public Object getPrimaryItem() {
        return mo47352a(getCurrentItem());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f41301e && super.onInterceptTouchEvent(motionEvent);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (this.f41299c == null) {
            this.f41299c = Integer.valueOf(mode);
        }
        if (this.f41303g && this.f41299c.intValue() == Integer.MIN_VALUE) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = Math.max(i3, childAt.getMeasuredHeight());
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f41301e && super.onTouchEvent(motionEvent);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (!this.f41298b) {
            PagerAdapter adapter = getAdapter();
            if (adapter != null) {
                adapter.unregisterDataSetObserver(this.f41300d);
            }
            int currentLogicalItem = getCurrentLogicalItem();
            super.setAdapter(pagerAdapter);
            if (pagerAdapter != null) {
                pagerAdapter.registerDataSetObserver(this.f41300d);
            }
            setCurrentLogicalItem(C20936e0.m49036b(0, getPageCount() - 1, currentLogicalItem));
            return;
        }
        throw new IllegalStateException("Unable to replace the adapter (maybe useChildrenAsPages is true?)");
    }

    public void setCurrentLogicalItem(int i) {
        setCurrentItem(mo47354c(i));
    }

    public void setManualSwipingEnabled(boolean z) {
        this.f41301e = z;
    }
}
