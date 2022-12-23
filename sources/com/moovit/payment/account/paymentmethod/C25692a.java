package com.moovit.payment.account.paymentmethod;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.CreditCardPreview;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00.C18665b;
import p453dw.C16740o;
import p543hq.C17474b;
import p977zz.C20964s0;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: com.moovit.payment.account.paymentmethod.a */
public class C25692a extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f64059i = 0;

    /* renamed from: h */
    public final C16740o f64060h = new C16740o(this, 14);

    /* renamed from: com.moovit.payment.account.paymentmethod.a$a */
    public interface C25693a {
        /* renamed from: s0 */
        void mo83441s0();

        /* renamed from: x0 */
        void mo83442x0(PaymentMethod paymentMethod);
    }

    /* renamed from: com.moovit.payment.account.paymentmethod.a$b */
    public static class C25694b {

        /* renamed from: a */
        public final String f64061a;

        /* renamed from: b */
        public final PaymentMethod f64062b;

        /* renamed from: c */
        public final boolean f64063c;

        public C25694b(String str, PaymentMethod paymentMethod, boolean z) {
            this.f64061a = str;
            this.f64062b = paymentMethod;
            this.f64063c = z;
        }
    }

    /* renamed from: com.moovit.payment.account.paymentmethod.a$c */
    public static class C25695c extends RecyclerView.Adapter<C12797f> implements PaymentMethod.C25688a<ListItemView, Void> {

        /* renamed from: g */
        public final List<C25694b> f64064g;

        /* renamed from: h */
        public final View.OnClickListener f64065h;

        public C25695c(C16740o oVar, ArrayList arrayList) {
            this.f64064g = arrayList;
            C21100e.m49373x(oVar, "clickListener");
            this.f64065h = oVar;
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
            Image image = externalPaymentMethodPreview.f64009b;
            String str = externalPaymentMethodPreview.f64010c;
            String str2 = externalPaymentMethodPreview.f64011d;
            listItemView.setIcon(image);
            listItemView.setTitle((CharSequence) str);
            if (str != null) {
                listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
                listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
            }
            listItemView.setSubtitle((CharSequence) str2);
            if (str2 == null) {
                return null;
            }
            listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
            return null;
        }

        public final int getItemCount() {
            return this.f64064g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            int i2;
            C25694b bVar = this.f64064g.get(i);
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setTag(bVar);
            listItemView.setOnClickListener(this.f64065h);
            String str = bVar.f64061a;
            str.getClass();
            if (str.equals("credit_card")) {
                bVar.f64062b.mo83416b(this, listItemView);
            } else if (str.equals(ProductAction.ACTION_ADD)) {
                listItemView.setIcon(C25749d.ic_add_24_on_surface_emphasis_medium);
                listItemView.setTitle(C25754i.add_payment_method_menu_item);
            }
            View accessoryView = listItemView.getAccessoryView();
            if (bVar.f64063c) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            accessoryView.setVisibility(i2);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_multi_payment_methods_action_list_item, viewGroup, false));
        }

        /* renamed from: u */
        public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
            ListItemView listItemView = (ListItemView) obj;
            BalancePreview balancePreview = balancePaymentMethod.f63926e;
            String str = balancePreview.f63929c;
            CurrencyAmount currencyAmount = balancePreview.f63930d;
            listItemView.setIcon(balancePreview.f63928b);
            listItemView.setTitle((CharSequence) str);
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceCaption);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
            listItemView.setSubtitle((CharSequence) currencyAmount.toString());
            listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurface);
            return null;
        }

        /* renamed from: z0 */
        public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
            ListItemView listItemView = (ListItemView) obj;
            BankPreview bankPreview = bankPaymentMethod.f63932e;
            String str = bankPreview.f63934b;
            Image image = bankPreview.f63935c;
            String str2 = bankPreview.f63936d;
            listItemView.setIcon(image);
            listItemView.setTitle((CharSequence) str);
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
            if (!C20964s0.m49090h(str2)) {
                listItemView.setSubtitle((CharSequence) str2);
                listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceCaption);
                listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisHigh);
            } else {
                listItemView.setSubtitle((CharSequence) null);
            }
            return null;
        }
    }

    public C25692a() {
        super(MoovitActivity.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_multi_payment_methods_actions_dialog, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_methods_bottom_dialog_shown");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle K1 = mo46752K1();
        List<PaymentMethod> parcelableArrayList = K1.getParcelableArrayList("paymentMethods");
        if (parcelableArrayList == null) {
            parcelableArrayList = Collections.emptyList();
        }
        PaymentMethod paymentMethod = (PaymentMethod) K1.getParcelable("selectedPaymentMethod");
        ArrayList arrayList = new ArrayList(parcelableArrayList.size() + 1);
        for (PaymentMethod paymentMethod2 : parcelableArrayList) {
            arrayList.add(new C25694b("credit_card", paymentMethod2, paymentMethod2.equals(paymentMethod)));
        }
        arrayList.add(new C25694b(ProductAction.ACTION_ADD, (PaymentMethod) null, false));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C25750e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.mo4593g(new C18665b(requireContext(), C25749d.divider_horizontal), -1);
        recyclerView.setAdapter(new C25695c(this.f64060h, arrayList));
    }
}
