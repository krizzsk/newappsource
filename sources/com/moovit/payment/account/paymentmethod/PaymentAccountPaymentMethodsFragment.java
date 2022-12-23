package com.moovit.payment.account.paymentmethod;

import aa0.C7539k;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.paymentmethod.C25696b;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.view.p340cc.CreditCardPreview;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o00.C18671h;
import o00.C18676l;
import o00.C18681n;
import p028ba.C1512f;
import p054d0.C4294m;
import p244s3.C6442q;
import p501fw.C17102a;
import p543hq.C17474b;
import p572iw.C17662e;
import p664mu.C18448g;
import p783rw.C19370b;
import p783rw.C19372d;
import p977zz.C20964s0;
import q00.C19047a;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25752g;
import v40.C25754i;
import v50.C20101a;
import w40.C25761d;

public class PaymentAccountPaymentMethodsFragment extends C15682c<MoovitActivity> implements C25696b.C25698b {

    /* renamed from: q */
    public static final /* synthetic */ int f64045q = 0;

    /* renamed from: n */
    public final C25685a f64046n = new C25685a(C25751f.payment_account_payment_methods_empty);

    /* renamed from: o */
    public final C25686b f64047o = new C25686b();

    /* renamed from: p */
    public RecyclerView f64048p;

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment$a */
    public class C25685a extends C18671h {
        public C25685a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((ListItemView) onCreateViewHolder.itemView.findViewById(C25750e.header)).getAccessoryView().setOnClickListener(new C17662e(this, 7));
            ((ListItemView) onCreateViewHolder.itemView.findViewById(C25750e.empty_view)).setOnClickListener(new C19370b(this, 11));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment$b */
    public class C25686b extends BroadcastReceiver {
        public C25686b() {
        }

        public final void onReceive(Context context, Intent intent) {
            PaymentAccountPaymentMethodsFragment paymentAccountPaymentMethodsFragment = PaymentAccountPaymentMethodsFragment.this;
            int i = PaymentAccountPaymentMethodsFragment.f64045q;
            paymentAccountPaymentMethodsFragment.mo83527o2();
        }
    }

    /* renamed from: com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment$c */
    public class C25687c extends C18676l<PaymentMethod, C18676l.C18678b<PaymentMethod>, C12797f> implements PaymentMethod.C25688a<ListItemView, Void> {
        public C25687c() {
        }

        /* renamed from: C1 */
        public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
            int i;
            ListItemView listItemView = (ListItemView) obj;
            Context context = listItemView.getContext();
            CreditCardPreview creditCardPreview = creditCardPaymentMethod.f63943e;
            String str = creditCardPreview.f24084d;
            String str2 = creditCardPreview.f24085e;
            boolean equals = PaymentMethodStatus.EXPIRED.equals(creditCardPaymentMethod.f64054d);
            listItemView.setIcon(creditCardPreview.f24082b.iconResId);
            if (equals) {
                i = C25749d.ic_alert_ring_16_critical;
            } else {
                i = 0;
            }
            listItemView.setIconTopEndDecorationDrawable(i);
            listItemView.setTitle((CharSequence) context.getString(C25754i.format_last_digits, new Object[]{creditCardPreview.f24083c}));
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
            if (equals) {
                listItemView.setSubtitle(C25754i.credit_card_expired);
                listItemView.setSubtitleThemeTextColor(C25748c.colorCritical);
            } else if (str == null || str2 == null) {
                listItemView.setSubtitle((CharSequence) null);
            } else {
                listItemView.setSubtitle((CharSequence) context.getString(C25754i.credit_card_menu_item_exp_format, new Object[]{str, str2}));
                listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
            }
            View accessoryView = listItemView.getAccessoryView();
            accessoryView.setVisibility(0);
            accessoryView.setOnClickListener(new C7539k(accessoryView, C25752g.payment_account_payment_method_menu, new C19372d(2, this, creditCardPaymentMethod)));
            return null;
        }

        /* renamed from: K0 */
        public final Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
            int i;
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
            if (str2 != null) {
                listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
            }
            View accessoryView = listItemView.getAccessoryView();
            if (externalPaymentMethod.f64053c) {
                i = 0;
            } else {
                i = 8;
            }
            accessoryView.setVisibility(i);
            View accessoryView2 = listItemView.getAccessoryView();
            accessoryView2.setVisibility(0);
            accessoryView2.setOnClickListener(new C7539k(accessoryView2, C25752g.payment_account_payment_method_menu, new C1512f(5, this, externalPaymentMethod)));
            return null;
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            PaymentMethod paymentMethod = (PaymentMethod) ((C18676l.C18678b) mo51052n(i)).get(i2);
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setTag(paymentMethod);
            paymentMethod.mo83416b(this, listItemView);
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
            View accessoryView = listItemView.getAccessoryView();
            accessoryView.setVisibility(8);
            accessoryView.setOnClickListener((View.OnClickListener) null);
            return null;
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.getAccessoryView().setOnClickListener(new C17102a(this, 17));
            listItemView.setTitle(((C18676l.C18678b) mo51052n(i)).f47556c);
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_account_payment_method_list_item, viewGroup, false));
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C25748c.listItemSectionHeaderStyle);
            listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            listItemView.setAccessoryView(C25751f.section_header_accessory_text_button);
            listItemView.setAccessoryText(C25754i.action_add);
            return new C12797f(listItemView);
        }

        /* renamed from: z0 */
        public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
            ListItemView listItemView = (ListItemView) obj;
            BankPreview bankPreview = bankPaymentMethod.f63932e;
            listItemView.setIcon(bankPreview.f63935c);
            listItemView.setTitle((CharSequence) bankPreview.f63934b);
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
            String str = bankPreview.f63936d;
            if (!C20964s0.m49090h(str)) {
                listItemView.setSubtitle((CharSequence) str);
                listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceCaption);
                listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisHigh);
            } else {
                listItemView.setSubtitle((CharSequence) null);
            }
            View accessoryView = listItemView.getAccessoryView();
            accessoryView.setVisibility(0);
            accessoryView.setOnClickListener(new C7539k(accessoryView, C25752g.payment_account_payment_method_menu, new C4294m(3, this, bankPaymentMethod)));
            return null;
        }
    }

    public PaymentAccountPaymentMethodsFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m64193m2(PaymentAccountPaymentMethodsFragment paymentAccountPaymentMethodsFragment) {
        paymentAccountPaymentMethodsFragment.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_add_clicked");
        paymentAccountPaymentMethodsFragment.mo46797j2(aVar.mo49933a());
        paymentAccountPaymentMethodsFragment.startActivityForResult(PaymentCreditCardActivity.m64075z2(paymentAccountPaymentMethodsFragment.requireContext(), (String) null, (CreditCardInstructions) null, CreditCardRequest.Action.ADD, true, C25754i.payment_my_account_add_title, C25754i.payment_my_account_add_subtitle), 3811);
    }

    /* renamed from: n2 */
    public static void m64194n2(PaymentAccountPaymentMethodsFragment paymentAccountPaymentMethodsFragment, PaymentMethodId paymentMethodId) {
        paymentAccountPaymentMethodsFragment.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_delete_clicked");
        paymentAccountPaymentMethodsFragment.mo46797j2(aVar.mo49933a());
        Bundle bundle = new Bundle();
        C21100e.m49373x(paymentMethodId, "paymentMethodId");
        bundle.putParcelable("paymentMethodId", paymentMethodId);
        C25696b bVar = new C25696b();
        bVar.setArguments(bundle);
        bVar.show(paymentAccountPaymentMethodsFragment.getChildFragmentManager(), "DeletePaymentMethodDialogFragment");
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo83527o2();
    }

    /* renamed from: i1 */
    public final void mo83526i1() {
        Toast.makeText(getContext(), C25754i.payment_my_account_delete_success_message, 0).show();
    }

    /* renamed from: o2 */
    public final void mo83527o2() {
        if (getView() != null && this.f40824e && mo46775H1()) {
            C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
            if (!((Boolean) aVar.mo51505b(C20101a.f51009V)).booleanValue()) {
                this.f64048p.mo4627l0((RecyclerView.Adapter) null);
            } else {
                C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C6442q(3, this, aVar)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18448g(this, aVar, 2));
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3811) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Toast.makeText(requireContext(), C25754i.payment_change_card_success, 0).show();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_payment_methods_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C25750e.recycler_view);
        this.f64048p = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f64048p;
        Context requireContext = requireContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(1, C25749d.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(requireContext, sparseIntArray, false), -1);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f64047o);
        mo83527o2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f64047o);
    }

    /* renamed from: p2 */
    public final void mo83528p2(C19047a aVar, PaymentAccount paymentAccount) {
        if (paymentAccount == null) {
            this.f64048p.mo4627l0((RecyclerView.Adapter) null);
            return;
        }
        List<PaymentMethod> list = paymentAccount.f64016e;
        if (!C13717b.m34258e(list)) {
            C25687c cVar = new C25687c();
            cVar.mo51055y(Collections.singletonList(new C18676l.C18678b(getString(C25754i.purchase_ticket_confirmation_payment_method), list)));
            this.f64048p.mo4627l0(cVar);
        } else if (((Boolean) aVar.mo51505b(C20101a.f51010W)).booleanValue()) {
            this.f64048p.mo4627l0(this.f64046n);
        } else {
            this.f64048p.mo4627l0((RecyclerView.Adapter) null);
        }
    }

    /* renamed from: y1 */
    public final void mo83529y1(Exception exc) {
        mo46795h2(C13751d.m34341b(requireContext(), (String) null, exc));
    }
}
