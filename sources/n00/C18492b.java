package n00;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.view.pager.ViewPager;

/* renamed from: n00.b */
public final class C18492b extends PagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f47097a;

    /* renamed from: b */
    public final boolean f47098b;

    /* renamed from: n00.b$a */
    public class C18493a extends DataSetObserver {
        public C18493a() {
        }

        public final void onChanged() {
            C18492b.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            C18492b.this.notifyDataSetChanged();
        }
    }

    public C18492b(PagerAdapter pagerAdapter, ViewPager viewPager) {
        this(pagerAdapter, C15780a.m40268a(viewPager.getContext()));
    }

    /* renamed from: a */
    public final int mo50912a(int i) {
        return this.f47098b ? (getCount() - 1) - i : i;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f47097a.destroyItem(viewGroup, mo50912a(i), obj);
    }

    public final void finishUpdate(ViewGroup viewGroup) {
        this.f47097a.finishUpdate(viewGroup);
    }

    public final int getCount() {
        return this.f47097a.getCount();
    }

    public final int getItemPosition(Object obj) {
        int itemPosition = this.f47097a.getItemPosition(obj);
        if (itemPosition >= 0 && this.f47098b) {
            return (getCount() - 1) - itemPosition;
        }
        return itemPosition;
    }

    public final CharSequence getPageTitle(int i) {
        return this.f47097a.getPageTitle(mo50912a(i));
    }

    public final float getPageWidth(int i) {
        return this.f47097a.getPageWidth(mo50912a(i));
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f47097a.instantiateItem(viewGroup, mo50912a(i));
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return this.f47097a.isViewFromObject(view, obj);
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f47097a.restoreState(parcelable, classLoader);
    }

    public final Parcelable saveState() {
        return this.f47097a.saveState();
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f47097a.setPrimaryItem(viewGroup, mo50912a(i), obj);
    }

    public final void startUpdate(ViewGroup viewGroup) {
        this.f47097a.startUpdate(viewGroup);
    }

    public C18492b(PagerAdapter pagerAdapter, Context context) {
        this(pagerAdapter, C15780a.m40268a(context));
    }

    public C18492b(PagerAdapter pagerAdapter, boolean z) {
        C21100e.m49373x(pagerAdapter, "adapter");
        this.f47097a = pagerAdapter;
        this.f47098b = z;
        pagerAdapter.registerDataSetObserver(new C18493a());
    }
}
