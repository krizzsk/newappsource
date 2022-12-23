package com.moovit.payment.invoices;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import b00.C13556a;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.invoices.model.InvoicePeriod;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.moovit.web.WebViewActivity;
import f60.C16947a;
import h60.C17337n;
import h60.C17340o;
import p221q6.C6198o;
import p453dw.C16740o;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20927a0;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

public class PaymentAccountUpcomingPaymentActivity extends MoovitPaymentActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f42714p0 = 0;

    /* renamed from: U */
    public final C16349a f42715U = new C16349a();

    /* renamed from: X */
    public final C16350b f42716X = new C16350b();

    /* renamed from: Y */
    public final C16351c f42717Y = new C16351c();

    /* renamed from: Z */
    public C13556a f42718Z;

    /* renamed from: l0 */
    public TextView f42719l0;

    /* renamed from: m0 */
    public PriceView f42720m0;

    /* renamed from: n0 */
    public TextView f42721n0;

    /* renamed from: o0 */
    public TextView f42722o0;

    /* renamed from: com.moovit.payment.invoices.PaymentAccountUpcomingPaymentActivity$a */
    public class C16349a extends C20438i<C17337n, C17340o> {
        public C16349a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17337n nVar = (C17337n) cVar;
            PaymentAccountUpcomingPaymentActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            int i;
            int i2;
            C17337n nVar = (C17337n) cVar;
            PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity = PaymentAccountUpcomingPaymentActivity.this;
            C6198o oVar = ((C17340o) gVar).f44725m;
            int i3 = PaymentAccountUpcomingPaymentActivity.f42714p0;
            paymentAccountUpcomingPaymentActivity.getClass();
            C16947a aVar = (C16947a) oVar.f19597c;
            if (aVar.f43961c.equals(InvoicePeriod.DAY)) {
                i = C25754i.payment_mot_my_bills_estimate_daily;
            } else {
                i = C25754i.payment_mot_my_bills_estimate;
            }
            int i4 = 0;
            paymentAccountUpcomingPaymentActivity.f42719l0.setText(paymentAccountUpcomingPaymentActivity.getString(i, new Object[]{C7925b.m18022j(paymentAccountUpcomingPaymentActivity, aVar.f43962d)}));
            paymentAccountUpcomingPaymentActivity.f42720m0.mo24682a(aVar.f43959a, aVar.f43960b, (String) null);
            TextView textView = paymentAccountUpcomingPaymentActivity.f42721n0;
            if (oVar.f19596b) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            TextView textView2 = paymentAccountUpcomingPaymentActivity.f42722o0;
            if (!oVar.f19596b) {
                i4 = 4;
            }
            textView2.setVisibility(i4);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17337n nVar = (C17337n) cVar;
            if (exc instanceof UserRequestError) {
                PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity = PaymentAccountUpcomingPaymentActivity.this;
                paymentAccountUpcomingPaymentActivity.mo44530n2(C13751d.m34341b(paymentAccountUpcomingPaymentActivity, "ERROR_ALERT_DIALOG_FRAGMENT_TAG", exc));
                return true;
            }
            PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity2 = PaymentAccountUpcomingPaymentActivity.this;
            paymentAccountUpcomingPaymentActivity2.mo44530n2(C13751d.m34342c(paymentAccountUpcomingPaymentActivity2, "ERROR_ALERT_DIALOG_FRAGMENT_TAG", (Exception) null).mo47684m((CharSequence) null).mo47678g(C25754i.general_error_title).mo47673b());
            return true;
        }
    }

    /* renamed from: com.moovit.payment.invoices.PaymentAccountUpcomingPaymentActivity$b */
    public class C16350b extends ClickableSpan {
        public C16350b() {
        }

        public final void onClick(View view) {
            PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity = PaymentAccountUpcomingPaymentActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_upcoming_bills_pricing_method_clicked");
            paymentAccountUpcomingPaymentActivity.mo44545v2(aVar.mo49933a());
            PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity2 = PaymentAccountUpcomingPaymentActivity.this;
            paymentAccountUpcomingPaymentActivity2.startActivity(WebViewActivity.m18168y2(paymentAccountUpcomingPaymentActivity2, paymentAccountUpcomingPaymentActivity2.getString(C25754i.payment_mot_passenger_fare_link), PaymentAccountUpcomingPaymentActivity.this.getString(C25754i.payment_mot_passenger_fare_link_name)));
        }
    }

    /* renamed from: com.moovit.payment.invoices.PaymentAccountUpcomingPaymentActivity$c */
    public class C16351c extends ClickableSpan {
        public C16351c() {
        }

        public final void onClick(View view) {
            PaymentAccountUpcomingPaymentActivity paymentAccountUpcomingPaymentActivity = PaymentAccountUpcomingPaymentActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_upcoming_bills_support_clicked");
            paymentAccountUpcomingPaymentActivity.mo44545v2(aVar.mo49933a());
            C20927a0.m49017l(PaymentAccountUpcomingPaymentActivity.this, C20927a0.m49011f(PaymentAccountUpcomingPaymentActivity.this.getString(C25754i.payment_mot_pango_number)));
        }
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if ("ERROR_ALERT_DIALOG_FRAGMENT_TAG".equals(str)) {
            finish();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.account_upcoming_payment_activity);
        this.f42719l0 = (TextView) findViewById(C25750e.date_view);
        this.f42720m0 = (PriceView) findViewById(C25750e.price_view);
        String string = getString(C25754i.payment_mot_passenger_fare_link_name);
        TextView textView = (TextView) findViewById(C25750e.price_explanation);
        this.f42721n0 = textView;
        textView.setText(getString(C25754i.payment_mot_passenger_fare_info, new Object[]{string}));
        C20964s0.m49104v(this.f42721n0, string, this.f42716X, new Object[0]);
        String string2 = getString(C25754i.payment_my_bills_pay_error_support);
        TextView textView2 = (TextView) findViewById(C25750e.billing_error_view);
        this.f42722o0 = textView2;
        textView2.setText(getString(C25754i.payment_my_bills_pay_error, new Object[]{string2}));
        C20964s0.m49104v(this.f42722o0, string2, this.f42717Y, new Object[0]);
        findViewById(C25750e.secondary_button).setOnClickListener(new C16740o(this, 16));
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        C13556a aVar = this.f42718Z;
        if (aVar != null) {
            aVar.cancel(true);
            this.f42718Z = null;
        }
        mo44543u2((CharSequence) null);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f42718Z = mo44527k2(C17337n.class.getName(), new C17337n(mo44548x1()), requestOptions, this.f42715U);
    }
}
