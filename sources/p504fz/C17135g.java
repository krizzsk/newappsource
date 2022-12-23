package p504fz;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: fz.g */
public final class C17135g extends C13780t<C17134f, C17135g, MVRentalBikesRTResponse> {

    /* renamed from: m */
    public C17133e f44366m = null;

    public C17135g() {
        super(MVRentalBikesRTResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17134f fVar = (C17134f) aVar;
        MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) tBase;
        this.f44366m = new C17133e(new ServerId(mVRentalBikesRTResponse.rentalBikeStopId), mVRentalBikesRTResponse.availableBikes, mVRentalBikesRTResponse.freeDocks);
    }
}
