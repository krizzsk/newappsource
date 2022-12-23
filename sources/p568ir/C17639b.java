package p568ir;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVGetRideRequestPrices;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: ir.b */
public final class C17639b extends C13780t<C17638a, C17639b, MVGetRideRequestPrices> {

    /* renamed from: m */
    public CurrencyAmount f45353m;

    /* renamed from: n */
    public CurrencyAmount f45354n;

    /* renamed from: o */
    public CurrencyAmount f45355o;

    public C17639b() {
        super(MVGetRideRequestPrices.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17638a aVar2 = (C17638a) aVar;
        MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) tBase;
        this.f45353m = C13749c.m34317c(mVGetRideRequestPrices.recommended);
        this.f45354n = C13749c.m34317c(mVGetRideRequestPrices.max);
        this.f45355o = C13749c.m34317c(mVGetRideRequestPrices.nextRideCredit);
    }
}
