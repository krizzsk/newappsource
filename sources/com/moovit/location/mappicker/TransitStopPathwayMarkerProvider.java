package com.moovit.location.mappicker;

import android.os.Parcel;
import android.os.Parcelable;
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
import com.moovit.transit.TransitStopPathway;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import p646lz.C18299a;
import p824tp.C19728f;

public class TransitStopPathwayMarkerProvider implements MarkerProvider {
    public static final Parcelable.Creator<TransitStopPathwayMarkerProvider> CREATOR = new C16216a();

    /* renamed from: b */
    public final ServerId f42310b;

    /* renamed from: c */
    public final ServerId f42311c;

    /* renamed from: com.moovit.location.mappicker.TransitStopPathwayMarkerProvider$a */
    public class C16216a implements Parcelable.Creator<TransitStopPathwayMarkerProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new TransitStopPathwayMarkerProvider((ServerId) parcel.readParcelable(ServerId.class.getClassLoader()), (ServerId) parcel.readParcelable(ServerId.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new TransitStopPathwayMarkerProvider[i];
        }
    }

    public TransitStopPathwayMarkerProvider(ServerId serverId, ServerId serverId2) {
        C21100e.m49373x(serverId, "stopId");
        this.f42310b = serverId;
        C21100e.m49373x(serverId2, "pathwayId");
        this.f42311c = serverId2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42310b, i);
        parcel.writeParcelable(this.f42311c, i);
    }

    /* renamed from: x1 */
    public final Collection<MarkerProvider.C16214a> mo23914x1(C18299a aVar, C13752e eVar) throws IOException, ServerException {
        C4776h hVar = C19728f.m47195a(eVar.f33852a).f50165a;
        C5269e d = C16759e.m42348d(hVar, "metroInfo");
        d.mo21066a(MetroEntityType.TRANSIT_STOP, this.f42310b);
        TransitStop c = new C5267c(eVar, "TransitStopPathwayMarkerProvider", hVar, d).mo21062P().mo21064c(this.f42310b);
        if (c == null) {
            return Collections.emptySet();
        }
        TransitStopPathway transitStopPathway = c.f23740l.get(this.f42311c);
        if (transitStopPathway == null) {
            return Collections.emptySet();
        }
        LocationDescriptor c2 = LocationDescriptor.m17769c(c);
        MarkerZoomStyle j = C16281i.m41514j(transitStopPathway.f23749c, false);
        if (j == null) {
            return Collections.emptySet();
        }
        return Collections.singleton(new MarkerProvider.C16214a(c2, j, (MarkerZoomStyle) null, AdError.UNDEFINED_DOMAIN));
    }
}
