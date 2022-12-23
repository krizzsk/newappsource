package com.moovit.app.taxi;

import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import java.util.Map;

public final class TaxiOrder {

    /* renamed from: a */
    public final Source f39912a;

    /* renamed from: b */
    public final LocationDescriptor f39913b;

    /* renamed from: c */
    public final LocationDescriptor f39914c;

    /* renamed from: d */
    public final Map<String, String> f39915d;

    public enum Source {
        DASHBOARD,
        NEAR_ME,
        TRIP_PLAN
    }

    public TaxiOrder(Source source, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, Map<String, String> map) {
        C21100e.m49373x(source, "source");
        this.f39912a = source;
        C21100e.m49373x(locationDescriptor, "pickup");
        this.f39913b = locationDescriptor;
        this.f39914c = locationDescriptor2;
        this.f39915d = map;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiOrder{source=");
        k.append(this.f39912a);
        k.append(", pickup=");
        k.append(this.f39913b);
        k.append(", destination=");
        k.append(this.f39914c);
        k.append(", customParameters=");
        k.append(this.f39915d);
        k.append('}');
        return k.toString();
    }
}
