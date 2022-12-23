package f20;

import com.moovit.itinerary.model.Itinerary;
import e20.C16783l;
import java.util.Comparator;

/* renamed from: f20.e */
public final class C16945e implements Comparator<Itinerary> {
    public final int compare(Object obj, Object obj2) {
        int i;
        Itinerary itinerary = (Itinerary) obj;
        Itinerary itinerary2 = (Itinerary) obj2;
        int i2 = Integer.MAX_VALUE;
        if (itinerary != null) {
            i = C16783l.m42472d(itinerary);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (itinerary2 != null) {
            i2 = C16783l.m42472d(itinerary2);
        }
        return Integer.compare(i, i2);
    }
}
