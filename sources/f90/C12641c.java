package f90;

import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import p019b0.C1426c;

/* renamed from: f90.c */
public final class C12641c {

    /* renamed from: a */
    public final String f31241a;

    /* renamed from: b */
    public final ServerId f31242b;

    /* renamed from: c */
    public final String f31243c;

    /* renamed from: d */
    public final PurchaseStoredValueAmount f31244d;

    /* renamed from: e */
    public final C1426c f31245e;

    public C12641c(String str, ServerId serverId, String str2, PurchaseStoredValueAmount purchaseStoredValueAmount, C1426c cVar) {
        C21100e.m49373x(str, "contextId");
        this.f31241a = str;
        C21100e.m49373x(serverId, "providerId");
        this.f31242b = serverId;
        C21100e.m49373x(str2, "agencyKey");
        this.f31243c = str2;
        C21100e.m49373x(purchaseStoredValueAmount, "amount");
        this.f31244d = purchaseStoredValueAmount;
        this.f31245e = cVar == null ? new C1426c(8) : cVar;
    }
}
