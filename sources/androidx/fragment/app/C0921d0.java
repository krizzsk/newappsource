package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0932h0;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import p001a0.C0017h;

@Deprecated
/* renamed from: androidx.fragment.app.d0 */
public abstract class C0921d0 extends PagerAdapter {

    /* renamed from: a */
    public final FragmentManager f3734a;

    /* renamed from: b */
    public final int f3735b;

    /* renamed from: c */
    public C0909a f3736c = null;

    /* renamed from: d */
    public Fragment f3737d = null;

    /* renamed from: e */
    public boolean f3738e;

    public C0921d0(FragmentManager fragmentManager, int i) {
        this.f3734a = fragmentManager;
        this.f3735b = i;
    }

    /* renamed from: a */
    public abstract Fragment mo4068a(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3736c == null) {
            FragmentManager fragmentManager = this.f3734a;
            this.f3736c = C0017h.m54K(fragmentManager, fragmentManager);
        }
        this.f3736c.mo4047m(fragment);
        if (fragment.equals(this.f3737d)) {
            this.f3737d = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(ViewGroup viewGroup) {
        C0909a aVar = this.f3736c;
        if (aVar != null) {
            if (!this.f3738e) {
                try {
                    this.f3738e = true;
                    aVar.mo4046l();
                    this.f3738e = false;
                } catch (Throwable th) {
                    this.f3738e = false;
                    throw th;
                }
            }
            this.f3736c = null;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f3736c == null) {
            FragmentManager fragmentManager = this.f3734a;
            this.f3736c = C0017h.m54K(fragmentManager, fragmentManager);
        }
        long j = (long) i;
        int id = viewGroup.getId();
        Fragment A = this.f3734a.mo3923A("android:switcher:" + id + ":" + j);
        if (A != null) {
            C0909a aVar = this.f3736c;
            aVar.getClass();
            aVar.mo4109b(new C0932h0.C0933a(A, 7));
        } else {
            A = mo4068a(i);
            C0909a aVar2 = this.f3736c;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            aVar2.mo4041e(id2, A, "android:switcher:" + id3 + ":" + j, 1);
        }
        if (A != this.f3737d) {
            A.setMenuVisibility(false);
            if (this.f3735b == 1) {
                this.f3736c.mo4051q(A, Lifecycle.State.STARTED);
            } else {
                A.setUserVisibleHint(false);
            }
        }
        return A;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final Parcelable saveState() {
        return null;
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3737d;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3735b == 1) {
                    if (this.f3736c == null) {
                        FragmentManager fragmentManager = this.f3734a;
                        this.f3736c = C0017h.m54K(fragmentManager, fragmentManager);
                    }
                    this.f3736c.mo4051q(this.f3737d, Lifecycle.State.STARTED);
                } else {
                    this.f3737d.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3735b == 1) {
                if (this.f3736c == null) {
                    FragmentManager fragmentManager2 = this.f3734a;
                    this.f3736c = C0017h.m54K(fragmentManager2, fragmentManager2);
                }
                this.f3736c.mo4051q(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3737d = fragment;
        }
    }

    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
