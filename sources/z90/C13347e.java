package z90;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.taxi.MVVerificationResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: z90.e */
public final class C13347e extends C13780t<C13346d, C13347e, MVVerificationResponse> {

    /* renamed from: m */
    public boolean f33136m;

    public C13347e() {
        super(MVVerificationResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13346d dVar = (C13346d) aVar;
        this.f33136m = ((MVVerificationResponse) tBase).migratedUser;
    }
}
