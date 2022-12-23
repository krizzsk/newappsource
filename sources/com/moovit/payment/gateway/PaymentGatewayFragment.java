package com.moovit.payment.gateway;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.activity.result.C0207b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1026n0;
import com.appboy.support.StringUtils;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.cash.CashGateway;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway;
import com.moovit.payment.gateway.googlepay.GooglePayGateway;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.CreditCardPreview;
import java.util.Map;
import mf0.C24361g;
import p009a8.C0114n;
import p054d0.C4314v;
import p065e.C4413c;
import p122i7.C5297a;
import p250s9.C6489b;
import p304x.C7070l;
import p304x.C7071l0;
import p304x.C7121y;
import p376ax.C13543e;
import p430cx.C16522d;
import p543hq.C17474b;
import p714ow.C18847a;
import p761qy.C19201a;
import p808sx.C19568d;
import p923xs.C20566b;
import p923xs.C20576h;
import p977zz.C20941h;
import p977zz.C20964s0;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w50.C20283g;
import y50.C20703a;

public class PaymentGatewayFragment extends C15682c<AbstractPaymentGatewayActivity> implements PaymentGateway.C16321b<ListItemView, Void>, PaymentMethod.C25688a<ListItemView, Void> {

    /* renamed from: y */
    public static final /* synthetic */ int f42661y = 0;

    /* renamed from: n */
    public final C0207b<Intent> f42662n = registerForActivityResult(new C4413c(), new C4314v(this, 16));

    /* renamed from: o */
    public final C0207b<Intent> f42663o = registerForActivityResult(new C4413c(), new C7071l0(this, 15));

    /* renamed from: p */
    public C20283g f42664p;

    /* renamed from: q */
    public View f42665q;

    /* renamed from: r */
    public ListItemView f42666r;

    /* renamed from: s */
    public View f42667s;

    /* renamed from: t */
    public ListItemView f42668t;

    /* renamed from: u */
    public Button f42669u;

    /* renamed from: v */
    public View f42670v;

    /* renamed from: w */
    public PaymentGateway.Tokenizer f42671w = null;

    /* renamed from: x */
    public boolean f42672x = false;

    /* renamed from: com.moovit.payment.gateway.PaymentGatewayFragment$a */
    public interface C16322a {
        /* renamed from: A1 */
        boolean mo23103A1();

        /* renamed from: E */
        void mo23104E();

        /* renamed from: I */
        PaymentGatewayInfo mo23105I();

        /* renamed from: L */
        CharSequence mo23106L();

        /* renamed from: M */
        void mo23107M();

        /* renamed from: c0 */
        void mo23108c0(PaymentGatewayToken paymentGatewayToken);

        /* renamed from: n0 */
        C17474b.C17475a mo23109n0();
    }

    public PaymentGatewayFragment() {
        super(AbstractPaymentGatewayActivity.class);
    }

    /* renamed from: C1 */
    public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
        int i;
        ListItemView listItemView = (ListItemView) obj;
        Context context = listItemView.getContext();
        CreditCardPreview creditCardPreview = creditCardPaymentMethod.f63943e;
        String string = getString(C25754i.format_last_digits, creditCardPreview.f24083c);
        boolean equals = PaymentMethodStatus.EXPIRED.equals(creditCardPaymentMethod.f64054d);
        listItemView.setIcon(creditCardPreview.f24082b.iconResId);
        if (equals) {
            i = C25749d.ic_alert_ring_16_critical;
        } else {
            i = 0;
        }
        listItemView.setIconTopEndDecorationDrawable(i);
        listItemView.setTitle(C25754i.purchase_ticket_confirmation_payment_method);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        if (equals) {
            listItemView.setSubtitle((CharSequence) getString(C25754i.credit_card_expiration_with_latest_digits, string));
            listItemView.setSubtitleTextColor(C20941h.m49043f(C25748c.colorCritical, context));
            return null;
        }
        listItemView.setSubtitle((CharSequence) string);
        listItemView.setSubtitleTextColor(C20941h.m49043f(C25748c.colorOnSurfaceEmphasisMedium, context));
        return null;
    }

    /* renamed from: K0 */
    public final Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        ExternalPaymentMethodPreview externalPaymentMethodPreview = externalPaymentMethod.f64007e;
        listItemView.setIcon(externalPaymentMethodPreview.f64009b);
        String str = externalPaymentMethodPreview.f64010c;
        listItemView.setTitle((CharSequence) str);
        if (str != null) {
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        }
        String str2 = externalPaymentMethodPreview.f64011d;
        listItemView.setSubtitle((CharSequence) str2);
        if (str2 == null) {
            return null;
        }
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
        return null;
    }

    /* renamed from: O */
    public final Object mo48919O(ClearanceProviderGateway clearanceProviderGateway, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        UiUtils.m40238F(8, this.f42666r, this.f42665q);
        mo48927o2();
        return null;
    }

    /* renamed from: Y1 */
    public final void mo46788Y1(MoovitActivity moovitActivity) {
        ((AbstractPaymentGatewayActivity) moovitActivity).f42649U = this;
    }

    /* renamed from: b2 */
    public final void mo46789b2() {
        ((AbstractPaymentGatewayActivity) this.f40822c).f42649U = null;
    }

    /* renamed from: d1 */
    public final Object mo48920d1(GooglePayGateway googlePayGateway, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        listItemView.setIcon(C25749d.wdg_google_pay_mark);
        listItemView.setTitle(C25754i.google_pay_label);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        listItemView.setSubtitle((CharSequence) null);
        UiUtils.m40238F(0, listItemView, this.f42665q);
        this.f42669u.setVisibility(4);
        this.f42670v.setVisibility(0);
        return null;
    }

    /* renamed from: m2 */
    public final void mo48925m2(PurchaseVerificationType purchaseVerificationType) {
        PaymentGateway.Tokenizer tokenizer;
        PaymentGateway value;
        CurrencyAmount currencyAmount;
        A a = this.f40822c;
        if (a != null) {
            C20283g gVar = this.f42664p;
            PaymentGatewayInfo value2 = gVar.f51438l.getValue();
            CreditCardInstructions creditCardInstructions = null;
            if (value2 == null || (value = gVar.f51441o.getValue()) == null) {
                tokenizer = null;
            } else {
                String str = value2.f42673b;
                String str2 = value2.f42675d;
                Map<String, String> map = value2.f42676e;
                C20703a e = gVar.mo52454e();
                if (e != null) {
                    currencyAmount = e.f52282f;
                } else {
                    currencyAmount = null;
                }
                tokenizer = value.mo48905J0(new PaymentGateway.C16320a(str, str2, map, purchaseVerificationType, currencyAmount));
            }
            if (tokenizer == null) {
                PaymentGatewayInstructions c = this.f42664p.mo52452c();
                if (c != null) {
                    creditCardInstructions = c.f42679d;
                }
                CreditCardInstructions creditCardInstructions2 = creditCardInstructions;
                if (creditCardInstructions2 != null) {
                    this.f42663o.mo772a(PaymentCreditCardActivity.m64074y2(requireContext(), creditCardInstructions2, CreditCardRequest.Action.ADD, true, C25754i.payment_my_account_add_title, C25754i.payment_my_account_add_subtitle));
                    return;
                }
                return;
            }
            PaymentGateway.Tokenizer tokenizer2 = this.f42671w;
            if (tokenizer2 != null) {
                tokenizer2.cancel(true);
            }
            this.f42671w = tokenizer;
            tokenizer.f42652c.observe(getViewLifecycleOwner(), new C20576h(this, 4));
            this.f42671w.mo48908f(a);
        }
    }

    /* renamed from: n2 */
    public final void mo48926n2(boolean z) {
        PurchaseVerificationType purchaseVerificationType;
        String str;
        Class<C16322a> cls = C16322a.class;
        FragmentActivity activity = getActivity();
        PaymentGatewayInstructions c = this.f42664p.mo52452c();
        if (activity != null && c != null) {
            if (z) {
                PaymentGateway value = this.f42664p.f51441o.getValue();
                C17474b.C17475a aVar = (C17474b.C17475a) mo46779N1(cls, new C18847a(4));
                if (aVar != null) {
                    AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.SELECTED_ID;
                    if (value != null) {
                        str = value.getType().analyticsName;
                    } else {
                        str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                    }
                    aVar.mo49939g(analyticsAttributeKey, str);
                    mo46797j2(aVar.mo49933a());
                }
            }
            PaymentRegistrationInstructions paymentRegistrationInstructions = c.f42680e;
            if (paymentRegistrationInstructions != null) {
                this.f42662n.mo772a(PaymentRegistrationActivity.m41719z2(activity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
                return;
            }
            C20703a e = this.f42664p.mo52454e();
            if (e == null || e.f52283g) {
                PaymentGatewayInfo value2 = this.f42664p.f51438l.getValue();
                if (value2 != null) {
                    purchaseVerificationType = value2.f42674c;
                } else {
                    purchaseVerificationType = PurchaseVerificationType.NONE;
                }
                mo48925m2(purchaseVerificationType);
                return;
            }
            mo46786U1(cls, new C7070l((Object) null, 19));
        }
    }

    /* renamed from: o2 */
    public final void mo48927o2() {
        CharSequence charSequence = (CharSequence) mo46779N1(C16322a.class, new C6489b(4));
        if (charSequence == null) {
            charSequence = this.f42669u.getResources().getText(C25754i.purchase_action);
        }
        this.f42669u.setText(charSequence);
        this.f42669u.setVisibility(0);
        this.f42670v.setVisibility(4);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        PaymentGateway.Tokenizer tokenizer;
        A a = this.f40822c;
        if (a == null || (tokenizer = this.f42671w) == null || !tokenizer.mo48913c(a, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        PaymentGateway.Tokenizer tokenizer;
        super.onCreate(bundle);
        if (bundle != null) {
            tokenizer = (PaymentGateway.Tokenizer) bundle.getParcelable("activeTokenizer");
        } else {
            tokenizer = null;
        }
        this.f42671w = tokenizer;
        if (tokenizer != null) {
            tokenizer.f42652c.observe(getViewLifecycleOwner(), new C20576h(this, 4));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_gateway_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PaymentGateway.Tokenizer tokenizer = this.f42671w;
        if (tokenizer != null) {
            bundle.putParcelable("activeTokenizer", tokenizer);
        }
    }

    public final void onStart() {
        super.onStart();
        mo48928p2();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20283g gVar = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        this.f42664p = gVar;
        gVar.f51442p.observe(getViewLifecycleOwner(), new C7121y(this, 9));
        C24361g.m61135E(this.f42664p.f51443q).observe(getViewLifecycleOwner(), new C13543e(this, 5));
        this.f42664p.f51437k.observe(getViewLifecycleOwner(), new C20566b(this, 2));
        this.f42664p.f51439m.observe(getViewLifecycleOwner(), new C16522d(this, 2));
        this.f42664p.f51441o.observe(getViewLifecycleOwner(), new C5297a(this, 7));
        this.f42665q = view.findViewById(C25750e.payment_method_divider);
        this.f42666r = (ListItemView) view.findViewById(C25750e.payment_gateway_item_view);
        this.f42667s = view.findViewById(C25750e.terms_of_use_divider);
        this.f42668t = (ListItemView) view.findViewById(C25750e.terms_of_use_item_view);
        Button button = (Button) view.findViewById(C25750e.purchase_button);
        this.f42669u = button;
        button.setOnClickListener(new C19568d(this, 7));
        View findViewById = view.findViewById(C25750e.google_pay_button);
        this.f42670v = findViewById;
        findViewById.setOnClickListener(new C19201a(this, 10));
    }

    /* renamed from: p2 */
    public final void mo48928p2() {
        PaymentGatewayInfo paymentGatewayInfo = (PaymentGatewayInfo) mo46779N1(C16322a.class, new C0114n(2));
        if (paymentGatewayInfo != null) {
            this.f42664p.f51438l.postValue(paymentGatewayInfo);
        }
    }

    /* renamed from: u */
    public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        BalancePreview balancePreview = balancePaymentMethod.f63926e;
        listItemView.setIcon(balancePreview.f63928b);
        listItemView.setTitle((CharSequence) balancePreview.f63929c);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceCaption);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
        listItemView.setSubtitle((CharSequence) balancePreview.f63930d.toString());
        listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurface);
        return null;
    }

    /* renamed from: u1 */
    public final Object mo48921u1(CashGateway cashGateway, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        this.f42666r.setIcon(cashGateway.f42687b);
        this.f42666r.setTitle((CharSequence) cashGateway.f42688c);
        this.f42666r.setSubtitle((CharSequence) cashGateway.f42689d);
        UiUtils.m40238F(0, this.f42666r, this.f42665q);
        mo48927o2();
        return null;
    }

    /* renamed from: w1 */
    public final Object mo48922w1(PaymentMethodGateway paymentMethodGateway, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        paymentMethodGateway.f42704b.mo83416b(this, listItemView);
        UiUtils.m40238F(0, listItemView, this.f42665q);
        mo48927o2();
        return null;
    }

    /* renamed from: z0 */
    public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
        ListItemView listItemView = (ListItemView) obj;
        BankPreview bankPreview = bankPaymentMethod.f63932e;
        listItemView.setIcon(bankPreview.f63935c);
        listItemView.setTitle(C25754i.purchase_ticket_confirmation_payment_method);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        listItemView.setSubtitle(C20964s0.m49099q(" ", bankPreview.f63934b, bankPreview.f63936d));
        listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceCaption);
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisHigh);
        return null;
    }
}
