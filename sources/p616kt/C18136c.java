package p616kt;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0921d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.google.android.material.tabs.TabLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.reports.list.LinesReportsListActivity;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.servicealerts.ServiceAlertsActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.home.lines.search.SearchLinePagerActivity;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitType;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n00.C18492b;
import n10.C18504a;
import p001a0.C0016g;
import p073e7.C4585c;
import p450dt.C16703d;
import p543hq.C17474b;
import p638lr.C18262i;
import p824tp.C19728f;

/* renamed from: kt.c */
public class C18136c extends C16703d implements C18504a {

    /* renamed from: p */
    public static final /* synthetic */ int f46354p = 0;

    /* renamed from: o */
    public ViewPager f46355o;

    /* renamed from: kt.c$a */
    public class C18137a extends ViewPager.SimpleOnPageChangeListener {
        public C18137a() {
        }

        public final void onPageSelected(int i) {
            C18138b bVar;
            boolean z;
            C18136c cVar = C18136c.this;
            int i2 = C18136c.f46354p;
            C18492b bVar2 = (C18492b) cVar.f46355o.getAdapter();
            String str = null;
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = (C18138b) bVar2.f47097a;
            }
            if (bVar != null) {
                int b = cVar.f46355o.mo47353b(i);
                TransitType b2 = bVar.mo50574b(b);
                if (b == bVar.f46360g.indexOf(C18138b.f46358j)) {
                    z = true;
                } else {
                    z = false;
                }
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
                aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TRANSIT_TYPE;
                if (!z) {
                    str = C0016g.m15E(b2);
                }
                aVar.mo49945m(analyticsAttributeKey, str);
                aVar.mo49941i(AnalyticsAttributeKey.IS_FAVORITE, z);
                cVar.mo46797j2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: kt.c$b */
    public static class C18138b extends C0921d0 {

        /* renamed from: i */
        public static final ServerId f46357i = new ServerId(-1);

        /* renamed from: j */
        public static final ServerId f46358j = new ServerId(-2);

        /* renamed from: f */
        public final Context f46359f;

        /* renamed from: g */
        public final List<ServerId> f46360g;

        /* renamed from: h */
        public final ServerIdMap<TransitType> f46361h;

        public C18138b(Context context, FragmentManager fragmentManager, List<ServerId> list, ServerIdMap<TransitType> serverIdMap) {
            super(fragmentManager, 0);
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f46359f = context;
            C21100e.m49373x(list, "tabIds");
            this.f46360g = list;
            this.f46361h = serverIdMap;
        }

        /* renamed from: a */
        public final Fragment mo4068a(int i) {
            boolean z;
            boolean z2 = false;
            if (i == this.f46360g.indexOf(f46358j)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new FavoriteLinesFragment();
            }
            TransitType b = mo50574b(i);
            if (b == null) {
                z2 = true;
            }
            return SearchLineFragment.m40739n2(b, z2, true);
        }

        /* renamed from: b */
        public final TransitType mo50574b(int i) {
            return (TransitType) this.f46361h.get(this.f46360g.get(i));
        }

        public final int getCount() {
            return this.f46360g.size();
        }

        public final CharSequence getPageTitle(int i) {
            boolean z;
            char c;
            List<ServerId> list = this.f46360g;
            ServerId serverId = f46358j;
            boolean z2 = true;
            if (i == list.indexOf(serverId)) {
                z = true;
            } else {
                z = false;
            }
            if (!z || i != 0) {
                c = 0;
            } else {
                c = 849;
            }
            if (c != 0) {
                return null;
            }
            if (i != this.f46360g.indexOf(serverId)) {
                z2 = false;
            }
            if (z2) {
                return this.f46359f.getString(R.string.line_favorites_label);
            }
            if (f46357i.equals(this.f46360g.get(i))) {
                return this.f46359f.getString(R.string.all);
            }
            TransitType b = mo50574b(i);
            if (b != null) {
                return b.mo24433b(this.f46359f);
            }
            return null;
        }
    }

    /* renamed from: F1 */
    public final void mo48145F1(SearchLineItem searchLineItem, TransitType transitType, TransitAgency transitAgency, boolean z) {
        startActivity(LineDetailActivity.m38386y2(getContext(), searchLineItem.f41637b, (ServerId) null, (ServerId) null, (Time) null));
    }

    /* renamed from: G */
    public final void mo48146G() {
        Context context = getContext();
        ServiceAlertFragment.ServiceAlertsUiConfig serviceAlertsUiConfig = new ServiceAlertFragment.ServiceAlertsUiConfig();
        serviceAlertsUiConfig.f39567b = true;
        serviceAlertsUiConfig.f39568c = true;
        startActivity(ServiceAlertsActivity.m39169y2(context, R.string.service_alerts_twitter_feed_title, serviceAlertsUiConfig));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("CONFIGURATION");
        hashSet.add("METRO_CONTEXT");
        hashSet.add("USER_ACCOUNT");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        ArrayList arrayList;
        int i;
        Context context = view.getContext();
        FragmentManager childFragmentManager = getChildFragmentManager();
        List<TransitType> a = ((C19728f) mo46776J1("METRO_CONTEXT")).f50165a.mo20299a();
        if (a.size() > 1) {
            ArrayList arrayList2 = new ArrayList(a.size() + 2);
            arrayList2.add(C18138b.f46358j);
            arrayList2.add(C18138b.f46357i);
            C13720d.m34276f(a, (C13722f) null, new C18262i(1), arrayList2);
            arrayList = arrayList2;
        } else {
            arrayList = Arrays.asList(new ServerId[]{C18138b.f46357i, C18138b.f46358j});
        }
        C18138b bVar = new C18138b(context, childFragmentManager, arrayList, ServerIdMap.m17949a(a));
        com.moovit.commons.view.pager.ViewPager viewPager = this.f46355o;
        viewPager.setAdapter(new C18492b((PagerAdapter) bVar, viewPager));
        if (!C13717b.m34258e(Collections.unmodifiableList(((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d().f43618b))) {
            i = bVar.f46360g.indexOf(C18138b.f46358j);
        } else {
            i = bVar.f46360g.indexOf(C18138b.f46357i);
        }
        if (i > 0) {
            this.f46355o.mo47356e(i, false);
        }
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) getView().findViewById(R.id.tool_bar);
    }

    /* renamed from: o2 */
    public final boolean mo49409o2(Uri uri) {
        return "lines".equalsIgnoreCase(uri.getHost());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1097) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int i3 = SearchLinePagerActivity.f41645Y;
            SearchLineItem searchLineItem = (SearchLineItem) intent.getParcelableExtra("item");
            TransitType transitType = (TransitType) intent.getParcelableExtra("transitType");
            TransitAgency transitAgency = (TransitAgency) intent.getParcelableExtra("agency");
            boolean booleanExtra = intent.getBooleanExtra("fromRecent", false);
            LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) intent.getParcelableExtra("alert");
            if (lineServiceAlertDigest != null) {
                mo48148q0(searchLineItem, lineServiceAlertDigest, transitType, transitAgency, booleanExtra);
            } else {
                mo48145F1(searchLineItem, transitType, transitAgency, booleanExtra);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lines_pager_home_fragment, viewGroup, false);
        inflate.findViewById(R.id.search_proxy).setOnClickListener(new C4585c(this, 10));
        com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) inflate.findViewById(R.id.view_pager);
        this.f46355o = viewPager;
        viewPager.addOnPageChangeListener(new C18137a());
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(this.f46355o);
        this.f46355o.addOnAdapterChangeListener(new C18135b(this, tabLayout));
        return inflate;
    }

    /* renamed from: q0 */
    public final void mo48148q0(SearchLineItem searchLineItem, LineServiceAlertDigest lineServiceAlertDigest, TransitType transitType, TransitAgency transitAgency, boolean z) {
        ServerId serverId = lineServiceAlertDigest.f23185b.f23206d;
        List<String> list = lineServiceAlertDigest.f23187d;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                startActivity(LinesReportsListActivity.m38851E2(this.f40822c, (ServerId) null, (TransitLine) null, serverId));
            } else {
                startActivity(ServiceAlertDetailsActivity.m39148z2(this.f40822c, serverId, list.get(0)));
            }
        }
    }
}
