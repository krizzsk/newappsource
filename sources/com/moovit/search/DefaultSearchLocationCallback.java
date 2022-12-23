package com.moovit.search;

import a10.C13386a;
import a80.C7513a;
import a80.C7517d;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.StyleSpan;
import b80.C7560a;
import c70.C13752e;
import c80.C7574a;
import c80.C7577d;
import com.moovit.search.recent.RecentSearchLocationsMarkerProvider;
import com.moovit.transit.LocationDescriptor;
import e80.C12614a;
import f00.C16919g;
import f80.C12635b;
import f80.C12638d;
import h80.C12735a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p001a0.C0016g;
import p824tp.C19728f;
import q00.C19047a;
import q00.C19053d;
import r00.C19209a;
import z70.C13329g;

public class DefaultSearchLocationCallback implements SearchLocationCallback {
    public static final Parcelable.Creator<DefaultSearchLocationCallback> CREATOR = new C7597a();

    /* renamed from: com.moovit.search.DefaultSearchLocationCallback$a */
    public class C7597a implements Parcelable.Creator<DefaultSearchLocationCallback> {
        public final Object createFromParcel(Parcel parcel) {
            return new DefaultSearchLocationCallback();
        }

        public final Object[] newArray(int i) {
            return new DefaultSearchLocationCallback[i];
        }
    }

    /* renamed from: I0 */
    public /* synthetic */ int mo23880I0() {
        return 0;
    }

    /* renamed from: N */
    public void mo23881N(HashSet hashSet) {
        C0016g.m11A(hashSet, "USER_CONTEXT", "CONFIGURATION", "METRO_CONTEXT", "RECENT_SEARCH_LOCATIONS_STORE");
        hashSet.add("METRO_POPULAR_LOCATIONS_CONFIGURATION");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g0 */
    public /* synthetic */ int mo23883g0() {
        return 0;
    }

    /* renamed from: h0 */
    public List mo23884h0() {
        return Collections.singletonList(new RecentSearchLocationsMarkerProvider());
    }

    /* renamed from: h1 */
    public void mo23885h1(SearchLocationActivity searchLocationActivity, String str, LocationDescriptor locationDescriptor, SearchAction searchAction) {
        Intent intent = new Intent();
        intent.putExtra("search_provider", str);
        intent.putExtra("search_result", locationDescriptor);
        intent.putExtra("search_action", searchAction);
        searchLocationActivity.setResult(-1, intent);
        searchLocationActivity.finish();
    }

    /* renamed from: l0 */
    public void mo23886l0(SearchLocationActivity searchLocationActivity, C7606b bVar) {
        boolean z;
        C13752e x1 = searchLocationActivity.mo44548x1();
        C19047a aVar = (C19047a) searchLocationActivity.mo44537r1("CONFIGURATION");
        C19728f fVar = (C19728f) searchLocationActivity.mo44537r1("METRO_CONTEXT");
        C12638d dVar = (C12638d) searchLocationActivity.mo44537r1("RECENT_SEARCH_LOCATIONS_STORE");
        bVar.mo23908f(new C12635b(searchLocationActivity, bVar, dVar));
        bVar.mo23908f(new C7517d(searchLocationActivity, bVar, (C7513a) searchLocationActivity.mo44537r1("METRO_POPULAR_LOCATIONS_CONFIGURATION"), dVar));
        bVar.mo23907e(new C12735a(x1, fVar));
        StyleSpan styleSpan = C13329g.f33089a;
        C16919g.C16921b bVar2 = C13386a.f33221a;
        C19209a aVar2 = C19053d.f48455G;
        if (((Boolean) aVar.mo51505b(aVar2)).booleanValue()) {
            bVar.mo23907e(new C7577d(searchLocationActivity, aVar, fVar));
            C7574a aVar3 = new C7574a(searchLocationActivity, aVar, fVar);
            String str = aVar3.f23153b;
            bVar.f23162g.add(aVar3);
            bVar.f23163h.add(str);
            bVar.f23164i.put(str, aVar3);
        } else {
            bVar.mo23907e(new C12614a(searchLocationActivity));
        }
        if (!((Boolean) aVar.mo51505b(aVar2)).booleanValue() || !((Boolean) aVar.mo51505b(C19053d.f48460L)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.mo23907e(new C7560a(searchLocationActivity, fVar));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
