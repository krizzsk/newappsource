package f20;

import com.moovit.itinerary.model.Itinerary;
import e20.C16783l;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p977zz.C20975x0;

/* renamed from: f20.a */
public final class C16941a implements Comparator<Itinerary> {
    public final int compare(Object obj, Object obj2) {
        long j;
        Itinerary itinerary = (Itinerary) obj;
        Itinerary itinerary2 = (Itinerary) obj2;
        long j2 = Long.MAX_VALUE;
        if (itinerary != null) {
            j = C16783l.m42485q(itinerary, TimeUnit.MILLISECONDS);
        } else {
            j = Long.MAX_VALUE;
        }
        if (itinerary2 != null) {
            j2 = C16783l.m42485q(itinerary2, TimeUnit.MILLISECONDS);
        }
        return C20975x0.m49115b(j, j2);
    }
}
