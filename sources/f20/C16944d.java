package f20;

import com.moovit.itinerary.model.EmissionLevel;
import com.moovit.itinerary.model.Itinerary;
import java.util.Comparator;

/* renamed from: f20.d */
public final class C16944d implements Comparator<Itinerary> {
    public final int compare(Object obj, Object obj2) {
        EmissionLevel emissionLevel;
        int i;
        Itinerary itinerary = (Itinerary) obj;
        Itinerary itinerary2 = (Itinerary) obj2;
        EmissionLevel emissionLevel2 = null;
        if (itinerary != null) {
            emissionLevel = itinerary.f41895c.f41909k;
        } else {
            emissionLevel = null;
        }
        if (itinerary2 != null) {
            emissionLevel2 = itinerary2.f41895c.f41909k;
        }
        int i2 = Integer.MAX_VALUE;
        if (emissionLevel != null) {
            i = emissionLevel.f41890b;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (emissionLevel2 != null) {
            i2 = emissionLevel2.f41890b;
        }
        return Integer.compare(i, i2);
    }
}
