package p373au;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.schedule.ItineraryScheduleActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.reports.list.ReportsListActivity;
import com.moovit.app.reports.service.C15219b;
import com.moovit.app.reports.service.C15220c;
import com.moovit.app.tod.TodRideChangeDestinationConfirmationActivity;
import com.moovit.app.tod.model.TodRideUpdateOffer;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.ticketing.ticket.Ticket;
import com.tranzmate.R;
import fc0.C12669a;
import hc0.C12753b;
import kc0.C12844i;
import mf0.C24362h;
import p054d0.C4267a0;
import p504fz.C17131c;
import p543hq.C17474b;
import p596jx.C17966n;
import p618kv.C18141b;
import p618kv.C18142c;
import p903ww.C20424c;

/* renamed from: au.g */
public final /* synthetic */ class C13535g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33457b;

    /* renamed from: c */
    public final /* synthetic */ Object f33458c;

    /* renamed from: d */
    public final /* synthetic */ Object f33459d;

    public /* synthetic */ C13535g(int i, Object obj, Object obj2) {
        this.f33457b = i;
        this.f33458c = obj;
        this.f33459d = obj2;
    }

    public final void onClick(View view) {
        C12844i.C12846b bVar;
        C12844i iVar;
        switch (this.f33457b) {
            case 0:
                WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) this.f33459d;
                SingleLegCard.C15073a aVar = ((SingleLegCard) this.f33458c).f38680P;
                if (aVar != null) {
                    ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar;
                    itineraryStepsBaseActivity.startActivity(ItineraryScheduleActivity.m38143y2(itineraryStepsBaseActivity, itineraryStepsBaseActivity.f38499X, itineraryStepsBaseActivity.f38499X.mo48295u0().indexOf(waitToTransitLineLeg)));
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "more_details_schedules_clicked");
                    aVar2.mo49935c(AnalyticsAttributeKey.NUM_OF_ALTERNATIVES, 1);
                    itineraryStepsBaseActivity.mo44545v2(aVar2.mo49933a());
                    return;
                }
                return;
            case 1:
                ReportsListActivity.this.mo45691C2((ServiceAlert) this.f33459d);
                return;
            case 2:
                C15220c cVar = (C15220c) this.f33458c;
                int i = C15220c.f39242g;
                ((C15220c.C15221a) this.f33459d).mo45721a(cVar.getResult());
                UiUtils.m40234B((TextView) cVar.findViewById(R.id.earnedPointsLabel), cVar.getContext().getString(R.string.you_have_earned_points, new Object[]{Integer.valueOf(cVar.getContext().getResources().getInteger(R.integer.reporting_line_or_station))}));
                View findViewById = cVar.findViewById(R.id.dialog_content);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
                ofFloat.addListener(new C18141b(findViewById));
                View findViewById2 = cVar.findViewById(R.id.complete);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, View.ALPHA, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
                ofFloat2.addListener(new C18142c(findViewById2));
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 1000});
                ofInt.setDuration(1000);
                ofInt.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat2).with(ofInt).after(ofFloat);
                animatorSet.addListener(new C15219b(cVar));
                animatorSet.start();
                return;
            case 3:
                C20424c cVar2 = (C20424c) this.f33458c;
                int i2 = C20424c.f51743q;
                cVar2.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_tab_reconnect_clicked");
                cVar2.mo46797j2(aVar3.mo49933a());
                cVar2.startActivity(PaymentRegistrationActivity.m41717A2(view.getContext(), PaymentRegistrationType.REGISTRATION, (String) this.f33459d));
                return;
            case 4:
                TodRideChangeDestinationConfirmationActivity todRideChangeDestinationConfirmationActivity = (TodRideChangeDestinationConfirmationActivity) this.f33458c;
                TodRideUpdateOffer todRideUpdateOffer = (TodRideUpdateOffer) this.f33459d;
                int i3 = TodRideChangeDestinationConfirmationActivity.f40015X;
                todRideChangeDestinationConfirmationActivity.mo44540t2(R.string.tod_passenger_ride_change_destination_checking_message);
                C17966n nVar = new C17966n(todRideChangeDestinationConfirmationActivity.mo44548x1(), todRideUpdateOffer.f40294b, todRideUpdateOffer.f40299g);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C17966n.class, sb, "_");
                sb.append(nVar.f46047w);
                String sb2 = sb.toString();
                RequestOptions c = todRideChangeDestinationConfirmationActivity.f37293B.mo40680c();
                c.f42909f = true;
                todRideChangeDestinationConfirmationActivity.mo44527k2(sb2, nVar, c, todRideChangeDestinationConfirmationActivity.f40016U);
                return;
            case 5:
                int i4 = C17131c.f44358w;
                ((C17131c) this.f33458c).mo49724c2((LatLonE6) this.f33459d);
                return;
            case 6:
                C16328a aVar4 = C16328a.this;
                int i5 = C16328a.f42681h;
                aVar4.getClass();
                aVar4.mo46753L1(PaymentGatewayFragment.class, new C4267a0((PaymentGateway) this.f33459d, 16));
                aVar4.dismissAllowingStateLoss();
                return;
            case 7:
                int i6 = C7632a.f23237h;
                ((C7632a) this.f33458c).mo23975S1((Ticket) this.f33459d);
                return;
            case 8:
                PurchaseTicketsConfirmedActivity purchaseTicketsConfirmedActivity = PurchaseTicketsConfirmedActivity.this;
                int i7 = PurchaseTicketsConfirmedActivity.f23305Z;
                purchaseTicketsConfirmedActivity.mo23969F2((Ticket) this.f33459d);
                return;
            case 9:
                C7762g gVar = (C7762g) this.f33458c;
                int i8 = C7762g.f23551y;
                gVar.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "reconnect_banner_clicked");
                gVar.mo46797j2(aVar5.mo49933a());
                gVar.startActivity(PaymentRegistrationActivity.m41717A2(gVar.requireContext(), PaymentRegistrationType.PURCHASE, (String) this.f33459d));
                return;
            default:
                C12844i iVar2 = (C12844i) this.f33458c;
                C12669a aVar6 = (C12669a) this.f33459d;
                int i9 = C12844i.f31735I;
                C24362h.m61211f(iVar2, "this$0");
                if (view == iVar2.f31761s && (bVar = iVar2.f31758p) != null) {
                    C12753b bVar2 = (C12753b) bVar;
                    if (aVar6 != null && (iVar = bVar2.f31513h) != null) {
                        iVar.mo39679b(aVar6);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
