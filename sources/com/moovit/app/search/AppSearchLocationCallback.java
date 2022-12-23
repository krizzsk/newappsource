package com.moovit.app.search;

import a10.C13386a;
import a80.C7513a;
import a80.C7517d;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import b80.C7560a;
import c70.C13752e;
import c80.C7574a;
import c80.C7577d;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.location.mappicker.FavoriteLocationsMarkerProvider;
import com.moovit.app.location.mappicker.FavoriteStopsMarkerProvider;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.utils.UiUtils;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.network.model.ServerId;
import com.moovit.search.C7604a;
import com.moovit.search.C7606b;
import com.moovit.search.DefaultSearchLocationCallback;
import com.moovit.search.SearchAction;
import com.moovit.search.SearchLocationActivity;
import com.moovit.search.recent.RecentSearchLocationsMarkerProvider;
import com.moovit.search.specialactions.SearchLocationSpecialActions;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import e80.C12614a;
import f00.C16919g;
import f80.C12635b;
import f80.C12638d;
import g80.C12692a;
import h80.C12735a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import mf0.C24361g;
import p455dy.C16753e;
import p543hq.C17474b;
import p669mz.C18487d;
import p824tp.C19728f;
import p824tp.C19740r;
import p824tp.C19742t;
import p830tv.C19786a;
import p854uv.C20002b;
import p902wv.C20421a;
import p977zz.C20944i0;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;
import r00.C19209a;
import z70.C13327e;
import z70.C13328f;
import z70.C13329g;

public class AppSearchLocationCallback extends DefaultSearchLocationCallback {
    public static final Parcelable.Creator<AppSearchLocationCallback> CREATOR = new C15272a();

    /* renamed from: b */
    public final int f39445b;

    /* renamed from: c */
    public final int f39446c;

    /* renamed from: d */
    public final boolean f39447d;

    /* renamed from: e */
    public final String[] f39448e;

    /* renamed from: com.moovit.app.search.AppSearchLocationCallback$a */
    public class C15272a implements Parcelable.Creator<AppSearchLocationCallback> {
        public final Object createFromParcel(Parcel parcel) {
            return new AppSearchLocationCallback(parcel);
        }

        public final Object[] newArray(int i) {
            return new AppSearchLocationCallback[i];
        }
    }

    /* renamed from: com.moovit.app.search.AppSearchLocationCallback$b */
    public static /* synthetic */ class C15273b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39449a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.search.SearchAction[] r0 = com.moovit.search.SearchAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39449a = r0
                com.moovit.search.SearchAction r1 = com.moovit.search.SearchAction.MARK_AS_FAVORITE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39449a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.search.SearchAction r1 = com.moovit.search.SearchAction.SHOW_DETAILS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.AppSearchLocationCallback.C15273b.<clinit>():void");
        }
    }

    public AppSearchLocationCallback() {
        this(0, 0, true, true, true);
    }

    /* renamed from: I0 */
    public final int mo23880I0() {
        return this.f39446c;
    }

    /* renamed from: N */
    public final void mo23881N(HashSet hashSet) {
        super.mo23881N(hashSet);
        hashSet.add("USER_ACCOUNT");
        hashSet.add("METRO_POPULAR_LOCATIONS_CONFIGURATION");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g0 */
    public final int mo23883g0() {
        return this.f39445b;
    }

    /* renamed from: h0 */
    public final List mo23884h0() {
        return Arrays.asList(new MarkerProvider[]{new FavoriteLocationsMarkerProvider(), new FavoriteStopsMarkerProvider(), new RecentSearchLocationsMarkerProvider()});
    }

    /* renamed from: h1 */
    public void mo23885h1(SearchLocationActivity searchLocationActivity, String str, LocationDescriptor locationDescriptor, SearchAction searchAction) {
        int i = C15273b.f39449a[searchAction.ordinal()];
        if (i == 1) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "added_custom_favorite_from_recent");
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, locationDescriptor.f23651f);
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, locationDescriptor.f23647b.name());
            aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, locationDescriptor.f23649d);
            searchLocationActivity.mo44545v2(aVar.mo49933a());
            LocationFavorite g = ((UserAccountManager) searchLocationActivity.mo44537r1("USER_ACCOUNT")).mo46573d().mo49433g(locationDescriptor, (String) null);
            C12638d dVar = (C12638d) searchLocationActivity.mo44537r1("RECENT_SEARCH_LOCATIONS_STORE");
            dVar.mo51499b();
            C18487d<T> dVar2 = dVar.f48438c;
            if (dVar2.f33804b.remove(locationDescriptor)) {
                dVar2.mo50910h();
            }
            UiUtils.m40252k(searchLocationActivity.f23127n0);
            Snackbar l = Snackbar.m35159l(searchLocationActivity.findViewById(C19740r.content_layout), R.string.favorite_location_added, 0);
            l.mo42256m(R.string.action_undo, new C19786a(this, searchLocationActivity, locationDescriptor, g));
            l.mo42259p();
        } else if (i != 2) {
            super.mo23885h1(searchLocationActivity, str, locationDescriptor, searchAction);
        } else {
            searchLocationActivity.startActivity(StopDetailActivity.m39207B2(searchLocationActivity, locationDescriptor.f23649d, (ServerId) null, (TransitStop) null, (List) null));
        }
    }

    /* renamed from: l0 */
    public final void mo23886l0(SearchLocationActivity searchLocationActivity, C7606b bVar) {
        C7604a aVar;
        boolean z;
        C13752e x1 = searchLocationActivity.mo44548x1();
        C19047a aVar2 = (C19047a) searchLocationActivity.mo44537r1("CONFIGURATION");
        C19728f fVar = (C19728f) searchLocationActivity.mo44537r1("METRO_CONTEXT");
        C7513a aVar3 = (C7513a) searchLocationActivity.mo44537r1("METRO_POPULAR_LOCATIONS_CONFIGURATION");
        C16753e d = ((UserAccountManager) searchLocationActivity.mo44537r1("USER_ACCOUNT")).mo46573d();
        C12638d dVar = (C12638d) searchLocationActivity.mo44537r1("RECENT_SEARCH_LOCATIONS_STORE");
        if (!C24361g.m61154X(this.f39448e)) {
            bVar.mo23908f(new C12692a(searchLocationActivity, new SearchLocationSpecialActions(this.f39448e)));
        }
        if (this.f39447d) {
            C20002b bVar2 = new C20002b(searchLocationActivity, bVar, d);
            bVar.mo23908f(bVar2);
            bVar.mo23907e(bVar2);
        }
        if (this.f39447d) {
            aVar = new C20421a(searchLocationActivity, bVar, dVar, d);
        } else {
            aVar = new C12635b(searchLocationActivity, bVar, dVar);
        }
        bVar.mo23908f(aVar);
        bVar.mo23908f(new C7517d(searchLocationActivity, bVar, aVar3, dVar));
        bVar.mo23907e(new C12735a(x1, fVar));
        StyleSpan styleSpan = C13329g.f33089a;
        C16919g.C16921b bVar3 = C13386a.f33221a;
        C19209a aVar4 = C19053d.f48455G;
        if (((Boolean) aVar2.mo51505b(aVar4)).booleanValue()) {
            bVar.mo23907e(new C7577d(searchLocationActivity, aVar2, fVar));
            C7574a aVar5 = new C7574a(searchLocationActivity, aVar2, fVar);
            String str = aVar5.f23153b;
            bVar.f23162g.add(aVar5);
            bVar.f23163h.add(str);
            bVar.f23164i.put(str, aVar5);
        } else {
            bVar.mo23907e(new C12614a(searchLocationActivity));
        }
        boolean z2 = true;
        if (!((Boolean) aVar2.mo51505b(aVar4)).booleanValue() || !((Boolean) aVar2.mo51505b(C19053d.f48460L)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.mo23907e(new C7560a(searchLocationActivity, fVar));
        }
        String[] strArr = this.f39448e;
        int i = -1;
        if (strArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                } else if (C20975x0.m49118e(strArr[i2], "chose_on_map")) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i < 0) {
            z2 = false;
        }
        C13327e eVar = null;
        if (z2) {
            View inflate = View.inflate(searchLocationActivity, C19742t.search_location_footer_view, (ViewGroup) null);
            inflate.findViewById(C19740r.choose_on_map).setOnClickListener(new C13328f());
            eVar = new C13327e("search_on_map_footer", (String) null, Collections.emptyList(), (C20944i0) null, inflate);
        }
        bVar.f23167l = eVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f39445b);
        parcel.writeInt(this.f39446c);
        parcel.writeInt(this.f39447d ? 1 : 0);
        parcel.writeStringArray(this.f39448e);
    }

    public AppSearchLocationCallback(int i, int i2, boolean z, boolean z2, boolean z3) {
        String[] strArr;
        this.f39445b = i;
        this.f39446c = i2;
        this.f39447d = z3;
        if (z && z2) {
            strArr = new String[]{"current_location", "chose_on_map"};
        } else if (z) {
            strArr = new String[]{"current_location"};
        } else {
            strArr = z2 ? new String[]{"chose_on_map"} : null;
        }
        this.f39448e = strArr;
    }

    public AppSearchLocationCallback(Parcel parcel) {
        this.f39445b = parcel.readInt();
        this.f39446c = parcel.readInt();
        this.f39447d = parcel.readInt() != 1 ? false : true;
        this.f39448e = parcel.createStringArray();
    }
}
