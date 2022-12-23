package l30;

import c00.C13722f;
import com.moovit.micromobility.ride.MicroMobilityRide;
import java.util.Set;
import p977zz.C20975x0;

/* renamed from: l30.h */
public final /* synthetic */ class C5576h implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ String f18272b;

    /* renamed from: c */
    public final /* synthetic */ String f18273c;

    /* renamed from: d */
    public final /* synthetic */ Set f18274d;

    public /* synthetic */ C5576h(String str, String str2, Set set) {
        this.f18272b = str;
        this.f18273c = str2;
        this.f18274d = set;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        String str = this.f18272b;
        String str2 = this.f18273c;
        Set set = this.f18274d;
        MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
        if (!C20975x0.m49118e(str, microMobilityRide.f14984b) || !C20975x0.m49118e(str2, microMobilityRide.f14985c) || !set.contains(microMobilityRide.f14991i.f15007b)) {
            return false;
        }
        return true;
    }
}
