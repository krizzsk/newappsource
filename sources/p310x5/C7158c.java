package p310x5;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import b00.C13556a;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p044ui.widget.ShortNewsCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.schedule.ItineraryScheduleActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.payment.account.subscription.AccountMySubscriptionActivity;
import com.moovit.payment.account.subscription.AccountSubscriptionDetailsActivity;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import com.moovit.request.RequestOptions;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.transit.TransitType;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p543hq.C17474b;
import p664mu.C18443f;
import p664mu.C18451j;
import p664mu.C18461p;
import p664mu.C18462q;
import p757qu.C19177a;
import p881vy.C20251e;

/* renamed from: x5.c */
public final /* synthetic */ class C7158c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f22233b;

    /* renamed from: c */
    public final /* synthetic */ Object f22234c;

    /* renamed from: d */
    public final /* synthetic */ Object f22235d;

    public /* synthetic */ C7158c(int i, Object obj, Object obj2) {
        this.f22233b = i;
        this.f22234c = obj;
        this.f22235d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f22233b) {
            case 0:
                ((ShortNewsCardView) this.f22234c).lambda$onSetCard$0((ShortNewsCard) this.f22235d, view);
                return;
            case 1:
                WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) this.f22235d;
                SingleLegCard.C15073a aVar = ((SingleLegCard) this.f22234c).f38680P;
                if (aVar != null) {
                    ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar;
                    itineraryStepsBaseActivity.startActivity(ItineraryScheduleActivity.m38143y2(itineraryStepsBaseActivity, itineraryStepsBaseActivity.f38499X, itineraryStepsBaseActivity.f38499X.mo48295u0().indexOf(waitToMultiTransitLinesLeg)));
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "more_details_schedules_clicked");
                    aVar2.mo49935c(AnalyticsAttributeKey.NUM_OF_ALTERNATIVES, waitToMultiTransitLinesLeg.f42117b.size());
                    itineraryStepsBaseActivity.mo44545v2(aVar2.mo49933a());
                    return;
                }
                return;
            case 2:
                AbstractLegView abstractLegView = (AbstractLegView) this.f22234c;
                boolean z = !abstractLegView.f38699p;
                abstractLegView.f38699p = z;
                abstractLegView.mo45369B(abstractLegView.f38704u, z);
                abstractLegView.mo45372E((Leg) this.f22235d, abstractLegView.f38699p);
                return;
            case 3:
                C18451j jVar = (C18451j) this.f22234c;
                MotActivation motActivation = (MotActivation) this.f22235d;
                int i = C18451j.f47036q;
                jVar.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_clicked");
                aVar3.mo49937e(AnalyticsAttributeKey.SELECTED_ID, motActivation.f38985b);
                aVar3.mo49939g(AnalyticsAttributeKey.STATUS, motActivation.f38990g.name());
                jVar.mo46797j2(aVar3.mo49933a());
                jVar.startActivity(MotQrCodeViewerActivity.m38705y2(jVar.requireContext(), motActivation.f38985b, motActivation.f38989f));
                return;
            case 4:
                C19177a aVar4 = (C19177a) this.f22234c;
                int i2 = C19177a.f48763h;
                aVar4.getClass();
                if (((MotActivation.ActivationType) this.f22235d).equals(MotActivation.ActivationType.ENTRANCE_AND_EXIT)) {
                    C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "mot_end_ride_clicked");
                    aVar4.mo22564R1(aVar5.mo49933a());
                    A a = aVar4.f40792c;
                    C18443f.m45298d().mo50888b().addOnCompleteListener((Activity) a, new C18461p(a, 0));
                    aVar4.dismissAllowingStateLoss();
                    return;
                }
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "mot_new_ride_clicked");
                aVar4.mo22564R1(aVar6.mo49933a());
                TransitType.VehicleType vehicleType = (TransitType.VehicleType) aVar4.mo46752K1().getParcelable("vehicleType");
                if (vehicleType != null) {
                    C18462q.m45322b(aVar4.f40792c, vehicleType);
                    aVar4.dismissAllowingStateLoss();
                    return;
                }
                throw new IllegalStateException("Did you use newInstance(...)?");
            case 5:
                WondoOfferDetailsActivity wondoOfferDetailsActivity = (WondoOfferDetailsActivity) this.f22234c;
                WondoOffer wondoOffer = (WondoOffer) this.f22235d;
                int i3 = WondoOfferDetailsActivity.f40747Y;
                wondoOfferDetailsActivity.getClass();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_purchase_clicked");
                aVar7.mo49937e(AnalyticsAttributeKey.ID, wondoOffer.f40716c);
                wondoOfferDetailsActivity.mo44545v2(aVar7.mo49933a());
                C13556a aVar8 = wondoOfferDetailsActivity.f40749X;
                if (aVar8 != null) {
                    aVar8.cancel(false);
                    wondoOfferDetailsActivity.f40749X = null;
                }
                wondoOfferDetailsActivity.mo44543u2((CharSequence) null);
                C20251e eVar = new C20251e(wondoOfferDetailsActivity.mo44548x1(), wondoOffer.f40716c, wondoOffer.f40719f);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C20251e.class, sb, "#");
                sb.append(eVar.f51355w);
                String sb2 = sb.toString();
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                wondoOfferDetailsActivity.f40749X = wondoOfferDetailsActivity.mo44527k2(sb2, eVar, requestOptions, wondoOfferDetailsActivity.f40748U);
                return;
            case 6:
                AccountMySubscriptionActivity.C25710a aVar9 = (AccountMySubscriptionActivity.C25710a) this.f22234c;
                PaymentAccountSubscription paymentAccountSubscription = (PaymentAccountSubscription) this.f22235d;
                C24362h.m61211f(aVar9, "this$0");
                C24362h.m61211f(paymentAccountSubscription, "$item");
                AccountMySubscriptionActivity accountMySubscriptionActivity = AccountMySubscriptionActivity.this;
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "more_info_clicked");
                aVar10.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, paymentAccountSubscription.f64132b);
                accountMySubscriptionActivity.mo44545v2(aVar10.mo49933a());
                AccountMySubscriptionActivity accountMySubscriptionActivity2 = AccountMySubscriptionActivity.this;
                int i4 = AccountSubscriptionDetailsActivity.f64123U;
                C24362h.m61211f(accountMySubscriptionActivity2, AppActionRequest.KEY_CONTEXT);
                Intent intent = new Intent(accountMySubscriptionActivity2, AccountSubscriptionDetailsActivity.class);
                intent.putExtra("subscription", paymentAccountSubscription);
                accountMySubscriptionActivity2.startActivity(intent);
                return;
            case 7:
                C7632a aVar11 = (C7632a) this.f22234c;
                int i5 = C7632a.f23237h;
                aVar11.mo23976U1((Ticket) this.f22235d, "cancel_clicked");
                aVar11.dismissAllowingStateLoss();
                return;
            case 8:
                int i6 = PurchaseTicketConfirmedActivity.f23294l0;
                ((PurchaseTicketConfirmedActivity) this.f22234c).mo24057I2((Ticket) this.f22235d);
                return;
            default:
                int i7 = TicketDetailsActivity.f23504m0;
                ((TicketDetailsActivity) this.f22234c).mo23969F2((Ticket) this.f22235d);
                return;
        }
    }
}
