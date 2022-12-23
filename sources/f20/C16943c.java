package f20;

import ce0.C21100e;
import com.moovit.itinerary.model.Itinerary;
import java.util.Comparator;
import mc0.C12910b;
import p977zz.C20975x0;

/* renamed from: f20.c */
public final class C16943c implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f43958b;

    public /* synthetic */ C16943c(int i) {
        this.f43958b = i;
    }

    public final int compare(Object obj, Object obj2) {
        long j;
        switch (this.f43958b) {
            case 0:
                Itinerary itinerary = (Itinerary) obj;
                Itinerary itinerary2 = (Itinerary) obj2;
                long j2 = Long.MAX_VALUE;
                if (itinerary != null) {
                    j = itinerary.mo48294o1().mo24631g();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (itinerary2 != null) {
                    j2 = itinerary2.mo48294o1().mo24631g();
                }
                return C20975x0.m49115b(j, j2);
            default:
                return C21100e.m49298B(Integer.valueOf(((C12910b) obj2).f31958b), Integer.valueOf(((C12910b) obj).f31958b));
        }
    }
}
