package g30;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.sync.MVMetroRevisionResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: g30.p */
public final class C4788p extends C13780t<C4787o, C4788p, MVMetroRevisionResponse> {

    /* renamed from: m */
    public long f16167m;

    public C4788p() {
        super(MVMetroRevisionResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C4787o oVar = (C4787o) aVar;
        this.f16167m = ((MVMetroRevisionResponse) tBase).revisionNumber;
    }
}
