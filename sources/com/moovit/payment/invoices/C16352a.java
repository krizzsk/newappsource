package com.moovit.payment.invoices;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.format.DateUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.invoices.model.Invoice;
import com.moovit.payment.invoices.model.InvoicePeriod;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.moovit.web.WebViewActivity;
import ja0.C12797f;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import p543hq.C17474b;
import p977zz.C20927a0;
import p977zz.C20941h;
import p977zz.C20964s0;
import v40.C25748c;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: com.moovit.payment.invoices.a */
public final class C16352a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C16353a f42726g = new C16353a();

    /* renamed from: h */
    public final C16354b f42727h = new C16354b();

    /* renamed from: i */
    public final AccountInvoicesActivity f42728i;

    /* renamed from: j */
    public final List<C16355c> f42729j;

    /* renamed from: com.moovit.payment.invoices.a$a */
    public class C16353a extends ClickableSpan {
        public C16353a() {
        }

        public final void onClick(View view) {
            AccountInvoicesActivity accountInvoicesActivity = C16352a.this.f42728i;
            accountInvoicesActivity.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_finalized_bills_support_clicked");
            accountInvoicesActivity.mo44545v2(aVar.mo49933a());
            C20927a0.m49017l(accountInvoicesActivity, C20927a0.m49011f(accountInvoicesActivity.getString(C25754i.payment_mot_pango_number)));
        }
    }

    /* renamed from: com.moovit.payment.invoices.a$b */
    public class C16354b implements View.OnClickListener {
        public C16354b() {
        }

        public final void onClick(View view) {
            C12797f fVar = (C12797f) view.getTag();
            if (fVar != null && fVar.getAdapterPosition() != -1) {
                AccountInvoicesActivity accountInvoicesActivity = C16352a.this.f42728i;
                Invoice invoice = C16352a.this.f42729j.get(fVar.getAdapterPosition()).f42733b;
                accountInvoicesActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_finalized_bill_clicked");
                aVar.mo49939g(AnalyticsAttributeKey.STATUS, invoice.f42737d.name());
                aVar.mo49939g(AnalyticsAttributeKey.URI, invoice.f42735b);
                accountInvoicesActivity.mo44545v2(aVar.mo49933a());
                accountInvoicesActivity.startActivity(WebViewActivity.m18168y2(accountInvoicesActivity, invoice.f42735b, (CharSequence) null));
            }
        }
    }

    /* renamed from: com.moovit.payment.invoices.a$c */
    public static class C16355c {

        /* renamed from: a */
        public final int f42732a;

        /* renamed from: b */
        public final Invoice f42733b;

        public C16355c(int i, Invoice invoice) {
            this.f42732a = i;
            this.f42733b = invoice;
        }
    }

    public C16352a(AccountInvoicesActivity accountInvoicesActivity, ArrayList arrayList) {
        this.f42728i = accountInvoicesActivity;
        this.f42729j = arrayList;
    }

    public final int getItemCount() {
        return this.f42729j.size();
    }

    public final int getItemViewType(int i) {
        return this.f42729j.get(i).f42732a;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        String str;
        boolean z;
        ColorStateList colorStateList;
        C12797f fVar = (C12797f) a0Var;
        C16355c cVar = this.f42729j.get(i);
        int itemViewType = fVar.getItemViewType();
        boolean z2 = true;
        if (itemViewType == 1) {
            Context e = fVar.mo39638e();
            String string = e.getString(C25754i.payment_my_bills_pay_error_support);
            TextView textView = (TextView) fVar.itemView;
            textView.setText(e.getString(C25754i.payment_my_bills_pay_error, new Object[]{string}));
            C20964s0.m49104v(textView, string, this.f42726g, new Object[0]);
        } else if (itemViewType == 2) {
            Invoice invoice = cVar.f42733b;
            fVar.itemView.setOnClickListener(this.f42727h);
            TextView textView2 = (TextView) fVar.mo39639f(C25750e.title);
            if (invoice.f42736c == InvoicePeriod.DAY) {
                str = C7925b.m18022j(fVar.mo39638e(), invoice.f42738e);
            } else {
                Context e2 = fVar.mo39638e();
                long j = invoice.f42738e;
                SimpleDateFormat simpleDateFormat = C7925b.f23934a;
                str = DateUtils.formatDateTime(e2, j, 36);
            }
            textView2.setText(str);
            PriceView priceView = (PriceView) fVar.mo39639f(C25750e.price_view);
            priceView.setPrice(invoice.f42734a);
            Invoice.Status status = invoice.f42737d;
            if (status == Invoice.Status.APPROVED || status == Invoice.Status.PENDING_APPROVAL) {
                z = false;
            } else {
                z = true;
            }
            if (BigDecimal.ZERO.compareTo(invoice.f42734a.f23845c) < 0) {
                z2 = false;
            }
            if (z) {
                fVar.mo39639f(C25750e.error_icon).setVisibility(0);
                colorStateList = C20941h.m49044g(C25748c.colorCritical, priceView.getContext());
            } else if (z2) {
                fVar.mo39639f(C25750e.error_icon).setVisibility(8);
                colorStateList = C20941h.m49044g(C25748c.colorGood, priceView.getContext());
            } else if (invoice.f42737d == Invoice.Status.PENDING_APPROVAL) {
                fVar.mo39639f(C25750e.error_icon).setVisibility(8);
                fVar.itemView.setEnabled(false);
                colorStateList = C20941h.m49044g(C25748c.colorOnSurfaceEmphasisLow, priceView.getContext());
            } else {
                fVar.mo39639f(C25750e.error_icon).setVisibility(8);
                colorStateList = C20941h.m49044g(C25748c.colorInfo, priceView.getContext());
            }
            if (colorStateList != null) {
                priceView.setPriceTextColor(colorStateList);
            }
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", itemViewType));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == 1) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.account_payment_error_list_item, viewGroup, false);
        } else if (i == 2) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.account_invoice_list_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown section view type: ", i));
        }
        C12797f fVar = new C12797f(view);
        view.setTag(fVar);
        return fVar;
    }
}
