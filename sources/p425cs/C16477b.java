package p425cs;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorAddEntranceResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: cs.b */
public final class C16477b extends C13780t<C16476a, C16477b, MVMobileEditorAddEntranceResponse> {

    /* renamed from: m */
    public ServerId f43072m;

    public C16477b() {
        super(MVMobileEditorAddEntranceResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16476a aVar2 = (C16476a) aVar;
        this.f43072m = new ServerId(((MVMobileEditorAddEntranceResponse) tBase).pathwayId);
    }
}
