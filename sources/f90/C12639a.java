package f90;

import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;

/* renamed from: f90.a */
public final class C12639a {

    /* renamed from: a */
    public final ServerId f31233a;

    /* renamed from: b */
    public final String f31234b;

    /* renamed from: c */
    public final CurrencyAmount f31235c;

    /* renamed from: d */
    public final boolean f31236d;

    public C12639a(ServerId serverId, String str, CurrencyAmount currencyAmount, boolean z) {
        this.f31233a = serverId;
        C21100e.m49373x(str, "agencyKey");
        this.f31234b = str;
        C21100e.m49373x(currencyAmount, "amount");
        this.f31235c = currencyAmount;
        this.f31236d = z;
    }
}
