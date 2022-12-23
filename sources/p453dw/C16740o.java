package p453dw;

import a00.C13382a;
import a60.C13390a;
import a90.C7523e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.view.menu.C0297i;
import androidx.appcompat.widget.C0475w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.useraccount.profile.C15634a;
import com.moovit.app.wondo.tickets.codes.WondoCodesActivity;
import com.moovit.barcode.scan.engines.ZxingBarcodeScannerFragment;
import com.moovit.design.dialog.C15859b;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.image.C16017c;
import com.moovit.micromobility.external.CycleCenterReservationActivity;
import com.moovit.payment.account.deposit.DepositActivity;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.account.paymentmethod.C25692a;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.invoices.AccountInvoicesActivity;
import com.moovit.payment.invoices.PaymentAccountUpcomingPaymentActivity;
import com.moovit.payment.registration.steps.p420id.C16373a;
import com.moovit.reports.MissingLineReportActivity;
import com.moovit.request.RequestOptions;
import com.moovit.search.SearchLocationActivity;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.ticketing.wallet.UserWalletActivity;
import com.moovit.web.WebViewActivity;
import f90.C12647g;
import ga0.C12699d;
import h60.C17363v0;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import k60.C18005d;
import mf0.C24362h;
import o10.C18690f;
import p009a8.C0112l;
import p032c0.C1754d;
import p175n.C5773f;
import p304x.C7070l;
import p376ax.C13546h;
import p432cz.C16529d;
import p453dw.C16741p;
import p501fw.C17115l;
import p543hq.C17474b;
import p824tp.C19743u;
import p977zz.C20950l0;
import q00.C19047a;
import q00.C19053d;
import r60.C19229a;
import v40.C25754i;
import w60.C20287b;

/* renamed from: dw.o */
public final /* synthetic */ class C16740o implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f43598b;

    /* renamed from: c */
    public final /* synthetic */ Object f43599c;

    public /* synthetic */ C16740o(Object obj, int i) {
        this.f43598b = i;
        this.f43599c = obj;
    }

    public final void onClick(View view) {
        long j;
        long j2;
        int i;
        C19047a aVar = null;
        boolean z = true;
        switch (this.f43598b) {
            case 0:
                C16741p pVar = (C16741p) this.f43599c;
                String str = C16741p.f43600j;
                pVar.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "take_photo_clicked");
                pVar.mo22564R1(aVar2.mo49933a());
                pVar.f43602i = true;
                pVar.mo46753L1(C16741p.C16742a.class, new C7070l(pVar, 8));
                pVar.dismissAllowingStateLoss();
                return;
            case 1:
                C17115l lVar = (C17115l) this.f43599c;
                int i2 = C17115l.f44295h;
                lVar.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "maybe_later_button_click");
                lVar.mo22564R1(aVar3.mo49933a());
                lVar.requireActivity().finish();
                return;
            case 2:
                C13546h hVar = (C13546h) this.f43599c;
                int i3 = C13546h.f33483w;
                FragmentManager parentFragmentManager = hVar.getParentFragmentManager();
                if (parentFragmentManager.mo3923A("trip_plan_time_tag") == null) {
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "tod_order_change_time_clicked");
                    hVar.mo46797j2(aVar4.mo49933a());
                    long currentTimeMillis = System.currentTimeMillis();
                    C12699d.C12701b bVar = new C12699d.C12701b((Context) hVar.f40822c);
                    bVar.mo39494d("trip_plan_time_tag");
                    bVar.mo39488j();
                    bVar.f31375b.putLong("minTime", currentTimeMillis);
                    if (hVar.mo46785T1("CONFIGURATION")) {
                        aVar = (C19047a) hVar.mo46776J1("CONFIGURATION");
                    }
                    if (aVar != null) {
                        j = (long) ((Integer) aVar.mo51505b(C19053d.f48452D)).intValue();
                    } else {
                        j = 4;
                    }
                    bVar.f31375b.putLong("maxTime", TimeUnit.DAYS.toMillis(j) + System.currentTimeMillis());
                    bVar.mo39483e(0);
                    bVar.mo39486h(hVar.requireContext());
                    bVar.mo39485g();
                    TodBookingOrderViewModel.OrderInformation value = hVar.mo40436p2().f40071c.getValue();
                    if (value != null) {
                        j2 = value.f40084d;
                    } else {
                        j2 = -1;
                    }
                    if (j2 != -1) {
                        bVar.mo39487i(j2);
                    }
                    C12699d k = bVar.mo39489k();
                    k.setTargetFragment(hVar, 0);
                    k.show(parentFragmentManager, "trip_plan_time_tag");
                    return;
                }
                return;
            case 3:
                TodOrderActivity todOrderActivity = (TodOrderActivity) this.f43599c;
                int i4 = TodOrderActivity.f40331D0;
                todOrderActivity.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.EDIT_ORIGIN_CLICKED);
                aVar5.mo49939g(AnalyticsAttributeKey.SOURCE, "tod_ride_order_upper_message");
                todOrderActivity.mo44545v2(aVar5.mo49933a());
                todOrderActivity.startActivityForResult(SearchLocationActivity.m17347y2(todOrderActivity, new AppSearchLocationCallback(0, 0, false, true, true), "tod_ride_order", (String) null), 4333);
                return;
            case 4:
                C15578a aVar6 = (C15578a) this.f43599c;
                int i5 = C15578a.f40521w;
                aVar6.getClass();
                aVar6.mo46797j2(new C17474b.C17475a(AnalyticsEventKey.EDIT_ORIGIN_CLICKED).mo49933a());
                aVar6.startActivityForResult(aVar6.mo40560o2(aVar6.getContext()), 7788);
                return;
            case 5:
                C15634a aVar7 = (C15634a) this.f43599c;
                int i6 = C15634a.f40647h;
                Fragment targetFragment = aVar7.getTargetFragment();
                if (targetFragment instanceof C15634a.C15635a) {
                    ((C15634a.C15635a) targetFragment).mo46637Z();
                }
                FragmentActivity activity = aVar7.getActivity();
                if (activity instanceof C15634a.C15635a) {
                    ((C15634a.C15635a) activity).mo46637Z();
                }
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "logout_canceled_clicked");
                aVar7.mo22564R1(aVar8.mo49933a());
                return;
            case 6:
                WondoCodesActivity wondoCodesActivity = WondoCodesActivity.this;
                if (wondoCodesActivity.f37313z) {
                    int i7 = WondoCodesActivity.f40679Z;
                    wondoCodesActivity.mo46674y2();
                    return;
                }
                return;
            case 7:
                ZxingBarcodeScannerFragment zxingBarcodeScannerFragment = (ZxingBarcodeScannerFragment) this.f43599c;
                int i8 = ZxingBarcodeScannerFragment.f40818p;
                zxingBarcodeScannerFragment.getClass();
                boolean z2 = !view.isActivated();
                view.setActivated(z2);
                CharSequence[] charSequenceArr = new CharSequence[1];
                if (z2) {
                    i = C16529d.voiceover_flashlight_on;
                } else {
                    i = C16529d.voiceover_flashlight_off;
                }
                charSequenceArr[0] = zxingBarcodeScannerFragment.getString(i);
                C13382a.m33665a(view, charSequenceArr);
                QRCodeReaderView qRCodeReaderView = zxingBarcodeScannerFragment.f40819n;
                if (qRCodeReaderView != null) {
                    qRCodeReaderView.setTorchEnabled(z2);
                    C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "flashlight_clicked");
                    aVar9.mo49941i(AnalyticsAttributeKey.STATE, z2);
                    zxingBarcodeScannerFragment.mo46797j2(aVar9.mo49933a());
                    return;
                }
                C24362h.m61217l("qrCodeReaderView");
                throw null;
            case 8:
                C15859b bVar2 = (C15859b) this.f43599c;
                int i9 = C15859b.f41329l;
                C15859b.C15861b H1 = bVar2.mo47685H1();
                if (H1 != null) {
                    H1.mo24111o0();
                }
                bVar2.dismiss();
                return;
            case 9:
                SearchLineFragment.C15994b bVar3 = (SearchLineFragment.C15994b) this.f43599c;
                SearchLineFragment searchLineFragment = SearchLineFragment.this;
                if (searchLineFragment.f40824e && searchLineFragment.f40831l.mo44597e()) {
                    SearchLineFragment searchLineFragment2 = SearchLineFragment.this;
                    searchLineFragment2.mo48149o2(searchLineFragment2.f41630t);
                    return;
                }
                return;
            case 10:
                C18690f fVar = (C18690f) this.f43599c;
                fVar.getClass();
                Context context = view.getContext();
                C0475w0 w0Var = new C0475w0(context, view, 0);
                new C5773f(context).inflate(C19743u.base_search_fragment_clear_history, w0Var.f1650b);
                w0Var.f1653e = new C1754d(5, fVar, context);
                C0297i iVar = w0Var.f1652d;
                if (!iVar.mo1208b()) {
                    if (iVar.f984f == null) {
                        z = false;
                    } else {
                        iVar.mo1210d(0, 0, false, false);
                    }
                }
                if (!z) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                return;
            case 11:
                C20950l0<Integer> l0Var = CycleCenterReservationActivity.f14868w0;
                ((CycleCenterReservationActivity) this.f43599c).mo19481A2("end_time_dialog_fragment_tag");
                return;
            case 12:
                int i11 = DepositActivity.f63947m0;
                ((DepositActivity) this.f43599c).mo83440A2((String) null);
                return;
            case 13:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f43599c;
                int i12 = MotPaymentAccountActivity.f64002X;
                String string = motPaymentAccountActivity.getString(C25754i.payment_mot_services_pricing);
                String string2 = motPaymentAccountActivity.getString(C25754i.payment_mot_services_pricing_link);
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_pricing_clicked");
                aVar10.mo49939g(AnalyticsAttributeKey.URI, string2);
                motPaymentAccountActivity.mo44545v2(aVar10.mo49933a());
                motPaymentAccountActivity.startActivity(WebViewActivity.m18168y2(motPaymentAccountActivity, string2, string));
                return;
            case 14:
                C25692a aVar11 = (C25692a) this.f43599c;
                int i13 = C25692a.f64059i;
                aVar11.getClass();
                C25692a.C25694b bVar4 = (C25692a.C25694b) view.getTag();
                if (bVar4 != null) {
                    Class<C25692a.C25693a> cls = C25692a.C25693a.class;
                    String str2 = bVar4.f64061a;
                    str2.getClass();
                    if (!str2.equals("credit_card")) {
                        if (str2.equals(ProductAction.ACTION_ADD)) {
                            aVar11.mo46753L1(cls, new C0112l(15));
                        }
                    } else if (bVar4.f64062b != null) {
                        aVar11.mo46753L1(cls, new C7070l(bVar4, 17));
                    }
                    aVar11.dismissAllowingStateLoss();
                    return;
                }
                return;
            case 15:
                PaymentSummaryFragment paymentSummaryFragment = (PaymentSummaryFragment) this.f43599c;
                int i14 = PaymentSummaryFragment.f42621s;
                paymentSummaryFragment.getClass();
                new C13390a().show(paymentSummaryFragment.getChildFragmentManager(), "add_voucher_dialog");
                return;
            case 16:
                PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity = (PaymentAccountUpcomingPaymentActivity) this.f43599c;
                int i15 = PaymentAccountUpcomingPaymentActivity.f42714p0;
                paymentAccountUpcomingPaymentActivity.getClass();
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "mot_finalized_bills_clicked");
                paymentAccountUpcomingPaymentActivity.mo44545v2(aVar12.mo49933a());
                int i16 = AccountInvoicesActivity.f42708l0;
                paymentAccountUpcomingPaymentActivity.startActivity(new Intent(paymentAccountUpcomingPaymentActivity, AccountInvoicesActivity.class));
                return;
            case 17:
                C18005d dVar = (C18005d) this.f43599c;
                int i17 = C18005d.f46105t;
                Fragment A = dVar.getChildFragmentManager().mo3923A("image_provider_fragment");
                if (A != null) {
                    C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar13.mo49939g(AnalyticsAttributeKey.TYPE, "id_verification");
                    dVar.mo46797j2(aVar13.mo49933a());
                    ((C16017c) A).mo48181u2(false, false, (Bundle) null);
                    return;
                }
                return;
            case 18:
                int i18 = C16373a.f42789y;
                ((C16373a) this.f43599c).mo49059y2();
                return;
            case 19:
                int i19 = C19229a.f48829A;
                ((C19229a) this.f43599c).mo51648y2();
                return;
            case 20:
                C20287b bVar5 = (C20287b) this.f43599c;
                int i21 = C20287b.f51450t;
                bVar5.getClass();
                C17474b.C17475a aVar14 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar14.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use");
                bVar5.mo46797j2(aVar14.mo49933a());
                bVar5.mo50507x2();
                C17363v0 v0Var = new C17363v0(bVar5.f51452s.f42880f, bVar5.mo46783R1(), bVar5.mo50500p2().f42758b);
                RequestOptions L1 = bVar5.mo46777L1();
                L1.f42909f = true;
                bVar5.mo46793f2("tos_accepted", v0Var, L1, bVar5.f51451r);
                return;
            case 21:
                int i22 = MissingLineReportActivity.f42892m0;
                ((MissingLineReportActivity) this.f43599c).mo49150z2();
                return;
            case 22:
                PurchaseCartConfirmationActivity.m17482y2(PurchaseCartConfirmationActivity.this);
                return;
            case 23:
                C7523e eVar = (C7523e) this.f43599c;
                int i23 = C7523e.f22998q;
                SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult = new SuggestedTicketFareSelectionStepResult(((SuggestedTicketFareSelectionStep) eVar.f32728o).f23246b, (SuggestedTicketFare) null);
                C17474b.C17475a aVar15 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar15.mo49939g(AnalyticsAttributeKey.TYPE, "buy_new_ticket_clicked");
                eVar.mo46797j2(aVar15.mo49933a());
                eVar.mo40058n2(suggestedTicketFareSelectionStepResult);
                return;
            case 24:
                int i24 = C12647g.f31262m;
                ((C12647g) this.f43599c).dismissAllowingStateLoss();
                return;
            case 25:
                C7762g gVar = (C7762g) this.f43599c;
                int i25 = C7762g.f23551y;
                gVar.getClass();
                C17474b.C17475a aVar16 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar16.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_clicked");
                gVar.mo46797j2(aVar16.mo49933a());
                gVar.startActivity(PurchaseTicketActivity.m17465z2(view.getContext(), (PurchaseIntent) null));
                return;
            default:
                UserWalletActivity userWalletActivity = (UserWalletActivity) this.f43599c;
                HashSet hashSet = UserWalletActivity.f23612m0;
                userWalletActivity.getClass();
                C17474b.C17475a aVar17 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar17.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_clicked");
                userWalletActivity.mo44545v2(aVar17.mo49933a());
                userWalletActivity.startActivity(PurchaseTicketActivity.m17465z2(userWalletActivity, userWalletActivity.f23615Y.get(userWalletActivity.f23614X.getCurrentLogicalItem()).purchaseIntent));
                return;
        }
    }
}
