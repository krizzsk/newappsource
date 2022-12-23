package n00;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: n00.a */
public abstract class C18491a<T extends View> extends PagerAdapter {

    /* renamed from: a */
    public final SparseArray<T> f47096a = new SparseArray<>();

    /* renamed from: a */
    public abstract void mo23842a(int i, View view);

    /* renamed from: b */
    public abstract T mo45295b(ViewGroup viewGroup, int i);

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) this.f47096a.get(i);
        if (view != null) {
            viewGroup.removeView(view);
            this.f47096a.remove(i);
        }
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view = (View) this.f47096a.get(i);
        if (view == null) {
            view = mo45295b(viewGroup, i);
            this.f47096a.put(i, view);
        }
        mo23842a(i, view);
        viewGroup.addView(view);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
