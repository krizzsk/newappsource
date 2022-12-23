package f20;

import com.moovit.itinerary.model.Itinerary;
import java.util.Comparator;
import p977zz.C20975x0;

/* renamed from: f20.b */
public final class C16942b implements Comparator<Itinerary> {
    public final int compare(Object obj, Object obj2) {
        long j;
        Itinerary itinerary = (Itinerary) obj;
        Itinerary itinerary2 = (Itinerary) obj2;
        long j2 = Long.MAX_VALUE;
        if (itinerary != null) {
            j = itinerary.mo48288K1().mo24631g();
        } else {
            j = Long.MAX_VALUE;
        }
        if (itinerary2 != null) {
            j2 = itinerary2.mo48288K1().mo24631g();
        }
        return C20975x0.m49115b(j, j2);
    }
}
