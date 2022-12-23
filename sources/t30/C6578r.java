package t30;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.micromobility.ride.C4193a;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRealTimeInfoResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: t30.r */
public final class C6578r extends C13780t<C6577q, C6578r, MVMicroMobilityRealTimeInfoResponse> {

    /* renamed from: m */
    public C4193a f20394m;

    public C6578r() {
        super(MVMicroMobilityRealTimeInfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C6577q qVar = (C6577q) aVar;
        this.f20394m = C6569j.m15502c(((MVMicroMobilityRealTimeInfoResponse) tBase).rideStatusInfo);
    }
}
