package p736pu;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceRequest;

/* renamed from: pu.j */
public final class C19002j extends C13778r<C19002j, C19003k, MVPTBGetActivationPriceRequest> {

    /* renamed from: w */
    public final String f48351w;

    /* renamed from: x */
    public final long f48352x;

    /* renamed from: y */
    public final LatLonE6 f48353y;

    public C19002j(C13752e eVar, String str, long j, LatLonE6 latLonE6) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_get_activation_price, C19003k.class);
        this.f48351w = str;
        this.f48352x = j;
        this.f48353y = latLonE6;
        MVLatLon r = C13749c.m34332r(latLonE6);
        RO mVPTBGetActivationPriceRequest = new MVPTBGetActivationPriceRequest();
        mVPTBGetActivationPriceRequest.qrCode = str;
        mVPTBGetActivationPriceRequest.location = r;
        this.f33922v = mVPTBGetActivationPriceRequest;
    }
}
