package p687nt;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0194b;
import androidx.activity.C0199g;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.moovit.commons.view.behavior.MyBottomSheetBehavior;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.map.MapFragment;
import com.tranzmate.R;
import p054d0.C4268a1;
import p073e7.C4585c;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p304x.C7073m;
import p977zz.C20941h;

/* renamed from: nt.e */
public final class C18595e {

    /* renamed from: a */
    public final C18604l f47350a;

    /* renamed from: b */
    public final MapFragment f47351b;

    /* renamed from: c */
    public final MyBottomSheetBehavior<?> f47352c;

    /* renamed from: d */
    public final View f47353d;

    /* renamed from: e */
    public final View f47354e;

    /* renamed from: f */
    public final ViewPager f47355f;

    /* renamed from: g */
    public final View f47356g;

    /* renamed from: h */
    public View f47357h = null;

    /* renamed from: i */
    public boolean f47358i;

    /* renamed from: j */
    public boolean f47359j;

    /* renamed from: nt.e$a */
    public class C18596a extends BottomSheetBehavior.C13920c {
        public C18596a() {
        }

        public final void onSlide(View view, float f) {
            C18595e eVar = C18595e.this;
            eVar.getClass();
            eVar.f47351b.mo48645n3(0, 0, 0, ((View) view.getParent()).getHeight() - view.getTop());
        }

        public final void onStateChanged(View view, int i) {
            boolean z;
            boolean z2;
            C18595e eVar = C18595e.this;
            eVar.getClass();
            MyBottomSheetBehavior.name(i);
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            if (eVar.f47358i != z) {
                eVar.mo50991c(z);
            }
            if (i == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (eVar.f47359j != z2) {
                eVar.f47359j = z2;
                if (z2) {
                    eVar.f47353d.setEnabled(false);
                    eVar.f47354e.setEnabled(true);
                    return;
                }
                eVar.f47353d.setEnabled(true);
                eVar.f47354e.setEnabled(false);
            }
        }
    }

    /* renamed from: nt.e$b */
    public class C18597b extends ViewPager.C15827c {
        public C18597b() {
        }

        /* renamed from: a */
        public final void mo45259a(int i) {
            C18595e eVar = C18595e.this;
            eVar.f47352c.setNestedScrollingChildView((View) eVar.f47355f.mo47352a(i));
        }
    }

    public C18595e(C18604l lVar, MapFragment mapFragment, View view, AppBarLayout appBarLayout, TabLayout tabLayout, ViewPager viewPager, View view2, Bundle bundle) {
        boolean z;
        boolean z2;
        C18596a aVar = new C18596a();
        C18597b bVar = new C18597b();
        C21100e.m49373x(lVar, "fragment");
        this.f47350a = lVar;
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f47351b = mapFragment;
        MyBottomSheetBehavior<?> from = MyBottomSheetBehavior.from(view);
        C21100e.m49373x(from, "behavior");
        this.f47352c = from;
        C21100e.m49373x(appBarLayout, "appBar");
        this.f47353d = appBarLayout;
        this.f47354e = tabLayout;
        C21100e.m49373x(viewPager, "viewPager");
        this.f47355f = viewPager;
        C21100e.m49373x(view2, "showCardButton");
        this.f47356g = view2;
        View view3 = (View) view.getParent();
        view3.addOnLayoutChangeListener(new C18594d(this, view3, view, 0));
        from.setBottomSheetCallback(aVar);
        viewPager.addOnPageChangeListener(bVar);
        view2.setOnClickListener(new C4585c(this, 11));
        float dimension = appBarLayout.getResources().getDimension(R.dimen.elevation_2);
        m45518d(appBarLayout, dimension);
        tabLayout.setBackgroundColor(C20941h.m49043f(R.attr.colorSurface, tabLayout.getContext()));
        m45518d(tabLayout, dimension);
        if (bundle != null) {
            z = bundle.getBoolean("isHidden");
        } else if (from.getState() == 5) {
            z = true;
        } else {
            z = false;
        }
        mo50991c(z);
        if (bundle != null) {
            z2 = bundle.getBoolean("isExpanded");
        } else if (from.getState() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f47359j = z2;
        if (z2) {
            appBarLayout.setEnabled(false);
            tabLayout.setEnabled(true);
            return;
        }
        appBarLayout.setEnabled(true);
        tabLayout.setEnabled(false);
    }

    /* renamed from: d */
    public static void m45518d(ViewGroup viewGroup, float f) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(viewGroup, "elevation", new float[]{f}).setDuration(150));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(viewGroup, "elevation", new float[]{0.0f}).setDuration(150));
        viewGroup.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: a */
    public final void mo50989a() {
        View view = this.f47357h;
        if (view != null) {
            C6382p0 a = C6333d0.m15013a(view);
            a.mo22491a(1.0f);
            a.mo22493c(1.0f);
            a.mo22494d(1.0f);
            a.mo22501k(new C4268a1(this, 12));
        }
    }

    /* renamed from: b */
    public final void mo50990b() {
        View view = this.f47357h;
        if (view != null) {
            C6382p0 a = C6333d0.m15013a(view);
            a.mo22491a(BitmapDescriptorFactory.HUE_RED);
            a.mo22493c(BitmapDescriptorFactory.HUE_RED);
            a.mo22494d(BitmapDescriptorFactory.HUE_RED);
            a.mo22500j(new C0194b(this, 8));
        }
    }

    /* renamed from: c */
    public final void mo50991c(boolean z) {
        this.f47358i = z;
        if (z) {
            C6382p0 a = C6333d0.m15013a(this.f47356g);
            a.mo22491a(1.0f);
            a.mo22493c(1.0f);
            a.mo22494d(1.0f);
            a.mo22501k(new C0199g(this, 12));
            mo50990b();
            return;
        }
        C6382p0 a2 = C6333d0.m15013a(this.f47356g);
        a2.mo22491a(BitmapDescriptorFactory.HUE_RED);
        a2.mo22493c(BitmapDescriptorFactory.HUE_RED);
        a2.mo22494d(BitmapDescriptorFactory.HUE_RED);
        a2.mo22500j(new C7073m(this, 10));
        mo50989a();
    }
}
