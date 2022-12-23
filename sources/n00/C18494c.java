package n00;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import ce0.C21100e;
import com.moovit.commons.view.pager.ViewPager;

/* renamed from: n00.c */
public final class C18494c extends PagerAdapter {

    /* renamed from: a */
    public ViewPager f47100a;

    /* renamed from: n00.c$a */
    public class C18495a implements ViewGroup.OnHierarchyChangeListener {
        public C18495a() {
        }

        public final void onChildViewAdded(View view, View view2) {
            C18494c cVar = C18494c.this;
            cVar.notifyDataSetChanged();
            ViewPager viewPager = cVar.f47100a;
            viewPager.setOffscreenPageLimit(viewPager.getChildCount());
        }

        public final void onChildViewRemoved(View view, View view2) {
            C18494c cVar = C18494c.this;
            cVar.notifyDataSetChanged();
            ViewPager viewPager = cVar.f47100a;
            viewPager.setOffscreenPageLimit(viewPager.getChildCount());
        }
    }

    public C18494c(ViewPager viewPager) {
        C21100e.m49373x(viewPager, "pager");
        this.f47100a = viewPager;
        viewPager.setOnHierarchyChangeListener(new C18495a());
    }

    public final int getCount() {
        return this.f47100a.getChildCount();
    }

    public final CharSequence getPageTitle(int i) {
        View childAt = this.f47100a.getChildAt(i);
        if (childAt instanceof TextView) {
            return ((TextView) childAt).getText();
        }
        return super.getPageTitle(i);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f47100a.getChildAt(i);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
