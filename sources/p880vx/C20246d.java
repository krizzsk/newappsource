package p880vx;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.users.MVCreateUser;
import com.tranzmate.moovit.protocol.users.MVCreateUserResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import y90.C13272f;

/* renamed from: vx.d */
public final class C20246d extends C13780t<C20245c, C20246d, MVCreateUserResponse> {

    /* renamed from: m */
    public C13272f f51352m = null;

    public C20246d() {
        super(MVCreateUserResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        C20245c cVar = (C20245c) aVar;
        MVCreateUserResponse mVCreateUserResponse = (MVCreateUserResponse) tBase;
        F f = mVCreateUserResponse.setField_;
        F f2 = MVCreateUserResponse._Fields.USER;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (f == f2) {
            MVCreateUser mVCreateUser = (MVCreateUser) mVCreateUserResponse.value_;
            String str = mVCreateUser.userKey;
            int i = mVCreateUser.percentage;
            ServerId serverId = new ServerId(mVCreateUser.currentMetroAreaId);
            this.f51352m = new C13272f(str, i, serverId, "5.108.1.564", serverId);
            return;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'user' because union is currently set to ");
        k.append(MVCreateUserResponse.m31134k((MVCreateUserResponse._Fields) mVCreateUserResponse.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
