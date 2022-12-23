package p783rw;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.surveys.answer.SurveyEndReason;
import com.moovit.app.taxi.TaxiOrder;
import com.moovit.app.taxi.providers.TaxiAppInfo;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.tod.C15462b;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffLocationState;
import com.moovit.app.tod.bottomsheet.stateviews.TodCompletedRideView;
import com.moovit.app.tod.model.TodOrderConfig;
import com.moovit.app.tod.order.C15529a;
import com.moovit.app.wondo.tickets.codes.WondoCodesActivity;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.design.view.TextPicker;
import com.moovit.micromobility.damage.MicroMobilityReportDamageActivity;
import com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity;
import com.moovit.payment.account.actions.AccountActionInputStepFragment;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import com.moovit.payment.account.personalinfo.PaymentAccountDetailsActivity;
import com.moovit.payment.account.personalinfo.PaymentAccountPersonalInfoFragment;
import com.moovit.payment.account.settings.PaymentAccountSettingsActivity;
import com.moovit.payment.invoices.AccountInvoicesActivity;
import com.moovit.ticketing.activation.C7634b;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.umo.ads.p348o.zzc;
import ga0.C12713m;
import gc0.C12728d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l30.C5589r;
import m80.C12882q;
import mf0.C24362h;
import n60.C18527a;
import p304x.C7071l0;
import p376ax.C13544f;
import p451du.C16721r;
import p543hq.C17474b;
import p826tr.C19752b;
import p926xv.C20621b;
import p977zz.C20964s0;
import s60.C19437c;
import s60.C19438d;
import s60.C19440e;
import t60.C19630a;
import t60.C19637f;
import v40.C25750e;
import w40.C25761d;
import wb0.C13233c;

/* renamed from: rw.b */
public final /* synthetic */ class C19370b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f49285b;

    /* renamed from: c */
    public final /* synthetic */ Object f49286c;

    public /* synthetic */ C19370b(Object obj, int i) {
        this.f49285b = i;
        this.f49286c = obj;
    }

    public final void onClick(View view) {
        LocationDescriptor locationDescriptor;
        long j;
        boolean z = true;
        switch (this.f49285b) {
            case 0:
                C19371c cVar = (C19371c) this.f49286c;
                String str = C19371c.f49287l;
                cVar.getClass();
                cVar.mo51780T1(SurveyEndReason.CANCELLED);
                if (cVar.f49291k.size() > 0) {
                    cVar.f49288h.setClickable(false);
                    cVar.f49288h.setVisibility(4);
                    new C19369a().show(cVar.getChildFragmentManager(), C19369a.f49283i);
                } else {
                    cVar.dismissAllowingStateLoss();
                }
                Fragment A = cVar.getChildFragmentManager().mo3923A(C19373e.f49295k);
                if (A instanceof C19373e) {
                    ((C19373e) A).dismissAllowingStateLoss();
                    return;
                }
                return;
            case 1:
                C15462b bVar = (C15462b) this.f49286c;
                int i = C15462b.f40053x;
                bVar.getClass();
                TaxiProvider taxiProvider = (TaxiProvider) view.getTag();
                if (taxiProvider != null) {
                    TaxiAppInfo taxiAppInfo = taxiProvider.f39976k;
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_promo_clicked");
                    aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, taxiProvider.f39968c);
                    bVar.mo46797j2(aVar.mo49933a());
                    taxiAppInfo.mo46102b().mo52438b(bVar.f40822c, taxiProvider, new TaxiOrder(TaxiOrder.Source.DASHBOARD, LocationDescriptor.m17772m(view.getContext()), (LocationDescriptor) null, (Map<String, String>) null), (String) null);
                    return;
                }
                return;
            case 2:
                C13544f fVar = (C13544f) this.f49286c;
                int i2 = C13544f.f33477u;
                TodBookingOrderViewModel p2 = fVar.mo40436p2();
                TodBookingDropOffLocationState value = p2.f40079k.getValue();
                if (value != null && (locationDescriptor = value.f40092c) != null) {
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "tod_order_destination_submitted");
                    aVar2.mo49939g(AnalyticsAttributeKey.QUERY_STRING, locationDescriptor.mo24313f());
                    AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.DEPART_NOW;
                    TodBookingOrderViewModel.OrderInformation value2 = p2.f40071c.getValue();
                    if (value2 != null) {
                        j = value2.f40084d;
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        z = false;
                    }
                    aVar2.mo49941i(analyticsAttributeKey, z);
                    fVar.mo46797j2(aVar2.mo49933a());
                    TodBookingOrderViewModel.OrderInformation value3 = p2.f40071c.getValue();
                    if (value3 != null) {
                        p2.f40071c.postValue(new TodBookingOrderViewModel.OrderInformation(value3.f40082b, value3.f40083c, value3.f40084d, value3.f40085e, locationDescriptor));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                TodCompletedRideView todCompletedRideView = (TodCompletedRideView) this.f49286c;
                int i3 = TodCompletedRideView.f40183k;
                todCompletedRideView.getClass();
                C13555b.m33965d(todCompletedRideView);
                return;
            case 4:
                C15529a aVar3 = (C15529a) this.f49286c;
                int i4 = C15529a.f40366i;
                TodOrderConfig S1 = aVar3.mo46410S1();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "save_clicked");
                aVar4.mo49935c(AnalyticsAttributeKey.COUNT, S1.f40257c);
                aVar4.mo49935c(AnalyticsAttributeKey.NUMBER_OF_ACCESSIBLE_SEATS, S1.f40257c);
                aVar3.mo22564R1(aVar4.mo49933a());
                aVar3.mo46753L1(C15529a.C15530a.class, new C7071l0(S1, 10));
                aVar3.dismissAllowingStateLoss();
                return;
            case 5:
                int i5 = WondoCodesActivity.f40679Z;
                ((WondoCodesActivity) this.f49286c).mo46675z2("wondo_codes_purchase_button_clicked");
                return;
            case 6:
                WondoOffersActivity wondoOffersActivity = WondoOffersActivity.this;
                if (wondoOffersActivity.f37313z) {
                    int i6 = WondoOffersActivity.f40757Z;
                    wondoOffersActivity.mo46736z2();
                    return;
                }
                return;
            case 7:
                TextPicker textPicker = (TextPicker) this.f49286c;
                textPicker.f41391b.setInAnimation(textPicker.f41394e);
                textPicker.f41391b.setOutAnimation(textPicker.f41395f);
                textPicker.f41391b.showPrevious();
                textPicker.mo47771b();
                textPicker.mo47770a();
                return;
            case 8:
                MicroMobilityReportedDamagesActivity microMobilityReportedDamagesActivity = (MicroMobilityReportedDamagesActivity) this.f49286c;
                int i7 = MicroMobilityReportedDamagesActivity.f14863l0;
                microMobilityReportedDamagesActivity.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_add_report_clicked");
                microMobilityReportedDamagesActivity.mo44545v2(aVar5.mo49933a());
                String str2 = microMobilityReportedDamagesActivity.f14864U;
                String str3 = microMobilityReportedDamagesActivity.f14865X;
                Intent intent = new Intent(microMobilityReportedDamagesActivity, MicroMobilityReportDamageActivity.class);
                intent.putExtra("serviceId", str2);
                intent.putExtra("itemId", str3);
                microMobilityReportedDamagesActivity.startActivityForResult(intent, 1001);
                return;
            case 9:
                AccountActionInputStepFragment accountActionInputStepFragment = (AccountActionInputStepFragment) this.f49286c;
                int i8 = AccountActionInputStepFragment.f63851q;
                C24362h.m61211f(accountActionInputStepFragment, "this$0");
                accountActionInputStepFragment.mo83339r2();
                return;
            case 10:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f49286c;
                int i9 = MotPaymentAccountActivity.f64002X;
                motPaymentAccountActivity.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_bills_clicked");
                motPaymentAccountActivity.mo44545v2(aVar6.mo49933a());
                int i11 = AccountInvoicesActivity.f42708l0;
                motPaymentAccountActivity.startActivity(new Intent(motPaymentAccountActivity, AccountInvoicesActivity.class));
                return;
            case 11:
                PaymentAccountPaymentMethodsFragment.m64193m2(PaymentAccountPaymentMethodsFragment.this);
                return;
            case 12:
                PaymentAccountPersonalInfoFragment paymentAccountPersonalInfoFragment = (PaymentAccountPersonalInfoFragment) this.f49286c;
                int i12 = PaymentAccountPersonalInfoFragment.f64090r;
                paymentAccountPersonalInfoFragment.getClass();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_show_details_clicked");
                paymentAccountPersonalInfoFragment.mo46797j2(aVar7.mo49933a());
                FragmentActivity requireActivity = paymentAccountPersonalInfoFragment.requireActivity();
                int i13 = PaymentAccountDetailsActivity.f64070n0;
                paymentAccountPersonalInfoFragment.startActivity(new Intent(requireActivity, PaymentAccountDetailsActivity.class));
                return;
            case 13:
                PaymentAccountSettingsActivity paymentAccountSettingsActivity = (PaymentAccountSettingsActivity) this.f49286c;
                int i14 = PaymentAccountSettingsActivity.f64114l0;
                paymentAccountSettingsActivity.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "save_clicked");
                paymentAccountSettingsActivity.mo44545v2(aVar8.mo49933a());
                paymentAccountSettingsActivity.f64118Z.setVisibility(0);
                paymentAccountSettingsActivity.f64117Y.setText((CharSequence) null);
                paymentAccountSettingsActivity.f64117Y.setClickable(false);
                paymentAccountSettingsActivity.f64116X.setClickable(false);
                C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) paymentAccountSettingsActivity, new C20621b(3, paymentAccountSettingsActivity, (Boolean) paymentAccountSettingsActivity.f64116X.getTag(C25750e.view_tag_param1))).addOnFailureListener((Activity) paymentAccountSettingsActivity, (OnFailureListener) new C5589r(paymentAccountSettingsActivity, 2));
                return;
            case 14:
                C18527a aVar9 = (C18527a) this.f49286c;
                aVar9.mo50932n2(aVar9.f47168x.getPinCode());
                return;
            case 15:
                C19438d dVar = (C19438d) this.f49286c;
                List list = (List) C13723g.m34283d(dVar.f49442n, new ArrayList(dVar.f49444p.size()), new C16721r(dVar, 5));
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "profiles_selection");
                aVar10.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, C13720d.m34273c(list, (C13722f) null, new C19752b(18))));
                dVar.mo46797j2(aVar10.mo49933a());
                dVar.mo46786U1(C19438d.C19439a.class, new C19437c(list));
                return;
            case 16:
                C19630a aVar11 = (C19630a) this.f49286c;
                int i15 = C19630a.f49807u;
                aVar11.getClass();
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "skip_clicked");
                aVar11.mo46797j2(aVar12.mo49933a());
                new C19440e().show(aVar11.getChildFragmentManager(), "SkipProfileDialog");
                return;
            case 17:
                C19637f fVar2 = (C19637f) this.f49286c;
                int i16 = C19637f.f49826h;
                fVar2.getClass();
                C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar13.mo49939g(AnalyticsAttributeKey.TYPE, "cancel_clicked");
                fVar2.mo22564R1(aVar13.mo49933a());
                fVar2.dismissAllowingStateLoss();
                return;
            case 18:
                C7634b bVar2 = (C7634b) this.f49286c;
                int i17 = C7634b.f23238h;
                bVar2.getClass();
                C17474b.C17475a aVar14 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar14.mo49939g(AnalyticsAttributeKey.TYPE, "confirmation_dialog_confirmed");
                bVar2.mo22564R1(aVar14.mo49933a());
                bVar2.mo46753L1(C7634b.C7635a.class, new C12882q((TicketId) bVar2.mo46752K1().getParcelable("ticketId")));
                bVar2.dismissAllowingStateLoss();
                return;
            case 19:
                BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment = (BottomSheetMenuDialogFragment) this.f49286c;
                int i18 = BottomSheetMenuDialogFragment.f24110i;
                bottomSheetMenuDialogFragment.getClass();
                BottomSheetMenuDialogFragment.MenuItem menuItem = (BottomSheetMenuDialogFragment.MenuItem) view.getTag();
                if (menuItem != null) {
                    bottomSheetMenuDialogFragment.mo46753L1(BottomSheetMenuDialogFragment.C7965a.class, new C7071l0(menuItem, 19));
                    bottomSheetMenuDialogFragment.dismissAllowingStateLoss();
                    return;
                }
                return;
            case 20:
                C12713m mVar = (C12713m) this.f49286c;
                int i19 = C12713m.f31390m;
                mVar.getClass();
                C17474b.C17475a aVar15 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar15.mo49939g(AnalyticsAttributeKey.TYPE, "popup_string_picker_canceled");
                mVar.mo22564R1(aVar15.mo49933a());
                mVar.mo39508S1();
                return;
            default:
                zzc zzc = (zzc) this.f49286c;
                C24362h.m61211f(zzc, "this$0");
                C13233c.f32843b.post(new C12728d(zzc, 1));
                return;
        }
    }
}
