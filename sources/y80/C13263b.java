package y80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.purchase.cart.CartInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import q80.C13036y;

/* renamed from: y80.b */
public final class C13263b extends C13780t<C13262a, C13263b, MVCartUpdateQuantityResponse> {

    /* renamed from: m */
    public CartInfo f32913m;

    /* renamed from: n */
    public String f32914n;

    public C13263b() {
        super(MVCartUpdateQuantityResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        String str;
        C13262a aVar2 = (C13262a) aVar;
        MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) tBase;
        this.f32913m = C13036y.m32951c(mVCartUpdateQuantityResponse.cartInfo);
        if (mVCartUpdateQuantityResponse.mo32362g()) {
            str = mVCartUpdateQuantityResponse.discountContextId;
        } else {
            str = null;
        }
        this.f32914n = str;
    }
}
