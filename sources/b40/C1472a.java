package b40;

import c00.C13717b;
import com.moovit.micromobility.ride.MicroMobilityRide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b40.a */
public final class C1472a {

    /* renamed from: a */
    public final List<MicroMobilityRide> f5348a;

    public C1472a(ArrayList arrayList) {
        this.f5348a = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MicroMobilityRidesHistory{rides=");
        k.append(C13717b.m34269p(this.f5348a));
        k.append('}');
        return k.toString();
    }
}
