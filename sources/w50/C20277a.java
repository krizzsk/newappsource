package w50;

import ce0.C21100e;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.util.CurrencyAmount;
import java.util.Map;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: w50.a */
public final class C20277a {

    /* renamed from: a */
    public final String f51412a;

    /* renamed from: b */
    public final CurrencyAmount f51413b;

    /* renamed from: c */
    public final String f51414c;

    /* renamed from: d */
    public final PaymentOptions f51415d;

    /* renamed from: e */
    public final Map<String, String> f51416e;

    public C20277a(String str, CurrencyAmount currencyAmount, String str2, PaymentOptions paymentOptions, Map<String, String> map) {
        C21100e.m49373x(str, "paymentContext");
        this.f51412a = str;
        this.f51413b = currencyAmount;
        this.f51414c = str2;
        this.f51415d = paymentOptions;
        this.f51416e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20277a)) {
            return false;
        }
        C20277a aVar = (C20277a) obj;
        if (!this.f51412a.equals(aVar.f51412a) || !C20975x0.m49118e(this.f51413b, aVar.f51413b) || !C20975x0.m49118e(this.f51414c, aVar.f51414c) || !C20975x0.m49118e(this.f51415d, aVar.f51415d) || !C20975x0.m49118e(this.f51416e, aVar.f51416e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f51412a), C17884p.m44335F(this.f51413b), C17884p.m44335F(this.f51414c), C17884p.m44335F(this.f51415d), C17884p.m44335F(this.f51416e));
    }
}
