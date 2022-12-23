package com.moovit.app.location.mappicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import c70.C13752e;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.request.ServerException;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.C16281i;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p455dy.C16753e;
import p646lz.C18299a;
import p824tp.C19739q;
import x00.C20440a;

public class FavoriteLocationsMarkerProvider implements MarkerProvider {
    public static final Parcelable.Creator<FavoriteLocationsMarkerProvider> CREATOR = new C15114a();

    /* renamed from: com.moovit.app.location.mappicker.FavoriteLocationsMarkerProvider$a */
    public class C15114a implements Parcelable.Creator<FavoriteLocationsMarkerProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new FavoriteLocationsMarkerProvider();
        }

        public final Object[] newArray(int i) {
            return new FavoriteLocationsMarkerProvider[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* renamed from: x1 */
    public final Collection<MarkerProvider.C16214a> mo23914x1(C18299a aVar, C13752e eVar) throws IOException, ServerException {
        Context context = eVar.f33852a;
        C16753e d = ((UserAccountManager) aVar.mo50695h("USER_ACCOUNT", true)).mo46573d();
        LocationFavorite locationFavorite = d.f43620d;
        LocationFavorite locationFavorite2 = d.f43621e;
        List<LocationFavorite> k = d.mo49437k();
        ArrayList arrayList = new ArrayList(k.size() + 2);
        if (locationFavorite != null) {
            String str = locationFavorite.f40599c;
            if (str == null) {
                str = context.getString(R.string.dashboard_favorites_home);
            }
            String f = ((LocationDescriptor) locationFavorite.f52687b).mo24313f();
            LocationDescriptor locationDescriptor = new LocationDescriptor((LocationDescriptor) locationFavorite.f52687b);
            locationDescriptor.f23651f = str;
            locationDescriptor.f23652g = Collections.singletonList(new C20440a((CharSequence) f, (String) null));
            locationDescriptor.f23655j = new ResourceImage(R.drawable.ic_home_24_on_surface_emphasis_high, new String[0]);
            arrayList.add(new MarkerProvider.C16214a(locationDescriptor, C16281i.m41506b(C19739q.ic_map_favorite_home_44_surface_dark), C16281i.m41506b(C19739q.ic_map_favorite_home_44_secondary), "favorites"));
        }
        if (locationFavorite2 != null) {
            String str2 = locationFavorite2.f40599c;
            if (str2 == null) {
                str2 = context.getString(R.string.dashboard_favorites_work);
            }
            String f2 = ((LocationDescriptor) locationFavorite2.f52687b).mo24313f();
            LocationDescriptor locationDescriptor2 = new LocationDescriptor((LocationDescriptor) locationFavorite2.f52687b);
            locationDescriptor2.f23651f = str2;
            locationDescriptor2.f23652g = Collections.singletonList(new C20440a((CharSequence) f2, (String) null));
            locationDescriptor2.f23655j = new ResourceImage(R.drawable.ic_work_24_on_surface_emphasis_high, new String[0]);
            arrayList.add(new MarkerProvider.C16214a(locationDescriptor2, C16281i.m41506b(C19739q.ic_map_favorite_work_44_surface_dark), C16281i.m41506b(C19739q.ic_map_favorite_work_44_secondary), "favorites"));
        }
        MarkerZoomStyle b = C16281i.m41506b(C19739q.ic_map_favorite_44_surface_dark);
        MarkerZoomStyle b2 = C16281i.m41506b(C19739q.ic_map_favorite_44_secondary);
        for (LocationFavorite next : k) {
            LocationDescriptor locationDescriptor3 = new LocationDescriptor((LocationDescriptor) next.f52687b);
            locationDescriptor3.f23655j = new ResourceImage(R.drawable.ic_favorite_24_on_surface_emphasis_high, new String[0]);
            String str3 = next.f40599c;
            if (str3 != null) {
                locationDescriptor3.f23651f = str3;
                locationDescriptor3.f23652g = Collections.singletonList(new C20440a((CharSequence) ((LocationDescriptor) next.f52687b).mo24313f(), (String) null));
            }
            arrayList.add(new MarkerProvider.C16214a(locationDescriptor3, b, b2, "favorites"));
        }
        return arrayList;
    }
}
