package b40;

import c00.C13717b;
import c00.C13720d;
import com.facebook.appevents.C2342l;
import com.moovit.micromobility.ride.MicroMobilityRide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p693nz.C18659h;
import p826tr.C19752b;

/* renamed from: b40.d */
public final class C1476d {

    /* renamed from: c */
    public static final Set<MicroMobilityRide.Status> f5360c = Collections.unmodifiableSet(EnumSet.of(MicroMobilityRide.Status.RESERVED, MicroMobilityRide.Status.ACTIVE, MicroMobilityRide.Status.PAUSED, MicroMobilityRide.Status.PENDING));

    /* renamed from: a */
    public final List<MicroMobilityRide> f5361a;

    /* renamed from: b */
    public final Map<MicroMobilityRide.Status, List<MicroMobilityRide>> f5362b;

    public C1476d(ArrayList arrayList) {
        new C18659h(5);
        this.f5361a = Collections.unmodifiableList(arrayList);
        this.f5362b = Collections.unmodifiableMap(C13720d.m34278h(arrayList, new C25541a(), new C19752b(12), C13720d.f33796a, new C2342l(17)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MicroMobilityUserWallet{rides=");
        k.append(C13717b.m34269p(this.f5361a));
        k.append('}');
        return k.toString();
    }
}
