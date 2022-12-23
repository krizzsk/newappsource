package p950yw;

import a90.C7519b;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import com.google.android.gms.location.places.Place;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.util.CurrencyAmount;
import p435de.C16596f;
import p977zz.C20961r;
import q80.C13025n;
import y50.C20703a;

/* renamed from: yw.g */
public final /* synthetic */ class C20780g implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f52435a;

    /* renamed from: b */
    public final /* synthetic */ Object f52436b;

    /* renamed from: c */
    public final /* synthetic */ Object f52437c;

    public /* synthetic */ C20780g(int i, Object obj, Object obj2) {
        this.f52435a = i;
        this.f52436b = obj;
        this.f52437c = obj2;
    }

    public final void onChanged(Object obj) {
        T t;
        switch (this.f52435a) {
            case 0:
                TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) this.f52436b;
                todBookingOrderViewModel.getClass();
                todBookingOrderViewModel.mo46213b((Long) ((LiveData) this.f52437c).getValue(), (String) obj);
                return;
            default:
                C7519b bVar = (C7519b) this.f52436b;
                TicketFare ticketFare = (TicketFare) this.f52437c;
                C20961r rVar = (C20961r) obj;
                int i = C7519b.f22988r;
                bVar.mo46784S1();
                if (!rVar.f52711a || (t = rVar.f52712b) == null) {
                    bVar.mo23782p2(rVar.f52713c, ticketFare.f23327c);
                    return;
                }
                C13025n nVar = (C13025n) t;
                PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) bVar.f40822c;
                if (purchaseTicketActivity != null) {
                    PaymentRegistrationInstructions paymentRegistrationInstructions = nVar.f32230m;
                    if (paymentRegistrationInstructions != null) {
                        bVar.startActivityForResult(PaymentRegistrationActivity.m41719z2(purchaseTicketActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions), Place.TYPE_SUBPREMISE);
                        return;
                    }
                    C20703a e = bVar.f22990q.mo52454e();
                    if (e == null || e.f52282f == null) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Can't split payment - no final price."));
                        return;
                    }
                    Context requireContext = bVar.requireContext();
                    PurchaseSplitInstructions purchaseSplitInstructions = nVar.f32231n;
                    CurrencyAmount currencyAmount = e.f52282f;
                    int i2 = PurchaseSplitActivity.f23282l0;
                    Intent intent = new Intent(requireContext, PurchaseSplitActivity.class);
                    intent.putExtra("instructions", purchaseSplitInstructions);
                    intent.putExtra("totalPrice", currencyAmount);
                    bVar.startActivityForResult(intent, Place.TYPE_SYNTHETIC_GEOCODE);
                    return;
                }
                return;
        }
    }
}
