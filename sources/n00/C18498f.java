package n00;

import android.database.DataSetObserver;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.commons.view.pager.ViewPager;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: n00.f */
public class C18498f {

    /* renamed from: a */
    public final C18499a f47105a = new C18499a();

    /* renamed from: b */
    public final C18497e f47106b = new C18497e(this);

    /* renamed from: c */
    public C18500b f47107c = new C18500b();

    /* renamed from: d */
    public View f47108d;

    /* renamed from: e */
    public int f47109e;

    /* renamed from: f */
    public ViewPager f47110f;

    /* renamed from: g */
    public PagerAdapter f47111g;

    /* renamed from: n00.f$a */
    public class C18499a extends ViewPager.SimpleOnPageChangeListener {
        public C18499a() {
        }

        public final void onPageScrolled(int i, float f, int i2) {
            C18498f.this.mo47334c(f, i);
        }

        public final void onPageSelected(int i) {
            C18498f.this.mo47343d(i);
        }
    }

    /* renamed from: n00.f$b */
    public class C18500b extends DataSetObserver {
        public C18500b() {
        }

        public final void onChanged() {
            C18498f.this.mo47335h();
        }
    }

    /* renamed from: a */
    public final boolean mo50917a() {
        return this.f47108d != null;
    }

    /* renamed from: b */
    public final void mo50918b(View view) {
        int i;
        C21100e.m49373x(view, Promotion.ACTION_VIEW);
        this.f47108d = view;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6338e.m15069j(view, 0);
        if (mo50917a() && (i = this.f47109e) != -1) {
            View view2 = this.f47108d;
            KeyEvent.Callback callback = null;
            if (i != 0) {
                while (true) {
                    ViewParent parent = view2.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    view2 = (View) parent;
                    KeyEvent.Callback findViewById = view2.findViewById(i);
                    if (findViewById != null) {
                        callback = findViewById;
                        break;
                    }
                }
            }
            if (callback instanceof com.moovit.commons.view.pager.ViewPager) {
                mo50921g((com.moovit.commons.view.pager.ViewPager) callback);
            }
        }
    }

    /* renamed from: c */
    public void mo47334c(float f, int i) {
        throw null;
    }

    /* renamed from: d */
    public void mo47343d(int i) {
    }

    /* renamed from: e */
    public final void mo50919e() {
        PagerAdapter pagerAdapter;
        com.moovit.commons.view.pager.ViewPager viewPager = this.f47110f;
        if (viewPager != null) {
            pagerAdapter = viewPager.getAdapter();
        } else {
            pagerAdapter = null;
        }
        PagerAdapter pagerAdapter2 = this.f47111g;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.f47107c);
        }
        this.f47111g = pagerAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.registerDataSetObserver(this.f47107c);
        }
        mo47335h();
    }

    /* renamed from: f */
    public final void mo50920f(int i) {
        int i2;
        this.f47109e = i;
        if (mo50917a() && mo50917a() && (i2 = this.f47109e) != -1) {
            View view = this.f47108d;
            KeyEvent.Callback callback = null;
            if (i2 != 0) {
                while (true) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                    KeyEvent.Callback findViewById = view.findViewById(i2);
                    if (findViewById != null) {
                        callback = findViewById;
                        break;
                    }
                }
            }
            if (callback instanceof com.moovit.commons.view.pager.ViewPager) {
                mo50921g((com.moovit.commons.view.pager.ViewPager) callback);
            }
        }
    }

    /* renamed from: g */
    public final void mo50921g(com.moovit.commons.view.pager.ViewPager viewPager) {
        com.moovit.commons.view.pager.ViewPager viewPager2 = this.f47110f;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this.f47105a);
            this.f47110f.removeOnAdapterChangeListener(this.f47106b);
        }
        this.f47110f = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(this.f47105a);
            this.f47110f.addOnAdapterChangeListener(this.f47106b);
        }
        mo50919e();
    }

    /* renamed from: h */
    public void mo47335h() {
        throw null;
    }
}
