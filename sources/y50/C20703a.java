package y50;

import ce0.C21100e;
import com.moovit.commons.utils.LinkedText;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummarySecondaryAction;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.util.CurrencyAmount;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: y50.a */
public final class C20703a {

    /* renamed from: a */
    public final PaymentOptions f52277a;

    /* renamed from: b */
    public final PaymentGatewayInstructions f52278b;

    /* renamed from: c */
    public final String f52279c;

    /* renamed from: d */
    public final List<C20704b> f52280d;

    /* renamed from: e */
    public final CurrencyAmount f52281e;

    /* renamed from: f */
    public final CurrencyAmount f52282f;

    /* renamed from: g */
    public final boolean f52283g;

    /* renamed from: h */
    public final List<PaymentSummarySecondaryAction> f52284h;

    /* renamed from: i */
    public final LinkedText f52285i;

    public C20703a(PaymentOptions paymentOptions, PaymentGatewayInstructions paymentGatewayInstructions, String str, ArrayList arrayList, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, boolean z, List list, LinkedText linkedText) {
        C21100e.m49373x(paymentOptions, "paymentOptions");
        this.f52277a = paymentOptions;
        C21100e.m49373x(paymentGatewayInstructions, "paymentGatewayInstructions");
        this.f52278b = paymentGatewayInstructions;
        this.f52279c = str;
        this.f52280d = arrayList;
        this.f52281e = currencyAmount;
        this.f52282f = currencyAmount2;
        this.f52283g = z;
        C21100e.m49373x(list, "secondaryActions");
        this.f52284h = list;
        this.f52285i = linkedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20703a)) {
            return false;
        }
        C20703a aVar = (C20703a) obj;
        if (!this.f52277a.equals(aVar.f52277a) || !this.f52278b.equals(aVar.f52278b) || !C20975x0.m49118e(this.f52279c, aVar.f52279c) || !C20975x0.m49118e(this.f52280d, aVar.f52280d) || !C20975x0.m49118e(this.f52281e, aVar.f52281e) || !C20975x0.m49118e(this.f52282f, aVar.f52282f) || this.f52283g != aVar.f52283g || !C20975x0.m49118e(this.f52284h, aVar.f52284h) || !C20975x0.m49118e(this.f52285i, aVar.f52285i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52277a), C17884p.m44335F(this.f52278b), C17884p.m44335F(this.f52279c), C17884p.m44335F(this.f52280d), C17884p.m44335F(this.f52281e), C17884p.m44335F(this.f52282f), this.f52283g, C17884p.m44335F(this.f52284h), C17884p.m44335F(this.f52285i));
    }
}
