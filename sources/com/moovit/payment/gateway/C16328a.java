package com.moovit.payment.gateway;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.cash.CashGateway;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway;
import com.moovit.payment.gateway.googlepay.GooglePayGateway;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.view.p340cc.CreditCardPreview;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import k00.C17988b;
import o00.C18665b;
import p073e7.C4584b;
import p373au.C13535g;
import p501fw.C17102a;
import p543hq.C17474b;
import p584jl.C17885a;
import p644lx.C18284b;
import p977zz.C20964s0;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: com.moovit.payment.gateway.a */
public class C16328a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f42681h = 0;

    /* renamed from: com.moovit.payment.gateway.a$a */
    public static class C16329a implements PaymentGateway.C16321b<Void, Integer> {
        /* renamed from: O */
        public final Object mo48919O(ClearanceProviderGateway clearanceProviderGateway, Object obj) {
            Void voidR = (Void) obj;
            return Integer.valueOf(C25751f.payment_gateway_button);
        }

        /* renamed from: d1 */
        public final Object mo48920d1(GooglePayGateway googlePayGateway, Object obj) {
            Void voidR = (Void) obj;
            return Integer.valueOf(C25751f.payment_gateway_list_item);
        }

        /* renamed from: u1 */
        public final Object mo48921u1(CashGateway cashGateway, Object obj) {
            Void voidR = (Void) obj;
            return Integer.valueOf(C25751f.payment_gateway_list_item);
        }

        /* renamed from: w1 */
        public final Object mo48922w1(PaymentMethodGateway paymentMethodGateway, Object obj) {
            Void voidR = (Void) obj;
            return Integer.valueOf(C25751f.payment_gateway_list_item);
        }
    }

    /* renamed from: com.moovit.payment.gateway.a$b */
    public static class C16330b implements PaymentGateway.C16321b<C12797f, Void>, PaymentMethod.C25688a<ListItemView, Void> {

        /* renamed from: b */
        public final PaymentGateway f42682b;

        public C16330b(PaymentGateway paymentGateway) {
            this.f42682b = paymentGateway;
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
            Button button = (Button) ((C12797f) obj).itemView;
            C17885a.m44465u0(button, C17988b.m44611b(C25749d.ic_add_16, button.getContext()), 2);
            button.setText(C25754i.payment_one_off_add_cc);
            return null;
        }

        /* renamed from: d1 */
        public final Object mo48920d1(GooglePayGateway googlePayGateway, Object obj) {
            int i;
            ListItemView listItemView = (ListItemView) ((C12797f) obj).itemView;
            listItemView.setIcon(C25749d.wdg_google_pay_mark);
            listItemView.setTitle(C25754i.google_pay_label);
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBody);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
            listItemView.setSubtitle((CharSequence) null);
            View accessoryView = listItemView.getAccessoryView();
            if (googlePayGateway.equals(this.f42682b)) {
                i = 0;
            } else {
                i = 8;
            }
            accessoryView.setVisibility(i);
            return null;
        }

        /* renamed from: u */
        public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
            ListItemView listItemView = (ListItemView) obj;
            BalancePreview balancePreview = balancePaymentMethod.f63926e;
            listItemView.setIcon(balancePreview.f63928b);
            listItemView.setTitle((CharSequence) balancePreview.f63929c);
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBody);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
            listItemView.setSubtitle((CharSequence) balancePreview.f63930d.toString());
            listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurface);
            return null;
        }

        /* renamed from: u1 */
        public final Object mo48921u1(CashGateway cashGateway, Object obj) {
            int i;
            ListItemView listItemView = (ListItemView) ((C12797f) obj).itemView;
            listItemView.setIcon(cashGateway.f42687b);
            listItemView.setTitle((CharSequence) cashGateway.f42688c);
            listItemView.setSubtitle((CharSequence) cashGateway.f42689d);
            View accessoryView = listItemView.getAccessoryView();
            if (cashGateway.equals(this.f42682b)) {
                i = 0;
            } else {
                i = 8;
            }
            accessoryView.setVisibility(i);
            return null;
        }

        /* renamed from: w1 */
        public final Object mo48922w1(PaymentMethodGateway paymentMethodGateway, Object obj) {
            int i;
            ListItemView listItemView = (ListItemView) ((C12797f) obj).itemView;
            paymentMethodGateway.f42704b.mo83416b(this, listItemView);
            View accessoryView = listItemView.getAccessoryView();
            if (paymentMethodGateway.equals(this.f42682b)) {
                i = 0;
            } else {
                i = 8;
            }
            accessoryView.setVisibility(i);
            return null;
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
            return null;
        }
    }

    /* renamed from: com.moovit.payment.gateway.a$c */
    public class C16331c extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<PaymentGateway> f42683g;

        /* renamed from: h */
        public final C16329a f42684h = new C16329a();

        /* renamed from: i */
        public final C16330b f42685i;

        public C16331c(List<PaymentGateway> list, PaymentGateway paymentGateway) {
            C21100e.m49373x(list, "paymentGateways");
            this.f42683g = list;
            this.f42685i = new C16330b(paymentGateway);
        }

        public final int getItemCount() {
            return this.f42683g.size();
        }

        public final int getItemViewType(int i) {
            return ((Integer) this.f42683g.get(i).mo48904F1(this.f42684h, null)).intValue();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            PaymentGateway paymentGateway = this.f42683g.get(i);
            fVar.itemView.setOnClickListener(new C13535g(6, this, paymentGateway));
            paymentGateway.mo48904F1(this.f42685i, fVar);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
        }
    }

    public C16328a() {
        super(MoovitActivity.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_gateways_actions_dialog, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_methods_bottom_dialog_shown");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        Bundle K1 = mo46752K1();
        List parcelableArrayList = K1.getParcelableArrayList("paymentGateways");
        if (parcelableArrayList == null) {
            parcelableArrayList = Collections.emptyList();
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C25750e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.mo4593g(new C18665b(requireContext(), C25749d.divider_horizontal), -1);
        recyclerView.setAdapter(new C16331c(parcelableArrayList, (PaymentGateway) K1.getParcelable("selectedPaymentGateway")));
        Button button = (Button) view.findViewById(C25750e.change_button);
        boolean z = K1.getBoolean("isChangeSupported");
        button.setOnClickListener(new C18284b(this, 10));
        int i4 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        Button button2 = (Button) view.findViewById(C25750e.add_button);
        boolean z2 = K1.getBoolean("isAddSupported");
        button2.setOnClickListener(new C17102a(this, 20));
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        button2.setVisibility(i2);
        Button button3 = (Button) view.findViewById(C25750e.split_button);
        boolean z3 = K1.getBoolean("isSplitSupported");
        button3.setOnClickListener(new C4584b(this, 29));
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        button3.setVisibility(i3);
        ImageView imageView = (ImageView) view.findViewById(C25750e.action_divider);
        if (!z3 || (!z && !z2)) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
    }
}
