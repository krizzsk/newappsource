package com.moovit.home.lines.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0921d0;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.material.tabs.TabLayout;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n00.C18492b;
import n10.C18504a;
import p001a0.C0016g;
import p543hq.C17474b;
import p824tp.C19728f;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19743u;
import p824tp.C19746x;
import p977zz.C20975x0;

public final class SearchLinePagerActivity extends MoovitActivity implements C18504a, SearchLineFragment.C15995c {

    /* renamed from: Y */
    public static final /* synthetic */ int f41645Y = 0;

    /* renamed from: U */
    public SearchView f41646U;

    /* renamed from: X */
    public ViewPager f41647X;

    /* renamed from: com.moovit.home.lines.search.SearchLinePagerActivity$a */
    public class C15999a extends ViewPager.SimpleOnPageChangeListener {
        public C15999a() {
        }

        public final void onPageSelected(int i) {
            SearchLinePagerActivity.m40750y2(SearchLinePagerActivity.this, i);
        }
    }

    /* renamed from: com.moovit.home.lines.search.SearchLinePagerActivity$b */
    public class C16000b implements SearchView.C0366m {
        public C16000b() {
        }

        /* renamed from: A */
        public final void mo1843A(String str) {
            String str2;
            SearchLinePagerActivity searchLinePagerActivity = SearchLinePagerActivity.this;
            int i = SearchLinePagerActivity.f41645Y;
            C16001c z2 = searchLinePagerActivity.mo48158z2();
            if (z2 != null) {
                Iterator it = z2.f41652h.iterator();
                while (it.hasNext()) {
                    SearchLineFragment searchLineFragment = (SearchLineFragment) it.next();
                    if (searchLineFragment != null) {
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (!C20975x0.m49118e(str2, searchLineFragment.f41630t)) {
                            searchLineFragment.mo48149o2(str2);
                        }
                    }
                }
            }
        }

        /* renamed from: J */
        public final boolean mo1844J(String str) {
            return false;
        }
    }

    /* renamed from: com.moovit.home.lines.search.SearchLinePagerActivity$c */
    public class C16001c extends C0921d0 {

        /* renamed from: f */
        public final List<TransitType> f41650f;

        /* renamed from: g */
        public boolean f41651g = true;

        /* renamed from: h */
        public final ArrayList f41652h;

        public C16001c(ArrayList arrayList) {
            super(SearchLinePagerActivity.this.getSupportFragmentManager(), 0);
            C21100e.m49373x(arrayList, "transitTypes");
            this.f41650f = arrayList;
            this.f41652h = new ArrayList(Collections.nCopies(arrayList.size(), (Object) null));
        }

        /* renamed from: a */
        public final Fragment mo4068a(int i) {
            return SearchLineFragment.m40739n2(this.f41650f.get(i), false, true);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
            this.f41652h.set(i, (Object) null);
        }

        public final void finishUpdate(ViewGroup viewGroup) {
            super.finishUpdate(viewGroup);
            if (this.f41651g) {
                SearchLinePagerActivity searchLinePagerActivity = SearchLinePagerActivity.this;
                SearchLinePagerActivity.m40750y2(searchLinePagerActivity, searchLinePagerActivity.f41647X.getCurrentItem());
                this.f41651g = false;
            }
        }

        public final int getCount() {
            return this.f41650f.size();
        }

        public final CharSequence getPageTitle(int i) {
            TransitType transitType = this.f41650f.get(i);
            if (transitType == null) {
                return SearchLinePagerActivity.this.getString(C19746x.all);
            }
            return transitType.mo24433b(SearchLinePagerActivity.this);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            String str;
            CharSequence query;
            SearchLineFragment searchLineFragment = (SearchLineFragment) super.instantiateItem(viewGroup, i);
            SearchView searchView = SearchLinePagerActivity.this.f41646U;
            if (searchView == null || (query = searchView.getQuery()) == null) {
                str = null;
            } else {
                str = query.toString();
            }
            if (str == null) {
                str = "";
            }
            if (!C20975x0.m49118e(str, searchLineFragment.f41630t)) {
                searchLineFragment.mo48149o2(str);
            }
            this.f41652h.set(i, searchLineFragment);
            return searchLineFragment;
        }
    }

    /* renamed from: y2 */
    public static void m40750y2(SearchLinePagerActivity searchLinePagerActivity, int i) {
        C16001c z2 = searchLinePagerActivity.mo48158z2();
        SearchLineFragment searchLineFragment = (SearchLineFragment) searchLinePagerActivity.f41647X.getPrimaryItem();
        if (z2 != null && searchLineFragment != null) {
            int b = searchLinePagerActivity.f41647X.mo47353b(i);
            TransitType transitType = z2.f41650f.get(b);
            SearchView searchView = searchLinePagerActivity.f41646U;
            if (searchView != null) {
                searchView.setQueryHint(SearchLineFragment.m40738m2(searchView.getContext(), transitType, (TransitAgency) null));
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
            aVar.mo49945m(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(transitType));
            aVar.mo49941i(AnalyticsAttributeKey.IS_FAVORITE, false);
            searchLinePagerActivity.mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: F1 */
    public final void mo48145F1(SearchLineItem searchLineItem, TransitType transitType, TransitAgency transitAgency, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("item", searchLineItem);
        intent.putExtra("transitType", transitType);
        intent.putExtra("agency", transitAgency);
        intent.putExtra("fromRecent", z);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: G */
    public final void mo48146G() {
        throw new UnsupportedOperationException("twitter feeds service alerts does not supported");
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        TransitType transitType;
        getMenuInflater().inflate(C19743u.search_line_pager_activity, menu);
        SearchView searchView = (SearchView) menu.findItem(C19740r.action_search).getActionView();
        this.f41646U = searchView;
        searchView.setMaxWidth(Integer.MAX_VALUE);
        this.f41646U.requestFocus();
        SearchView searchView2 = this.f41646U;
        Context context = searchView2.getContext();
        C16001c z2 = mo48158z2();
        if (z2 == null) {
            transitType = null;
        } else {
            transitType = z2.f41650f.get(this.f41647X.getCurrentLogicalItem());
        }
        searchView2.setQueryHint(SearchLineFragment.m40738m2(context, transitType, (TransitAgency) null));
        this.f41646U.setOnQueryTextListener(new C16000b());
        return true;
    }

    /* renamed from: e0 */
    public final EmptySearchLineViewFactory mo48147e0() {
        return (EmptySearchLineViewFactory) getIntent().getParcelableExtra("emptySearchLineViewFactory");
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        setContentView(C19742t.search_line_pager_activity);
        setSupportActionBar((Toolbar) findViewById(C19740r.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        int i2 = 0;
        if (supportActionBar != null) {
            supportActionBar.mo793o(false);
            supportActionBar.mo792n();
            supportActionBar.mo791m(true);
        }
        com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) findViewById(C19740r.view_pager);
        this.f41647X = viewPager;
        viewPager.addOnPageChangeListener(new C15999a());
        TabLayout tabLayout = (TabLayout) findViewById(C19740r.tabs);
        tabLayout.setupWithViewPager(this.f41647X);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("transitTypes");
        if (C13717b.m34258e(parcelableArrayListExtra)) {
            List<TransitType> a = ((C19728f) mo44537r1("METRO_CONTEXT")).f50165a.mo20299a();
            ArrayList arrayList = new ArrayList(a.size() + 1);
            arrayList.add((Object) null);
            arrayList.addAll(a);
            parcelableArrayListExtra = arrayList;
        }
        C16001c cVar = new C16001c(parcelableArrayListExtra);
        com.moovit.commons.view.pager.ViewPager viewPager2 = this.f41647X;
        viewPager2.setAdapter(new C18492b((PagerAdapter) cVar, viewPager2));
        if (parcelableArrayListExtra.size() <= 1) {
            i2 = 8;
        }
        tabLayout.setVisibility(i2);
        TransitType transitType = (TransitType) getIntent().getParcelableExtra("initialTransitType");
        if (transitType != null) {
            i = parcelableArrayListExtra.indexOf(transitType);
        } else {
            i = -1;
        }
        if (i > 0) {
            this.f41647X.setCurrentLogicalItem(i);
        }
    }

    /* renamed from: q0 */
    public final void mo48148q0(SearchLineItem searchLineItem, LineServiceAlertDigest lineServiceAlertDigest, TransitType transitType, TransitAgency transitAgency, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("item", searchLineItem);
        intent.putExtra("transitType", transitType);
        intent.putExtra("agency", transitAgency);
        intent.putExtra("fromRecent", z);
        intent.putExtra("alert", lineServiceAlertDigest);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("SEARCH_LINE_FTS");
        return s1;
    }

    /* renamed from: z2 */
    public final C16001c mo48158z2() {
        C18492b bVar;
        com.moovit.commons.view.pager.ViewPager viewPager = this.f41647X;
        if (viewPager == null || (bVar = (C18492b) viewPager.getAdapter()) == null) {
            return null;
        }
        return (C16001c) bVar.f47097a;
    }
}
