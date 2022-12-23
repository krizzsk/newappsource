package p10;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: p10.b */
public final class C18867b extends C13780t<C18866a, C18867b, MVGetStopImageUploadUrlResponse> {

    /* renamed from: m */
    public String f48038m;

    public C18867b() {
        super(MVGetStopImageUploadUrlResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18866a aVar2 = (C18866a) aVar;
        this.f48038m = ((MVGetStopImageUploadUrlResponse) tBase).url;
    }
}
