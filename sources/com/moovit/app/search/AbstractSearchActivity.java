package com.moovit.app.search;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.C0475w0;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0921d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ce0.C21100e;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n00.C18492b;
import n10.C18508e;
import p001a0.C0017h;
import p304x.C7097r;
import p455dy.C16753e;
import p543hq.C17474b;
import p583jk.C17875h;
import p669mz.C18487d;
import p757qu.C19184g;
import p878vv.C20236c;

public abstract class AbstractSearchActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final String f39419l0;

    /* renamed from: m0 */
    public static final String f39420m0;

    /* renamed from: n0 */
    public static final String f39421n0;

    /* renamed from: o0 */
    public static final String f39422o0;

    /* renamed from: U */
    public SearchView f39423U;

    /* renamed from: X */
    public final ArrayList f39424X = new ArrayList();

    /* renamed from: Y */
    public List<C15270e> f39425Y;

    /* renamed from: Z */
    public C15270e f39426Z;

    /* renamed from: com.moovit.app.search.AbstractSearchActivity$a */
    public class C15264a extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: b */
        public final /* synthetic */ com.moovit.commons.view.pager.ViewPager f39427b;

        public C15264a(com.moovit.commons.view.pager.ViewPager viewPager) {
            this.f39427b = viewPager;
        }

        public final void onPageSelected(int i) {
            AbstractSearchActivity.this.mo45807G2(this.f39427b.mo47353b(i));
        }
    }

    /* renamed from: com.moovit.app.search.AbstractSearchActivity$b */
    public class C15265b implements SearchView.C0366m {
        public C15265b() {
        }

        /* renamed from: A */
        public final void mo1843A(String str) {
            AbstractSearchActivity.m39052y2(AbstractSearchActivity.this, str, false);
        }

        /* renamed from: J */
        public final boolean mo1844J(String str) {
            AbstractSearchActivity.m39052y2(AbstractSearchActivity.this, str, true);
            return true;
        }
    }

    /* renamed from: com.moovit.app.search.AbstractSearchActivity$c */
    public static /* synthetic */ class C15266c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39430a;

        static {
            int[] iArr = new int[SearchAction.values().length];
            f39430a = iArr;
            try {
                iArr[SearchAction.MARK_AS_FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.moovit.app.search.AbstractSearchActivity$d */
    public static abstract class C15267d extends C15682c<AbstractSearchActivity> {

        /* renamed from: n */
        public int f39431n;

        /* renamed from: o */
        public String f39432o;

        /* renamed from: p */
        public int f39433p;

        /* renamed from: q */
        public final C15268a f39434q = new C15268a();

        /* renamed from: r */
        public final C15269b f39435r = new C15269b();

        /* renamed from: com.moovit.app.search.AbstractSearchActivity$d$a */
        public class C15268a implements C0475w0.C0476a {
            public C15268a() {
            }

            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() != R.id.action_delete) {
                    return false;
                }
                C15267d.this.mo45811n2();
                return true;
            }
        }

        /* renamed from: com.moovit.app.search.AbstractSearchActivity$d$b */
        public class C15269b implements SearchView.C0366m {
            public C15269b() {
            }

            /* renamed from: A */
            public final void mo1843A(String str) {
                String str2;
                if (str != null) {
                    str2 = str.trim();
                } else {
                    str2 = "";
                }
                C15267d dVar = C15267d.this;
                dVar.f39431n = Math.max(dVar.f39431n, str2.length());
                if (!str2.equals(C15267d.this.f39432o)) {
                    C15267d.this.mo45812o2(str2);
                }
            }

            /* renamed from: J */
            public final boolean mo1844J(String str) {
                return true;
            }
        }

        public C15267d() {
            super(AbstractSearchActivity.class);
        }

        /* renamed from: m2 */
        public abstract C17474b.C17475a mo45810m2();

        /* renamed from: n2 */
        public void mo45811n2() {
        }

        /* renamed from: o2 */
        public void mo45812o2(String str) {
            String str2 = this.f39432o;
            if (str2 != null && str2.length() - 1 == str.length()) {
                this.f39433p++;
            }
            this.f39432o = str;
        }

        public void onResume() {
            super.onResume();
            this.f39433p = 0;
            this.f39432o = "";
        }

        public void onStart() {
            String str;
            super.onStart();
            this.f39431n = 0;
            AbstractSearchActivity abstractSearchActivity = (AbstractSearchActivity) this.f40822c;
            abstractSearchActivity.f39424X.add(this.f39435r);
            SearchView searchView = abstractSearchActivity.f39423U;
            if (searchView == null) {
                str = null;
            } else {
                str = searchView.getQuery().toString();
            }
            if (str != null) {
                mo45812o2(str);
            }
        }

        public void onStop() {
            super.onStop();
            ((AbstractSearchActivity) this.f40822c).f39424X.remove(this.f39435r);
        }
    }

    /* renamed from: com.moovit.app.search.AbstractSearchActivity$e */
    public static class C15270e {

        /* renamed from: a */
        public final CharSequence f39438a;

        /* renamed from: b */
        public final CharSequence f39439b;

        /* renamed from: c */
        public final Class<? extends C15267d> f39440c;

        /* renamed from: d */
        public final Bundle f39441d;

        /* renamed from: e */
        public Fragment f39442e;

        public C15270e(CharSequence charSequence, CharSequence charSequence2, Class<? extends C15267d> cls, Bundle bundle) {
            C21100e.m49373x(charSequence, "title");
            this.f39438a = charSequence;
            this.f39439b = charSequence2;
            this.f39440c = cls;
            this.f39441d = bundle;
        }

        /* renamed from: b */
        public static C15270e m39072b(Context context, String str, boolean z, boolean z2) {
            ServerId serverId = C15284a.f39471U;
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_enable_current_location", z);
            bundle.putBoolean("extra_enable_favorite_locations", z2);
            bundle.putString("emptyStateExtra", str);
            return new C15270e(context.getText(R.string.search_locations_tab), context.getText(R.string.search_locations_tab_hint), C15284a.class, bundle);
        }

        /* renamed from: a */
        public final Fragment mo45813a(Context context) {
            if (this.f39442e == null) {
                this.f39442e = Fragment.instantiate(context, this.f39440c.getName(), this.f39441d);
            }
            return this.f39442e;
        }
    }

    /* renamed from: com.moovit.app.search.AbstractSearchActivity$f */
    public static class C15271f extends C0921d0 {

        /* renamed from: f */
        public final Context f39443f;

        /* renamed from: g */
        public final List<C15270e> f39444g;

        public C15271f(Context context, FragmentManager fragmentManager, List<C15270e> list) {
            super(fragmentManager, 0);
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f39443f = context;
            C21100e.m49373x(list, "tabs");
            this.f39444g = list;
        }

        /* renamed from: a */
        public final Fragment mo4068a(int i) {
            return this.f39444g.get(i).mo45813a(this.f39443f);
        }

        public final int getCount() {
            return this.f39444g.size();
        }

        public final CharSequence getPageTitle(int i) {
            return this.f39444g.get(i).f39438a;
        }
    }

    static {
        Class<AbstractSearchActivity> cls = AbstractSearchActivity.class;
        f39419l0 = C13555b.m33969h(cls, new StringBuilder(), "#extra_init_query");
        f39420m0 = C13555b.m33969h(cls, new StringBuilder(), "#extra_query_hint");
        f39421n0 = C13555b.m33969h(cls, new StringBuilder(), "#result_search_item");
        f39422o0 = C13555b.m33969h(cls, new StringBuilder(), "#single_search_tab");
    }

    /* renamed from: y2 */
    public static void m39052y2(AbstractSearchActivity abstractSearchActivity, String str, boolean z) {
        int size = abstractSearchActivity.f39424X.size();
        int i = 0;
        if (z) {
            while (i < size) {
                ((SearchView.C0366m) abstractSearchActivity.f39424X.get(i)).mo1844J(str);
                i++;
            }
            return;
        }
        while (i < size) {
            ((SearchView.C0366m) abstractSearchActivity.f39424X.get(i)).mo1843A(str);
            i++;
        }
    }

    /* renamed from: A2 */
    public abstract List<C15270e> mo45801A2();

    /* renamed from: B2 */
    public C17875h mo45802B2() {
        return new C17875h();
    }

    /* renamed from: C2 */
    public void mo45803C2(LocationDescriptor locationDescriptor) {
        throw new ApplicationBugException(getClass().getSimpleName() + " do not support choose on map search");
    }

    /* renamed from: D2 */
    public abstract void mo45804D2(LocationDescriptor locationDescriptor);

    /* renamed from: E2 */
    public boolean mo45805E2(SearchLocationItem searchLocationItem, SearchAction searchAction) {
        if (C15266c.f39430a[searchAction.ordinal()] == 1) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "added_custom_favorite_from_recent");
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, searchLocationItem.f39460e);
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, searchLocationItem.f39458c.name());
            aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, searchLocationItem.f39457b);
            mo44545v2(aVar.mo49933a());
            LocationFavorite g = ((C16753e) getSystemService("user_favorites_manager_service")).mo49433g(SearchLocationItem.m39103g(searchLocationItem), searchLocationItem.f39460e);
            C20236c f = C20236c.m47804f(this);
            f.mo51499b();
            C18487d<T> dVar = f.f48438c;
            if (dVar.f33804b.remove(searchLocationItem)) {
                dVar.mo50910h();
            }
            UiUtils.m40252k(this.f39423U);
            Snackbar l = Snackbar.m35159l(findViewById(R.id.root), R.string.favorite_location_added, 0);
            l.mo42256m(R.string.action_undo, new C19184g(1, this, searchLocationItem, g));
            l.mo42259p();
            return false;
        }
        throw new ApplicationBugException(getClass().getSimpleName() + " do not support location search");
    }

    /* renamed from: F2 */
    public final void mo45806F2(SearchLocationItem searchLocationItem, SearchAction searchAction) {
        if (mo45805E2(searchLocationItem, searchAction)) {
            C20236c f = C20236c.m47804f(this);
            f.mo51499b();
            f.f48438c.mo40645c(searchLocationItem);
        }
    }

    /* renamed from: G2 */
    public final void mo45807G2(int i) {
        this.f39426Z = this.f39425Y.get(i);
        CharSequence stringExtra = getIntent().getStringExtra(f39420m0);
        if (stringExtra == null) {
            stringExtra = this.f39426Z.f39439b;
        }
        this.f39423U.setQueryHint(stringExtra);
    }

    /* renamed from: H2 */
    public final void mo45808H2(Parcelable parcelable) {
        Intent intent = new Intent();
        intent.putExtra(f39421n0, parcelable);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        String str;
        super.mo24880c2();
        C20236c.m47804f(this).mo51498a();
        C18508e.m45375f(this).mo51498a();
        C15267d dVar = (C15267d) this.f39426Z.mo45813a(this);
        SearchView searchView = this.f39423U;
        if (searchView == null) {
            str = null;
        } else {
            str = searchView.getQuery().toString();
        }
        C17474b.C17475a m2 = dVar.mo45810m2();
        m2.mo49935c(AnalyticsAttributeKey.BACKSPACES_COUNT, dVar.f39433p);
        m2.mo49935c(AnalyticsAttributeKey.CLEAR_TEXT_COUNT, 0);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.QUERY_STRING;
        if (str == null) {
            str = "";
        }
        m2.mo49939g(analyticsAttributeKey, str);
        mo44545v2(m2.mo49933a());
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        boolean z;
        super.mo19425e2(bundle);
        List<C15270e> A2 = mo45801A2();
        this.f39425Y = A2;
        if (!A2.isEmpty()) {
            if (this.f39425Y.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setContentView((int) R.layout.abstract_search_activity);
                C15270e eVar = this.f39425Y.get(0);
                this.f39426Z = eVar;
                Fragment a = eVar.mo45813a(this);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                K.mo4111f(R.id.fragment_container, a, f39422o0);
                K.mo4040d();
            } else {
                setContentView((int) R.layout.abstract_pager_search_activity);
                com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) findViewById(R.id.pager);
                viewPager.setOffscreenPageLimit(this.f39425Y.size());
                viewPager.setAdapter(new C18492b((PagerAdapter) new C15271f(this, getSupportFragmentManager(), this.f39425Y), (Context) this));
                viewPager.addOnPageChangeListener(new C15264a(viewPager));
            }
            SearchView searchView = (SearchView) findViewById(R.id.search_view);
            this.f39423U = searchView;
            searchView.requestFocus();
            this.f39423U.setOnQueryTextListener(new C15265b());
            setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo791m(true);
                supportActionBar.mo792n();
            }
            String stringExtra = getIntent().getStringExtra(f39419l0);
            if (stringExtra != null) {
                this.f39423U.post(new C7097r(18, this, stringExtra));
            }
            mo45807G2(0);
            if (stringExtra == null) {
                SearchView searchView2 = this.f39423U;
                C13382a.m33665a(searchView2, searchView2.getQueryHint());
                return;
            }
            return;
        }
        throw new IllegalStateException("search tabs may not be empty");
    }

    /* renamed from: s1 */
    public Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("SEARCH_HISTORY_CLEANER");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: z2 */
    public C17875h mo45809z2() {
        return new C17875h();
    }
}
