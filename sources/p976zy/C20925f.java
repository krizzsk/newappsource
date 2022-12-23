package p976zy;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.users.MVFirebaseCustomTokenResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: zy.f */
public final class C20925f extends C13780t<C20924e, C20925f, MVFirebaseCustomTokenResponse> {

    /* renamed from: m */
    public String f52675m = null;

    public C20925f() {
        super(MVFirebaseCustomTokenResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C20924e eVar = (C20924e) aVar;
        this.f52675m = ((MVFirebaseCustomTokenResponse) tBase).customToken;
    }
}
