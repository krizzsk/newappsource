package com.moovit.app.home.dashboard;

import android.content.Intent;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import p455dy.C16753e;
import p543hq.C17474b;

public class HomeFavoriteItemFragment extends C14940f {
    /* renamed from: m2 */
    public final Intent mo45113m2(LocationDescriptor locationDescriptor) {
        return FavoriteLocationEditorActivity.m37662A2(this.f40822c, locationDescriptor);
    }

    /* renamed from: n2 */
    public final int mo45114n2() {
        return R.string.dashboard_favorites_home;
    }

    /* renamed from: o2 */
    public final int mo45115o2() {
        return R.string.dashboard_favorites_home;
    }

    /* renamed from: p2 */
    public final LocationFavorite mo45116p2(C16753e eVar) {
        return eVar.f43620d;
    }

    /* renamed from: q2 */
    public final int mo45117q2() {
        return R.string.home_location_created;
    }

    /* renamed from: r2 */
    public final String mo45118r2() {
        return "fav_home_clicked";
    }

    /* renamed from: s2 */
    public final int mo45119s2() {
        return R.drawable.ic_home_24_on_surface_emphasis_high;
    }

    /* renamed from: t1 */
    public final void mo44789t1(C16753e eVar, LocationFavorite locationFavorite) {
        mo45151x2(locationFavorite);
    }

    /* renamed from: u2 */
    public final void mo45120u2(LocationFavorite locationFavorite) {
        boolean z;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "edit_home_clicked");
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.IS_LOCATION_SET;
        if (locationFavorite == null || ((LocationDescriptor) locationFavorite.f52687b) == null) {
            z = false;
        } else {
            z = true;
        }
        aVar.mo49941i(analyticsAttributeKey, z);
        mo46797j2(aVar.mo49933a());
        if (locationFavorite == null) {
            mo45150w2(R.string.favorite_home_label);
        } else {
            startActivityForResult(FavoriteLocationEditorActivity.m37664C2(this.f40822c), 1002);
        }
    }

    /* renamed from: v2 */
    public final void mo45121v2(C16753e eVar) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "remove_home_clicked");
        mo46797j2(aVar.mo49933a());
        eVar.mo49449z((LocationFavorite) null);
        mo45147D2(R.string.home_location_reset);
    }
}
