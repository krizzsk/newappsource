package p616kt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0928f0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import ce0.C21100e;
import com.google.android.material.tabs.TabLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.lines.LocationsEmptySearchLineViewFactory;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.reports.list.LinesReportsListActivity;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.home.lines.search.EmptySearchLineViewFactory;
import com.moovit.home.lines.search.SearchLineActivity;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitType;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k80.C12813g;
import k80.C12814h;
import n00.C18492b;
import n10.C18504a;
import p011aa.C0141e;
import p073e7.C4583a;
import p241s0.C6313h;
import p435de.C16596f;
import p450dt.C16703d;
import p455dy.C16753e;
import p543hq.C17474b;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20930c;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: kt.a */
public class C18127a extends C16703d implements C18504a, C16753e.C16755b, SearchLineFragment.C15995c {

    /* renamed from: r */
    public static final /* synthetic */ int f46342r = 0;

    /* renamed from: o */
    public final C6313h<Class<? extends C18133f>, Integer> f46343o = new C6313h<>(3);

    /* renamed from: p */
    public C16753e f46344p = null;

    /* renamed from: q */
    public Class<? extends C18133f> f46345q = null;

    /* renamed from: kt.a$a */
    public class C18128a extends ViewPager.C15827c {

        /* renamed from: d */
        public final /* synthetic */ TabLayout f46346d;

        /* renamed from: e */
        public final /* synthetic */ C18134g f46347e;

        public C18128a(TabLayout tabLayout, C18134g gVar) {
            this.f46346d = tabLayout;
            this.f46347e = gVar;
        }

        /* renamed from: a */
        public final void mo45259a(int i) {
            boolean z;
            TabLayout.C14143g g = this.f46346d.mo42295g(i);
            C18133f fVar = this.f46347e.f46351h.get(i);
            if (g != null) {
                C18127a aVar = C18127a.this;
                int i2 = C18127a.f46342r;
                aVar.getClass();
                if (fVar instanceof C18131d) {
                    C18131d dVar = (C18131d) fVar;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "all_lines_clicked");
                    aVar.mo46797j2(aVar2.mo49933a());
                } else if (fVar instanceof C18132e) {
                    C18132e eVar = (C18132e) fVar;
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "alerts_clicked");
                    aVar.mo46797j2(aVar3.mo49933a());
                    TextView textView = (TextView) g.f35431e.findViewById(R.id.badge);
                    if (textView != null && textView.getVisibility() == 0) {
                        C12813g.f31677v.mo49545d(aVar.getContext().getSharedPreferences("service_alert_digests_counter", 0), Long.valueOf(System.currentTimeMillis()));
                        textView.setVisibility(8);
                    }
                } else if (fVar instanceof C18130c) {
                    C18130c cVar = (C18130c) fVar;
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "favorites_clicked");
                    aVar.mo46797j2(aVar4.mo49933a());
                    TabLayout.C14143g p2 = aVar.mo50568p2(C18130c.class);
                    if (p2 != null && ((TextView) p2.f35431e.findViewById(R.id.badge)).getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Context context = aVar.getContext();
                        TrackingEvent trackingEvent = TrackingEvent.FAVORITE_LINES_TAB_WITH_NEW_BADGE_CLICKED;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("events_tracker_store", 0);
                        sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
                    }
                    aVar.mo50571s2();
                } else {
                    StringBuilder k = C13555b.m33972k("Unsupported tab type: ");
                    k.append(fVar.f46350a);
                    throw new IllegalStateException(k.toString());
                }
            }
        }

        /* renamed from: b */
        public final void mo47364b() {
        }
    }

    /* renamed from: kt.a$b */
    public class C18129b extends C0141e {
        public C18129b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            String str;
            C12813g gVar2 = (C12813g) cVar;
            C12814h hVar = (C12814h) gVar;
            int i = C18127a.f46342r;
            TabLayout.C14143g p2 = C18127a.this.mo50568p2(C18132e.class);
            if (p2 != null) {
                TextView textView = (TextView) p2.f35431e.findViewById(R.id.badge);
                int i2 = hVar.f31678m;
                if (i2 > 0) {
                    str = String.format(C20930c.m49020b(C18127a.this.getContext()), "%d", new Object[]{Integer.valueOf(i2)});
                } else {
                    str = null;
                }
                UiUtils.m40234B(textView, str);
            }
        }
    }

    /* renamed from: kt.a$c */
    public static class C18130c extends C18133f {
        public C18130c(Context context) {
            super(context.getString(R.string.line_favorites_label));
        }

        /* renamed from: a */
        public final Fragment mo50572a() {
            return new FavoriteLinesFragment();
        }

        /* renamed from: b */
        public final int mo50573b() {
            return R.layout.wdg_tablayout_fav_tab_view;
        }
    }

    /* renamed from: kt.a$d */
    public static class C18131d extends C18133f {
        public C18131d(Context context) {
            super(context.getString(R.string.line_all_label));
        }

        /* renamed from: a */
        public final Fragment mo50572a() {
            return SearchLineFragment.m40739n2((TransitType) null, false, false);
        }

        /* renamed from: b */
        public final int mo50573b() {
            return R.layout.wdg_tablayout_tab_view;
        }
    }

    /* renamed from: kt.a$e */
    public static class C18132e extends C18133f {
        public C18132e(Context context) {
            super(context.getString(R.string.line_alert_label));
        }

        /* renamed from: a */
        public final Fragment mo50572a() {
            ServiceAlertFragment.ServiceAlertsUiConfig serviceAlertsUiConfig = new ServiceAlertFragment.ServiceAlertsUiConfig();
            serviceAlertsUiConfig.f39567b = true;
            serviceAlertsUiConfig.f39569d = true;
            serviceAlertsUiConfig.f39570e = true;
            serviceAlertsUiConfig.f39571f = true;
            int i = ServiceAlertFragment.f39556x;
            Bundle bundle = new Bundle();
            bundle.putParcelable("uiConfig", serviceAlertsUiConfig);
            ServiceAlertFragment serviceAlertFragment = new ServiceAlertFragment();
            serviceAlertFragment.setArguments(bundle);
            return serviceAlertFragment;
        }

        /* renamed from: b */
        public final int mo50573b() {
            return R.layout.wdg_tablayout_tab_view_with_badge;
        }
    }

    /* renamed from: kt.a$f */
    public static abstract class C18133f {

        /* renamed from: a */
        public final CharSequence f46350a;

        public C18133f(String str) {
            C21100e.m49373x(str, "name");
            this.f46350a = str;
        }

        /* renamed from: a */
        public abstract Fragment mo50572a();

        /* renamed from: b */
        public abstract int mo50573b();
    }

    /* renamed from: kt.a$g */
    public static class C18134g extends C0928f0 {

        /* renamed from: h */
        public final List<C18133f> f46351h;

        public C18134g(FragmentManager fragmentManager, ArrayList arrayList) {
            super(fragmentManager, 0);
            this.f46351h = arrayList;
        }

        /* renamed from: a */
        public final Fragment mo4098a(int i) {
            return this.f46351h.get(i).mo50572a();
        }

        public final int getCount() {
            return this.f46351h.size();
        }

        public final CharSequence getPageTitle(int i) {
            return this.f46351h.get(i).f46350a;
        }
    }

    /* renamed from: F1 */
    public final void mo48145F1(SearchLineItem searchLineItem, TransitType transitType, TransitAgency transitAgency, boolean z) {
        startActivity(LineDetailActivity.m38386y2(getContext(), searchLineItem.f41637b, (ServerId) null, (ServerId) null, (Time) null));
    }

    /* renamed from: G */
    public final void mo48146G() {
        throw new UnsupportedOperationException("twitter feeds service alerts does not supported");
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
        boolean z;
        int i;
        Context context = view.getContext();
        ArrayList arrayList = new ArrayList(3);
        this.f46343o.clear();
        arrayList.add(new C18131d(context));
        this.f46343o.put(C18131d.class, Integer.valueOf(arrayList.size() - 1));
        if (((Integer) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48485x)).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new C18132e(context));
            this.f46343o.put(C18132e.class, Integer.valueOf(arrayList.size() - 1));
        }
        arrayList.add(new C18130c(context));
        this.f46343o.put(C18130c.class, Integer.valueOf(arrayList.size() - 1));
        C18134g gVar = new C18134g(getChildFragmentManager(), arrayList);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(arrayList.size());
        viewPager.setAdapter(new C18492b((PagerAdapter) gVar, viewPager));
        viewPager.setCurrentLogicalItem(0);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18133f fVar = (C18133f) arrayList.get(i2);
            if (C15780a.m40268a(context)) {
                i = (size - 1) - i2;
            } else {
                i = i2;
            }
            TabLayout.C14143g g = tabLayout.mo42295g(i);
            if (g != null) {
                g.mo42362a(fVar.mo50573b());
            }
        }
        if (this.f40824e && z) {
            mo50570r2();
        }
        viewPager.addOnPageChangeListener(new C18128a(tabLayout, gVar));
        C16753e d = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
        this.f46344p = d;
        d.mo49432f(this);
        mo50571s2();
    }

    /* renamed from: e0 */
    public final EmptySearchLineViewFactory mo48147e0() {
        C19047a aVar;
        if (mo46785T1("CONFIGURATION")) {
            aVar = (C19047a) mo46776J1("CONFIGURATION");
        } else {
            aVar = null;
        }
        if (aVar == null || !((Boolean) aVar.mo51505b(C19053d.f48474m)).booleanValue()) {
            return null;
        }
        return new LocationsEmptySearchLineViewFactory();
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) mo46799l2(R.id.tool_bar);
    }

    /* renamed from: o2 */
    public final boolean mo49409o2(Uri uri) {
        Class cls;
        if (!"lines".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("innerTab");
        if (C20964s0.m49090h(queryParameter)) {
            return true;
        }
        if (queryParameter.equalsIgnoreCase("service_alerts")) {
            cls = C18132e.class;
        } else if (queryParameter.equalsIgnoreCase("favorites")) {
            cls = C18130c.class;
        } else if (queryParameter.equalsIgnoreCase("lines")) {
            cls = C18131d.class;
        } else {
            C16596f.m42113a().mo49364c(new UnsupportedOperationException(C25541a.m63881k("Unknown tab requested: ", queryParameter)));
            cls = null;
        }
        this.f46345q = cls;
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1159) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int i3 = SearchLineActivity.f41621U;
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
        View inflate = layoutInflater.inflate(R.layout.lines_home_fragment, viewGroup, false);
        inflate.findViewById(R.id.search_proxy).setOnClickListener(new C4583a(this, 10));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C16753e eVar = this.f46344p;
        if (eVar != null) {
            eVar.mo49444s(this);
        }
    }

    public final void onResume() {
        super.onResume();
        mo50569q2();
    }

    public final void onStart() {
        boolean z;
        super.onStart();
        if (mo46785T1("CONFIGURATION")) {
            if (((Integer) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48485x)).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo50570r2();
            }
        }
        mo50569q2();
    }

    /* renamed from: p2 */
    public final TabLayout.C14143g mo50568p2(Class<? extends C18133f> cls) {
        Integer orDefault;
        int i;
        View view = getView();
        if (view == null || (orDefault = this.f46343o.getOrDefault(cls, null)) == null) {
            return null;
        }
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        if (C15780a.m40268a(view.getContext())) {
            i = (tabLayout.getTabCount() - 1) - orDefault.intValue();
        } else {
            i = orDefault.intValue();
        }
        return tabLayout.mo42295g(Integer.valueOf(i).intValue());
    }

    /* renamed from: q */
    public final void mo44782q() {
        mo50571s2();
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

    /* renamed from: q2 */
    public final void mo50569q2() {
        if (this.f46345q != null && !this.f46343o.isEmpty()) {
            Class<? extends C18133f> cls = this.f46345q;
            Integer orDefault = this.f46343o.getOrDefault(cls, null);
            if (orDefault == null) {
                cls.getSimpleName();
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("tab info requested is not available: ");
                k.append(cls.getSimpleName());
                a.mo49364c(new UnsupportedOperationException(k.toString()));
            } else {
                ((ViewPager) getView().findViewById(R.id.view_pager)).setCurrentLogicalItem(orDefault.intValue());
            }
            this.f46345q = null;
        }
    }

    /* renamed from: r2 */
    public final void mo50570r2() {
        C12813g gVar = new C12813g(mo46783R1(), (C19728f) mo46776J1("METRO_CONTEXT"));
        String name = C12813g.class.getName();
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2(name, gVar, L1, new C18129b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50571s2() {
        /*
            r7 = this;
            java.lang.Class<kt.a$c> r0 = p616kt.C18127a.C18130c.class
            com.google.android.material.tabs.TabLayout$g r0 = r7.mo50568p2(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            android.view.View r0 = r0.f35431e
            r1 = 2131362075(0x7f0a011b, float:1.834392E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            com.moovit.commons.utils.UiUtils.m40234B(r0, r1)
            dy.e r1 = r7.f46344p
            java.lang.String r2 = "events_tracker_store"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = r1.f43618b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004b
            android.content.Context r1 = r7.getContext()
            com.moovit.app.tracking.TrackingEvent r5 = com.moovit.app.tracking.TrackingEvent.NEW_FAVORITE_LINE_ADDED
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r4)
            java.lang.String r6 = r5.getPrefsKey()
            int r1 = r1.getInt(r6, r4)
            int r5 = r5.getMaxOccurrences()
            if (r1 < r5) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            return
        L_0x004f:
            android.content.Context r1 = r7.getContext()
            com.moovit.app.tracking.TrackingEvent r5 = com.moovit.app.tracking.TrackingEvent.FAVORITE_LINES_TAB_WITH_NEW_BADGE_CLICKED
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r4)
            java.lang.String r2 = r5.getPrefsKey()
            int r1 = r1.getInt(r2, r4)
            int r2 = r5.getMaxOccurrences()
            if (r1 < r2) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 != 0) goto L_0x0077
            r1 = 2131887840(0x7f1206e0, float:1.9410298E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 8
            com.moovit.commons.utils.UiUtils.m40236D(r0, r1, r2)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p616kt.C18127a.mo50571s2():void");
    }

    /* renamed from: v0 */
    public final void mo44783v0() {
    }
}
