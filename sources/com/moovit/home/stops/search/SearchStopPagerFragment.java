package com.moovit.home.stops.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0921d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.material.tabs.TabLayout;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.transit.TransitType;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n00.C18492b;
import o10.C18682a;
import o10.C18684c;
import o10.C18689e;
import p001a0.C0016g;
import p543hq.C17474b;
import p824tp.C19728f;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19743u;
import p824tp.C19746x;
import p977zz.C20941h;
import p977zz.C20977y0;

public class SearchStopPagerFragment extends C15682c<MoovitActivity> implements C18682a {

    /* renamed from: p */
    public static final /* synthetic */ int f41693p = 0;

    /* renamed from: n */
    public ViewPager f41694n;

    /* renamed from: o */
    public TabLayout f41695o;

    /* renamed from: com.moovit.home.stops.search.SearchStopPagerFragment$a */
    public class C16011a extends ViewPager.SimpleOnPageChangeListener {
        public C16011a() {
        }

        public final void onPageSelected(int i) {
            SearchStopPagerFragment searchStopPagerFragment = SearchStopPagerFragment.this;
            C18492b bVar = (C18492b) searchStopPagerFragment.f41694n.getAdapter();
            if (bVar != null) {
                int b = searchStopPagerFragment.f41694n.mo47353b(i);
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
                aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
                aVar.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(((C16012b) bVar.f47097a).f41698g.get(b)));
                searchStopPagerFragment.mo46797j2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: com.moovit.home.stops.search.SearchStopPagerFragment$b */
    public static class C16012b extends C0921d0 {

        /* renamed from: f */
        public final Context f41697f;

        /* renamed from: g */
        public final List<TransitType> f41698g;

        public C16012b(Context context, FragmentManager fragmentManager, List<TransitType> list) {
            super(fragmentManager, 1);
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f41697f = context;
            C21100e.m49373x(list, "transitTypes");
            this.f41698g = list;
        }

        /* renamed from: a */
        public final Fragment mo4068a(int i) {
            int i2 = C18684c.f47563u;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSearchEnabled", false);
            bundle.putParcelable("transitType", this.f41698g.get(i));
            C18684c cVar = new C18684c();
            cVar.setArguments(bundle);
            return cVar;
        }

        public final int getCount() {
            return this.f41698g.size();
        }

        public final CharSequence getPageTitle(int i) {
            TransitType transitType = this.f41698g.get(i);
            if (transitType == null) {
                return this.f41697f.getString(C19746x.all);
            }
            return transitType.mo24433b(this.f41697f);
        }
    }

    /* renamed from: com.moovit.home.stops.search.SearchStopPagerFragment$c */
    public interface C16013c {
        /* renamed from: F */
        ArrayList mo48174F();
    }

    public SearchStopPagerFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: Q */
    public final void mo48169Q(SearchStopItem searchStopItem, TransitType transitType, boolean z) {
        mo46786U1(C18682a.class, new C18689e(searchStopItem, transitType, z));
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        ArrayList arrayList;
        int i;
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C16013c) {
            arrayList = ((C16013c) targetFragment).mo48174F();
        } else {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C16013c) {
                arrayList = ((C16013c) parentFragment).mo48174F();
            } else {
                FragmentActivity activity = getActivity();
                if (activity instanceof C16013c) {
                    arrayList = ((C16013c) activity).mo48174F();
                } else {
                    arrayList = null;
                }
            }
        }
        if (C13717b.m34258e(arrayList)) {
            List<TransitType> a = ((C19728f) mo46776J1("METRO_CONTEXT")).f50165a.mo20299a();
            ArrayList arrayList2 = new ArrayList(a.size() + 1);
            arrayList2.add((Object) null);
            arrayList2.addAll(a);
            arrayList = arrayList2;
        }
        this.f41694n.setAdapter(new C18492b((PagerAdapter) new C16012b(view.getContext(), getChildFragmentManager(), arrayList), this.f41694n));
        TabLayout tabLayout = this.f41695o;
        if (arrayList.size() > 1) {
            i = 0;
        } else {
            i = 8;
        }
        tabLayout.setVisibility(i);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int i3 = SearchStopActivity.f41686U;
            mo48169Q((SearchStopItem) intent.getParcelableExtra("item"), (TransitType) intent.getParcelableExtra("transitType"), intent.getBooleanExtra("fromRecent", false));
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C19743u.fragment_search_stop_pager, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C19742t.search_stop_pager_fragment, viewGroup, false);
        com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) inflate.findViewById(C19740r.view_pager);
        this.f41694n = viewPager;
        viewPager.addOnPageChangeListener(new C16011a());
        TabLayout tabLayout = (TabLayout) inflate.findViewById(C19740r.tabs);
        this.f41695o = tabLayout;
        tabLayout.setupWithViewPager(this.f41694n);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C19740r.action_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        C18492b bVar = (C18492b) this.f41694n.getAdapter();
        if (bVar != null) {
            TransitType transitType = ((C16012b) bVar.f47097a).f41698g.get(this.f41694n.getCurrentLogicalItem());
            Context context = this.f41694n.getContext();
            int i = SearchStopActivity.f41686U;
            Intent intent = new Intent(context, SearchStopActivity.class);
            intent.putExtra("transitType", transitType);
            startActivityForResult(intent, 1);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "search_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(transitType));
            mo46797j2(aVar.mo49933a());
        }
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!C20977y0.m49122a(requireActivity())) {
            com.moovit.commons.view.pager.ViewPager viewPager = this.f41694n;
            viewPager.setBackgroundColor(C20941h.m49043f(16842801, viewPager.getContext()));
        }
    }
}
