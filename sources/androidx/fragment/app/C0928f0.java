package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import p001a0.C0017h;

@Deprecated
/* renamed from: androidx.fragment.app.f0 */
public abstract class C0928f0 extends PagerAdapter {

    /* renamed from: a */
    public final FragmentManager f3753a;

    /* renamed from: b */
    public final int f3754b;

    /* renamed from: c */
    public C0909a f3755c = null;

    /* renamed from: d */
    public ArrayList<Fragment.SavedState> f3756d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Fragment> f3757e = new ArrayList<>();

    /* renamed from: f */
    public Fragment f3758f = null;

    /* renamed from: g */
    public boolean f3759g;

    public C0928f0(FragmentManager fragmentManager, int i) {
        this.f3753a = fragmentManager;
        this.f3754b = i;
    }

    /* renamed from: a */
    public abstract Fragment mo4098a(int i);

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f3755c == null) {
            FragmentManager fragmentManager = this.f3753a;
            this.f3755c = C0017h.m54K(fragmentManager, fragmentManager);
        }
        while (this.f3756d.size() <= i) {
            this.f3756d.add((Object) null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f3756d;
        if (fragment.isAdded()) {
            savedState = this.f3753a.mo3949b0(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f3757e.set(i, (Object) null);
        this.f3755c.mo4050p(fragment);
        if (fragment.equals(this.f3758f)) {
            this.f3758f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void finishUpdate(ViewGroup viewGroup) {
        C0909a aVar = this.f3755c;
        if (aVar != null) {
            if (!this.f3759g) {
                try {
                    this.f3759g = true;
                    aVar.mo4046l();
                    this.f3759g = false;
                } catch (Throwable th) {
                    this.f3759g = false;
                    throw th;
                }
            }
            this.f3755c = null;
        }
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3757e.size() > i && (fragment = this.f3757e.get(i)) != null) {
            return fragment;
        }
        if (this.f3755c == null) {
            FragmentManager fragmentManager = this.f3753a;
            this.f3755c = C0017h.m54K(fragmentManager, fragmentManager);
        }
        Fragment a = mo4098a(i);
        if (this.f3756d.size() > i && (savedState = this.f3756d.get(i)) != null) {
            a.setInitialSavedState(savedState);
        }
        while (this.f3757e.size() <= i) {
            this.f3757e.add((Object) null);
        }
        a.setMenuVisibility(false);
        if (this.f3754b == 0) {
            a.setUserVisibleHint(false);
        }
        this.f3757e.set(i, a);
        this.f3755c.mo4041e(viewGroup.getId(), a, (String) null, 1);
        if (this.f3754b == 1) {
            this.f3755c.mo4051q(a, Lifecycle.State.STARTED);
        }
        return a;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3756d.clear();
            this.f3757e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3756d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(InneractiveMediationDefs.GENDER_FEMALE)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment E = this.f3753a.mo3927E(bundle, str);
                    if (E != null) {
                        while (this.f3757e.size() <= parseInt) {
                            this.f3757e.add((Object) null);
                        }
                        E.setMenuVisibility(false);
                        this.f3757e.set(parseInt, E);
                    }
                }
            }
        }
    }

    public final Parcelable saveState() {
        Bundle bundle;
        if (this.f3756d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3756d.size()];
            this.f3756d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3757e.size(); i++) {
            Fragment fragment = this.f3757e.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3753a.mo3942W(bundle, C16759e.m42349e(InneractiveMediationDefs.GENDER_FEMALE, i), fragment);
            }
        }
        return bundle;
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3758f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3754b == 1) {
                    if (this.f3755c == null) {
                        FragmentManager fragmentManager = this.f3753a;
                        this.f3755c = C0017h.m54K(fragmentManager, fragmentManager);
                    }
                    this.f3755c.mo4051q(this.f3758f, Lifecycle.State.STARTED);
                } else {
                    this.f3758f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3754b == 1) {
                if (this.f3755c == null) {
                    FragmentManager fragmentManager2 = this.f3753a;
                    this.f3755c = C0017h.m54K(fragmentManager2, fragmentManager2);
                }
                this.f3755c.mo4051q(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3758f = fragment;
        }
    }

    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
