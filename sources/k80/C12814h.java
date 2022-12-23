package k80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetMetroNonGoodServiceAlertsCountResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: k80.h */
public final class C12814h extends C13780t<C12813g, C12814h, MVGetMetroNonGoodServiceAlertsCountResponse> {

    /* renamed from: m */
    public int f31678m = 0;

    public C12814h() {
        super(MVGetMetroNonGoodServiceAlertsCountResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C12813g gVar = (C12813g) aVar;
        this.f31678m = Math.max(0, ((MVGetMetroNonGoodServiceAlertsCountResponse) tBase).count);
    }
}
