package com.moovit.home.lines.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import java.util.HashSet;
import java.util.Set;
import n10.C18504a;
import p001a0.C0016g;
import p543hq.C17474b;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19743u;
import p977zz.C20975x0;

public final class SearchLineActivity extends MoovitActivity implements C18504a, SearchLineFragment.C15995c {

    /* renamed from: U */
    public static final /* synthetic */ int f41621U = 0;

    /* renamed from: com.moovit.home.lines.search.SearchLineActivity$a */
    public class C15992a implements SearchView.C0366m {
        public C15992a() {
        }

        /* renamed from: A */
        public final void mo1843A(String str) {
            SearchLineActivity searchLineActivity = SearchLineActivity.this;
            int i = SearchLineActivity.f41621U;
            if (str == null) {
                str = "";
            }
            SearchLineFragment searchLineFragment = (SearchLineFragment) searchLineActivity.mo44529n1(C19740r.search_line_fragment);
            if (!C20975x0.m49118e(str, searchLineFragment.f41630t)) {
                searchLineFragment.mo48149o2(str);
            }
        }

        /* renamed from: J */
        public final boolean mo1844J(String str) {
            return false;
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
        getMenuInflater().inflate(C19743u.search_line_activity, menu);
        SearchView searchView = (SearchView) menu.findItem(C19740r.action_search).getActionView();
        searchView.requestFocus();
        searchView.setQueryHint(SearchLineFragment.m40738m2(searchView.getContext(), (TransitType) getIntent().getParcelableExtra("transitType"), (TransitAgency) getIntent().getParcelableExtra("agency")));
        searchView.setOnQueryTextListener(new C15992a());
        return true;
    }

    /* renamed from: e0 */
    public final EmptySearchLineViewFactory mo48147e0() {
        EmptySearchLineViewFactory emptySearchLineViewFactory = (EmptySearchLineViewFactory) getIntent().getParcelableExtra("emptySearchLineViewFactory");
        if (emptySearchLineViewFactory != null) {
            return emptySearchLineViewFactory;
        }
        return new DefaultPagerEmptySearchLineViewFactory();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.search_line_activity);
        setSupportActionBar((Toolbar) findViewById(C19740r.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(false);
            supportActionBar.mo792n();
            supportActionBar.mo791m(true);
        }
        SearchLineFragment searchLineFragment = (SearchLineFragment) mo44529n1(C19740r.search_line_fragment);
        TransitType transitType = (TransitType) getIntent().getParcelableExtra("transitType");
        if (!C20975x0.m49118e(searchLineFragment.f41628r, transitType)) {
            searchLineFragment.f41628r = transitType;
            searchLineFragment.mo48149o2(searchLineFragment.f41630t);
        }
        TransitAgency transitAgency = (TransitAgency) getIntent().getParcelableExtra("agency");
        if (!C20975x0.m49118e(searchLineFragment.f41629s, transitAgency)) {
            searchLineFragment.f41629s = transitAgency;
            searchLineFragment.mo48149o2(searchLineFragment.f41630t);
        }
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E((TransitType) getIntent().getParcelableExtra("transitType")));
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.AGENCY_NAME;
        TransitAgency transitAgency = (TransitAgency) getIntent().getParcelableExtra("agency");
        if (transitAgency != null) {
            str = transitAgency.f23673c;
        } else {
            str = "All";
        }
        m1.mo49939g(analyticsAttributeKey, str);
        return m1;
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
}
