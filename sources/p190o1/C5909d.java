package p190o1;

import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.ridesharing.model.EventBookingOption;
import java.util.Comparator;
import p977zz.C20975x0;

/* renamed from: o1.d */
public final /* synthetic */ class C5909d implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f18984b;

    public /* synthetic */ C5909d(int i) {
        this.f18984b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f18984b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return Long.compare(((EventBookingOption) obj).f42928c, ((EventBookingOption) obj2).f42928c);
            default:
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
                MicroMobilityRide microMobilityRide2 = (MicroMobilityRide) obj2;
                int compareTo = microMobilityRide.f14991i.f15007b.compareTo(microMobilityRide2.f14991i.f15007b);
                if (compareTo == 0) {
                    return C20975x0.m49115b(microMobilityRide2.f14990h, microMobilityRide.f14990h);
                }
                return compareTo;
        }
    }
}
