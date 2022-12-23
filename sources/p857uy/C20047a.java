package p857uy;

import c00.C13722f;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.micromobility.purchase.error.MicroMobilityError;

/* renamed from: uy.a */
public final /* synthetic */ class C20047a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f50878b;

    /* renamed from: c */
    public final /* synthetic */ String f50879c;

    public /* synthetic */ C20047a(String str, int i) {
        this.f50878b = i;
        this.f50879c = str;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f50878b) {
            case 0:
                String str = this.f50879c;
                int i = WondoOffersActivity.f40757Z;
                return str.equals(((WondoOffer) obj).f40720g.f40997b);
            default:
                return ((MicroMobilityError) obj).name().equals(this.f50879c);
        }
    }
}
