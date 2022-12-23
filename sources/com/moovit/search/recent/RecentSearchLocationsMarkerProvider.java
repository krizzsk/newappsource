package com.moovit.search.recent;

import android.os.Parcel;
import android.os.Parcelable;
import c70.C13752e;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.C16281i;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import f80.C12638d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p646lz.C18299a;
import p824tp.C19739q;

public class RecentSearchLocationsMarkerProvider implements MarkerProvider {
    public static final Parcelable.Creator<RecentSearchLocationsMarkerProvider> CREATOR = new C7609a();

    /* renamed from: com.moovit.search.recent.RecentSearchLocationsMarkerProvider$a */
    public class C7609a implements Parcelable.Creator<RecentSearchLocationsMarkerProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new RecentSearchLocationsMarkerProvider();
        }

        public final Object[] newArray(int i) {
            return new RecentSearchLocationsMarkerProvider[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* renamed from: x1 */
    public final Collection<MarkerProvider.C16214a> mo23914x1(C18299a aVar, C13752e eVar) {
        C12638d dVar = (C12638d) aVar.mo50695h("RECENT_SEARCH_LOCATIONS_STORE", false);
        dVar.mo51499b();
        List<T> e = dVar.f48438c.mo40647e();
        int min = Math.min(e.size(), 5);
        ArrayList arrayList = new ArrayList(min);
        MarkerZoomStyle b = C16281i.m41506b(C19739q.ic_map_recent_44_on_surface_dark_emphasis_low);
        MarkerZoomStyle b2 = C16281i.m41506b(C19739q.ic_map_recent_44_secondary);
        for (int i = 0; i < min; i++) {
            LocationDescriptor locationDescriptor = (LocationDescriptor) e.get(i);
            locationDescriptor.f23655j = new ResourceImage(C19739q.ic_recent_24_surface_inverse_emphasis_high, new String[0]);
            arrayList.add(new MarkerProvider.C16214a(locationDescriptor, b, b2, "recent"));
        }
        return arrayList;
    }
}
