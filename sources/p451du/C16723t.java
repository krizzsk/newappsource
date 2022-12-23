package p451du;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.SelectFavoriteLineStopsActivity;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.certificate.PaymentAccountCertificatesFragment;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.account.model.PaymentAccountCertificatePreview;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.CongestionLevel;
import com.tranzmate.R;
import ja0.C12797f;
import p304x.C7071l0;
import p455dy.C16753e;
import p504fz.C17131c;
import p543hq.C17474b;
import p552hz.C17520c;
import v40.C25754i;
import z20.C20806a;

/* renamed from: du.t */
public final /* synthetic */ class C16723t implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f43559b;

    /* renamed from: c */
    public final /* synthetic */ Object f43560c;

    /* renamed from: d */
    public final /* synthetic */ Object f43561d;

    public /* synthetic */ C16723t(int i, Object obj, Object obj2) {
        this.f43559b = i;
        this.f43560c = obj;
        this.f43561d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f43559b) {
            case 0:
                SelectFavoriteLineStopsActivity.C15100a aVar = (SelectFavoriteLineStopsActivity.C15100a) this.f43560c;
                aVar.getClass();
                int adapterPosition = ((C12797f) this.f43561d).getAdapterPosition();
                TransitStop transitStop = aVar.f38806h.get(adapterPosition);
                SelectFavoriteLineStopsActivity selectFavoriteLineStopsActivity = SelectFavoriteLineStopsActivity.this;
                C16753e eVar = selectFavoriteLineStopsActivity.f38804o0;
                if (eVar != null) {
                    ServerId serverId = transitStop.f23730b;
                    if (eVar.mo49442q(serverId)) {
                        selectFavoriteLineStopsActivity.f38804o0.mo49447v(serverId);
                        Snackbar.m35159l(selectFavoriteLineStopsActivity.findViewById(16908290), R.string.stop_removed_favorite, -1).mo42259p();
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_removed");
                        selectFavoriteLineStopsActivity.mo44545v2(aVar2.mo49933a());
                    } else {
                        selectFavoriteLineStopsActivity.f38804o0.mo49435i(serverId);
                        Snackbar.m35159l(selectFavoriteLineStopsActivity.findViewById(16908290), R.string.stop_added_favorite, -1).mo42259p();
                        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_added");
                        selectFavoriteLineStopsActivity.mo44545v2(aVar3.mo49933a());
                        new C20806a.C20807a("add_favorite_station_after_line_tap").mo52935c();
                    }
                    selectFavoriteLineStopsActivity.f38802m0.getAdapter().notifyItemChanged(adapterPosition);
                    return;
                }
                return;
            case 1:
                C15161a aVar4 = (C15161a) this.f43560c;
                LatLonE6 latLonE6 = (LatLonE6) this.f43561d;
                int i = C15161a.f39052i;
                aVar4.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_entrance_explanation_primary_clicked");
                aVar4.mo22564R1(aVar5.mo49933a());
                if (aVar4.f39053h.isChecked()) {
                    A a = aVar4.f40792c;
                    TrackingEvent trackingEvent = TrackingEvent.MOT_STATION_ENTRANCE_EXPLANATION_DIALOG_DISPLAYED;
                    a.getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
                }
                aVar4.mo46753L1(C15161a.C15162a.class, new C7071l0(latLonE6, 8));
                aVar4.dismissAllowingStateLoss();
                return;
            case 2:
                C15340c cVar = (C15340c) this.f43560c;
                cVar.f39716u.mo45910R(cVar.f39705j, (CongestionLevel) this.f43561d);
                return;
            case 3:
                int i2 = C17131c.f44358w;
                ((C17131c) this.f43560c).mo49724c2((LatLonE6) this.f43561d);
                return;
            case 4:
                int i3 = C17520c.f45103w;
                ((C17520c) this.f43560c).mo49970f2((LatLonE6) this.f43561d);
                return;
            case 5:
                ServerId serverId2 = (ServerId) this.f43561d;
                MicroMobilityIntegrationView.C4150c cVar2 = ((MicroMobilityIntegrationView) this.f43560c).f14890f;
                if (cVar2 != null) {
                    cVar2.mo19494W0(serverId2);
                    return;
                }
                return;
            case 6:
                PaymentAccountCertificatePreview paymentAccountCertificatePreview = (PaymentAccountCertificatePreview) this.f43561d;
                PaymentAccountCertificatesFragment paymentAccountCertificatesFragment = PaymentAccountCertificatesFragment.this;
                paymentAccountCertificatesFragment.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_certificate_clicked");
                aVar6.mo49939g(AnalyticsAttributeKey.ID, paymentAccountCertificatePreview.f64023b);
                aVar6.mo49939g(AnalyticsAttributeKey.STATUS, C13555b.m33980t(paymentAccountCertificatePreview.f64028g));
                paymentAccountCertificatesFragment.mo46797j2(aVar6.mo49933a());
                if (paymentAccountCertificatePreview.f64023b != null) {
                    paymentAccountCertificatesFragment.startActivity(PaymentRegistrationActivity.m41717A2(paymentAccountCertificatesFragment.requireContext(), PaymentRegistrationType.REGISTRATION, paymentAccountCertificatePreview.f64023b));
                    return;
                }
                return;
            case 7:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f43560c;
                int i4 = MotPaymentAccountActivity.f64002X;
                motPaymentAccountActivity.getClass();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_change_payment_method_clicked");
                motPaymentAccountActivity.mo44545v2(aVar7.mo49933a());
                motPaymentAccountActivity.startActivityForResult(PaymentCreditCardActivity.m64074y2(motPaymentAccountActivity, (CreditCardInstructions) this.f43561d, CreditCardRequest.Action.ADD, true, C25754i.payment_registration_change_card_title, C25754i.payment_registration_change_card_subtitle), 1001);
                return;
            case 8:
                C7632a aVar8 = (C7632a) this.f43560c;
                int i5 = C7632a.f23237h;
                aVar8.mo23976U1((Ticket) this.f43561d, "cancel_clicked");
                aVar8.dismissAllowingStateLoss();
                return;
            case 9:
                int i6 = PurchaseTicketConfirmedActivity.f23294l0;
                ((PurchaseTicketConfirmedActivity) this.f43560c).mo23967D2((Ticket) this.f43561d);
                return;
            default:
                PurchaseTicketsConfirmedActivity purchaseTicketsConfirmedActivity = PurchaseTicketsConfirmedActivity.this;
                int i7 = PurchaseTicketsConfirmedActivity.f23305Z;
                purchaseTicketsConfirmedActivity.mo23968E2((Ticket) this.f43561d);
                return;
        }
    }
}
