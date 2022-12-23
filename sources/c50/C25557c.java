package c50;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payments.MVExternalWebAccountResponse;
import java.io.IOException;
import java.util.Map;
import org.apache.thrift.TBase;
import p551hy.C17517b;

/* renamed from: c50.c */
public final class C25557c extends C13780t<C25556b, C25557c, MVExternalWebAccountResponse> {

    /* renamed from: m */
    public C17517b f63817m;

    public C25557c() {
        super(MVExternalWebAccountResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C25556b bVar = (C25556b) aVar;
        MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) tBase;
        this.f63817m = new C17517b(mVExternalWebAccountResponse.accountUrl, (Map) mVExternalWebAccountResponse.additionalHeaders);
    }
}
