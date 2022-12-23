package com.moovit.location.mappicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.ads.AdError;
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
import i30.C5269e;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import p646lz.C18299a;
import p824tp.C19728f;

public class TransitStopMarkerProvider implements MarkerProvider {
    public static final Parcelable.Creator<TransitStopMarkerProvider> CREATOR = new C16215a();

    /* renamed from: b */
    public final ServerId f42309b;

    /* renamed from: com.moovit.location.mappicker.TransitStopMarkerProvider$a */
    public class C16215a implements Parcelable.Creator<TransitStopMarkerProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new TransitStopMarkerProvider((ServerId) parcel.readParcelable(ServerId.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TransitStopMarkerProvider[i];
        }
    }

    public TransitStopMarkerProvider(ServerId serverId) {
        C21100e.m49373x(serverId, "stopId");
        this.f42309b = serverId;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42309b, i);
    }

    /* renamed from: x1 */
    public final Collection<MarkerProvider.C16214a> mo23914x1(C18299a aVar, C13752e eVar) throws IOException, ServerException {
        C4776h hVar = C19728f.m47195a(eVar.f33852a).f50165a;
        C5269e d = C16759e.m42348d(hVar, "metroInfo");
        d.mo21066a(MetroEntityType.TRANSIT_STOP, this.f42309b);
        TransitStop c = new C5267c(eVar, "TransitStopMarkerProvider", hVar, d).mo21062P().mo21064c(this.f42309b);
        if (c == null) {
            return Collections.emptySet();
        }
        LocationDescriptor c2 = LocationDescriptor.m17769c(c);
        SparseArray<MarkerZoomStyle> c3 = MarkerZoomStyle.m41440c(c.f23738j);
        C16281i.m41507c(c3);
        return Collections.singleton(new MarkerProvider.C16214a(c2, c3, (SparseArray<MarkerZoomStyle>) null, AdError.UNDEFINED_DOMAIN));
    }
}
