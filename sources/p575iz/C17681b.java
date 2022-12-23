package p575iz;

import c70.C13746a;
import c70.C13780t;
import com.moovit.car.requests.CarDetails;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.cars.MVCarDetailsResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: iz.b */
public final class C17681b extends C13780t<C17680a, C17681b, MVCarDetailsResponse> {

    /* renamed from: m */
    public CarDetails f45433m;

    public C17681b() {
        super(MVCarDetailsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17680a aVar2 = (C17680a) aVar;
        MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) tBase;
        this.f45433m = new CarDetails(mVCarDetailsResponse.externalCarId, mVCarDetailsResponse.operator, mVCarDetailsResponse.fuelType, mVCarDetailsResponse.transmission, mVCarDetailsResponse.licencePlate, mVCarDetailsResponse.model, mVCarDetailsResponse.address, mVCarDetailsResponse.seatCount, mVCarDetailsResponse.pricingParking, mVCarDetailsResponse.pricingUse, mVCarDetailsResponse.fuelLevel, Byte.valueOf(mVCarDetailsResponse.interiorRating), mVCarDetailsResponse.pricingParkingRate, mVCarDetailsResponse.pricingUseRate);
    }
}
