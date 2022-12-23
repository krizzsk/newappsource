package t30;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.AppDeepLink;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResultDeepLink;
import java.io.IOException;
import java.net.HttpURLConnection;
import m30.C5680c;
import org.apache.thrift.TBase;

/* renamed from: t30.b */
public final class C6560b extends C13780t<C6559a, C6560b, MVMicroMobilityActionResponse> {

    /* renamed from: m */
    public C5680c f20374m;

    /* renamed from: n */
    public String f20375n;

    public C6560b() {
        super(MVMicroMobilityActionResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C5680c cVar;
        boolean z;
        C6559a aVar2 = (C6559a) aVar;
        MVMicroMobilityActionResponse mVMicroMobilityActionResponse = (MVMicroMobilityActionResponse) tBase;
        if (mVMicroMobilityActionResponse.mo28637f()) {
            MVMicroMobilityActionResult mVMicroMobilityActionResult = mVMicroMobilityActionResponse.result;
            F f = mVMicroMobilityActionResult.setField_;
            F f2 = MVMicroMobilityActionResult._Fields.DEEP_LINK;
            if (f == f2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new BadResponseException("No unlock action exist");
            } else if (f == f2) {
                AppDeepLink a = C13749c.m34315a(((MVMicroMobilityActionResultDeepLink) mVMicroMobilityActionResult.value_).link);
                if (a != null) {
                    cVar = new C5680c(a);
                    this.f20374m = cVar;
                    this.f20375n = mVMicroMobilityActionResponse.toast;
                }
            } else {
                MVMicroMobilityActionResult.m22638k((MVMicroMobilityActionResult._Fields) mVMicroMobilityActionResult.setField_);
                throw new RuntimeException("Cannot get field 'deepLink' because union is currently set to deepLink");
            }
        }
        cVar = null;
        this.f20374m = cVar;
        this.f20375n = mVMicroMobilityActionResponse.toast;
    }
}
