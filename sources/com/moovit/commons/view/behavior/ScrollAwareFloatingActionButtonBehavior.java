package com.moovit.commons.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomappbar.C13910b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

public class ScrollAwareFloatingActionButtonBehavior extends FloatingActionButton.Behavior {

    /* renamed from: c */
    public C15808a f41173c = null;

    /* renamed from: com.moovit.commons.view.behavior.ScrollAwareFloatingActionButtonBehavior$a */
    public class C15808a extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: b */
        public int f41174b = 0;

        /* renamed from: c */
        public final WeakReference f41175c;

        /* renamed from: d */
        public final WeakReference f41176d;

        /* renamed from: e */
        public final WeakReference f41177e;

        public C15808a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, com.moovit.commons.view.pager.ViewPager viewPager) {
            this.f41174b = viewPager.getCurrentItem();
            this.f41175c = new WeakReference(coordinatorLayout);
            this.f41176d = new WeakReference(floatingActionButton);
            this.f41177e = new WeakReference(viewPager);
        }

        public final void onPageScrollStateChanged(int i) {
            com.moovit.commons.view.pager.ViewPager viewPager;
            int currentItem;
            FloatingActionButton floatingActionButton;
            if (i == 2 && (viewPager = (com.moovit.commons.view.pager.ViewPager) this.f41177e.get()) != null && (currentItem = viewPager.getCurrentItem()) != this.f41174b && ((CoordinatorLayout) this.f41175c.get()) != null && (floatingActionButton = (FloatingActionButton) this.f41176d.get()) != null && floatingActionButton.getVisibility() != 0) {
                this.f41174b = currentItem;
                ScrollAwareFloatingActionButtonBehavior.this.mo47191e(floatingActionButton);
            }
        }
    }

    public ScrollAwareFloatingActionButtonBehavior() {
    }

    /* renamed from: a */
    public final boolean mo41721a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        if (!(view instanceof com.moovit.commons.view.pager.ViewPager)) {
            super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
            return false;
        } else if (this.f41173c != null) {
            return true;
        } else {
            com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) view;
            C15808a aVar = new C15808a(coordinatorLayout, floatingActionButton, viewPager);
            this.f41173c = aVar;
            viewPager.addOnPageChangeListener(aVar);
            return true;
        }
    }

    /* renamed from: e */
    public void mo47191e(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo41677n((C13910b.C13911a) null, true);
    }

    /* renamed from: f */
    public void mo47192f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
        floatingActionButton.mo41671h((C13910b) null, true);
    }

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if ((view2 instanceof com.moovit.commons.view.pager.ViewPager) || super.layoutDependsOn(coordinatorLayout, floatingActionButton, view2)) {
            return true;
        }
        return false;
    }

    public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if (view2 instanceof com.moovit.commons.view.pager.ViewPager) {
            C15808a aVar = this.f41173c;
            if (aVar != null) {
                ((com.moovit.commons.view.pager.ViewPager) view2).removeOnPageChangeListener(aVar);
                this.f41173c = null;
                return;
            }
            return;
        }
        super.onDependentViewRemoved(coordinatorLayout, floatingActionButton, view2);
    }

    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        super.onNestedScroll(coordinatorLayout, floatingActionButton, view2, i, i2, i3, i4);
        if (i2 > 0) {
            if (floatingActionButton.getVisibility() == 0) {
                mo47192f(coordinatorLayout, floatingActionButton);
            }
        } else if (i2 < 0 && floatingActionButton.getVisibility() != 0) {
            mo47191e(floatingActionButton);
        }
    }

    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if (i == 2 || super.onStartNestedScroll(coordinatorLayout, floatingActionButton, view2, view3, i)) {
            return true;
        }
        return false;
    }

    public ScrollAwareFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
    }
}
