package com.moovit.app.home.dashboard;

import c00.C13719c;
import c00.C13722f;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.transit.C7841a;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import com.tranzmate.moovit.protocol.gtfs.MVPlatformLines;
import p705on.C18805l;

/* renamed from: com.moovit.app.home.dashboard.l */
public final /* synthetic */ class C14948l implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f38256b;

    public /* synthetic */ C14948l(int i) {
        this.f38256b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f38256b) {
            case 0:
                int i = C14949m.f38257s;
                return LocationDescriptor.LocationType.STOP.equals(((LocationDescriptor) ((LocationFavorite) obj).f52687b).f23647b);
            case 1:
                if (((C18805l) obj).f47902e.intValue() > 0) {
                    return true;
                }
                return false;
            case 2:
                MVPlatformLines mVPlatformLines = (MVPlatformLines) obj;
                C13719c cVar = C7841a.f23766a;
                if (mVPlatformLines == null || mVPlatformLines.name == null) {
                    return false;
                }
                return true;
            default:
                return ((Time) obj).mo24633j();
        }
    }
}
