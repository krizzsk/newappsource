package com.moovit.app.location.mappicker;

import android.os.Parcel;
import android.os.Parcelable;
import c70.C13752e;
import com.moovit.app.search.locations.SearchLocationItem;
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
import java.util.List;
import p646lz.C18299a;
import p824tp.C19739q;
import p878vv.C20236c;

public class RecentLocationsMarkerProvider implements MarkerProvider {
    public static final Parcelable.Creator<RecentLocationsMarkerProvider> CREATOR = new C15116a();

    /* renamed from: com.moovit.app.location.mappicker.RecentLocationsMarkerProvider$a */
    public class C15116a implements Parcelable.Creator<RecentLocationsMarkerProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new RecentLocationsMarkerProvider();
        }

        public final Object[] newArray(int i) {
            return new RecentLocationsMarkerProvider[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* renamed from: x1 */
    public final Collection<MarkerProvider.C16214a> mo23914x1(C18299a aVar, C13752e eVar) throws IOException, ServerException {
        C20236c f = C20236c.m47804f(eVar.f33852a);
        f.mo51499b();
        List<T> e = f.f48438c.mo40647e();
        int min = Math.min(e.size(), 5);
        ArrayList arrayList = new ArrayList(min);
        MarkerZoomStyle b = C16281i.m41506b(C19739q.ic_map_recent_44_on_surface_dark_emphasis_low);
        MarkerZoomStyle b2 = C16281i.m41506b(C19739q.ic_map_recent_44_secondary);
        for (int i = 0; i < min; i++) {
            LocationDescriptor g = SearchLocationItem.m39103g((SearchLocationItem) e.get(i));
            g.f23655j = new ResourceImage(R.drawable.ic_recent_24_surface_inverse_emphasis_high, new String[0]);
            arrayList.add(new MarkerProvider.C16214a(g, b, b2, "recent"));
        }
        return arrayList;
    }
}
