package p607kk;

import com.moovit.itinerary.model.Itinerary;
import e20.C16783l;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: kk.e */
public final class C18089e implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f46246b;

    public /* synthetic */ C18089e(int i) {
        this.f46246b = i;
    }

    public final int compare(Object obj, Object obj2) {
        long j;
        switch (this.f46246b) {
            case 0:
                if (obj == null && obj2 == null) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                return -1;
            default:
                Itinerary itinerary = (Itinerary) obj;
                Itinerary itinerary2 = (Itinerary) obj2;
                long j2 = Long.MAX_VALUE;
                if (itinerary != null) {
                    j = C16783l.m42487s(itinerary, TimeUnit.MILLISECONDS);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (itinerary2 != null) {
                    j2 = C16783l.m42487s(itinerary2, TimeUnit.MILLISECONDS);
                }
                return Long.compare(j, j2);
        }
    }
}
