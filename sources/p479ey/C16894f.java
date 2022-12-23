package p479ey;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.users.MVCreateUserAccessTokenResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: ey.f */
public final class C16894f extends C13780t<C16893e, C16894f, MVCreateUserAccessTokenResponse> {

    /* renamed from: m */
    public String f43914m;

    public C16894f() {
        super(MVCreateUserAccessTokenResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16893e eVar = (C16893e) aVar;
        this.f43914m = ((MVCreateUserAccessTokenResponse) tBase).accessToken;
    }
}
