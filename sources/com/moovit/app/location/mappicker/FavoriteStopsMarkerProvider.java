package com.moovit.app.location.mappicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import c70.C13752e;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.StopFavorite;
import com.moovit.commons.request.ServerException;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.C16281i;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import g30.C4776h;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import p455dy.C16753e;
import p646lz.C18299a;
import p824tp.C19728f;

public class FavoriteStopsMarkerProvider implements MarkerProvider {
    public static final Parcelable.Creator<FavoriteStopsMarkerProvider> CREATOR = new C15115a();

    /* renamed from: com.moovit.app.location.mappicker.FavoriteStopsMarkerProvider$a */
    public class C15115a implements Parcelable.Creator<FavoriteStopsMarkerProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new FavoriteStopsMarkerProvider();
        }

        public final Object[] newArray(int i) {
            return new FavoriteStopsMarkerProvider[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* renamed from: x1 */
    public final Collection<MarkerProvider.C16214a> mo23914x1(C18299a aVar, C13752e eVar) throws IOException, ServerException {
        UserAccountManager userAccountManager = (UserAccountManager) aVar.mo50695h("USER_ACCOUNT", true);
        if (userAccountManager == null) {
            return Collections.emptyList();
        }
        C16753e d = userAccountManager.mo46573d();
        C4776h hVar = C19728f.m47195a(eVar.f33852a).f50165a;
        C5269e d2 = C16759e.m42348d(hVar, "metroInfo");
        for (StopFavorite stopFavorite : d.mo49438l()) {
            d2.mo21066a(MetroEntityType.TRANSIT_STOP, (ServerId) stopFavorite.f52687b);
        }
        C5268d P = new C5267c(eVar, "FavoriteStopsMarkerProvider", hVar, d2).mo21062P();
        ArrayList arrayList = new ArrayList();
        for (StopFavorite stopFavorite2 : d.mo49438l()) {
            TransitStop c = P.mo21064c((ServerId) stopFavorite2.f52687b);
            if (c != null) {
                LocationDescriptor c2 = LocationDescriptor.m17769c(c);
                SparseArray<MarkerZoomStyle> c3 = MarkerZoomStyle.m41440c(c.f23738j);
                C16281i.m41507c(c3);
                arrayList.add(new MarkerProvider.C16214a(c2, c3, (SparseArray<MarkerZoomStyle>) null, "favorites"));
            }
        }
        return arrayList;
    }
}
