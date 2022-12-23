package p736pu;

import c00.C13717b;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationPrice;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFareInfo;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegionPrice;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationRequestV2;
import p824tp.C19728f;

/* renamed from: pu.p */
public final class C19008p extends C13778r<C19008p, C19009q, MVPTBSetActivationRequestV2> {

    /* renamed from: w */
    public final C19728f f48362w;

    /* renamed from: x */
    public final String f48363x;

    public C19008p(C13752e eVar, C19728f fVar, String str, LatLonE6 latLonE6, MotQrCodeActivationFare motQrCodeActivationFare, int i, ServerId serverId, ServerId serverId2) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_set_activation_price, C19009q.class);
        this.f48362w = fVar;
        this.f48363x = C19008p.class.getName() + str + latLonE6 + motQrCodeActivationFare.f39055b.f39016b + motQrCodeActivationFare.f39056c.f39013b.f39009b + i;
        C21100e.m49373x(str, "activationContext");
        MVLatLon r = C13749c.m34332r(latLonE6);
        MotActivationRegionalFare motActivationRegionalFare = motQrCodeActivationFare.f39055b;
        int i2 = motActivationRegionalFare.f39016b.f15142b;
        int i3 = motActivationRegionalFare.f39017c;
        MVPTBFareInfo mVPTBFareInfo = new MVPTBFareInfo();
        mVPTBFareInfo.fareCode = i2;
        mVPTBFareInfo.mo30929h();
        mVPTBFareInfo.radius = i3;
        mVPTBFareInfo.mo30931i();
        MotActivationRegionFare motActivationRegionFare = motQrCodeActivationFare.f39056c;
        int i4 = motActivationRegionFare.f39013b.f39009b.f15142b;
        MotActivationPrice motActivationPrice = motActivationRegionFare.f39014c;
        MVCurrencyAmount p = C13749c.m34330p(motActivationPrice.f39005b);
        MVPTBActivationPrice mVPTBActivationPrice = new MVPTBActivationPrice();
        mVPTBActivationPrice.price = p;
        if (motActivationPrice.mo45549c()) {
            mVPTBActivationPrice.fullPrice = C13749c.m34330p(motActivationPrice.f39006c);
        }
        if (!C13717b.m34258e(motActivationPrice.f39007d)) {
            mVPTBActivationPrice.discountReasons = motActivationPrice.f39007d;
        }
        MVPTBRegionPrice mVPTBRegionPrice = new MVPTBRegionPrice();
        mVPTBRegionPrice.regionId = i4;
        mVPTBRegionPrice.mo31043h();
        mVPTBRegionPrice.activationPrice = mVPTBActivationPrice;
        RO mVPTBSetActivationRequestV2 = new MVPTBSetActivationRequestV2();
        mVPTBSetActivationRequestV2.context = str;
        mVPTBSetActivationRequestV2.scanLocation = r;
        mVPTBSetActivationRequestV2.fareInfo = mVPTBFareInfo;
        mVPTBSetActivationRequestV2.regionPrice = mVPTBRegionPrice;
        mVPTBSetActivationRequestV2.numberOfTickets = i;
        mVPTBSetActivationRequestV2.mo31077q();
        if (serverId != null) {
            mVPTBSetActivationRequestV2.lineId = serverId.f15142b;
            mVPTBSetActivationRequestV2.mo31076p();
        }
        if (serverId2 != null) {
            mVPTBSetActivationRequestV2.destinationStopId = serverId2.f15142b;
            mVPTBSetActivationRequestV2.mo31075o();
        }
        this.f33922v = mVPTBSetActivationRequestV2;
    }
}
