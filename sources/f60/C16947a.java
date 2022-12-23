package f60;

import ce0.C21100e;
import com.moovit.payment.invoices.model.InvoicePeriod;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: f60.a */
public final class C16947a {

    /* renamed from: a */
    public final CurrencyAmount f43959a;

    /* renamed from: b */
    public final CurrencyAmount f43960b;

    /* renamed from: c */
    public final InvoicePeriod f43961c;

    /* renamed from: d */
    public final long f43962d;

    public C16947a(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, InvoicePeriod invoicePeriod, long j) {
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f43959a = currencyAmount;
        C21100e.m49373x(currencyAmount2, "fullPrice");
        this.f43960b = currencyAmount2;
        C21100e.m49373x(invoicePeriod, "period");
        this.f43961c = invoicePeriod;
        this.f43962d = j;
    }
}
