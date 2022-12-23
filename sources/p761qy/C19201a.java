package p761qy;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.view.menu.C0297i;
import androidx.appcompat.widget.C0475w0;
import androidx.lifecycle.Lifecycle;
import c00.C13717b;
import com.google.android.gms.common.Scopes;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.consent.WondoConsentActivity;
import com.moovit.app.wondo.tickets.codes.WondoCodeDetailsActivity;
import com.moovit.app.wondo.tickets.invite.WondoInviteActivity;
import com.moovit.design.view.NumericStepperView;
import com.moovit.home.lines.search.C16004b;
import com.moovit.payment.account.external.ExternalPaymentAccountsFragment;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.account.model.PaymentAccountContext;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.account.personalinfo.PaymentAccountEditDetailsActivity;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueConfirmedActivity;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import g50.C25728b;
import g50.C25730d;
import g50.C25732f;
import ja0.C12795d;
import ja0.C12797f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import m80.C12875k;
import p001a0.C0016g;
import p019b0.C1436m;
import p175n.C5773f;
import p241s0.C6302b;
import p304x.C7065j0;
import p543hq.C17474b;
import p552hz.C17520c;
import p824tp.C19743u;
import p833ty.C19793a;
import p977zz.C20927a0;
import p977zz.C20964s0;
import s60.C19433a;
import v40.C25750e;
import w00.C20263d;
import w40.C25760c;
import z80.C13338a;

/* renamed from: qy.a */
public final /* synthetic */ class C19201a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f48807b;

    /* renamed from: c */
    public final /* synthetic */ Object f48808c;

    public /* synthetic */ C19201a(Object obj, int i) {
        this.f48807b = i;
        this.f48808c = obj;
    }

    public final void onClick(View view) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        boolean z = true;
        switch (this.f48807b) {
            case 0:
                WondoConsentActivity wondoConsentActivity = (WondoConsentActivity) this.f48808c;
                int i = WondoConsentActivity.f40676U;
                wondoConsentActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
                wondoConsentActivity.mo44545v2(aVar.mo49933a());
                wondoConsentActivity.mo46672y2(true);
                return;
            case 1:
                WondoCodeDetailsActivity wondoCodeDetailsActivity = (WondoCodeDetailsActivity) this.f48808c;
                int i2 = WondoCodeDetailsActivity.f40677X;
                wondoCodeDetailsActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_code_copy_to_clipboard_clicked");
                wondoCodeDetailsActivity.mo44545v2(aVar2.mo49933a());
                ((ClipboardManager) wondoCodeDetailsActivity.getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("wondo_code", wondoCodeDetailsActivity.f40678U.f40697c));
                wondoCodeDetailsActivity.mo44535p2(wondoCodeDetailsActivity.getString(R.string.wondo_code_details_clipboard_dialog_title), wondoCodeDetailsActivity.getString(R.string.wondo_code_details_clipboard_dialog_message));
                return;
            case 2:
                WondoInviteActivity wondoInviteActivity = (WondoInviteActivity) this.f48808c;
                int i3 = WondoInviteActivity.f40691Y;
                wondoInviteActivity.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_invite_share_clicked");
                wondoInviteActivity.mo44545v2(aVar3.mo49933a());
                C19793a aVar4 = wondoInviteActivity.f40692U;
                wondoInviteActivity.startActivity(Intent.createChooser(C20927a0.m49012g(aVar4.f50322g, aVar4.f50321f), wondoInviteActivity.getString(R.string.share_with)));
                return;
            case 3:
                C17520c cVar = (C17520c) this.f48808c;
                int i4 = C17520c.f45103w;
                cVar.mo49969e2("download_app");
                cVar.dismissAllowingStateLoss();
                return;
            case 4:
                NumericStepperView numericStepperView = (NumericStepperView) this.f48808c;
                int i5 = NumericStepperView.f41362h;
                numericStepperView.getClass();
                if (view.getId() == C20263d.add_button) {
                    numericStepperView.mo47719b(numericStepperView.f41367f + 1, true);
                    return;
                } else {
                    numericStepperView.mo47719b(numericStepperView.f41367f - 1, true);
                    return;
                }
            case 5:
                C16004b bVar = (C16004b) this.f48808c;
                bVar.getClass();
                Context context = view.getContext();
                C0475w0 w0Var = new C0475w0(context, view, 0);
                new C5773f(context).inflate(C19743u.base_search_fragment_clear_history, w0Var.f1650b);
                w0Var.f1653e = new C7065j0(3, bVar, context);
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
            case 6:
                ExternalPaymentAccountsFragment externalPaymentAccountsFragment = (ExternalPaymentAccountsFragment) this.f48808c;
                C6302b bVar2 = ExternalPaymentAccountsFragment.f63974r;
                externalPaymentAccountsFragment.getClass();
                PaymentAccountContext paymentAccountContext = (PaymentAccountContext) view.getTag(C25750e.view_tag_param1);
                String str = paymentAccountContext.f64030b;
                PaymentAccountContextStatus paymentAccountContextStatus = paymentAccountContext.f64031c;
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_external_account_clicked");
                aVar5.mo49939g(AnalyticsAttributeKey.ID, str);
                aVar5.mo49939g(AnalyticsAttributeKey.STATE, C13555b.m33979s(paymentAccountContextStatus));
                externalPaymentAccountsFragment.mo46797j2(aVar5.mo49933a());
                externalPaymentAccountsFragment.f63975n.mo772a((Intent) view.getTag(C25750e.view_tag_param2));
                return;
            case 7:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f48808c;
                int i6 = MotPaymentAccountActivity.f64002X;
                motPaymentAccountActivity.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "send_feedback_clicked");
                motPaymentAccountActivity.mo44545v2(aVar6.mo49933a());
                Intent i7 = C20927a0.m49014i(Uri.parse("moovit://feedback").buildUpon().appendQueryParameter("o", "mot_feedback").build());
                i7.setPackage(motPaymentAccountActivity.getPackageName());
                C20927a0.m49017l(motPaymentAccountActivity, i7);
                return;
            case 8:
                int i8 = PaymentAccountEditDetailsActivity.f64077s0;
                ((PaymentAccountEditDetailsActivity) this.f48808c).mo83546z2();
                return;
            case 9:
                C25732f fVar = (C25732f) this.f48808c;
                fVar.getClass();
                int adapterPosition = ((C12797f) view.getTag()).getAdapterPosition();
                if (adapterPosition != -1) {
                    PaymentProfile paymentProfile = fVar.f64168h.get(adapterPosition);
                    C25732f.C25733a aVar7 = fVar.f64169i;
                    if (aVar7 != null) {
                        C25730d dVar = (C25730d) aVar7;
                        C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "profile_clicked");
                        aVar8.mo49937e(AnalyticsAttributeKey.ID, paymentProfile.f42828b);
                        dVar.mo46797j2(aVar8.mo49933a());
                        PaymentAccountAddProfileActivity paymentAccountAddProfileActivity = (PaymentAccountAddProfileActivity) dVar.f40822c;
                        paymentAccountAddProfileActivity.getClass();
                        if (C13717b.m34258e(paymentProfile.f42833g)) {
                            paymentAccountAddProfileActivity.mo83549y2(paymentProfile, Collections.emptyList());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(Scopes.PROFILE, paymentProfile);
                        C25728b bVar3 = new C25728b();
                        bVar3.setArguments(bundle);
                        paymentAccountAddProfileActivity.mo83550z2(bVar3, true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                int i9 = PaymentGatewayFragment.f42661y;
                ((PaymentGatewayFragment) this.f48808c).mo48926n2(true);
                return;
            case 11:
                C19433a aVar9 = (C19433a) this.f48808c;
                String str2 = C19433a.f49434n;
                aVar9.getClass();
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
                aVar9.mo46797j2(aVar10.mo49933a());
                ArrayList parcelableArrayList = aVar9.mo46782Q1().getParcelableArrayList("profiles");
                if (parcelableArrayList != null) {
                    aVar9.mo46786U1(C19433a.C19434a.class, new C1436m(parcelableArrayList, 10));
                    return;
                }
                return;
            case 12:
                C13338a aVar11 = (C13338a) this.f48808c;
                String C = C20964s0.m49082C(aVar11.f33123s.getText());
                if (C20964s0.m49090h(C)) {
                    bigDecimal = BigDecimal.ZERO;
                } else {
                    bigDecimal = new BigDecimal(C);
                }
                CurrencyAmount currencyAmount = new CurrencyAmount(aVar11.f33121q.f23844b, bigDecimal);
                String C2 = C20964s0.m49082C(aVar11.f33125u.getText());
                if (C20964s0.m49090h(C)) {
                    bigDecimal2 = BigDecimal.ZERO;
                } else {
                    bigDecimal2 = new BigDecimal(C2);
                }
                CurrencyAmount currencyAmount2 = new CurrencyAmount(aVar11.f33121q.f23844b, bigDecimal2);
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "split_payment_submitted");
                aVar12.mo49936d(AnalyticsAttributeKey.AMOUNT, C0016g.m19b(aVar11.f33121q));
                aVar12.mo49936d(AnalyticsAttributeKey.PRIMARY_AMOUNT, C0016g.m19b(currencyAmount));
                aVar12.mo49936d(AnalyticsAttributeKey.SECONDARY_AMOUNT, C0016g.m19b(currencyAmount2));
                aVar12.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, aVar11.f33121q.f23844b);
                aVar11.mo46797j2(aVar12.mo49933a());
                aVar11.mo46786U1(PurchaseSplitActivity.class, new C25760c(5, currencyAmount, currencyAmount2));
                return;
            case 13:
                PurchaseTicketConfirmedActivity purchaseTicketConfirmedActivity = (PurchaseTicketConfirmedActivity) this.f48808c;
                int i11 = PurchaseTicketConfirmedActivity.f23294l0;
                purchaseTicketConfirmedActivity.getClass();
                purchaseTicketConfirmedActivity.startActivity(C12875k.m32667g(purchaseTicketConfirmedActivity));
                return;
            case 14:
                PurchaseStoredValueConfirmedActivity purchaseStoredValueConfirmedActivity = (PurchaseStoredValueConfirmedActivity) this.f48808c;
                int i12 = PurchaseStoredValueConfirmedActivity.f23436U;
                purchaseStoredValueConfirmedActivity.getClass();
                C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar13.mo49939g(AnalyticsAttributeKey.TYPE, FullScreenWidgetActivity.EXTRA_DISMISS);
                purchaseStoredValueConfirmedActivity.mo44545v2(aVar13.mo49933a());
                purchaseStoredValueConfirmedActivity.finish();
                return;
            default:
                C12795d dVar2 = (C12795d) this.f48808c;
                if (dVar2.f31617h.getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
                    dVar2.f31620k.run();
                    return;
                }
                return;
        }
    }
}
