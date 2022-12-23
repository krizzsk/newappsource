package p638lr;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.carpool.C15725a;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetour;
import com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.thrift.TException;
import vi0.C25111a;
import xi0.C25276a;

/* renamed from: lr.q */
public final class C18270q extends C13778r<C18270q, C18271r, MVPassengerUpdateInterestRequest> {
    public C18270q(C13752e eVar, FutureCarpoolRide futureCarpoolRide, PassengerRideStops passengerRideStops, boolean z, CurrencyAmount currencyAmount, CarpoolRideDetour carpoolRideDetour) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_update_passenger_interest, C18271r.class);
        RO mVPassengerUpdateInterestRequest = new MVPassengerUpdateInterestRequest();
        mVPassengerUpdateInterestRequest.futureRideId = futureCarpoolRide.f40937b.f40910b.f15142b;
        mVPassengerUpdateInterestRequest.mo25819k();
        mVPassengerUpdateInterestRequest.isInterested = z;
        mVPassengerUpdateInterestRequest.mo25820l();
        mVPassengerUpdateInterestRequest.stops = C15725a.m40160g(passengerRideStops);
        if (currencyAmount != null) {
            mVPassengerUpdateInterestRequest.priceValidation = C13749c.m34329o(currencyAmount.f23845c);
            mVPassengerUpdateInterestRequest.mo25821m();
        }
        if (carpoolRideDetour != null) {
            try {
                MVCarPoolRideDetour mVCarPoolRideDetour = new MVCarPoolRideDetour();
                mVCarPoolRideDetour.mo25201C1(new C25111a(new C25276a((InputStream) new ByteArrayInputStream(carpoolRideDetour.f40925g))));
                mVPassengerUpdateInterestRequest.detourDetails = mVCarPoolRideDetour;
            } catch (TException e) {
                throw new ApplicationBugException((Exception) e);
            }
        }
        this.f33922v = mVPassengerUpdateInterestRequest;
    }
}
