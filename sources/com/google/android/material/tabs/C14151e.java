package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C1375f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.moovit.app.tod.center.TodRidesCenterActivity;
import com.moovit.app.tod.center.TodRidesCenterTab;
import h60.C17327j1;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: com.google.android.material.tabs.e */
public final class C14151e {

    /* renamed from: a */
    public final TabLayout f35459a;

    /* renamed from: b */
    public final ViewPager2 f35460b;

    /* renamed from: c */
    public final C14153b f35461c;

    /* renamed from: d */
    public RecyclerView.Adapter<?> f35462d;

    /* renamed from: e */
    public boolean f35463e;

    /* renamed from: com.google.android.material.tabs.e$a */
    public class C14152a extends RecyclerView.C1125g {
        public C14152a() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            C14151e.this.mo42386a();
        }

        /* renamed from: b */
        public final void mo4766b(int i, int i2) {
            C14151e.this.mo42386a();
        }

        /* renamed from: c */
        public final void mo4767c(int i, int i2, Object obj) {
            C14151e.this.mo42386a();
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            C14151e.this.mo42386a();
        }

        /* renamed from: e */
        public final void mo4769e(int i, int i2) {
            C14151e.this.mo42386a();
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            C14151e.this.mo42386a();
        }
    }

    /* renamed from: com.google.android.material.tabs.e$b */
    public interface C14153b {
    }

    /* renamed from: com.google.android.material.tabs.e$c */
    public static class C14154c extends ViewPager2.C1362g {

        /* renamed from: a */
        public final WeakReference<TabLayout> f35465a;

        /* renamed from: b */
        public int f35466b = 0;

        /* renamed from: c */
        public int f35467c = 0;

        public C14154c(TabLayout tabLayout) {
            this.f35465a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public final void mo5603a(int i) {
            this.f35466b = this.f35467c;
            this.f35467c = i;
        }

        /* renamed from: b */
        public final void mo5638b(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f35465a.get();
            if (tabLayout != null) {
                int i3 = this.f35467c;
                boolean z2 = false;
                if (i3 != 2 || this.f35466b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f35466b == 0)) {
                    z2 = true;
                }
                tabLayout.mo42313m(i, f, z, z2);
            }
        }

        /* renamed from: c */
        public final void mo5604c(int i) {
            boolean z;
            TabLayout tabLayout = this.f35465a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f35467c;
                if (i2 == 0 || (i2 == 2 && this.f35466b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo42311k(tabLayout.mo42295g(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.e$d */
    public static class C14155d implements TabLayout.C14140d {

        /* renamed from: a */
        public final ViewPager2 f35468a;

        /* renamed from: b */
        public final boolean f35469b;

        public C14155d(ViewPager2 viewPager2, boolean z) {
            this.f35468a = viewPager2;
            this.f35469b = z;
        }

        /* renamed from: a */
        public final void mo42349a() {
        }

        /* renamed from: b */
        public final void mo42350b(TabLayout.C14143g gVar) {
            ViewPager2 viewPager2 = this.f35468a;
            int i = gVar.f35430d;
            boolean z = this.f35469b;
            if (!((C1375f) viewPager2.f5078o.f5106c).f5122m) {
                viewPager2.mo5607c(i, z);
                return;
            }
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }

        /* renamed from: c */
        public final void mo42351c() {
        }
    }

    public C14151e(TabLayout tabLayout, ViewPager2 viewPager2, C17327j1 j1Var) {
        this.f35459a = tabLayout;
        this.f35460b = viewPager2;
        this.f35461c = j1Var;
    }

    /* renamed from: a */
    public final void mo42386a() {
        int min;
        this.f35459a.mo42310j();
        RecyclerView.Adapter<?> adapter = this.f35462d;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C14143g h = this.f35459a.mo42308h();
                TodRidesCenterActivity todRidesCenterActivity = (TodRidesCenterActivity) ((C17327j1) this.f35461c).f44716c;
                h.mo42364c(todRidesCenterActivity.getString(((TodRidesCenterTab) Collections.unmodifiableList(todRidesCenterActivity.f40204Y.f40207o).get(i)).getTitleResId()));
                this.f35459a.mo42285a(h, false);
            }
            if (itemCount > 0 && (min = Math.min(this.f35460b.getCurrentItem(), this.f35459a.getTabCount() - 1)) != this.f35459a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f35459a;
                tabLayout.mo42311k(tabLayout.mo42295g(min), true);
            }
        }
    }
}
