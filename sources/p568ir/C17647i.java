package p568ir;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice;
import com.tranzmate.moovit.protocol.carpool.MVRideRequestMetaData;
import com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus;
import com.tranzmate.moovit.protocol.carpool.MVSetRideRequest;

/* renamed from: ir.i */
public final class C17647i extends C13778r<C17647i, C17648j, MVSetRideRequest> {
    public C17647i(C13752e eVar, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, long j, long j2, int i, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_set_ride_request, C17648j.class);
        RO mVSetRideRequest = new MVSetRideRequest();
        MVRideRequestMetaData mVRideRequestMetaData = new MVRideRequestMetaData();
        mVRideRequestMetaData.pickUpLocation = C13749c.m34335u(locationDescriptor);
        mVRideRequestMetaData.dropOffLocation = C13749c.m34335u(locationDescriptor2);
        mVRideRequestMetaData.pickUpFromTime = j;
        mVRideRequestMetaData.mo25910q();
        mVRideRequestMetaData.pickUpUntilTime = j2;
        mVRideRequestMetaData.mo25911r();
        mVRideRequestMetaData.totalAllowedWalkingTimeMinutes = i;
        mVRideRequestMetaData.mo25912s();
        MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
        mVCarPoolPrice.price = C13749c.m34329o(currencyAmount.f23845c);
        mVCarPoolPrice.mo25466h();
        mVCarPoolPrice.currencyCode = currencyAmount.f23844b;
        mVRideRequestMetaData.maxPriceAllowed = mVCarPoolPrice;
        mVRideRequestMetaData.status = MVRideRequestStatus.WAITING;
        mVSetRideRequest.data = mVRideRequestMetaData;
        MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
        mVCarPoolPrice2.price = C13749c.m34329o(currencyAmount2.f23845c);
        mVCarPoolPrice2.mo25466h();
        mVCarPoolPrice2.currencyCode = currencyAmount2.f23844b;
        mVSetRideRequest.validateNextRideCredit = mVCarPoolPrice2;
        this.f33922v = mVSetRideRequest;
    }
}
