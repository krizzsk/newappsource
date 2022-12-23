package p896wp;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: wp.e */
public final class C20385e extends C13780t<C20384d, C20385e, MVSetAdvertisingInfoResponse> {

    /* renamed from: m */
    public boolean f51686m = false;

    public C20385e() {
        super(MVSetAdvertisingInfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        C20384d dVar = (C20384d) aVar;
        MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) tBase;
        if (!mVSetAdvertisingInfoResponse.mo35313f() || !mVSetAdvertisingInfoResponse.isReinstall) {
            z = false;
        } else {
            z = true;
        }
        this.f51686m = z;
    }
}
