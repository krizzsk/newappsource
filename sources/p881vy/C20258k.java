package p881vy;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.wondo.MVNewWondoUserResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: vy.k */
public final class C20258k extends C13780t<C20257j, C20258k, MVNewWondoUserResponse> {

    /* renamed from: m */
    public WondoFullScreenDisplayInfo f51365m = null;

    public C20258k() {
        super(MVNewWondoUserResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo;
        C20257j jVar = (C20257j) aVar;
        MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) tBase;
        if (mVNewWondoUserResponse.mo35597f()) {
            wondoFullScreenDisplayInfo = C20255i.m47823b(mVNewWondoUserResponse.confirmation);
        } else {
            wondoFullScreenDisplayInfo = null;
        }
        this.f51365m = wondoFullScreenDisplayInfo;
    }
}
