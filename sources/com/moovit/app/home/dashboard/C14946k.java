package com.moovit.app.home.dashboard;

import a00.C13382a;
import aa0.C7539k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0475w0;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.dashboard.FavoriteLocationEditorActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.design.view.list.TripleListItemView;
import com.moovit.image.model.Image;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p073e7.C4583a;
import p073e7.C4584b;
import p241s0.C6302b;
import p297w5.C6996c;
import p304x.C7087p;
import p455dy.C16753e;
import p543hq.C17474b;
import p784rx.C19377c;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.home.dashboard.k */
public class C14946k extends C15682c<MoovitActivity> implements C16753e.C16756c {

    /* renamed from: t */
    public static final /* synthetic */ int f38246t = 0;

    /* renamed from: n */
    public final C6302b f38247n = new C6302b();

    /* renamed from: o */
    public final C6996c f38248o = new C6996c(this, 12);

    /* renamed from: p */
    public final C4584b f38249p = new C4584b(this, 11);

    /* renamed from: q */
    public FixedListView f38250q;

    /* renamed from: r */
    public UserAccountManager f38251r = null;

    /* renamed from: s */
    public C16753e f38252s = null;

    /* renamed from: com.moovit.app.home.dashboard.k$a */
    public class C14947a implements C0475w0.C0476a {

        /* renamed from: b */
        public final C16753e f38253b;

        /* renamed from: c */
        public final LocationFavorite f38254c;

        public C14947a(C16753e eVar, LocationFavorite locationFavorite) {
            this.f38253b = eVar;
            this.f38254c = locationFavorite;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            View findViewById;
            switch (menuItem.getItemId()) {
                case R.id.menu_delete:
                    C14946k kVar = C14946k.this;
                    C16753e eVar = this.f38253b;
                    LocationFavorite locationFavorite = this.f38254c;
                    int i = C14946k.f38246t;
                    kVar.getClass();
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "remove_custom_clicked");
                    kVar.mo46797j2(aVar.mo49933a());
                    eVar.mo49445t(locationFavorite);
                    A a = kVar.f40822c;
                    if (a == null || (findViewById = a.findViewById(R.id.alert_conditions)) == null) {
                        return true;
                    }
                    Snackbar.m35159l(findViewById, R.string.favorite_location_removed, 0).mo42259p();
                    return true;
                case R.id.menu_edit:
                    C14946k kVar2 = C14946k.this;
                    LocationFavorite locationFavorite2 = this.f38254c;
                    int i2 = C14946k.f38246t;
                    kVar2.getClass();
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "edit_custom_clicked");
                    kVar2.mo46797j2(aVar2.mo49933a());
                    A a2 = kVar2.f40822c;
                    int i3 = FavoriteLocationEditorActivity.f38158s0;
                    Intent intent = new Intent(a2, FavoriteLocationEditorActivity.class);
                    FavoriteLocationEditorActivity.m37667z2(intent, FavoriteLocationEditorActivity.FavoriteType.LOCATION, FavoriteLocationEditorActivity.ActionType.EDIT, locationFavorite2);
                    kVar2.startActivityForResult(intent, 1001);
                    return true;
                default:
                    return true;
            }
        }
    }

    public C14946k() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("USER_ACCOUNT");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        UserAccountManager userAccountManager = (UserAccountManager) mo46776J1("USER_ACCOUNT");
        this.f38251r = userAccountManager;
        this.f38252s = userAccountManager.mo46573d();
        if (isResumed()) {
            mo45157o2(this.f38252s);
            this.f38252s.mo49434h(this);
        }
    }

    /* renamed from: h */
    public final void mo44786h(C16753e eVar, LocationFavorite locationFavorite) {
        View view = (View) this.f38247n.remove(locationFavorite);
        if (view != null) {
            this.f38250q.removeView(view);
        }
    }

    /* renamed from: k */
    public final void mo44787k(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: m2 */
    public final void mo45155m2(C16753e eVar, TripleListItemView tripleListItemView, LocationFavorite locationFavorite) {
        tripleListItemView.setTag(locationFavorite);
        String str = locationFavorite.f40599c;
        if (C20964s0.m49092j(str)) {
            str = null;
        }
        tripleListItemView.setLabel(str);
        LocationDescriptor locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
        Image image = locationDescriptor.f23655j;
        if (image == null) {
            tripleListItemView.setIcon((int) R.drawable.ic_pin_24_on_surface_emphasis_medium);
        } else {
            tripleListItemView.setIcon(image);
        }
        tripleListItemView.setTitle((CharSequence) locationDescriptor.f23651f);
        tripleListItemView.setSubtitleItems(locationDescriptor.f23652g);
        int i = 0;
        C13382a.m33674j(tripleListItemView, tripleListItemView.getTitle(), tripleListItemView.getSubtitle());
        View accessoryView = tripleListItemView.getAccessoryView();
        View findViewById = accessoryView.findViewById(R.id.action_secondary);
        findViewById.setTag(locationFavorite);
        if (!LocationDescriptor.LocationType.STOP.equals(((LocationDescriptor) locationFavorite.f52687b).f23647b)) {
            i = 8;
        }
        findViewById.setVisibility(i);
        accessoryView.findViewById(R.id.action_menu).setOnClickListener(new C7539k(accessoryView, R.menu.dashboard_menu_location, new C14947a(eVar, locationFavorite)));
    }

    /* renamed from: n2 */
    public final TripleListItemView mo45156n2(C16753e eVar, LocationFavorite locationFavorite) {
        TripleListItemView tripleListItemView = new TripleListItemView(getContext(), (AttributeSet) null);
        tripleListItemView.setAccessoryIgnoreHorizontalPadding(true);
        tripleListItemView.setOnClickListener(this.f38248o);
        tripleListItemView.setAccessoryView((int) R.layout.favorite_location_accessorry);
        View findViewById = tripleListItemView.findViewById(R.id.action_secondary);
        findViewById.setOnClickListener(this.f38249p);
        findViewById.setContentDescription(getString(R.string.stop_option_schedules));
        View findViewById2 = tripleListItemView.findViewById(R.id.action_menu);
        findViewById2.setContentDescription(findViewById2.getContext().getString(R.string.voice_over_options));
        mo45155m2(eVar, tripleListItemView, locationFavorite);
        this.f38247n.put(locationFavorite, tripleListItemView);
        return tripleListItemView;
    }

    /* renamed from: o2 */
    public final void mo45157o2(C16753e eVar) {
        FixedListView fixedListView = this.f38250q;
        fixedListView.removeViews(3, fixedListView.getChildCount() - 3);
        this.f38247n.clear();
        for (LocationFavorite n2 : eVar.mo49437k()) {
            this.f38250q.addView(mo45156n2(eVar, n2));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        View findViewById;
        UserAccountManager userAccountManager;
        View findViewById2;
        if (i != 1001) {
            if (i != 1004) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("search_provider");
                LocationDescriptor locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("search_result");
                SearchAction searchAction = (SearchAction) intent.getSerializableExtra("search_action");
                if (locationDescriptor == null) {
                    return;
                }
                if (this.f38252s == null || !"recent_locations".equals(stringExtra) || !SearchAction.DEFAULT.equals(searchAction)) {
                    startActivityForResult(FavoriteLocationEditorActivity.m37663B2(this.f40822c, locationDescriptor), 1001);
                    return;
                }
                this.f38252s.mo49433g(locationDescriptor, (String) null);
                A a = this.f40822c;
                if (a != null && (findViewById2 = a.findViewById(R.id.alert_conditions)) != null) {
                    Snackbar.m35159l(findViewById2, R.string.favorite_location_added, 0).mo42259p();
                }
            }
        } else if (i2 == -1) {
            Context context = getContext();
            if (!(context == null || (userAccountManager = this.f38251r) == null || userAccountManager.mo46576g())) {
                C19377c.m46656a(context, TrackingEvent.FAVORITE_LOCATION_CONNECT_POP_UP_DISPLAYED, new C7087p(11, this, context));
            }
            A a2 = this.f40822c;
            if (a2 != null && (findViewById = a2.findViewById(R.id.alert_conditions)) != null) {
                Snackbar.m35159l(findViewById, R.string.favorite_location_added, 0).mo42259p();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.favorite_locations_section_fragment, viewGroup, false);
        this.f38250q = (FixedListView) inflate.findViewById(R.id.list_view);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.section_header);
        listItemView.getAccessoryView().setOnClickListener(new C4583a(this, 9));
        C13382a.m33674j(listItemView.getAccessoryView(), getString(R.string.voiceover_add_favorites_section), getString(R.string.voice_over_favorites_tab_hint));
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f38251r = null;
        this.f38252s = null;
    }

    public final void onPause() {
        super.onPause();
        C16753e eVar = this.f38252s;
        if (eVar != null) {
            eVar.mo49446u(this);
        }
    }

    public final void onResume() {
        super.onResume();
        C16753e eVar = this.f38252s;
        if (eVar != null) {
            mo45157o2(eVar);
            this.f38252s.mo49434h(this);
        }
    }

    /* renamed from: s */
    public final void mo44788s(C16753e eVar, LocationFavorite locationFavorite) {
        TripleListItemView tripleListItemView = (TripleListItemView) this.f38247n.getOrDefault(locationFavorite, null);
        if (tripleListItemView != null) {
            mo45155m2(eVar, tripleListItemView, locationFavorite);
        }
    }

    /* renamed from: t1 */
    public final void mo44789t1(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: y0 */
    public final void mo44790y0(C16753e eVar, LocationFavorite locationFavorite) {
        this.f38250q.addView(mo45156n2(eVar, locationFavorite));
    }
}
