package p394br;

import androidx.fragment.app.Fragment;
import c00.C13722f;
import com.moovit.C15682c;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.payment.confirmation.summary.discounts.Discount;
import com.moovit.payment.invoices.model.Invoice;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import java.math.BigDecimal;
import p595jw.C17948a;
import p810sz.C19617r;
import w50.C20283g;

/* renamed from: br.e */
public final /* synthetic */ class C13659e implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f33691b;

    public /* synthetic */ C13659e(int i) {
        this.f33691b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f33691b) {
            case 0:
                if (((SearchLocationItem) obj).f39458c == SearchLocationItem.Type.STOP) {
                    return true;
                }
                return false;
            case 1:
                C19617r rVar = C17948a.f46011a;
                int i = ((Itinerary) obj).f41895c.f41902d;
                if (i == 2 || i == 3) {
                    return true;
                }
                return false;
            case 2:
                BigDecimal bigDecimal = C20283g.f51427r;
                return !((Discount) obj).f42646f;
            case 3:
                Invoice.Status status = ((Invoice) obj).f42737d;
                if (status == Invoice.Status.APPROVED || status == Invoice.Status.PENDING_APPROVAL) {
                    return false;
                }
                return true;
            default:
                int i2 = PurchaseTicketActivity.f23250Y;
                return ((Fragment) obj) instanceof C15682c;
        }
    }
}
