package d50;

import com.moovit.payment.account.model.PaymentAccountProductType;
import com.moovit.util.InfoBoxData;
import com.moovit.util.PriceInfo;
import mf0.C24362h;
import p810sz.C19577c;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: d50.a */
public final class C25717a {

    /* renamed from: g */
    public static final C25718a f64143g = new C25718a();

    /* renamed from: a */
    public final String f64144a;

    /* renamed from: b */
    public final PaymentAccountProductType f64145b;

    /* renamed from: c */
    public final String f64146c;

    /* renamed from: d */
    public final String f64147d;

    /* renamed from: e */
    public final PriceInfo f64148e;

    /* renamed from: f */
    public final InfoBoxData f64149f;

    /* renamed from: d50.a$a */
    public static final class C25718a extends C19619s<C25717a> {
        public C25718a() {
            super(0, C25717a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) {
            C24362h.m61211f(pVar, "source");
            String t = pVar.mo51948t();
            PaymentAccountProductType.Companion.getClass();
            C19577c access$getCoder$cp = PaymentAccountProductType.coder;
            access$getCoder$cp.getClass();
            PaymentAccountProductType paymentAccountProductType = (PaymentAccountProductType) access$getCoder$cp.mo51916a(pVar.mo51926r());
            C24362h.m61210e(t, "identifier");
            C24362h.m61210e(paymentAccountProductType, "type");
            return new C25717a(t, paymentAccountProductType, pVar.mo51948t(), pVar.mo51948t(), (PriceInfo) pVar.mo51962q(PriceInfo.f23864e), (InfoBoxData) pVar.mo51962q(InfoBoxData.f23849f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) {
            C25717a aVar = (C25717a) obj;
            C24362h.m61211f(aVar, "obj");
            C24362h.m61211f(qVar, "target");
            qVar.mo51954p(aVar.f64144a);
            PaymentAccountProductType paymentAccountProductType = aVar.f64145b;
            PaymentAccountProductType.Companion.getClass();
            PaymentAccountProductType.coder.write(paymentAccountProductType, qVar);
            qVar.mo51955t(aVar.f64146c);
            qVar.mo51955t(aVar.f64147d);
            qVar.mo51967q(aVar.f64148e, PriceInfo.f23864e);
            qVar.mo51967q(aVar.f64149f, InfoBoxData.f23849f);
        }
    }

    public C25717a(String str, PaymentAccountProductType paymentAccountProductType, String str2, String str3, PriceInfo priceInfo, InfoBoxData infoBoxData) {
        C24362h.m61211f(str, "identifier");
        C24362h.m61211f(paymentAccountProductType, "type");
        this.f64144a = str;
        this.f64145b = paymentAccountProductType;
        this.f64146c = str2;
        this.f64147d = str3;
        this.f64148e = priceInfo;
        this.f64149f = infoBoxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25717a)) {
            return false;
        }
        C25717a aVar = (C25717a) obj;
        return C24362h.m61206a(this.f64144a, aVar.f64144a) && this.f64145b == aVar.f64145b && C24362h.m61206a(this.f64146c, aVar.f64146c) && C24362h.m61206a(this.f64147d, aVar.f64147d) && C24362h.m61206a(this.f64148e, aVar.f64148e) && C24362h.m61206a(this.f64149f, aVar.f64149f);
    }

    public final int hashCode() {
        int hashCode = (this.f64145b.hashCode() + (this.f64144a.hashCode() * 31)) * 31;
        String str = this.f64146c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64147d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceInfo priceInfo = this.f64148e;
        int hashCode4 = (hashCode3 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        InfoBoxData infoBoxData = this.f64149f;
        if (infoBoxData != null) {
            i = infoBoxData.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PaymentAccountProduct(identifier=");
        k.append(this.f64144a);
        k.append(", type=");
        k.append(this.f64145b);
        k.append(", title=");
        k.append(this.f64146c);
        k.append(", subtitle=");
        k.append(this.f64147d);
        k.append(", priceInfo=");
        k.append(this.f64148e);
        k.append(", infoBoxData=");
        k.append(this.f64149f);
        k.append(')');
        return k.toString();
    }
}
