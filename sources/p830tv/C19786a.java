package p830tv;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import f80.C12638d;
import p543hq.C17474b;

/* renamed from: tv.a */
public final /* synthetic */ class C19786a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AppSearchLocationCallback f50300b;

    /* renamed from: c */
    public final /* synthetic */ SearchLocationActivity f50301c;

    /* renamed from: d */
    public final /* synthetic */ LocationDescriptor f50302d;

    /* renamed from: e */
    public final /* synthetic */ LocationFavorite f50303e;

    public /* synthetic */ C19786a(AppSearchLocationCallback appSearchLocationCallback, SearchLocationActivity searchLocationActivity, LocationDescriptor locationDescriptor, LocationFavorite locationFavorite) {
        this.f50300b = appSearchLocationCallback;
        this.f50301c = searchLocationActivity;
        this.f50302d = locationDescriptor;
        this.f50303e = locationFavorite;
    }

    public final void onClick(View view) {
        AppSearchLocationCallback appSearchLocationCallback = this.f50300b;
        SearchLocationActivity searchLocationActivity = this.f50301c;
        LocationDescriptor locationDescriptor = this.f50302d;
        LocationFavorite locationFavorite = this.f50303e;
        appSearchLocationCallback.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "removed_custom_favorite_from_recent");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, locationDescriptor.f23651f);
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, locationDescriptor.f23647b.name());
        aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, locationDescriptor.f23649d);
        searchLocationActivity.mo44545v2(aVar.mo49933a());
        ((UserAccountManager) searchLocationActivity.mo44537r1("USER_ACCOUNT")).mo46573d().mo49445t(locationFavorite);
        C12638d dVar = (C12638d) searchLocationActivity.mo44537r1("RECENT_SEARCH_LOCATIONS_STORE");
        dVar.mo51499b();
        dVar.f48438c.mo40645c(locationDescriptor);
    }
}
