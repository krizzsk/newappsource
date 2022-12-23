package j20;

import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import java.util.List;

/* renamed from: j20.d */
public final class C17707d {

    /* renamed from: a */
    public final LocationDescriptor f45450a;

    /* renamed from: b */
    public final String f45451b;

    /* renamed from: c */
    public final int f45452c;

    /* renamed from: d */
    public final List<LocationDescriptor> f45453d;

    /* renamed from: e */
    public final LocationDescriptor f45454e;

    public C17707d(LocationDescriptor locationDescriptor, String str, int i, List<LocationDescriptor> list, LocationDescriptor locationDescriptor2) {
        C21100e.m49373x(locationDescriptor, "original");
        this.f45450a = locationDescriptor;
        this.f45453d = list;
        this.f45451b = str;
        this.f45452c = i;
        this.f45454e = locationDescriptor2;
    }

    public C17707d(C17707d dVar, LocationDescriptor locationDescriptor) {
        this(dVar.f45450a, dVar.f45451b, dVar.f45452c, dVar.f45453d, locationDescriptor);
    }
}
