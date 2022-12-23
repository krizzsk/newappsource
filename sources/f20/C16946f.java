package f20;

import com.moovit.itinerary.model.Itinerary;
import com.moovit.util.CurrencyAmount;
import java.math.BigDecimal;
import java.util.Comparator;
import p977zz.C20975x0;

/* renamed from: f20.f */
public final class C16946f implements Comparator<Itinerary> {
    public final int compare(Object obj, Object obj2) {
        BigDecimal bigDecimal;
        CurrencyAmount currencyAmount;
        CurrencyAmount currencyAmount2;
        Itinerary itinerary = (Itinerary) obj;
        Itinerary itinerary2 = (Itinerary) obj2;
        BigDecimal bigDecimal2 = null;
        if (itinerary == null || (currencyAmount2 = itinerary.f41895c.f41904f) == null) {
            bigDecimal = null;
        } else {
            bigDecimal = currencyAmount2.f23845c;
        }
        if (!(itinerary2 == null || (currencyAmount = itinerary2.f41895c.f41904f) == null)) {
            bigDecimal2 = currencyAmount.f23845c;
        }
        return C20975x0.m49116c(bigDecimal, bigDecimal2);
    }
}
