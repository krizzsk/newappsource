package p831tw;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.taxi.MVTaxiEstimatedEtaRequest;

/* renamed from: tw.b */
public final class C19789b extends C13778r<C19789b, C19790c, MVTaxiEstimatedEtaRequest> {

    /* renamed from: w */
    public final ServerId f50309w;

    /* renamed from: x */
    public final LatLonE6 f50310x;

    public C19789b(LatLonE6 latLonE6, ServerId serverId, C13752e eVar) {
        super(eVar, R.string.api_path_taxi_estimate_eta, C19790c.class);
        C21100e.m49373x(serverId, "providerId");
        this.f50309w = serverId;
        C21100e.m49373x(latLonE6, "pickupLocation");
        this.f50310x = latLonE6;
        int i = latLonE6.f40980b;
        int i2 = latLonE6.f40981c;
        RO mVTaxiEstimatedEtaRequest = new MVTaxiEstimatedEtaRequest();
        mVTaxiEstimatedEtaRequest.latitude = i;
        mVTaxiEstimatedEtaRequest.mo32108i();
        mVTaxiEstimatedEtaRequest.longitude = i2;
        mVTaxiEstimatedEtaRequest.mo32109j();
        mVTaxiEstimatedEtaRequest.taxiId = serverId.f15142b;
        mVTaxiEstimatedEtaRequest.mo32110k();
        this.f33922v = mVTaxiEstimatedEtaRequest;
    }
}
