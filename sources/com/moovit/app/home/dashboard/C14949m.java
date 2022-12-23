package com.moovit.app.home.dashboard;

import a00.C13382a;
import aa0.C7539k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0475w0;
import c00.C13723g;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.design.view.list.TripleListItemView;
import com.moovit.image.model.Image;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p455dy.C16753e;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.home.dashboard.m */
public class C14949m extends C15682c<MoovitActivity> implements C16753e.C16756c {

    /* renamed from: s */
    public static final /* synthetic */ int f38257s = 0;

    /* renamed from: n */
    public final ArrayList f38258n = new ArrayList();

    /* renamed from: o */
    public final C4051q f38259o = new C4051q(this, 13);

    /* renamed from: p */
    public FixedListView f38260p;

    /* renamed from: q */
    public ListItemView f38261q;

    /* renamed from: r */
    public C16753e f38262r = null;

    /* renamed from: com.moovit.app.home.dashboard.m$a */
    public class C14950a implements C0475w0.C0476a {

        /* renamed from: b */
        public final C16753e f38263b;

        /* renamed from: c */
        public final LocationFavorite f38264c;

        public C14950a(C16753e eVar, LocationFavorite locationFavorite) {
            this.f38263b = eVar;
            this.f38264c = locationFavorite;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.menu_delete) {
                return true;
            }
            C14949m mVar = C14949m.this;
            C16753e eVar = this.f38263b;
            LocationFavorite locationFavorite = this.f38264c;
            int i = C14949m.f38257s;
            mVar.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "remove_custom_clicked");
            mVar.mo46797j2(aVar.mo49933a());
            eVar.mo49445t(locationFavorite);
            return true;
        }
    }

    public C14949m() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("USER_ACCOUNT");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        this.f38262r = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
        if (isResumed()) {
            mo45158m2(this.f38262r);
            this.f38262r.mo49434h(this);
        }
    }

    /* renamed from: h */
    public final void mo44786h(C16753e eVar, LocationFavorite locationFavorite) {
        mo45158m2(eVar);
    }

    /* renamed from: k */
    public final void mo44787k(C16753e eVar, LocationFavorite locationFavorite) {
        mo45158m2(eVar);
    }

    /* renamed from: m2 */
    public final void mo45158m2(C16753e eVar) {
        if (this.f38260p != null && this.f38261q != null) {
            this.f38258n.clear();
            int i = 0;
            List list = (List) C13723g.m34283d(eVar.mo49437k(), this.f38258n, new C14948l(0));
            int size = list.size();
            UiUtils.m40250i(this.f38260p, R.layout.favorite_stations_section_list_item, 1, size);
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                TripleListItemView tripleListItemView = (TripleListItemView) this.f38260p.getChildAt(i3);
                LocationFavorite locationFavorite = (LocationFavorite) list.get(i2);
                tripleListItemView.setTag(locationFavorite);
                tripleListItemView.setOnClickListener(this.f38259o);
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
                C13382a.m33674j(tripleListItemView, tripleListItemView.getTitle(), tripleListItemView.getSubtitle());
                View accessoryView = tripleListItemView.getAccessoryView();
                accessoryView.setOnClickListener(new C7539k(accessoryView, R.menu.dashboard_menu_station, new C14950a(eVar, locationFavorite)));
                i2 = i3;
            }
            ListItemView listItemView = this.f38261q;
            if (size <= 0) {
                i = 8;
            }
            listItemView.setVisibility(i);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.favorite_stations_section_fragment, viewGroup, false);
        FixedListView fixedListView = (FixedListView) inflate.findViewById(R.id.list_view);
        this.f38260p = fixedListView;
        this.f38261q = (ListItemView) fixedListView.findViewById(R.id.section_header);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f38262r = null;
    }

    public final void onPause() {
        super.onPause();
        C16753e eVar = this.f38262r;
        if (eVar != null) {
            eVar.mo49446u(this);
        }
    }

    public final void onResume() {
        super.onResume();
        C16753e eVar = this.f38262r;
        if (eVar != null) {
            mo45158m2(eVar);
            this.f38262r.mo49434h(this);
        }
    }

    /* renamed from: s */
    public final void mo44788s(C16753e eVar, LocationFavorite locationFavorite) {
        mo45158m2(eVar);
    }

    /* renamed from: t1 */
    public final void mo44789t1(C16753e eVar, LocationFavorite locationFavorite) {
        mo45158m2(eVar);
    }

    /* renamed from: y0 */
    public final void mo44790y0(C16753e eVar, LocationFavorite locationFavorite) {
        mo45158m2(eVar);
    }
}
