package p479ey;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.users.MVGetUserAccessTokenResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: ey.l */
public final class C16901l extends C13780t<C16900k, C16901l, MVGetUserAccessTokenResponse> {

    /* renamed from: m */
    public String f43916m;

    public C16901l() {
        super(MVGetUserAccessTokenResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16900k kVar = (C16900k) aVar;
        this.f43916m = ((MVGetUserAccessTokenResponse) tBase).accessToken;
    }
}
