package y40;

import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.util.CurrencyAmount;
import p057d3.C4339c;
import p358af.C13437d;

/* renamed from: y40.d */
public final class C25775d extends C4339c {

    /* renamed from: b */
    public final String f64296b;

    /* renamed from: c */
    public final String f64297c;

    /* renamed from: d */
    public final String f64298d;

    /* renamed from: e */
    public final CurrencyAmount f64299e;

    /* renamed from: f */
    public final PaymentGatewayToken f64300f;

    /* renamed from: g */
    public final String f64301g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25775d(String str, String str2, String str3, CurrencyAmount currencyAmount, PaymentGatewayToken paymentGatewayToken, String str4) {
        super(str, str2);
        C13437d.m33711q(str, "contextId", str2, "analyticKey", str3, "identifier");
        this.f64296b = str;
        this.f64297c = str2;
        this.f64298d = str3;
        this.f64299e = currencyAmount;
        this.f64300f = paymentGatewayToken;
        this.f64301g = str4;
    }

    /* renamed from: s */
    public final String mo19843s() {
        return this.f64297c;
    }

    /* renamed from: t */
    public final String mo19844t() {
        return this.f64296b;
    }
}
