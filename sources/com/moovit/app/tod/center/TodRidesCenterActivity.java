package com.moovit.app.tod.center;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.C14151e;
import com.google.android.material.tabs.TabLayout;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tod.center.rides.TodRidesCenterFragment;
import com.moovit.app.tod.center.subscriptions.TodSubscriptionsCenterFragment;
import com.tranzmate.R;
import h60.C17327j1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import mf0.C24361g;
import p054d0.C4267a0;
import p122i7.C5297a;
import p430cx.C16522d;
import p977zz.C20941h;

public class TodRidesCenterActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f40201l0 = 0;

    /* renamed from: U */
    public SwipeRefreshLayout f40202U;

    /* renamed from: X */
    public TabLayout f40203X;

    /* renamed from: Y */
    public C15487b f40204Y;

    /* renamed from: Z */
    public C15489a f40205Z;

    /* renamed from: com.moovit.app.tod.center.TodRidesCenterActivity$a */
    public static /* synthetic */ class C15486a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40206a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.tod.center.TodRidesCenterTab[] r0 = com.moovit.app.tod.center.TodRidesCenterTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40206a = r0
                com.moovit.app.tod.center.TodRidesCenterTab r1 = com.moovit.app.tod.center.TodRidesCenterTab.RIDES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40206a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.center.TodRidesCenterTab r1 = com.moovit.app.tod.center.TodRidesCenterTab.SUBSCRIPTIONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.center.TodRidesCenterActivity.C15486a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.tod.center.TodRidesCenterActivity$b */
    public static class C15487b extends FragmentStateAdapter {

        /* renamed from: o */
        public final ArrayList f40207o = new ArrayList(2);

        public C15487b(AppCompatActivity appCompatActivity) {
            super(appCompatActivity.getSupportFragmentManager(), appCompatActivity.getLifecycle());
        }

        public final int getItemCount() {
            return this.f40207o.size();
        }

        /* renamed from: l */
        public final Fragment mo5595l(int i) {
            TodRidesCenterTab todRidesCenterTab = (TodRidesCenterTab) this.f40207o.get(i);
            int i2 = C15486a.f40206a[todRidesCenterTab.ordinal()];
            if (i2 == 1) {
                return new TodRidesCenterFragment();
            }
            if (i2 == 2) {
                return new TodSubscriptionsCenterFragment();
            }
            StringBuilder k = C13555b.m33972k("Invalid tab - ");
            k.append(todRidesCenterTab.name());
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_rides_center_activity);
        C15489a aVar = (C15489a) new C1026n0(this).mo4313a(C15489a.class);
        this.f40205Z = aVar;
        C24361g.m61135E(aVar.f40211f).observe(this, new C16522d(this, 0));
        this.f40205Z.f40210e.observe(this, new C5297a(this, 5));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.f40202U = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(R.attr.colorSecondary, this));
        this.f40202U.setOnRefreshListener(new C4267a0(this, 8));
        this.f40203X = (TabLayout) findViewById(R.id.tabs);
        this.f40204Y = new C15487b(this);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        viewPager2.setSaveEnabled(false);
        viewPager2.setAdapter(this.f40204Y);
        TabLayout tabLayout = this.f40203X;
        C14151e eVar = new C14151e(tabLayout, viewPager2, new C17327j1(this, 16));
        if (!eVar.f35463e) {
            RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
            eVar.f35462d = adapter;
            if (adapter != null) {
                eVar.f35463e = true;
                viewPager2.f5067d.f5104a.add(new C14151e.C14154c(tabLayout));
                C14151e.C14155d dVar = new C14151e.C14155d(viewPager2, true);
                if (!tabLayout.f35382I.contains(dVar)) {
                    tabLayout.f35382I.add(dVar);
                }
                eVar.f35462d.registerAdapterDataObserver(new C14151e.C14152a());
                eVar.mo42386a();
                tabLayout.mo42313m(viewPager2.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f40205Z.mo46288b(false);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TOD_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }
}
