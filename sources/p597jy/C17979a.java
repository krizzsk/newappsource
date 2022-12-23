package p597jy;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.card.MaterialCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingProfileActivity;
import com.moovit.app.useraccount.profile.C15634a;
import com.moovit.app.wondo.tickets.offers.WondoOfferPaymentMethodFragment;
import com.moovit.commons.utils.Color;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.home.lines.search.C16004b;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.micromobility.external.CycleCenterReservationActivity;
import com.moovit.micromobility.purchase.step.filter.C4173a;
import com.moovit.offline.GraphBuildFailureActivity;
import com.moovit.payment.account.PaymentAccountActivity;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.account.paymentmethod.C25696b;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import com.moovit.payment.account.profile.PaymentAccountProfilesFragment;
import com.moovit.request.RequestOptions;
import com.moovit.search.SearchLocationActivity;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.ticketing.validation.provider.agency.TransitAgencySelectionActivity;
import com.moovit.transit.TransitAgency;
import com.moovit.view.p340cc.C7959a;
import e50.C25721c;
import ja0.C12797f;
import l30.C5570c0;
import m50.C18332h;
import m50.C18333i;
import m60.C18342b;
import mobi.lab.veriff.layouts.VeriffToolbar;
import n10.C18504a;
import n10.C18506c;
import n10.C18508e;
import p001a0.C0016g;
import p066e0.C4452q0;
import p067e1.C4503l0;
import p543hq.C17474b;
import p60.C18883a;
import p977zz.C20927a0;
import p977zz.C20964s0;
import v40.C25749d;
import v40.C25754i;
import z80.C13338a;

/* renamed from: jy.a */
public final /* synthetic */ class C17979a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f46063b;

    /* renamed from: c */
    public final /* synthetic */ Object f46064c;

    public /* synthetic */ C17979a(Object obj, int i) {
        this.f46063b = i;
        this.f46064c = obj;
    }

    public final void onClick(View view) {
        C16004b.C16006b bVar;
        String str;
        boolean z;
        boolean z2;
        int i = -1;
        switch (this.f46063b) {
            case 0:
                C15634a aVar = (C15634a) this.f46064c;
                int i2 = C15634a.f40647h;
                Fragment targetFragment = aVar.getTargetFragment();
                if (targetFragment instanceof C15634a.C15635a) {
                    ((C15634a.C15635a) targetFragment).mo46638f0();
                }
                FragmentActivity activity = aVar.getActivity();
                if (activity instanceof C15634a.C15635a) {
                    ((C15634a.C15635a) activity).mo46638f0();
                }
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "logout_confirmed_clicked");
                aVar.mo22564R1(aVar2.mo49933a());
                return;
            case 1:
                WondoOfferPaymentMethodFragment wondoOfferPaymentMethodFragment = (WondoOfferPaymentMethodFragment) this.f46064c;
                int i3 = WondoOfferPaymentMethodFragment.f40751r;
                wondoOfferPaymentMethodFragment.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_payment_method_change_clicked");
                wondoOfferPaymentMethodFragment.mo46797j2(aVar3.mo49933a());
                Context requireContext = wondoOfferPaymentMethodFragment.requireContext();
                int i4 = RideSharingProfileActivity.f39360Y;
                wondoOfferPaymentMethodFragment.startActivity(new Intent(requireContext, RideSharingProfileActivity.class));
                return;
            case 2:
                C16004b bVar2 = (C16004b) this.f46064c;
                bVar2.getClass();
                Class<C18504a> cls = C18504a.class;
                C12797f fVar = (C12797f) view.getTag();
                int adapterPosition = fVar.getAdapterPosition();
                if (adapterPosition != -1 && (bVar = (C16004b.C16006b) bVar2.mo4436j(adapterPosition)) != null) {
                    if (bVar.f41666e != null) {
                        Context e = fVar.mo39638e();
                        SearchLineItem searchLineItem = bVar.f41666e;
                        boolean z3 = bVar.f41667f;
                        C18508e f = C18508e.m45375f(e);
                        f.mo51499b();
                        f.f48438c.mo40645c(searchLineItem.f41637b);
                        f.mo51498a();
                        SearchLineFragment searchLineFragment = SearchLineFragment.this;
                        if (searchLineFragment.f40824e) {
                            int i5 = SearchLineFragment.f41623w;
                            C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                            aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "line_item_clicked");
                            aVar4.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(searchLineFragment.f41628r));
                            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.AGENCY_NAME;
                            TransitAgency transitAgency = searchLineFragment.f41629s;
                            if (transitAgency != null) {
                                str = transitAgency.f23673c;
                            } else {
                                str = "All";
                            }
                            aVar4.mo49939g(analyticsAttributeKey, str);
                            aVar4.mo49941i(AnalyticsAttributeKey.IS_RECENT, z3);
                            aVar4.mo49937e(AnalyticsAttributeKey.SELECTED_ID, searchLineItem.f41637b);
                            aVar4.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C0016g.m15E(searchLineItem.f41639d.get()));
                            aVar4.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, adapterPosition);
                            aVar4.mo49935c(AnalyticsAttributeKey.NUMBER_OF_RESULTS, searchLineFragment.f41624n.getItemCount());
                            searchLineFragment.mo46797j2(aVar4.mo49933a());
                            searchLineFragment.mo46786U1(cls, new C18506c(searchLineFragment, searchLineItem, z3));
                            return;
                        }
                        return;
                    } else if (bVar.f41662a == 7) {
                        fVar.mo39638e();
                        SearchLineFragment searchLineFragment2 = SearchLineFragment.this;
                        if (searchLineFragment2.f40824e) {
                            int i6 = SearchLineFragment.f41623w;
                            C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                            aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "twitter_read_all_clicked");
                            searchLineFragment2.mo46797j2(aVar5.mo49933a());
                            searchLineFragment2.mo46786U1(cls, new C4452q0(13));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                CycleCenterReservationActivity cycleCenterReservationActivity = (CycleCenterReservationActivity) this.f46064c;
                Long l = (Long) cycleCenterReservationActivity.f14870X.getTag();
                Long l2 = (Long) cycleCenterReservationActivity.f14871Y.getTag();
                long currentTimeMillis = System.currentTimeMillis();
                if (l == null || l.longValue() <= currentTimeMillis || l2 == null || l2.longValue() <= currentTimeMillis || l2.longValue() - l.longValue() < 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    Toast.makeText(cycleCenterReservationActivity, C5570c0.provider_form_invalid_time_range_error, 0).show();
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (cycleCenterReservationActivity.f14872Z.getCheckedRadioButtonId() == -1) {
                    z2 = false;
                }
                if (CycleCenterReservationActivity.m11159z2(cycleCenterReservationActivity.f14874m0.getText())) {
                    cycleCenterReservationActivity.f14873l0.setError(cycleCenterReservationActivity.getString(C5570c0.provider_form_invalid_input_error));
                    z2 = false;
                }
                if (CycleCenterReservationActivity.m11159z2(cycleCenterReservationActivity.f14876o0.getText())) {
                    cycleCenterReservationActivity.f14875n0.setError(cycleCenterReservationActivity.getString(C5570c0.provider_form_invalid_input_error));
                    z2 = false;
                }
                if (!C20964s0.m49095m(cycleCenterReservationActivity.f14878q0.getText())) {
                    cycleCenterReservationActivity.f14877p0.setError(cycleCenterReservationActivity.getString(C5570c0.provider_form_invalid_input_error));
                    z2 = false;
                }
                if (!C20964s0.m49093k(cycleCenterReservationActivity.f14880s0.getText())) {
                    cycleCenterReservationActivity.f14879r0.setError(cycleCenterReservationActivity.getString(C5570c0.provider_form_invalid_input_error));
                    z2 = false;
                }
                String C = C20964s0.m49082C(cycleCenterReservationActivity.f14882u0.getText());
                if (C20964s0.m49089g(C)) {
                    i = Integer.parseInt(C);
                }
                if (!CycleCenterReservationActivity.f14868w0.mo53020a(Integer.valueOf(i))) {
                    cycleCenterReservationActivity.f14881t0.setError(cycleCenterReservationActivity.getString(C5570c0.provider_form_invalid_input_error));
                    z2 = false;
                }
                if (z2) {
                    String string = cycleCenterReservationActivity.getString(C5570c0.cycle_center_email_header);
                    String C2 = C20964s0.m49082C(cycleCenterReservationActivity.f14870X.getSubtitle());
                    String C3 = C20964s0.m49082C(cycleCenterReservationActivity.f14871Y.getSubtitle());
                    String C4 = C20964s0.m49082C(((RadioButton) cycleCenterReservationActivity.f14872Z.findViewById(cycleCenterReservationActivity.f14872Z.getCheckedRadioButtonId())).getText());
                    String C5 = C20964s0.m49082C(cycleCenterReservationActivity.f14874m0.getText());
                    String C6 = C20964s0.m49082C(cycleCenterReservationActivity.f14876o0.getText());
                    String C7 = C20964s0.m49082C(cycleCenterReservationActivity.f14878q0.getText());
                    String C8 = C20964s0.m49082C(cycleCenterReservationActivity.f14880s0.getText());
                    String C9 = C20964s0.m49082C(cycleCenterReservationActivity.f14882u0.getText());
                    C20927a0.m49017l(cycleCenterReservationActivity, C20927a0.m49009d(string, cycleCenterReservationActivity.getString(C5570c0.cycle_center_email_body, new Object[]{cycleCenterReservationActivity.getString(C5570c0.cycle_center_email_body_details, new Object[]{C2, C3, C4, C7, C8, C9}), C5, C6}), new String[]{"info@cyclecenter.nl"}));
                    cycleCenterReservationActivity.finish();
                    return;
                }
                return;
            case 4:
                C4173a.C4175b bVar3 = (C4173a.C4175b) this.f46064c;
                bVar3.getClass();
                Integer num = (Integer) view.getTag();
                if (num != null) {
                    ((MaterialCardView) view).setChecked(true);
                    bVar3.mo19546l(num.intValue());
                    return;
                }
                return;
            case 5:
                int i7 = GraphBuildFailureActivity.f15143U;
                C4503l0 l0Var = new C4503l0(view.getContext());
                l0Var.mo20022b((Intent) ((GraphBuildFailureActivity) this.f46064c).getIntent().getParcelableExtra("relaunchIntent"));
                l0Var.mo20024e();
                return;
            case 6:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f46064c;
                int i8 = MotPaymentAccountActivity.f64002X;
                motPaymentAccountActivity.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_disconnect_clicked");
                motPaymentAccountActivity.mo44545v2(aVar6.mo49933a());
                AlertDialogFragment.C15856a aVar7 = new AlertDialogFragment.C15856a((Context) motPaymentAccountActivity);
                aVar7.mo47676e(C25749d.img_door_logout, false);
                AlertDialogFragment.C15856a j = aVar7.mo47682k("confirm_disconnect_dialog_tag").mo47683l(C25754i.payment_mot_profile_disconnect_title).mo47678g(C25754i.payment_mot_profile_disconnect_subtitle).mo47681j(C25754i.payment_mot_profile_disconnect_button);
                j.mo47675d(true);
                motPaymentAccountActivity.mo44530n2(j.mo47673b());
                return;
            case 7:
                C25696b bVar4 = (C25696b) this.f46064c;
                int i9 = C25696b.f64066j;
                bVar4.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
                bVar4.mo22564R1(aVar8.mo49933a());
                PaymentAccountActivity paymentAccountActivity = (PaymentAccountActivity) bVar4.f40792c;
                C25721c cVar = new C25721c(paymentAccountActivity.mo44548x1(), bVar4.f64068i);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C25721c.class, sb, "#");
                sb.append(cVar.f64151w.hashCode());
                String sb2 = sb.toString();
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                paymentAccountActivity.mo44527k2(sb2, cVar, requestOptions, bVar4.f64067h);
                return;
            case 8:
                PaymentAccountProfilesFragment paymentAccountProfilesFragment = (PaymentAccountProfilesFragment) this.f46064c;
                int i11 = PaymentAccountProfilesFragment.f64106q;
                paymentAccountProfilesFragment.getClass();
                C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_adding_profile_clicked");
                paymentAccountProfilesFragment.mo46797j2(aVar9.mo49933a());
                Context requireContext2 = paymentAccountProfilesFragment.requireContext();
                int i12 = PaymentAccountAddProfileActivity.f64096X;
                paymentAccountProfilesFragment.startActivity(new Intent(requireContext2, PaymentAccountAddProfileActivity.class));
                return;
            case 9:
                C18333i iVar = (C18333i) this.f46064c;
                C18333i.C18335b bVar5 = iVar.f46753p;
                if (bVar5 != null) {
                    int i13 = bVar5.f46758i;
                    if (i13 != -1) {
                        i = bVar5.f46757h.get(i13).intValue();
                    }
                    if (i >= 0) {
                        C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
                        aVar10.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C13555b.m33978r(i));
                        aVar10.mo49944l(AnalyticsAttributeKey.IS_CHECKED, iVar.mo50788m2());
                        iVar.mo46797j2(aVar10.mo49933a());
                        iVar.mo46786U1(C18333i.C18334a.class, new C18332h(iVar, i));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                C18342b bVar6 = (C18342b) this.f46064c;
                int i14 = C18342b.f46769t;
                bVar6.getClass();
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "credit_card");
                bVar6.mo46797j2(aVar11.mo49933a());
                C7959a b = bVar6.f46770p.mo24788b();
                if (b != null) {
                    bVar6.f46771q.setClickable(false);
                    bVar6.f46771q.setTextColor(Color.f41004h.f41007b);
                    bVar6.f46773s.setVisibility(0);
                    bVar6.mo50796p2(b);
                    return;
                }
                return;
            case 11:
                int i15 = C18883a.f48058u;
                ((C18883a) this.f46064c).mo51349C2();
                return;
            case 12:
                SearchLocationActivity.this.mo23890A2("choose_map_empty_clicked");
                return;
            case 13:
                PurchaseCartConfirmationActivity.m17482y2(PurchaseCartConfirmationActivity.this);
                return;
            case 14:
                int i16 = C13338a.f33117x;
                ((C13338a) this.f46064c).mo40232n2(true);
                return;
            case 15:
                TransitAgencySelectionActivity.C7769a aVar12 = (TransitAgencySelectionActivity.C7769a) this.f46064c;
                aVar12.getClass();
                TicketAgency ticketAgency = (TicketAgency) view.getTag();
                if (ticketAgency != null) {
                    TransitAgencySelectionActivity transitAgencySelectionActivity = TransitAgencySelectionActivity.this;
                    int i17 = TransitAgencySelectionActivity.f23580U;
                    transitAgencySelectionActivity.getClass();
                    C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar13.mo49939g(AnalyticsAttributeKey.TYPE, "agency_selected");
                    aVar13.mo49939g(AnalyticsAttributeKey.ID, ticketAgency.f23495b);
                    aVar13.mo49939g(AnalyticsAttributeKey.AGENCY_NAME, ticketAgency.mo24223c());
                    transitAgencySelectionActivity.mo44545v2(aVar13.mo49933a());
                    Intent intent = new Intent();
                    intent.putExtra("selectedAgencyKey", ticketAgency.f23495b);
                    transitAgencySelectionActivity.setResult(-1, intent);
                    transitAgencySelectionActivity.finish();
                    return;
                }
                return;
            default:
                ((VeriffToolbar.C24439c) this.f46064c).onLanguageClicked();
                return;
        }
    }
}
