package a90;

import androidx.lifecycle.C1044w;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.location.places.Place;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.fare.PurchaseFareStep;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.UUID;
import m80.C12869e;
import p543hq.C17474b;
import p977zz.C20961r;
import q80.C13019h;
import v80.C13184b;
import z20.C20806a;

/* renamed from: a90.a */
public final /* synthetic */ class C7518a implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ C7519b f22986a;

    /* renamed from: b */
    public final /* synthetic */ TicketFare f22987b;

    public /* synthetic */ C7518a(C7519b bVar, TicketFare ticketFare) {
        this.f22986a = bVar;
        this.f22987b = ticketFare;
    }

    public final void onChanged(Object obj) {
        T t;
        TransitAgency transitAgency;
        C7519b bVar = this.f22986a;
        TicketFare ticketFare = this.f22987b;
        C20961r rVar = (C20961r) obj;
        int i = C7519b.f22988r;
        bVar.mo46784S1();
        if (!rVar.f52711a || (t = rVar.f52712b) == null) {
            bVar.mo23782p2(rVar.f52713c, ticketFare.f23327c);
            return;
        }
        C13019h hVar = (C13019h) t;
        PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) bVar.f40822c;
        if (purchaseTicketActivity != null) {
            PaymentRegistrationInstructions paymentRegistrationInstructions = hVar.f32220q;
            PurchaseVerificationType purchaseVerificationType = hVar.f32221r;
            TicketFare ticketFare2 = ((PurchaseFareStep) bVar.f32728o).f23291e;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.TICKET_PURCHASE_RESULT);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, hVar.f32216m);
            aVar.mo49939g(AnalyticsAttributeKey.ID, ticketFare2.f23326b);
            aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, ticketFare2.f23327c);
            aVar.mo49938f(AnalyticsAttributeKey.REQUEST_ID, UUID.randomUUID());
            bVar.mo46797j2(aVar.mo49933a());
            if (paymentRegistrationInstructions != null) {
                bVar.startActivityForResult(PaymentRegistrationActivity.m41719z2(purchaseTicketActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions), Place.TYPE_SUBPREMISE);
            } else if (purchaseVerificationType != null) {
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) bVar.getChildFragmentManager().mo3983z(C12869e.payment_method_view);
                if (paymentGatewayFragment != null) {
                    paymentGatewayFragment.mo48925m2(purchaseVerificationType);
                }
            } else {
                C13184b bVar2 = hVar.f32217n;
                TicketFare ticketFare3 = bVar2.f32730b;
                ServerId serverId = ticketFare3.f23327c;
                CurrencyAmount currencyAmount = ticketFare3.f23330f;
                int i2 = bVar2.f32731c;
                CurrencyAmount currencyAmount2 = bVar2.f32732d;
                TicketAgency ticketAgency = ticketFare3.f23333i;
                DbEntityRef<TransitAgency> dbEntityRef = ticketAgency.f23498e;
                if (dbEntityRef != null) {
                    transitAgency = dbEntityRef.get();
                } else {
                    transitAgency = null;
                }
                TransitType d = C7843b.m17877d(transitAgency);
                C20806a.C20807a aVar2 = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                aVar2.mo52934b("ticketing", "feature");
                aVar2.mo52936d("provider_id", serverId);
                aVar2.mo52934b(ticketFare3.f23326b, "item_id");
                aVar2.mo52934b(ticketFare3.f23328d, "item_name");
                aVar2.mo52934b(Integer.valueOf(i2), "number_of_items");
                aVar2.mo52934b(C25541a.m63895z(d), "transit_type");
                aVar2.mo52934b(ticketAgency.mo24223c(), "agency_name");
                aVar2.mo52938f(currencyAmount);
                aVar2.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount);
                aVar2.mo52937e("revenue", currencyAmount2);
                aVar2.mo52935c();
                purchaseTicketActivity.mo24029C2(hVar.f32218o);
            }
        }
    }
}
